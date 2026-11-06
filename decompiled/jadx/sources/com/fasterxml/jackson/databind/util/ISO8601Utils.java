package com.fasterxml.jackson.databind.util;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.sdk.iotsoftap.Constants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang3.time.TimeZones;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.json.XML$$ExternalSyntheticBUOutline0;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes7.dex */
public class ISO8601Utils {
    protected static final int DEF_8601_LEN = 29;
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone(Constants.UTC);

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date, boolean z, TimeZone timeZone, Locale locale) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(30);
        sb.append(String.format("%04d-%02d-%02dT%02d:%02d:%02d", Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13))));
        if (z) {
            sb.append(String.format(".%03d", Integer.valueOf(gregorianCalendar.get(14))));
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            sb.append(String.format("%c%02d:%02d", Character.valueOf(offset < 0 ? '-' : SignatureVisitor.EXTENDS), Integer.valueOf(Math.abs(i / 60)), Integer.valueOf(Math.abs(i % 60))));
        } else {
            sb.append(Matrix.MATRIX_TYPE_ZERO);
        }
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int length;
        TimeZone timeZone;
        char charAt;
        Objects.requireNonNull(str);
        try {
            int index = parsePosition.getIndex();
            int i6 = index + 4;
            int parseInt = parseInt(str, index, i6);
            if (checkOffset(str, i6, '-')) {
                i6 = index + 5;
            }
            int i7 = i6 + 2;
            int parseInt2 = parseInt(str, i6, i7);
            if (checkOffset(str, i7, '-')) {
                i7 = i6 + 3;
            }
            int i8 = i7 + 2;
            int parseInt3 = parseInt(str, i7, i8);
            boolean checkOffset = checkOffset(str, i8, 'T');
            if (!checkOffset && str.length() <= i8) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(parseInt, parseInt2 - 1, parseInt3);
                parsePosition.setIndex(i8);
                return gregorianCalendar.getTime();
            }
            if (checkOffset) {
                int i9 = i7 + 5;
                int parseInt4 = parseInt(str, i7 + 3, i9);
                if (checkOffset(str, i9, AbstractJsonLexerKt.COLON)) {
                    i9 = i7 + 6;
                }
                int i10 = i9 + 2;
                int parseInt5 = parseInt(str, i9, i10);
                if (checkOffset(str, i10, AbstractJsonLexerKt.COLON)) {
                    i10 = i9 + 3;
                }
                if (str.length() <= i10 || (charAt = str.charAt(i10)) == 'Z' || charAt == '+' || charAt == '-') {
                    i8 = i10;
                    i2 = parseInt4;
                    i3 = parseInt5;
                    i4 = 0;
                    i5 = 0;
                } else {
                    int i11 = i10 + 2;
                    i5 = parseInt(str, i10, i11);
                    if (i5 > 59 && i5 < 63) {
                        i5 = 59;
                    }
                    if (checkOffset(str, i11, '.')) {
                        int i12 = i10 + 3;
                        int indexOfNonDigit = indexOfNonDigit(str, i10 + 4);
                        int min = Math.min(indexOfNonDigit, i10 + 6);
                        int parseInt6 = parseInt(str, i12, min);
                        int i13 = min - i12;
                        if (i13 == 1) {
                            parseInt6 *= 100;
                        } else if (i13 == 2) {
                            parseInt6 *= 10;
                        }
                        i2 = parseInt4;
                        i8 = indexOfNonDigit;
                        i3 = parseInt5;
                        i4 = parseInt6;
                    } else {
                        i2 = parseInt4;
                        i8 = i11;
                        i3 = parseInt5;
                        i4 = 0;
                    }
                }
                i = 1;
            } else {
                i = 1;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            if (str.length() <= i8) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char charAt2 = str.charAt(i8);
            if (charAt2 == 'Z') {
                timeZone = TIMEZONE_Z;
                length = i8 + 1;
            } else {
                if (charAt2 != '+' && charAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
                }
                String substring = str.substring(i8);
                length = i8 + substring.length();
                if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                    String concat = TimeZones.GMT_ID.concat(substring);
                    TimeZone timeZone2 = TimeZone.getTimeZone(concat);
                    String id = timeZone2.getID();
                    if (!id.equals(concat) && !id.replace(":", "").equals(concat)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + concat + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
                timeZone = TIMEZONE_Z;
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            int i14 = i;
            gregorianCalendar2.set(i14, parseInt);
            gregorianCalendar2.set(2, parseInt2 - i14);
            gregorianCalendar2.set(5, parseInt3);
            gregorianCalendar2.set(11, i2);
            gregorianCalendar2.set(12, i3);
            gregorianCalendar2.set(13, i5);
            gregorianCalendar2.set(14, i4);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (Exception e) {
            String m = AppLaunchChecker$$ExternalSyntheticOutline0.m('\"', DeviceConfigConstants.DOUBLE_QUOTE, str);
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = MarkdownConstants.LEFT_PARENTHESIS + e.getClass().getName() + MarkdownConstants.RIGHT_PARENTHESIS;
            }
            ParseException parseException = new ParseException(a$$ExternalSyntheticOutline0.m("Failed to parse date ", m, ": ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            XML$$ExternalSyntheticBUOutline0.m$2(str);
            return 0;
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                XML$$ExternalSyntheticBUOutline0.m$2("Invalid number: ".concat(str.substring(i, i2)));
                return 0;
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                XML$$ExternalSyntheticBUOutline0.m$2("Invalid number: ".concat(str.substring(i, i2)));
                return 0;
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_Z);
    }

    @Deprecated
    public static String format(Date date, boolean z, TimeZone timeZone) {
        return format(date, z, timeZone, Locale.US);
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_Z);
    }
}
