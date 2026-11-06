package com.amazon.alexa.client.alexaservice.base.componentstate.events;

import com.amazon.alexa.client.core.messages.PackageName;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_ExternalComponentStateCollectedEvent extends ExternalComponentStateCollectedEvent {
    private final long collectionTimeMilliseconds;
    private final PackageName packageName;
    private final boolean success;

    public AutoValue_ExternalComponentStateCollectedEvent(PackageName packageName, long j, boolean z) {
        if (packageName == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null packageName");
            throw null;
        }
        this.packageName = packageName;
        this.collectionTimeMilliseconds = j;
        this.success = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExternalComponentStateCollectedEvent) {
            ExternalComponentStateCollectedEvent externalComponentStateCollectedEvent = (ExternalComponentStateCollectedEvent) obj;
            if (this.packageName.equals(externalComponentStateCollectedEvent.getPackageName()) && this.collectionTimeMilliseconds == externalComponentStateCollectedEvent.getCollectionTimeMilliseconds() && this.success == externalComponentStateCollectedEvent.getSuccess()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.events.ExternalComponentStateCollectedEvent
    public long getCollectionTimeMilliseconds() {
        return this.collectionTimeMilliseconds;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.events.ExternalComponentStateCollectedEvent
    public PackageName getPackageName() {
        return this.packageName;
    }

    @Override // com.amazon.alexa.client.alexaservice.base.componentstate.events.ExternalComponentStateCollectedEvent
    public boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode = (this.packageName.hashCode() ^ 1000003) * 1000003;
        long j = this.collectionTimeMilliseconds;
        return (this.success ? 1231 : 1237) ^ ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExternalComponentStateCollectedEvent{packageName=");
        sb.append(this.packageName);
        sb.append(", collectionTimeMilliseconds=");
        sb.append(this.collectionTimeMilliseconds);
        sb.append(", success=");
        return a$$ExternalSyntheticOutline0.m(sb, this.success, StringSubstitutor.DEFAULT_VAR_END);
    }
}
