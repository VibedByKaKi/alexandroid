package com.amazon.alexa.client.alexaservice.features.launcher.events;

import com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherMetricEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AlexaLauncherMetricEvent_DirectiveProcessEvent extends AlexaLauncherMetricEvent.DirectiveProcessEvent {
    private final String directiveName;
    private final long processTimeMillis;
    private final long userPerceivedLatency;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends AlexaLauncherMetricEvent.DirectiveProcessEvent.Builder {
        private String directiveName;
        private Long processTimeMillis;
        private Long userPerceivedLatency;

        @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherMetricEvent.DirectiveProcessEvent.Builder
        public AlexaLauncherMetricEvent.DirectiveProcessEvent build() {
            String str = this.directiveName == null ? " directiveName" : "";
            if (this.processTimeMillis == null) {
                str = str.concat(" processTimeMillis");
            }
            if (this.userPerceivedLatency == null) {
                str = str.concat(" userPerceivedLatency");
            }
            if (str.isEmpty()) {
                return new AutoValue_AlexaLauncherMetricEvent_DirectiveProcessEvent(this.directiveName, this.processTimeMillis.longValue(), this.userPerceivedLatency.longValue(), 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherMetricEvent.DirectiveProcessEvent.Builder
        public AlexaLauncherMetricEvent.DirectiveProcessEvent.Builder setDirectiveName(String str) {
            if (str != null) {
                this.directiveName = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null directiveName");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherMetricEvent.DirectiveProcessEvent.Builder
        public AlexaLauncherMetricEvent.DirectiveProcessEvent.Builder setProcessTimeMillis(long j) {
            this.processTimeMillis = Long.valueOf(j);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherMetricEvent.DirectiveProcessEvent.Builder
        public AlexaLauncherMetricEvent.DirectiveProcessEvent.Builder setUserPerceivedLatency(long j) {
            this.userPerceivedLatency = Long.valueOf(j);
            return this;
        }
    }

    private AutoValue_AlexaLauncherMetricEvent_DirectiveProcessEvent(String str, long j, long j2) {
        this.directiveName = str;
        this.processTimeMillis = j;
        this.userPerceivedLatency = j2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlexaLauncherMetricEvent.DirectiveProcessEvent) {
            AlexaLauncherMetricEvent.DirectiveProcessEvent directiveProcessEvent = (AlexaLauncherMetricEvent.DirectiveProcessEvent) obj;
            if (this.directiveName.equals(directiveProcessEvent.getDirectiveName()) && this.processTimeMillis == directiveProcessEvent.getProcessTimeMillis() && this.userPerceivedLatency == directiveProcessEvent.getUserPerceivedLatency()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherMetricEvent.DirectiveProcessEvent
    public String getDirectiveName() {
        return this.directiveName;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherMetricEvent.DirectiveProcessEvent
    public long getProcessTimeMillis() {
        return this.processTimeMillis;
    }

    @Override // com.amazon.alexa.client.alexaservice.features.launcher.events.AlexaLauncherMetricEvent.DirectiveProcessEvent
    public long getUserPerceivedLatency() {
        return this.userPerceivedLatency;
    }

    public int hashCode() {
        int hashCode = (this.directiveName.hashCode() ^ 1000003) * 1000003;
        long j = this.processTimeMillis;
        long j2 = this.userPerceivedLatency;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DirectiveProcessEvent{directiveName=");
        sb.append(this.directiveName);
        sb.append(", processTimeMillis=");
        sb.append(this.processTimeMillis);
        sb.append(", userPerceivedLatency=");
        return a$$ExternalSyntheticOutline0.m(this.userPerceivedLatency, StringSubstitutor.DEFAULT_VAR_END, sb);
    }

    public /* synthetic */ AutoValue_AlexaLauncherMetricEvent_DirectiveProcessEvent(String str, long j, long j2, int i) {
        this(str, j, j2);
    }
}
