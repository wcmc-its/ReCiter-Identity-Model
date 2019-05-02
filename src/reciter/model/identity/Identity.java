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

import java.util.List;
import java.util.Map;

@DynamoDBDocument
public class Identity {

	private String uid; // uid of the user
	private AuthorName primaryName; // primary name of the user
	private List<AuthorName> alternateNames; // aliases
	private List<String> emails; // list of emails
	private List<KnownRelationship> knownRelationships; // known relationships
	private List<OrganizationalUnit> organizationalUnits; // list of department
	private String title; // title of the person
	private List<String> institutions; // institutions
	private Education degreeYear; // degreeYear
	private List<String> personTypes; // type of person: i.e., academic, academic-faculty, etc...
	private String program; // program the person is in.
	private List<String> grants; // grants
	private List<PubMedAlias> pubMedAlias; // name alias from PubMed
	@DynamoDBIgnore
	@JsonIgnore
	private Map<AuthorName, AuthorName> sanitizedNames; //This contains sanitized names of both primary and alternate names
	
	public Identity() {}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public AuthorName getPrimaryName() {
		return primaryName;
	}

	public void setPrimaryName(AuthorName primaryName) {
		this.primaryName = primaryName;
	}

	public List<AuthorName> getAlternateNames() {
		return alternateNames;
	}

	public void setAlternateNames(List<AuthorName> alternateNames) {
		this.alternateNames = alternateNames;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<KnownRelationship> getKnownRelationships() {
		return knownRelationships;
	}

	public void setKnownRelationships(List<KnownRelationship> knownRelationships) {
		this.knownRelationships = knownRelationships;
	}

	public List<OrganizationalUnit> getOrganizationalUnits() {
		return organizationalUnits;
	}

	public void setOrganizationalUnits(List<OrganizationalUnit> organizationalUnits) {
		this.organizationalUnits = organizationalUnits;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getInstitutions() {
		return institutions;
	}

	public void setInstitutions(List<String> institutions) {
		this.institutions = institutions;
	}

	public Education getDegreeYear() {
		return degreeYear;
	}

	public void setDegreeYear(Education degreeYear) {
		this.degreeYear = degreeYear;
	}

	public List<String> getPersonTypes() {
		return personTypes;
	}

	public void setPersonTypes(List<String> personTypes) {
		this.personTypes = personTypes;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public List<String> getGrants() {
		return grants;
	}

	public void setGrants(List<String> grants) {
		this.grants = grants;
	}

	public List<PubMedAlias> getPubMedAlias() {
		return pubMedAlias;
	}

	public void setPubMedAlias(List<PubMedAlias> pubMedAlias) {
		this.pubMedAlias = pubMedAlias;
	}

	public Map<AuthorName, AuthorName> getSanitizedNames() {
		return sanitizedNames;
	}

	public void setSanitizedNames(Map<AuthorName, AuthorName> sanitizedNames) {
		this.sanitizedNames = sanitizedNames;
	}
}
