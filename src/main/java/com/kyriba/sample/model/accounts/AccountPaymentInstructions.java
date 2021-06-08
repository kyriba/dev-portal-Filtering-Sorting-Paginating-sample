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


package com.kyriba.sample.model.accounts;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kyriba.sample.model.ReferenceModel;

/**
 * Account payment instructions.
 */
@ApiModel(description = "Account payment instructions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-05-13T11:35:10.236Z")
public class AccountPaymentInstructions {
  @SerializedName("mainCorrespondentBankBranch")
  private ReferenceModel mainCorrespondentBankBranch = null;

  @SerializedName("mainOneTimeCorrespondent")
  private AccountCorrespondent mainOneTimeCorrespondent = null;

  @SerializedName("additionalCorrespondentBankBranch")
  private ReferenceModel additionalCorrespondentBankBranch = null;

  @SerializedName("additionalOneTimeCorrespondent")
  private AccountCorrespondent additionalOneTimeCorrespondent = null;

  @SerializedName("defaultReason1")
  private String defaultReason1 = null;

  @SerializedName("defaultReason2")
  private String defaultReason2 = null;

  @SerializedName("defaultReason3")
  private String defaultReason3 = null;

  @SerializedName("defaultReason4")
  private String defaultReason4 = null;

  @SerializedName("ffc1")
  private String ffc1 = null;

  @SerializedName("ffc2")
  private String ffc2 = null;

  @SerializedName("ffc3")
  private String ffc3 = null;

  @SerializedName("ffc4")
  private String ffc4 = null;

  public AccountPaymentInstructions mainCorrespondentBankBranch(ReferenceModel mainCorrespondentBankBranch) {
    this.mainCorrespondentBankBranch = mainCorrespondentBankBranch;
    return this;
  }

   /**
   * Main correspondent branch.
   * @return mainCorrespondentBankBranch
  **/
  @ApiModelProperty(value = "Main correspondent branch.")
  public ReferenceModel getMainCorrespondentBankBranch() {
    return mainCorrespondentBankBranch;
  }

  public void setMainCorrespondentBankBranch(ReferenceModel mainCorrespondentBankBranch) {
    this.mainCorrespondentBankBranch = mainCorrespondentBankBranch;
  }

  public AccountPaymentInstructions mainOneTimeCorrespondent(AccountCorrespondent mainOneTimeCorrespondent) {
    this.mainOneTimeCorrespondent = mainOneTimeCorrespondent;
    return this;
  }

   /**
   * Main One time correspondent.
   * @return mainOneTimeCorrespondent
  **/
  @ApiModelProperty(value = "Main One time correspondent.")
  public AccountCorrespondent getMainOneTimeCorrespondent() {
    return mainOneTimeCorrespondent;
  }

  public void setMainOneTimeCorrespondent(AccountCorrespondent mainOneTimeCorrespondent) {
    this.mainOneTimeCorrespondent = mainOneTimeCorrespondent;
  }

  public AccountPaymentInstructions additionalCorrespondentBankBranch(ReferenceModel additionalCorrespondentBankBranch) {
    this.additionalCorrespondentBankBranch = additionalCorrespondentBankBranch;
    return this;
  }

   /**
   * Additional correspondent branch.
   * @return additionalCorrespondentBankBranch
  **/
  @ApiModelProperty(value = "Additional correspondent branch.")
  public ReferenceModel getAdditionalCorrespondentBankBranch() {
    return additionalCorrespondentBankBranch;
  }

  public void setAdditionalCorrespondentBankBranch(ReferenceModel additionalCorrespondentBankBranch) {
    this.additionalCorrespondentBankBranch = additionalCorrespondentBankBranch;
  }

  public AccountPaymentInstructions additionalOneTimeCorrespondent(AccountCorrespondent additionalOneTimeCorrespondent) {
    this.additionalOneTimeCorrespondent = additionalOneTimeCorrespondent;
    return this;
  }

   /**
   * Additional One time correspondent.
   * @return additionalOneTimeCorrespondent
  **/
  @ApiModelProperty(value = "Additional One time correspondent.")
  public AccountCorrespondent getAdditionalOneTimeCorrespondent() {
    return additionalOneTimeCorrespondent;
  }

  public void setAdditionalOneTimeCorrespondent(AccountCorrespondent additionalOneTimeCorrespondent) {
    this.additionalOneTimeCorrespondent = additionalOneTimeCorrespondent;
  }

  public AccountPaymentInstructions defaultReason1(String defaultReason1) {
    this.defaultReason1 = defaultReason1;
    return this;
  }

   /**
   * Default Payment Reason instructions 1.
   * @return defaultReason1
  **/
  @ApiModelProperty(value = "Default Payment Reason instructions 1.")
  public String getDefaultReason1() {
    return defaultReason1;
  }

  public void setDefaultReason1(String defaultReason1) {
    this.defaultReason1 = defaultReason1;
  }

  public AccountPaymentInstructions defaultReason2(String defaultReason2) {
    this.defaultReason2 = defaultReason2;
    return this;
  }

   /**
   * Default Payment Reason instructions 2.
   * @return defaultReason2
  **/
  @ApiModelProperty(value = "Default Payment Reason instructions 2.")
  public String getDefaultReason2() {
    return defaultReason2;
  }

  public void setDefaultReason2(String defaultReason2) {
    this.defaultReason2 = defaultReason2;
  }

  public AccountPaymentInstructions defaultReason3(String defaultReason3) {
    this.defaultReason3 = defaultReason3;
    return this;
  }

   /**
   * Default Payment Reason instructions 3.
   * @return defaultReason3
  **/
  @ApiModelProperty(value = "Default Payment Reason instructions 3.")
  public String getDefaultReason3() {
    return defaultReason3;
  }

  public void setDefaultReason3(String defaultReason3) {
    this.defaultReason3 = defaultReason3;
  }

  public AccountPaymentInstructions defaultReason4(String defaultReason4) {
    this.defaultReason4 = defaultReason4;
    return this;
  }

   /**
   * Default Payment Reason instructions 4.
   * @return defaultReason4
  **/
  @ApiModelProperty(value = "Default Payment Reason instructions 4.")
  public String getDefaultReason4() {
    return defaultReason4;
  }

  public void setDefaultReason4(String defaultReason4) {
    this.defaultReason4 = defaultReason4;
  }

  public AccountPaymentInstructions ffc1(String ffc1) {
    this.ffc1 = ffc1;
    return this;
  }

   /**
   * For further credit instructions 1.
   * @return ffc1
  **/
  @ApiModelProperty(value = "For further credit instructions 1.")
  public String getFfc1() {
    return ffc1;
  }

  public void setFfc1(String ffc1) {
    this.ffc1 = ffc1;
  }

  public AccountPaymentInstructions ffc2(String ffc2) {
    this.ffc2 = ffc2;
    return this;
  }

   /**
   * For further credit instructions 2.
   * @return ffc2
  **/
  @ApiModelProperty(value = "For further credit instructions 2.")
  public String getFfc2() {
    return ffc2;
  }

  public void setFfc2(String ffc2) {
    this.ffc2 = ffc2;
  }

  public AccountPaymentInstructions ffc3(String ffc3) {
    this.ffc3 = ffc3;
    return this;
  }

   /**
   * For further credit instructions 3.
   * @return ffc3
  **/
  @ApiModelProperty(value = "For further credit instructions 3.")
  public String getFfc3() {
    return ffc3;
  }

  public void setFfc3(String ffc3) {
    this.ffc3 = ffc3;
  }

  public AccountPaymentInstructions ffc4(String ffc4) {
    this.ffc4 = ffc4;
    return this;
  }

   /**
   * For further credit instructions 4.
   * @return ffc4
  **/
  @ApiModelProperty(value = "For further credit instructions 4.")
  public String getFfc4() {
    return ffc4;
  }

  public void setFfc4(String ffc4) {
    this.ffc4 = ffc4;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPaymentInstructions accountPaymentInstructions = (AccountPaymentInstructions) o;
    return Objects.equals(this.mainCorrespondentBankBranch, accountPaymentInstructions.mainCorrespondentBankBranch) &&
        Objects.equals(this.mainOneTimeCorrespondent, accountPaymentInstructions.mainOneTimeCorrespondent) &&
        Objects.equals(this.additionalCorrespondentBankBranch, accountPaymentInstructions.additionalCorrespondentBankBranch) &&
        Objects.equals(this.additionalOneTimeCorrespondent, accountPaymentInstructions.additionalOneTimeCorrespondent) &&
        Objects.equals(this.defaultReason1, accountPaymentInstructions.defaultReason1) &&
        Objects.equals(this.defaultReason2, accountPaymentInstructions.defaultReason2) &&
        Objects.equals(this.defaultReason3, accountPaymentInstructions.defaultReason3) &&
        Objects.equals(this.defaultReason4, accountPaymentInstructions.defaultReason4) &&
        Objects.equals(this.ffc1, accountPaymentInstructions.ffc1) &&
        Objects.equals(this.ffc2, accountPaymentInstructions.ffc2) &&
        Objects.equals(this.ffc3, accountPaymentInstructions.ffc3) &&
        Objects.equals(this.ffc4, accountPaymentInstructions.ffc4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainCorrespondentBankBranch, mainOneTimeCorrespondent, additionalCorrespondentBankBranch, additionalOneTimeCorrespondent, defaultReason1, defaultReason2, defaultReason3, defaultReason4, ffc1, ffc2, ffc3, ffc4);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPaymentInstructions {\n");
    
    sb.append("    mainCorrespondentBankBranch: ").append(toIndentedString(mainCorrespondentBankBranch)).append("\n");
    sb.append("    mainOneTimeCorrespondent: ").append(toIndentedString(mainOneTimeCorrespondent)).append("\n");
    sb.append("    additionalCorrespondentBankBranch: ").append(toIndentedString(additionalCorrespondentBankBranch)).append("\n");
    sb.append("    additionalOneTimeCorrespondent: ").append(toIndentedString(additionalOneTimeCorrespondent)).append("\n");
    sb.append("    defaultReason1: ").append(toIndentedString(defaultReason1)).append("\n");
    sb.append("    defaultReason2: ").append(toIndentedString(defaultReason2)).append("\n");
    sb.append("    defaultReason3: ").append(toIndentedString(defaultReason3)).append("\n");
    sb.append("    defaultReason4: ").append(toIndentedString(defaultReason4)).append("\n");
    sb.append("    ffc1: ").append(toIndentedString(ffc1)).append("\n");
    sb.append("    ffc2: ").append(toIndentedString(ffc2)).append("\n");
    sb.append("    ffc3: ").append(toIndentedString(ffc3)).append("\n");
    sb.append("    ffc4: ").append(toIndentedString(ffc4)).append("\n");
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
