package com.mapbox.common.experimental;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@MapboxExperimental
/* loaded from: classes8.dex */
public final class PersistentLogConfiguration {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PersistentLogConfigurationPeerCleaner implements Runnable {
        private long peer;

        public PersistentLogConfigurationPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            PersistentLogConfiguration.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public PersistentLogConfiguration(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    @MapboxExperimental
    public static native boolean getFileAllowHeader();

    @Nullable
    @MapboxExperimental
    public static native Long getFileFlushBufferSize();

    @Nullable
    @MapboxExperimental
    public static native LoggingLevel getFileFlushImmediateFromLogLevel();

    @Nullable
    @MapboxExperimental
    public static native Long getFileFlushLines();

    @Nullable
    @MapboxExperimental
    public static native Long getFileFlushSeconds();

    @Nullable
    @MapboxExperimental
    public static native LoggingLevel getFileLoggingLevel();

    @Nullable
    @MapboxExperimental
    public static native LoggingLevel getFileLoggingLevelForCategory(@NonNull String str);

    @MapboxExperimental
    public static native long getFileMaxSize();

    @NonNull
    @MapboxExperimental
    public static native String getFilePath();

    @MapboxExperimental
    public static native boolean getFilePerCategory();

    @MapboxExperimental
    public static native long getFileRotateCount();

    private static native void nativeSelfRegister();

    @MapboxExperimental
    public static native void resetFileLoggingLevelForCategory(@NonNull String str);

    @MapboxExperimental
    public static native void setFileAllowHeader(boolean z);

    @MapboxExperimental
    public static native void setFileFlushConfig(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable LoggingLevel loggingLevel);

    @MapboxExperimental
    public static native void setFileLoggingLevel(@Nullable LoggingLevel loggingLevel);

    @MapboxExperimental
    public static native void setFileLoggingLevelForCategory(@NonNull String str, @Nullable LoggingLevel loggingLevel);

    @MapboxExperimental
    public static native void setFileMaxSize(long j);

    @MapboxExperimental
    public static native void setFilePath(@NonNull String str);

    @MapboxExperimental
    public static native void setFilePerCategory(boolean z);

    @MapboxExperimental
    public static native void setFileRotateCount(long j);

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new PersistentLogConfigurationPeerCleaner(j));
    }
}
