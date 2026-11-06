package com.amazon.alexa.accessory.speech.events.model;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.speech.events.model.State;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class AutoValue_State extends State {
    private final ConnectionState connectionState;

    @Nullable
    private final PresenceState presenceState;

    @Nullable
    private final ProactivelyTargetable proactivelyTargetable;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends State.Builder {
        private ConnectionState connectionState;
        private PresenceState presenceState;
        private ProactivelyTargetable proactivelyTargetable;

        @Override // com.amazon.alexa.accessory.speech.events.model.State.Builder
        public State build() {
            ConnectionState connectionState = this.connectionState;
            if (connectionState != null) {
                return new AutoValue_State(connectionState, this.proactivelyTargetable, this.presenceState, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties: connectionState");
            return null;
        }

        @Override // com.amazon.alexa.accessory.speech.events.model.State.Builder
        public State.Builder setConnectionState(ConnectionState connectionState) {
            if (connectionState != null) {
                this.connectionState = connectionState;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null connectionState");
            return null;
        }

        @Override // com.amazon.alexa.accessory.speech.events.model.State.Builder
        public State.Builder setPresenceState(PresenceState presenceState) {
            this.presenceState = presenceState;
            return this;
        }

        @Override // com.amazon.alexa.accessory.speech.events.model.State.Builder
        public State.Builder setProactivelyTargetable(ProactivelyTargetable proactivelyTargetable) {
            this.proactivelyTargetable = proactivelyTargetable;
            return this;
        }
    }

    private AutoValue_State(ConnectionState connectionState, @Nullable ProactivelyTargetable proactivelyTargetable, @Nullable PresenceState presenceState) {
        this.connectionState = connectionState;
        this.proactivelyTargetable = proactivelyTargetable;
        this.presenceState = presenceState;
    }

    public boolean equals(Object obj) {
        ProactivelyTargetable proactivelyTargetable;
        PresenceState presenceState;
        if (obj == this) {
            return true;
        }
        if (obj instanceof State) {
            State state = (State) obj;
            if (this.connectionState.equals(state.getConnectionState()) && ((proactivelyTargetable = this.proactivelyTargetable) != null ? proactivelyTargetable.equals(state.getProactivelyTargetable()) : state.getProactivelyTargetable() == null) && ((presenceState = this.presenceState) != null ? presenceState.equals(state.getPresenceState()) : state.getPresenceState() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessory.speech.events.model.State
    public ConnectionState getConnectionState() {
        return this.connectionState;
    }

    @Override // com.amazon.alexa.accessory.speech.events.model.State
    @Nullable
    public PresenceState getPresenceState() {
        return this.presenceState;
    }

    @Override // com.amazon.alexa.accessory.speech.events.model.State
    @Nullable
    public ProactivelyTargetable getProactivelyTargetable() {
        return this.proactivelyTargetable;
    }

    public int hashCode() {
        int hashCode = (this.connectionState.hashCode() ^ 1000003) * 1000003;
        ProactivelyTargetable proactivelyTargetable = this.proactivelyTargetable;
        int hashCode2 = (hashCode ^ (proactivelyTargetable == null ? 0 : proactivelyTargetable.hashCode())) * 1000003;
        PresenceState presenceState = this.presenceState;
        return hashCode2 ^ (presenceState != null ? presenceState.hashCode() : 0);
    }

    public String toString() {
        return "State{connectionState=" + this.connectionState + ", proactivelyTargetable=" + this.proactivelyTargetable + ", presenceState=" + this.presenceState + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_State(ConnectionState connectionState, ProactivelyTargetable proactivelyTargetable, PresenceState presenceState, int i) {
        this(connectionState, proactivelyTargetable, presenceState);
    }
}
