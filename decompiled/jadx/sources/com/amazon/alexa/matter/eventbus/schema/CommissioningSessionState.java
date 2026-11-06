package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class CommissioningSessionState {
    private String id;
    private State state;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CommissioningSessionState() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CommissioningSessionState;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommissioningSessionState)) {
            return false;
        }
        CommissioningSessionState commissioningSessionState = (CommissioningSessionState) obj;
        if (!commissioningSessionState.canEqual(this)) {
            return false;
        }
        String id = getId();
        String id2 = commissioningSessionState.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        State state = getState();
        State state2 = commissioningSessionState.getState();
        return state != null ? state.equals(state2) : state2 == null;
    }

    @JsonProperty("id")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getId() {
        return this.id;
    }

    @JsonProperty("state")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public State getState() {
        return this.state;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String id = getId();
        int hashCode = id == null ? 43 : id.hashCode();
        State state = getState();
        return ((hashCode + 59) * 59) + (state != null ? state.hashCode() : 43);
    }

    @JsonProperty("id")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setId(String str) {
        this.id = str;
    }

    @JsonProperty("state")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setState(State state) {
        this.state = state;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "CommissioningSessionState(id=" + getId() + ", state=" + getState() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
