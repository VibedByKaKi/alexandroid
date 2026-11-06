package com.amazon.deecomms.calling.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class PipVisibilityObservable_Factory implements Factory<PipVisibilityObservable> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final PipVisibilityObservable_Factory INSTANCE = new PipVisibilityObservable_Factory();

        private InstanceHolder() {
        }
    }

    public static PipVisibilityObservable_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static PipVisibilityObservable newInstance() {
        return new PipVisibilityObservable();
    }

    @Override // javax.inject.Provider
    public PipVisibilityObservable get() {
        return newInstance();
    }
}
