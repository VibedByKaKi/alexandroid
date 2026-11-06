package com.amazon.photos.uploader.cds.multipart;

import com.amazon.photos.uploader.UploadFrameworkContext;
import com.amazon.photos.uploader.internal.DestroyableDatabaseWrapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.photos.uploader.internal.dagger.PerAccount")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes5.dex */
public final class MultipartDatabaseModule_ProvideDestroyableDatabaseWrapper$AndroidPhotosUploader_releaseFactory implements Factory<DestroyableDatabaseWrapper> {
    private final Provider<UploadFrameworkContext> frameworkContextProvider;
    private final MultipartDatabaseModule module;

    public MultipartDatabaseModule_ProvideDestroyableDatabaseWrapper$AndroidPhotosUploader_releaseFactory(MultipartDatabaseModule multipartDatabaseModule, Provider<UploadFrameworkContext> provider) {
        this.module = multipartDatabaseModule;
        this.frameworkContextProvider = provider;
    }

    public static MultipartDatabaseModule_ProvideDestroyableDatabaseWrapper$AndroidPhotosUploader_releaseFactory create(MultipartDatabaseModule multipartDatabaseModule, Provider<UploadFrameworkContext> provider) {
        return new MultipartDatabaseModule_ProvideDestroyableDatabaseWrapper$AndroidPhotosUploader_releaseFactory(multipartDatabaseModule, provider);
    }

    public static DestroyableDatabaseWrapper provideDestroyableDatabaseWrapper$AndroidPhotosUploader_release(MultipartDatabaseModule multipartDatabaseModule, UploadFrameworkContext uploadFrameworkContext) {
        return (DestroyableDatabaseWrapper) Preconditions.checkNotNullFromProvides(multipartDatabaseModule.provideDestroyableDatabaseWrapper$AndroidPhotosUploader_release(uploadFrameworkContext));
    }

    @Override // javax.inject.Provider
    public DestroyableDatabaseWrapper get() {
        return provideDestroyableDatabaseWrapper$AndroidPhotosUploader_release(this.module, this.frameworkContextProvider.get());
    }
}
