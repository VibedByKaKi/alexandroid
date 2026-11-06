package com.amazon.clouddrive.cdasdk.prompto.collections;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceResponse;
import com.amazon.clouddrive.cdasdk.prompto.contentAggregations.ContentAggregationsResponse;
import com.amazon.clouddrive.cdasdk.prompto.nodes.GroupNode;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupCollectionResponse extends PromptoServiceResponse {

    @SerializedName("caption")
    @Expose
    private String caption;

    @SerializedName("collectionId")
    @Expose
    private String collectionId;

    @SerializedName("contentAggregations")
    @Expose
    private ContentAggregationsResponse contentAggregations;

    @SerializedName("dateAdded")
    @Expose
    private String dateAdded;

    @SerializedName("eventIds")
    @Expose
    private List<String> eventIds;

    @SerializedName(FragmentMetaData.GROUP_ID)
    @Expose
    private String groupId;

    @SerializedName("groupNodes")
    @Expose
    private List<GroupNode> groupNodes;

    @SerializedName(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME)
    @Expose
    private String kind;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName(MessagingControllerConstant.MESSAGING_CONTROLLER_OWNER_ID_KEY)
    @Expose
    private String ownerId;

    @SerializedName("reactionTopic")
    @Expose
    private String reactionTopic;

    @SerializedName("status")
    @Expose
    private String status;

    @Generated
    public GroupCollectionResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GroupCollectionResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupCollectionResponse)) {
            return false;
        }
        GroupCollectionResponse groupCollectionResponse = (GroupCollectionResponse) obj;
        if (!groupCollectionResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String collectionId = getCollectionId();
        String collectionId2 = groupCollectionResponse.getCollectionId();
        if (collectionId != null ? !collectionId.equals(collectionId2) : collectionId2 != null) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = groupCollectionResponse.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String ownerId = getOwnerId();
        String ownerId2 = groupCollectionResponse.getOwnerId();
        if (ownerId != null ? !ownerId.equals(ownerId2) : ownerId2 != null) {
            return false;
        }
        String kind = getKind();
        String kind2 = groupCollectionResponse.getKind();
        if (kind != null ? !kind.equals(kind2) : kind2 != null) {
            return false;
        }
        String caption = getCaption();
        String caption2 = groupCollectionResponse.getCaption();
        if (caption != null ? !caption.equals(caption2) : caption2 != null) {
            return false;
        }
        String name = getName();
        String name2 = groupCollectionResponse.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String dateAdded = getDateAdded();
        String dateAdded2 = groupCollectionResponse.getDateAdded();
        if (dateAdded != null ? !dateAdded.equals(dateAdded2) : dateAdded2 != null) {
            return false;
        }
        ContentAggregationsResponse contentAggregations = getContentAggregations();
        ContentAggregationsResponse contentAggregations2 = groupCollectionResponse.getContentAggregations();
        if (contentAggregations != null ? !contentAggregations.equals(contentAggregations2) : contentAggregations2 != null) {
            return false;
        }
        List<GroupNode> groupNodes = getGroupNodes();
        List<GroupNode> groupNodes2 = groupCollectionResponse.getGroupNodes();
        if (groupNodes != null ? !groupNodes.equals(groupNodes2) : groupNodes2 != null) {
            return false;
        }
        List<String> eventIds = getEventIds();
        List<String> eventIds2 = groupCollectionResponse.getEventIds();
        if (eventIds != null ? !eventIds.equals(eventIds2) : eventIds2 != null) {
            return false;
        }
        String status = getStatus();
        String status2 = groupCollectionResponse.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        String reactionTopic = getReactionTopic();
        String reactionTopic2 = groupCollectionResponse.getReactionTopic();
        return reactionTopic != null ? reactionTopic.equals(reactionTopic2) : reactionTopic2 == null;
    }

    @Generated
    public String getCaption() {
        return this.caption;
    }

    @Generated
    public String getCollectionId() {
        return this.collectionId;
    }

    @Generated
    public ContentAggregationsResponse getContentAggregations() {
        return this.contentAggregations;
    }

    @Generated
    public String getDateAdded() {
        return this.dateAdded;
    }

    @Generated
    public List<String> getEventIds() {
        return this.eventIds;
    }

    @Generated
    public String getGroupId() {
        return this.groupId;
    }

    @Generated
    public List<GroupNode> getGroupNodes() {
        return this.groupNodes;
    }

    @Generated
    public String getKind() {
        return this.kind;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public String getOwnerId() {
        return this.ownerId;
    }

    @Generated
    public String getReactionTopic() {
        return this.reactionTopic;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String collectionId = getCollectionId();
        int hashCode2 = (hashCode * 59) + (collectionId == null ? 43 : collectionId.hashCode());
        String groupId = getGroupId();
        int hashCode3 = (hashCode2 * 59) + (groupId == null ? 43 : groupId.hashCode());
        String ownerId = getOwnerId();
        int hashCode4 = (hashCode3 * 59) + (ownerId == null ? 43 : ownerId.hashCode());
        String kind = getKind();
        int hashCode5 = (hashCode4 * 59) + (kind == null ? 43 : kind.hashCode());
        String caption = getCaption();
        int hashCode6 = (hashCode5 * 59) + (caption == null ? 43 : caption.hashCode());
        String name = getName();
        int hashCode7 = (hashCode6 * 59) + (name == null ? 43 : name.hashCode());
        String dateAdded = getDateAdded();
        int hashCode8 = (hashCode7 * 59) + (dateAdded == null ? 43 : dateAdded.hashCode());
        ContentAggregationsResponse contentAggregations = getContentAggregations();
        int hashCode9 = (hashCode8 * 59) + (contentAggregations == null ? 43 : contentAggregations.hashCode());
        List<GroupNode> groupNodes = getGroupNodes();
        int hashCode10 = (hashCode9 * 59) + (groupNodes == null ? 43 : groupNodes.hashCode());
        List<String> eventIds = getEventIds();
        int hashCode11 = (hashCode10 * 59) + (eventIds == null ? 43 : eventIds.hashCode());
        String status = getStatus();
        int i = hashCode11 * 59;
        int hashCode12 = status == null ? 43 : status.hashCode();
        String reactionTopic = getReactionTopic();
        return ((i + hashCode12) * 59) + (reactionTopic != null ? reactionTopic.hashCode() : 43);
    }

    @Generated
    public void setCaption(String str) {
        this.caption = str;
    }

    @Generated
    public void setCollectionId(String str) {
        this.collectionId = str;
    }

    @Generated
    public void setContentAggregations(ContentAggregationsResponse contentAggregationsResponse) {
        this.contentAggregations = contentAggregationsResponse;
    }

    @Generated
    public void setDateAdded(String str) {
        this.dateAdded = str;
    }

    @Generated
    public void setEventIds(List<String> list) {
        this.eventIds = list;
    }

    @Generated
    public void setGroupId(String str) {
        this.groupId = str;
    }

    @Generated
    public void setGroupNodes(List<GroupNode> list) {
        this.groupNodes = list;
    }

    @Generated
    public void setKind(String str) {
        this.kind = str;
    }

    @Generated
    public void setName(String str) {
        this.name = str;
    }

    @Generated
    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    @Generated
    public void setReactionTopic(String str) {
        this.reactionTopic = str;
    }

    @Generated
    public void setStatus(String str) {
        this.status = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.prompto.common.PromptoServiceResponse
    @Generated
    public String toString() {
        return "GroupCollectionResponse(collectionId=" + getCollectionId() + ", groupId=" + getGroupId() + ", ownerId=" + getOwnerId() + ", kind=" + getKind() + ", caption=" + getCaption() + ", name=" + getName() + ", dateAdded=" + getDateAdded() + ", contentAggregations=" + getContentAggregations() + ", groupNodes=" + getGroupNodes() + ", eventIds=" + getEventIds() + ", status=" + getStatus() + ", reactionTopic=" + getReactionTopic() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
