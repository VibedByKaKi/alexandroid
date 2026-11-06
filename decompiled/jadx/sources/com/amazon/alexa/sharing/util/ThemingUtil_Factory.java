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
public final class ThemingUtil_Factory implements Factory<ThemingUtil> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final ThemingUtil_Factory INSTANCE = new ThemingUtil_Factory();

        private InstanceHolder() {
        }
    }

    public static ThemingUtil_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ThemingUtil newInstance() {
        return new ThemingUtil();
    }

    @Override // javax.inject.Provider
    public ThemingUtil get() {
        return newInstance();
    }
}
