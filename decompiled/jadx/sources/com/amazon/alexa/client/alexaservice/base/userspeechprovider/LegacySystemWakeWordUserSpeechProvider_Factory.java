package com.amazon.alexa.client.alexaservice.base.userspeechprovider;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class LegacySystemWakeWordUserSpeechProvider_Factory implements Factory<LegacySystemWakeWordUserSpeechProvider> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final LegacySystemWakeWordUserSpeechProvider_Factory INSTANCE = new LegacySystemWakeWordUserSpeechProvider_Factory();

        private InstanceHolder() {
        }
    }

    public static LegacySystemWakeWordUserSpeechProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LegacySystemWakeWordUserSpeechProvider newInstance() {
        return new LegacySystemWakeWordUserSpeechProvider();
    }

    @Override // javax.inject.Provider
    public LegacySystemWakeWordUserSpeechProvider get() {
        return newInstance();
    }
}
