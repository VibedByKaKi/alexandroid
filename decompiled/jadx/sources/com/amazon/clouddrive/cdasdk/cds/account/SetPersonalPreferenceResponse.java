package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SetPersonalPreferenceResponse extends CloudDriveResponse {
    @Generated
    public SetPersonalPreferenceResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SetPersonalPreferenceResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SetPersonalPreferenceResponse) && ((SetPersonalPreferenceResponse) obj).canEqual(this) && super.equals(obj);
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public String toString() {
        return "SetPersonalPreferenceResponse()";
    }
}
