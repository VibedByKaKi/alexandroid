package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ReactionSummary {
    private final String callerReaction;
    private final Integer commentCount;
    private final Integer count;
    private final Map<String, Integer> counts;
    private final Boolean isLikedByCaller;
    private final Integer likeCount;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ReactionSummaryBuilder {
        private String callerReaction;
        private Integer commentCount;
        private Integer count;
        private Map<String, Integer> counts;
        private Boolean isLikedByCaller;
        private Integer likeCount;

        public ReactionSummary build() {
            return new ReactionSummary(this.commentCount, this.count, this.isLikedByCaller, this.likeCount, this.counts, this.callerReaction);
        }

        public ReactionSummaryBuilder callerReaction(String str) {
            this.callerReaction = str;
            return this;
        }

        public ReactionSummaryBuilder commentCount(Integer num) {
            this.commentCount = num;
            return this;
        }

        public ReactionSummaryBuilder count(Integer num) {
            this.count = num;
            return this;
        }

        public ReactionSummaryBuilder counts(Map<String, Integer> map) {
            this.counts = map;
            return this;
        }

        public ReactionSummaryBuilder isLikedByCaller(Boolean bool) {
            this.isLikedByCaller = bool;
            return this;
        }

        public ReactionSummaryBuilder likeCount(Integer num) {
            this.likeCount = num;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ReactionSummary.ReactionSummaryBuilder(commentCount=");
            sb.append(this.commentCount);
            sb.append(", count=");
            sb.append(this.count);
            sb.append(", isLikedByCaller=");
            sb.append(this.isLikedByCaller);
            sb.append(", likeCount=");
            sb.append(this.likeCount);
            sb.append(", counts=");
            sb.append(this.counts);
            sb.append(", callerReaction=");
            return a$$ExternalSyntheticOutline0.m(sb, this.callerReaction, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public ReactionSummary(Integer num, Integer num2, Boolean bool, Integer num3, Map<String, Integer> map, String str) {
        this.commentCount = num;
        this.count = num2;
        this.isLikedByCaller = bool;
        this.likeCount = num3;
        this.counts = map;
        this.callerReaction = str;
    }

    public static ReactionSummaryBuilder builder() {
        return new ReactionSummaryBuilder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReactionSummary)) {
            return false;
        }
        ReactionSummary reactionSummary = (ReactionSummary) obj;
        Integer commentCount = getCommentCount();
        Integer commentCount2 = reactionSummary.getCommentCount();
        if (commentCount != null ? !commentCount.equals(commentCount2) : commentCount2 != null) {
            return false;
        }
        Integer count = getCount();
        Integer count2 = reactionSummary.getCount();
        if (count != null ? !count.equals(count2) : count2 != null) {
            return false;
        }
        Boolean isLikedByCaller = getIsLikedByCaller();
        Boolean isLikedByCaller2 = reactionSummary.getIsLikedByCaller();
        if (isLikedByCaller != null ? !isLikedByCaller.equals(isLikedByCaller2) : isLikedByCaller2 != null) {
            return false;
        }
        Integer likeCount = getLikeCount();
        Integer likeCount2 = reactionSummary.getLikeCount();
        if (likeCount != null ? !likeCount.equals(likeCount2) : likeCount2 != null) {
            return false;
        }
        Map<String, Integer> counts = getCounts();
        Map<String, Integer> counts2 = reactionSummary.getCounts();
        if (counts != null ? !counts.equals(counts2) : counts2 != null) {
            return false;
        }
        String callerReaction = getCallerReaction();
        String callerReaction2 = reactionSummary.getCallerReaction();
        return callerReaction != null ? callerReaction.equals(callerReaction2) : callerReaction2 == null;
    }

    public String getCallerReaction() {
        return this.callerReaction;
    }

    public Integer getCommentCount() {
        return this.commentCount;
    }

    public Integer getCount() {
        return this.count;
    }

    public Map<String, Integer> getCounts() {
        return this.counts;
    }

    public Boolean getIsLikedByCaller() {
        return this.isLikedByCaller;
    }

    public Integer getLikeCount() {
        return this.likeCount;
    }

    public int hashCode() {
        Integer commentCount = getCommentCount();
        int hashCode = commentCount == null ? 43 : commentCount.hashCode();
        Integer count = getCount();
        int hashCode2 = ((hashCode + 59) * 59) + (count == null ? 43 : count.hashCode());
        Boolean isLikedByCaller = getIsLikedByCaller();
        int hashCode3 = (hashCode2 * 59) + (isLikedByCaller == null ? 43 : isLikedByCaller.hashCode());
        Integer likeCount = getLikeCount();
        int hashCode4 = (hashCode3 * 59) + (likeCount == null ? 43 : likeCount.hashCode());
        Map<String, Integer> counts = getCounts();
        int i = hashCode4 * 59;
        int hashCode5 = counts == null ? 43 : counts.hashCode();
        String callerReaction = getCallerReaction();
        return ((i + hashCode5) * 59) + (callerReaction != null ? callerReaction.hashCode() : 43);
    }

    public String toString() {
        return "ReactionSummary(commentCount=" + getCommentCount() + ", count=" + getCount() + ", isLikedByCaller=" + getIsLikedByCaller() + ", likeCount=" + getLikeCount() + ", counts=" + getCounts() + ", callerReaction=" + getCallerReaction() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
