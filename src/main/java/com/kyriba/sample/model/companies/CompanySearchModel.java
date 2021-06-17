package com.kyriba.sample.model.companies;

import com.google.gson.annotations.SerializedName;
import com.kyriba.sample.annotation.SearchModel;
import com.kyriba.sample.model.ReferenceModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@SearchModel
@ApiModel(value = "Company")
public class CompanySearchModel {
    @SerializedName(value = "code")
    private String code = null;

    @SerializedName(value = "shortCode")
    private String shortCode = null;

    @SerializedName(value = "interfaceCode")
    private String interfaceCode = null;

    @SerializedName(value = "description1")
    private String description1 = null;

    @SerializedName(value = "description2")
    private String description2 = null;

    @SerializedName(value = "defaultGroup")
    private ReferenceModel defaultGroup = null;

    @SerializedName(value = "uuid")
    private String uuid = null;

    @SerializedName(value = "address")
    private AddressModelLight address = null;

    @SerializedName(value = "businessIdentifiers")
    private BusinessIdentifiersForCompanyLight businessIdentifiers = null;

    public CompanySearchModel address(AddressModelLight address) {
        this.address = address;
        return this;
    }

    /**
     * Company's address.
     *
     * @return address
     **/
    @ApiModelProperty(required = true, value = "Company's address.")
    public AddressModelLight getAddress() {
        return address;
    }

    public void setAddress(AddressModelLight address) {
        this.address = address;
    }

    public CompanySearchModel businessIdentifiers(BusinessIdentifiersForCompanyLight businessIdentifiers) {
        this.businessIdentifiers = businessIdentifiers;
        return this;
    }

    /**
     * @return businessIdentifiers
     **/
    @ApiModelProperty()
    public BusinessIdentifiersForCompanyLight getBusinessIdentifiers() {
        return businessIdentifiers;
    }

    public void setBusinessIdentifiers(BusinessIdentifiersForCompanyLight businessIdentifiers) {
        this.businessIdentifiers = businessIdentifiers;
    }

    public CompanySearchModel code(String code) {
        this.code = code;
        return this;
    }

    /**
     * The code that represents the company.
     *
     * @return code
     **/
    @ApiModelProperty(example = "COMPANY01", required = true, value = "The code that represents the company.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CompanySearchModel defaultGroup(ReferenceModel defaultGroup) {
        this.defaultGroup = defaultGroup;
        return this;
    }

    /**
     * @return defaultGroup
     **/
    @ApiModelProperty()
    public ReferenceModel getDefaultGroup() {
        return defaultGroup;
    }

    public void setDefaultGroup(ReferenceModel defaultGroup) {
        this.defaultGroup = defaultGroup;
    }

    public CompanySearchModel description1(String description1) {
        this.description1 = description1;
        return this;
    }

    /**
     * The name of the company.
     *
     * @return description1
     **/
    @ApiModelProperty(example = "ABC Corp", value = "The name of the company.")
    public String getDescription1() {
        return description1;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public CompanySearchModel description2(String description2) {
        this.description2 = description2;
        return this;
    }

    /**
     * Other name of the company.
     *
     * @return description2
     **/
    @ApiModelProperty(example = "Other name", value = "Other name of the company.")
    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public CompanySearchModel interfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    /**
     * The code, using Latin characters only, that represents the company and that is used in the interfaces that only support Latin characters (example: in some bank connectivity configurations).
     * If empty then field "code" is used (provided that it only contains Latin characters).
     *
     * @return interfaceCode
     **/
    @ApiModelProperty(example = "ERP01", required = true, value = "The code, using Latin characters only, that represents the company and that is used in the interfaces that only support Latin characters (example: in some bank connectivity configurations).\n" +
            "If empty then field \"code\" is used (provided that it only contains Latin characters).")
    public String getInterfaceCode() {
        return interfaceCode;
    }

    public void setInterfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
    }

    public CompanySearchModel shortCode(String shortCode) {
        this.shortCode = shortCode;
        return this;
    }

    /**
     * The short code that represents this company in automatically-generated Transaction
     * numbers (Transaction numbers are made up of the Short company code, a Transaction code, a numeric counter).
     *
     * @return shortCode
     **/
    @ApiModelProperty(example = "C01", required = true, value = "The short code that represents this company in automatically-generated Transaction numbers (Transaction numbers are made up of the Short company code, a Transaction code, a numeric counter).")
    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public CompanySearchModel uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * UUID of the company.
     *
     * @return uuid
     **/
    @ApiModelProperty(example = "uuid", value = "UUID of the company.")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompanySearchModel)) return false;
        CompanySearchModel that = (CompanySearchModel) o;
        return address.equals(that.address) &&
                businessIdentifiers.equals(that.businessIdentifiers) &&
                code.equals(that.code) &&
                defaultGroup.equals(that.defaultGroup) &&
                description1.equals(that.description1) &&
                description2.equals(that.description2) &&
                interfaceCode.equals(that.interfaceCode) &&
                shortCode.equals(that.shortCode) &&
                uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, businessIdentifiers, code, defaultGroup, description1, description2, interfaceCode, shortCode, uuid);
    }

    @Override
    public String toString() {
        return "CompanySearchModel{" +
                "address=" + address +
                ", businessIdentifiers=" + businessIdentifiers +
                ", code='" + code + '\'' +
                ", defaultGroup=" + defaultGroup +
                ", description1='" + description1 + '\'' +
                ", description2='" + description2 + '\'' +
                ", interfaceCode='" + interfaceCode + '\'' +
                ", shortCode='" + shortCode + '\'' +
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
