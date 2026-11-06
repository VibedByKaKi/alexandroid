package com.amazon.clouddrive.extended.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetGroupShareResponse extends GroupShareResponse {
    @Override // com.amazon.clouddrive.extended.model.GroupShareResponse
    public String toString() {
        return "GetGroupShareResponse{} " + super.toString();
    }

    public GetGroupShareResponse withInviteUrl(String str) {
        setInviteUrl(str);
        return this;
    }

    public GetGroupShareResponse withShareToken(String str) {
        setShareToken(str);
        return this;
    }

    public GetGroupShareResponse withShareUrl(String str) {
        setShareUrl(str);
        return this;
    }
}
