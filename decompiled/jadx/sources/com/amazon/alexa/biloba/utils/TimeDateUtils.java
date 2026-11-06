package com.amazon.alexa.biloba.utils;

import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class TimeDateUtils {
    public static final String DAY_END = "2359";
    public static final String DAY_MID = "1200";
    public static final String DAY_START = "0000";
    public static final int NOT_SET = -1;
    private static final String TAG = "TimeDateUtils";

    private TimeDateUtils() {
    }

    public static String getDisplayTime(int i, int i2, @NonNull DateFormat dateFormat, String str, String str2) {
        if (i == -1 || i2 == -1) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        String format = (i == 0 && i2 == 0 && str2 != null) ? String.format(str2, dateFormat.format(calendar.getTime())) : (i == 12 && i2 == 0 && str != null) ? String.format(str, dateFormat.format(calendar.getTime())) : dateFormat.format(calendar.getTime());
        String str3 = TAG;
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "display time for ", " hours and ", " minutes --> ");
        m29m.append(format);
        LogUtils.v(str3, m29m.toString());
        return format;
    }

    public static String getDisplayTimeFromCalendar(Calendar calendar, @NonNull DateFormat dateFormat, String str, String str2) {
        if (calendar == null) {
            return null;
        }
        return getDisplayTime(calendar.get(11), calendar.get(12), dateFormat, str, str2);
    }

    public static String getDisplayTimeFromStorageFormat(String str, @NonNull DateFormat dateFormat, String str2, String str3) {
        return getDisplayTimeFromCalendar(parseTimeFromStorageFormat(str), dateFormat, str2, str3);
    }

    public static String hoursAndMinutesToStorageFormat(int i, int i2) {
        if (i == -1 || i2 == -1) {
            return null;
        }
        return String.format("%02d%02d", Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static boolean isAllDay(String str, String str2) {
        return DAY_START.equals(str) && DAY_END.equals(str2);
    }

    public static Calendar parseTimeFromStorageFormat(String str) {
        if (str == null) {
            return null;
        }
        try {
            Date parse = new SimpleDateFormat("HHmm", Locale.US).parse(str);
            if (parse == null) {
                LogUtils.e(TAG, "Could not parse time from null date");
                return null;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parse);
            return calendar;
        } catch (ParseException e) {
            LogUtils.e(TAG, e.getLocalizedMessage());
            return null;
        }
    }
}
