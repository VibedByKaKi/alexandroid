package com.amazon.clouddrive.cdasdk.prompto.common;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.prompto.profiles.PublicProfileResponse;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MemberResponse {

    @SerializedName("createdBy")
    @Expose
    private String createdBy;

    @SerializedName(BizMetricsConstants.CUSTOMER_ID)
    @Expose
    private String customerId;

    @SerializedName(FragmentMetaData.GROUP_ID)
    @Expose
    private String groupId;

    @SerializedName("lastViewStatus")
    @Expose
    private String lastViewStatus;

    @SerializedName("lastViewedDate")
    @Expose
    private String lastViewedDate;

    @SerializedName("modifiedBy")
    @Expose
    private String modifiedBy;

    @SerializedName(Scopes.PROFILE)
    @Expose
    private PublicProfileResponse profile;

    @SerializedName("role")
    @Expose
    private String role;

    @Generated
    public MemberResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof MemberResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemberResponse)) {
            return false;
        }
        MemberResponse memberResponse = (MemberResponse) obj;
        if (!memberResponse.canEqual(this)) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = memberResponse.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String createdBy = getCreatedBy();
        String createdBy2 = memberResponse.getCreatedBy();
        if (createdBy != null ? !createdBy.equals(createdBy2) : createdBy2 != null) {
            return false;
        }
        String customerId = getCustomerId();
        String customerId2 = memberResponse.getCustomerId();
        if (customerId != null ? !customerId.equals(customerId2) : customerId2 != null) {
            return false;
        }
        String modifiedBy = getModifiedBy();
        String modifiedBy2 = memberResponse.getModifiedBy();
        if (modifiedBy != null ? !modifiedBy.equals(modifiedBy2) : modifiedBy2 != null) {
            return false;
        }
        String role = getRole();
        String role2 = memberResponse.getRole();
        if (role != null ? !role.equals(role2) : role2 != null) {
            return false;
        }
        String lastViewedDate = getLastViewedDate();
        String lastViewedDate2 = memberResponse.getLastViewedDate();
        if (lastViewedDate != null ? !lastViewedDate.equals(lastViewedDate2) : lastViewedDate2 != null) {
            return false;
        }
        String lastViewStatus = getLastViewStatus();
        String lastViewStatus2 = memberResponse.getLastViewStatus();
        if (lastViewStatus != null ? !lastViewStatus.equals(lastViewStatus2) : lastViewStatus2 != null) {
            return false;
        }
        PublicProfileResponse profile = getProfile();
        PublicProfileResponse profile2 = memberResponse.getProfile();
        return profile != null ? profile.equals(profile2) : profile2 == null;
    }

    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Generated
    public String getCustomerId() {
        return this.customerId;
    }

    @Generated
    public String getGroupId() {
        return this.groupId;
    }

    @Generated
    public String getLastViewStatus() {
        return this.lastViewStatus;
    }

    @Generated
    public String getLastViewedDate() {
        return this.lastViewedDate;
    }

    @Generated
    public String getModifiedBy() {
        return this.modifiedBy;
    }

    @Generated
    public PublicProfileResponse getProfile() {
        return this.profile;
    }

    @Generated
    public String getRole() {
        return this.role;
    }

    @Generated
    public int hashCode() {
        String groupId = getGroupId();
        int hashCode = groupId == null ? 43 : groupId.hashCode();
        String createdBy = getCreatedBy();
        int hashCode2 = ((hashCode + 59) * 59) + (createdBy == null ? 43 : createdBy.hashCode());
        String customerId = getCustomerId();
        int hashCode3 = (hashCode2 * 59) + (customerId == null ? 43 : customerId.hashCode());
        String modifiedBy = getModifiedBy();
        int hashCode4 = (hashCode3 * 59) + (modifiedBy == null ? 43 : modifiedBy.hashCode());
        String role = getRole();
        int hashCode5 = (hashCode4 * 59) + (role == null ? 43 : role.hashCode());
        String lastViewedDate = getLastViewedDate();
        int hashCode6 = (hashCode5 * 59) + (lastViewedDate == null ? 43 : lastViewedDate.hashCode());
        String lastViewStatus = getLastViewStatus();
        int i = hashCode6 * 59;
        int hashCode7 = lastViewStatus == null ? 43 : lastViewStatus.hashCode();
        PublicProfileResponse profile = getProfile();
        return ((i + hashCode7) * 59) + (profile != null ? profile.hashCode() : 43);
    }

    @Generated
    public void setCreatedBy(String str) {
        this.createdBy = str;
    }

    @Generated
    public void setCustomerId(String str) {
        this.customerId = str;
    }

    @Generated
    public void setGroupId(String str) {
        this.groupId = str;
    }

    @Generated
    public void setLastViewStatus(String str) {
        this.lastViewStatus = str;
    }

    @Generated
    public void setLastViewedDate(String str) {
        this.lastViewedDate = str;
    }

    @Generated
    public void setModifiedBy(String str) {
        this.modifiedBy = str;
    }

    @Generated
    public void setProfile(PublicProfileResponse publicProfileResponse) {
        this.profile = publicProfileResponse;
    }

    @Generated
    public void setRole(String str) {
        this.role = str;
    }

    @Generated
    public String toString() {
        return "MemberResponse(groupId=" + getGroupId() + ", createdBy=" + getCreatedBy() + ", customerId=" + getCustomerId() + ", modifiedBy=" + getModifiedBy() + ", role=" + getRole() + ", lastViewedDate=" + getLastViewedDate() + ", lastViewStatus=" + getLastViewStatus() + ", profile=" + getProfile() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
