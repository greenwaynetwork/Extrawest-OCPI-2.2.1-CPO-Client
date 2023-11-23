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
 * RegularHours
 */
@JsonPropertyOrder({
        RegularHours.JSON_PROPERTY_WEEKDAY,
        RegularHours.JSON_PROPERTY_PERIOD_BEGIN,
        RegularHours.JSON_PROPERTY_PERIOD_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-23T13:23:59.711846+02:00[Europe/Kiev]")
public class RegularHours {
    public static final String JSON_PROPERTY_WEEKDAY = "weekday";
    public static final String JSON_PROPERTY_PERIOD_BEGIN = "period_begin";
    public static final String JSON_PROPERTY_PERIOD_END = "period_end";
    private Integer weekday;
    private String periodBegin;
    private String periodEnd;

    public RegularHours() {
    }

    public RegularHours weekday(Integer weekday) {

        this.weekday = weekday;
        return this;
    }

    /**
     * Get weekday
     * minimum: 1
     * maximum: 7
     *
     * @return weekday
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_WEEKDAY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public Integer getWeekday() {
        return weekday;
    }


    @JsonProperty(JSON_PROPERTY_WEEKDAY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }


    public RegularHours periodBegin(String periodBegin) {

        this.periodBegin = periodBegin;
        return this;
    }

    /**
     * Get periodBegin
     *
     * @return periodBegin
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PERIOD_BEGIN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getPeriodBegin() {
        return periodBegin;
    }


    @JsonProperty(JSON_PROPERTY_PERIOD_BEGIN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPeriodBegin(String periodBegin) {
        this.periodBegin = periodBegin;
    }


    public RegularHours periodEnd(String periodEnd) {

        this.periodEnd = periodEnd;
        return this;
    }

    /**
     * Get periodEnd
     *
     * @return periodEnd
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_PERIOD_END)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getPeriodEnd() {
        return periodEnd;
    }


    @JsonProperty(JSON_PROPERTY_PERIOD_END)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegularHours regularHours = (RegularHours) o;
        return Objects.equals(this.weekday, regularHours.weekday) &&
                Objects.equals(this.periodBegin, regularHours.periodBegin) &&
                Objects.equals(this.periodEnd, regularHours.periodEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weekday, periodBegin, periodEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegularHours {\n");
        sb.append("    weekday: ").append(toIndentedString(weekday)).append("\n");
        sb.append("    periodBegin: ").append(toIndentedString(periodBegin)).append("\n");
        sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
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

