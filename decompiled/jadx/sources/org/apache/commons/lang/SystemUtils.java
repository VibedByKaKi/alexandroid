package org.apache.commons.lang;

import java.io.File;
import java.io.PrintStream;
import org.apache.commons.lang3.SystemProperties;
import org.apache.commons.net.ftp.FTPClientConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SystemUtils {
    public static final boolean IS_JAVA_1_1;
    public static final boolean IS_JAVA_1_2;
    public static final boolean IS_JAVA_1_3;
    public static final boolean IS_JAVA_1_4;
    public static final boolean IS_JAVA_1_5;
    public static final boolean IS_JAVA_1_6;
    public static final boolean IS_JAVA_1_7;
    public static final boolean IS_OS_AIX;
    public static final boolean IS_OS_HP_UX;
    public static final boolean IS_OS_IRIX;
    public static final boolean IS_OS_LINUX;
    public static final boolean IS_OS_MAC;
    public static final boolean IS_OS_MAC_OSX;
    public static final boolean IS_OS_OS2;
    public static final boolean IS_OS_SOLARIS;
    public static final boolean IS_OS_SUN_OS;
    public static final boolean IS_OS_UNIX;
    public static final boolean IS_OS_WINDOWS;
    public static final boolean IS_OS_WINDOWS_2000;
    public static final boolean IS_OS_WINDOWS_7;
    public static final boolean IS_OS_WINDOWS_95;
    public static final boolean IS_OS_WINDOWS_98;
    public static final boolean IS_OS_WINDOWS_ME;
    public static final boolean IS_OS_WINDOWS_NT;
    public static final boolean IS_OS_WINDOWS_VISTA;
    public static final boolean IS_OS_WINDOWS_XP;
    private static final String JAVA_HOME_KEY = "java.home";
    private static final String JAVA_IO_TMPDIR_KEY = "java.io.tmpdir";
    public static final float JAVA_VERSION_FLOAT;
    public static final int JAVA_VERSION_INT;
    public static final String JAVA_VERSION_TRIMMED;
    private static final int JAVA_VERSION_TRIM_SIZE = 3;
    private static final String OS_NAME_WINDOWS_PREFIX = "Windows";
    public static final String USER_COUNTRY;
    public static final String USER_DIR;
    private static final String USER_DIR_KEY = "user.dir";
    public static final String USER_HOME;
    private static final String USER_HOME_KEY = "user.home";
    public static final String USER_LANGUAGE;
    public static final String USER_NAME;
    public static final String USER_TIMEZONE;
    public static final String AWT_TOOLKIT = getSystemProperty(SystemProperties.AWT_TOOLKIT);
    public static final String FILE_ENCODING = getSystemProperty(SystemProperties.FILE_ENCODING);
    public static final String FILE_SEPARATOR = getSystemProperty(SystemProperties.FILE_SEPARATOR);
    public static final String JAVA_AWT_FONTS = getSystemProperty(SystemProperties.JAVA_AWT_FONTS);
    public static final String JAVA_AWT_GRAPHICSENV = getSystemProperty(SystemProperties.JAVA_AWT_GRAPHICSENV);
    public static final String JAVA_AWT_HEADLESS = getSystemProperty(SystemProperties.JAVA_AWT_HEADLESS);
    public static final String JAVA_AWT_PRINTERJOB = getSystemProperty(SystemProperties.JAVA_AWT_PRINTERJOB);
    public static final String JAVA_CLASS_PATH = getSystemProperty(SystemProperties.JAVA_CLASS_PATH);
    public static final String JAVA_CLASS_VERSION = getSystemProperty(SystemProperties.JAVA_CLASS_VERSION);
    public static final String JAVA_COMPILER = getSystemProperty(SystemProperties.JAVA_COMPILER);
    public static final String JAVA_ENDORSED_DIRS = getSystemProperty(SystemProperties.JAVA_ENDORSED_DIRS);
    public static final String JAVA_EXT_DIRS = getSystemProperty(SystemProperties.JAVA_EXT_DIRS);
    public static final String JAVA_HOME = getSystemProperty("java.home");
    public static final String JAVA_IO_TMPDIR = getSystemProperty("java.io.tmpdir");
    public static final String JAVA_LIBRARY_PATH = getSystemProperty(SystemProperties.JAVA_LIBRARY_PATH);
    public static final String JAVA_RUNTIME_NAME = getSystemProperty(SystemProperties.JAVA_RUNTIME_NAME);
    public static final String JAVA_RUNTIME_VERSION = getSystemProperty(SystemProperties.JAVA_RUNTIME_VERSION);
    public static final String JAVA_SPECIFICATION_NAME = getSystemProperty(SystemProperties.JAVA_SPECIFICATION_NAME);
    public static final String JAVA_SPECIFICATION_VENDOR = getSystemProperty(SystemProperties.JAVA_SPECIFICATION_VENDOR);
    public static final String JAVA_SPECIFICATION_VERSION = getSystemProperty(SystemProperties.JAVA_SPECIFICATION_VERSION);
    public static final String JAVA_UTIL_PREFS_PREFERENCES_FACTORY = getSystemProperty(SystemProperties.JAVA_UTIL_PREFS_PREFERENCES_FACTORY);
    public static final String JAVA_VENDOR = getSystemProperty(SystemProperties.JAVA_VENDOR);
    public static final String JAVA_VENDOR_URL = getSystemProperty(SystemProperties.JAVA_VENDOR_URL);
    public static final String JAVA_VERSION = getSystemProperty(SystemProperties.JAVA_VERSION);
    public static final String JAVA_VM_INFO = getSystemProperty(SystemProperties.JAVA_VM_INFO);
    public static final String JAVA_VM_NAME = getSystemProperty(SystemProperties.JAVA_VM_NAME);
    public static final String JAVA_VM_SPECIFICATION_NAME = getSystemProperty(SystemProperties.JAVA_VM_SPECIFICATION_NAME);
    public static final String JAVA_VM_SPECIFICATION_VENDOR = getSystemProperty(SystemProperties.JAVA_VM_SPECIFICATION_VENDOR);
    public static final String JAVA_VM_SPECIFICATION_VERSION = getSystemProperty(SystemProperties.JAVA_VM_SPECIFICATION_VERSION);
    public static final String JAVA_VM_VENDOR = getSystemProperty(SystemProperties.JAVA_VM_VENDOR);
    public static final String JAVA_VM_VERSION = getSystemProperty(SystemProperties.JAVA_VM_VERSION);
    public static final String LINE_SEPARATOR = getSystemProperty(SystemProperties.LINE_SEPARATOR);
    public static final String OS_ARCH = getSystemProperty(SystemProperties.OS_ARCH);
    public static final String OS_NAME = getSystemProperty(SystemProperties.OS_NAME);
    public static final String OS_VERSION = getSystemProperty(SystemProperties.OS_VERSION);
    public static final String PATH_SEPARATOR = getSystemProperty(SystemProperties.PATH_SEPARATOR);

    static {
        String str = SystemProperties.USER_COUNTRY;
        if (getSystemProperty(SystemProperties.USER_COUNTRY) == null) {
            str = SystemProperties.USER_REGION;
        }
        USER_COUNTRY = getSystemProperty(str);
        USER_DIR = getSystemProperty("user.dir");
        USER_HOME = getSystemProperty("user.home");
        USER_LANGUAGE = getSystemProperty(SystemProperties.USER_LANGUAGE);
        USER_NAME = getSystemProperty("user.name");
        USER_TIMEZONE = getSystemProperty(SystemProperties.USER_TIMEZONE);
        JAVA_VERSION_TRIMMED = getJavaVersionTrimmed();
        JAVA_VERSION_FLOAT = getJavaVersionAsFloat();
        JAVA_VERSION_INT = getJavaVersionAsInt();
        IS_JAVA_1_1 = getJavaVersionMatches("1.1");
        IS_JAVA_1_2 = getJavaVersionMatches("1.2");
        IS_JAVA_1_3 = getJavaVersionMatches("1.3");
        IS_JAVA_1_4 = getJavaVersionMatches("1.4");
        IS_JAVA_1_5 = getJavaVersionMatches("1.5");
        IS_JAVA_1_6 = getJavaVersionMatches("1.6");
        IS_JAVA_1_7 = getJavaVersionMatches("1.7");
        boolean oSMatchesName = getOSMatchesName("AIX");
        IS_OS_AIX = oSMatchesName;
        boolean oSMatchesName2 = getOSMatchesName("HP-UX");
        IS_OS_HP_UX = oSMatchesName2;
        boolean oSMatchesName3 = getOSMatchesName("Irix");
        IS_OS_IRIX = oSMatchesName3;
        boolean z = true;
        boolean z2 = getOSMatchesName("Linux") || getOSMatchesName("LINUX");
        IS_OS_LINUX = z2;
        IS_OS_MAC = getOSMatchesName("Mac");
        boolean oSMatchesName4 = getOSMatchesName("Mac OS X");
        IS_OS_MAC_OSX = oSMatchesName4;
        IS_OS_OS2 = getOSMatchesName(FTPClientConfig.SYST_OS2);
        boolean oSMatchesName5 = getOSMatchesName("Solaris");
        IS_OS_SOLARIS = oSMatchesName5;
        boolean oSMatchesName6 = getOSMatchesName("SunOS");
        IS_OS_SUN_OS = oSMatchesName6;
        if (!oSMatchesName && !oSMatchesName2 && !oSMatchesName3 && !z2 && !oSMatchesName4 && !oSMatchesName5 && !oSMatchesName6) {
            z = false;
        }
        IS_OS_UNIX = z;
        IS_OS_WINDOWS = getOSMatchesName(OS_NAME_WINDOWS_PREFIX);
        IS_OS_WINDOWS_2000 = getOSMatches(OS_NAME_WINDOWS_PREFIX, "5.0");
        IS_OS_WINDOWS_95 = getOSMatches("Windows 9", "4.0");
        IS_OS_WINDOWS_98 = getOSMatches("Windows 9", "4.1");
        IS_OS_WINDOWS_ME = getOSMatches(OS_NAME_WINDOWS_PREFIX, "4.9");
        IS_OS_WINDOWS_NT = getOSMatchesName("Windows NT");
        IS_OS_WINDOWS_XP = getOSMatches(OS_NAME_WINDOWS_PREFIX, "5.1");
        IS_OS_WINDOWS_VISTA = getOSMatches(OS_NAME_WINDOWS_PREFIX, "6.0");
        IS_OS_WINDOWS_7 = getOSMatches(OS_NAME_WINDOWS_PREFIX, "6.1");
    }

    public static File getJavaHome() {
        return new File(System.getProperty("java.home"));
    }

    public static File getJavaIoTmpDir() {
        return new File(System.getProperty("java.io.tmpdir"));
    }

    public static float getJavaVersion() {
        return JAVA_VERSION_FLOAT;
    }

    private static float getJavaVersionAsFloat() {
        return toVersionFloat(toJavaVersionIntArray(JAVA_VERSION, 3));
    }

    private static int getJavaVersionAsInt() {
        return toVersionInt(toJavaVersionIntArray(JAVA_VERSION, 3));
    }

    private static boolean getJavaVersionMatches(String str) {
        return isJavaVersionMatch(JAVA_VERSION_TRIMMED, str);
    }

    private static String getJavaVersionTrimmed() {
        if (JAVA_VERSION == null) {
            return null;
        }
        int i = 0;
        while (true) {
            String str = JAVA_VERSION;
            if (i >= str.length()) {
                return null;
            }
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                return str.substring(i);
            }
            i++;
        }
    }

    private static boolean getOSMatches(String str, String str2) {
        return isOSMatch(OS_NAME, OS_VERSION, str, str2);
    }

    private static boolean getOSMatchesName(String str) {
        return isOSNameMatch(OS_NAME, str);
    }

    private static String getSystemProperty(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer("Caught a SecurityException reading the system property '");
            stringBuffer.append(str);
            stringBuffer.append("'; the SystemUtils property value will default to null.");
            printStream.println(stringBuffer.toString());
            return null;
        }
    }

    public static File getUserDir() {
        return new File(System.getProperty("user.dir"));
    }

    public static File getUserHome() {
        return new File(System.getProperty("user.home"));
    }

    public static boolean isJavaAwtHeadless() {
        String str = JAVA_AWT_HEADLESS;
        if (str != null) {
            return str.equals(Boolean.TRUE.toString());
        }
        return false;
    }

    public static boolean isJavaVersionAtLeast(float f) {
        return JAVA_VERSION_FLOAT >= f;
    }

    public static boolean isJavaVersionMatch(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    public static boolean isOSMatch(String str, String str2, String str3, String str4) {
        return str != null && str2 != null && str.startsWith(str3) && str2.startsWith(str4);
    }

    public static boolean isOSNameMatch(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }

    public static float toJavaVersionFloat(String str) {
        return toVersionFloat(toJavaVersionIntArray(str, 3));
    }

    public static int toJavaVersionInt(String str) {
        return toVersionInt(toJavaVersionIntArray(str, 3));
    }

    private static int[] toJavaVersionIntArray(String str, int i) {
        if (str == null) {
            return ArrayUtils.EMPTY_INT_ARRAY;
        }
        String[] split = StringUtils.split(str, "._- ");
        int min = Math.min(i, split.length);
        int[] iArr = new int[min];
        int i2 = 0;
        for (int i3 = 0; i3 < split.length && i2 < i; i3++) {
            String str2 = split[i3];
            if (str2.length() > 0) {
                try {
                    iArr[i2] = Integer.parseInt(str2);
                    i2++;
                } catch (Exception unused) {
                }
            }
        }
        if (min <= i2) {
            return iArr;
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        return iArr2;
    }

    private static float toVersionFloat(int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                return iArr[0];
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(iArr[0]);
            stringBuffer.append('.');
            for (int i = 1; i < iArr.length; i++) {
                stringBuffer.append(iArr[i]);
            }
            try {
                return Float.parseFloat(stringBuffer.toString());
            } catch (Exception unused) {
            }
        }
        return 0.0f;
    }

    private static int toVersionInt(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length >= 1 ? iArr[0] * 100 : 0;
        if (length >= 2) {
            i += iArr[1] * 10;
        }
        return length >= 3 ? i + iArr[2] : i;
    }

    public static boolean isJavaVersionAtLeast(int i) {
        return JAVA_VERSION_INT >= i;
    }

    public static int[] toJavaVersionIntArray(String str) {
        return toJavaVersionIntArray(str, Integer.MAX_VALUE);
    }
}
