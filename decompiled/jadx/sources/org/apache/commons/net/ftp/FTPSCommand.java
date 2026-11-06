package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public final class FTPSCommand {
    public static final int ADAT = 1;
    public static final int AUTH = 0;
    public static final int AUTHENTICATION_SECURITY_DATA = 1;
    public static final int AUTHENTICATION_SECURITY_MECHANISM = 0;
    public static final int CCC = 4;
    public static final int CLEAR_COMMAND_CHANNEL = 4;
    public static final int DATA_CHANNEL_PROTECTION_LEVEL = 3;
    public static final int PBSZ = 2;
    public static final int PROT = 3;
    public static final int PROTECTION_BUFFER_SIZE = 2;
    private static final String[] commands = {"AUTH", "ADAT", "PBSZ", "PROT", "CCC"};

    public static String getCommand(int i) {
        return commands[i];
    }
}
