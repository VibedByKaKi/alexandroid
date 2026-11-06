package com.amazon.alexa.featureservice.dependencies;

import com.amazon.alexa.featureservice.database.dao.FeatureFlagDao;
import com.amazon.alexa.featureservice.database.dao.RxFeatureDao;
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
public final class DatabaseModule_ProvidesRxFeatureDaoFactory implements Factory<RxFeatureDao> {
    private final Provider<FeatureFlagDao> featureDaoProvider;
    private final DatabaseModule module;

    public DatabaseModule_ProvidesRxFeatureDaoFactory(DatabaseModule databaseModule, Provider<FeatureFlagDao> provider) {
        this.module = databaseModule;
        this.featureDaoProvider = provider;
    }

    public static DatabaseModule_ProvidesRxFeatureDaoFactory create(DatabaseModule databaseModule, Provider<FeatureFlagDao> provider) {
        return new DatabaseModule_ProvidesRxFeatureDaoFactory(databaseModule, provider);
    }

    public static RxFeatureDao providesRxFeatureDao(DatabaseModule databaseModule, FeatureFlagDao featureFlagDao) {
        return (RxFeatureDao) Preconditions.checkNotNullFromProvides(databaseModule.providesRxFeatureDao(featureFlagDao));
    }

    @Override // javax.inject.Provider
    public RxFeatureDao get() {
        return providesRxFeatureDao(this.module, this.featureDaoProvider.get());
    }
}
