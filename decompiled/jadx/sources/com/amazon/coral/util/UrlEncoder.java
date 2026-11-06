package com.amazon.coral.util;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class UrlEncoder {
    private static final Charset CHARSET = Charset.forName("UTF-8");
    private static final Pattern ENCODE_REPLACE_PATTERN = Pattern.compile("[+*]|%7E");
    private static final String ENCODING = "UTF-8";

    public UrlEncoder(char[] cArr) {
    }

    private static byte parseHexChar(CharSequence charSequence, int i) {
        int parseHexDigit = parseHexDigit(charSequence.charAt(i));
        int parseHexDigit2 = parseHexDigit(charSequence.charAt(i + 1));
        if (parseHexDigit != -1 && parseHexDigit2 != -1) {
            return (byte) ((parseHexDigit * 16) + parseHexDigit2);
        }
        throw new UrlEncoderException("Illegal hex character in escape % pattern: %" + ((Object) charSequence.subSequence(i, i + 2)));
    }

    private static int parseHexDigit(char c) {
        if (c < '0') {
            return -1;
        }
        if (c <= '9') {
            return c - '0';
        }
        if (c < 'A') {
            return -1;
        }
        if (c <= 'F') {
            return c - '7';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        return -1;
    }

    public String decode(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        byte[] bArr = null;
        int i = 0;
        boolean z = false;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt == '%') {
                if (bArr == null) {
                    bArr = new byte[8];
                }
                int i2 = 0;
                while (i + 2 < length && charAt == '%') {
                    if (i2 >= bArr.length) {
                        bArr = Arrays.copyOf(bArr, ((length - i) / 3) + bArr.length);
                    }
                    bArr[i2] = parseHexChar(charSequence, i + 1);
                    i2++;
                    i += 3;
                    if (i < length) {
                        charAt = charSequence.charAt(i);
                    }
                }
                if (charAt == '%' && i < length) {
                    throw new UrlEncoderException("Incomplete trailing escape % sequence");
                }
                sb.append(new String(bArr, 0, i2, CHARSET));
            } else if (charAt != '+') {
                sb.append(charAt);
                i++;
            } else {
                sb.append(' ');
                i++;
            }
            z = true;
        }
        return z ? sb.toString() : charSequence.toString();
    }

    public String encode(CharSequence charSequence) {
        String str;
        String charSequence2 = charSequence.toString();
        try {
            String encode = URLEncoder.encode(charSequence2, "UTF-8");
            java.util.regex.Matcher matcher = ENCODE_REPLACE_PATTERN.matcher(encode);
            if (!matcher.find()) {
                return encode;
            }
            StringBuffer stringBuffer = new StringBuffer(encode.length());
            do {
                char charAt = encode.charAt(matcher.start());
                if (charAt == '%') {
                    str = "~";
                } else if (charAt == '*') {
                    str = "%2A";
                } else {
                    if (charAt != '+') {
                        throw new RuntimeException("Got match that should not be possible. Check that the pattern mathes the code");
                    }
                    str = "%20";
                }
                matcher.appendReplacement(stringBuffer, str);
            } while (matcher.find());
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        } catch (Throwable th) {
            throw new UrlEncoderException(ParcelCompat$$ExternalSyntheticOutline0.m(th, a$$ExternalSyntheticOutline0.m2m("Unable to encode URL '", charSequence2, "':")), th);
        }
    }

    public boolean requiresDecoding(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (charAt == '%' || charAt == '+') {
                return true;
            }
        }
        return false;
    }

    public UrlEncoder() {
    }
}
