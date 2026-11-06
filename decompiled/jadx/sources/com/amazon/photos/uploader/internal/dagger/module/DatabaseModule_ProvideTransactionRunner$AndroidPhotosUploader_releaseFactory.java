package com.amazon.photos.uploader.internal.dagger.module;

import com.amazon.photos.uploader.internal.UploaderTransactionRunner;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.photos.uploader.internal.dagger.PerAccount")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class DatabaseModule_ProvideTransactionRunner$AndroidPhotosUploader_releaseFactory implements Factory<UploaderTransactionRunner> {
    private final DatabaseModule module;

    public DatabaseModule_ProvideTransactionRunner$AndroidPhotosUploader_releaseFactory(DatabaseModule databaseModule) {
        this.module = databaseModule;
    }

    public static DatabaseModule_ProvideTransactionRunner$AndroidPhotosUploader_releaseFactory create(DatabaseModule databaseModule) {
        return new DatabaseModule_ProvideTransactionRunner$AndroidPhotosUploader_releaseFactory(databaseModule);
    }

    public static UploaderTransactionRunner provideTransactionRunner$AndroidPhotosUploader_release(DatabaseModule databaseModule) {
        return (UploaderTransactionRunner) Preconditions.checkNotNullFromProvides(databaseModule.provideTransactionRunner$AndroidPhotosUploader_release());
    }

    @Override // javax.inject.Provider
    public UploaderTransactionRunner get() {
        return provideTransactionRunner$AndroidPhotosUploader_release(this.module);
    }
}
