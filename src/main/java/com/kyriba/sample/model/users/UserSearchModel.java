package com.kyriba.sample.model.users;

import com.google.gson.annotations.SerializedName;
import com.kyriba.sample.annotation.SearchModel;
import com.kyriba.sample.model.ReferenceModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@SearchModel
@ApiModel(description = "User.")
public class UserSearchModel {
    @SerializedName(value = "uuid")
    private String uuid = null;

    @SerializedName(value = "code")
    private String code = null;

    @SerializedName(value = "interfaceCode")
    private String interfaceCode = null;

    @SerializedName(value = "firstName")
    private String firstName = null;

    @SerializedName(value = "lastName")
    private String lastName = null;

    @SerializedName(value = "ssoIdentity")
    private String ssoIdentity = null;

    @SerializedName(value = "email")
    private String email = null;

    @SerializedName(value = "description")
    private String description = null;

    @SerializedName(value = "accessProfile")
    private ReferenceModel accessProfile = null;

    @SerializedName(value = "dataPermissionProfile")
    private ReferenceModel dataPermissionProfile = null;

    @SerializedName(value = "companyOwnership")
    private ReferenceModel companyOwnership = null;

    @SerializedName(value = "paymentAdministrator")
    private boolean paymentAdministrator = false;

    @SerializedName(value = "systemAdministrator")
    private boolean systemAdministrator = false;

    @SerializedName(value = "emailRecipient")
    private boolean emailRecipient = false;

    public UserSearchModel accessProfile(ReferenceModel accessProfile) {
        this.accessProfile = accessProfile;
        return this;
    }

    /**
     * @return accessProfile
     **/
    @ApiModelProperty(required = true)
    public ReferenceModel getAccessProfile() {
        return accessProfile;
    }

    public void setAccessProfile(ReferenceModel accessProfile) {
        this.accessProfile = accessProfile;
    }

    public UserSearchModel code(String code) {
        this.code = code;
        return this;
    }

    /**
     * User's Code.
     *
     * @return code
     **/
    @ApiModelProperty(example = "CODE01", required = true, value = "User's Code.")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UserSearchModel companyOwnership(ReferenceModel companyOwnership) {
        this.companyOwnership = companyOwnership;
        return this;
    }

    /**
     * @return companyOwnership
     **/
    @ApiModelProperty()
    public ReferenceModel getCompanyOwnership() {
        return companyOwnership;
    }

    public void setCompanyOwnership(ReferenceModel companyOwnership) {
        this.companyOwnership = companyOwnership;
    }


    public UserSearchModel dataPermissionProfile(ReferenceModel dataPermissionProfile) {
        this.dataPermissionProfile = dataPermissionProfile;
        return this;
    }

    /**
     * @return dataPermissionProfile
     **/
    @ApiModelProperty()
    public ReferenceModel getDataPermissionProfile() {
        return dataPermissionProfile;
    }

    public void setDataPermissionProfile(ReferenceModel dataPermissionProfile) {
        this.dataPermissionProfile = dataPermissionProfile;
    }


    public UserSearchModel description(String description) {
        this.description = description;
        return this;
    }

    /**
     * User's Description.
     *
     * @return description
     **/
    @ApiModelProperty(example = "User's Description.", value = "User's Description.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserSearchModel email(String email) {
        this.email = email;
        return this;
    }

    /**
     * User's Email address.
     *
     * @return email
     **/
    @ApiModelProperty(example = "mail@gmail.com", required = true, value = "User's Email address.")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserSearchModel emailRecipient(boolean emailRecipient) {
        this.emailRecipient = emailRecipient;
        return this;
    }

    /**
     * Flag to select whether the user is authorized to receive emails from the application. If not then
     * emails will be skipped for this user if this user is designated as email recipient in any process of the application.
     *
     * @return emailRecipient
     **/
    @ApiModelProperty(example = "true", value = "Flag to select whether the user is authorized to receive emails from the application. If not then emails will be skipped for this user if this user is designated as email recipient in any process of the application.")
    public boolean isEmailRecipient() {
        return emailRecipient;
    }

    public void setEmailRecipient(boolean emailRecipient) {
        this.emailRecipient = emailRecipient;
    }

    public UserSearchModel firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * User's First name.
     *
     * @return firstName
     **/
    @ApiModelProperty(example = "FirstName", required = true, value = "User's First name.")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserSearchModel interfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    /**
     * User's Interface code.
     *
     * @return interfaceCode
     **/
    @ApiModelProperty(example = "CODE01", required = true, value = "User's Interface code.")
    public String getInterfaceCode() {
        return interfaceCode;
    }

    public void setInterfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode;
    }

    public UserSearchModel lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * User's Last name.
     *
     * @return lastName
     **/
    @ApiModelProperty(example = "Lastname", required = true, value = "User's Last name.")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserSearchModel paymentAdministrator(boolean paymentAdministrator) {
        this.paymentAdministrator = paymentAdministrator;
        return this;
    }

    /**
     * paymentAdministrator
     *
     * @return paymentAdministrator
     **/
    @ApiModelProperty(example = "true", value = "paymentAdministrator")
    public boolean isPaymentAdministrator() {
        return paymentAdministrator;
    }

    public void setPaymentAdministrator(boolean paymentAdministrator) {
        this.paymentAdministrator = paymentAdministrator;
    }

    public UserSearchModel ssoIdentity(String ssoIdentity) {
        this.ssoIdentity = ssoIdentity;
        return this;
    }

    /**
     * User's SSO identifier.
     *
     * @return ssoIdentity
     **/
    @ApiModelProperty(example = "SSO identifier", value = "User's SSO identifier.")
    public String getSsoIdentity() {
        return ssoIdentity;
    }

    public void setSsoIdentity(String ssoIdentity) {
        this.ssoIdentity = ssoIdentity;
    }

    public UserSearchModel systemAdministrator(boolean systemAdministrator) {
        this.systemAdministrator = systemAdministrator;
        return this;
    }

    /**
     * Flag to select System admin (true) or non-System admin (false) users.
     *
     * @return systemAdministrator
     **/
    @ApiModelProperty(example = "true", value = "Flag to select System admin (true) or non-System admin (false) users.")
    public boolean isSystemAdministrator() {
        return systemAdministrator;
    }

    public void setSystemAdministrator(boolean systemAdministrator) {
        this.systemAdministrator = systemAdministrator;
    }

    public UserSearchModel uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Unique internal identifier that represents the user.
     *
     * @return uuid
     **/
    @ApiModelProperty(example = "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx", value = "Unique internal identifier that represents the user.")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserSearchModel)) return false;
        UserSearchModel that = (UserSearchModel) o;
        return emailRecipient == that.emailRecipient &&
                paymentAdministrator == that.paymentAdministrator &&
                systemAdministrator == that.systemAdministrator &&
                accessProfile.equals(that.accessProfile) &&
                code.equals(that.code) &&
                companyOwnership.equals(that.companyOwnership) &&
                dataPermissionProfile.equals(that.dataPermissionProfile) &&
                description.equals(that.description) &&
                email.equals(that.email) &&
                firstName.equals(that.firstName) &&
                interfaceCode.equals(that.interfaceCode) &&
                lastName.equals(that.lastName) &&
                ssoIdentity.equals(that.ssoIdentity) &&
                uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessProfile, code, companyOwnership, dataPermissionProfile, description, email, emailRecipient, firstName, interfaceCode, lastName, paymentAdministrator, ssoIdentity, systemAdministrator, uuid);
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
