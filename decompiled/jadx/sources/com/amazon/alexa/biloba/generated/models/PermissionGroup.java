package com.amazon.alexa.biloba.generated.models;

import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PermissionGroup {

    @SerializedName("personId")
    private String personId = null;

    @SerializedName(MessagingControllerConstant.MESSAGING_CONTROLLER_ENDPOINT_PERMISSIONS_KEY)
    private List<String> permissions = new ArrayList();

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public PermissionGroup addPermissionsItem(String str) {
        this.permissions.add(str);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PermissionGroup permissionGroup = (PermissionGroup) obj;
            if (Objects.equals(this.personId, permissionGroup.personId) && Objects.equals(this.permissions, permissionGroup.permissions)) {
                return true;
            }
        }
        return false;
    }

    public List<String> getPermissions() {
        return this.permissions;
    }

    public String getPersonId() {
        return this.personId;
    }

    public int hashCode() {
        return Objects.hash(this.personId, this.permissions);
    }

    public PermissionGroup permissions(List<String> list) {
        this.permissions = list;
        return this;
    }

    public PermissionGroup personId(String str) {
        this.personId = str;
        return this;
    }

    public void setPermissions(List<String> list) {
        this.permissions = list;
    }

    public void setPersonId(String str) {
        this.personId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class PermissionGroup {\n    personId: ");
        sb.append(toIndentedString(this.personId));
        sb.append("\n    permissions: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.permissions), "\n}");
    }
}
