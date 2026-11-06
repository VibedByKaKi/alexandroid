package com.amazon.deecomms.calling.incallexperiences.effects;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class EffectsState_Factory implements Factory<EffectsState> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final EffectsState_Factory INSTANCE = new EffectsState_Factory();

        private InstanceHolder() {
        }
    }

    public static EffectsState_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EffectsState newInstance() {
        return new EffectsState();
    }

    @Override // javax.inject.Provider
    public EffectsState get() {
        return newInstance();
    }
}
