/*
 * Copyright (C) HAT Data Exchange Ltd - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by Andrius Aucinas <andrius.aucinas@hatdex.org>, 10 2016
 */

package org.hatdex.hat.api.models

case class ApiLocation(
  id: Option[Int],
  name: String,
  staticProperties: Option[Seq[ApiPropertyRelationshipStatic]],
  dynamicProperties: Option[Seq[ApiPropertyRelationshipDynamic]],
  locations: Option[Seq[ApiLocationRelationship]],
  things: Option[Seq[ApiThingRelationship]])

case class ApiLocationRelationship(relationshipType: String, location: ApiLocation)