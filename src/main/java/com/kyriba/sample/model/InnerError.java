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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * An object containing more specific information than the current object about the error.
 */
@ApiModel(description = "An object containing more specific information than the current object about the error.")
public class InnerError {
  @SerializedName("code")
  private String code = null;

  @SerializedName("innererror")
  private InnerError innererror = null;

  public InnerError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * One of a server-defined set of error codes.
   * @return code
  **/
  @ApiModelProperty(example = "Invalid", value = "One of a server-defined set of error codes.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public InnerError innererror(InnerError innererror) {
    this.innererror = innererror;
    return this;
  }

   /**
   * An object containing more specific information than the current object about the error.
   * @return innererror
  **/
  @ApiModelProperty(value = "An object containing more specific information than the current object about the error.")
  public InnerError getInnererror() {
    return innererror;
  }

  public void setInnererror(InnerError innererror) {
    this.innererror = innererror;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InnerError innerError = (InnerError) o;
    return Objects.equals(this.code, innerError.code) &&
        Objects.equals(this.innererror, innerError.innererror);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, innererror);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InnerError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    innererror: ").append(toIndentedString(innererror)).append("\n");
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

