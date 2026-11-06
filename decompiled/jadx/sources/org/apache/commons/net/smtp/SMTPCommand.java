package org.apache.commons.net.smtp;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class SMTPCommand {
    public static final int AUTH = 14;
    public static final int DATA = 3;
    public static final int EHLO = 15;
    public static final int EXPAND = 9;
    public static final int EXPN = 9;
    public static final int HELLO = 0;
    public static final int HELO = 0;
    public static final int HELP = 10;
    public static final int LOGIN = 0;
    public static final int LOGOUT = 13;
    public static final int MAIL = 1;
    public static final int MAIL_FROM = 1;
    private static final int NEXT = 16;
    public static final int NOOP = 11;
    public static final int QUIT = 13;
    public static final int RCPT = 2;
    public static final int RECIPIENT = 2;
    public static final int RESET = 7;
    public static final int RSET = 7;
    public static final int SAML = 6;
    public static final int SEND = 4;
    public static final int SEND_AND_MAIL_FROM = 6;
    public static final int SEND_FROM = 4;
    public static final int SEND_MESSAGE_DATA = 3;
    public static final int SEND_OR_MAIL_FROM = 5;
    public static final int SOML = 5;
    public static final int TURN = 12;
    public static final int VERIFY = 8;
    public static final int VRFY = 8;
    private static final String[] commands;

    static {
        String[] strArr = {"HELO", "MAIL FROM:", "RCPT TO:", "DATA", "SEND FROM:", "SOML FROM:", "SAML FROM:", "RSET", "VRFY", "EXPN", "HELP", "NOOP", "TURN", "QUIT", "AUTH", "EHLO"};
        commands = strArr;
        if (strArr.length == 16) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m("Error in array definition");
    }

    private SMTPCommand() {
    }

    public static String getCommand(int i) {
        return commands[i];
    }
}
