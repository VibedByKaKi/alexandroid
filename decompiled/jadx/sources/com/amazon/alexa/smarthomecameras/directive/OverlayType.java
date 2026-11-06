package com.amazon.alexa.smarthomecameras.directive;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/directive/OverlayType;", "", "<init>", "(Ljava/lang/String;I)V", "PICTURE_IN_PICTURE", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class OverlayType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OverlayType[] $VALUES;
    public static final OverlayType PICTURE_IN_PICTURE = new OverlayType("PICTURE_IN_PICTURE", 0);

    private static final /* synthetic */ OverlayType[] $values() {
        return new OverlayType[]{PICTURE_IN_PICTURE};
    }

    static {
        OverlayType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private OverlayType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<OverlayType> getEntries() {
        return $ENTRIES;
    }

    public static OverlayType valueOf(String str) {
        return (OverlayType) Enum.valueOf(OverlayType.class, str);
    }

    public static OverlayType[] values() {
        return (OverlayType[]) $VALUES.clone();
    }
}
