package org.apache.commons.net.nntp;

import com.amazon.alexa.assistant.capability.speechrecognizer.voicechat.selfbargein.SelfBargeInMetrics;
import org.apache.http.client.methods.HttpHead;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class NNTPCommand {
    public static final int ARTICLE = 0;
    public static final int AUTHINFO = 15;
    public static final int BODY = 1;
    public static final int GROUP = 2;
    public static final int HEAD = 3;
    public static final int HELP = 4;
    public static final int IHAVE = 5;
    public static final int LAST = 6;
    public static final int LIST = 7;
    public static final int NEWGROUPS = 8;
    public static final int NEWNEWS = 9;
    public static final int NEXT = 10;
    public static final int POST = 11;
    public static final int QUIT = 12;
    public static final int SLAVE = 13;
    public static final int STAT = 14;
    public static final int XHDR = 17;
    public static final int XOVER = 16;
    private static final String[] commands = {"ARTICLE", "BODY", "GROUP", HttpHead.METHOD_NAME, "HELP", "IHAVE", SelfBargeInMetrics.EMIT_REASON_LAST, "LIST", "NEWGROUPS", "NEWNEWS", "NEXT", "POST", "QUIT", "SLAVE", "STAT", "AUTHINFO", "XOVER", "XHDR"};

    private NNTPCommand() {
    }

    public static String getCommand(int i) {
        return commands[i];
    }
}
