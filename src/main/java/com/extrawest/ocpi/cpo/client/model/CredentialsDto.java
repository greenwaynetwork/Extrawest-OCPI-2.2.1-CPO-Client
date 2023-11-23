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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CredentialsDto
 */
@JsonPropertyOrder({
        CredentialsDto.JSON_PROPERTY_TOKEN,
        CredentialsDto.JSON_PROPERTY_URL,
        CredentialsDto.JSON_PROPERTY_ROLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-23T13:23:59.711846+02:00[Europe/Kiev]")
public class CredentialsDto {
    public static final String JSON_PROPERTY_TOKEN = "token";
    public static final String JSON_PROPERTY_URL = "url";
    public static final String JSON_PROPERTY_ROLES = "roles";
    private String token;
    private String url;
    private List<CredentialsRole> roles = new ArrayList<>();

    public CredentialsDto() {
    }

    public CredentialsDto token(String token) {

        this.token = token;
        return this;
    }

    /**
     * Get token
     *
     * @return token
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_TOKEN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getToken() {
        return token;
    }


    @JsonProperty(JSON_PROPERTY_TOKEN)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setToken(String token) {
        this.token = token;
    }


    public CredentialsDto url(String url) {

        this.url = url;
        return this;
    }

    /**
     * Get url
     *
     * @return url
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public String getUrl() {
        return url;
    }


    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUrl(String url) {
        this.url = url;
    }


    public CredentialsDto roles(List<CredentialsRole> roles) {

        this.roles = roles;
        return this;
    }

    public CredentialsDto addRolesItem(CredentialsRole rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    /**
     * Get roles
     *
     * @return roles
     **/
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ROLES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)

    public List<CredentialsRole> getRoles() {
        return roles;
    }


    @JsonProperty(JSON_PROPERTY_ROLES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRoles(List<CredentialsRole> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CredentialsDto credentialsDto = (CredentialsDto) o;
        return Objects.equals(this.token, credentialsDto.token) &&
                Objects.equals(this.url, credentialsDto.url) &&
                Objects.equals(this.roles, credentialsDto.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, url, roles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CredentialsDto {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

