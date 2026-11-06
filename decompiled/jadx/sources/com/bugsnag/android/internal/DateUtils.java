package com.bugsnag.android.internal;

import com.amazon.dee.sdk.iotsoftap.Constants;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/internal/DateUtils;", "", "()V", "iso8601Format", "Ljava/text/DateFormat;", "getIso8601Format", "()Ljava/text/DateFormat;", "iso8601Holder", "com/bugsnag/android/internal/DateUtils$iso8601Holder$1", "Lcom/bugsnag/android/internal/DateUtils$iso8601Holder$1;", "fromIso8601", "Ljava/util/Date;", "date", "", "toIso8601", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class DateUtils {

    @NotNull
    public static final DateUtils INSTANCE = new DateUtils();
    private static final DateUtils$iso8601Holder$1 iso8601Holder = new ThreadLocal<DateFormat>() { // from class: com.bugsnag.android.internal.DateUtils$iso8601Holder$1
        @Override // java.lang.ThreadLocal
        @NotNull
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
            return simpleDateFormat;
        }
    };

    private DateUtils() {
    }

    @JvmStatic
    @NotNull
    public static final Date fromIso8601(@NotNull String date) {
        date.getClass();
        try {
            Date parse = INSTANCE.getIso8601Format().parse(date);
            if (parse != null) {
                return parse;
            }
            throw new ParseException("DateFormat.parse returned null", 0);
        } catch (ParseException e) {
            Single$$ExternalSyntheticBUOutline0.m("Failed to parse timestamp", e);
            return null;
        }
    }

    private final DateFormat getIso8601Format() {
        DateFormat dateFormat = iso8601Holder.get();
        if (dateFormat != null) {
            return dateFormat;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Unable to find valid dateformatter");
        return null;
    }

    @JvmStatic
    @NotNull
    public static final String toIso8601(@NotNull Date date) {
        date.getClass();
        String format = INSTANCE.getIso8601Format().format(date);
        format.getClass();
        return format;
    }
}
