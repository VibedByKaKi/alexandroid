package com.amazon.photos.uploader.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/photos/uploader/internal/UploaderTransactionRunner;", "", "database", "Lcom/amazon/photos/uploader/internal/UploaderDatabase;", "(Lcom/amazon/photos/uploader/internal/UploaderDatabase;)V", "runInTransaction", "", "runnable", "Ljava/lang/Runnable;", "runInTransaction$AndroidPhotosUploader_release", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UploaderTransactionRunner {

    @NotNull
    private final UploaderDatabase database;

    public UploaderTransactionRunner(@NotNull UploaderDatabase uploaderDatabase) {
        uploaderDatabase.getClass();
        this.database = uploaderDatabase;
    }

    public final void runInTransaction$AndroidPhotosUploader_release(@NotNull Runnable runnable) {
        runnable.getClass();
        this.database.runInTransaction(runnable);
    }
}
