package com.amazon.alexa.ra.core.data.utils;

import com.amazon.alexa.redesign.utils.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/utils/DateSkeleton;", "", Constants.SKELETON, "", "fallbackPattern", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getSkeleton", "()Ljava/lang/String;", "getFallbackPattern", "MONTH_DAY", "MONTH_DAY_YEAR", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DateSkeleton {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DateSkeleton[] $VALUES;
    public static final DateSkeleton MONTH_DAY = new DateSkeleton("MONTH_DAY", 0, "MMMd", "MMM d");
    public static final DateSkeleton MONTH_DAY_YEAR = new DateSkeleton("MONTH_DAY_YEAR", 1, "MMMdyyyy", "MMM d, yyyy");

    @NotNull
    private final String fallbackPattern;

    @NotNull
    private final String skeleton;

    private static final /* synthetic */ DateSkeleton[] $values() {
        return new DateSkeleton[]{MONTH_DAY, MONTH_DAY_YEAR};
    }

    static {
        DateSkeleton[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DateSkeleton(String str, int i, String str2, String str3) {
        this.skeleton = str2;
        this.fallbackPattern = str3;
    }

    @NotNull
    public static EnumEntries<DateSkeleton> getEntries() {
        return $ENTRIES;
    }

    public static DateSkeleton valueOf(String str) {
        return (DateSkeleton) Enum.valueOf(DateSkeleton.class, str);
    }

    public static DateSkeleton[] values() {
        return (DateSkeleton[]) $VALUES.clone();
    }

    @NotNull
    public final String getFallbackPattern() {
        return this.fallbackPattern;
    }

    @NotNull
    public final String getSkeleton() {
        return this.skeleton;
    }
}
