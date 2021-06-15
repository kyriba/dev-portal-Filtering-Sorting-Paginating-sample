package com.kyriba.sample.model.bank_groups;

import com.google.gson.annotations.SerializedName;
import com.kyriba.sample.model.ReferenceModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@ApiModel(description = "Bank group.")
public class BankGroupModel {

    @SerializedName("banks")
    private List<ReferenceModel> banks = new ArrayList<>();

    @SerializedName("code")
    private String code = null;

    @SerializedName("contact")
    private String contact = null;

    @SerializedName("counterparty")
    private boolean counterparty = false;

    @SerializedName("description")
    private String description = null;

    @SerializedName("description2")
    private String description2 = null;

    @SerializedName("intermediary")
    private boolean intermediary = false;

    @SerializedName("leader")
    private ReferenceModel leader = null;

    @SerializedName("uuid")
    private UUID uuid = null;

    public BankGroupModel code(List<ReferenceModel> banks) {
        this.banks = banks;
        return this;
    }

     /**List of banks.
      * @return banks
     */
    @ApiModelProperty(required = true, value = "List of banks.")
    public List<ReferenceModel> getBanks() {
        return banks;
    }

    public void setBanks(List<ReferenceModel> banks) {
        this.banks = banks;
    }

    public BankGroupModel code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Bank group&#39;s code.
     * @return code
     **/
    @ApiModelProperty(required = true, value = "Bank branch's code.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BankGroupModel contact(String contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Counterparty's contact. If counterparty is false, contact should be empty.
     * @return contact
     **/
    @ApiModelProperty(value = "Counterparty's contact. If counterparty is false, contact should be empty.")
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public BankGroupModel counterparty(boolean counterparty) {
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

    public BankGroupModel description(String description) {
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

    public BankGroupModel description2(String description2) {
        this.description2 = description2;
        return this;
    }

    /**
     * Second description of the bank group.
     *
     * @return description2
     **/

    @ApiModelProperty("Second description of the bank group.")
    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }


    public BankGroupModel intermediary(boolean intermediary) {
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

    public BankGroupModel leader(ReferenceModel leader) {
        this.leader = leader;
        return this;
    }

    /**
     * Bank group leader.
     *
     * @return leader
     **/

    @ApiModelProperty(required = true, value = "Bank group leader.")
    public ReferenceModel getLeader() {
        return leader;
    }

    public void setLeader(ReferenceModel leader) {
        this.leader = leader;
    }

    public BankGroupModel uuid(UUID uuid) {
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
        if (!(o instanceof BankGroupModel)) return false;
        BankGroupModel that = (BankGroupModel) o;
        return counterparty == that.counterparty &&
                intermediary == that.intermediary &&
                banks.equals(that.banks) &&
                code.equals(that.code) &&
                contact.equals(that.contact) &&
                description.equals(that.description) &&
                description2.equals(that.description2) &&
                leader.equals(that.leader) &&
                uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(banks, code, contact, counterparty, description, description2, intermediary, leader, uuid);
    }

    @Override
    public String toString() {
        return "BankGroupModel{" +
                "banks=" + banks +
                ", code='" + code + '\'' +
                ", contact='" + contact + '\'' +
                ", counterparty=" + counterparty +
                ", description='" + description + '\'' +
                ", description2='" + description2 + '\'' +
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
