package net.zetetic.database.sqlcipher;

import android.os.StatFs;
import com.amazon.alexa.accessory.notificationpublisher.providers.BaseTemplateProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class SQLiteGlobal {
    private static final String TAG = "SQLiteGlobal";
    private static int sDefaultPageSize = 4096;
    private static final Object sLock = new Object();

    private SQLiteGlobal() {
    }

    public static String getDefaultJournalMode() {
        return "delete";
    }

    public static int getDefaultPageSize() {
        synchronized (sLock) {
            try {
                if (sDefaultPageSize == 0) {
                    sDefaultPageSize = new StatFs("/data").getBlockSize();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 4096;
    }

    public static String getDefaultSyncMode() {
        return BaseTemplateProvider.NON_INVITATION_KEY;
    }

    public static int getJournalSizeLimit() {
        return 10000;
    }

    public static int getWALAutoCheckpoint() {
        return Math.max(1, 1000);
    }

    public static int getWALConnectionPoolSize() {
        return Math.max(2, 10);
    }

    public static String getWALSyncMode() {
        return BaseTemplateProvider.NON_INVITATION_KEY;
    }

    private static native int nativeReleaseMemory();

    public static int releaseMemory() {
        return nativeReleaseMemory();
    }
}
