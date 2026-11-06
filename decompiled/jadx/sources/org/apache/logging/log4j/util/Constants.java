package org.apache.logging.log4j.util;

import org.apache.commons.lang3.SystemProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class Constants {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Object[] EMPTY_OBJECT_ARRAY;
    public static final boolean ENABLE_THREADLOCALS;
    public static final boolean IS_WEB_APP;
    public static final int JAVA_MAJOR_VERSION;
    public static final String LOG4J2_DEBUG = "log4j2.debug";
    public static final int MAX_REUSABLE_MESSAGE_SIZE;

    static {
        boolean booleanProperty = PropertiesUtil.getProperties().getBooleanProperty("log4j2.is.webapp", isClassAvailable("javax.servlet.Servlet") || isClassAvailable("jakarta.servlet.Servlet"));
        IS_WEB_APP = booleanProperty;
        ENABLE_THREADLOCALS = PropertiesUtil.getProperties().getBooleanProperty("log4j2.enable.threadlocals", !booleanProperty);
        JAVA_MAJOR_VERSION = getMajorVersion();
        MAX_REUSABLE_MESSAGE_SIZE = size("log4j.maxReusableMsgSize", 518);
        EMPTY_OBJECT_ARRAY = new Object[0];
        EMPTY_BYTE_ARRAY = new byte[0];
    }

    private Constants() {
    }

    public static int getMajorVersion(String str) {
        String[] split = str.split("-|\\.", 3);
        try {
            int parseInt = Integer.parseInt(split[0]);
            return parseInt != 1 ? parseInt : Integer.parseInt(split[1]);
        } catch (Exception unused) {
            return 0;
        }
    }

    private static boolean isClassAvailable(String str) {
        return LoaderUtil.loadClass(str) != null;
    }

    private static int size(String str, int i) {
        return PropertiesUtil.getProperties().getIntegerProperty(str, i);
    }

    private static int getMajorVersion() {
        return getMajorVersion(System.getProperty(SystemProperties.JAVA_VERSION));
    }
}
