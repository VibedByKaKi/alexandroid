package com.amazon.photos.uploader.cds.nodecache;

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
public final class NodeCacheDatabaseModule_ProvideDestroyableDatabaseWrapper$AndroidPhotosUploader_releaseFactory implements Factory<DestroyableDatabaseWrapper> {
    private final Provider<UploadFrameworkContext> frameworkContextProvider;
    private final NodeCacheDatabaseModule module;

    public NodeCacheDatabaseModule_ProvideDestroyableDatabaseWrapper$AndroidPhotosUploader_releaseFactory(NodeCacheDatabaseModule nodeCacheDatabaseModule, Provider<UploadFrameworkContext> provider) {
        this.module = nodeCacheDatabaseModule;
        this.frameworkContextProvider = provider;
    }

    public static NodeCacheDatabaseModule_ProvideDestroyableDatabaseWrapper$AndroidPhotosUploader_releaseFactory create(NodeCacheDatabaseModule nodeCacheDatabaseModule, Provider<UploadFrameworkContext> provider) {
        return new NodeCacheDatabaseModule_ProvideDestroyableDatabaseWrapper$AndroidPhotosUploader_releaseFactory(nodeCacheDatabaseModule, provider);
    }

    public static DestroyableDatabaseWrapper provideDestroyableDatabaseWrapper$AndroidPhotosUploader_release(NodeCacheDatabaseModule nodeCacheDatabaseModule, UploadFrameworkContext uploadFrameworkContext) {
        return (DestroyableDatabaseWrapper) Preconditions.checkNotNullFromProvides(nodeCacheDatabaseModule.provideDestroyableDatabaseWrapper$AndroidPhotosUploader_release(uploadFrameworkContext));
    }

    @Override // javax.inject.Provider
    public DestroyableDatabaseWrapper get() {
        return provideDestroyableDatabaseWrapper$AndroidPhotosUploader_release(this.module, this.frameworkContextProvider.get());
    }
}
