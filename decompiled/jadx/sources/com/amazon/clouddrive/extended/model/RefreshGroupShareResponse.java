package com.amazon.clouddrive.extended.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RefreshGroupShareResponse extends GroupShareResponse {
    @Override // com.amazon.clouddrive.extended.model.GroupShareResponse
    public String toString() {
        return "RefreshGroupShareResponse{} " + super.toString();
    }

    public RefreshGroupShareResponse withInviteUrl(String str) {
        setInviteUrl(str);
        return this;
    }

    public RefreshGroupShareResponse withShareToken(String str) {
        setShareToken(str);
        return this;
    }

    public RefreshGroupShareResponse withShareUrl(String str) {
        setShareUrl(str);
        return this;
    }
}
