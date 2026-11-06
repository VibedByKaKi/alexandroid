package com.amazon.alexa.featureservice.util;

import androidx.room.TypeConverter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Converters {
    private Converters() {
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        if (date == null) {
            return null;
        }
        return Long.valueOf(date.getTime());
    }

    @TypeConverter
    public static Date fromTimestamp(Long l) {
        if (l == null) {
            return null;
        }
        return new Date(l.longValue());
    }
}
