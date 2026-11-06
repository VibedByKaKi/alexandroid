package com.amazon.alexa.presence.identity;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class IdentityHelper_Factory implements Factory<IdentityHelper> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final IdentityHelper_Factory INSTANCE = new IdentityHelper_Factory();

        private InstanceHolder() {
        }
    }

    public static IdentityHelper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static IdentityHelper newInstance() {
        return new IdentityHelper();
    }

    @Override // javax.inject.Provider
    public IdentityHelper get() {
        return newInstance();
    }
}
