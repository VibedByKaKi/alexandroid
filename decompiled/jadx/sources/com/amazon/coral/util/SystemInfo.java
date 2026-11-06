package com.amazon.coral.util;

import java.util.regex.Pattern;
import org.apache.commons.lang3.SystemProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SystemInfo {
    private static final Pattern CORES_PER_SOCKET_PATTERN = Pattern.compile("Core\\(s\\) per socket:\\s*(\\d+)");
    private static final Pattern SOCKETS_PATTERN = Pattern.compile("Socket\\(s\\):\\s*(\\d+)");
    private static final Pattern NUMBER_OF_CORES_PATTERN = Pattern.compile("NumberOfCores=(\\d+)");

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Architecture {
        X86,
        AMD64,
        AARCH64,
        UNKNOWN
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum OS {
        MAC,
        WINDOWS,
        LINUX,
        UNKNOWN
    }

    private SystemInfo() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r0.equals(com.facebook.soloader.MinElf.ISA.X86_64) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.coral.util.SystemInfo.Architecture getArch() {
        /*
            java.lang.String r0 = "os.arch"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L45
            int r1 = r0.hashCode()     // Catch: java.lang.Throwable -> L45
            switch(r1) {
                case -1221096139: goto L37;
                case -806050265: goto L2b;
                case -284840886: goto L23;
                case 117110: goto L17;
                case 92926582: goto Le;
                default: goto Ld;
            }     // Catch: java.lang.Throwable -> L45
        Ld:
            goto L42
        Le:
            java.lang.String r1 = "amd64"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L42
            goto L34
        L17:
            java.lang.String r1 = "x86"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L42
            com.amazon.coral.util.SystemInfo$Architecture r0 = com.amazon.coral.util.SystemInfo.Architecture.X86     // Catch: java.lang.Throwable -> L45
            return r0
        L23:
            java.lang.String r1 = "unknown"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L45
            goto L42
        L2b:
            java.lang.String r1 = "x86_64"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L42
        L34:
            com.amazon.coral.util.SystemInfo$Architecture r0 = com.amazon.coral.util.SystemInfo.Architecture.AMD64     // Catch: java.lang.Throwable -> L45
            return r0
        L37:
            java.lang.String r1 = "aarch64"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L42
            com.amazon.coral.util.SystemInfo$Architecture r0 = com.amazon.coral.util.SystemInfo.Architecture.AARCH64     // Catch: java.lang.Throwable -> L45
            return r0
        L42:
            com.amazon.coral.util.SystemInfo$Architecture r0 = com.amazon.coral.util.SystemInfo.Architecture.UNKNOWN     // Catch: java.lang.Throwable -> L45
            return r0
        L45:
            com.amazon.coral.util.SystemInfo$Architecture r0 = com.amazon.coral.util.SystemInfo.Architecture.UNKNOWN
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.coral.util.SystemInfo.getArch():com.amazon.coral.util.SystemInfo$Architecture");
    }

    public static OS getOS() {
        try {
            String property = System.getProperty(SystemProperties.OS_NAME);
            return property.startsWith("Windows") ? OS.WINDOWS : property.equals("Linux") ? OS.LINUX : property.equals("Mac OS X") ? OS.MAC : OS.UNKNOWN;
        } catch (Throwable unused) {
            return OS.UNKNOWN;
        }
    }

    public static Integer getPhysicalCpuCores() {
        try {
            int ordinal = getOS().ordinal();
            if (ordinal == 0) {
                return Integer.valueOf(Integer.parseInt(Command.run("sysctl -n machdep.cpu.core_count".split(" ")).getStandardOut().trim()));
            }
            if (ordinal == 1) {
                java.util.regex.Matcher matcher = NUMBER_OF_CORES_PATTERN.matcher(Command.run("cmd /C WMIC CPU Get /Format:List".split(" ")).getStandardOut());
                matcher.find();
                return Integer.valueOf(Integer.parseInt(matcher.group(1)));
            }
            if (ordinal != 2) {
                return null;
            }
            String standardOut = Command.run("lscpu").getStandardOut();
            java.util.regex.Matcher matcher2 = CORES_PER_SOCKET_PATTERN.matcher(standardOut);
            java.util.regex.Matcher matcher3 = SOCKETS_PATTERN.matcher(standardOut);
            matcher2.find();
            matcher3.find();
            return Integer.valueOf(Integer.parseInt(matcher2.group(1)) * Integer.parseInt(matcher3.group(1)));
        } catch (Throwable unused) {
            return null;
        }
    }
}
