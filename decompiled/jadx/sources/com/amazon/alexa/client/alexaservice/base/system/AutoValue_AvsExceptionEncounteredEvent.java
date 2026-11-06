package com.amazon.alexa.client.alexaservice.base.system;

import androidx.annotation.Nullable;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_AvsExceptionEncounteredEvent extends AvsExceptionEncounteredEvent {
    private final ExceptionCode code;
    private final String description;

    public AutoValue_AvsExceptionEncounteredEvent(ExceptionCode exceptionCode, @Nullable String str) {
        if (exceptionCode == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null code");
            throw null;
        }
        this.code = exceptionCode;
        this.description = str;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AvsExceptionEncounteredEvent) {
            AvsExceptionEncounteredEvent avsExceptionEncounteredEvent = (AvsExceptionEncounteredEvent) obj;
            if (this.code.equals(avsExceptionEncounteredEvent.getCode()) && ((str = this.description) != null ? str.equals(avsExceptionEncounteredEvent.getDescription()) : avsExceptionEncounteredEvent.getDescription() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.system.AvsExceptionEncounteredEvent
    public ExceptionCode getCode() {
        return this.code;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.system.AvsExceptionEncounteredEvent
    @Nullable
    public String getDescription() {
        return this.description;
    }

    public int hashCode() {
        int hashCode = (this.code.hashCode() ^ 1000003) * 1000003;
        String str = this.description;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AvsExceptionEncounteredEvent{code=");
        sb.append(this.code);
        sb.append(", description=");
        return a$$ExternalSyntheticOutline0.m(sb, this.description, StringSubstitutor.DEFAULT_VAR_END);
    }
}
