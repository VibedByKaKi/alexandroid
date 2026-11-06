package com.amazon.alexa.client.alexaservice.base.events;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_PackageRemovedEvent extends PackageRemovedEvent {
    private final String packageName;

    public AutoValue_PackageRemovedEvent(String str) {
        if (str != null) {
            this.packageName = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null packageName");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PackageRemovedEvent) {
            return this.packageName.equals(((PackageRemovedEvent) obj).getPackageName());
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.events.PackageRemovedEvent
    public String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return this.packageName.hashCode() ^ 1000003;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("PackageRemovedEvent{packageName="), this.packageName, StringSubstitutor.DEFAULT_VAR_END);
    }
}
