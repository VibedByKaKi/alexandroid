package com.dee.app.contacts.common.constants;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class ContactConfig_Factory implements Factory<ContactConfig> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final ContactConfig_Factory INSTANCE = new ContactConfig_Factory();

        private InstanceHolder() {
        }
    }

    public static ContactConfig_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ContactConfig newInstance() {
        return new ContactConfig();
    }

    @Override // javax.inject.Provider
    public ContactConfig get() {
        return newInstance();
    }
}
