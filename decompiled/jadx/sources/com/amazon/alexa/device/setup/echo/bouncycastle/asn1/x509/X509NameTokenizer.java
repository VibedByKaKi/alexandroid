package com.amazon.alexa.device.setup.echo.bouncycastle.asn1.x509;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class X509NameTokenizer {
    private final StringBuffer buf;
    private int index;
    private final char seperator;
    private final String value;

    public X509NameTokenizer(String str, char c) {
        this.buf = new StringBuffer();
        this.value = str;
        this.index = -1;
        this.seperator = c;
    }

    public boolean hasMoreTokens() {
        return this.index != this.value.length();
    }

    public String nextToken() {
        if (this.index == this.value.length()) {
            return null;
        }
        int i = this.index + 1;
        this.buf.setLength(0);
        boolean z = false;
        boolean z2 = false;
        while (i != this.value.length()) {
            char charAt = this.value.charAt(i);
            if (charAt == '\"') {
                if (z) {
                    this.buf.append(charAt);
                } else {
                    z2 = !z2;
                }
            } else if (z || z2) {
                if (charAt == '#') {
                    StringBuffer stringBuffer = this.buf;
                    if (stringBuffer.charAt(stringBuffer.length() - 1) == '=') {
                        this.buf.append('\\');
                        this.buf.append(charAt);
                    }
                }
                if (charAt == '+' && this.seperator != '+') {
                    this.buf.append('\\');
                }
                this.buf.append(charAt);
            } else {
                if (charAt == '\\') {
                    z = true;
                } else {
                    if (charAt == this.seperator) {
                        break;
                    }
                    this.buf.append(charAt);
                }
                i++;
            }
            z = false;
            i++;
        }
        this.index = i;
        return this.buf.toString().trim();
    }

    public X509NameTokenizer(String str) {
        this(str, AbstractJsonLexerKt.COMMA);
    }
}
