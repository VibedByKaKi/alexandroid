package com.amazon.photos.uploader.internal.dagger.module;

import androidx.room.Room;
import com.amazon.photos.uploader.MigrationUtilKt;
import com.amazon.photos.uploader.UploadFrameworkContext;
import com.amazon.photos.uploader.dao.BlockerDao;
import com.amazon.photos.uploader.dao.EventDao;
import com.amazon.photos.uploader.dao.RequestDao;
import com.amazon.photos.uploader.internal.DestroyableDatabaseWrapper;
import com.amazon.photos.uploader.internal.OpenForTesting;
import com.amazon.photos.uploader.internal.UploadSummaryTracker;
import com.amazon.photos.uploader.internal.UploaderDatabase;
import com.amazon.photos.uploader.internal.UploaderTransactionRunner;
import com.amazon.photos.uploader.internal.dagger.PerAccount;
import com.amazon.photos.uploader.internal.dao.UploadRequestDao;
import com.amazon.photos.uploader.internal.livedata.GlobalBlockerLiveDataProvider;
import com.amazon.photos.uploader.internal.livedata.QueueBlockerLiveDataProvider;
import com.amazon.photos.uploader.internal.livedata.RunningRequestProvider;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@OpenForTesting
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\u0015J\r\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dJ\r\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b J\r\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/amazon/photos/uploader/internal/dagger/module/DatabaseModule;", "", "uploadFrameworkContext", "Lcom/amazon/photos/uploader/UploadFrameworkContext;", "(Lcom/amazon/photos/uploader/UploadFrameworkContext;)V", "database", "Lcom/amazon/photos/uploader/internal/UploaderDatabase;", "dbName", "", "provideBlockerDao", "Lcom/amazon/photos/uploader/dao/BlockerDao;", "globalBlockerLiveDataProvider", "Lcom/amazon/photos/uploader/internal/livedata/GlobalBlockerLiveDataProvider;", "queueBlockerLiveDataProvider", "Lcom/amazon/photos/uploader/internal/livedata/QueueBlockerLiveDataProvider;", "uploadSummaryTracker", "Lcom/amazon/photos/uploader/internal/UploadSummaryTracker;", "provideBlockerDao$AndroidPhotosUploader_release", "provideDestroyableDatabaseWrapper", "Lcom/amazon/photos/uploader/internal/DestroyableDatabaseWrapper;", "frameworkContext", "provideDestroyableDatabaseWrapper$AndroidPhotosUploader_release", "provideEventDao", "Lcom/amazon/photos/uploader/dao/EventDao;", "provideEventDao$AndroidPhotosUploader_release", "provideRequestDao", "Lcom/amazon/photos/uploader/dao/RequestDao;", "runningRequestProvider", "Lcom/amazon/photos/uploader/internal/livedata/RunningRequestProvider;", "provideRequestDao$AndroidPhotosUploader_release", "provideTransactionRunner", "Lcom/amazon/photos/uploader/internal/UploaderTransactionRunner;", "provideTransactionRunner$AndroidPhotosUploader_release", "provideUploadRequestDao", "Lcom/amazon/photos/uploader/internal/dao/UploadRequestDao;", "provideUploadRequestDao$AndroidPhotosUploader_release", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class DatabaseModule {

    @NotNull
    private final UploaderDatabase database;

    @NotNull
    private final String dbName;

    public DatabaseModule(@NotNull UploadFrameworkContext uploadFrameworkContext) {
        uploadFrameworkContext.getClass();
        String str = "uploader_database_" + uploadFrameworkContext.getHashedDirectedId();
        this.dbName = str;
        this.database = (UploaderDatabase) Room.databaseBuilder(uploadFrameworkContext.getApplicationContext(), UploaderDatabase.class, str).addMigrations(MigrationUtilKt.getMIGRATION_1_2(), MigrationUtilKt.getMIGRATION_2_3(), MigrationUtilKt.getMIGRATION_3_4()).fallbackToDestructiveMigrationOnDowngrade().build();
    }

    @Provides
    @PerAccount
    @NotNull
    public final BlockerDao provideBlockerDao$AndroidPhotosUploader_release(@NotNull GlobalBlockerLiveDataProvider globalBlockerLiveDataProvider, @NotNull QueueBlockerLiveDataProvider queueBlockerLiveDataProvider, @NotNull UploadSummaryTracker uploadSummaryTracker) {
        globalBlockerLiveDataProvider.getClass();
        queueBlockerLiveDataProvider.getClass();
        uploadSummaryTracker.getClass();
        return new BlockerDao(globalBlockerLiveDataProvider, queueBlockerLiveDataProvider, uploadSummaryTracker);
    }

    @Provides
    @PerAccount
    @NotNull
    public final DestroyableDatabaseWrapper provideDestroyableDatabaseWrapper$AndroidPhotosUploader_release(@NotNull UploadFrameworkContext frameworkContext) {
        frameworkContext.getClass();
        return new DestroyableDatabaseWrapper(this.dbName, this.database, frameworkContext.getApplicationContext());
    }

    @Provides
    @PerAccount
    @NotNull
    public final EventDao provideEventDao$AndroidPhotosUploader_release() {
        return this.database.eventDao();
    }

    @Provides
    @PerAccount
    @NotNull
    public final RequestDao provideRequestDao$AndroidPhotosUploader_release(@NotNull RunningRequestProvider runningRequestProvider) {
        runningRequestProvider.getClass();
        return new RequestDao(this.database.liveRequestDao(), this.database.snapshotRequestDao(), runningRequestProvider);
    }

    @Provides
    @PerAccount
    @NotNull
    public final UploaderTransactionRunner provideTransactionRunner$AndroidPhotosUploader_release() {
        return new UploaderTransactionRunner(this.database);
    }

    @Provides
    @PerAccount
    @NotNull
    public final UploadRequestDao provideUploadRequestDao$AndroidPhotosUploader_release() {
        return this.database.requestDao();
    }
}
