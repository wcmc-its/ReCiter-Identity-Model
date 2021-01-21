package reciter.model.identity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverter;

import reciter.model.identity.KnownRelationship.RelationshipType;

public class RelationshipTypeEnumMarshaller<T> implements DynamoDBTypeConverter<String, RelationshipType> {

	@Override
	public String convert(RelationshipType object) {
		return object.toString();
	}

	@Override
	public RelationshipType unconvert(String object) {
		return KnownRelationship.getEnum(object);
	}
	
}
