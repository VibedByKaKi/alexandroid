package com.amazon.alexa.client.alexaservice.base.interactions;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class InteractionAudioFocusRequestProvider_Factory implements Factory<InteractionAudioFocusRequestProvider> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final InteractionAudioFocusRequestProvider_Factory INSTANCE = new InteractionAudioFocusRequestProvider_Factory();

        private InstanceHolder() {
        }
    }

    public static InteractionAudioFocusRequestProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static InteractionAudioFocusRequestProvider newInstance() {
        return new InteractionAudioFocusRequestProvider();
    }

    @Override // javax.inject.Provider
    public InteractionAudioFocusRequestProvider get() {
        return newInstance();
    }
}
