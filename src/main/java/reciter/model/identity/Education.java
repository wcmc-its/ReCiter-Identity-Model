package reciter.model.identity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Education {
	private int bachelorYear;
	private int doctoralYear;
	
	public Education() {}

	public int getBachelorYear() {
		return bachelorYear;
	}

	public void setBachelorYear(int bachelorYear) {
		this.bachelorYear = bachelorYear;
	}

	public int getDoctoralYear() {
		return doctoralYear;
	}

	public void setDoctoralYear(int doctoralYear) {
		this.doctoralYear = doctoralYear;
	}
	
}
