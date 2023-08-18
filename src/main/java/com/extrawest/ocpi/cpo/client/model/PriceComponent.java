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

import com.fasterxml.jackson.annotation.*;

import java.util.Objects;

/**
 * PriceComponent
 */
@JsonPropertyOrder({
  PriceComponent.JSON_PROPERTY_TYPE,
  PriceComponent.JSON_PROPERTY_PRICE,
  PriceComponent.JSON_PROPERTY_VAT,
  PriceComponent.JSON_PROPERTY_STEP_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-18T12:07:41.590741+03:00[Europe/Kiev]")
public class PriceComponent {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ENERGY("ENERGY"),
    
    FLAT("FLAT"),
    
    PARKING_TIME("PARKING_TIME"),
    
    TIME("TIME");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Float price;

  public static final String JSON_PROPERTY_VAT = "vat";
  private Float vat;

  public static final String JSON_PROPERTY_STEP_SIZE = "step_size";
  private Integer stepSize;

  public PriceComponent() {
  }

  public PriceComponent type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PriceComponent price(Float price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(Float price) {
    this.price = price;
  }


  public PriceComponent vat(Float vat) {
    
    this.vat = vat;
    return this;
  }

   /**
   * Get vat
   * @return vat
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getVat() {
    return vat;
  }


  @JsonProperty(JSON_PROPERTY_VAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVat(Float vat) {
    this.vat = vat;
  }


  public PriceComponent stepSize(Integer stepSize) {
    
    this.stepSize = stepSize;
    return this;
  }

   /**
   * Get stepSize
   * @return stepSize
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STEP_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStepSize() {
    return stepSize;
  }


  @JsonProperty(JSON_PROPERTY_STEP_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStepSize(Integer stepSize) {
    this.stepSize = stepSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceComponent priceComponent = (PriceComponent) o;
    return Objects.equals(this.type, priceComponent.type) &&
        Objects.equals(this.price, priceComponent.price) &&
        Objects.equals(this.vat, priceComponent.vat) &&
        Objects.equals(this.stepSize, priceComponent.stepSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, price, vat, stepSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceComponent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
    sb.append("    stepSize: ").append(toIndentedString(stepSize)).append("\n");
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

