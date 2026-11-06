package com.amazon.photos.uploader.cds.multipart;

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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\b\u0012J\r\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/amazon/photos/uploader/cds/multipart/MultipartDatabaseModule;", "", "uploadFrameworkContext", "Lcom/amazon/photos/uploader/UploadFrameworkContext;", "(Lcom/amazon/photos/uploader/UploadFrameworkContext;)V", "multipartDatabase", "Lcom/amazon/photos/uploader/cds/multipart/MultiPartUploadDatabase;", "multipartDbName", "", "provideDestroyableDatabaseWrapper", "Lcom/amazon/photos/uploader/internal/DestroyableDatabaseWrapper;", "frameworkContext", "provideDestroyableDatabaseWrapper$AndroidPhotosUploader_release", "provideMultiPartUploadRequestMetadataDao", "Lcom/amazon/photos/uploader/cds/multipart/MultipartUploadRequestMetadataDao;", "provideMultiPartUploadRequestMetadataDao$AndroidPhotosUploader_release", "provideMultipartTransactionRunner", "Lcom/amazon/photos/uploader/cds/multipart/MultipartTransactionRunner;", "provideMultipartTransactionRunner$AndroidPhotosUploader_release", "providePartInfoDao", "Lcom/amazon/photos/uploader/cds/multipart/PartInfoDao;", "providePartInfoDao$AndroidPhotosUploader_release", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class MultipartDatabaseModule {

    @NotNull
    private final MultiPartUploadDatabase multipartDatabase;

    @NotNull
    private final String multipartDbName;

    public MultipartDatabaseModule(@NotNull UploadFrameworkContext uploadFrameworkContext) {
        uploadFrameworkContext.getClass();
        String str = "uploader_multipart_database_" + uploadFrameworkContext.getHashedDirectedId();
        this.multipartDbName = str;
        this.multipartDatabase = (MultiPartUploadDatabase) Room.databaseBuilder(uploadFrameworkContext.getApplicationContext(), MultiPartUploadDatabase.class, str).fallbackToDestructiveMigrationOnDowngrade().build();
    }

    @Provides
    @Named("MultipartDestroyable")
    @NotNull
    @PerAccount
    public final DestroyableDatabaseWrapper provideDestroyableDatabaseWrapper$AndroidPhotosUploader_release(@NotNull UploadFrameworkContext frameworkContext) {
        frameworkContext.getClass();
        return new DestroyableDatabaseWrapper(this.multipartDbName, this.multipartDatabase, frameworkContext.getApplicationContext());
    }

    @Provides
    @PerAccount
    @NotNull
    public final MultipartUploadRequestMetadataDao provideMultiPartUploadRequestMetadataDao$AndroidPhotosUploader_release() {
        return this.multipartDatabase.multipartUploadRequestMetadataDao();
    }

    @Provides
    @PerAccount
    @NotNull
    public final MultipartTransactionRunner provideMultipartTransactionRunner$AndroidPhotosUploader_release() {
        return new MultipartTransactionRunner(this.multipartDatabase);
    }

    @Provides
    @PerAccount
    @NotNull
    public final PartInfoDao providePartInfoDao$AndroidPhotosUploader_release() {
        return this.multipartDatabase.partInfoDao();
    }
}
