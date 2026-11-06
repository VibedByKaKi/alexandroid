package org.apache.commons.lang3.time;

import com.amazon.dee.sdk.iotsoftap.Constants;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FastTimeZone {
    private static final Pattern GMT_PATTERN = Pattern.compile("^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$");
    private static final TimeZone GREENWICH = new GmtTimeZone(false, 0, 0);

    private FastTimeZone() {
    }

    public static TimeZone getGmtTimeZone(String str) {
        if ("Z".equals(str) || Constants.UTC.equals(str)) {
            return GREENWICH;
        }
        Matcher matcher = GMT_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        int parseInt = parseInt(matcher.group(2));
        int parseInt2 = parseInt(matcher.group(4));
        return (parseInt == 0 && parseInt2 == 0) ? GREENWICH : new GmtTimeZone(parseSign(matcher.group(1)), parseInt, parseInt2);
    }

    public static TimeZone getTimeZone(String str) {
        TimeZone gmtTimeZone = getGmtTimeZone(str);
        return gmtTimeZone != null ? gmtTimeZone : TimeZones.getTimeZone(str);
    }

    private static int parseInt(String str) {
        if (str != null) {
            return Integer.parseInt(str);
        }
        return 0;
    }

    private static boolean parseSign(String str) {
        return str != null && str.charAt(0) == '-';
    }

    public static TimeZone getGmtTimeZone() {
        return GREENWICH;
    }
}
