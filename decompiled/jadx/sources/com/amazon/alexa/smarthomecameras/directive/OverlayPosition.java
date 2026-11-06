package com.amazon.alexa.smarthomecameras.directive;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/directive/OverlayPosition;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_RIGHT", "TOP_LEFT", "BOTTOM_RIGHT", "BOTTOM_LEFT", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class OverlayPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OverlayPosition[] $VALUES;
    public static final OverlayPosition TOP_RIGHT = new OverlayPosition("TOP_RIGHT", 0);
    public static final OverlayPosition TOP_LEFT = new OverlayPosition("TOP_LEFT", 1);
    public static final OverlayPosition BOTTOM_RIGHT = new OverlayPosition("BOTTOM_RIGHT", 2);
    public static final OverlayPosition BOTTOM_LEFT = new OverlayPosition("BOTTOM_LEFT", 3);

    private static final /* synthetic */ OverlayPosition[] $values() {
        return new OverlayPosition[]{TOP_RIGHT, TOP_LEFT, BOTTOM_RIGHT, BOTTOM_LEFT};
    }

    static {
        OverlayPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private OverlayPosition(String str, int i) {
    }

    @NotNull
    public static EnumEntries<OverlayPosition> getEntries() {
        return $ENTRIES;
    }

    public static OverlayPosition valueOf(String str) {
        return (OverlayPosition) Enum.valueOf(OverlayPosition.class, str);
    }

    public static OverlayPosition[] values() {
        return (OverlayPosition[]) $VALUES.clone();
    }
}
