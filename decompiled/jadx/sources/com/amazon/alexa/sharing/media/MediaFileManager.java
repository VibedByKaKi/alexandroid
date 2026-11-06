package com.amazon.alexa.sharing.media;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.sharing.Constants;
import com.amazon.comms.log.CommsLogger;
import com.amazon.commscore.api.commsbridge.ResponseResolver;
import java.io.File;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class MediaFileManager {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, MediaFileManager.class);

    @VisibleForTesting
    public File getFileFromFilePath(@NonNull String str) {
        return new File(str);
    }

    @VisibleForTesting
    public String getFilePathFromUri(@NonNull String str) {
        return Uri.parse(str).getPath();
    }

    @VisibleForTesting
    public void removeFilesFromDisk(@NonNull String[] strArr, @NonNull ResponseResolver responseResolver) {
        for (String str : strArr) {
            try {
                String filePathFromUri = getFilePathFromUri(str);
                if (getFileFromFilePath(filePathFromUri).delete()) {
                    LOG.i("[MediaFileRemoval] Deleted file: " + filePathFromUri);
                } else {
                    LOG.i("[MediaFileRemoval] File NOT deleted: " + filePathFromUri);
                }
            } catch (Exception e) {
                LOG.e("[MediaFileRemoval] Exception while deleting file: " + str, e);
            }
        }
        responseResolver.resolve(null);
    }
}
