package com.amazon.alexa.apl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class APLViewController_Factory implements Factory<APLViewController> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final APLViewController_Factory INSTANCE = new APLViewController_Factory();

        private InstanceHolder() {
        }
    }

    public static APLViewController_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static APLViewController newInstance() {
        return new APLViewController();
    }

    @Override // javax.inject.Provider
    public APLViewController get() {
        return newInstance();
    }
}
