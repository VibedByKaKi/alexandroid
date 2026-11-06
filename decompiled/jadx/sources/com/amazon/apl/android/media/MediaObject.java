package com.amazon.apl.android.media;

import android.util.Size;
import java.io.File;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaObject {
    private File mFile;
    private final long mNativeHandle;
    private Size mSize;
    private final String mUrl;

    private MediaObject(long j, String str) {
        this.mNativeHandle = j;
        this.mUrl = str;
    }

    public static MediaObject ensure(long j) {
        MediaObject nGetJavaObject = nGetJavaObject(j);
        if (nGetJavaObject != null) {
            return nGetJavaObject;
        }
        MediaObject mediaObject = new MediaObject(j, nGetUrl(j));
        nBind(j, mediaObject);
        return mediaObject;
    }

    private static native void nBind(long j, Object obj);

    private static native MediaObject nGetJavaObject(long j);

    private static native String nGetUrl(long j);

    private native void nOnError(long j, int i, byte[] bArr);

    private native void nOnLoad(long j, int i, int i2);

    public synchronized File getFile() {
        return this.mFile;
    }

    public synchronized Size getSize() {
        return this.mSize;
    }

    public String getUrl() {
        return nGetUrl(this.mNativeHandle);
    }

    public int hashCode() {
        return this.mUrl.hashCode();
    }

    public void onError(int i, String str) {
        nOnError(this.mNativeHandle, i, str.getBytes(StandardCharsets.UTF_8));
    }

    public synchronized void onLoad(int i, int i2) {
        this.mSize = new Size(i, i2);
        nOnLoad(this.mNativeHandle, i, i2);
    }

    public synchronized void setFile(File file) {
        this.mFile = file;
    }
}
