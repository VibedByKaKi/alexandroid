package org.apache.http.impl.cookie;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Date;
import java.util.TimeZone;
import org.apache.commons.lang3.time.TimeZones;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes11.dex */
public final class DateUtils {
    public static final TimeZone GMT = TimeZone.getTimeZone(TimeZones.GMT_ID);
    public static final String PATTERN_ASCTIME = "EEE MMM d HH:mm:ss yyyy";
    public static final String PATTERN_RFC1036 = "EEE, dd-MMM-yy HH:mm:ss zzz";
    public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";

    private DateUtils() {
    }

    public static String formatDate(Date date) {
        return org.apache.http.client.utils.DateUtils.formatDate(date);
    }

    public static Date parseDate(String str, String[] strArr, Date date) throws DateParseException {
        Date parseDate = org.apache.http.client.utils.DateUtils.parseDate(str, strArr, date);
        if (parseDate != null) {
            return parseDate;
        }
        throw new DateParseException(a$$ExternalSyntheticOutline0.m("Unable to parse the date ", str));
    }

    public static String formatDate(Date date, String str) {
        return org.apache.http.client.utils.DateUtils.formatDate(date, str);
    }

    public static Date parseDate(String str, String[] strArr) throws DateParseException {
        return parseDate(str, strArr, null);
    }

    public static Date parseDate(String str) throws DateParseException {
        return parseDate(str, null, null);
    }
}
