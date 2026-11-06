package com.amazon.alexa.location.networking.alps.models;

import android.text.TextUtils;
import android.util.Log;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.dee.sdk.iotsoftap.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class ISO8601TimeSupplier {
    static final String DEFAULT_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SS'Z'";
    private static final String TAG = "ISO8601TimeSupplier";
    private final SimpleDateFormat iso8601DateFormat;
    private final Object lock;

    public ISO8601TimeSupplier(String str, TimeZone timeZone) {
        checkNotEmpty(str, "format");
        this.lock = new Object();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        this.iso8601DateFormat = simpleDateFormat;
        simpleDateFormat.setTimeZone(timeZone);
    }

    private void checkNotEmpty(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Locale locale = Locale.US;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(BitVector$$ExternalSyntheticOutline0.m(str2, " must not be empty"));
            Log.e(TAG, "Throwing ", illegalArgumentException);
            throw illegalArgumentException;
        }
    }

    private void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        Locale locale = Locale.US;
        NullPointerException nullPointerException = new NullPointerException(BitVector$$ExternalSyntheticOutline0.m(str, " must not be null"));
        Log.e(TAG, "Throwing ", nullPointerException);
        throw nullPointerException;
    }

    public String getTime(Date date) {
        String format;
        checkNotNull(date, "date");
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
        this(DEFAULT_FORMAT, TimeZone.getTimeZone(Constants.UTC));
    }
}
