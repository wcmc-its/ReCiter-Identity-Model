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


import reciter.model.identity.KnownRelationship.RelationshipType;
import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

/**
* A custom attribute converter that maps {@link RelationshipType} enums
* to and from DynamoDB string attributes using the AWS SDK v2 Enhanced Client.
*
* <p>
* The enum is stored in DynamoDB using its display text (from {@code toString()}),
* and deserialized via a custom lookup defined in {@link KnownRelationship#getEnum(String)}.
* </p>
*/
public class RelationshipTypeEnumMarshaller<T> implements AttributeConverter<RelationshipType> {

   /**
    * Converts the {@link RelationshipType} enum to a DynamoDB {@link AttributeValue} string.
    *
    * @param input the enum value to convert
    * @return a string-type AttributeValue with the enum's display name
    */
   @Override
   public AttributeValue transformFrom(RelationshipType input) {
       return AttributeValue.builder().s(input.toString()).build();
   }

   /**
    * Converts the DynamoDB string {@link AttributeValue} back to a {@link RelationshipType} enum.
    *
    * @param input the AttributeValue containing the enum display name
    * @return the corresponding {@link RelationshipType} enum, or {@code null} if not matched
    */
   @Override
   public RelationshipType transformTo(AttributeValue input) {
       return KnownRelationship.getEnum(input.s());
   }

   /**
    * Specifies the enhanced type information for the converter.
    *
    * @return the enhanced type of {@link RelationshipType}
    */
   @Override
   public EnhancedType<RelationshipType> type() {
       return EnhancedType.of(RelationshipType.class);
   }

   /**
    * Specifies the DynamoDB attribute type used for storing the enum.
    *
    * @return {@link AttributeValueType#S}, indicating a string representation
    */
   @Override
   public AttributeValueType attributeValueType() {
       return AttributeValueType.S;
   }
}