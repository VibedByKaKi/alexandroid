package com.amazon.alexa.alertsca.exoplayer;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AmplitudeCalculatingAudioSink_Factory implements Factory<AmplitudeCalculatingAudioSink> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final AmplitudeCalculatingAudioSink_Factory INSTANCE = new AmplitudeCalculatingAudioSink_Factory();

        private InstanceHolder() {
        }
    }

    public static AmplitudeCalculatingAudioSink_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AmplitudeCalculatingAudioSink newInstance() {
        return new AmplitudeCalculatingAudioSink();
    }

    @Override // javax.inject.Provider
    public AmplitudeCalculatingAudioSink get() {
        return newInstance();
    }
}
