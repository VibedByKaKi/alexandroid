package com.amazon.rtvi.capture.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/rtvi/capture/model/GestureType;", "", "<init>", "(Ljava/lang/String;I)V", "POINT", "OBJECT_HOLD", "VISUAL_WAKE_WORD", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GestureType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GestureType[] $VALUES;
    public static final GestureType POINT = new GestureType("POINT", 0);
    public static final GestureType OBJECT_HOLD = new GestureType("OBJECT_HOLD", 1);
    public static final GestureType VISUAL_WAKE_WORD = new GestureType("VISUAL_WAKE_WORD", 2);

    private static final /* synthetic */ GestureType[] $values() {
        return new GestureType[]{POINT, OBJECT_HOLD, VISUAL_WAKE_WORD};
    }

    static {
        GestureType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private GestureType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<GestureType> getEntries() {
        return $ENTRIES;
    }

    public static GestureType valueOf(String str) {
        return (GestureType) Enum.valueOf(GestureType.class, str);
    }

    public static GestureType[] values() {
        return (GestureType[]) $VALUES.clone();
    }
}
