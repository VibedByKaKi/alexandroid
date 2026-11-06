package com.amazon.deecomms.calling.model;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class BeginCallMapper_Factory implements Factory<BeginCallMapper> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final BeginCallMapper_Factory INSTANCE = new BeginCallMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static BeginCallMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BeginCallMapper newInstance() {
        return new BeginCallMapper();
    }

    @Override // javax.inject.Provider
    public BeginCallMapper get() {
        return newInstance();
    }
}
