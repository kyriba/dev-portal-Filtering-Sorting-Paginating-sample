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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.kyriba.sample.model.ReferenceModel;
import java.io.IOException;

/**
 * Account Id.
 */
@ApiModel(description = "Account Id.")
public class AccountIdModel {
  /**
   * Type of the BAN. Default &#x3D; LBAN_1_STRUCTURE
   */
  @JsonAdapter(BanStructureEnum.Adapter.class)
  public enum BanStructureEnum {
    BBAN_STRUCTURE("BBAN_STRUCTURE"),
    
    IBAN_STRUCTURE("IBAN_STRUCTURE"),
    
    LBAN_0_STRUCTURE("LBAN_0_STRUCTURE"),
    
    LBAN_1_STRUCTURE("LBAN_1_STRUCTURE"),
    
    LBAN_2_STRUCTURE("LBAN_2_STRUCTURE"),
    
    LBAN_3_STRUCTURE("LBAN_3_STRUCTURE"),
    
    LBAN_4_STRUCTURE("LBAN_4_STRUCTURE"),
    
    LBAN_5_STRUCTURE("LBAN_5_STRUCTURE"),
    
    LBAN_6_STRUCTURE("LBAN_6_STRUCTURE"),
    
    LBAN_7_STRUCTURE("LBAN_7_STRUCTURE"),
    
    LBAN_8_STRUCTURE("LBAN_8_STRUCTURE"),
    
    LBAN_9_STRUCTURE("LBAN_9_STRUCTURE");

    private String value;

    BanStructureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BanStructureEnum fromValue(String text) {
      for (BanStructureEnum b : BanStructureEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BanStructureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BanStructureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BanStructureEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BanStructureEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("banStructure")
  private BanStructureEnum banStructure = null;

  @SerializedName("value")
  private String value = null;

  /**
   * Account nature. Default &#x3D; CURRENT_ACCOUNT
   */
  @JsonAdapter(AccountNatureEnum.Adapter.class)
  public enum AccountNatureEnum {
    CURRENT_ACCOUNT("CURRENT_ACCOUNT"),
    
    SAVINGS_ACCOUNT("SAVINGS_ACCOUNT"),
    
    INVESTMENT_ACCOUNT("INVESTMENT_ACCOUNT"),
    
    CUSTODY_ACCOUNT("CUSTODY_ACCOUNT"),
    
    OTHER("OTHER");

    private String value;

    AccountNatureEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountNatureEnum fromValue(String text) {
      for (AccountNatureEnum b : AccountNatureEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccountNatureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountNatureEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountNatureEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccountNatureEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accountNature")
  private AccountNatureEnum accountNature = null;

  @SerializedName("statementIdentifier")
  private String statementIdentifier = null;

  @SerializedName("feeStatementIdentifier")
  private String feeStatementIdentifier = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Reporting filter type. Default &#x3D; KEY_1
   */
  @JsonAdapter(ReportingFilterTypeEnum.Adapter.class)
  public enum ReportingFilterTypeEnum {
    _1("KEY_1"),
    
    _2("KEY_2"),
    
    _3("KEY_3"),
    
    _4("KEY_4"),
    
    _5("KEY_5");

    private String value;

    ReportingFilterTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReportingFilterTypeEnum fromValue(String text) {
      for (ReportingFilterTypeEnum b : ReportingFilterTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReportingFilterTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReportingFilterTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReportingFilterTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReportingFilterTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reportingFilterType")
  private ReportingFilterTypeEnum reportingFilterType = null;

  @SerializedName("establishment")
  private ReferenceModel establishment = null;

  public AccountIdModel banStructure(BanStructureEnum banStructure) {
    this.banStructure = banStructure;
    return this;
  }

   /**
   * Type of the BAN. Default &#x3D; LBAN_1_STRUCTURE
   * @return banStructure
  **/
  @ApiModelProperty(example = "BBAN_STRUCTURE", value = "Type of the BAN. Default = LBAN_1_STRUCTURE")
  public BanStructureEnum getBanStructure() {
    return banStructure;
  }

  public void setBanStructure(BanStructureEnum banStructure) {
    this.banStructure = banStructure;
  }

  public AccountIdModel value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Account Id value. Account Id length depends on country. IBAN value should include country code and control key.
   * @return value
  **/
  @ApiModelProperty(example = "BF1030134020015400945000643", required = true, value = "Account Id value. Account Id length depends on country. IBAN value should include country code and control key.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public AccountIdModel accountNature(AccountNatureEnum accountNature) {
    this.accountNature = accountNature;
    return this;
  }

   /**
   * Account nature. Default &#x3D; CURRENT_ACCOUNT
   * @return accountNature
  **/
  @ApiModelProperty(example = "CURRENT_ACCOUNT", value = "Account nature. Default = CURRENT_ACCOUNT")
  public AccountNatureEnum getAccountNature() {
    return accountNature;
  }

  public void setAccountNature(AccountNatureEnum accountNature) {
    this.accountNature = accountNature;
  }

  public AccountIdModel statementIdentifier(String statementIdentifier) {
    this.statementIdentifier = statementIdentifier;
    return this;
  }

   /**
   * Statement identifier.
   * @return statementIdentifier
  **/
  @ApiModelProperty(example = "Statement identifier", value = "Statement identifier.")
  public String getStatementIdentifier() {
    return statementIdentifier;
  }

  public void setStatementIdentifier(String statementIdentifier) {
    this.statementIdentifier = statementIdentifier;
  }

  public AccountIdModel feeStatementIdentifier(String feeStatementIdentifier) {
    this.feeStatementIdentifier = feeStatementIdentifier;
    return this;
  }

   /**
   * Fee statement identifier.
   * @return feeStatementIdentifier
  **/
  @ApiModelProperty(example = "Fee statement identifier", value = "Fee statement identifier.")
  public String getFeeStatementIdentifier() {
    return feeStatementIdentifier;
  }

  public void setFeeStatementIdentifier(String feeStatementIdentifier) {
    this.feeStatementIdentifier = feeStatementIdentifier;
  }

  public AccountIdModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Account Id description.
   * @return description
  **/
  @ApiModelProperty(example = "Account Id description", value = "Account Id description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccountIdModel reportingFilterType(ReportingFilterTypeEnum reportingFilterType) {
    this.reportingFilterType = reportingFilterType;
    return this;
  }

   /**
   * Reporting filter type. Default &#x3D; KEY_1
   * @return reportingFilterType
  **/
  @ApiModelProperty(example = "KEY_1", value = "Reporting filter type. Default = KEY_1")
  public ReportingFilterTypeEnum getReportingFilterType() {
    return reportingFilterType;
  }

  public void setReportingFilterType(ReportingFilterTypeEnum reportingFilterType) {
    this.reportingFilterType = reportingFilterType;
  }

  public AccountIdModel establishment(ReferenceModel establishment) {
    this.establishment = establishment;
    return this;
  }

   /**
   * Establishment.
   * @return establishment
  **/
  @ApiModelProperty(value = "Establishment.")
  public ReferenceModel getEstablishment() {
    return establishment;
  }

  public void setEstablishment(ReferenceModel establishment) {
    this.establishment = establishment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountIdModel accountIdModel = (AccountIdModel) o;
    return Objects.equals(this.banStructure, accountIdModel.banStructure) &&
        Objects.equals(this.value, accountIdModel.value) &&
        Objects.equals(this.accountNature, accountIdModel.accountNature) &&
        Objects.equals(this.statementIdentifier, accountIdModel.statementIdentifier) &&
        Objects.equals(this.feeStatementIdentifier, accountIdModel.feeStatementIdentifier) &&
        Objects.equals(this.description, accountIdModel.description) &&
        Objects.equals(this.reportingFilterType, accountIdModel.reportingFilterType) &&
        Objects.equals(this.establishment, accountIdModel.establishment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(banStructure, value, accountNature, statementIdentifier, feeStatementIdentifier, description, reportingFilterType, establishment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountIdModel {\n");
    
    sb.append("    banStructure: ").append(toIndentedString(banStructure)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    accountNature: ").append(toIndentedString(accountNature)).append("\n");
    sb.append("    statementIdentifier: ").append(toIndentedString(statementIdentifier)).append("\n");
    sb.append("    feeStatementIdentifier: ").append(toIndentedString(feeStatementIdentifier)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reportingFilterType: ").append(toIndentedString(reportingFilterType)).append("\n");
    sb.append("    establishment: ").append(toIndentedString(establishment)).append("\n");
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

