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

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbIgnore;

/**
 * @author szd2013
 * This class contains defines the Identity which will be used to suggest Publications by ReCiter
 */
@Data
@DynamoDbBean
public class Identity {

	 /**
     * The unique user identifier.
     */
	private String uid; 
	 /**
     * The primary author name associated with the person.
     */
	private AuthorName primaryName; 
	
	/**
     * The gender probability or classification of the user.
     * <p>
     * This field is ignored in both JSON serialization and DynamoDB mapping.
     * </p>
     */
	@JsonIgnore
	private Gender gender; 
	
	/**
     * Alternate names or aliases for the person.
     */
	private List<AuthorName> alternateNames; 
	
	 /**
     * List of  email addresses associated with the person.
     */
	private List<String> emails;
	
	/**
     * List of Known relationships 
     */
	private List<KnownRelationship> knownRelationships; 
	
	/**
     * Organizational units (e.g., departments).
     */
	private List<OrganizationalUnit> organizationalUnits; 
	
	/**
     * The title of the person.
     */
	private String title; 
	
	/**
     * List of institutions.
     */
	private List<String> institutions; 
	
	/**
     * The user's education degree Year details.
     */
	private Education degreeYear; 
	
	 /**
     * Types of the person, e.g., academic, academic-faculty, etc.
     */
	private List<String> personTypes;
	
	/**
    * List of grants associated with the user.
    */
	private List<String> grants;
	
	/**
     * The person's primary organizational unit.
     */
	private String primaryOrganizationalUnit;
	/**
     * The person's primary institution.
     */
	private String primaryInstitution; 
	
	/**
     * A map of original to sanitized  names (both primary and alternate).
     * <p>
     * This field is ignored in both JSON serialization and DynamoDB mapping.
     * </p>
     */
	@JsonIgnore
	private Map<AuthorName, AuthorName> sanitizedNames; 
	
	/**
     * A set of sanitized of Institutions also will contain synonyms for orgUnit as well.
     * <p>
     * This field is ignored in both JSON serialization and DynamoDB mapping.
     * </p>
     */
	@JsonIgnore
	private Set<OrganizationalUnit> sanitizedIdentityInstitutions; // sanitized Map of Institutions also will contain synonyms for orgUnit as well
	
	/**
    * A map from original orgUnit names to their synonyms, as defined in ReCiter.
    * <p>
    * This field is ignored in both JSON serialization and DynamoDB mapping
    * </p>
    */
	@JsonIgnore
	private Map<String, List<String>> identityOrgUnitToSynonymMap; 
	
	/**
     * A unique, persistent identifier that helps to distinguish researchers and connect them with their research outputs.
     *  It's(Open Researcher and Contributor ID) .
     */
	private String orcid;
	
	 /**
     * Gets the gender of the user.
     *
     * @return the gender enum
     */
	@DynamoDbIgnore
	public Gender getGender() {
		return gender;
	}
	
	 /**
     * Gets the sanitized names map for this identity.
     *
     * @return a map of unsanitized to sanitized author names
     */
	@DynamoDbIgnore
	public Map<AuthorName, AuthorName> getSanitizedNames() {
		return sanitizedNames;
	}
	
	/**
     * Gets the set of sanitized organizational units for this identity.
     *
     * @return a set of normalized org units
     */
	@DynamoDbIgnore
	public Set<OrganizationalUnit> getSanitizedIdentityInstitutions() {
		return sanitizedIdentityInstitutions;
	}
	
	 /**
     * Gets the synonym map for the user's organizational units.
     *
     * @return a map of orgUnit to synonyms
     */
	@DynamoDbIgnore
	public Map<String, List<String>> getIdentityOrgUnitToSynonymMap() {
		return identityOrgUnitToSynonymMap;
	}
	
	
}
