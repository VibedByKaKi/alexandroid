package com.amazon.photos.autosave.internal.utils;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/photos/autosave/internal/utils/DateUtils;", "", "()V", "formatISO8601WithTimeZone", "", "timeMilis", "", "locale", "Ljava/util/Locale;", "timeZone", "Ljava/util/TimeZone;", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DateUtils {
    public static /* synthetic */ String formatISO8601WithTimeZone$default(DateUtils dateUtils, long j, Locale locale, TimeZone timeZone, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
            locale.getClass();
        }
        if ((i & 4) != 0) {
            timeZone = TimeZone.getDefault();
            timeZone.getClass();
        }
        return dateUtils.formatISO8601WithTimeZone(j, locale, timeZone);
    }

    @NotNull
    public final String formatISO8601WithTimeZone(long timeMilis, @NotNull Locale locale, @NotNull TimeZone timeZone) {
        locale.getClass();
        timeZone.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale);
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(Long.valueOf(timeMilis));
        format.getClass();
        return format;
    }
}
