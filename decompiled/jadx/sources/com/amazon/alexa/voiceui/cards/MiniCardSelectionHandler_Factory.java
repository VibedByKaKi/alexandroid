package com.amazon.alexa.voiceui.cards;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class MiniCardSelectionHandler_Factory implements Factory<MiniCardSelectionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final MiniCardSelectionHandler_Factory INSTANCE = new MiniCardSelectionHandler_Factory();

        private InstanceHolder() {
        }
    }

    public static MiniCardSelectionHandler_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MiniCardSelectionHandler newInstance() {
        return new MiniCardSelectionHandler();
    }

    @Override // javax.inject.Provider
    public MiniCardSelectionHandler get() {
        return newInstance();
    }
}
