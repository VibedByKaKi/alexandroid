package com.amazon.minerva.client.thirdparty.utils;

import android.app.Application;
import android.content.Context;
import com.amazon.minerva.client.thirdparty.configuration.MultiProcessConfiguration;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MultiProcessUtil {
    protected static final String BATCH_DIR_PREFIX = "app_MINERVA_";
    public static final String SERIALIZED_BATCH_DIR = "MINERVA";
    private static final MinervaLogger log = new MinervaLogger("MultiProcessUtil");
    protected static final int PROCESS_SUBSTR_START_POSITION = 12;

    /* JADX INFO: Access modifiers changed from: private */
    public static void clearDirectories(File[] fileArr) {
        if (fileArr != null) {
            for (File file : fileArr) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        File[] listFiles2 = file2.listFiles();
                        if (listFiles2 != null) {
                            for (File file3 : listFiles2) {
                                if (!file3.delete()) {
                                    log.warn("Unable to delete file! Cleanup will be incomplete. File " + file3.getName());
                                }
                            }
                        }
                        if (!file2.delete()) {
                            log.warn("Unable to delete nested directory! Cleanup will be incomplete. File " + file2.getName());
                        }
                    }
                }
                if (file.delete()) {
                    log.warn("Unable to delete directory! Cleanup will be incomplete. File " + file.getName());
                }
            }
        }
    }

    public static void clearUnusedDirectories(final MultiProcessConfiguration multiProcessConfiguration, final Context context, String str) {
        if (isMainProcess(multiProcessConfiguration, context, str)) {
            new Thread(new Runnable() { // from class: com.amazon.minerva.client.thirdparty.utils.MultiProcessUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    MultiProcessUtil.clearDirectories(new File(context.getApplicationInfo().dataDir).listFiles(new FilenameFilter() { // from class: com.amazon.minerva.client.thirdparty.utils.MultiProcessUtil.1.1
                        @Override // java.io.FilenameFilter
                        public boolean accept(File file, String str2) {
                            return MultiProcessUtil.isDirectoryUnused(multiProcessConfiguration, str2);
                        }
                    }));
                }
            }).start();
        }
    }

    public static String getDirectoryToUse(MultiProcessConfiguration multiProcessConfiguration, Context context, String str) {
        return (multiProcessConfiguration == null || str == null || str.isEmpty() || !multiProcessConfiguration.isSecondaryProcessNameOnList(str)) ? SERIALIZED_BATCH_DIR : "MINERVA_".concat(str);
    }

    public static String getProcessName() {
        String processName = Application.getProcessName();
        try {
            return (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null).invoke(null, null);
        } catch (Exception e) {
            log.warn("Unable to find current process name! Assuming it is not the main process. Error: " + e.getMessage());
            return processName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isDirectoryUnused(MultiProcessConfiguration multiProcessConfiguration, String str) {
        if (!str.startsWith(BATCH_DIR_PREFIX)) {
            return false;
        }
        if (multiProcessConfiguration != null) {
            if (multiProcessConfiguration.isSecondaryProcessNameOnList(str.substring(PROCESS_SUBSTR_START_POSITION))) {
                return false;
            }
            log.debug("Detected following directory is unused:".concat(str));
        }
        return true;
    }

    private static boolean isMainProcess(MultiProcessConfiguration multiProcessConfiguration, Context context, String str) {
        if (multiProcessConfiguration == null) {
            return true;
        }
        String mainProcessName = multiProcessConfiguration.getMainProcessName();
        return !(mainProcessName == null && (mainProcessName = context.getApplicationContext().getPackageName()) == null) && mainProcessName.equals(str);
    }
}
