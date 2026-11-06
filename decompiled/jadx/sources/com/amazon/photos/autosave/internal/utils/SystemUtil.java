package com.amazon.photos.autosave.internal.utils;

import android.content.ContentUris;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.MediaStore;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0010J\r\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/amazon/photos/autosave/internal/utils/SystemUtil;", "", "()V", "elapsedRealTimeMillis", "", "elapsedRealTimeMillis$AndroidPhotosAutosave_release", "getBuildModel", "", "getBuildModel$AndroidPhotosAutosave_release", "getImageContentUri", "Landroid/net/Uri;", "id", "getImageContentUri$AndroidPhotosAutosave_release", "getPicturesDirectory", "getPicturesDirectory$AndroidPhotosAutosave_release", "getVideoContentUri", "getVideoContentUri$AndroidPhotosAutosave_release", "isOsVersionAtLeastN", "", "isOsVersionAtLeastN$AndroidPhotosAutosave_release", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SystemUtil {
    public final long elapsedRealTimeMillis$AndroidPhotosAutosave_release() {
        return SystemClock.elapsedRealtime();
    }

    @NotNull
    public final String getBuildModel$AndroidPhotosAutosave_release() {
        String str = Build.MODEL;
        str.getClass();
        return str;
    }

    @NotNull
    public final Uri getImageContentUri$AndroidPhotosAutosave_release(long id) {
        Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, id);
        withAppendedId.getClass();
        return withAppendedId;
    }

    @NotNull
    public final String getPicturesDirectory$AndroidPhotosAutosave_release() {
        String str = Environment.DIRECTORY_PICTURES;
        str.getClass();
        return str;
    }

    @NotNull
    public final Uri getVideoContentUri$AndroidPhotosAutosave_release(long id) {
        Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, id);
        withAppendedId.getClass();
        return withAppendedId;
    }

    public final boolean isOsVersionAtLeastN$AndroidPhotosAutosave_release() {
        return true;
    }
}
