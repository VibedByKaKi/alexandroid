package com.amazon.alexa.sharing.util;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import com.amazon.alexa.sharing.common.Constants;
import com.amazon.alexa.sharing.media.MediaContentManager;
import com.amazon.alexa.sharing.media.MediaFileContent;
import com.amazon.comms.log.CommsLogger;
import java.io.File;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SharedPreferenceUtils {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, SharedPreferenceUtils.class);

    @Inject
    public SharedPreferenceUtils() {
    }

    public void clearPreferenceEntry(Context context, @NonNull String str) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences("SHARED_PREFS", 0).edit().remove(str).apply();
    }

    public File copyContentStreamToCache(@NonNull Uri uri, @NonNull Context context) {
        MediaContentManager mediaContentManager = new MediaContentManager(context);
        String path = uri.getPath();
        File file = new File(path);
        if (!mediaContentManager.existsInCache(path)) {
            LOG.d("[Sharing] NOT IN CACHE");
            return putContentStreamInCache(uri, path, file, false, context);
        }
        CommsLogger commsLogger = LOG;
        commsLogger.d("[Sharing] EXISTS IN CACHE");
        File file2 = mediaContentManager.getFromCache(path).getFile();
        if (!lastModifiedDiffers(file2.lastModified(), file.lastModified()).booleanValue()) {
            return file2;
        }
        commsLogger.d("[Sharing] Last modified differs");
        return putContentStreamInCache(uri, path, file, true, context);
    }

    public boolean getBooleanPreferenceFromSharedPrefs(Context context, @NonNull String str, boolean z) {
        if (context != null) {
            return context.getSharedPreferences("SHARED_PREFS", 0).getBoolean(str, z);
        }
        LOG.e("Context is null. Cannot fetch Boolean preferences");
        return false;
    }

    public String getMimeType(Uri uri) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
        }
        return null;
    }

    public String getStringPreferenceFromSharedPrefs(Context context, @NonNull String str, String str2) {
        if (context != null) {
            return context.getSharedPreferences("SHARED_PREFS", 0).getString(str, str2);
        }
        LOG.e("Context is null. Cannot fetch Boolean preferences");
        return null;
    }

    public Boolean lastModifiedDiffers(long j, long j2) {
        return Boolean.valueOf(j != j2);
    }

    public File putContentStreamInCache(@NonNull Uri uri, String str, File file, boolean z, Context context) {
        MediaContentManager mediaContentManager = new MediaContentManager(context);
        MediaFileContent mediaFileContent = new MediaFileContent(file);
        mediaFileContent.setContentType(getMimeType(uri));
        mediaContentManager.putInCache(mediaFileContent, str, z);
        return file;
    }

    public void writeBooleanPreferenceToSharedPrefs(Context context, @NonNull String str, boolean z) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences("SHARED_PREFS", 0).edit().putBoolean(str, z).apply();
    }

    public void writeStringPreferenceToSharedPrefs(Context context, @NonNull String str, String str2) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences("SHARED_PREFS", 0).edit().putString(str, str2).apply();
    }
}
