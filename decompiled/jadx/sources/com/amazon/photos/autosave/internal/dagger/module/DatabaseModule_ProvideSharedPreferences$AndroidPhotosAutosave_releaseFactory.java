package com.amazon.photos.autosave.internal.dagger.module;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.photos.autosave.internal.dagger.PerAccount")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class DatabaseModule_ProvideSharedPreferences$AndroidPhotosAutosave_releaseFactory implements Factory<SharedPreferences> {
    private final DatabaseModule module;

    public DatabaseModule_ProvideSharedPreferences$AndroidPhotosAutosave_releaseFactory(DatabaseModule databaseModule) {
        this.module = databaseModule;
    }

    public static DatabaseModule_ProvideSharedPreferences$AndroidPhotosAutosave_releaseFactory create(DatabaseModule databaseModule) {
        return new DatabaseModule_ProvideSharedPreferences$AndroidPhotosAutosave_releaseFactory(databaseModule);
    }

    public static SharedPreferences provideSharedPreferences$AndroidPhotosAutosave_release(DatabaseModule databaseModule) {
        return (SharedPreferences) Preconditions.checkNotNullFromProvides(databaseModule.provideSharedPreferences$AndroidPhotosAutosave_release());
    }

    @Override // javax.inject.Provider
    public SharedPreferences get() {
        return provideSharedPreferences$AndroidPhotosAutosave_release(this.module);
    }
}
