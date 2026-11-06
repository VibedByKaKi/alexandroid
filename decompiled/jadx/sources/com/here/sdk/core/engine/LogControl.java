package com.here.sdk.core.engine;

import androidx.annotation.NonNull;
import com.here.NativeBase;
import com.here.sdk.core.SDKLibraryLoader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LogControl extends NativeBase {
    static final SDKLibraryLoader LIBRARY_LOADER = new SDKLibraryLoader("SDK");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InvalidPathException extends Exception {
        public final String error;

        public InvalidPathException(String str) {
            super(str.toString());
            this.error = str;
        }
    }

    public LogControl(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.core.engine.LogControl.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                LogControl.disposeNativeHandle(j2);
            }
        });
    }

    public static native void disableLoggingToConsole();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public static native void enableLoggingToConsole(@NonNull LogLevel logLevel);

    public static native void removeAppender();

    public static native void setAppender(@NonNull LogLevel logLevel, @NonNull LogAppender logAppender);

    public static native void setAppender(@NonNull LogLevel logLevel, @NonNull String str) throws InvalidPathException;
}
