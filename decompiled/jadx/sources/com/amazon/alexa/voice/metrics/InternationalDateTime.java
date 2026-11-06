package com.amazon.alexa.voice.metrics;

import com.amazon.alexa.voice.utils.Preconditions;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class InternationalDateTime {
    private static final String ISO_8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final String UTC = "UTC";

    private InternationalDateTime() {
        throw new IllegalStateException("No instances allowed of this utility class!");
    }

    public static long toEpochMillisUtc(String str) {
        Preconditions.notBlank("dateTimeString must not be empty.", str);
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return 0L;
        }
    }
}
