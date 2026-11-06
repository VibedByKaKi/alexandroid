package com.amazon.photos.autosave.internal.dagger.module;

import com.amazon.photos.autosave.internal.dao.AutosaveItemDao;
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
public final class DatabaseModule_ProvideAutosaveItemDao$AndroidPhotosAutosave_releaseFactory implements Factory<AutosaveItemDao> {
    private final DatabaseModule module;

    public DatabaseModule_ProvideAutosaveItemDao$AndroidPhotosAutosave_releaseFactory(DatabaseModule databaseModule) {
        this.module = databaseModule;
    }

    public static DatabaseModule_ProvideAutosaveItemDao$AndroidPhotosAutosave_releaseFactory create(DatabaseModule databaseModule) {
        return new DatabaseModule_ProvideAutosaveItemDao$AndroidPhotosAutosave_releaseFactory(databaseModule);
    }

    public static AutosaveItemDao provideAutosaveItemDao$AndroidPhotosAutosave_release(DatabaseModule databaseModule) {
        return (AutosaveItemDao) Preconditions.checkNotNullFromProvides(databaseModule.provideAutosaveItemDao$AndroidPhotosAutosave_release());
    }

    @Override // javax.inject.Provider
    public AutosaveItemDao get() {
        return provideAutosaveItemDao$AndroidPhotosAutosave_release(this.module);
    }
}
