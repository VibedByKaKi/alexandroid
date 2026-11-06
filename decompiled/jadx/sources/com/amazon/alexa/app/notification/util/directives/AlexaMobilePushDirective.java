package com.amazon.alexa.app.notification.util.directives;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class AlexaMobilePushDirective {
    private final String command;
    private final String payload;
    private final long timeStamp;

    public AlexaMobilePushDirective(String str, String str2, long j) {
        this.command = str;
        this.payload = str2;
        this.timeStamp = j;
    }

    public String getCommand() {
        return this.command;
    }

    public String getPayload() {
        return this.payload;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public String toString() {
        return "AlexaMobilePushDirective(command=" + getCommand() + ", payload=" + getPayload() + ", timeStamp=" + getTimeStamp() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
