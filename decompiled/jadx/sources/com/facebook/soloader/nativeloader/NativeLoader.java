package com.facebook.soloader.nativeloader;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class NativeLoader {
    private static NativeLoaderDelegate sDelegate;

    private NativeLoader() {
    }

    public static String getLibraryPath(String str) throws IOException {
        NativeLoaderDelegate nativeLoaderDelegate;
        synchronized (NativeLoader.class) {
            nativeLoaderDelegate = sDelegate;
            if (nativeLoaderDelegate == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return nativeLoaderDelegate.getLibraryPath(str);
    }

    public static int getSoSourcesVersion() {
        NativeLoaderDelegate nativeLoaderDelegate;
        synchronized (NativeLoader.class) {
            nativeLoaderDelegate = sDelegate;
            if (nativeLoaderDelegate == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return nativeLoaderDelegate.getSoSourcesVersion();
    }

    public static void init(NativeLoaderDelegate nativeLoaderDelegate) {
        synchronized (NativeLoader.class) {
            try {
                if (sDelegate != null) {
                    throw new IllegalStateException("Cannot re-initialize NativeLoader.");
                }
                sDelegate = nativeLoaderDelegate;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void initIfUninitialized(NativeLoaderDelegate nativeLoaderDelegate) {
        if (isInitialized()) {
            return;
        }
        init(nativeLoaderDelegate);
    }

    public static boolean isInitialized() {
        boolean z;
        synchronized (NativeLoader.class) {
            z = sDelegate != null;
        }
        return z;
    }

    public static boolean loadLibrary(String str, int i) {
        NativeLoaderDelegate nativeLoaderDelegate;
        synchronized (NativeLoader.class) {
            nativeLoaderDelegate = sDelegate;
            if (nativeLoaderDelegate == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return nativeLoaderDelegate.loadLibrary(str, i);
    }

    public static boolean loadLibrary(String str) {
        return loadLibrary(str, 0);
    }
}
