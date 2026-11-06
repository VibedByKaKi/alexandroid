package com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class LvcTimestamp {
    private static final DateTimeFormatter RFC_3339_MILLIS_UTC = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").withZone(ZoneOffset.UTC);

    private LvcTimestamp() {
    }

    @NonNull
    public static String format(@NonNull Instant instant) {
        return RFC_3339_MILLIS_UTC.format(instant);
    }

    @NonNull
    public static String now() {
        return format(Instant.now());
    }

    @Nullable
    public static Instant parse(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Instant.parse(str);
        } catch (DateTimeException unused) {
            return null;
        }
    }
}
