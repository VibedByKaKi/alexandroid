package com.facebook.soloader.nativeloader;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface NativeLoaderDelegate {
    public static final int SKIP_MERGED_JNI_ONLOAD = 1;

    String getLibraryPath(String str) throws IOException;

    int getSoSourcesVersion();

    boolean loadLibrary(String str, int i);
}
