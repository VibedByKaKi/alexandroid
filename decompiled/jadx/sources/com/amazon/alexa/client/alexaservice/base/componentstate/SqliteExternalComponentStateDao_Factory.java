package com.amazon.alexa.client.alexaservice.base.componentstate;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class SqliteExternalComponentStateDao_Factory implements Factory<SqliteExternalComponentStateDao> {
    private final Provider<ExternalComponentStateDatabase> databaseProvider;

    public SqliteExternalComponentStateDao_Factory(Provider<ExternalComponentStateDatabase> provider) {
        this.databaseProvider = provider;
    }

    public static SqliteExternalComponentStateDao_Factory create(Provider<ExternalComponentStateDatabase> provider) {
        return new SqliteExternalComponentStateDao_Factory(provider);
    }

    public static SqliteExternalComponentStateDao newInstance(ExternalComponentStateDatabase externalComponentStateDatabase) {
        return new SqliteExternalComponentStateDao(externalComponentStateDatabase);
    }

    @Override // javax.inject.Provider
    public SqliteExternalComponentStateDao get() {
        return newInstance(this.databaseProvider.get());
    }
}
