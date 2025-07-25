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

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * Represents an author's name with support for matching logic and name variant
 * generation. ved4006
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@DynamoDbBean
public class AuthorName {

	/**
	 * First Name.
	 */
	private String firstName;

	/**
	 * First Initial.
	 */
	private String firstInitial;

	/**
	 * Middle Name.
	 */
	private String middleName;

	/**
	 * Middle Initial.
	 */
	private String middleInitial;

	/**
	 * Last Name.
	 */
	private String lastName;

	/**
	 * Default constructor for AuthorName.
	 */
	public AuthorName() {
	}

	/**
	 * Constructs an author provided a first name, middle name, and last name.
	 * 
	 * @param firstName  First name.
	 * @param middleName Middle name.
	 * @param lastName   Last name.
	 */
	public AuthorName(String firstName, String middleName, String lastName) {

		if (firstName == null) {
			this.firstName = "";
			this.firstInitial = "";
		} else {
			this.firstName = firstName.trim();
			this.firstInitial = this.firstName.substring(0, 1);
		}

		if (middleName == null) {
			this.middleName = "";
			this.middleInitial = "";
		} else {
			this.middleName = middleName.trim();
			this.middleInitial = this.middleName.substring(0, 1);
		}

		if (lastName == null) {
			this.lastName = "";
		} else {
			this.lastName = lastName.trim();
		}
	}

	/**
	 * Capitalize the first character of name (cannot be null).
	 *
	 * @param name the name
	 * @return name with first character capitalized.
	 */
	private String capitalize(String name) {
		if (name.length() == 0) {
			return name;
		}

		final char firstChar = name.charAt(0);
		final char newChar = Character.toTitleCase(firstChar);
		if (firstChar == newChar) {
			return name;
		}

		char[] newChars = new char[name.length()];
		newChars[0] = newChar;
		name.getChars(1, name.length(), newChars, 1);
		return String.valueOf(newChars);
	}

	/**
	 * Returns true if the first initial and last name match with the given name.
	 *
	 * @param name the name
	 * @return true, if successful
	 */
	public boolean firstInitialLastNameMatch(AuthorName name) {
		return firstInitial.equalsIgnoreCase(name.getFirstInitial()) && lastName.equalsIgnoreCase(name.getLastName());
	}

	/**
	 * Returns true if first initial, middle initial, and last name match.
	 *
	 * @param name the name
	 * @return true, if successful
	 */
	public boolean firstInitialMiddleInitialLastNameMatch(AuthorName name) {
		return firstInitial.equalsIgnoreCase(name.getFirstInitial())
				&& middleInitial.equalsIgnoreCase(name.getMiddleInitial())
				&& lastName.equalsIgnoreCase(name.getLastName());
	}

	/**
	 * The Enum NameMatchHeuristic.
	 */
	public enum NameMatchHeuristic {

		/** The none. */
		NONE,
		/** The empty. */
		// two strings do not match
		EMPTY,
		/** The initial. */
		// both strings have length zero or either one has length zero
		INITIAL,
		/** The whole. */
		// both strings have length one and they are equal
		WHOLE // both strings are equal
	}

	/**
	 * Perform partial match on part of a name 0 = different. 1 = either null, 2 =
	 * either initial, (initial matches) 3 = same (multiple characters)
	 *
	 * @param x the x
	 * @param y the y
	 * @return the name match heuristic
	 */
	private NameMatchHeuristic matchNameParts(String x, String y) {
		if (x.length() == 0 || y.length() == 0) {
			return NameMatchHeuristic.EMPTY;
		}
		if ((x.length() == 1 || y.length() == 1) && (x.substring(0, 1).equals(y.substring(0, 1)))) {
			return NameMatchHeuristic.INITIAL;
		}
		if (x.equals(y)) {
			return NameMatchHeuristic.WHOLE;
		}
		return NameMatchHeuristic.NONE;
	}

	/**
	 * Match two names accounting for variants > 330: last and first match = 320:
	 * bad match on middle name > 320: last and first initial match.
	 *
	 * @param y the y
	 * @return the name match heuristic[]
	 */
	private NameMatchHeuristic[] match(AuthorName y) {
		return new NameMatchHeuristic[] { matchNameParts(getFirstName(), y.getFirstName()),
				matchNameParts(getMiddleName(), y.getMiddleName()), matchNameParts(getLastName(), y.getLastName()) };
	}

	/**
	 * Performs exact match on full name (first, middle, last).
	 *
	 * @param name the name
	 * @return true, if is full name match
	 */
	public boolean isFullNameMatch(AuthorName name) {
		if (lastName != null && firstName != null && middleName != null) {
			return firstName.equalsIgnoreCase(name.getFirstName()) && middleName.equalsIgnoreCase(name.getMiddleName())
					&& lastName.equalsIgnoreCase(name.getLastName());
		} else {
			return false;
		}
	}

	/**
	 * Checks if is name match.
	 *
	 * @param name the name
	 * @return true, if is name match
	 */
	public boolean isNameMatch(AuthorName name) {
		if (lastName != null && firstName != null && middleName != null) {
			return firstName.equalsIgnoreCase(name.getFirstName()) && middleName.equalsIgnoreCase(name.getMiddleName())
					&& lastName.equalsIgnoreCase(name.getLastName());
		} else if (lastName != null && firstName != null && middleName == null) {
			return firstName.equalsIgnoreCase(name.getFirstName()) && lastName.equalsIgnoreCase(name.getLastName());
		} else {
			return false;
		}
	}

	/**
	 * Check first name and middle name not empty.
	 *
	 * @return true, if successful
	 */
	public boolean checkFirstNameAndMiddleNameNotEmpty() {
		return firstName.length() > 1 || middleName.length() > 1;
	}

	/**
	 * Return indexable variants of a name. type=target: restrict initials,
	 * type=coauthor: no restrictions initials=1: Last F initials=2: Last FM
	 * 
	 * @param type     target or coauthor. If target, restrict initials. If
	 *                 coauthor, no restrictions. This means that if initials is 1,
	 *                 variants of type "R Kukafka" is omitted. (F, "", Last). This
	 *                 results in only 5 options. (assuming the name has full first,
	 *                 middle, and last names).
	 * 
	 *                 If initials is 2, variants of type above and type "R M
	 *                 Kukafka" is omitted. (F, M, Last). This results in only 4
	 *                 options. (assuming the name has full first, middle, and last
	 *                 names).
	 * 
	 * @param initials If 1, Last F. If 2, Last FM
	 * @return A list of variants of a name.
	 * 
	 *         Invariant: First Name and Last Name must exist, else
	 *         IllegalArgumentException is thrown.
	 * 
	 *         Eg: The name "Rita Mary Kukafka" has the following 6 variants:
	 * 
	 *         1. "Rita Mary Kukafka" 2. "R Kukafka" 3. "R Mary Kukafka" 4. "R M
	 *         Kukafka" 5. "Rita Kukafka" 6. "Rita M Kukafka"
	 */
	public Set<AuthorName> variants(String type, int initials) {

		Set<AuthorName> v = new HashSet<AuthorName>();
		v.add(this);

		String first = getFirstName();
		String last = getLastName();

		// Check if first name can be initialized (ie: "Rita" becomes "R").
		if (firstName.length() > 1) {
			String firstInitial = firstName.substring(0, 1);
			if (!"target".equals(type)) {
				v.add(new AuthorName(firstInitial, "", last)); // add variant (F, "", Last).
			}
			// Check whether middle name exists. If it does, add the variants with full
			// middle name, (eg: Rita Mary Kukafka), and middle initial (eg:
			// (Rita M Kukafka). Also, add (R Mary Kukafka) and (R M Kukafka).
			String middle = getMiddleName();
			if (middleName.length() > 1) {
				v.add(new AuthorName(firstInitial, middle, last)); // add variant (F, middle, last).
				String middleInitial = middleName.substring(0, 1);
				if (!("target".equals(type) && initials == 2)) { // option "target" and initials 2 not specified.
					v.add(new AuthorName(firstInitial, middleInitial, last)); // add variant (F, M, last).
				}
				v.add(new AuthorName(first, "", last)); // add variant. (first, "", Last).
				v.add(new AuthorName(first, middleInitial, last)); // add variant (first, M, last).
			}
		}
		return v;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		if (firstName == null)
			throw new IllegalArgumentException("first name should not be null.");
		this.firstName = firstName.trim();
		this.firstInitial = firstName.length() > 0 ? firstName.substring(0, 1) : "";
	}

	/**
	 * Sets the middle name.
	 *
	 * @param middleName the new middle name
	 */
	public void setMiddleName(String middleName) {
		if (middleName == null)
			throw new IllegalArgumentException("middle name should not be null.");
		this.middleName = middleName.trim();
		this.middleInitial = middleName.length() > 0 ? middleName.substring(0, 1) : "";
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Gets the first initial.
	 *
	 * @return the first initial
	 */
	public String getFirstInitial() {
		return firstInitial;
	}

	/**
	 * Gets the middle name.
	 *
	 * @return the middle name
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Gets the middle initial.
	 *
	 * @return the middle initial
	 */
	public String getMiddleInitial() {
		return middleInitial;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the first initial.
	 *
	 * @param firstInitial the new first initial
	 */
	public void setFirstInitial(String firstInitial) {
		this.firstInitial = firstInitial;
	}

	/**
	 * Sets the middle initial.
	 *
	 * @param middleInitial the new middle initial
	 */
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		if (lastName == null)
			throw new IllegalArgumentException("last name should not be null.");
		this.lastName = lastName.trim();
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		if (middleName != null && middleName.length() > 0) {
			return "{firstName=[" + firstName + "], middleName=[" + middleName + "], lastName=[" + lastName + "]}";
		} else {
			return "{firstName=[" + firstName + "], lastName=[" + lastName + "]}";
		}
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstInitial == null) ? 0 : firstInitial.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleInitial == null) ? 0 : middleInitial.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		return result;
	}

	/**
	 * Equals.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthorName other = (AuthorName) obj;
		if (firstInitial == null) {
			if (other.firstInitial != null)
				return false;
		} else if (!firstInitial.equals(other.firstInitial))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleInitial == null) {
			if (other.middleInitial != null)
				return false;
		} else if (!middleInitial.equals(other.middleInitial))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		return true;
	}
}
