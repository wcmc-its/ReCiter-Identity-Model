package reciter.model.identity;

import reciter.model.identity.OrganizationalUnit.OrganizationalUnitType;
import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

public class OrganizationalUnitTypeConverter implements AttributeConverter<OrganizationalUnit.OrganizationalUnitType> {

	@Override
	public AttributeValue transformFrom(OrganizationalUnit.OrganizationalUnitType input) {
		return AttributeValue.builder().s(input.name()).build();
	}

	@Override
	public OrganizationalUnit.OrganizationalUnitType transformTo(AttributeValue input) {
		return OrganizationalUnit.OrganizationalUnitType.valueOf(input.s());
	}

	@Override
	public EnhancedType<OrganizationalUnitType> type() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttributeValueType attributeValueType() {
		// TODO Auto-generated method stub
		return null;
	}

}
