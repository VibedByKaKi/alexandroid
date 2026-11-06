package org.apache.commons.net.telnet;

import com.amazon.whispercloak.KeyUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TelnetCommand {
    public static final int ABORT = 238;
    public static final int AO = 245;
    public static final int AYT = 246;
    public static final int BREAK = 243;
    public static final int DM = 242;
    public static final int DO = 253;
    public static final int DONT = 254;
    public static final int EC = 247;
    public static final int EL = 248;
    public static final int EOF = 236;
    public static final int EOR = 239;
    private static final int FIRST_COMMAND = 255;
    public static final int GA = 249;
    public static final int IAC = 255;
    public static final int IP = 244;
    private static final int LAST_COMMAND = 236;
    public static final int MAX_COMMAND_VALUE = 255;
    public static final int NOP = 241;
    public static final int SB = 250;
    public static final int SE = 240;
    public static final int SUSP = 237;
    public static final int SYNCH = 242;
    public static final int WILL = 251;
    public static final int WONT = 252;
    private static final String[] commandString = {"IAC", "DONT", "DO", "WONT", "WILL", "SB", "GA", "EL", KeyUtils.ALGORITHM_EC, "AYT", "AO", "IP", "BRK", "DMARK", "NOP", "SE", "EOR", "ABORT", "SUSP", "EOF"};

    private TelnetCommand() {
    }

    public static String getCommand(int i) {
        return commandString[255 - i];
    }

    public static boolean isValidCommand(int i) {
        return i <= 255 && i >= 236;
    }
}
