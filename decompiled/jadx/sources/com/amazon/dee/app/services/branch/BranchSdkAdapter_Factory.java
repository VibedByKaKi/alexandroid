package com.amazon.dee.app.services.branch;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class BranchSdkAdapter_Factory implements Factory<BranchSdkAdapter> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final BranchSdkAdapter_Factory INSTANCE = new BranchSdkAdapter_Factory();

        private InstanceHolder() {
        }
    }

    public static BranchSdkAdapter_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BranchSdkAdapter newInstance() {
        return new BranchSdkAdapter();
    }

    @Override // javax.inject.Provider
    public BranchSdkAdapter get() {
        return newInstance();
    }
}
