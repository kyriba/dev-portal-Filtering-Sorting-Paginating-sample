package com.kyriba.sample.model.bank_groups;

import com.google.gson.annotations.SerializedName;
import com.kyriba.sample.annotation.SearchModel;
import com.kyriba.sample.model.ReferenceModel;
import io.swagger.annotations.ApiModelProperty;
import v2.io.swagger.annotations.ApiModel;

import java.util.Objects;
import java.util.UUID;

/**
 * Bank group.
 */
@ApiModel(description = "Bank group")
@SearchModel
public class BankGroupSearchModel {
    @SerializedName("uuid")
    private UUID uuid = null;

    @SerializedName("code")
    private String code = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("leader")
    private ReferenceModel leader = null;

    @SerializedName("counterparty")
    private boolean counterparty = false;

    @SerializedName("intermediary")
    private boolean intermediary = false;

    public BankGroupSearchModel code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Bank group&#39;s code.
     *
     * @return code
     **/
    @ApiModelProperty(required = true, value = "Bank branch's code.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BankGroupSearchModel counterparty(boolean counterparty) {
        this.counterparty = counterparty;
        return this;
    }

    /**
     * Flag to select bank groups with Counterparty info (true) or without Counterparty info (false).
     *
     * @return counterparty
     **/

    @ApiModelProperty(value = "Flag to select bank groups with Counterparty info (true) or without Counterparty info (false).")
    public boolean isCounterparty() {
        return counterparty;
    }

    public void setCounterparty(boolean counterparty) {
        this.counterparty = counterparty;
    }

    public BankGroupSearchModel description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the bank group.
     *
     * @return description
     **/

    @ApiModelProperty("Description of the bank group.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BankGroupSearchModel intermediary(boolean intermediary) {
        this.intermediary = intermediary;
        return this;
    }

    /**
     * Flag to select bank groups with Intermediary info (true) or without Intermediary info (false).
     *
     * @return intermediary
     **/

    @ApiModelProperty(value = "Flag to select bank groups with Intermediary info (true) or without Intermediary info (false).")
    public boolean isIntermediary() {
        return intermediary;
    }

    public void setIntermediary(boolean intermediary) {
        this.intermediary = intermediary;
    }

    public BankGroupSearchModel leader(ReferenceModel leader) {
        this.leader = leader;
        return this;
    }

    /**
     * Bank group leader.
     *
     * @return leader
     **/

    @ApiModelProperty(value = "Bank group leader.")
    public ReferenceModel getLeader() {
        return leader;
    }

    public void setLeader(ReferenceModel leader) {
        this.leader = leader;
    }

    public BankGroupSearchModel uuid(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * UUID of the bank group.
     *
     * @return uuid
     **/
    @ApiModelProperty(required = true, value = "UUID of the bank group.")
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankGroupSearchModel)) return false;
        BankGroupSearchModel that = (BankGroupSearchModel) o;
        return counterparty == that.counterparty &&
                intermediary == that.intermediary &&
                code.equals(that.code) &&
                description.equals(that.description) &&
                leader.equals(that.leader) &&
                uuid.equals(that.uuid);
    }


    @Override
    public int hashCode() {
        return Objects.hash(code, counterparty, description, intermediary, leader, uuid);
    }

    @Override
    public String toString() {
        return "BankGroupSearchModel{" +
                "code='" + code + '\'' +
                ", counterparty=" + counterparty +
                ", description='" + description + '\'' +
                ", intermediary=" + intermediary +
                ", leader=" + leader +
                ", uuid=" + uuid +
                '}';
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
