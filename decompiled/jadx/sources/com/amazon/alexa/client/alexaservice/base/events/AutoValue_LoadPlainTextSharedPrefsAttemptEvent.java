package com.amazon.alexa.client.alexaservice.base.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_LoadPlainTextSharedPrefsAttemptEvent extends LoadPlainTextSharedPrefsAttemptEvent {
    private final String preferenceName;

    public AutoValue_LoadPlainTextSharedPrefsAttemptEvent(String str) {
        if (str != null) {
            this.preferenceName = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null preferenceName");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LoadPlainTextSharedPrefsAttemptEvent) {
            return this.preferenceName.equals(((LoadPlainTextSharedPrefsAttemptEvent) obj).getPreferenceName());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.LoadPlainTextSharedPrefsAttemptEvent
    public String getPreferenceName() {
        return this.preferenceName;
    }

    public int hashCode() {
        return this.preferenceName.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("LoadPlainTextSharedPrefsAttemptEvent{preferenceName="), this.preferenceName, StringSubstitutor.DEFAULT_VAR_END);
    }
}
