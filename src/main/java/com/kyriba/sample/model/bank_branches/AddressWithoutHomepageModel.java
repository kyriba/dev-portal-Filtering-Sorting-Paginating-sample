/*
 * Bank branches
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kyriba.sample.model.bank_branches;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kyriba.sample.model.ReferenceModel;

import java.util.Objects;

/**
 * Address without homepage
 */
@ApiModel(description = "Address without homepage")
public class AddressWithoutHomepageModel {
  @SerializedName("city")
  private String city = null;

  @SerializedName("country")
  private ReferenceModel country = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("street1")
  private String street1 = null;

  @SerializedName("street2")
  private String street2 = null;

  @SerializedName("zipCode")
  private String zipCode = null;

  public AddressWithoutHomepageModel city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City.
   * @return city
  **/
  @ApiModelProperty(example = "San Diego", value = "City.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressWithoutHomepageModel country(ReferenceModel country) {
    this.country = country;
    return this;
  }

   /**
   * Country. Passed as either a UUID or Code.
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country. Passed as either a UUID or Code.")
  public ReferenceModel getCountry() {
    return country;
  }

  public void setCountry(ReferenceModel country) {
    this.country = country;
  }

  public AddressWithoutHomepageModel state(String state) {
    this.state = state;
    return this;
  }

   /**
   * State.
   * @return state
  **/
  @ApiModelProperty(example = "CA", value = "State.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public AddressWithoutHomepageModel street1(String street1) {
    this.street1 = street1;
    return this;
  }

   /**
   * Street 1.
   * @return street1
  **/
  @ApiModelProperty(example = "4435 Eastgate Mall", value = "Street 1.")
  public String getStreet1() {
    return street1;
  }

  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  public AddressWithoutHomepageModel street2(String street2) {
    this.street2 = street2;
    return this;
  }

   /**
   * Street 2.
   * @return street2
  **/
  @ApiModelProperty(example = "Suite 200", value = "Street 2.")
  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public AddressWithoutHomepageModel zipCode(String zipCode) {
    this.zipCode = zipCode;
    return this;
  }

   /**
   * ZIP code. Note: the max field length depends on the Country setup. The default value is 10c but a smaller value may be defined in your Country setup.
   * @return zipCode
  **/
  @ApiModelProperty(example = "92121", value = "ZIP code. Note: the max field length depends on the Country setup. The default value is 10c but a smaller value may be defined in your Country setup.")
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressWithoutHomepageModel addressWithoutHomepageModel = (AddressWithoutHomepageModel) o;
    return Objects.equals(this.city, addressWithoutHomepageModel.city) &&
        Objects.equals(this.country, addressWithoutHomepageModel.country) &&
        Objects.equals(this.state, addressWithoutHomepageModel.state) &&
        Objects.equals(this.street1, addressWithoutHomepageModel.street1) &&
        Objects.equals(this.street2, addressWithoutHomepageModel.street2) &&
        Objects.equals(this.zipCode, addressWithoutHomepageModel.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, state, street1, street2, zipCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressWithoutHomepageModel {\n");

    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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

