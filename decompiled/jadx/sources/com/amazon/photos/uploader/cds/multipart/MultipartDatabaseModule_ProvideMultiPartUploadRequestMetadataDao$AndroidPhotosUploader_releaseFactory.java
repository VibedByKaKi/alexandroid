package com.amazon.photos.uploader.cds.multipart;

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
public final class MultipartDatabaseModule_ProvideMultiPartUploadRequestMetadataDao$AndroidPhotosUploader_releaseFactory implements Factory<MultipartUploadRequestMetadataDao> {
    private final MultipartDatabaseModule module;

    public MultipartDatabaseModule_ProvideMultiPartUploadRequestMetadataDao$AndroidPhotosUploader_releaseFactory(MultipartDatabaseModule multipartDatabaseModule) {
        this.module = multipartDatabaseModule;
    }

    public static MultipartDatabaseModule_ProvideMultiPartUploadRequestMetadataDao$AndroidPhotosUploader_releaseFactory create(MultipartDatabaseModule multipartDatabaseModule) {
        return new MultipartDatabaseModule_ProvideMultiPartUploadRequestMetadataDao$AndroidPhotosUploader_releaseFactory(multipartDatabaseModule);
    }

    public static MultipartUploadRequestMetadataDao provideMultiPartUploadRequestMetadataDao$AndroidPhotosUploader_release(MultipartDatabaseModule multipartDatabaseModule) {
        return (MultipartUploadRequestMetadataDao) Preconditions.checkNotNullFromProvides(multipartDatabaseModule.provideMultiPartUploadRequestMetadataDao$AndroidPhotosUploader_release());
    }

    @Override // javax.inject.Provider
    public MultipartUploadRequestMetadataDao get() {
        return provideMultiPartUploadRequestMetadataDao$AndroidPhotosUploader_release(this.module);
    }
}
