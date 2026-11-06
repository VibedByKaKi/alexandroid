package com.amazon.alexa.voiceui.voice;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class AlexaUserInterfaceOptionsTracker_Factory implements Factory<AlexaUserInterfaceOptionsTracker> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final AlexaUserInterfaceOptionsTracker_Factory INSTANCE = new AlexaUserInterfaceOptionsTracker_Factory();

        private InstanceHolder() {
        }
    }

    public static AlexaUserInterfaceOptionsTracker_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AlexaUserInterfaceOptionsTracker newInstance() {
        return new AlexaUserInterfaceOptionsTracker();
    }

    @Override // javax.inject.Provider
    public AlexaUserInterfaceOptionsTracker get() {
        return newInstance();
    }
}
