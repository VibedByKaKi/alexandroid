package com.amazon.alexa.voice.ui.onedesign.calendar;

import com.amazon.alexa.voice.ui.onedesign.util.DateUtils;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DateDeduplicator {
    private Date lastSeenDate;

    public Date getLastSeenDate() {
        Date date = this.lastSeenDate;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    public Date getNextDate(Date date) {
        Date date2 = date == null ? null : (Date) date.clone();
        if (date2 == null) {
            return null;
        }
        Date date3 = this.lastSeenDate;
        if (date3 != null && DateUtils.areSameCalendarDay(date3, date2)) {
            return null;
        }
        this.lastSeenDate = date2;
        return date2;
    }

    public void reset() {
        this.lastSeenDate = null;
    }
}
