package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util;

import com.amazon.dee.sdk.iotsoftap.Constants;
import com.amazonaws.SDKGlobalConfiguration;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class DateUtil {
    private static final String DATE_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final DateFormat ISO_DATE_FORMATTER_UTC;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        ISO_DATE_FORMATTER_UTC = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
    }

    private DateUtil() {
    }

    public static DateFormat createLocaleIndependentDateFormatter(String str) {
        return new SimpleDateFormat(str, Locale.US);
    }

    public static Date getCorrectedDate() {
        Date date = new Date();
        return SDKGlobalConfiguration.getGlobalTimeOffset() != 0 ? new Date(date.getTime() - (SDKGlobalConfiguration.getGlobalTimeOffset() * 1000)) : date;
    }

    private static synchronized DateFormat getDateFormat() {
        DateFormat dateFormat;
        synchronized (DateUtil.class) {
            dateFormat = ISO_DATE_FORMATTER_UTC;
        }
        return dateFormat;
    }

    public static synchronized String isoDateFromMillis(long j) {
        String format;
        synchronized (DateUtil.class) {
            format = getDateFormat().format(new Date(j));
        }
        return format;
    }
}
