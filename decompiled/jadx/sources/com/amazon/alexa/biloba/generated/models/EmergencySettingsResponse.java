package com.amazon.alexa.biloba.generated.models;

import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EmergencySettingsResponse {

    @SerializedName("emergencyHelplineStatus")
    private String emergencyHelplineStatus = null;

    @SerializedName("emergencyAddress")
    private EmergencyAddress emergencyAddress = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public EmergencySettingsResponse emergencyAddress(EmergencyAddress emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
        return this;
    }

    public EmergencySettingsResponse emergencyHelplineStatus(String str) {
        this.emergencyHelplineStatus = str;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EmergencySettingsResponse emergencySettingsResponse = (EmergencySettingsResponse) obj;
            if (Objects.equals(this.emergencyHelplineStatus, emergencySettingsResponse.emergencyHelplineStatus) && Objects.equals(this.emergencyAddress, emergencySettingsResponse.emergencyAddress)) {
                return true;
            }
        }
        return false;
    }

    public EmergencyAddress getEmergencyAddress() {
        return this.emergencyAddress;
    }

    public String getEmergencyHelplineStatus() {
        return this.emergencyHelplineStatus;
    }

    public int hashCode() {
        return Objects.hash(this.emergencyHelplineStatus, this.emergencyAddress);
    }

    public void setEmergencyAddress(EmergencyAddress emergencyAddress) {
        this.emergencyAddress = emergencyAddress;
    }

    public void setEmergencyHelplineStatus(String str) {
        this.emergencyHelplineStatus = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class EmergencySettingsResponse {\n    emergencyHelplineStatus: ");
        sb.append(toIndentedString(this.emergencyHelplineStatus));
        sb.append("\n    emergencyAddress: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.emergencyAddress), "\n}");
    }
}
