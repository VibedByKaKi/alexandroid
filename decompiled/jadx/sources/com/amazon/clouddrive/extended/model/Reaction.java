package com.amazon.clouddrive.extended.model;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Reaction {
    private final String author;
    private final Profile authorProfile;
    private final String body;
    private final List<GroupCoverPhoto> coverPhotos;
    private final String createdDate;
    private final String groupId;
    private final String kind;
    private final String modifiedDate;
    private final String reactionId;
    private final String topic;
    private final ContentAggregations topicContentAggregations;
    private final TopicInfo topicInfo;
    private final Profile topicOwner;
    private final Long version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        protected String author;
        protected Profile authorProfile;
        protected String body;
        protected List<GroupCoverPhoto> coverPhotos;
        protected String createdDate;
        protected String groupId;
        protected String kind;
        protected String modifiedDate;
        protected String reactionId;
        protected String topic;
        protected ContentAggregations topicContentAggregations;
        protected TopicInfo topicInfo;
        protected Profile topicOwner;
        protected Long version;

        public Reaction build() {
            return new Reaction(this.groupId, this.reactionId, this.kind, this.body, this.topic, this.author, this.version, this.modifiedDate, this.createdDate, this.authorProfile, this.topicInfo, this.coverPhotos, this.topicOwner, this.topicContentAggregations);
        }

        public String toString() {
            return "Reaction{groupId='" + this.groupId + "', reactionId='" + this.reactionId + "', kind='" + this.kind + "', body='" + this.body + "', topic='" + this.topic + "', author='" + this.author + "', version=" + this.version + ", modifiedDate='" + this.modifiedDate + "', createdDate='" + this.createdDate + "', authorProfile='" + this.authorProfile + "', topicInfo='" + this.topicInfo + "', coverPhotos='" + this.coverPhotos + "', topicOwner='" + this.topicOwner + "', topicContentAggregations='" + this.topicContentAggregations + "'}";
        }

        public Builder withAuthor(String str) {
            this.author = str;
            return this;
        }

        public Builder withAuthorProfile(Profile profile) {
            this.authorProfile = profile;
            return this;
        }

        public Builder withBody(String str) {
            this.body = str;
            return this;
        }

        public Builder withCoverPhotos(List<GroupCoverPhoto> list) {
            this.coverPhotos = list;
            return this;
        }

        public Builder withCreatedDate(String str) {
            this.createdDate = str;
            return this;
        }

        public Builder withGroupId(String str) {
            this.groupId = str;
            return this;
        }

        public Builder withKind(String str) {
            this.kind = str;
            return this;
        }

        public Builder withModifiedDate(String str) {
            this.modifiedDate = str;
            return this;
        }

        public Builder withReactionId(String str) {
            this.reactionId = str;
            return this;
        }

        public Builder withTopic(String str) {
            this.topic = str;
            return this;
        }

        public Builder withTopicContentAggregations(ContentAggregations contentAggregations) {
            this.topicContentAggregations = contentAggregations;
            return this;
        }

        public Builder withTopicInfo(TopicInfo topicInfo) {
            this.topicInfo = topicInfo;
            return this;
        }

        public Builder withTopicOwner(Profile profile) {
            this.topicOwner = profile;
            return this;
        }

        public Builder withVersion(Long l) {
            this.version = l;
            return this;
        }
    }

    public Reaction(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, String str8, Profile profile, TopicInfo topicInfo, List<GroupCoverPhoto> list, Profile profile2, ContentAggregations contentAggregations) {
        this.groupId = str;
        this.reactionId = str2;
        this.kind = str3;
        this.body = str4;
        this.topic = str5;
        this.author = str6;
        this.version = l;
        this.modifiedDate = str7;
        this.createdDate = str8;
        this.authorProfile = profile;
        this.topicInfo = topicInfo;
        this.coverPhotos = list;
        this.topicOwner = profile2;
        this.topicContentAggregations = contentAggregations;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reaction)) {
            return false;
        }
        Reaction reaction = (Reaction) obj;
        if (getGroupId() == null ? reaction.getGroupId() == null : getGroupId().equals(reaction.getGroupId())) {
            if (getReactionId() == null ? reaction.getReactionId() == null : getReactionId().equals(reaction.getReactionId())) {
                if (getKind() == null ? reaction.getKind() == null : getKind().equals(reaction.getKind())) {
                    if (getBody() == null ? reaction.getBody() == null : getBody().equals(reaction.getBody())) {
                        if (getTopic() == null ? reaction.getTopic() == null : getTopic().equals(reaction.getTopic())) {
                            if (getAuthor() == null ? reaction.getAuthor() == null : getAuthor().equals(reaction.getAuthor())) {
                                if (getVersion() == null ? reaction.getVersion() == null : getVersion().equals(reaction.getVersion())) {
                                    if (getModifiedDate() == null ? reaction.getModifiedDate() == null : getModifiedDate().equals(reaction.getModifiedDate())) {
                                        if (getCreatedDate() == null ? reaction.getCreatedDate() == null : getCreatedDate().equals(reaction.getCreatedDate())) {
                                            if (getAuthorProfile() == null ? reaction.getAuthorProfile() == null : getAuthorProfile().equals(reaction.getAuthorProfile())) {
                                                if (getTopicInfo() == null ? reaction.getTopicInfo() == null : getTopicInfo().equals(reaction.getTopicInfo())) {
                                                    if (getCoverPhotos() == null ? reaction.getCoverPhotos() == null : getCoverPhotos().equals(reaction.getCoverPhotos())) {
                                                        if (getTopicContentAggregations() == null ? reaction.getTopicContentAggregations() == null : getTopicContentAggregations().equals(reaction.getTopicContentAggregations())) {
                                                            if (getTopicOwner() == null ? reaction.getTopicOwner() == null : getTopicOwner().equals(reaction.getTopicOwner())) {
                                                                return true;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String getAuthor() {
        return this.author;
    }

    public Profile getAuthorProfile() {
        return this.authorProfile;
    }

    public String getBody() {
        return this.body;
    }

    public List<GroupCoverPhoto> getCoverPhotos() {
        return this.coverPhotos;
    }

    public String getCreatedDate() {
        return this.createdDate;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public String getKind() {
        return this.kind;
    }

    public String getModifiedDate() {
        return this.modifiedDate;
    }

    public String getReactionId() {
        return this.reactionId;
    }

    public String getTopic() {
        return this.topic;
    }

    public ContentAggregations getTopicContentAggregations() {
        return this.topicContentAggregations;
    }

    public TopicInfo getTopicInfo() {
        return this.topicInfo;
    }

    public Profile getTopicOwner() {
        return this.topicOwner;
    }

    public Long getVersion() {
        return this.version;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((getGroupId() != null ? getGroupId().hashCode() : 0) * 31) + (getReactionId() != null ? getReactionId().hashCode() : 0)) * 31) + (getKind() != null ? getKind().hashCode() : 0)) * 31) + (getBody() != null ? getBody().hashCode() : 0)) * 31) + (getTopic() != null ? getTopic().hashCode() : 0)) * 31) + (getAuthor() != null ? getAuthor().hashCode() : 0)) * 31) + (getVersion() != null ? getVersion().hashCode() : 0)) * 31) + (getModifiedDate() != null ? getModifiedDate().hashCode() : 0)) * 31) + (getCreatedDate() != null ? getCreatedDate().hashCode() : 0)) * 31) + (getAuthorProfile() != null ? getAuthorProfile().hashCode() : 0)) * 31) + (getTopicInfo() != null ? getTopicInfo().hashCode() : 0)) * 31) + (getCoverPhotos() != null ? getCoverPhotos().hashCode() : 0)) * 31) + (getTopicOwner() != null ? getTopicOwner().hashCode() : 0)) * 31) + (getTopicContentAggregations() != null ? getTopicContentAggregations().hashCode() : 0);
    }

    public String toString() {
        return "Reaction{groupId='" + this.groupId + "', reactionId='" + this.reactionId + "', kind='" + this.kind + "', body='" + this.body + "', topic='" + this.topic + "', author='" + this.author + "', version=" + this.version + ", modifiedDate='" + this.modifiedDate + "', createdDate='" + this.createdDate + "', authorProfile='" + this.authorProfile + "', topicInfo='" + this.topicInfo + "', coverPhotos='" + this.coverPhotos + "', topicOwner='" + this.topicOwner + "', topicContentAggregations='" + this.topicContentAggregations + "'}";
    }
}
