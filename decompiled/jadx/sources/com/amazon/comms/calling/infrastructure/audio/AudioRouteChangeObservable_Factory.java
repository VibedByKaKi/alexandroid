package com.amazon.comms.calling.infrastructure.audio;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class AudioRouteChangeObservable_Factory implements Factory<AudioRouteChangeObservable> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final AudioRouteChangeObservable_Factory INSTANCE = new AudioRouteChangeObservable_Factory();

        private InstanceHolder() {
        }
    }

    public static AudioRouteChangeObservable_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AudioRouteChangeObservable newInstance() {
        return new AudioRouteChangeObservable();
    }

    @Override // javax.inject.Provider
    public AudioRouteChangeObservable get() {
        return newInstance();
    }
}
