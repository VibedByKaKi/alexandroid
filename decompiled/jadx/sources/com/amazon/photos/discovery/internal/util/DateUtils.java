package com.amazon.photos.discovery.internal.util;

import com.amazon.dee.sdk.iotsoftap.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/photos/discovery/internal/util/DateUtils;", "", "()V", "UTC_DATE_FORMAT", "Lcom/amazon/photos/discovery/internal/util/DateUtils$ThreadLocalSimpleDateFormat;", "getDateFromString", "Ljava/util/Date;", "date", "", "getDayString", "utcTime", "", "getUTCString", "ThreadLocalSimpleDateFormat", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DateUtils {

    @NotNull
    public static final DateUtils INSTANCE = new DateUtils();

    @NotNull
    private static final ThreadLocalSimpleDateFormat UTC_DATE_FORMAT = new ThreadLocalSimpleDateFormat();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0005"}, d2 = {"Lcom/amazon/photos/discovery/internal/util/DateUtils$ThreadLocalSimpleDateFormat;", "Ljava/lang/ThreadLocal;", "Ljava/text/SimpleDateFormat;", "()V", "initialValue", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ThreadLocalSimpleDateFormat extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        @Nullable
        public SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
            return simpleDateFormat;
        }
    }

    private DateUtils() {
    }

    @NotNull
    public final Date getDateFromString(@NotNull String date) throws ParseException {
        String replace$default;
        date.getClass();
        SimpleDateFormat simpleDateFormat = UTC_DATE_FORMAT.get();
        simpleDateFormat.getClass();
        replace$default = StringsKt__StringsJVMKt.replace$default(date, "Z", "+0000", false, 4, (Object) null);
        Date parse = simpleDateFormat.parse(replace$default);
        parse.getClass();
        return parse;
    }

    @NotNull
    public final String getDayString(@NotNull Date date) {
        date.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.US, "%d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))}, 3));
    }

    @NotNull
    public final String getUTCString(@NotNull Date date) {
        String replace$default;
        date.getClass();
        SimpleDateFormat simpleDateFormat = UTC_DATE_FORMAT.get();
        simpleDateFormat.getClass();
        String format = simpleDateFormat.format(date);
        format.getClass();
        replace$default = StringsKt__StringsJVMKt.replace$default(format, "+0000", "Z", false, 4, (Object) null);
        return replace$default;
    }

    @NotNull
    public final String getUTCString(long utcTime) {
        return getUTCString(new Date(utcTime));
    }

    @NotNull
    public final String getDayString(long utcTime) {
        return getDayString(new Date(utcTime));
    }
}
