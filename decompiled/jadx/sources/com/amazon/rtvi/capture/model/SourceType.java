package com.amazon.rtvi.capture.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/rtvi/capture/model/SourceType;", "", "<init>", "(Ljava/lang/String;I)V", "DEVICE_CAMERA", "ACCESSORY_CAMERA", "DEVICE_SCREEN", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SourceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SourceType[] $VALUES;
    public static final SourceType DEVICE_CAMERA = new SourceType("DEVICE_CAMERA", 0);
    public static final SourceType ACCESSORY_CAMERA = new SourceType("ACCESSORY_CAMERA", 1);
    public static final SourceType DEVICE_SCREEN = new SourceType("DEVICE_SCREEN", 2);

    private static final /* synthetic */ SourceType[] $values() {
        return new SourceType[]{DEVICE_CAMERA, ACCESSORY_CAMERA, DEVICE_SCREEN};
    }

    static {
        SourceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SourceType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SourceType> getEntries() {
        return $ENTRIES;
    }

    public static SourceType valueOf(String str) {
        return (SourceType) Enum.valueOf(SourceType.class, str);
    }

    public static SourceType[] values() {
        return (SourceType[]) $VALUES.clone();
    }
}
