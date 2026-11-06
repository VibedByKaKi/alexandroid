package com.amazon.photos.autosave.internal.dagger.module;

import com.amazon.photos.autosave.internal.db.AutosaveTransactionRunner;
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
public final class DatabaseModule_ProvideTransactionRunner$AndroidPhotosAutosave_releaseFactory implements Factory<AutosaveTransactionRunner> {
    private final DatabaseModule module;

    public DatabaseModule_ProvideTransactionRunner$AndroidPhotosAutosave_releaseFactory(DatabaseModule databaseModule) {
        this.module = databaseModule;
    }

    public static DatabaseModule_ProvideTransactionRunner$AndroidPhotosAutosave_releaseFactory create(DatabaseModule databaseModule) {
        return new DatabaseModule_ProvideTransactionRunner$AndroidPhotosAutosave_releaseFactory(databaseModule);
    }

    public static AutosaveTransactionRunner provideTransactionRunner$AndroidPhotosAutosave_release(DatabaseModule databaseModule) {
        return (AutosaveTransactionRunner) Preconditions.checkNotNullFromProvides(databaseModule.provideTransactionRunner$AndroidPhotosAutosave_release());
    }

    @Override // javax.inject.Provider
    public AutosaveTransactionRunner get() {
        return provideTransactionRunner$AndroidPhotosAutosave_release(this.module);
    }
}
