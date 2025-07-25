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

import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
/**
 * A custom attribute converter for mapping the {@link OrganizationalUnit.OrganizationalUnitType}
 * enum to and from DynamoDB String attributes using the AWS SDK v2 Enhanced Client.
 * <p>
 * This converter ensures the enum is stored as a string (its {@code name()}) in the DynamoDB table.
 * </p>
 */

public class OrganizationalUnitTypeConverter implements AttributeConverter<OrganizationalUnit.OrganizationalUnitType> {

    /**
     * Converts the enum value to a DynamoDB {@link AttributeValue} with string type.
     *
     * @param input the {@link OrganizationalUnit.OrganizationalUnitType} enum value
     * @return an AttributeValue representing the enum name as a string
     */
    @Override
    public AttributeValue transformFrom(OrganizationalUnit.OrganizationalUnitType input) {
        return AttributeValue.builder().s(input.name()).build();
    }

    /**
     * Converts the DynamoDB {@link AttributeValue} back into the enum.
     *
     * @param input the AttributeValue containing the enum name as a string
     * @return the corresponding {@link OrganizationalUnit.OrganizationalUnitType} enum value
     */
    @Override
    public OrganizationalUnit.OrganizationalUnitType transformTo(AttributeValue input) {
        return OrganizationalUnit.OrganizationalUnitType.valueOf(input.s());
    }

    /**
     * Returns the {@link EnhancedType} information for this converter's target enum.
     *
     * @return the enhanced type for {@code OrganizationalUnitType}
     */
    @Override
    public EnhancedType<OrganizationalUnit.OrganizationalUnitType> type() {
        return EnhancedType.of(OrganizationalUnit.OrganizationalUnitType.class);
    }

    /**
     * Specifies the DynamoDB attribute type used by this converter (String).
     *
     * @return {@link AttributeValueType#S} indicating a string attribute
     */
    @Override
    public AttributeValueType attributeValueType() {
        return AttributeValueType.S;
    }
}