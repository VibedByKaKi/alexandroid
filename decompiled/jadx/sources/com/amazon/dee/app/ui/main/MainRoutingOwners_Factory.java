package com.amazon.dee.app.ui.main;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class MainRoutingOwners_Factory implements Factory<MainRoutingOwners> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final MainRoutingOwners_Factory INSTANCE = new MainRoutingOwners_Factory();

        private InstanceHolder() {
        }
    }

    public static MainRoutingOwners_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MainRoutingOwners newInstance() {
        return new MainRoutingOwners();
    }

    @Override // javax.inject.Provider
    public MainRoutingOwners get() {
        return newInstance();
    }
}
