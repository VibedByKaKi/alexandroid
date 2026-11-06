package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.model.CloudDriveResponse;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupEventResponse implements CloudDriveResponse {
    private String addedBy;
    private Profile addedByProfile;
    private String caption;
    private ContentAggregations contentAggregations;
    private List<NodeExtended> coverNodes;
    private String dateAdded;
    private String eventId;
    private String groupId;
    private EventParent parent;
    private ReactionSummary reactionSummary;
    private String reactionTopic;
    private String subtitle;

    public boolean canEqual(Object obj) {
        return obj instanceof GroupEventResponse;
    }

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse instanceof GroupEventResponse) {
            return cloudDriveResponse.hashCode() - hashCode();
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupEventResponse)) {
            return false;
        }
        GroupEventResponse groupEventResponse = (GroupEventResponse) obj;
        if (!groupEventResponse.canEqual(this)) {
            return false;
        }
        String eventId = getEventId();
        String eventId2 = groupEventResponse.getEventId();
        if (eventId != null ? !eventId.equals(eventId2) : eventId2 != null) {
            return false;
        }
        String groupId = getGroupId();
        String groupId2 = groupEventResponse.getGroupId();
        if (groupId != null ? !groupId.equals(groupId2) : groupId2 != null) {
            return false;
        }
        String addedBy = getAddedBy();
        String addedBy2 = groupEventResponse.getAddedBy();
        if (addedBy != null ? !addedBy.equals(addedBy2) : addedBy2 != null) {
            return false;
        }
        Profile addedByProfile = getAddedByProfile();
        Profile addedByProfile2 = groupEventResponse.getAddedByProfile();
        if (addedByProfile != null ? !addedByProfile.equals(addedByProfile2) : addedByProfile2 != null) {
            return false;
        }
        String dateAdded = getDateAdded();
        String dateAdded2 = groupEventResponse.getDateAdded();
        if (dateAdded != null ? !dateAdded.equals(dateAdded2) : dateAdded2 != null) {
            return false;
        }
        EventParent parent = getParent();
        EventParent parent2 = groupEventResponse.getParent();
        if (parent != null ? !parent.equals(parent2) : parent2 != null) {
            return false;
        }
        String reactionTopic = getReactionTopic();
        String reactionTopic2 = groupEventResponse.getReactionTopic();
        if (reactionTopic != null ? !reactionTopic.equals(reactionTopic2) : reactionTopic2 != null) {
            return false;
        }
        ReactionSummary reactionSummary = getReactionSummary();
        ReactionSummary reactionSummary2 = groupEventResponse.getReactionSummary();
        if (reactionSummary != null ? !reactionSummary.equals(reactionSummary2) : reactionSummary2 != null) {
            return false;
        }
        String caption = getCaption();
        String caption2 = groupEventResponse.getCaption();
        if (caption != null ? !caption.equals(caption2) : caption2 != null) {
            return false;
        }
        String subtitle = getSubtitle();
        String subtitle2 = groupEventResponse.getSubtitle();
        if (subtitle != null ? !subtitle.equals(subtitle2) : subtitle2 != null) {
            return false;
        }
        List<NodeExtended> coverNodes = getCoverNodes();
        List<NodeExtended> coverNodes2 = groupEventResponse.getCoverNodes();
        if (coverNodes != null ? !coverNodes.equals(coverNodes2) : coverNodes2 != null) {
            return false;
        }
        ContentAggregations contentAggregations = getContentAggregations();
        ContentAggregations contentAggregations2 = groupEventResponse.getContentAggregations();
        return contentAggregations != null ? contentAggregations.equals(contentAggregations2) : contentAggregations2 == null;
    }

    public String getAddedBy() {
        return this.addedBy;
    }

    public Profile getAddedByProfile() {
        return this.addedByProfile;
    }

    public String getCaption() {
        return this.caption;
    }

    public ContentAggregations getContentAggregations() {
        return this.contentAggregations;
    }

    public List<NodeExtended> getCoverNodes() {
        return this.coverNodes;
    }

    public String getDateAdded() {
        return this.dateAdded;
    }

    public String getEventId() {
        return this.eventId;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public EventParent getParent() {
        return this.parent;
    }

    public ReactionSummary getReactionSummary() {
        return this.reactionSummary;
    }

    public String getReactionTopic() {
        return this.reactionTopic;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        String eventId = getEventId();
        int hashCode = eventId == null ? 43 : eventId.hashCode();
        String groupId = getGroupId();
        int hashCode2 = ((hashCode + 59) * 59) + (groupId == null ? 43 : groupId.hashCode());
        String addedBy = getAddedBy();
        int hashCode3 = (hashCode2 * 59) + (addedBy == null ? 43 : addedBy.hashCode());
        Profile addedByProfile = getAddedByProfile();
        int hashCode4 = (hashCode3 * 59) + (addedByProfile == null ? 43 : addedByProfile.hashCode());
        String dateAdded = getDateAdded();
        int hashCode5 = (hashCode4 * 59) + (dateAdded == null ? 43 : dateAdded.hashCode());
        EventParent parent = getParent();
        int hashCode6 = (hashCode5 * 59) + (parent == null ? 43 : parent.hashCode());
        String reactionTopic = getReactionTopic();
        int hashCode7 = (hashCode6 * 59) + (reactionTopic == null ? 43 : reactionTopic.hashCode());
        ReactionSummary reactionSummary = getReactionSummary();
        int hashCode8 = (hashCode7 * 59) + (reactionSummary == null ? 43 : reactionSummary.hashCode());
        String caption = getCaption();
        int hashCode9 = (hashCode8 * 59) + (caption == null ? 43 : caption.hashCode());
        String subtitle = getSubtitle();
        int hashCode10 = (hashCode9 * 59) + (subtitle == null ? 43 : subtitle.hashCode());
        List<NodeExtended> coverNodes = getCoverNodes();
        int i = hashCode10 * 59;
        int hashCode11 = coverNodes == null ? 43 : coverNodes.hashCode();
        ContentAggregations contentAggregations = getContentAggregations();
        return ((i + hashCode11) * 59) + (contentAggregations != null ? contentAggregations.hashCode() : 43);
    }

    public void setAddedBy(String str) {
        this.addedBy = str;
    }

    public void setAddedByProfile(Profile profile) {
        this.addedByProfile = profile;
    }

    public void setCaption(String str) {
        this.caption = str;
    }

    public void setContentAggregations(ContentAggregations contentAggregations) {
        this.contentAggregations = contentAggregations;
    }

    public void setCoverNodes(List<NodeExtended> list) {
        this.coverNodes = list;
    }

    public void setDateAdded(String str) {
        this.dateAdded = str;
    }

    public void setEventId(String str) {
        this.eventId = str;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setParent(EventParent eventParent) {
        this.parent = eventParent;
    }

    public void setReactionSummary(ReactionSummary reactionSummary) {
        this.reactionSummary = reactionSummary;
    }

    public void setReactionTopic(String str) {
        this.reactionTopic = str;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public String toString() {
        return "GroupEventResponse(eventId=" + getEventId() + ", groupId=" + getGroupId() + ", addedBy=" + getAddedBy() + ", addedByProfile=" + getAddedByProfile() + ", dateAdded=" + getDateAdded() + ", parent=" + getParent() + ", reactionTopic=" + getReactionTopic() + ", reactionSummary=" + getReactionSummary() + ", caption=" + getCaption() + ", subtitle=" + getSubtitle() + ", coverNodes=" + getCoverNodes() + ", contentAggregations=" + getContentAggregations() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
