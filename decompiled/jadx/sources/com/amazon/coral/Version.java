package com.amazon.coral;

import org.apache.commons.lang3.SystemProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class Version {
    private static final Version instance = new Version();
    private final String arch = System.getProperty(SystemProperties.OS_ARCH, "unknown").toLowerCase();
    private final String platform = System.getProperty(SystemProperties.OS_NAME, "unknown").toLowerCase();
    private final String runtime;

    private Version() {
        String str;
        int indexOf;
        int i;
        int indexOf2;
        String property = System.getProperty(SystemProperties.JAVA_RUNTIME_VERSION);
        if (property == null || (indexOf = property.indexOf(".")) <= 0 || (i = indexOf + 1) >= property.length() || (indexOf2 = property.indexOf(".", i)) <= 0 || indexOf2 + 1 >= property.length()) {
            str = null;
        } else {
            str = "jdk" + property.substring(0, indexOf2).replace(".", "");
        }
        if (str == null) {
            throw new Error("Can't determine JRE version");
        }
        this.runtime = str;
    }

    public static Version newVersion() {
        return instance;
    }

    public String getArch() {
        return this.arch;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getRuntime() {
        return this.runtime;
    }

    public String toString() {
        return getPlatform() + "-" + getRuntime() + "-" + getArch();
    }
}
