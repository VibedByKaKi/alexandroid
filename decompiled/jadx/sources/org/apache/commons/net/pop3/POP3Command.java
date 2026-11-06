package org.apache.commons.net.pop3;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class POP3Command {
    public static final int APOP = 9;
    public static final int AUTH = 13;
    public static final int CAPA = 12;
    public static final int DELE = 6;
    public static final int LIST = 4;
    private static final int NEXT = 14;
    public static final int NOOP = 7;
    public static final int PASS = 1;
    public static final int QUIT = 2;
    public static final int RETR = 5;
    public static final int RSET = 8;
    public static final int STAT = 3;
    public static final int TOP = 10;
    public static final int UIDL = 11;
    public static final int USER = 0;
    static final String[] commands;

    static {
        String[] strArr = {"USER", "PASS", "QUIT", "STAT", "LIST", "RETR", "DELE", "NOOP", "RSET", "APOP", "TOP", "UIDL", "CAPA", "AUTH"};
        commands = strArr;
        if (strArr.length == 14) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m("Error in array definition");
    }

    private POP3Command() {
    }

    public static String getCommand(int i) {
        return commands[i];
    }
}
