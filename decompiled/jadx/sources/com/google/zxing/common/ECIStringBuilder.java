package com.google.zxing.common;

import com.google.zxing.FormatException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ECIStringBuilder {
    private StringBuilder currentBytes;
    private Charset currentCharset;
    private StringBuilder result;

    public ECIStringBuilder() {
        this.currentCharset = StandardCharsets.ISO_8859_1;
        this.currentBytes = new StringBuilder();
    }

    private void encodeCurrentBytesIfAny() {
        Charset charset = this.currentCharset;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        boolean equals = charset.equals(charset2);
        StringBuilder sb = this.currentBytes;
        if (equals) {
            if (sb.length() > 0) {
                StringBuilder sb2 = this.result;
                StringBuilder sb3 = this.currentBytes;
                if (sb2 == null) {
                    this.result = sb3;
                    this.currentBytes = new StringBuilder();
                    return;
                } else {
                    sb2.append((CharSequence) sb3);
                    this.currentBytes = new StringBuilder();
                    return;
                }
            }
            return;
        }
        if (sb.length() > 0) {
            byte[] bytes = this.currentBytes.toString().getBytes(charset2);
            this.currentBytes = new StringBuilder();
            StringBuilder sb4 = this.result;
            Charset charset3 = this.currentCharset;
            if (sb4 == null) {
                this.result = new StringBuilder(new String(bytes, charset3));
            } else {
                sb4.append(new String(bytes, charset3));
            }
        }
    }

    public void append(char c) {
        this.currentBytes.append((char) (c & 255));
    }

    public void appendCharacters(StringBuilder sb) {
        encodeCurrentBytesIfAny();
        this.result.append((CharSequence) sb);
    }

    public void appendECI(int i) throws FormatException {
        encodeCurrentBytesIfAny();
        CharacterSetECI characterSetECIByValue = CharacterSetECI.getCharacterSetECIByValue(i);
        if (characterSetECIByValue == null) {
            throw FormatException.getFormatInstance();
        }
        this.currentCharset = characterSetECIByValue.getCharset();
    }

    public boolean isEmpty() {
        if (this.currentBytes.length() != 0) {
            return false;
        }
        StringBuilder sb = this.result;
        return sb == null || sb.length() == 0;
    }

    public int length() {
        return toString().length();
    }

    public String toString() {
        encodeCurrentBytesIfAny();
        StringBuilder sb = this.result;
        return sb == null ? "" : sb.toString();
    }

    public void append(byte b) {
        this.currentBytes.append((char) (b & 255));
    }

    public void append(String str) {
        this.currentBytes.append(str);
    }

    public void append(int i) {
        append(String.valueOf(i));
    }

    public ECIStringBuilder(int i) {
        this.currentCharset = StandardCharsets.ISO_8859_1;
        this.currentBytes = new StringBuilder(i);
    }
}
