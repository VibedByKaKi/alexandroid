package com.amazon.photos.uploader.cds.nodecache;

import androidx.room.Room;
import com.amazon.photos.uploader.UploadFrameworkContext;
import com.amazon.photos.uploader.internal.DestroyableDatabaseWrapper;
import com.amazon.photos.uploader.internal.dagger.PerAccount;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/photos/uploader/cds/nodecache/NodeCacheDatabaseModule;", "", "uploadFrameworkContext", "Lcom/amazon/photos/uploader/UploadFrameworkContext;", "(Lcom/amazon/photos/uploader/UploadFrameworkContext;)V", "nodeCacheDatabase", "Lcom/amazon/photos/uploader/cds/nodecache/NodeCacheDatabase;", "nodeCacheDbName", "", "provideDestroyableDatabaseWrapper", "Lcom/amazon/photos/uploader/internal/DestroyableDatabaseWrapper;", "frameworkContext", "provideDestroyableDatabaseWrapper$AndroidPhotosUploader_release", "provideNodeCacheTransactionRunner", "Lcom/amazon/photos/uploader/cds/nodecache/NodeCacheTransactionRunner;", "provideNodeCacheTransactionRunner$AndroidPhotosUploader_release", "provideParentIdDao", "Lcom/amazon/photos/uploader/cds/nodecache/ParentIdDao;", "provideParentIdDao$AndroidPhotosUploader_release", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class NodeCacheDatabaseModule {

    @NotNull
    private final NodeCacheDatabase nodeCacheDatabase;

    @NotNull
    private final String nodeCacheDbName;

    public NodeCacheDatabaseModule(@NotNull UploadFrameworkContext uploadFrameworkContext) {
        uploadFrameworkContext.getClass();
        String str = "uploader_node_cache_database_" + uploadFrameworkContext.getHashedDirectedId();
        this.nodeCacheDbName = str;
        this.nodeCacheDatabase = (NodeCacheDatabase) Room.databaseBuilder(uploadFrameworkContext.getApplicationContext(), NodeCacheDatabase.class, str).fallbackToDestructiveMigrationOnDowngrade().build();
    }

    @Provides
    @Named("NodeCacheDestroyable")
    @NotNull
    @PerAccount
    public final DestroyableDatabaseWrapper provideDestroyableDatabaseWrapper$AndroidPhotosUploader_release(@NotNull UploadFrameworkContext frameworkContext) {
        frameworkContext.getClass();
        return new DestroyableDatabaseWrapper(this.nodeCacheDbName, this.nodeCacheDatabase, frameworkContext.getApplicationContext());
    }

    @Provides
    @PerAccount
    @NotNull
    public final NodeCacheTransactionRunner provideNodeCacheTransactionRunner$AndroidPhotosUploader_release() {
        return new NodeCacheTransactionRunner(this.nodeCacheDatabase);
    }

    @Provides
    @PerAccount
    @NotNull
    public final ParentIdDao provideParentIdDao$AndroidPhotosUploader_release() {
        return this.nodeCacheDatabase.parentIdDao();
    }
}
