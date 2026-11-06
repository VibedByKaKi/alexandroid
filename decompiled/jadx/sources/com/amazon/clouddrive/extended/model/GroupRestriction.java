package com.amazon.clouddrive.extended.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class GroupRestriction {
    private final Boolean isContentRestricted;
    private final Boolean isJoinRestricted;
    private final Boolean isReactionRestricted;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GroupRestrictionBuilder {
        private Boolean isContentRestricted;
        private Boolean isJoinRestricted;
        private Boolean isReactionRestricted;

        public GroupRestriction build() {
            return new GroupRestriction(this.isContentRestricted, this.isReactionRestricted, this.isJoinRestricted);
        }

        public GroupRestrictionBuilder isContentRestricted(Boolean bool) {
            this.isContentRestricted = bool;
            return this;
        }

        public GroupRestrictionBuilder isJoinRestricted(Boolean bool) {
            this.isJoinRestricted = bool;
            return this;
        }

        public GroupRestrictionBuilder isReactionRestricted(Boolean bool) {
            this.isReactionRestricted = bool;
            return this;
        }

        public String toString() {
            return "GroupRestriction.GroupRestrictionBuilder(isContentRestricted=" + this.isContentRestricted + ", isReactionRestricted=" + this.isReactionRestricted + ", isJoinRestricted=" + this.isJoinRestricted + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public GroupRestriction(Boolean bool, Boolean bool2, Boolean bool3) {
        this.isContentRestricted = bool;
        this.isReactionRestricted = bool2;
        this.isJoinRestricted = bool3;
    }

    public static GroupRestrictionBuilder builder() {
        return new GroupRestrictionBuilder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupRestriction)) {
            return false;
        }
        GroupRestriction groupRestriction = (GroupRestriction) obj;
        Boolean isContentRestricted = getIsContentRestricted();
        Boolean isContentRestricted2 = groupRestriction.getIsContentRestricted();
        if (isContentRestricted != null ? !isContentRestricted.equals(isContentRestricted2) : isContentRestricted2 != null) {
            return false;
        }
        Boolean isReactionRestricted = getIsReactionRestricted();
        Boolean isReactionRestricted2 = groupRestriction.getIsReactionRestricted();
        if (isReactionRestricted != null ? !isReactionRestricted.equals(isReactionRestricted2) : isReactionRestricted2 != null) {
            return false;
        }
        Boolean isJoinRestricted = getIsJoinRestricted();
        Boolean isJoinRestricted2 = groupRestriction.getIsJoinRestricted();
        return isJoinRestricted != null ? isJoinRestricted.equals(isJoinRestricted2) : isJoinRestricted2 == null;
    }

    public Boolean getIsContentRestricted() {
        return this.isContentRestricted;
    }

    public Boolean getIsJoinRestricted() {
        return this.isJoinRestricted;
    }

    public Boolean getIsReactionRestricted() {
        return this.isReactionRestricted;
    }

    public int hashCode() {
        Boolean isContentRestricted = getIsContentRestricted();
        int hashCode = isContentRestricted == null ? 43 : isContentRestricted.hashCode();
        Boolean isReactionRestricted = getIsReactionRestricted();
        int i = (hashCode + 59) * 59;
        int hashCode2 = isReactionRestricted == null ? 43 : isReactionRestricted.hashCode();
        Boolean isJoinRestricted = getIsJoinRestricted();
        return ((i + hashCode2) * 59) + (isJoinRestricted != null ? isJoinRestricted.hashCode() : 43);
    }

    public String toString() {
        return "GroupRestriction(isContentRestricted=" + getIsContentRestricted() + ", isReactionRestricted=" + getIsReactionRestricted() + ", isJoinRestricted=" + getIsJoinRestricted() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
