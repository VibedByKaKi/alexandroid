package com.amazon.commscore.commsidentity.repo.mapper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class AccountForDirectedIdMapper_Factory implements Factory<AccountForDirectedIdMapper> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final AccountForDirectedIdMapper_Factory INSTANCE = new AccountForDirectedIdMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static AccountForDirectedIdMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AccountForDirectedIdMapper newInstance() {
        return new AccountForDirectedIdMapper();
    }

    @Override // javax.inject.Provider
    public AccountForDirectedIdMapper get() {
        return newInstance();
    }
}
