package com.amazon.alexa.presence.bleconn.helpers;

import java.util.Calendar;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class DateHelper {
    private DateHelper() {
    }

    public static Date addHoursTo(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(10, i);
        return calendar.getTime();
    }
}
