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
public final class MultipartDatabaseModule_ProvidePartInfoDao$AndroidPhotosUploader_releaseFactory implements Factory<PartInfoDao> {
    private final MultipartDatabaseModule module;

    public MultipartDatabaseModule_ProvidePartInfoDao$AndroidPhotosUploader_releaseFactory(MultipartDatabaseModule multipartDatabaseModule) {
        this.module = multipartDatabaseModule;
    }

    public static MultipartDatabaseModule_ProvidePartInfoDao$AndroidPhotosUploader_releaseFactory create(MultipartDatabaseModule multipartDatabaseModule) {
        return new MultipartDatabaseModule_ProvidePartInfoDao$AndroidPhotosUploader_releaseFactory(multipartDatabaseModule);
    }

    public static PartInfoDao providePartInfoDao$AndroidPhotosUploader_release(MultipartDatabaseModule multipartDatabaseModule) {
        return (PartInfoDao) Preconditions.checkNotNullFromProvides(multipartDatabaseModule.providePartInfoDao$AndroidPhotosUploader_release());
    }

    @Override // javax.inject.Provider
    public PartInfoDao get() {
        return providePartInfoDao$AndroidPhotosUploader_release(this.module);
    }
}
