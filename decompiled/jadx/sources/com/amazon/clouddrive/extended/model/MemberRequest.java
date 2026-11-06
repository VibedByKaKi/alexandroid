package com.amazon.clouddrive.extended.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MemberRequest {
    private String memberId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemberRequest)) {
            return false;
        }
        MemberRequest memberRequest = (MemberRequest) obj;
        return getMemberId() != null ? getMemberId().equals(memberRequest.getMemberId()) : memberRequest.getMemberId() == null;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public int hashCode() {
        if (getMemberId() != null) {
            return getMemberId().hashCode();
        }
        return 0;
    }

    public void setMemberId(String str) {
        this.memberId = str;
    }
}
