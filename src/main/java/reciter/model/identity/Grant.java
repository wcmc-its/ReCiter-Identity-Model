package reciter.model.identity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Builder;
import lombok.Data;

@DynamoDBDocument
@Builder
@Data
public class Grant {
	private String grantId;
	private String sponsorAwardId;
	private String department;
	private String organization;
}
