package com.amazon.photos.uploader.cds.nodecache;

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
public final class NodeCacheDatabaseModule_ProvideParentIdDao$AndroidPhotosUploader_releaseFactory implements Factory<ParentIdDao> {
    private final NodeCacheDatabaseModule module;

    public NodeCacheDatabaseModule_ProvideParentIdDao$AndroidPhotosUploader_releaseFactory(NodeCacheDatabaseModule nodeCacheDatabaseModule) {
        this.module = nodeCacheDatabaseModule;
    }

    public static NodeCacheDatabaseModule_ProvideParentIdDao$AndroidPhotosUploader_releaseFactory create(NodeCacheDatabaseModule nodeCacheDatabaseModule) {
        return new NodeCacheDatabaseModule_ProvideParentIdDao$AndroidPhotosUploader_releaseFactory(nodeCacheDatabaseModule);
    }

    public static ParentIdDao provideParentIdDao$AndroidPhotosUploader_release(NodeCacheDatabaseModule nodeCacheDatabaseModule) {
        return (ParentIdDao) Preconditions.checkNotNullFromProvides(nodeCacheDatabaseModule.provideParentIdDao$AndroidPhotosUploader_release());
    }

    @Override // javax.inject.Provider
    public ParentIdDao get() {
        return provideParentIdDao$AndroidPhotosUploader_release(this.module);
    }
}
