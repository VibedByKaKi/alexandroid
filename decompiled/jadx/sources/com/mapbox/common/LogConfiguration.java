package com.mapbox.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mapbox.bindgen.CleanerService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class LogConfiguration {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LogConfigurationPeerCleaner implements Runnable {
        private long peer;

        public LogConfigurationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            LogConfiguration.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public LogConfiguration(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    @Nullable
    public static native LoggingLevel getLoggingLevel();

    @Nullable
    public static native LoggingLevel getLoggingLevel(@NonNull String str);

    private static native void nativeSelfRegister();

    public static native void registerLogWriterBackend(@Nullable LogWriterBackend logWriterBackend);

    public static native void resetLoggingLevel(@NonNull String str);

    public static native void setLoggingLevel(@Nullable LoggingLevel loggingLevel);

    public static native void setLoggingLevel(@NonNull String str, @Nullable LoggingLevel loggingLevel);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new LogConfigurationPeerCleaner(j));
    }
}
