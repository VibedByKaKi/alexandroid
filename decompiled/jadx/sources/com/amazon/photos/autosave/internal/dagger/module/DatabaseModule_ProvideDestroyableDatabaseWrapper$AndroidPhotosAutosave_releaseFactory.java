package com.amazon.photos.autosave.internal.dagger.module;

import com.amazon.photos.autosave.AutosaveFrameworkContext;
import com.amazon.photos.autosave.internal.db.DestroyableDatabaseWrapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.photos.autosave.internal.dagger.PerAccount")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class DatabaseModule_ProvideDestroyableDatabaseWrapper$AndroidPhotosAutosave_releaseFactory implements Factory<DestroyableDatabaseWrapper> {
    private final Provider<AutosaveFrameworkContext> frameworkContextProvider;
    private final DatabaseModule module;

    public DatabaseModule_ProvideDestroyableDatabaseWrapper$AndroidPhotosAutosave_releaseFactory(DatabaseModule databaseModule, Provider<AutosaveFrameworkContext> provider) {
        this.module = databaseModule;
        this.frameworkContextProvider = provider;
    }

    public static DatabaseModule_ProvideDestroyableDatabaseWrapper$AndroidPhotosAutosave_releaseFactory create(DatabaseModule databaseModule, Provider<AutosaveFrameworkContext> provider) {
        return new DatabaseModule_ProvideDestroyableDatabaseWrapper$AndroidPhotosAutosave_releaseFactory(databaseModule, provider);
    }

    public static DestroyableDatabaseWrapper provideDestroyableDatabaseWrapper$AndroidPhotosAutosave_release(DatabaseModule databaseModule, AutosaveFrameworkContext autosaveFrameworkContext) {
        return (DestroyableDatabaseWrapper) Preconditions.checkNotNullFromProvides(databaseModule.provideDestroyableDatabaseWrapper$AndroidPhotosAutosave_release(autosaveFrameworkContext));
    }

    @Override // javax.inject.Provider
    public DestroyableDatabaseWrapper get() {
        return provideDestroyableDatabaseWrapper$AndroidPhotosAutosave_release(this.module, this.frameworkContextProvider.get());
    }
}
