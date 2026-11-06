package com.amazon.alexa.handsfree.storage.initialization;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class SdkVersionCodeStore_Factory implements Factory<SdkVersionCodeStore> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final SdkVersionCodeStore_Factory INSTANCE = new SdkVersionCodeStore_Factory();

        private InstanceHolder() {
        }
    }

    public static SdkVersionCodeStore_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SdkVersionCodeStore newInstance() {
        return new SdkVersionCodeStore();
    }

    @Override // javax.inject.Provider
    public SdkVersionCodeStore get() {
        return newInstance();
    }
}
