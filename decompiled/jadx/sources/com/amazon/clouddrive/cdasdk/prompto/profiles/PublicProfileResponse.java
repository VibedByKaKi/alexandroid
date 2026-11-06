package com.amazon.clouddrive.cdasdk.prompto.profiles;

import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class PublicProfileResponse extends ProfileResponse {
    @Generated
    public PublicProfileResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.profiles.ProfileResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof PublicProfileResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.profiles.ProfileResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof PublicProfileResponse) && ((PublicProfileResponse) obj).canEqual(this) && super.equals(obj);
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.profiles.ProfileResponse
    @Generated
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.profiles.ProfileResponse
    @Generated
    public String toString() {
        return "PublicProfileResponse()";
    }
}
