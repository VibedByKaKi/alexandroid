package com.amazon.alexa.voice.handsfree.features;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes19.dex */
public class IdentityServiceProvider {
    @Inject
    public IdentityServiceProvider() {
    }

    @NonNull
    public EventBus provideEventBus() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(EventBus.class).get();
        return (EventBus) obj;
    }

    @Nullable
    public IdentityService provideIdentityService() {
        return (IdentityService) Automotive$$ExternalSyntheticOutline0.m(IdentityService.class);
    }
}
