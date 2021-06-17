/*
 * Accounts
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kyriba.sample.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * REST API Error Response.
 */
@ApiModel(description = "REST API Error Response.")
public class RestApiErrorResponse {
    @SerializedName("error")
    private RestApiError error = null;

    public RestApiErrorResponse error(RestApiError error) {
        this.error = error;
        return this;
    }

    /**
     * The error object.
     *
     * @return error
     **/
    @ApiModelProperty(value = "The error object.")
    public RestApiError getError() {
        return error;
    }

    public void setError(RestApiError error) {
        this.error = error;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestApiErrorResponse restApiErrorResponse = (RestApiErrorResponse) o;
        return Objects.equals(this.error, restApiErrorResponse.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(error);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestApiErrorResponse {\n");

        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

