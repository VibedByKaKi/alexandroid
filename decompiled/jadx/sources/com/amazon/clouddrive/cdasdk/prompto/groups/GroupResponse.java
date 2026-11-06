package com.amazon.clouddrive.cdasdk.prompto.groups;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.prompto.common.MemberResponse;
import com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceResponse;
import com.amazon.clouddrive.cdasdk.prompto.contentAggregations.ContentAggregationsResponse;
import com.amazon.clouddrive.cdasdk.prompto.photos.PhotoResponse;
import com.amazon.clouddrive.cdasdk.prompto.profiles.PublicProfileResponse;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupResponse extends PromptoServiceResponse {

    @SerializedName("addedBy")
    @Expose
    private PublicProfileResponse addedBy;

    @SerializedName("contentAggregations")
    @Expose
    private ContentAggregationsResponse contentAggregations;

    @SerializedName("coverNodeId")
    @Expose
    private String coverNodeId;

    @SerializedName("coverPhoto")
    @Expose
    private PhotoResponse coverPhoto;

    @SerializedName("createdBy")
    @Expose
    private String createdBy;

    @SerializedName("featuredMembers")
    @Expose
    private List<MemberResponse> featuredMembers;

    @SerializedName(FragmentMetaData.GROUP_ID)
    @Expose
    private String groupId;

    @SerializedName("groupPreferences")
    @Expose
    private GroupPreferences groupPreferences;

    @SerializedName("inviteCallToAction")
    @Expose
    private String inviteCallToAction;

    @SerializedName("inviteDescription")
    @Expose
    private String inviteDescription;

    @SerializedName(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME)
    @Expose
    private String kind;

    @SerializedName("lastViewedDate")
    @Expose
    private String lastViewedDate;

    @SerializedName("memberCount")
    @Expose
    private Long memberCount;

    @SerializedName("modifiedBy")
    @Expose
    private String modifiedBy;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("nameType")
    @Expose
    private String nameType;

    @SerializedName("ownedBy")
    @Expose
    private String ownedBy;

    @SerializedName("unseenContentAggregations")
    @Expose
    private ContentAggregationsResponse unseenContentAggregations;

    @Generated
    public GroupResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GroupResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupResponse)) {
            return false;
        }
        GroupResponse groupResponse = (GroupResponse) obj;
        if (!groupResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Long memberCount = getMemberCount();
        Long memberCount2 = groupResponse.getMemberCount();
        if (memberCount != null ? !memberCount.equals(memberCount2) : memberCount2 != null) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = groupResponse.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String name = getName();
        String name2 = groupResponse.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String nameType = getNameType();
        String nameType2 = groupResponse.getNameType();
        if (nameType != null ? !nameType.equals(nameType2) : nameType2 != null) {
            return false;
        }
        String coverNodeId = getCoverNodeId();
        String coverNodeId2 = groupResponse.getCoverNodeId();
        if (coverNodeId != null ? !coverNodeId.equals(coverNodeId2) : coverNodeId2 != null) {
            return false;
        }
        PhotoResponse coverPhoto = getCoverPhoto();
        PhotoResponse coverPhoto2 = groupResponse.getCoverPhoto();
        if (coverPhoto != null ? !coverPhoto.equals(coverPhoto2) : coverPhoto2 != null) {
            return false;
        }
        String createdBy = getCreatedBy();
        String createdBy2 = groupResponse.getCreatedBy();
        if (createdBy != null ? !createdBy.equals(createdBy2) : createdBy2 != null) {
            return false;
        }
        String modifiedBy = getModifiedBy();
        String modifiedBy2 = groupResponse.getModifiedBy();
        if (modifiedBy != null ? !modifiedBy.equals(modifiedBy2) : modifiedBy2 != null) {
            return false;
        }
        String ownedBy = getOwnedBy();
        String ownedBy2 = groupResponse.getOwnedBy();
        if (ownedBy != null ? !ownedBy.equals(ownedBy2) : ownedBy2 != null) {
            return false;
        }
        List<MemberResponse> featuredMembers = getFeaturedMembers();
        List<MemberResponse> featuredMembers2 = groupResponse.getFeaturedMembers();
        if (featuredMembers != null ? !featuredMembers.equals(featuredMembers2) : featuredMembers2 != null) {
            return false;
        }
        ContentAggregationsResponse contentAggregations = getContentAggregations();
        ContentAggregationsResponse contentAggregations2 = groupResponse.getContentAggregations();
        if (contentAggregations != null ? !contentAggregations.equals(contentAggregations2) : contentAggregations2 != null) {
            return false;
        }
        ContentAggregationsResponse unseenContentAggregations = getUnseenContentAggregations();
        ContentAggregationsResponse unseenContentAggregations2 = groupResponse.getUnseenContentAggregations();
        if (unseenContentAggregations != null ? !unseenContentAggregations.equals(unseenContentAggregations2) : unseenContentAggregations2 != null) {
            return false;
        }
        String lastViewedDate = getLastViewedDate();
        String lastViewedDate2 = groupResponse.getLastViewedDate();
        if (lastViewedDate != null ? !lastViewedDate.equals(lastViewedDate2) : lastViewedDate2 != null) {
            return false;
        }
        PublicProfileResponse addedBy = getAddedBy();
        PublicProfileResponse addedBy2 = groupResponse.getAddedBy();
        if (addedBy != null ? !addedBy.equals(addedBy2) : addedBy2 != null) {
            return false;
        }
        String inviteCallToAction = getInviteCallToAction();
        String inviteCallToAction2 = groupResponse.getInviteCallToAction();
        if (inviteCallToAction != null ? !inviteCallToAction.equals(inviteCallToAction2) : inviteCallToAction2 != null) {
            return false;
        }
        String inviteDescription = getInviteDescription();
        String inviteDescription2 = groupResponse.getInviteDescription();
        if (inviteDescription != null ? !inviteDescription.equals(inviteDescription2) : inviteDescription2 != null) {
            return false;
        }
        String kind = getKind();
        String kind2 = groupResponse.getKind();
        if (kind != null ? !kind.equals(kind2) : kind2 != null) {
            return false;
        }
        GroupPreferences groupPreferences = getGroupPreferences();
        GroupPreferences groupPreferences2 = groupResponse.getGroupPreferences();
        return groupPreferences != null ? groupPreferences.equals(groupPreferences2) : groupPreferences2 == null;
    }

    @Generated
    public PublicProfileResponse getAddedBy() {
        return this.addedBy;
    }

    @Generated
    public ContentAggregationsResponse getContentAggregations() {
        return this.contentAggregations;
    }

    @Generated
    public String getCoverNodeId() {
        return this.coverNodeId;
    }

    @Generated
    public PhotoResponse getCoverPhoto() {
        return this.coverPhoto;
    }

    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Generated
    public List<MemberResponse> getFeaturedMembers() {
        return this.featuredMembers;
    }

    @Generated
    public String getGroupId() {
        return this.groupId;
    }

    @Generated
    public GroupPreferences getGroupPreferences() {
        return this.groupPreferences;
    }

    @Generated
    public String getInviteCallToAction() {
        return this.inviteCallToAction;
    }

    @Generated
    public String getInviteDescription() {
        return this.inviteDescription;
    }

    @Generated
    public String getKind() {
        return this.kind;
    }

    @Generated
    public String getLastViewedDate() {
        return this.lastViewedDate;
    }

    @Generated
    public Long getMemberCount() {
        return this.memberCount;
    }

    @Generated
    public String getModifiedBy() {
        return this.modifiedBy;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getNameType() {
        return this.nameType;
    }

    @Generated
    public String getOwnedBy() {
        return this.ownedBy;
    }

    @Generated
    public ContentAggregationsResponse getUnseenContentAggregations() {
        return this.unseenContentAggregations;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Long memberCount = getMemberCount();
        int hashCode2 = (hashCode * 59) + (memberCount == null ? 43 : memberCount.hashCode());
        String groupId = getGroupId();
        int hashCode3 = (hashCode2 * 59) + (groupId == null ? 43 : groupId.hashCode());
        String name = getName();
        int hashCode4 = (hashCode3 * 59) + (name == null ? 43 : name.hashCode());
        String nameType = getNameType();
        int hashCode5 = (hashCode4 * 59) + (nameType == null ? 43 : nameType.hashCode());
        String coverNodeId = getCoverNodeId();
        int hashCode6 = (hashCode5 * 59) + (coverNodeId == null ? 43 : coverNodeId.hashCode());
        PhotoResponse coverPhoto = getCoverPhoto();
        int hashCode7 = (hashCode6 * 59) + (coverPhoto == null ? 43 : coverPhoto.hashCode());
        String createdBy = getCreatedBy();
        int hashCode8 = (hashCode7 * 59) + (createdBy == null ? 43 : createdBy.hashCode());
        String modifiedBy = getModifiedBy();
        int hashCode9 = (hashCode8 * 59) + (modifiedBy == null ? 43 : modifiedBy.hashCode());
        String ownedBy = getOwnedBy();
        int hashCode10 = (hashCode9 * 59) + (ownedBy == null ? 43 : ownedBy.hashCode());
        List<MemberResponse> featuredMembers = getFeaturedMembers();
        int hashCode11 = (hashCode10 * 59) + (featuredMembers == null ? 43 : featuredMembers.hashCode());
        ContentAggregationsResponse contentAggregations = getContentAggregations();
        int hashCode12 = (hashCode11 * 59) + (contentAggregations == null ? 43 : contentAggregations.hashCode());
        ContentAggregationsResponse unseenContentAggregations = getUnseenContentAggregations();
        int hashCode13 = (hashCode12 * 59) + (unseenContentAggregations == null ? 43 : unseenContentAggregations.hashCode());
        String lastViewedDate = getLastViewedDate();
        int hashCode14 = (hashCode13 * 59) + (lastViewedDate == null ? 43 : lastViewedDate.hashCode());
        PublicProfileResponse addedBy = getAddedBy();
        int hashCode15 = (hashCode14 * 59) + (addedBy == null ? 43 : addedBy.hashCode());
        String inviteCallToAction = getInviteCallToAction();
        int hashCode16 = (hashCode15 * 59) + (inviteCallToAction == null ? 43 : inviteCallToAction.hashCode());
        String inviteDescription = getInviteDescription();
        int hashCode17 = (hashCode16 * 59) + (inviteDescription == null ? 43 : inviteDescription.hashCode());
        String kind = getKind();
        int i = hashCode17 * 59;
        int hashCode18 = kind == null ? 43 : kind.hashCode();
        GroupPreferences groupPreferences = getGroupPreferences();
        return ((i + hashCode18) * 59) + (groupPreferences != null ? groupPreferences.hashCode() : 43);
    }

    @Generated
    public void setAddedBy(PublicProfileResponse publicProfileResponse) {
        this.addedBy = publicProfileResponse;
    }

    @Generated
    public void setContentAggregations(ContentAggregationsResponse contentAggregationsResponse) {
        this.contentAggregations = contentAggregationsResponse;
    }

    @Generated
    public void setCoverNodeId(String str) {
        this.coverNodeId = str;
    }

    @Generated
    public void setCoverPhoto(PhotoResponse photoResponse) {
        this.coverPhoto = photoResponse;
    }

    @Generated
    public void setCreatedBy(String str) {
        this.createdBy = str;
    }

    @Generated
    public void setFeaturedMembers(List<MemberResponse> list) {
        this.featuredMembers = list;
    }

    @Generated
    public void setGroupId(String str) {
        this.groupId = str;
    }

    @Generated
    public void setGroupPreferences(GroupPreferences groupPreferences) {
        this.groupPreferences = groupPreferences;
    }

    @Generated
    public void setInviteCallToAction(String str) {
        this.inviteCallToAction = str;
    }

    @Generated
    public void setInviteDescription(String str) {
        this.inviteDescription = str;
    }

    @Generated
    public void setKind(String str) {
        this.kind = str;
    }

    @Generated
    public void setLastViewedDate(String str) {
        this.lastViewedDate = str;
    }

    @Generated
    public void setMemberCount(Long l) {
        this.memberCount = l;
    }

    @Generated
    public void setModifiedBy(String str) {
        this.modifiedBy = str;
    }

    @Generated
    public void setName(String str) {
        this.name = str;
    }

    @Generated
    public void setNameType(String str) {
        this.nameType = str;
    }

    @Generated
    public void setOwnedBy(String str) {
        this.ownedBy = str;
    }

    @Generated
    public void setUnseenContentAggregations(ContentAggregationsResponse contentAggregationsResponse) {
        this.unseenContentAggregations = contentAggregationsResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceResponse
    @Generated
    public String toString() {
        return "GroupResponse(groupId=" + getGroupId() + ", name=" + getName() + ", nameType=" + getNameType() + ", coverNodeId=" + getCoverNodeId() + ", coverPhoto=" + getCoverPhoto() + ", createdBy=" + getCreatedBy() + ", modifiedBy=" + getModifiedBy() + ", ownedBy=" + getOwnedBy() + ", featuredMembers=" + getFeaturedMembers() + ", memberCount=" + getMemberCount() + ", contentAggregations=" + getContentAggregations() + ", unseenContentAggregations=" + getUnseenContentAggregations() + ", lastViewedDate=" + getLastViewedDate() + ", addedBy=" + getAddedBy() + ", inviteCallToAction=" + getInviteCallToAction() + ", inviteDescription=" + getInviteDescription() + ", kind=" + getKind() + ", groupPreferences=" + getGroupPreferences() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
