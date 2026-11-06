package com.amazon.coral.util;

import com.amazon.dee.sdk.iotsoftap.Constants;
import com.google.common.math.Stats$$ExternalSyntheticLambda0;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ISO8601 {
    private static final int DIGITS_TO_PARSE = 9;
    public static final DateTimeFormatter X_AMZ_DATE = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4).appendValue(ChronoField.MONTH_OF_YEAR, 2).appendValue(ChronoField.DAY_OF_MONTH, 2).appendLiteral('T').appendValue(ChronoField.HOUR_OF_DAY, 2).appendValue(ChronoField.MINUTE_OF_HOUR, 2).appendValue(ChronoField.SECOND_OF_MINUTE, 2).appendOffsetId().toFormatter().withZone(ZoneOffset.UTC);
    private static final TimeZone TIMEZONE = TimeZone.getTimeZone(Constants.UTC);
    private static final ThreadLocal<Calendar> threadLocalCalendar = ThreadLocal.withInitial(new Stats$$ExternalSyntheticLambda0(13));

    private ISO8601() {
    }

    private static CharSequence formatDate(Date date, boolean z) {
        if (date == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Calendar threadLocalCalendar2 = getThreadLocalCalendar();
        threadLocalCalendar2.set(15, 0);
        threadLocalCalendar2.setTimeInMillis(date.getTime());
        int i = threadLocalCalendar2.get(1);
        int i2 = threadLocalCalendar2.get(2) + 1;
        int i3 = threadLocalCalendar2.get(5);
        int i4 = threadLocalCalendar2.get(11);
        int i5 = threadLocalCalendar2.get(12);
        int i6 = threadLocalCalendar2.get(13);
        int i7 = threadLocalCalendar2.get(14);
        try {
            if (i < 0) {
                throw new IllegalArgumentException("No support for negative years: " + date);
            }
            if (i < 1000) {
                sb.append('0');
            }
            if (i < 100) {
                sb.append('0');
            }
            if (i < 10) {
                sb.append('0');
            }
            sb.append(i);
            if (!z) {
                sb.append('-');
            }
            if (i2 < 10) {
                sb.append('0');
            }
            sb.append(i2);
            if (!z) {
                sb.append('-');
            }
            if (i3 < 10) {
                sb.append('0');
            }
            sb.append(i3);
            sb.append('T');
            if (i4 < 10) {
                sb.append('0');
            }
            sb.append(i4);
            if (!z) {
                sb.append(AbstractJsonLexerKt.COLON);
            }
            if (i5 < 10) {
                sb.append('0');
            }
            sb.append(i5);
            if (!z) {
                sb.append(AbstractJsonLexerKt.COLON);
            }
            if (i6 < 10) {
                sb.append('0');
            }
            sb.append(i6);
            if (i7 != 0 && !z) {
                sb.append(String.format(".%03d", Integer.valueOf(i7)));
            }
            sb.append(Matrix.MATRIX_TYPE_ZERO);
            return sb;
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    @Deprecated
    public static Date getDate(CharSequence charSequence) {
        try {
            return toDate(charSequence);
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Deprecated
    public static CharSequence getDateBasic(Date date) {
        return formatDate(date, true);
    }

    private static Calendar getThreadLocalCalendar() {
        Calendar calendar = threadLocalCalendar.get();
        calendar.clear();
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Calendar lambda$static$0() {
        return Calendar.getInstance(TIMEZONE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Date toDate(java.lang.CharSequence r20) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.coral.util.ISO8601.toDate(java.lang.CharSequence):java.util.Date");
    }

    private static int toInt(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            int i4 = i + 1;
            int charAt = charSequence.charAt(i) - '0';
            if (charAt < 0 || charAt > 9) {
                return -1;
            }
            i3 = (i3 * 10) + charAt;
            i = i4;
        }
        return i3;
    }

    private static int toMilli(CharSequence charSequence, int i, int i2) {
        if (i2 < i) {
            return -1;
        }
        int i3 = toInt(charSequence, i, i2);
        int i4 = i2 - i;
        while (i4 < 3) {
            i3 *= 10;
            i4++;
        }
        while (i4 > 3) {
            i3 /= 10;
            i4--;
        }
        return i3;
    }

    @Deprecated
    public static CharSequence getDate(Date date) {
        return formatDate(date, false);
    }
}
