package com.amazon.coral.util;

import com.amazon.deecomms.contacts.util.DeviceContactsFetcher;
import defpackage.a$$ExternalSyntheticOutline0;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang3.time.TimeZones;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes19.dex */
public class RFC2616 {
    private static final int DAYS_0000_TO_1970 = 719527;
    private static final Date DEFAULT_TWO_DIGIT_YEAR_START;
    private static final TimeZone GMT;
    private static final long[] MAX_TOTAL_MILLIS_BY_MONTH_ARRAY;
    private static final int MAX_YEAR = 292278993;
    private static final long MILLIS_PER_DAY = 86400000;
    private static final long MILLIS_PER_HOUR = 3600000;
    private static final long MILLIS_PER_MINUTE = 60000;
    private static final int MILLIS_PER_SECOND = 1000;
    private static final long[] MIN_TOTAL_MILLIS_BY_MONTH_ARRAY;
    private static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    private static final ThreadLocal<DateFormat> dateFormatFactory;

    static {
        TimeZone timeZone = TimeZone.getTimeZone(TimeZones.GMT_ID);
        GMT = timeZone;
        dateFormatFactory = new ThreadLocal<DateFormat>() { // from class: com.amazon.coral.util.RFC2616.1
            @Override // java.lang.ThreadLocal
            public DateFormat initialValue() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
                simpleDateFormat.set2DigitYearStart(RFC2616.DEFAULT_TWO_DIGIT_YEAR_START);
                simpleDateFormat.setTimeZone(RFC2616.GMT);
                return simpleDateFormat;
            }
        };
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2000, 0, 1, 0, 0, 0);
        int i = 0;
        calendar.set(14, 0);
        DEFAULT_TWO_DIGIT_YEAR_START = calendar.getTime();
        int[] iArr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] iArr2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        MIN_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
        MAX_TOTAL_MILLIS_BY_MONTH_ARRAY = new long[12];
        long j = 0;
        long j2 = 0;
        while (i < 11) {
            j += iArr[i] * 86400000;
            int i2 = i + 1;
            MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i2] = j;
            j2 += iArr2[i] * 86400000;
            MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i2] = j2;
            i = i2;
        }
    }

    public static long calculateFirstDayOfYearMillis(int i) {
        int i2;
        int i3 = i / 100;
        if (i < 0) {
            i2 = ((((i + 3) >> 2) - i3) + ((i3 + 3) >> 2)) - 1;
        } else {
            i2 = ((i >> 2) - i3) + (i3 >> 2);
            if (isLeapYear(i)) {
                i2--;
            }
        }
        return ((i * 365) + (i2 - DAYS_0000_TO_1970)) * 86400000;
    }

    public static CharSequence getDate(Date date) {
        if (date != null) {
            return dateFormatFactory.get().format(date);
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public static long getTotalMillisByYearMonth(int i, int i2) {
        return isLeapYear(i) ? MAX_TOTAL_MILLIS_BY_MONTH_ARRAY[i2 - 1] : MIN_TOTAL_MILLIS_BY_MONTH_ARRAY[i2 - 1];
    }

    public static long getYearMonthDayMillis(int i, int i2, int i3) {
        return ((i3 - 1) * 86400000) + getTotalMillisByYearMonth(i, i2) + calculateFirstDayOfYearMillis(i);
    }

    public static boolean isLeapYear(int i) {
        if ((i & 3) == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    private static Date parseDate(String str) {
        long parseMillis = parseMillis(str);
        if (parseMillis != Long.MIN_VALUE) {
            return new Date(parseMillis);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid date: ", str));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0171 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long parseMillis(java.lang.String r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.coral.util.RFC2616.parseMillis(java.lang.String, int, int):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long parseMonth(java.lang.String r4, int r5) {
        /*
            int r0 = r5 + 1
            char r1 = r4.charAt(r5)
            r2 = 65
            r3 = 4
            if (r1 == r2) goto L7b
            r2 = 68
            if (r1 == r2) goto L78
            r2 = 70
            if (r1 == r2) goto L76
            r2 = 74
            if (r1 == r2) goto L54
            r2 = 83
            if (r1 == r2) goto L51
            r2 = 97
            if (r1 == r2) goto L7b
            r2 = 100
            if (r1 == r2) goto L78
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L76
            r2 = 106(0x6a, float:1.49E-43)
            if (r1 == r2) goto L54
            r0 = 115(0x73, float:1.61E-43)
            if (r1 == r0) goto L51
            switch(r1) {
                case 77: goto L3e;
                case 78: goto L3b;
                case 79: goto L38;
                default: goto L32;
            }
        L32:
            switch(r1) {
                case 109: goto L3e;
                case 110: goto L3b;
                case 111: goto L38;
                default: goto L35;
            }
        L35:
            r4 = 0
            return r4
        L38:
            r4 = 10
            goto L8c
        L3b:
            r4 = 11
            goto L8c
        L3e:
            int r0 = r5 + 2
            char r4 = r4.charAt(r0)
            r0 = 114(0x72, float:1.6E-43)
            if (r4 == r0) goto L4f
            r0 = 82
            if (r4 != r0) goto L4d
            goto L4f
        L4d:
            r4 = 5
            goto L8c
        L4f:
            r4 = 3
            goto L8c
        L51:
            r4 = 9
            goto L8c
        L54:
            char r0 = r4.charAt(r0)
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L63
            r1 = 85
            if (r0 != r1) goto L61
            goto L63
        L61:
            r4 = 1
            goto L8c
        L63:
            int r0 = r5 + 2
            char r4 = r4.charAt(r0)
            r0 = 110(0x6e, float:1.54E-43)
            if (r4 == r0) goto L74
            r0 = 78
            if (r4 != r0) goto L72
            goto L74
        L72:
            r4 = 7
            goto L8c
        L74:
            r4 = 6
            goto L8c
        L76:
            r4 = 2
            goto L8c
        L78:
            r4 = 12
            goto L8c
        L7b:
            char r4 = r4.charAt(r0)
            r0 = 112(0x70, float:1.57E-43)
            if (r4 == r0) goto L8b
            r0 = 80
            if (r4 != r0) goto L88
            goto L8b
        L88:
            r4 = 8
            goto L8c
        L8b:
            r4 = r3
        L8c:
            int r5 = r5 + r3
            long r0 = (long) r5
            r5 = 32
            long r0 = r0 << r5
            long r4 = (long) r4
            long r4 = r4 | r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.coral.util.RFC2616.parseMonth(java.lang.String, int):long");
    }

    private static long parseTimeOfDay(String str, int i) {
        int charAt = str.charAt(i) - '0';
        int i2 = i + 2;
        char charAt2 = str.charAt(i + 1);
        if (charAt2 != ':') {
            charAt = (charAt * 10) + (charAt2 - '0');
            i2 = i + 3;
        }
        int charAt3 = (str.charAt(i2 + 1) - '0') + ((str.charAt(i2) - '0') * 10);
        int i3 = i2 + 3;
        return ((i2 + 4) << 32) | ((charAt3 * 60000) + (charAt * 3600000) + (((str.charAt(r2) - '0') + ((str.charAt(i3) - '0') * 10)) * 1000));
    }

    private static long parseYear(String str, int i, int i2) {
        int i3 = i2 - i;
        int i4 = i + 1;
        int charAt = str.charAt(i) - '0';
        while (i4 < i2) {
            charAt = (charAt * 10) + (str.charAt(i4) - '0');
            i4++;
        }
        if (i3 == 2) {
            charAt += charAt >= 70 ? DeviceContactsFetcher.MIN_SUPPORTED_YEAR : 2000;
        } else if (charAt > MAX_YEAR) {
            charAt = MAX_YEAR;
        }
        return charAt | (i4 << 32);
    }

    @Deprecated
    public static Date getDate(CharSequence charSequence) {
        if (charSequence != null) {
            return parseDate(charSequence.toString());
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public static long parseMillis(String str) {
        int length = str.length();
        int i = 0;
        if (length > 0 && str.charAt(0) == '\'' && str.charAt(length - 1) == '\'') {
            length--;
            i = 1;
        }
        return parseMillis(str, i, length);
    }
}
