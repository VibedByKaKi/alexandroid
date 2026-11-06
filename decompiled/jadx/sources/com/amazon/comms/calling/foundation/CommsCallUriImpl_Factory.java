package com.amazon.comms.calling.foundation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class CommsCallUriImpl_Factory implements Factory<CommsCallUriImpl> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final CommsCallUriImpl_Factory INSTANCE = new CommsCallUriImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static CommsCallUriImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CommsCallUriImpl newInstance() {
        return new CommsCallUriImpl();
    }

    @Override // javax.inject.Provider
    public CommsCallUriImpl get() {
        return newInstance();
    }
}
