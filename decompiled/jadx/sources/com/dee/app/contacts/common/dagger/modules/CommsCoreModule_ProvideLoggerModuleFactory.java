package com.dee.app.contacts.common.dagger.modules;

import com.dee.app.contacts.interfaces.IContactsLogger;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class CommsCoreModule_ProvideLoggerModuleFactory implements Factory<IContactsLogger> {
    private final CommsCoreModule module;

    public CommsCoreModule_ProvideLoggerModuleFactory(CommsCoreModule commsCoreModule) {
        this.module = commsCoreModule;
    }

    public static CommsCoreModule_ProvideLoggerModuleFactory create(CommsCoreModule commsCoreModule) {
        return new CommsCoreModule_ProvideLoggerModuleFactory(commsCoreModule);
    }

    public static IContactsLogger provideLoggerModule(CommsCoreModule commsCoreModule) {
        return (IContactsLogger) Preconditions.checkNotNullFromProvides(commsCoreModule.provideLoggerModule());
    }

    @Override // javax.inject.Provider
    public IContactsLogger get() {
        return provideLoggerModule(this.module);
    }
}
