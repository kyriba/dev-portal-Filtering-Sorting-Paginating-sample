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
import io.swagger.annotations.ApiModelProperty;

/**
 * UserZones
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:35:10.236Z")
public class UserZones {
  @SerializedName("userZone1")
  private String userZone1 = null;

  @SerializedName("userZone2")
  private String userZone2 = null;

  @SerializedName("userZone3")
  private String userZone3 = null;

  @SerializedName("userZone4")
  private String userZone4 = null;

  @SerializedName("userZone5")
  private String userZone5 = null;

  public UserZones userZone1(String userZone1) {
    this.userZone1 = userZone1;
    return this;
  }

   /**
   * Free field whose type (Alphanumeric, Numeric, Date, List) is defined in the application setup. The imported value must be consistent with the field type. And the total length across all user zone values must be of 250 characters max.
   * @return userZone1
  **/
  @ApiModelProperty(value = "Free field whose type (Alphanumeric, Numeric, Date, List) is defined in the application setup. The imported value must be consistent with the field type. And the total length across all user zone values must be of 250 characters max.")
  public String getUserZone1() {
    return userZone1;
  }

  public void setUserZone1(String userZone1) {
    this.userZone1 = userZone1;
  }

  public UserZones userZone2(String userZone2) {
    this.userZone2 = userZone2;
    return this;
  }

   /**
   * Free field. Same behavior as field User zone 1.
   * @return userZone2
  **/
  @ApiModelProperty(value = "Free field. Same behavior as field User zone 1.")
  public String getUserZone2() {
    return userZone2;
  }

  public void setUserZone2(String userZone2) {
    this.userZone2 = userZone2;
  }

  public UserZones userZone3(String userZone3) {
    this.userZone3 = userZone3;
    return this;
  }

   /**
   * Free field. Same behavior as field User zone 1.
   * @return userZone3
  **/
  @ApiModelProperty(value = "Free field. Same behavior as field User zone 1.")
  public String getUserZone3() {
    return userZone3;
  }

  public void setUserZone3(String userZone3) {
    this.userZone3 = userZone3;
  }

  public UserZones userZone4(String userZone4) {
    this.userZone4 = userZone4;
    return this;
  }

   /**
   * Free field. Same behavior as field User zone 1.
   * @return userZone4
  **/
  @ApiModelProperty(value = "Free field. Same behavior as field User zone 1.")
  public String getUserZone4() {
    return userZone4;
  }

  public void setUserZone4(String userZone4) {
    this.userZone4 = userZone4;
  }

  public UserZones userZone5(String userZone5) {
    this.userZone5 = userZone5;
    return this;
  }

   /**
   * Free field. Same behavior as field User zone 1.
   * @return userZone5
  **/
  @ApiModelProperty(value = "Free field. Same behavior as field User zone 1.")
  public String getUserZone5() {
    return userZone5;
  }

  public void setUserZone5(String userZone5) {
    this.userZone5 = userZone5;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserZones userZones = (UserZones) o;
    return Objects.equals(this.userZone1, userZones.userZone1) &&
        Objects.equals(this.userZone2, userZones.userZone2) &&
        Objects.equals(this.userZone3, userZones.userZone3) &&
        Objects.equals(this.userZone4, userZones.userZone4) &&
        Objects.equals(this.userZone5, userZones.userZone5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userZone1, userZone2, userZone3, userZone4, userZone5);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserZones {\n");
    
    sb.append("    userZone1: ").append(toIndentedString(userZone1)).append("\n");
    sb.append("    userZone2: ").append(toIndentedString(userZone2)).append("\n");
    sb.append("    userZone3: ").append(toIndentedString(userZone3)).append("\n");
    sb.append("    userZone4: ").append(toIndentedString(userZone4)).append("\n");
    sb.append("    userZone5: ").append(toIndentedString(userZone5)).append("\n");
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
