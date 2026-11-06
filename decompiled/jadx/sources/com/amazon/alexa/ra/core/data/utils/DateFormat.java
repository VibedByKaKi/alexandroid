package com.amazon.alexa.ra.core.data.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/core/data/utils/DateFormat;", "", "pattern", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPattern", "()Ljava/lang/String;", "SHORT_DATE_FORMAT", "SHORT_DATE_WITHOUT_YEAR_FORMAT", "TIME_12_HOUR_FORMAT", "RFC_822_DATE_FORMAT", "ISO_8601_TIMEZONE", "ISO_8601_MILLISECONDS", "ISO_8601_MILLISECONDS_TIMEZONE", "ISO_8601_MILLISECONDS_Z_TIMEZONE", "LONG_DATE_12_HOUR_FORMAT", "DATETIME_RFC3339", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DateFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DateFormat[] $VALUES;

    @NotNull
    private final String pattern;
    public static final DateFormat SHORT_DATE_FORMAT = new DateFormat("SHORT_DATE_FORMAT", 0, "MMM d, yyyy");
    public static final DateFormat SHORT_DATE_WITHOUT_YEAR_FORMAT = new DateFormat("SHORT_DATE_WITHOUT_YEAR_FORMAT", 1, "MMM dd");
    public static final DateFormat TIME_12_HOUR_FORMAT = new DateFormat("TIME_12_HOUR_FORMAT", 2, "h:mm aaa");
    public static final DateFormat RFC_822_DATE_FORMAT = new DateFormat("RFC_822_DATE_FORMAT", 3, "EEE MMM dd HH:mm:ss z yyyy");
    public static final DateFormat ISO_8601_TIMEZONE = new DateFormat("ISO_8601_TIMEZONE", 4, "yyyy-MM-dd'T'HH:mm:ss'Z'");
    public static final DateFormat ISO_8601_MILLISECONDS = new DateFormat("ISO_8601_MILLISECONDS", 5, "yyyy-MM-dd'T'HH:mm:ss.SSS");
    public static final DateFormat ISO_8601_MILLISECONDS_TIMEZONE = new DateFormat("ISO_8601_MILLISECONDS_TIMEZONE", 6, "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    public static final DateFormat ISO_8601_MILLISECONDS_Z_TIMEZONE = new DateFormat("ISO_8601_MILLISECONDS_Z_TIMEZONE", 7, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    public static final DateFormat LONG_DATE_12_HOUR_FORMAT = new DateFormat("LONG_DATE_12_HOUR_FORMAT", 8, "EEEE MMM-dd h:mm aaa");
    public static final DateFormat DATETIME_RFC3339 = new DateFormat("DATETIME_RFC3339", 9, "yyyy-MM-dd'T'HH:mm:ssXXX");

    private static final /* synthetic */ DateFormat[] $values() {
        return new DateFormat[]{SHORT_DATE_FORMAT, SHORT_DATE_WITHOUT_YEAR_FORMAT, TIME_12_HOUR_FORMAT, RFC_822_DATE_FORMAT, ISO_8601_TIMEZONE, ISO_8601_MILLISECONDS, ISO_8601_MILLISECONDS_TIMEZONE, ISO_8601_MILLISECONDS_Z_TIMEZONE, LONG_DATE_12_HOUR_FORMAT, DATETIME_RFC3339};
    }

    static {
        DateFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DateFormat(String str, int i, String str2) {
        this.pattern = str2;
    }

    @NotNull
    public static EnumEntries<DateFormat> getEntries() {
        return $ENTRIES;
    }

    public static DateFormat valueOf(String str) {
        return (DateFormat) Enum.valueOf(DateFormat.class, str);
    }

    public static DateFormat[] values() {
        return (DateFormat[]) $VALUES.clone();
    }

    @NotNull
    public final String getPattern() {
        return this.pattern;
    }
}
