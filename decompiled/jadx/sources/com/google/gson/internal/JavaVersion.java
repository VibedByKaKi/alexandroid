package com.google.gson.internal;

import org.apache.commons.lang3.SystemProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class JavaVersion {
    private static final int majorJavaVersion = determineMajorJavaVersion();

    private JavaVersion() {
    }

    private static int determineMajorJavaVersion() {
        return parseMajorJavaVersion(System.getProperty(SystemProperties.JAVA_VERSION));
    }

    private static int extractBeginningInt(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int getMajorJavaVersion() {
        return majorJavaVersion;
    }

    public static boolean isJava9OrLater() {
        return majorJavaVersion >= 9;
    }

    private static int parseDotted(String str) {
        try {
            String[] split = str.split("[._]", 3);
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int parseMajorJavaVersion(String str) {
        int parseDotted = parseDotted(str);
        if (parseDotted == -1) {
            parseDotted = extractBeginningInt(str);
        }
        if (parseDotted == -1) {
            return 6;
        }
        return parseDotted;
    }
}
