package com.amazon.alexa.accessory.avsclient.utils;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.dee.sdk.iotsoftap.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ISO8601TimeSupplier {
    private static final String DEFAULT_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SS'Z'";
    private final SimpleDateFormat iso8601DateFormat;
    private final Object lock;

    public ISO8601TimeSupplier(String str) {
        Preconditions.notEmpty(str, "format");
        this.lock = new Object();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        this.iso8601DateFormat = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
    }

    public String getTime(Date date) {
        String format;
        Preconditions.notNull(date, "date");
        synchronized (this.lock) {
            format = this.iso8601DateFormat.format(date);
        }
        return format;
    }

    public String getTimeOptional(Long l) {
        if (l == null) {
            return null;
        }
        return getTime(l.longValue());
    }

    public String getTime(long j) {
        String format;
        synchronized (this.lock) {
            format = this.iso8601DateFormat.format(new Date(j));
        }
        return format;
    }

    public ISO8601TimeSupplier() {
        this(DEFAULT_FORMAT);
    }
}
