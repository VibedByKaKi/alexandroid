package com.amazon.alexa.featureservice.dependencies;

import android.content.Context;
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
@QualifierMetadata({"com.amazon.alexa.featureservice.dependencies.annotation.ApplicationContext"})
/* loaded from: classes17.dex */
public final class DatabaseModule_ProvideRoomDatabaseFactory implements Factory<FeatureAppDatabase> {
    private final Provider<Context> contextProvider;
    private final DatabaseModule module;

    public DatabaseModule_ProvideRoomDatabaseFactory(DatabaseModule databaseModule, Provider<Context> provider) {
        this.module = databaseModule;
        this.contextProvider = provider;
    }

    public static DatabaseModule_ProvideRoomDatabaseFactory create(DatabaseModule databaseModule, Provider<Context> provider) {
        return new DatabaseModule_ProvideRoomDatabaseFactory(databaseModule, provider);
    }

    public static FeatureAppDatabase provideRoomDatabase(DatabaseModule databaseModule, Context context) {
        return (FeatureAppDatabase) Preconditions.checkNotNullFromProvides(databaseModule.provideRoomDatabase(context));
    }

    @Override // javax.inject.Provider
    public FeatureAppDatabase get() {
        return provideRoomDatabase(this.module, this.contextProvider.get());
    }
}
