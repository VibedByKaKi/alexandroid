package com.reactcommunity.rndatetimepicker;

import android.os.Bundle;
import java.util.Calendar;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class RNDate {
    private Calendar now = Calendar.getInstance();

    public RNDate(Bundle bundle) {
        if (bundle != null && bundle.containsKey("value")) {
            this.now.setTimeInMillis(bundle.getLong("value"));
        }
        this.now.setTimeZone(Common.getTimeZone(bundle));
    }

    public int day() {
        return this.now.get(5);
    }

    public int hour() {
        return this.now.get(11);
    }

    public int minute() {
        return this.now.get(12);
    }

    public int month() {
        return this.now.get(2);
    }

    public Long timestamp() {
        return Long.valueOf(this.now.getTimeInMillis());
    }

    public int year() {
        return this.now.get(1);
    }
}
