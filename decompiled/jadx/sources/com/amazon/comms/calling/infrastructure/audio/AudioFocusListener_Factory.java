package com.amazon.comms.calling.infrastructure.audio;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class AudioFocusListener_Factory implements Factory<AudioFocusListener> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final AudioFocusListener_Factory INSTANCE = new AudioFocusListener_Factory();

        private InstanceHolder() {
        }
    }

    public static AudioFocusListener_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AudioFocusListener newInstance() {
        return new AudioFocusListener();
    }

    @Override // javax.inject.Provider
    public AudioFocusListener get() {
        return newInstance();
    }
}
