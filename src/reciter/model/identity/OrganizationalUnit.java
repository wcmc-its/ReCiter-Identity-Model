package reciter.model.identity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;

@DynamoDBDocument
public class OrganizationalUnit {
	
	private String organizationalUnitLabel;
	@DynamoDBTyped(DynamoDBAttributeType.S)
	private OrganizationalUnitType organizationalUnitType;
	private String startDate;
	private String endDate;
	
	public OrganizationalUnit() {
		
	}
	
	public OrganizationalUnit(String organizationalUnitLabel, OrganizationalUnitType organizationalUnitType) {
		this.organizationalUnitLabel = organizationalUnitLabel;
		this.organizationalUnitType = organizationalUnitType;
	}
	
	public String getOrganizationalUnitLabel() {
		return organizationalUnitLabel;
	}
	public void setOrganizationalUnitLabel(String organizationalUnitLabel) {
		this.organizationalUnitLabel = organizationalUnitLabel;
	}
	public OrganizationalUnitType getOrganizationalUnitType() {
		return organizationalUnitType;
	}
	public void setOrganizationalUnitType(OrganizationalUnitType organizationalUnitType) {
		this.organizationalUnitType = organizationalUnitType;
	}
	/**
     * @return String return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return String return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
	
	public enum OrganizationalUnitType {
		DEPARTMENT,
		DIVISION,
		PROGRAM,
		CENTER
	}
}
