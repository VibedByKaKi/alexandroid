package org.joda.time;

import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ReadableDateTime extends ReadableInstant {
    int getCenturyOfEra();

    int getDayOfMonth();

    int getDayOfWeek();

    int getDayOfYear();

    int getEra();

    int getHourOfDay();

    int getMillisOfDay();

    int getMillisOfSecond();

    int getMinuteOfDay();

    int getMinuteOfHour();

    int getMonthOfYear();

    int getSecondOfDay();

    int getSecondOfMinute();

    int getWeekOfWeekyear();

    int getWeekyear();

    int getYear();

    int getYearOfCentury();

    int getYearOfEra();

    DateTime toDateTime();

    MutableDateTime toMutableDateTime();

    String toString(String str) throws IllegalArgumentException;

    String toString(String str, Locale locale) throws IllegalArgumentException;
}
