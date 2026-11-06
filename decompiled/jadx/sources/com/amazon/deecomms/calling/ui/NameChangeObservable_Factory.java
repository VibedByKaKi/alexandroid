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
public final class NameChangeObservable_Factory implements Factory<NameChangeObservable> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final NameChangeObservable_Factory INSTANCE = new NameChangeObservable_Factory();

        private InstanceHolder() {
        }
    }

    public static NameChangeObservable_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NameChangeObservable newInstance() {
        return new NameChangeObservable();
    }

    @Override // javax.inject.Provider
    public NameChangeObservable get() {
        return newInstance();
    }
}
