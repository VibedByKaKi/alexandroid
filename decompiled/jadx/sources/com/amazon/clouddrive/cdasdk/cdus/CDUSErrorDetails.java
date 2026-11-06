package com.amazon.clouddrive.cdasdk.cdus;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CDUSErrorDetails {

    @SerializedName("conflictNodeIds")
    @Expose
    private List<String> conflictNodeIds;

    @Generated
    public CDUSErrorDetails() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CDUSErrorDetails;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CDUSErrorDetails)) {
            return false;
        }
        CDUSErrorDetails cDUSErrorDetails = (CDUSErrorDetails) obj;
        if (!cDUSErrorDetails.canEqual(this)) {
            return false;
        }
        List<String> conflictNodeIds = getConflictNodeIds();
        List<String> conflictNodeIds2 = cDUSErrorDetails.getConflictNodeIds();
        return conflictNodeIds != null ? conflictNodeIds.equals(conflictNodeIds2) : conflictNodeIds2 == null;
    }

    @Generated
    public List<String> getConflictNodeIds() {
        return this.conflictNodeIds;
    }

    @Generated
    public int hashCode() {
        List<String> conflictNodeIds = getConflictNodeIds();
        return 59 + (conflictNodeIds == null ? 43 : conflictNodeIds.hashCode());
    }

    @Generated
    public void setConflictNodeIds(List<String> list) {
        this.conflictNodeIds = list;
    }

    @Generated
    public String toString() {
        return "CDUSErrorDetails(conflictNodeIds=" + getConflictNodeIds() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
