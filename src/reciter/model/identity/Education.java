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

import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;


/** @author ved4006
 * Represents the education details of a person.
 * Includes bachelor and doctoral degree completion years.
 */

@DynamoDbBean
public class Education {
	
	
	/**
	 * The bachelor year
	 */
	private int bachelorYear;
	
	/**
	 * The doctoral year
	 */
	private int doctoralYear;
	
	/**
     * Default constructor for Education.
     */
	public Education() {}

	
	/**
	 * Gets the bachelor year.
	 *
	 * @return the bachelor year
	 */
	public int getBachelorYear() {
		return bachelorYear;
	}

	/**
	 * Sets the bachelor year.
	 *
	 * @param bachelorYear the new bachelor year
	 */
	public void setBachelorYear(int bachelorYear) {
		this.bachelorYear = bachelorYear;
	}

	/**
	 * Gets the doctoral year.
	 *
	 * @return the doctoral year
	 */
	public int getDoctoralYear() {
		return doctoralYear;
	}

	/**
	 * Sets the doctoral year.
	 *
	 * @param doctoralYear the new doctoral year
	 */
	public void setDoctoralYear(int doctoralYear) {
		this.doctoralYear = doctoralYear;
	}
}
