package com.facebook.react.uimanager.style;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/uimanager/style/ComputedBorderRadiusProp;", "", "<init>", "(Ljava/lang/String;I)V", "COMPUTED_BORDER_TOP_LEFT_RADIUS", "COMPUTED_BORDER_TOP_RIGHT_RADIUS", "COMPUTED_BORDER_BOTTOM_RIGHT_RADIUS", "COMPUTED_BORDER_BOTTOM_LEFT_RADIUS", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComputedBorderRadiusProp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ComputedBorderRadiusProp[] $VALUES;
    public static final ComputedBorderRadiusProp COMPUTED_BORDER_TOP_LEFT_RADIUS = new ComputedBorderRadiusProp("COMPUTED_BORDER_TOP_LEFT_RADIUS", 0);
    public static final ComputedBorderRadiusProp COMPUTED_BORDER_TOP_RIGHT_RADIUS = new ComputedBorderRadiusProp("COMPUTED_BORDER_TOP_RIGHT_RADIUS", 1);
    public static final ComputedBorderRadiusProp COMPUTED_BORDER_BOTTOM_RIGHT_RADIUS = new ComputedBorderRadiusProp("COMPUTED_BORDER_BOTTOM_RIGHT_RADIUS", 2);
    public static final ComputedBorderRadiusProp COMPUTED_BORDER_BOTTOM_LEFT_RADIUS = new ComputedBorderRadiusProp("COMPUTED_BORDER_BOTTOM_LEFT_RADIUS", 3);

    private static final /* synthetic */ ComputedBorderRadiusProp[] $values() {
        return new ComputedBorderRadiusProp[]{COMPUTED_BORDER_TOP_LEFT_RADIUS, COMPUTED_BORDER_TOP_RIGHT_RADIUS, COMPUTED_BORDER_BOTTOM_RIGHT_RADIUS, COMPUTED_BORDER_BOTTOM_LEFT_RADIUS};
    }

    static {
        ComputedBorderRadiusProp[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ComputedBorderRadiusProp(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ComputedBorderRadiusProp> getEntries() {
        return $ENTRIES;
    }

    public static ComputedBorderRadiusProp valueOf(String str) {
        return (ComputedBorderRadiusProp) Enum.valueOf(ComputedBorderRadiusProp.class, str);
    }

    public static ComputedBorderRadiusProp[] values() {
        return (ComputedBorderRadiusProp[]) $VALUES.clone();
    }
}
