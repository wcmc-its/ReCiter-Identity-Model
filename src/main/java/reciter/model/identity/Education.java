package reciter.model.identity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import lombok.Builder;
import lombok.Data;

@DynamoDBDocument
@Builder
@Data
public class Education {
	private int bachelorYear;
	private int doctoralYear;
}
