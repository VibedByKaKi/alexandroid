package com.amazon.alexa.sharing.util;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class SharedPreferenceUtils_Factory implements Factory<SharedPreferenceUtils> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final SharedPreferenceUtils_Factory INSTANCE = new SharedPreferenceUtils_Factory();

        private InstanceHolder() {
        }
    }

    public static SharedPreferenceUtils_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SharedPreferenceUtils newInstance() {
        return new SharedPreferenceUtils();
    }

    @Override // javax.inject.Provider
    public SharedPreferenceUtils get() {
        return newInstance();
    }
}
