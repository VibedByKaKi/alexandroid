package com.amazon.photos.uploader.internal.utils;

import com.amazon.photos.uploader.internal.OpenForTesting;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@OpenForTesting
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/amazon/photos/uploader/internal/utils/FileUtils;", "", "()V", "isSinglePartUploadAllowed", "", "file", "Ljava/io/File;", "isValidFile", "Companion", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FileUtils {
    private static final long ONE_MEGA_BYTE = 1048576;
    private static final long UPLOAD_SIZE_MAX_SIZE_BYTES = 16777216;

    public final boolean isSinglePartUploadAllowed(@NotNull File file) {
        file.getClass();
        return isValidFile(file) && file.length() < UPLOAD_SIZE_MAX_SIZE_BYTES;
    }

    public final boolean isValidFile(@NotNull File file) {
        file.getClass();
        return file.length() > 0 && file.isFile();
    }
}
