package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveRequest;
import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetMemberPreferencesRequest extends MemberRequest implements CloudDriveRequest {
    private String groupId;
    private String lang;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (cloudDriveRequest == null || !(cloudDriveRequest instanceof GetMemberPreferencesRequest)) {
            return -1;
        }
        GetMemberPreferencesRequest getMemberPreferencesRequest = (GetMemberPreferencesRequest) cloudDriveRequest;
        int compare = ObjectComparator.compare(getGroupId(), getMemberPreferencesRequest.getGroupId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getMemberId(), getMemberPreferencesRequest.getMemberId());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getLang(), getMemberPreferencesRequest.getLang());
        if (compare3 != 0) {
            return compare3;
        }
        return 0;
    }

    @Override // com.amazon.clouddrive.extended.model.MemberRequest
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        GetMemberPreferencesRequest getMemberPreferencesRequest = (GetMemberPreferencesRequest) obj;
        String str = this.groupId;
        String str2 = getMemberPreferencesRequest.groupId;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        String str3 = this.lang;
        String str4 = getMemberPreferencesRequest.lang;
        return str3 != null ? str3.equals(str4) : str4 == null;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getLang() {
        return this.lang;
    }

    @Override // com.amazon.clouddrive.extended.model.MemberRequest
    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.groupId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.lang;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public GetMemberPreferencesRequest withGroupId(String str) {
        setGroupId(str);
        return this;
    }

    public GetMemberPreferencesRequest withLang(String str) {
        setLang(str);
        return this;
    }

    public GetMemberPreferencesRequest withMemberId(String str) {
        setMemberId(str);
        return this;
    }
}
