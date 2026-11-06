package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class CompleteState {
    private String endpointID;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CompleteState() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CompleteState;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompleteState)) {
            return false;
        }
        CompleteState completeState = (CompleteState) obj;
        if (!completeState.canEqual(this)) {
            return false;
        }
        String endpointID = getEndpointID();
        String endpointID2 = completeState.getEndpointID();
        return endpointID != null ? endpointID.equals(endpointID2) : endpointID2 == null;
    }

    @JsonProperty("endpointID")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getEndpointID() {
        return this.endpointID;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String endpointID = getEndpointID();
        return 59 + (endpointID == null ? 43 : endpointID.hashCode());
    }

    @JsonProperty("endpointID")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setEndpointID(String str) {
        this.endpointID = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CompleteState(endpointID=" + getEndpointID() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
