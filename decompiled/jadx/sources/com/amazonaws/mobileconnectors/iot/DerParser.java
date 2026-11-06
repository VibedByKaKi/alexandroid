package com.amazonaws.mobileconnectors.iot;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class DerParser {
    public static final int ANY = 0;
    public static final int APPLICATION = 64;
    public static final int BIT_STRING = 3;
    public static final int BMP_STRING = 30;
    public static final int BOOLEAN = 1;
    public static final int BYTE_MAX = 255;
    public static final int CONSTRUCTED = 32;
    public static final int CONTEXT = 128;
    public static final int ENUMERATED = 10;
    public static final int GENERALIZED_TIME = 24;
    public static final int GENERAL_STRING = 27;
    public static final int GRAPHIC_STRING = 25;
    public static final int IA5_STRING = 22;
    public static final int INTEGER = 2;
    public static final int ISO646_STRING = 26;
    public static final byte LOWER_7_BITS = Byte.MAX_VALUE;
    public static final int MAX_NUMBER_OF_BYTES = 4;
    public static final int NULL = 5;
    public static final int NUMERIC_STRING = 18;
    public static final int OBJECT_IDENTIFIER = 6;
    public static final int OCTET_STRING = 4;
    public static final int PRINTABLE_STRING = 19;
    public static final int PRIVATE = 192;
    public static final int REAL = 9;
    public static final int RELATIVE_OID = 13;
    public static final int SEQUENCE = 16;
    public static final int SET = 17;
    public static final int T61_STRING = 20;
    public static final int UNIVERSAL = 0;
    public static final int UNIVERSAL_STRING = 28;
    public static final int UTC_TIME = 23;
    public static final int UTF8_STRING = 12;
    public static final int VIDEOTEX_STRING = 21;
    private final InputStream in;

    public DerParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    private int getLength() throws IOException {
        int read = this.in.read();
        if (read == -1) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Invalid DER: length missing");
            return 0;
        }
        if ((read & (-128)) == 0) {
            return read;
        }
        int i = read & 127;
        if (read >= 255 || i > 4) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(read, "Invalid DER: length field too big (", MarkdownConstants.RIGHT_PARENTHESIS));
            return 0;
        }
        byte[] bArr = new byte[i];
        if (this.in.read(bArr) >= i) {
            return new BigInteger(1, bArr).intValue();
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Invalid DER: length too short");
        return 0;
    }

    public Asn1Object read() throws IOException {
        int read = this.in.read();
        if (read == -1) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Invalid DER: stream too short, missing tag");
            return null;
        }
        int length = getLength();
        byte[] bArr = new byte[length];
        if (this.in.read(bArr) >= length) {
            return new Asn1Object(read, length, bArr);
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Invalid DER: stream too short, missing value");
        return null;
    }

    public DerParser(InputStream inputStream) {
        this.in = inputStream;
    }
}
