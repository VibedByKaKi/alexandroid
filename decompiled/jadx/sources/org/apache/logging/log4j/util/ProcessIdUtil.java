package org.apache.logging.log4j.util;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ProcessIdUtil {
    public static final String DEFAULT_PROCESSID = "-";

    public static String getProcessId() {
        try {
            try {
                return ((String) Class.forName("java.lang.management.RuntimeMXBean").getDeclaredMethod("getName", null).invoke(Class.forName("java.lang.management.ManagementFactory").getDeclaredMethod("getRuntimeMXBean", null).invoke(null, null), null)).split("@", 2)[0];
            } catch (Exception unused) {
                return new File("/proc/self").getCanonicalFile().getName();
            }
        } catch (IOException unused2) {
            return "-";
        }
    }
}
