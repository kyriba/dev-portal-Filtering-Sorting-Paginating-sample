package com.kyriba.sample.model.companies;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class BusinessIdentifiersForCompanyLight {
    @SerializedName(value = "otherIdentifierType")
    private int otherIdentifierType = 0;

    @SerializedName(value = "otherIdentifierValue")
    private String otherIdentifierValue = null;

    public BusinessIdentifiersForCompanyLight otherIdentifierType(int otherIdentifierType) {
        this.otherIdentifierType = otherIdentifierType;
        return this;
    }

    /**
     * Id assigned by another institution.
     * @return otherIdentifierValue
     **/
    @ApiModelProperty(example = "1", required = true, value = "Id assigned by another institution.")
    public int getOtherIdentifierType() {
        return otherIdentifierType;
    }

    public void setOtherIdentifierType(int otherIdentifierType) {
        this.otherIdentifierType = otherIdentifierType;
    }

    public BusinessIdentifiersForCompanyLight otherIdentifierValue(String otherIdentifierValue) {
        this.otherIdentifierValue = otherIdentifierValue;
        return this;
    }

    /**
     * Value of the identifier that corresponds to the selected otherIdentifierType.

     * @return otherIdentifierValue
     **/
    @ApiModelProperty(example = "20-1234567", value = "Value of the identifier that corresponds to the selected otherIdentifierType.")
    public String getOtherIdentifierValue() {
        return otherIdentifierValue;
    }

    public void setOtherIdentifierValue(String otherIdentifierValue) {
        this.otherIdentifierValue = otherIdentifierValue;
    }
}
