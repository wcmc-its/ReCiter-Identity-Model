package reciter.model.identity;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbConvertedBy;

/**
 * Represents an organizational unit such as a department, division, center, or program
 * to which a person may be affiliated in an academic or institutional context.
 * @author ved4006
 */

@DynamoDbBean
public class OrganizationalUnit {
	
	/**
     * The label or name of the organizational unit (e.g., "Department of Biology").
     */
	private String organizationalUnitLabel;
	
	 /**
     * The type of the organizational unit (e.g., DEPARTMENT, DIVISION).
     */
	private OrganizationalUnitType organizationalUnitType;
	
	/**
     * The start date.
     */
	private String startDate;
	/**
     * The end date.
     */
	private String endDate;
	
	/**
     * Default constructor for OrganizationalUnit.
     */
	public OrganizationalUnit() {
		
	}
	
	/**
     * Constructs an organizational unit with a label and type.
     *
     * @param organizationalUnitLabel the name or label of the unit
     * @param organizationalUnitType  the type of the unit
     */
	public OrganizationalUnit(String organizationalUnitLabel, OrganizationalUnitType organizationalUnitType) {
		this.organizationalUnitLabel = organizationalUnitLabel;
		this.organizationalUnitType = organizationalUnitType;
	}
	
	/**
	 * Creates an organizational unit.
	 *
	 * @param organizationalUnitLabel the organizational unit label
	 * @param organizationalUnitType the organizational unit type
	 * @param startDate the start date associated with the organizational unit
	 * @param endDate the end date associated with the organizational unit
	 */
	public OrganizationalUnit(String organizationalUnitLabel,OrganizationalUnitType organizationalUnitType, String startDate, String endDate) { 
		this.organizationalUnitLabel = organizationalUnitLabel;
		this.organizationalUnitType = organizationalUnitType; 
		this.startDate = startDate;
		this.endDate = endDate; 
	}
	
	 /**
     * Returns the label of the organizational unit.
     *
     * @return the organizational unit label
     */
	public String getOrganizationalUnitLabel() {
		return organizationalUnitLabel;
	}
	
	 /**
     * Sets the label of the organizational unit.
     *
     * @param organizationalUnitLabel the name of the unit to set
     */
	public void setOrganizationalUnitLabel(String organizationalUnitLabel) {
		this.organizationalUnitLabel = organizationalUnitLabel;
	}
	
	/**
     * Returns the type of the organizational unit.
     *
     * @return the {@link OrganizationalUnitType}
     */
	@DynamoDbConvertedBy(OrganizationalUnitTypeConverter.class)
	public OrganizationalUnitType getOrganizationalUnitType() {
		return organizationalUnitType;
	}
	
	/**
     * Sets the type of the organizational unit.
     *
     * @param organizationalUnitType the type to set
     */
	public void setOrganizationalUnitType(OrganizationalUnitType organizationalUnitType) {
		this.organizationalUnitType = organizationalUnitType;
	}
	
	/**
     * Returns the start date .
     *
     * @return the start date 
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the start date.
     *
     * @param startDate the date string to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Returns the end date .
     *
     * @return the end date string
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the end date.
     *
     * @param endDate the date string to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
	
    /**
     * Enum representing valid types of organizational units.
     */
	public enum OrganizationalUnitType {
		 /**
         * A department within the organization (e.g., Department of Chemistry).
         */
		DEPARTMENT,
		/**
         * A division within the organization (e.g., Division of Public Health).
         */
		DIVISION,
		 /**
         * A program such as a research or academic program.
         */
		PROGRAM,
		 /**
         * A research.
         */
		CENTER
	}
	
	@Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((organizationalUnitLabel == null) ? 0 : organizationalUnitLabel.hashCode());
      return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
          return true;
        if (obj == null)
          return false;
        if (getClass() != obj.getClass())
          return false;
		  OrganizationalUnit other = (OrganizationalUnit) obj;
        if (organizationalUnitLabel == null) {
          if (other.organizationalUnitLabel != null)
            return false;
        } else if (!organizationalUnitLabel.equals(other.organizationalUnitLabel))
          return false;
        return true;
      }		
}
