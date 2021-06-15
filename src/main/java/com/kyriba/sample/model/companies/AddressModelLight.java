package com.kyriba.sample.model.companies;

import com.google.gson.annotations.SerializedName;
import com.kyriba.sample.model.ReferenceModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class AddressModelLight {

    @SerializedName(value = "country")
    private ReferenceModel country  = null;

    public AddressModelLight country(ReferenceModel country) {
        this.country = country;
        return this;
    }

    /**
     * Country.
     * @return country
     **/
    @ApiModelProperty(required = true, value = "Country")
    public ReferenceModel getCountry() {
        return country;
    }

    public void setCountry(ReferenceModel country) {
        this.country = country;
    }
}
