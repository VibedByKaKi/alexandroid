package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final Charset EUC_JP;
    public static final String GB2312 = "GB2312";
    public static final Charset GB2312_CHARSET;
    private static final Charset PLATFORM_DEFAULT_ENCODING = Charset.defaultCharset();
    public static final String SHIFT_JIS = "SJIS";
    public static final Charset SHIFT_JIS_CHARSET = Charset.forName(SHIFT_JIS);

    static {
        Charset charset;
        try {
            charset = Charset.forName(GB2312);
        } catch (UnsupportedCharsetException unused) {
            charset = null;
        }
        GB2312_CHARSET = charset;
        Charset forName = Charset.forName("EUC_JP");
        EUC_JP = forName;
        Charset charset2 = SHIFT_JIS_CHARSET;
        Charset charset3 = PLATFORM_DEFAULT_ENCODING;
        ASSUME_SHIFT_JIS = charset2.equals(charset3) || forName.equals(charset3);
    }

    private StringUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.charset.Charset guessCharset(byte[] r21, java.util.Map<com.google.zxing.DecodeHintType, ?> r22) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.common.StringUtils.guessCharset(byte[], java.util.Map):java.nio.charset.Charset");
    }

    public static String guessEncoding(byte[] bArr, Map<DecodeHintType, ?> map) {
        Charset guessCharset = guessCharset(bArr, map);
        return guessCharset.equals(SHIFT_JIS_CHARSET) ? SHIFT_JIS : guessCharset.equals(StandardCharsets.UTF_8) ? "UTF8" : guessCharset.equals(StandardCharsets.ISO_8859_1) ? "ISO8859_1" : guessCharset.name();
    }
}
