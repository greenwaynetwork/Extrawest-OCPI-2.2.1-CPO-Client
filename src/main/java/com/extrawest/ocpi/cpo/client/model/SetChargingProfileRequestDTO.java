/*
 * OCPI 2.2.1
 * This API exposes endpoints to manage OCPI entities.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: ocpi@extrawest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.extrawest.ocpi.cpo.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;

/**
 * SetChargingProfileRequestDTO
 */
@JsonPropertyOrder({
  SetChargingProfileRequestDTO.JSON_PROPERTY_CHARGING_PROFILE,
  SetChargingProfileRequestDTO.JSON_PROPERTY_RESPONSE_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-18T12:07:41.590741+03:00[Europe/Kiev]")
public class SetChargingProfileRequestDTO {
  public static final String JSON_PROPERTY_CHARGING_PROFILE = "charging_profile";
  private ChargingProfile chargingProfile;

  public static final String JSON_PROPERTY_RESPONSE_URL = "response_url ";
  private String responseUrl;

  public SetChargingProfileRequestDTO() {
  }

  public SetChargingProfileRequestDTO chargingProfile(ChargingProfile chargingProfile) {
    
    this.chargingProfile = chargingProfile;
    return this;
  }

   /**
   * Get chargingProfile
   * @return chargingProfile
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CHARGING_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ChargingProfile getChargingProfile() {
    return chargingProfile;
  }


  @JsonProperty(JSON_PROPERTY_CHARGING_PROFILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChargingProfile(ChargingProfile chargingProfile) {
    this.chargingProfile = chargingProfile;
  }


  public SetChargingProfileRequestDTO responseUrl(String responseUrl) {
    
    this.responseUrl = responseUrl;
    return this;
  }

   /**
   * Get responseUrl
   * @return responseUrl
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESPONSE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResponseUrl() {
    return responseUrl;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResponseUrl(String responseUrl) {
    this.responseUrl = responseUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetChargingProfileRequestDTO setChargingProfileRequestDTO = (SetChargingProfileRequestDTO) o;
    return Objects.equals(this.chargingProfile, setChargingProfileRequestDTO.chargingProfile) &&
        Objects.equals(this.responseUrl, setChargingProfileRequestDTO.responseUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargingProfile, responseUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetChargingProfileRequestDTO {\n");
    sb.append("    chargingProfile: ").append(toIndentedString(chargingProfile)).append("\n");
    sb.append("    responseUrl: ").append(toIndentedString(responseUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

