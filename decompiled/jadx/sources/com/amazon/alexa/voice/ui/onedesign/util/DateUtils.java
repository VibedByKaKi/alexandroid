package com.amazon.alexa.voice.ui.onedesign.util;

import androidx.annotation.NonNull;
import defpackage.a$$ExternalSyntheticOutline0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class DateUtils {
    private DateUtils() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean areSameCalendarDay(Date date, Date date2) {
        Calendar dateToCalendar = dateToCalendar(date);
        Calendar dateToCalendar2 = dateToCalendar(date2);
        int[] iArr = {1, 2, 5};
        for (int i = 0; i < 3; i++) {
            if (dateToCalendar.get(iArr[i]) != dateToCalendar2.get(iArr[i])) {
                return false;
            }
        }
        return true;
    }

    public static String convert24HrToTargetFormat(String str, Locale locale, boolean z) throws ParseException {
        return new SimpleDateFormat(z ? "HH:mm" : "h:mm a", locale).format(new SimpleDateFormat("H:mm", locale).parse(str));
    }

    public static Calendar dateToCalendar(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static long extractTimeFromDateString(List<String> list, String str) throws ParseException {
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                return new SimpleDateFormat(it2.next(), Locale.getDefault()).parse(str).getTime();
            } catch (ParseException unused) {
            }
        }
        Single$$ExternalSyntheticBUOutline0.m(0, a$$ExternalSyntheticOutline0.m("Could not parse date: ", str));
        return 0L;
    }

    public static CharSequence getDayOfMonth(@NonNull Date date) {
        return String.valueOf(dateToCalendar(date).get(5));
    }

    public static int getDayOfWeek(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        return new int[]{-1, 7, 1, 2, 3, 4, 5, 6}[calendar.get(7)];
    }

    public static CharSequence getMonth(@NonNull Date date, Locale locale) {
        return dateToCalendar(date).getDisplayName(2, 2, locale).toUpperCase(locale);
    }
}
