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

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ResponseFormatListSessionDto
 */
@JsonPropertyOrder({
        ResponseFormatListSessionDto.JSON_PROPERTY_TIMESTAMP,
        ResponseFormatListSessionDto.JSON_PROPERTY_DATA,
        ResponseFormatListSessionDto.JSON_PROPERTY_STATUS_CODE,
        ResponseFormatListSessionDto.JSON_PROPERTY_STATUS_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-23T13:23:59.711846+02:00[Europe/Kiev]")
public class ResponseFormatListSessionDto {
    public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
    public static final String JSON_PROPERTY_DATA = "data";
    public static final String JSON_PROPERTY_STATUS_CODE = "status_code";
    public static final String JSON_PROPERTY_STATUS_MESSAGE = "status_message";
    private OffsetDateTime timestamp;
    private List<SessionDto> data;
    private Integer statusCode;
    private String statusMessage;

    public ResponseFormatListSessionDto() {
    }

    public ResponseFormatListSessionDto timestamp(OffsetDateTime timestamp) {

        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }


    @JsonProperty(JSON_PROPERTY_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }


    public ResponseFormatListSessionDto data(List<SessionDto> data) {

        this.data = data;
        return this;
    }

    public ResponseFormatListSessionDto addDataItem(SessionDto dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<SessionDto> getData() {
        return data;
    }


    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(List<SessionDto> data) {
        this.data = data;
    }


    public ResponseFormatListSessionDto statusCode(Integer statusCode) {

        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get statusCode
     * minimum: 1000
     * maximum: 4999
     *
     * @return statusCode
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STATUS_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public Integer getStatusCode() {
        return statusCode;
    }


    @JsonProperty(JSON_PROPERTY_STATUS_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }


    public ResponseFormatListSessionDto statusMessage(String statusMessage) {

        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * Get statusMessage
     *
     * @return statusMessage
     **/
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_STATUS_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getStatusMessage() {
        return statusMessage;
    }


    @JsonProperty(JSON_PROPERTY_STATUS_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseFormatListSessionDto responseFormatListSessionDto = (ResponseFormatListSessionDto) o;
        return Objects.equals(this.timestamp, responseFormatListSessionDto.timestamp) &&
                Objects.equals(this.data, responseFormatListSessionDto.data) &&
                Objects.equals(this.statusCode, responseFormatListSessionDto.statusCode) &&
                Objects.equals(this.statusMessage, responseFormatListSessionDto.statusMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, data, statusCode, statusMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseFormatListSessionDto {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

