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

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIgnore;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import reciter.database.dynamodb.model.Gender;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author szd2013
 * This class contains defines the Identity which will be used to suggest Publications by ReCiter
 */
@Data
@DynamoDBDocument
public class Identity {

	private String uid; // uid of the user
	private AuthorName primaryName; // primary name of the user
	@DynamoDBIgnore
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
	@DynamoDBIgnore
	@JsonIgnore
	private Map<AuthorName, AuthorName> sanitizedNames; //This contains sanitized names of both primary and alternate names
	@DynamoDBIgnore
	@JsonIgnore
	private Set<OrganizationalUnit> sanitizedIdentityInstitutions; // sanitized Map of Institutions also will contain synonyms for orgUnit as well
	@DynamoDBIgnore
	@JsonIgnore
	private Map<String, List<String>> identityOrgUnitToSynonymMap; // Map for a actual orgUnit to synonym as defined by ReCiter application
	private String orcid;
}
