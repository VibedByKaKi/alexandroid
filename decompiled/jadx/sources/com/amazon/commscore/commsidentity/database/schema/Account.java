package com.amazon.commscore.commsidentity.database.schema;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.amazon.deecomms.common.metrics.MetricKeys;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(tableName = "account")
/* loaded from: classes20.dex */
public class Account {

    @ColumnInfo(name = MetricKeys.COMMS_ID)
    private String commsId;

    @ColumnInfo(name = "comms_provision_status")
    private String commsProvisionStatus;

    @ColumnInfo(name = "comms_provisioned")
    private boolean commsProvisioned;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "directed_id")
    private String directedId;

    @ColumnInfo(name = "enrolled_in_alexa")
    private boolean enrolledInAlexa;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "is_child")
    private boolean isChild;

    @ColumnInfo(name = "last_name")
    private String lastName;

    @ColumnInfo(name = "person_id_v2")
    private String personIdV2;

    @ColumnInfo(name = "phone_country_code")
    private String phoneCountryCode;

    @ColumnInfo(name = "phone_number")
    private String phoneNumber;

    @ColumnInfo(name = "phonetic_first_name")
    private String phoneticFirstName;

    @ColumnInfo(name = "phonetic_last_name")
    private String phoneticLastName;

    @ColumnInfo(name = "signed_in_user")
    private boolean signedInUser;

    @ColumnInfo(name = "speaker_provisioned")
    private boolean speakerProvisioned;

    public String getCommsId() {
        return this.commsId;
    }

    public String getCommsProvisionStatus() {
        return this.commsProvisionStatus;
    }

    public String getDirectedId() {
        return this.directedId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPersonIdV2() {
        return this.personIdV2;
    }

    public String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPhoneticFirstName() {
        return this.phoneticFirstName;
    }

    public String getPhoneticLastName() {
        return this.phoneticLastName;
    }

    public boolean isCommsProvisioned() {
        return this.commsProvisioned;
    }

    public boolean isEnrolledInAlexa() {
        return this.enrolledInAlexa;
    }

    public boolean isIsChild() {
        return this.isChild;
    }

    public boolean isSignedInUser() {
        return this.signedInUser;
    }

    public boolean isSpeakerProvisioned() {
        return this.speakerProvisioned;
    }

    public void setCommsId(String str) {
        this.commsId = str;
    }

    public void setCommsProvisionStatus(String str) {
        this.commsProvisionStatus = str;
    }

    public void setCommsProvisioned(boolean z) {
        this.commsProvisioned = z;
    }

    public void setDirectedId(String str) {
        this.directedId = str;
    }

    public void setEnrolledInAlexa(boolean z) {
        this.enrolledInAlexa = z;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setIsChild(boolean z) {
        this.isChild = z;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setPersonIdV2(String str) {
        this.personIdV2 = str;
    }

    public void setPhoneCountryCode(String str) {
        this.phoneCountryCode = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPhoneticFirstName(String str) {
        this.phoneticFirstName = str;
    }

    public void setPhoneticLastName(String str) {
        this.phoneticLastName = str;
    }

    public void setSignedInUser(boolean z) {
        this.signedInUser = z;
    }

    public void setSpeakerProvisioned(boolean z) {
        this.speakerProvisioned = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Account{lastName='");
        sb.append(this.lastName);
        sb.append("', speakerProvisioned=");
        sb.append(this.speakerProvisioned);
        sb.append(", personIdV2='");
        sb.append(this.personIdV2);
        sb.append("', commsId='");
        sb.append(this.commsId);
        sb.append("', signedInUser=");
        sb.append(this.signedInUser);
        sb.append(", firstName='");
        sb.append(this.firstName);
        sb.append("', commsProvisioned=");
        sb.append(this.commsProvisioned);
        sb.append(", phoneticLastName='");
        sb.append(this.phoneticLastName);
        sb.append("', phoneNumber='");
        sb.append(this.phoneNumber);
        sb.append("', phoneCountryCode='");
        sb.append(this.phoneCountryCode);
        sb.append("', commsProvisionStatus='");
        sb.append(this.commsProvisionStatus);
        sb.append("', enrolledInAlexa=");
        sb.append(this.enrolledInAlexa);
        sb.append(", directedId='");
        sb.append(this.directedId);
        sb.append("', isChild=");
        sb.append(this.isChild);
        sb.append(", phoneticFirstName='");
        return a$$ExternalSyntheticOutline0.m(sb, this.phoneticFirstName, "'}");
    }
}
