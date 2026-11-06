package com.amazonaws.util;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import org.apache.commons.lang3.SystemProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class VersionInfoUtils {
    private static final int DEFAULT_STRING_LENGTH = 128;
    private static final Log log = LogFactory.getLog((Class<?>) VersionInfoUtils.class);
    private static volatile String platform = "android";
    private static volatile String userAgent = null;
    private static volatile String version = "2.22.6";

    public static String getPlatform() {
        return platform;
    }

    public static String getUserAgent() {
        if (userAgent == null) {
            synchronized (VersionInfoUtils.class) {
                try {
                    if (userAgent == null) {
                        initializeUserAgent();
                    }
                } finally {
                }
            }
        }
        return userAgent;
    }

    public static String getVersion() {
        return version;
    }

    private static void initializeUserAgent() {
        userAgent = userAgent();
    }

    private static String replaceSpaces(String str) {
        return str != null ? str.replace(' ', '_') : str;
    }

    public static String userAgent() {
        StringBuilder m = ParcelCompat$$ExternalSyntheticOutline0.m(128, "aws-sdk-");
        m.append(StringUtils.lowerCase(getPlatform()));
        m.append("/");
        m.append(getVersion());
        m.append(" ");
        m.append(replaceSpaces(System.getProperty(SystemProperties.OS_NAME)));
        m.append("/");
        m.append(replaceSpaces(System.getProperty(SystemProperties.OS_VERSION)));
        m.append(" ");
        m.append(replaceSpaces(System.getProperty(SystemProperties.JAVA_VM_NAME)));
        m.append("/");
        m.append(replaceSpaces(System.getProperty(SystemProperties.JAVA_VM_VERSION)));
        m.append("/");
        m.append(replaceSpaces(System.getProperty(SystemProperties.JAVA_VERSION)));
        String property = System.getProperty(SystemProperties.USER_LANGUAGE);
        String property2 = System.getProperty(SystemProperties.USER_REGION);
        if (property != null && property2 != null) {
            m.append(" ");
            m.append(replaceSpaces(property));
            m.append("_");
            m.append(replaceSpaces(property2));
        }
        return m.toString();
    }
}
