package com.amazon.deecomms.common.util;

import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class TimePeriodHelper {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, TimePeriodHelper.class);

    private static SimpleDateFormat createDateTimeFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(com.amazon.dee.sdk.iotsoftap.Constants.UTC));
        return simpleDateFormat;
    }

    public long convertTimestampStringToMills(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return createDateTimeFormat().parse(str).getTime();
        } catch (ParseException unused) {
            LOG.e("Timestamp parsing failed. Timestamp: ".concat(str));
            return -1L;
        }
    }

    public String convertToISOFormat(long j) {
        return createDateTimeFormat().format(Long.valueOf(j));
    }
}
