/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *******************************************************************************/
package reciter.model.identity;

import java.util.Arrays;
import java.util.List;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbConvertedBy;

/**
 * Represents a known relationship between the identity and  author.
 * <p>
 * This includes relationships like mentor, mentee, co-investigator, etc.,
 * and supports conversion of {@link RelationshipType} to DynamoDB-compatible format.
 * </p>
 * @author ved4006
 */

@DynamoDbBean
public class KnownRelationship {

	  /**
     * The unique identifier of the related user.
     */
	private String uid;
	
	 /**
     * The name of the related author.
     */
	private AuthorName name;
	
	 /**
     * The type of the relationship with the user (e.g., Mentor, Mentee).
     */
	private RelationshipType type;
	
	/**
     * Returns the UID of the related identity.
     *
     * @return the UID string
     */
	public String getUid() {
		return uid;
	}
	
	 /**
     * Sets the UID of the related identity.
     *
     * @param uid the unique identifier to set
     */
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	/**
     * Returns the name of the related author.
     *
     * @return the {@code AuthorName}
     */
	public AuthorName getName() {
		return name;
	}
	
	 /**
     * Sets the name of the related author.
     *
     * @param name the {@code AuthorName} to set
     */
	public void setName(AuthorName name) {
		this.name = name;
	}
	
	 /**
     * Returns the relationship type with the related user.
     * <p>
     * This method is annotated to use a custom marshaller to convert
     * between enum and DynamoDB attribute.
     * </p>
     *
     * @return the {@code RelationshipType}
     */
	@DynamoDbConvertedBy(RelationshipTypeEnumMarshaller.class)
	public RelationshipType getType() {
		return type;
	}
	
	 /**
     * Sets the relationship type with the related user.
     *
     * @param type the {@code RelationshipType} to set
     */
	public void setType(RelationshipType type) {
		this.type = type;
	}
	
	/**
	 * Returns a string representation of the relationship object.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "KnownRelationship [uid=" + uid + ", name=" + name + ", type=" + type + "]";
	}
	
	/**
     * Enum representing supported relationship types between users.
     * <p>
     * Each enum constant contains a display label used for mapping and UI.
     * </p>
     */
	public enum RelationshipType {
		
		/**
			Relationship type for the Co-Investigator
		*/
		CO_INVESTIGATOR("Co-investigator"),
		/**
			Relationship type for the Mentor
		*/
		MENTOR("Mentor"),
		/**
			Relationship type for the Mentee
		*/	
		MENTEE("Mentee"),
		/**
			Relationship type for the Manager
		*/	
		MANAGER("Manager"),
		/**
			Relationship type for the Report
		*/	
		REPORT("Report"),
		/**
			Relationship type for the HR
		*/	
		HR("Shared organizational unit"),
		/**
			Relationship type for the CTSC_GRANT_ASSOCIATE
		*/	
		CTSC_GRANT_ASSOCIATE("CTSC Grant Associate"),
		/**
			Relationship type for the CTSC_PROTOCOL_ASSOCIATE
		*/	
		CTSC_PROTOCOL_ASSOCIATE("CTSC Protocol Associate")
		;
		
		/** 

		 * The text.
		 */
		private final String text;

		/**
		 * Constructs a relationship type with a display text.
		 *
		 * @param text the display value of the enum
		 */
		RelationshipType(final String text) {
			this.text = text;
		}

		/**
		 * Returns the string representation (display name) of the enum.
		 *
		 * @return the display label
		 */
		@Override
		public String toString() {
			return text;
		}

	}
	
	/**
     * Returns the enum constant from a given display label.
     *
     * @param value the display label to match
     * @return the matching {@code RelationshipType}, or null if not found
     */
	public static RelationshipType getEnum(String value) {
	    List<RelationshipType> list = Arrays.asList(RelationshipType.values());
	    return list.stream().filter(m -> m.text.equals(value)).findAny().orElse(null);
	}
}
