package com.amazon.clouddrive.cdasdk.prompto.reactions;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ReactionSummaryResponse {

    @SerializedName("count")
    @Expose
    private Integer count;

    @Generated
    public ReactionSummaryResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ReactionSummaryResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReactionSummaryResponse)) {
            return false;
        }
        ReactionSummaryResponse reactionSummaryResponse = (ReactionSummaryResponse) obj;
        if (!reactionSummaryResponse.canEqual(this)) {
            return false;
        }
        Integer count = getCount();
        Integer count2 = reactionSummaryResponse.getCount();
        return count != null ? count.equals(count2) : count2 == null;
    }

    @Generated
    public Integer getCount() {
        return this.count;
    }

    @Generated
    public int hashCode() {
        Integer count = getCount();
        return 59 + (count == null ? 43 : count.hashCode());
    }

    @Generated
    public void setCount(Integer num) {
        this.count = num;
    }

    @Generated
    public String toString() {
        return "ReactionSummaryResponse(count=" + getCount() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
