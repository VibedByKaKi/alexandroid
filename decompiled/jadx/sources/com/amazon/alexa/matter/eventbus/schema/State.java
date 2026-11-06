package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class State {
    private CancelledState cancelled;
    private CompleteState complete;
    private FailedState failed;
    private InProgressState inProgress;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public State() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof State;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof State)) {
            return false;
        }
        State state = (State) obj;
        if (!state.canEqual(this)) {
            return false;
        }
        InProgressState inProgress = getInProgress();
        InProgressState inProgress2 = state.getInProgress();
        if (inProgress != null ? !inProgress.equals(inProgress2) : inProgress2 != null) {
            return false;
        }
        CompleteState complete = getComplete();
        CompleteState complete2 = state.getComplete();
        if (complete != null ? !complete.equals(complete2) : complete2 != null) {
            return false;
        }
        FailedState failed = getFailed();
        FailedState failed2 = state.getFailed();
        if (failed != null ? !failed.equals(failed2) : failed2 != null) {
            return false;
        }
        CancelledState cancelled = getCancelled();
        CancelledState cancelled2 = state.getCancelled();
        return cancelled != null ? cancelled.equals(cancelled2) : cancelled2 == null;
    }

    @JsonProperty(AuthorizationDelegateAdapter.FAILURE_CANCELLED)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CancelledState getCancelled() {
        return this.cancelled;
    }

    @JsonProperty("complete")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CompleteState getComplete() {
        return this.complete;
    }

    @JsonProperty("failed")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public FailedState getFailed() {
        return this.failed;
    }

    @JsonProperty("inProgress")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public InProgressState getInProgress() {
        return this.inProgress;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        InProgressState inProgress = getInProgress();
        int hashCode = inProgress == null ? 43 : inProgress.hashCode();
        CompleteState complete = getComplete();
        int hashCode2 = ((hashCode + 59) * 59) + (complete == null ? 43 : complete.hashCode());
        FailedState failed = getFailed();
        int i = hashCode2 * 59;
        int hashCode3 = failed == null ? 43 : failed.hashCode();
        CancelledState cancelled = getCancelled();
        return ((i + hashCode3) * 59) + (cancelled != null ? cancelled.hashCode() : 43);
    }

    @JsonProperty(AuthorizationDelegateAdapter.FAILURE_CANCELLED)
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCancelled(CancelledState cancelledState) {
        this.cancelled = cancelledState;
    }

    @JsonProperty("complete")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setComplete(CompleteState completeState) {
        this.complete = completeState;
    }

    @JsonProperty("failed")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setFailed(FailedState failedState) {
        this.failed = failedState;
    }

    @JsonProperty("inProgress")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setInProgress(InProgressState inProgressState) {
        this.inProgress = inProgressState;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "State(inProgress=" + getInProgress() + ", complete=" + getComplete() + ", failed=" + getFailed() + ", cancelled=" + getCancelled() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
