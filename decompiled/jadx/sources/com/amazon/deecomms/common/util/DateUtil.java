package com.amazon.deecomms.common.util;

import com.amazon.dee.sdk.iotsoftap.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class DateUtil {
    private static final SimpleDateFormat utcDateOnlyFormat;
    private static final SimpleDateFormat utcDateTimeFormat;

    static {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale);
        utcDateTimeFormat = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", locale);
        utcDateOnlyFormat = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
    }

    private DateUtil() {
    }

    public static String getUTCDateOnly(Date date) {
        return utcDateOnlyFormat.format(date);
    }

    public static String getUTCTime(Date date) {
        return utcDateTimeFormat.format(date);
    }
}
