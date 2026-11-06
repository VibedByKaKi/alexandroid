package com.amazon.clouddrive.cdasdk.prompto.groups;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GroupPreferences {

    @SerializedName("isContentRestricted")
    @Expose
    private Boolean isContentRestricted;

    @SerializedName("isJoinRestricted")
    @Expose
    private Boolean isJoinRestricted;

    @SerializedName("isReactionRestricted")
    @Expose
    private Boolean isReactionRestricted;

    @Generated
    public GroupPreferences() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GroupPreferences;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupPreferences)) {
            return false;
        }
        GroupPreferences groupPreferences = (GroupPreferences) obj;
        if (!groupPreferences.canEqual(this)) {
            return false;
        }
        Boolean isContentRestricted = getIsContentRestricted();
        Boolean isContentRestricted2 = groupPreferences.getIsContentRestricted();
        if (isContentRestricted != null ? !isContentRestricted.equals(isContentRestricted2) : isContentRestricted2 != null) {
            return false;
        }
        Boolean isReactionRestricted = getIsReactionRestricted();
        Boolean isReactionRestricted2 = groupPreferences.getIsReactionRestricted();
        if (isReactionRestricted != null ? !isReactionRestricted.equals(isReactionRestricted2) : isReactionRestricted2 != null) {
            return false;
        }
        Boolean isJoinRestricted = getIsJoinRestricted();
        Boolean isJoinRestricted2 = groupPreferences.getIsJoinRestricted();
        return isJoinRestricted != null ? isJoinRestricted.equals(isJoinRestricted2) : isJoinRestricted2 == null;
    }

    @Generated
    public Boolean getIsContentRestricted() {
        return this.isContentRestricted;
    }

    @Generated
    public Boolean getIsJoinRestricted() {
        return this.isJoinRestricted;
    }

    @Generated
    public Boolean getIsReactionRestricted() {
        return this.isReactionRestricted;
    }

    @Generated
    public int hashCode() {
        Boolean isContentRestricted = getIsContentRestricted();
        int hashCode = isContentRestricted == null ? 43 : isContentRestricted.hashCode();
        Boolean isReactionRestricted = getIsReactionRestricted();
        int i = (hashCode + 59) * 59;
        int hashCode2 = isReactionRestricted == null ? 43 : isReactionRestricted.hashCode();
        Boolean isJoinRestricted = getIsJoinRestricted();
        return ((i + hashCode2) * 59) + (isJoinRestricted != null ? isJoinRestricted.hashCode() : 43);
    }

    @Generated
    public void setIsContentRestricted(Boolean bool) {
        this.isContentRestricted = bool;
    }

    @Generated
    public void setIsJoinRestricted(Boolean bool) {
        this.isJoinRestricted = bool;
    }

    @Generated
    public void setIsReactionRestricted(Boolean bool) {
        this.isReactionRestricted = bool;
    }

    @Generated
    public String toString() {
        return "GroupPreferences(isContentRestricted=" + getIsContentRestricted() + ", isReactionRestricted=" + getIsReactionRestricted() + ", isJoinRestricted=" + getIsJoinRestricted() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
