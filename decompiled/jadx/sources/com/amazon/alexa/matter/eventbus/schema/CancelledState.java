package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class CancelledState {
    private InProgressState lastKnownState;
    private CancellationReason reason;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CancelledState() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CancelledState;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CancelledState)) {
            return false;
        }
        CancelledState cancelledState = (CancelledState) obj;
        if (!cancelledState.canEqual(this)) {
            return false;
        }
        InProgressState lastKnownState = getLastKnownState();
        InProgressState lastKnownState2 = cancelledState.getLastKnownState();
        if (lastKnownState != null ? !lastKnownState.equals(lastKnownState2) : lastKnownState2 != null) {
            return false;
        }
        CancellationReason reason = getReason();
        CancellationReason reason2 = cancelledState.getReason();
        return reason != null ? reason.equals(reason2) : reason2 == null;
    }

    @JsonProperty("lastKnownState")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public InProgressState getLastKnownState() {
        return this.lastKnownState;
    }

    @JsonProperty("reason")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CancellationReason getReason() {
        return this.reason;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        InProgressState lastKnownState = getLastKnownState();
        int hashCode = lastKnownState == null ? 43 : lastKnownState.hashCode();
        CancellationReason reason = getReason();
        return ((hashCode + 59) * 59) + (reason != null ? reason.hashCode() : 43);
    }

    @JsonProperty("lastKnownState")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setLastKnownState(InProgressState inProgressState) {
        this.lastKnownState = inProgressState;
    }

    @JsonProperty("reason")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setReason(CancellationReason cancellationReason) {
        this.reason = cancellationReason;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CancelledState(lastKnownState=" + getLastKnownState() + ", reason=" + getReason() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
