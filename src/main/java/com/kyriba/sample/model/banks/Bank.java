package com.kyriba.sample.model.banks;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.kyriba.sample.model.AmountModel_;
import com.kyriba.sample.model.ReferenceModel;
import com.kyriba.sample.model.UserZones;
import com.kyriba.sample.model.accounts.AccountSearchModel;
import com.kyriba.sample.model.bank_branches.AddressModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

@ApiModel(description = "Bank.")
public class Bank {
    @SerializedName(value = "address")
    private AddressModel address = null;

    @SerializedName(value = "bic")
    private String bic	= null;

    @SerializedName(value = "cashExposureLimit")
    private AmountModel_ cashExposureLimit = null;

    @SerializedName(value = "cashExposureLimitPercentage")
     private double cashExposureLimitPercentage = 0;

    @SerializedName(value = "code")
    private String code = null;

    @SerializedName(value = "contact")
    private String contact = null;

    @SerializedName(value = "counterPartyInfo")
    private	boolean counterPartyInfo = false;

    @SerializedName(value = "dealIdentifier")
    private String dealIdentifier = null;

    @SerializedName(value = "defaultGroup")
    private ReferenceModel defaultGroup = null;

    @SerializedName(value = "description1")
    private  String description1 = null;

    @SerializedName(value = "description2")
    private  String description2 = null;

    @SerializedName(value = "externalCode")
    private String externalCode = null;

    @SerializedName(value = "fxConfirmationMethod")
    private ConfirmationMethodEnum fxConfirmationMethod = null;

    @SerializedName(value = "intercompany")
    private boolean intercompany = false;

    @SerializedName(value = "interfaceCode")
    private String interfaceCode = null;

    @SerializedName(value = "intermediaryInfo")
    private boolean intermediaryInfo = false;

    @SerializedName(value = "internalCounterparty")
    private boolean internalCounterparty = false;

    @SerializedName(value = "lei")
    private String lei = null;

    /**
     * LoanConfirmationMethod.
     */
    @JsonAdapter(Bank.ConfirmationMethodEnum.Adapter.class)
    public enum ConfirmationMethodEnum {
        NONE("NONE"),
        PAPER("PAPER"),
        ELECTRONIC("ELECTRONIC");

        private String value;

        ConfirmationMethodEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static Bank.ConfirmationMethodEnum fromValue(String text) {
            for (Bank.ConfirmationMethodEnum b : Bank.ConfirmationMethodEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<Bank.ConfirmationMethodEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final Bank.ConfirmationMethodEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public Bank.ConfirmationMethodEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return Bank.ConfirmationMethodEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName(value = "loanConfirmationMethod")
    private ConfirmationMethodEnum loanConfirmationMethod = null;

    @SerializedName(value = "netDebitAndCreditExposure")
    private boolean netDebitAndCreditExposure = false;

    @SerializedName(value = "netSettlements")
    private boolean netSettlements = false;

    @SerializedName(value = "parentCounterparty")
    private  ReferenceModel parentCounterparty = null;

    @SerializedName(value = "riskTier")
    private  ReferenceModel riskTier = null;

    @SerializedName(value = "thirdParty")
    private  ReferenceModel thirdParty = null;

    @SerializedName(value = "urlAddress")
    private String urlAddress = null;

    @SerializedName(value = "userZones")
    private UserZones userZones = null;

    @SerializedName(value = "uuid")
    private String uuid = null;

    public Bank address(AddressModel address) {
        this.address = address;
        return this;
    }

    /**
     * Bank address.
     * @return address
     **/
    @ApiModelProperty(required = true, value = "Bank address.")
    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public Bank bic(String bic) {
        this.bic = bic;
        return this;
    }

    /**
     * Bank identifier code.
     * @return bic
     **/
    @ApiModelProperty(value = "Bank identifier code.")
    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public Bank cashExposureLimit(AmountModel_ cashExposureLimit) {
        this.cashExposureLimit = cashExposureLimit;
        return this;
    }

    /**
     * Bank cashExposureLimit.
     * @return cashExposureLimit
     **/
    @ApiModelProperty(value = "Bank cashExposureLimit")
    public AmountModel_ getCashExposureLimit() {
        return cashExposureLimit;
    }

    public void setCashExposureLimit(AmountModel_ cashExposureLimit) {
        this.cashExposureLimit = cashExposureLimit;
    }

    public Bank cashExposureLimitPercentage(double cashExposureLimitPercentage) {
        this.cashExposureLimitPercentage = cashExposureLimitPercentage;
        return this;
    }

    /**
     * Cash exposure limit percentage.
     * @return cashExposureLimitPercentage
     **/
    @ApiModelProperty(example = "1.123456", value = "Cash exposure limit percentage.")
    public double getCashExposureLimitPercentage() {
        return cashExposureLimitPercentage;
    }

    public void setCashExposureLimitPercentage(double cashExposureLimitPercentage) {
        this.cashExposureLimitPercentage = cashExposureLimitPercentage;
    }

    public Bank code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Code that represents the bank.
     * @return code
     **/
    @ApiModelProperty(example = "BANK001", required = true, value = "Code that represents the bank.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Bank contact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Contact of the bank.
     * @return contact
     **/
    @ApiModelProperty(example = "contact", value = "Contact of the bank.")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Bank counterPartyInfo(boolean counterPartyInfo) {
        this.counterPartyInfo = counterPartyInfo;
        return this;
    }

    /**
     * Flag to select banks with Counterparty info (true) or without Counterparty info (false).
     * @return counterPartyInfo
     **/
    @ApiModelProperty(example = "true", value = "Flag to select banks with Counterparty info (true) or without Counterparty info (false).")
    public boolean isCounterPartyInfo() {
        return counterPartyInfo;
    }

    public void setCounterPartyInfo(boolean counterPartyInfo) {
        this.counterPartyInfo = counterPartyInfo;
    }

    public Bank dealIdentifier(String dealIdentifier) {
        this.dealIdentifier = dealIdentifier;
        return this;
    }

    /**
     * Bank's Deal identifier.
     * @return dealIdentifier
     **/
    @ApiModelProperty(example = "Deal identifier", value = "Bank's Deal identifier.")
    public String getDealIdentifier() {
        return dealIdentifier;
    }

    public void setDealIdentifier(String dealIdentifier) {
        this.dealIdentifier = dealIdentifier;
    }

    public Bank defaultGroup(ReferenceModel defaultGroup) {
        this.defaultGroup = defaultGroup;
        return this;
    }

    /**
     * Bank's defaultGroup.
     * @return defaultGroup
     **/
    @ApiModelProperty(value = "Bank's defaultGroup.")
    public ReferenceModel getDefaultGroup() {
        return defaultGroup;
    }

    public void setDefaultGroup(ReferenceModel defaultGroup) {
        this.defaultGroup = defaultGroup;
    }

    public Bank description1(String description1) {
        this.description1 = description1;
        return this;
    }

    /**
     * Name of the bank.
     * @return description1
     **/
    @ApiModelProperty(example = "Bank description", value = "Name of the bank.")
    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public Bank description2(String description2) {
        this.description2 = description2;
        return this;
    }

    /**
     * Other name of the bank.
     * @return description2
     **/
    @ApiModelProperty(example = "Bank description2", value = "Other name of the bank.")
    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public Bank externalCode(String externalCode) {
        this.externalCode = externalCode;
        return this;
    }

    /**
     * Bank's External code.
     * @return externalCode
     **/
    @ApiModelProperty(example = "External code", value = "Bank's External code.")
    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public Bank fxConfirmationMethod(ConfirmationMethodEnum fxConfirmationMethod) {
        this.fxConfirmationMethod = fxConfirmationMethod;
        return this;
    }

    /**
     * FX confirmation method.
     * @return fxConfirmationMethod
     **/
    @ApiModelProperty(example = "ELECTRONIC", value = "FX confirmation method.")
    public ConfirmationMethodEnum getFxConfirmationMethod() {
        return fxConfirmationMethod;
    }

    public void setFxConfirmationMethod(ConfirmationMethodEnum fxConfirmationMethod) {
        this.fxConfirmationMethod = fxConfirmationMethod;
    }

    public Bank intercompany(boolean intercompany) {
        this.intercompany = intercompany;
        return this;
    }

    /**
     * Flag to select Intercompany (true) or non-Intercompany (false) banks.
     * @return intercompany
     **/
    @ApiModelProperty(example = "true", value = "Flag to select Intercompany (true) or non-Intercompany (false) banks.")
    public boolean isIntercompany() {
        return intercompany;
    }

    public void setIntercompany(boolean intercompany) {
        this.intercompany = intercompany;
    }

    public Bank interfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    /**
     * Code, using Latin characters only, that represents the bank and that is used in the interfaces that only support Latin characters (example: in some bank connectivity configurations).
     * @return interfaceCode
     **/
    @ApiModelProperty(example = "BANK1", required = true, value = "Code, using Latin characters only, that represents the bank and that is used in the interfaces that only support Latin characters (example: in some bank connectivity configurations).")
    public String getInterfaceCode() {
        return interfaceCode;
    }

    public void setInterfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
    }

    public Bank intermediaryInfo(boolean intermediaryInfo) {
        this.intermediaryInfo = intermediaryInfo;
        return this;
    }

    /**
     * Flag to select banks with Intermediary info (true) or without Intermediary info (false).
     * @return intermediaryInfo
     **/
    @ApiModelProperty(example = "true", value = "Flag to select banks with Intermediary info (true) or without Intermediary info (false).")
    public boolean isIntermediaryInfo() {
        return intermediaryInfo;
    }

    public void setIntermediaryInfo(boolean intermediaryInfo) {
        this.intermediaryInfo = intermediaryInfo;
    }

    public Bank internalCounterparty(boolean internalCounterparty) {
        this.internalCounterparty = internalCounterparty;
        return this;
    }

    /**
     * Is internal counter party.
     * @return internalCounterparty
     **/
    @ApiModelProperty(example = "true", value = "Is internal counter party.")
    public boolean isInternalCounterparty() {
        return internalCounterparty;
    }

    public void setInternalCounterparty(boolean internalCounterparty) {
        this.internalCounterparty = internalCounterparty;
    }

    public Bank lei(String lei) {
        this.lei = lei;
        return this;
    }

    /**
     * Identification code for legal entities.
     * @return lei
     **/
    @ApiModelProperty(example = "5493006W6QFE1P0RU752", value = "Identification code for legal entities.")
    public String getLei() {
        return lei;
    }

    public void setLei(String lei) {
        this.lei = lei;
    }

    public Bank loanConfirmationMethod(ConfirmationMethodEnum loanConfirmationMethod) {
        this.loanConfirmationMethod = loanConfirmationMethod;
        return this;
    }

    /**
     * Loan confirmation method.
     * @return lei
     **/
    @ApiModelProperty(value = "Loan confirmation method.")
    public ConfirmationMethodEnum getLoanConfirmationMethod() {
        return loanConfirmationMethod;
    }

    public void setLoanConfirmationMethod(ConfirmationMethodEnum loanConfirmationMethod) {
        this.loanConfirmationMethod = loanConfirmationMethod;
    }

    public Bank netDebitAndCreditExposure(boolean netDebitAndCreditExposure) {
        this.netDebitAndCreditExposure = netDebitAndCreditExposure;
        return this;
    }

    /**
     * Flag to select NetDebitAndCreditExposure (true) or non-NetDebitAndCreditExposure (false) banks.
     * @return netDebitAndCreditExposure
     **/
    @ApiModelProperty(example = "true", value = "Flag to select NetDebitAndCreditExposure (true) or non-NetDebitAndCreditExposure (false) banks.")
    public boolean isNetDebitAndCreditExposure() {
        return netDebitAndCreditExposure;
    }

    public void setNetDebitAndCreditExposure(boolean netDebitAndCreditExposure) {
        this.netDebitAndCreditExposure = netDebitAndCreditExposure;
    }

    public Bank netSettlements(boolean netSettlements) {
        this.netSettlements = netSettlements;
        return this;
    }

    /**
     * Flag to select NetSettlements (true) or non-NetSettlements (false) banks.
     * @return netSettlements
     **/
    @ApiModelProperty(example = "true", value = "Flag to select NetSettlements (true) or non-NetSettlements (false) banks.")
    public boolean isNetSettlements() {
        return netSettlements;
    }

    public void setNetSettlements(boolean netSettlements) {
        this.netSettlements = netSettlements;
    }

    public Bank parentCounterparty(ReferenceModel parentCounterparty) {
        this.parentCounterparty = parentCounterparty;
        return this;
    }

    /**
     * Bank's parentCounterparty.
     * @return parentCounterparty
     **/
    @ApiModelProperty(value = "Bank's parentCounterparty.")
    public ReferenceModel getParentCounterparty() {
        return parentCounterparty;
    }

    public void setParentCounterparty(ReferenceModel parentCounterparty) {
        this.parentCounterparty = parentCounterparty;
    }

    public Bank riskTier(ReferenceModel riskTier) {
        this.riskTier = riskTier;
        return this;
    }

    /**
     * Bank's riskTier.
     * @return riskTier
     **/
    @ApiModelProperty(value = "Bank's riskTier.")
    public ReferenceModel getRiskTier() {
        return riskTier;
    }

    public void setRiskTier(ReferenceModel riskTier) {
        this.riskTier = riskTier;
    }

    public Bank thirdParty(ReferenceModel thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }

    /**
     * Bank's thirdParty.
     * @return thirdParty
     **/
    @ApiModelProperty(value = "Bank's thirdParty.")
    public ReferenceModel getThirdParty() {
        return thirdParty;
    }

    public void setThirdParty(ReferenceModel thirdParty) {
        this.thirdParty = thirdParty;
    }

    public Bank urlAddress(String urlAddress) {
        this.urlAddress = urlAddress;
        return this;
    }

    /**
     * URL address of the bank.
     * @return urlAddress
     **/
    @ApiModelProperty(example = "www.mycompany.com", value = "URL address of the bank.")
    public String getUrlAddress() {
        return urlAddress;
    }

    public void setUrlAddress(String urlAddress) {
        this.urlAddress = urlAddress;
    }

    public Bank userZones(UserZones userZones) {
        this.userZones = userZones;
        return this;
    }

    /**
     * URL address of the bank.
     * @return userZones
     **/
    @ApiModelProperty( value = "User Zone")
    public UserZones getUserZones() {
        return userZones;
    }

    public void setUserZones(UserZones userZones) {
        this.userZones = userZones;
    }

    public Bank uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Unique internal identifier that represents the bank.
     * @return uuid
     **/
    @ApiModelProperty(example = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx", required = true, value = "Unique internal identifier that represents the bank.")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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
