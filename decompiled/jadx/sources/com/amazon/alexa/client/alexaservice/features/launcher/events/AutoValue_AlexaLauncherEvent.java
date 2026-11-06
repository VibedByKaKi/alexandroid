package com.amazon.alexa.client.alexaservice.features.launcher.events;

import com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherEvent;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.Outcome;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.Reasons;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.Target;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.Token;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AlexaLauncherEvent extends AlexaLauncherEvent {
    private final String eventType;
    private final Outcome outcome;
    private final List<Reasons> reasons;
    private final Target target;
    private final Token token;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends AlexaLauncherEvent.Builder {
        private String eventType;
        private Outcome outcome;
        private List<Reasons> reasons;
        private Target target;
        private Token token;

        @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherEvent.Builder
        public AlexaLauncherEvent build() {
            String str = this.target == null ? " target" : "";
            if (this.token == null) {
                str = str.concat(" token");
            }
            if (this.outcome == null) {
                str = str.concat(" outcome");
            }
            if (this.reasons == null) {
                str = str.concat(" reasons");
            }
            if (this.eventType == null) {
                str = str.concat(" eventType");
            }
            if (str.isEmpty()) {
                return new AutoValue_AlexaLauncherEvent(this.target, this.token, this.outcome, this.reasons, this.eventType, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherEvent.Builder
        public AlexaLauncherEvent.Builder setEventType(String str) {
            if (str != null) {
                this.eventType = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null eventType");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherEvent.Builder
        public AlexaLauncherEvent.Builder setOutcome(Outcome outcome) {
            if (outcome != null) {
                this.outcome = outcome;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null outcome");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherEvent.Builder
        public AlexaLauncherEvent.Builder setReasons(List<Reasons> list) {
            if (list != null) {
                this.reasons = list;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null reasons");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherEvent.Builder
        public AlexaLauncherEvent.Builder setTarget(Target target) {
            if (target != null) {
                this.target = target;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null target");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherEvent.Builder
        public AlexaLauncherEvent.Builder setToken(Token token) {
            if (token != null) {
                this.token = token;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null token");
            return null;
        }
    }

    private AutoValue_AlexaLauncherEvent(Target target, Token token, Outcome outcome, List<Reasons> list, String str) {
        this.target = target;
        this.token = token;
        this.outcome = outcome;
        this.reasons = list;
        this.eventType = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlexaLauncherEvent) {
            AlexaLauncherEvent alexaLauncherEvent = (AlexaLauncherEvent) obj;
            if (this.target.equals(alexaLauncherEvent.getTarget()) && this.token.equals(alexaLauncherEvent.getToken()) && this.outcome.equals(alexaLauncherEvent.getOutcome()) && this.reasons.equals(alexaLauncherEvent.getReasons()) && this.eventType.equals(alexaLauncherEvent.getEventType())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherEvent
    public String getEventType() {
        return this.eventType;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherEvent
    public Outcome getOutcome() {
        return this.outcome;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherEvent
    public List<Reasons> getReasons() {
        return this.reasons;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherEvent
    public Target getTarget() {
        return this.target;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherEvent
    public Token getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.eventType.hashCode() ^ ((((((((this.target.hashCode() ^ 1000003) * 1000003) ^ this.token.hashCode()) * 1000003) ^ this.outcome.hashCode()) * 1000003) ^ this.reasons.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AlexaLauncherEvent{target=");
        sb.append(this.target);
        sb.append(", token=");
        sb.append(this.token);
        sb.append(", outcome=");
        sb.append(this.outcome);
        sb.append(", reasons=");
        sb.append(this.reasons);
        sb.append(", eventType=");
        return a$$ExternalSyntheticOutline0.m(sb, this.eventType, StringSubstitutor.DEFAULT_VAR_END);
    }

    public /* synthetic */ AutoValue_AlexaLauncherEvent(Target target, Token token, Outcome outcome, List list, String str, int i) {
        this(target, token, outcome, list, str);
    }
}
