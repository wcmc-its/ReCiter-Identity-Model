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

	private String uid; // uid of the user
	private AuthorName primaryName; // primary name of the user
	@JsonIgnore
	private Gender gender; //gender probability of user 
	private List<AuthorName> alternateNames; // aliases
	private List<String> emails; // list of emails
	private List<KnownRelationship> knownRelationships; // known relationships
	private List<OrganizationalUnit> organizationalUnits; // list of department
	private String title; // title of the person
	private List<String> institutions; // institutions
	private Education degreeYear; // degreeYear
	private List<String> personTypes; // type of person: i.e., academic, academic-faculty, etc...
	private List<String> grants; // grants
	private String primaryOrganizationalUnit; //primary org-unit of a person
	private String primaryInstitution; //primary institution for a person
	@JsonIgnore
	private Map<AuthorName, AuthorName> sanitizedNames; //This contains sanitized names of both primary and alternate names
	@JsonIgnore
	private Set<OrganizationalUnit> sanitizedIdentityInstitutions; // sanitized Map of Institutions also will contain synonyms for orgUnit as well
	@JsonIgnore
	private Map<String, List<String>> identityOrgUnitToSynonymMap; // Map for a actual orgUnit to synonym as defined by ReCiter application
	private String orcid;
	
	@DynamoDbIgnore
	public Gender getGender() {
		return gender;
	}
	@DynamoDbIgnore
	public Map<AuthorName, AuthorName> getSanitizedNames() {
		return sanitizedNames;
	}
	@DynamoDbIgnore
	public Set<OrganizationalUnit> getSanitizedIdentityInstitutions() {
		return sanitizedIdentityInstitutions;
	}
	@DynamoDbIgnore
	public Map<String, List<String>> getIdentityOrgUnitToSynonymMap() {
		return identityOrgUnitToSynonymMap;
	}
	
	
}
