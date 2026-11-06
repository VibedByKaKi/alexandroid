package com.amazon.alexa.featureservice.dependencies;

import com.amazon.alexa.featureservice.database.dao.TriggerDao;
import com.amazon.alexa.featureservice.database.roomdb.FeatureAppDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class DatabaseModule_ProvidesTriggerDaoFactory implements Factory<TriggerDao> {
    private final Provider<FeatureAppDatabase> dbProvider;
    private final DatabaseModule module;

    public DatabaseModule_ProvidesTriggerDaoFactory(DatabaseModule databaseModule, Provider<FeatureAppDatabase> provider) {
        this.module = databaseModule;
        this.dbProvider = provider;
    }

    public static DatabaseModule_ProvidesTriggerDaoFactory create(DatabaseModule databaseModule, Provider<FeatureAppDatabase> provider) {
        return new DatabaseModule_ProvidesTriggerDaoFactory(databaseModule, provider);
    }

    public static TriggerDao providesTriggerDao(DatabaseModule databaseModule, FeatureAppDatabase featureAppDatabase) {
        return (TriggerDao) Preconditions.checkNotNullFromProvides(databaseModule.providesTriggerDao(featureAppDatabase));
    }

    @Override // javax.inject.Provider
    public TriggerDao get() {
        return providesTriggerDao(this.module, this.dbProvider.get());
    }
}
