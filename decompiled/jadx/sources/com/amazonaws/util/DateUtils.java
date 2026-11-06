package com.amazonaws.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang3.time.TimeZones;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DateUtils {
    public static final String ALTERNATE_ISO8601_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    public static final String COMPRESSED_DATE_PATTERN = "yyyyMMdd'T'HHmmss'Z'";
    public static final String ISO8601_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    public static final String RFC822_DATE_PATTERN = "EEE, dd MMM yyyy HH:mm:ss z";
    private static final TimeZone GMT_TIMEZONE = TimeZone.getTimeZone(TimeZones.GMT_ID);
    private static final Map<String, ThreadLocal<SimpleDateFormat>> SDF_MAP = new HashMap();

    public static Date cloneDate(Date date) {
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    public static String format(String str, Date date) {
        return getSimpleDateFormat(str).get().format(date);
    }

    public static String formatISO8601Date(Date date) {
        return format("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", date);
    }

    public static String formatRFC822Date(Date date) {
        return format(RFC822_DATE_PATTERN, date);
    }

    private static ThreadLocal<SimpleDateFormat> getSimpleDateFormat(final String str) {
        ThreadLocal<SimpleDateFormat> threadLocal;
        Map<String, ThreadLocal<SimpleDateFormat>> map = SDF_MAP;
        ThreadLocal<SimpleDateFormat> threadLocal2 = map.get(str);
        if (threadLocal2 != null) {
            return threadLocal2;
        }
        synchronized (map) {
            try {
                threadLocal = map.get(str);
                if (threadLocal == null) {
                    threadLocal = new ThreadLocal<SimpleDateFormat>() { // from class: com.amazonaws.util.DateUtils.1
                        @Override // java.lang.ThreadLocal
                        public SimpleDateFormat initialValue() {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
                            simpleDateFormat.setTimeZone(DateUtils.GMT_TIMEZONE);
                            simpleDateFormat.setLenient(false);
                            return simpleDateFormat;
                        }
                    };
                    map.put(str, threadLocal);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return threadLocal;
    }

    public static long numberOfDaysSinceEpoch(long j) {
        return j / 86400000;
    }

    public static Date parse(String str, String str2) {
        try {
            return getSimpleDateFormat(str).get().parse(str2);
        } catch (ParseException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }

    public static Date parseCompressedISO8601Date(String str) {
        return parse(COMPRESSED_DATE_PATTERN, str);
    }

    public static Date parseISO8601Date(String str) {
        try {
            return parse("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", str);
        } catch (IllegalArgumentException unused) {
            return parse("yyyy-MM-dd'T'HH:mm:ss'Z'", str);
        }
    }

    public static Date parseRFC822Date(String str) {
        return parse(RFC822_DATE_PATTERN, str);
    }
}
