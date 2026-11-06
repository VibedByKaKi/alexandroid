package com.amazon.rtvi.capture.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/rtvi/capture/model/CaptureMode;", "", "<init>", "(Ljava/lang/String;I)V", "DETAIL", "TEMPORAL", "interface-library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CaptureMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CaptureMode[] $VALUES;
    public static final CaptureMode DETAIL = new CaptureMode("DETAIL", 0);
    public static final CaptureMode TEMPORAL = new CaptureMode("TEMPORAL", 1);

    private static final /* synthetic */ CaptureMode[] $values() {
        return new CaptureMode[]{DETAIL, TEMPORAL};
    }

    static {
        CaptureMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CaptureMode(String str, int i) {
    }

    @NotNull
    public static EnumEntries<CaptureMode> getEntries() {
        return $ENTRIES;
    }

    public static CaptureMode valueOf(String str) {
        return (CaptureMode) Enum.valueOf(CaptureMode.class, str);
    }

    public static CaptureMode[] values() {
        return (CaptureMode[]) $VALUES.clone();
    }
}
