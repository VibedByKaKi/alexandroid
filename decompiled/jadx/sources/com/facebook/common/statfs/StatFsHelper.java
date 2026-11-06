package com.facebook.common.statfs;

import android.annotation.SuppressLint;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.internal.Throwables;
import com.facebook.infer.annotation.Nullsafe;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
import org.aspectj.lang.JoinPoint;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class StatFsHelper {
    public static final long DEFAULT_DISK_OLIVE_LEVEL_IN_BYTES = 1048576000;
    public static final long DEFAULT_DISK_RED_LEVEL_IN_BYTES = 104857600;
    public static final int DEFAULT_DISK_RED_LEVEL_IN_MB = 100;
    public static final long DEFAULT_DISK_YELLOW_LEVEL_IN_BYTES = 419430400;
    public static final int DEFAULT_DISK_YELLOW_LEVEL_IN_MB = 400;
    private static final long RESTAT_INTERVAL_MS = 120000;
    private static StatFsHelper sStatsFsHelper;

    @Nullable
    private volatile File mExternalPath;

    @Nullable
    private volatile File mInternalPath;

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private long mLastRestatTime;

    @Nullable
    private volatile StatFs mInternalStatFs = null;

    @Nullable
    private volatile StatFs mExternalStatFs = null;
    private volatile boolean mInitialized = false;
    private final Lock lock = new ReentrantLock();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum StorageType {
        INTERNAL,
        EXTERNAL
    }

    public static StatFs createStatFs(String str) {
        return new StatFs(str);
    }

    private void ensureInitialized() {
        if (this.mInitialized) {
            return;
        }
        this.lock.lock();
        try {
            if (!this.mInitialized) {
                this.mInternalPath = Environment.getDataDirectory();
                this.mExternalPath = Environment.getExternalStorageDirectory();
                updateStats();
                this.mInitialized = true;
            }
        } finally {
            this.lock.unlock();
        }
    }

    public static synchronized StatFsHelper getInstance() {
        StatFsHelper statFsHelper;
        synchronized (StatFsHelper.class) {
            try {
                if (sStatsFsHelper == null) {
                    sStatsFsHelper = new StatFsHelper();
                }
                statFsHelper = sStatsFsHelper;
            } catch (Throwable th) {
                throw th;
            }
        }
        return statFsHelper;
    }

    private void maybeUpdateStats() {
        if (this.lock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.mLastRestatTime > RESTAT_INTERVAL_MS) {
                    updateStats();
                }
            } finally {
                this.lock.unlock();
            }
        }
    }

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private void updateStats() {
        this.mInternalStatFs = updateStatsHelper(this.mInternalStatFs, this.mInternalPath);
        this.mExternalStatFs = updateStatsHelper(this.mExternalStatFs, this.mExternalPath);
        this.mLastRestatTime = SystemClock.uptimeMillis();
    }

    @Nullable
    private StatFs updateStatsHelper(@Nullable StatFs statFs, @Nullable File file) {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return createStatFs(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                throw Throwables.propagate(th);
            }
        }
        return null;
    }

    @SuppressLint({"DeprecatedMethod"})
    public long getAvailableStorageSpace(StorageType storageType) {
        ensureInitialized();
        maybeUpdateStats();
        StatFs statFs = storageType == StorageType.INTERNAL ? this.mInternalStatFs : this.mExternalStatFs;
        if (statFs != null) {
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        }
        return 0L;
    }

    @SuppressLint({"DeprecatedMethod"})
    public long getFreeStorageSpace(StorageType storageType) {
        ensureInitialized();
        maybeUpdateStats();
        StatFs statFs = storageType == StorageType.INTERNAL ? this.mInternalStatFs : this.mExternalStatFs;
        if (statFs != null) {
            return statFs.getFreeBlocksLong() * statFs.getBlockSizeLong();
        }
        return -1L;
    }

    @SuppressLint({"DeprecatedMethod"})
    public long getTotalStorageSpace(StorageType storageType) {
        ensureInitialized();
        maybeUpdateStats();
        StatFs statFs = storageType == StorageType.INTERNAL ? this.mInternalStatFs : this.mExternalStatFs;
        if (statFs != null) {
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        }
        return -1L;
    }

    public boolean isHighSpaceCondition() {
        return getAvailableStorageSpace(StorageType.INTERNAL) > DEFAULT_DISK_OLIVE_LEVEL_IN_BYTES;
    }

    public boolean isLowSpaceCondition() {
        return getAvailableStorageSpace(StorageType.INTERNAL) < DEFAULT_DISK_YELLOW_LEVEL_IN_BYTES;
    }

    public boolean isVeryLowSpaceCondition() {
        return getAvailableStorageSpace(StorageType.INTERNAL) < 104857600;
    }

    public void resetStats() {
        if (this.lock.tryLock()) {
            try {
                ensureInitialized();
                updateStats();
            } finally {
                this.lock.unlock();
            }
        }
    }

    public boolean testLowDiskSpace(StorageType storageType, long j) {
        ensureInitialized();
        long availableStorageSpace = getAvailableStorageSpace(storageType);
        return availableStorageSpace <= 0 || availableStorageSpace < j;
    }
}
