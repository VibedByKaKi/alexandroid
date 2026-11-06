package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.CleanerService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public class Log {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LogPeerCleaner implements Runnable {
        private long peer;

        public LogPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public Log(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native void debug(@NonNull String str, @Nullable String str2);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native void debug(@NonNull String str, @Nullable String str2, @NonNull LogThrottler logThrottler);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native void error(@NonNull String str, @Nullable String str2);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native void error(@NonNull String str, @Nullable String str2, @NonNull LogThrottler logThrottler);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native void info(@NonNull String str, @Nullable String str2);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native void info(@NonNull String str, @Nullable String str2, @NonNull LogThrottler logThrottler);

    private static native void nativeSelfRegister();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new LogPeerCleaner(j));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native void warning(@NonNull String str, @Nullable String str2);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native void warning(@NonNull String str, @Nullable String str2, @NonNull LogThrottler logThrottler);
}
