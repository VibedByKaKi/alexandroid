package com.amazon.alexa.biloba.model;

import com.amazon.alexa.accessory.notificationpublisher.storage.SettingsStorageModule;
import com.amazon.alexa.biloba.generated.models.PermissionGroup;
import com.amazon.alexa.biloba.utils.WebConstants;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CareActor {

    @SerializedName("personIdV1")
    private String personIdV1 = null;

    @SerializedName("directedPersonIdV2")
    private String directedPersonIdV2 = null;

    @SerializedName("firstName")
    private String firstName = null;

    @SerializedName("lastName")
    private String lastName = null;

    @SerializedName(ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_NICK_NAME)
    private String nickName = null;

    @SerializedName("commsId")
    private String commsId = null;

    @SerializedName(SettingsStorageModule.FILTER_SETTINGS_CONTACT_ID_KEY)
    private String contactId = null;

    @SerializedName("isDropInEnabled")
    private Boolean isDropInEnabled = null;

    @SerializedName("isAlexaEnabled")
    private Boolean isAlexaEnabled = null;

    @SerializedName("isCommsProvisioned")
    private Boolean isCommsProvisioned = null;

    @SerializedName(FragmentMetaData.GROUP_ID)
    private String groupId = null;

    @SerializedName("subscriptionStatus")
    private String subscriptionStatus = null;

    @SerializedName(WebConstants.UriConstants.SUBSCRIPTION_ID)
    private String subscriptionId = null;

    @SerializedName("role")
    private String role = null;

    @SerializedName("commsStatus")
    private String commsStatus = null;

    @SerializedName("dropInStatus")
    private String dropInStatus = null;

    @SerializedName(MessagingControllerConstant.MESSAGING_CONTROLLER_ENDPOINT_PERMISSIONS_KEY)
    private List<String> permissions = new ArrayList();

    @SerializedName("permissionGroups")
    private List<PermissionGroup> permissionGroups = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public CareActor addPermissionGroupsItem(PermissionGroup permissionGroup) {
        if (this.permissionGroups == null) {
            this.permissionGroups = new ArrayList();
        }
        this.permissionGroups.add(permissionGroup);
        return this;
    }

    public CareActor commsId(String str) {
        this.commsId = str;
        return this;
    }

    public CareActor contactId(String str) {
        this.contactId = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CareActor careActor = (CareActor) obj;
            if (Objects.equals(this.personIdV1, careActor.personIdV1) && Objects.equals(this.directedPersonIdV2, careActor.directedPersonIdV2) && Objects.equals(this.firstName, careActor.firstName) && Objects.equals(this.lastName, careActor.lastName) && Objects.equals(this.nickName, careActor.nickName) && Objects.equals(this.commsId, careActor.commsId) && Objects.equals(this.role, careActor.role) && Objects.equals(this.permissions, careActor.permissions) && Objects.equals(this.commsStatus, careActor.commsStatus) && Objects.equals(this.dropInStatus, careActor.dropInStatus) && Objects.equals(this.contactId, careActor.contactId) && Objects.equals(this.isDropInEnabled, careActor.isDropInEnabled) && Objects.equals(this.isAlexaEnabled, careActor.isAlexaEnabled) && Objects.equals(this.isCommsProvisioned, careActor.isCommsProvisioned) && Objects.equals(this.groupId, careActor.groupId) && Objects.equals(this.subscriptionStatus, careActor.subscriptionStatus) && Objects.equals(this.subscriptionId, careActor.subscriptionId) && Objects.equals(this.permissionGroups, careActor.permissionGroups)) {
                return true;
            }
        }
        return false;
    }

    public CareActor firstName(String str) {
        this.firstName = str;
        return this;
    }

    public String getCommsId() {
        return this.commsId;
    }

    public String getCommsStatus() {
        return this.commsStatus;
    }

    public String getContactId() {
        return this.contactId;
    }

    public String getDirectedPersonIdV2() {
        return this.directedPersonIdV2;
    }

    public String getDropInStatus() {
        return this.dropInStatus;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public Boolean getIsAlexaEnabled() {
        return this.isAlexaEnabled;
    }

    public Boolean getIsCommsProvisioned() {
        return this.isCommsProvisioned;
    }

    public Boolean getIsDropInEnabled() {
        return this.isDropInEnabled;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getNickName() {
        return this.nickName;
    }

    public List<PermissionGroup> getPermissionGroups() {
        return this.permissionGroups;
    }

    public List<String> getPermissions() {
        return this.permissions;
    }

    public String getPersonIdV1() {
        return this.personIdV1;
    }

    public String getRole() {
        return this.role;
    }

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public String getSubscriptionStatus() {
        return this.subscriptionStatus;
    }

    public CareActor groupId(String str) {
        this.groupId = str;
        return this;
    }

    public int hashCode() {
        return Objects.hash(this.personIdV1, this.directedPersonIdV2, this.firstName, this.lastName, this.nickName, this.commsId, this.contactId, this.isDropInEnabled, this.isAlexaEnabled, this.isCommsProvisioned, this.groupId, this.subscriptionStatus, this.subscriptionId, this.permissionGroups, this.role, this.permissions, this.commsStatus, this.dropInStatus);
    }

    public CareActor isAlexaEnabled(Boolean bool) {
        this.isAlexaEnabled = bool;
        return this;
    }

    public CareActor isCommsProvisioned(Boolean bool) {
        this.isCommsProvisioned = bool;
        return this;
    }

    public CareActor isDropInEnabled(Boolean bool) {
        this.isDropInEnabled = bool;
        return this;
    }

    public CareActor lastName(String str) {
        this.lastName = str;
        return this;
    }

    public CareActor nickName(String str) {
        this.nickName = str;
        return this;
    }

    public CareActor permissionGroups(List<PermissionGroup> list) {
        this.permissionGroups = list;
        return this;
    }

    public CareActor personIdV1(String str) {
        this.personIdV1 = str;
        return this;
    }

    public void setCommsId(String str) {
        this.commsId = str;
    }

    public void setCommsStatus(String str) {
        this.commsStatus = str;
    }

    public void setContactId(String str) {
        this.contactId = str;
    }

    public void setDirectedPersonIdV2(String str) {
        this.directedPersonIdV2 = str;
    }

    public void setDropInStatus(String str) {
        this.dropInStatus = str;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setIsAlexaEnabled(Boolean bool) {
        this.isAlexaEnabled = bool;
    }

    public void setIsCommsProvisioned(Boolean bool) {
        this.isCommsProvisioned = bool;
    }

    public void setIsDropInEnabled(Boolean bool) {
        this.isDropInEnabled = bool;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setPermissionGroups(List<PermissionGroup> list) {
        this.permissionGroups = list;
    }

    public void setPermissions(List<String> list) {
        this.permissions = list;
    }

    public void setPersonIdV1(String str) {
        this.personIdV1 = str;
    }

    public void setRole(String str) {
        this.role = str;
    }

    public void setSubscriptionId(String str) {
        this.subscriptionId = str;
    }

    public void setSubscriptionStatus(String str) {
        this.subscriptionStatus = str;
    }

    public CareActor subscriptionId(String str) {
        this.subscriptionId = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class CareActor {\n    personIdV1: ");
        sb.append(toIndentedString(this.personIdV1));
        sb.append("\n    directedPersonIdV2: ");
        sb.append(toIndentedString(this.directedPersonIdV2));
        sb.append("\n    firstName: ");
        sb.append(toIndentedString(this.firstName));
        sb.append("\n    lastName: ");
        sb.append(toIndentedString(this.lastName));
        sb.append("\n    nickName: ");
        sb.append(toIndentedString(this.nickName));
        sb.append("\n    commsId: ");
        sb.append(toIndentedString(this.commsId));
        sb.append("\n    contactId: ");
        sb.append(toIndentedString(this.contactId));
        sb.append("\n    isDropInEnabled: ");
        sb.append(toIndentedString(this.isDropInEnabled));
        sb.append("\n    isAlexaEnabled: ");
        sb.append(toIndentedString(this.isAlexaEnabled));
        sb.append("\n    isCommsProvisioned: ");
        sb.append(toIndentedString(this.isCommsProvisioned));
        sb.append("\n    groupId: ");
        sb.append(toIndentedString(this.groupId));
        sb.append("\n    role: ");
        sb.append(toIndentedString(this.role));
        sb.append("\n    permissions: ");
        sb.append(toIndentedString(this.permissions));
        sb.append("\n    commsStatus: ");
        sb.append(toIndentedString(this.commsStatus));
        sb.append("\n    dropInStatus: ");
        sb.append(toIndentedString(this.dropInStatus));
        sb.append("\n    subscriptionStatus: ");
        sb.append(toIndentedString(this.subscriptionStatus));
        sb.append("\n    subscriptionId: ");
        sb.append(toIndentedString(this.subscriptionId));
        sb.append("\n    permissionGroups: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.permissionGroups), "\n}");
    }
}
