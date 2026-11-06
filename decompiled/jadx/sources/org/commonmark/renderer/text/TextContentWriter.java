package org.commonmark.renderer.text;

import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TextContentWriter {
    private final Appendable buffer;
    private char lastChar;

    public TextContentWriter(Appendable appendable) {
        this.buffer = appendable;
    }

    private void append(String str) {
        try {
            this.buffer.append(str);
            int length = str.length();
            if (length != 0) {
                this.lastChar = str.charAt(length - 1);
            }
        } catch (IOException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    public void colon() {
        char c = this.lastChar;
        if (c == 0 || c == ':') {
            return;
        }
        append(AbstractJsonLexerKt.COLON);
    }

    public void line() {
        char c = this.lastChar;
        if (c == 0 || c == '\n') {
            return;
        }
        append('\n');
    }

    public void whitespace() {
        char c = this.lastChar;
        if (c == 0 || c == ' ') {
            return;
        }
        append(' ');
    }

    public void write(String str) {
        append(str);
    }

    public void writeStripped(String str) {
        append(str.replaceAll("[\\r\\n\\s]+", " "));
    }

    public void write(char c) {
        append(c);
    }

    private void append(char c) {
        try {
            this.buffer.append(c);
            this.lastChar = c;
        } catch (IOException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }
}
