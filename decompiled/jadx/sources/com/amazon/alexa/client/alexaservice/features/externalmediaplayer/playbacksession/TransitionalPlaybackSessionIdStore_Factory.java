package com.amazon.alexa.client.alexaservice.features.externalmediaplayer.playbacksession;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class TransitionalPlaybackSessionIdStore_Factory implements Factory<TransitionalPlaybackSessionIdStore> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final TransitionalPlaybackSessionIdStore_Factory INSTANCE = new TransitionalPlaybackSessionIdStore_Factory();

        private InstanceHolder() {
        }
    }

    public static TransitionalPlaybackSessionIdStore_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TransitionalPlaybackSessionIdStore newInstance() {
        return new TransitionalPlaybackSessionIdStore();
    }

    @Override // javax.inject.Provider
    public TransitionalPlaybackSessionIdStore get() {
        return newInstance();
    }
}
