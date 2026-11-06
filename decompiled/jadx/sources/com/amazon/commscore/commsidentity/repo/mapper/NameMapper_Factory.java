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
public final class NameMapper_Factory implements Factory<NameMapper> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final NameMapper_Factory INSTANCE = new NameMapper_Factory();

        private InstanceHolder() {
        }
    }

    public static NameMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NameMapper newInstance() {
        return new NameMapper();
    }

    @Override // javax.inject.Provider
    public NameMapper get() {
        return newInstance();
    }
}
