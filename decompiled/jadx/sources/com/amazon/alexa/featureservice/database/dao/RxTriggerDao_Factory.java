package com.amazon.alexa.featureservice.database.dao;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class RxTriggerDao_Factory implements Factory<RxTriggerDao> {
    private final Provider<TriggerDao> daoProvider;

    public RxTriggerDao_Factory(Provider<TriggerDao> provider) {
        this.daoProvider = provider;
    }

    public static RxTriggerDao_Factory create(Provider<TriggerDao> provider) {
        return new RxTriggerDao_Factory(provider);
    }

    public static RxTriggerDao newInstance(TriggerDao triggerDao) {
        return new RxTriggerDao(triggerDao);
    }

    @Override // javax.inject.Provider
    public RxTriggerDao get() {
        return newInstance(this.daoProvider.get());
    }
}
