package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class HardwareConfigState {
    public static final boolean BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED = false;
    private static final File FD_SIZE_LIST = new File("/proc/self/fd");

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean HARDWARE_BITMAPS_SUPPORTED = true;
    private static final int MAXIMUM_FDS_FOR_HARDWARE_CONFIGS_P = 20000;
    private static final int MINIMUM_DECODES_BETWEEN_FD_CHECKS = 50;

    @Deprecated
    public static final int NO_MAX_FD_COUNT = -1;
    private static final int REDUCED_MAX_FDS_FOR_HARDWARE_CONFIGS_P = 500;
    private static final String TAG = "HardwareConfig";
    private static volatile HardwareConfigState instance;

    @GuardedBy("this")
    private int decodesSinceLastFdCheck;

    @GuardedBy("this")
    private boolean isFdSizeBelowHardwareLimit = true;
    private final AtomicBoolean isHardwareConfigAllowedByAppState = new AtomicBoolean(false);
    private final int sdkBasedMaxFdCount = 20000;

    @VisibleForTesting
    public HardwareConfigState() {
    }

    private boolean areHardwareBitmapsBlockedByAppState() {
        return BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED && !this.isHardwareConfigAllowedByAppState.get();
    }

    public static HardwareConfigState getInstance() {
        if (instance == null) {
            synchronized (HardwareConfigState.class) {
                try {
                    if (instance == null) {
                        instance = new HardwareConfigState();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private int getMaxFdCount() {
        if (isHardwareBitmapCountReducedOnApi28ByB139097735()) {
            return 500;
        }
        return this.sdkBasedMaxFdCount;
    }

    private synchronized boolean isFdSizeBelowHardwareLimit() {
        try {
            boolean z = true;
            int i = this.decodesSinceLastFdCheck + 1;
            this.decodesSinceLastFdCheck = i;
            if (i >= 50) {
                this.decodesSinceLastFdCheck = 0;
                int length = FD_SIZE_LIST.list().length;
                long maxFdCount = getMaxFdCount();
                if (length >= maxFdCount) {
                    z = false;
                }
                this.isFdSizeBelowHardwareLimit = z;
                if (!z && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + maxFdCount);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isFdSizeBelowHardwareLimit;
    }

    private static boolean isHardwareBitmapCountReducedOnApi28ByB139097735() {
        return false;
    }

    public void blockHardwareBitmaps() {
        Util.assertMainThread();
        this.isHardwareConfigAllowedByAppState.set(false);
    }

    public boolean isHardwareConfigAllowed(int i, int i2, boolean z, boolean z2) {
        if (!z) {
            Log.isLoggable(TAG, 2);
            return false;
        }
        if (!HARDWARE_BITMAPS_SUPPORTED) {
            Log.isLoggable(TAG, 2);
            return false;
        }
        if (areHardwareBitmapsBlockedByAppState()) {
            Log.isLoggable(TAG, 2);
            return false;
        }
        if (z2) {
            Log.isLoggable(TAG, 2);
            return false;
        }
        if (i < 0 || i2 < 0) {
            Log.isLoggable(TAG, 2);
            return false;
        }
        if (isFdSizeBelowHardwareLimit()) {
            return true;
        }
        Log.isLoggable(TAG, 2);
        return false;
    }

    @TargetApi(26)
    public boolean setHardwareConfigIfAllowed(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean isHardwareConfigAllowed = isHardwareConfigAllowed(i, i2, z, z2);
        if (isHardwareConfigAllowed) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return isHardwareConfigAllowed;
    }

    public void unblockHardwareBitmaps() {
        Util.assertMainThread();
        this.isHardwareConfigAllowedByAppState.set(true);
    }
}
