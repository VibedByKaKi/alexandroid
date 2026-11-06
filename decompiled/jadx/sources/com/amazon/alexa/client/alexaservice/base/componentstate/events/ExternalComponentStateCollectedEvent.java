package com.amazon.alexa.client.alexaservice.base.componentstate.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.PackageName;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ExternalComponentStateCollectedEvent extends Event.NotGated {
    public static ExternalComponentStateCollectedEvent create(PackageName packageName, long j, boolean z) {
        return new AutoValue_ExternalComponentStateCollectedEvent(packageName, j, z);
    }

    public abstract long getCollectionTimeMilliseconds();

    public abstract PackageName getPackageName();

    public abstract boolean getSuccess();
}
