package com.amazon.alexa.featureservice.dependencies;

import com.amazon.alexa.featureservice.database.dao.FeatureFlagDao;
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
public final class DatabaseModule_ProvidesFeatureDaoFactory implements Factory<FeatureFlagDao> {
    private final Provider<FeatureAppDatabase> dbProvider;
    private final DatabaseModule module;

    public DatabaseModule_ProvidesFeatureDaoFactory(DatabaseModule databaseModule, Provider<FeatureAppDatabase> provider) {
        this.module = databaseModule;
        this.dbProvider = provider;
    }

    public static DatabaseModule_ProvidesFeatureDaoFactory create(DatabaseModule databaseModule, Provider<FeatureAppDatabase> provider) {
        return new DatabaseModule_ProvidesFeatureDaoFactory(databaseModule, provider);
    }

    public static FeatureFlagDao providesFeatureDao(DatabaseModule databaseModule, FeatureAppDatabase featureAppDatabase) {
        return (FeatureFlagDao) Preconditions.checkNotNullFromProvides(databaseModule.providesFeatureDao(featureAppDatabase));
    }

    @Override // javax.inject.Provider
    public FeatureFlagDao get() {
        return providesFeatureDao(this.module, this.dbProvider.get());
    }
}
