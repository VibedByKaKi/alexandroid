package org.apache.commons.net.nntp;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class SimpleNNTPHeader {
    private final String from;
    private final String subject;
    private final StringBuilder newsgroups = new StringBuilder();
    private final StringBuilder headerFields = new StringBuilder();
    private int newsgroupCount = 0;

    public SimpleNNTPHeader(String str, String str2) {
        this.from = str;
        this.subject = str2;
    }

    public void addHeaderField(String str, String str2) {
        this.headerFields.append(str);
        this.headerFields.append(": ");
        this.headerFields.append(str2);
        this.headerFields.append('\n');
    }

    public void addNewsgroup(String str) {
        int i = this.newsgroupCount;
        this.newsgroupCount = i + 1;
        if (i > 0) {
            this.newsgroups.append(AbstractJsonLexerKt.COMMA);
        }
        this.newsgroups.append(str);
    }

    public String getFromAddress() {
        return this.from;
    }

    public String getNewsgroups() {
        return this.newsgroups.toString();
    }

    public String getSubject() {
        return this.subject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("From: ");
        sb.append(this.from);
        sb.append("\nNewsgroups: ");
        sb.append(this.newsgroups.toString());
        sb.append("\nSubject: ");
        sb.append(this.subject);
        sb.append('\n');
        if (this.headerFields.length() > 0) {
            sb.append(this.headerFields.toString());
        }
        sb.append('\n');
        return sb.toString();
    }
}
