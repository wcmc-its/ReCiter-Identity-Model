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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ved4006
 * This contains different gender probability list attributed from different sources
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gender {

    /**
     * The unique id
     */
    private String uniqueId;

    /**
     * Name of the person, usually first name. <i>e.g. <b>Aban, Paul, Nancy </b></i>
     */
    private String name;

    /**
     * Gender of the person
     */
    private GenderEnum gender;

    /**
     * The probability of the person to be male for female. <i>e.g. <b>"probability": 0.998814604077762</b></i>
     */
    private double probability;
}
