package com.kyriba.sample.model.banks;

import com.google.gson.annotations.SerializedName;
import com.kyriba.sample.annotation.SearchModel;
import com.kyriba.sample.model.ReferenceModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@SearchModel
@ApiModel(value = "Bank")
public class BankSearchModel {
    @SerializedName(value = "uuid")
    private String uuid = null;

    @SerializedName(value = "code")
    private String code = null;

    @SerializedName(value = "interfaceCode")
    private String interfaceCode = null;

    @SerializedName(value = "description")
    private String description = null;

    @SerializedName(value = "defaultGroup")
    private ReferenceModel defaultGroup = null;

    @SerializedName(value = "intercompany")
    private boolean intercompany = false;

    @SerializedName(value = "intermediaryInfo")
    private boolean intermediaryInfo = false;

    @SerializedName(value = "counterPartyInfo")
    private boolean counterPartyInfo = false;

    @SerializedName(value = "contact")
    private String contact = null;

    @SerializedName(value = "thirdParty")
    private ReferenceModel thirdParty = null;

    @SerializedName(value = "netSettlements")
    private boolean netSettlements = false;

    @SerializedName(value = "riskTier")
    private ReferenceModel riskTier = null;

    @SerializedName(value = "netDebitAndCreditExposure")
    private boolean netDebitAndCreditExposure = false;

    @SerializedName(value = "parentCounterparty")
    private ReferenceModel parentCounterparty = null;

    @SerializedName(value = "internalCounterparty")
    private boolean internalCounterparty = false;

    @SerializedName(value = "externalCode")
    private String externalCode = null;

    @SerializedName(value = "attachments")
    private boolean attachments = false;

    @SerializedName(value = "dealIdentifier")
    private String dealIdentifier = null;

    @SerializedName(value = "countryCode")
    private String countryCode = null;

    @SerializedName(value = "lastUpdateDate")
    private String lastUpdateDate = null;

    public BankSearchModel attachments(boolean attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * Flag to select banks with Attachments (true) or without Attachments info (false).
     *
     * @return attachments
     **/
    @ApiModelProperty(example = "true", value = "Flag to select banks with Attachments (true) or without Attachments info (false).")
    public boolean isAttachments() {
        return attachments;
    }

    public void setAttachments(boolean attachments) {
        this.attachments = attachments;
    }

    public BankSearchModel code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Bank's Code.
     *
     * @return code
     **/
    @ApiModelProperty(example = "CODE01", required = true, value = "Bank's Code.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BankSearchModel contact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Bank's Contact.
     *
     * @return contact
     **/
    @ApiModelProperty(value = "Bank's Contact.")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public BankSearchModel counterPartyInfo(boolean counterPartyInfo) {
        this.counterPartyInfo = counterPartyInfo;
        return this;
    }

    /**
     * Flag to select banks with Counterparty info (true) or without Counterparty info (false).
     *
     * @return counterPartyInfo
     **/
    @ApiModelProperty(example = "true", value = "Flag to select banks with Counterparty info (true) or without Counterparty info (false).")
    public boolean isCounterPartyInfo() {
        return counterPartyInfo;
    }

    public void setCounterPartyInfo(boolean counterPartyInfo) {
        this.counterPartyInfo = counterPartyInfo;
    }

    public BankSearchModel countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Bank's Country code.
     *
     * @return countryCode
     **/
    @ApiModelProperty(example = "FR", required = true, value = "Bank's Country code.")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public BankSearchModel dealIdentifier(String dealIdentifier) {
        this.dealIdentifier = dealIdentifier;
        return this;
    }

    /**
     * Bank's Deal identifier.
     *
     * @return dealIdentifier
     **/
    @ApiModelProperty(example = "Bank's Deal identifier.", value = "Bank's Deal identifier.")
    public String getDealIdentifier() {
        return dealIdentifier;
    }

    public void setDealIdentifier(String dealIdentifier) {
        this.dealIdentifier = dealIdentifier;
    }

    public BankSearchModel defaultGroup(ReferenceModel defaultGroup) {
        this.defaultGroup = defaultGroup;
        return this;
    }

    /**
     * Bank's defaultGroup.
     *
     * @return defaultGroup
     **/
    @ApiModelProperty(value = "Bank's defaultGroup.")
    public ReferenceModel getDefaultGroup() {
        return defaultGroup;
    }

    public void setDefaultGroup(ReferenceModel defaultGroup) {
        this.defaultGroup = defaultGroup;
    }

    public BankSearchModel description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Name of the bank.
     * @return description
     **/
    @ApiModelProperty(example = "Bank description", value = "Name of the bank.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public BankSearchModel externalCode(String externalCode) {
        this.externalCode = externalCode;
        return this;
    }

    /**
     * Bank's External code.
     *
     * @return externalCode
     **/
    @ApiModelProperty(example = "CODE01", value = "Bank's External code.")
    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public BankSearchModel intercompany(boolean intercompany) {
        this.intercompany = intercompany;
        return this;
    }

    /**
     * Flag to select Intercompany (true) or non-Intercompany (false) banks.
     *
     * @return intercompany
     **/
    @ApiModelProperty(example = "true", value = "Flag to select Intercompany (true) or non-Intercompany (false) banks.")
    public boolean isIntercompany() {
        return intercompany;
    }

    public void setIntercompany(boolean intercompany) {
        this.intercompany = intercompany;
    }

    public BankSearchModel interfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    /**
     * Bank's Interface code.
     *
     * @return interfaceCode
     **/
    @ApiModelProperty(example = "CODE01", required = true, value = "Bank's Interface code.")
    public String getInterfaceCode() {
        return interfaceCode;
    }

    public void setInterfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
    }

    public BankSearchModel intermediaryInfo(boolean intermediaryInfo) {
        this.intermediaryInfo = intermediaryInfo;
        return this;
    }

    /**
     * Flag to select banks with Intermediary info (true) or without Intermediary info (false).
     *
     * @return intermediaryInfo
     **/
    @ApiModelProperty(example = "true", value = "Flag to select banks with Intermediary info (true) or without Intermediary info (false).")
    public boolean isIntermediaryInfo() {
        return intermediaryInfo;
    }

    public void setIntermediaryInfo(boolean intermediaryInfo) {
        this.intermediaryInfo = intermediaryInfo;
    }

    public BankSearchModel internalCounterparty(boolean internalCounterparty) {
        this.internalCounterparty = internalCounterparty;
        return this;
    }

    /**
     * Flag to select InternalCunterparty (true) or non-InternalCounterparty (false) banks.
     *
     * @return internalCounterparty
     **/
    @ApiModelProperty(example = "true", value = "Flag to select InternalCunterparty (true) or non-InternalCounterparty (false) banks.")
    public boolean isInternalCounterparty() {
        return internalCounterparty;
    }

    public void setInternalCounterparty(boolean internalCounterparty) {
        this.internalCounterparty = internalCounterparty;
    }

    public BankSearchModel lastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
        return this;
    }

    /**
     * Bank's Last update date.
     *
     * @return lastUpdateDate
     **/
    @ApiModelProperty(example = "2019-05-20", value = "Bank's Last update date.")
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    public BankSearchModel netDebitAndCreditExposure(boolean netDebitAndCreditExposure) {
        this.netDebitAndCreditExposure = netDebitAndCreditExposure;
        return this;
    }

    /**
     * Flag to select NetDebitAndCreditExposure (true) or non-NetDebitAndCreditExposure (false) banks.
     *
     * @return netDebitAndCreditExposure
     **/
    @ApiModelProperty(example = "true", value = "Flag to select NetDebitAndCreditExposure (true) or non-NetDebitAndCreditExposure (false) banks.")
    public boolean isNetDebitAndCreditExposure() {
        return netDebitAndCreditExposure;
    }

    public void setNetDebitAndCreditExposure(boolean netDebitAndCreditExposure) {
        this.netDebitAndCreditExposure = netDebitAndCreditExposure;
    }

    public BankSearchModel netSettlements(boolean netSettlements) {
        this.netSettlements = netSettlements;
        return this;
    }

    /**
     * Flag to select NetSettlements (true) or non-NetSettlements (false) banks.
     *
     * @return netSettlements
     **/
    @ApiModelProperty(example = "true", value = "Flag to select NetSettlements (true) or non-NetSettlements (false) banks.")
    public boolean isNetSettlements() {
        return netSettlements;
    }

    public void setNetSettlements(boolean netSettlements) {
        this.netSettlements = netSettlements;
    }

    public BankSearchModel parentCounterparty(ReferenceModel parentCounterparty) {
        this.parentCounterparty = parentCounterparty;
        return this;
    }

    /**
     * Bank's parentCounterparty.
     *
     * @return parentCounterparty
     **/
    @ApiModelProperty(value = "Bank's parentCounterparty.")
    public ReferenceModel getParentCounterparty() {
        return parentCounterparty;
    }

    public void setParentCounterparty(ReferenceModel parentCounterparty) {
        this.parentCounterparty = parentCounterparty;
    }

    public BankSearchModel riskTier(ReferenceModel riskTier) {
        this.riskTier = riskTier;
        return this;
    }

    /**
     * Bank's riskTier.
     *
     * @return riskTier
     **/
    @ApiModelProperty(value = "Bank's riskTier.")
    public ReferenceModel getRiskTier() {
        return riskTier;
    }

    public void setRiskTier(ReferenceModel riskTier) {
        this.riskTier = riskTier;
    }

    public BankSearchModel thirdParty(ReferenceModel thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }

    /**
     * Bank's thirdParty.
     *
     * @return thirdParty
     **/
    @ApiModelProperty(value = "Bank's thirdParty.")
    public ReferenceModel getThirdParty() {
        return thirdParty;
    }

    public void setThirdParty(ReferenceModel thirdParty) {
        this.thirdParty = thirdParty;
    }


    public BankSearchModel uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Unique internal identifier that represents the bank.
     *
     * @return uuid
     **/
    @ApiModelProperty(example = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx", required = true, value = "Unique internal identifier that represents the bank.")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankSearchModel)) return false;
        BankSearchModel that = (BankSearchModel) o;
        return attachments == that.attachments &&
                counterPartyInfo == that.counterPartyInfo &&
                intercompany == that.intercompany &&
                intermediaryInfo == that.intermediaryInfo &&
                internalCounterparty == that.internalCounterparty &&
                netDebitAndCreditExposure == that.netDebitAndCreditExposure &&
                netSettlements == that.netSettlements &&
                code.equals(that.code) && contact.equals(that.contact) &&
                countryCode.equals(that.countryCode) &&
                dealIdentifier.equals(that.dealIdentifier) &&
                defaultGroup.equals(that.defaultGroup) &&
                externalCode.equals(that.externalCode) &&
                interfaceCode.equals(that.interfaceCode) &&
                lastUpdateDate.equals(that.lastUpdateDate) &&
                parentCounterparty.equals(that.parentCounterparty) &&
                uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachments, code, contact, counterPartyInfo, countryCode, dealIdentifier, defaultGroup, externalCode, intercompany, interfaceCode, intermediaryInfo, internalCounterparty, lastUpdateDate, netDebitAndCreditExposure, netSettlements, parentCounterparty, uuid);
    }

    @Override
    public String toString() {
        return "BankSearchModel{" +
                "attachments=" + attachments +
                ", code='" + code + '\'' +
                ", contact='" + contact + '\'' +
                ", counterPartyInfo=" + counterPartyInfo +
                ", countryCode='" + countryCode + '\'' +
                ", dealIdentifier='" + dealIdentifier + '\'' +
                ", defaultGroup=" + defaultGroup +
                ", externalCode='" + externalCode + '\'' +
                ", intercompany=" + intercompany +
                ", interfaceCode='" + interfaceCode + '\'' +
                ", intermediaryInfo=" + intermediaryInfo +
                ", internalCounterparty=" + internalCounterparty +
                ", lastUpdateDate=" + lastUpdateDate +
                ", netDebitAndCreditExposure=" + netDebitAndCreditExposure +
                ", netSettlements=" + netSettlements +
                ", parentCounterparty=" + parentCounterparty +
                ", uuid='" + uuid + '\'' +
                '}';
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
