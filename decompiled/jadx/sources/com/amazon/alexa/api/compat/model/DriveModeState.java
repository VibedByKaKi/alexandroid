package com.amazon.alexa.api.compat.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/api/compat/model/DriveModeState;", "", "<init>", "(Ljava/lang/String;I)V", "ACCESSORY", "AUTOBLUETOOTH", "MANUAL", "NONE", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DriveModeState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DriveModeState[] $VALUES;
    public static final DriveModeState ACCESSORY = new DriveModeState("ACCESSORY", 0);
    public static final DriveModeState AUTOBLUETOOTH = new DriveModeState("AUTOBLUETOOTH", 1);
    public static final DriveModeState MANUAL = new DriveModeState("MANUAL", 2);
    public static final DriveModeState NONE = new DriveModeState("NONE", 3);

    private static final /* synthetic */ DriveModeState[] $values() {
        return new DriveModeState[]{ACCESSORY, AUTOBLUETOOTH, MANUAL, NONE};
    }

    static {
        DriveModeState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DriveModeState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<DriveModeState> getEntries() {
        return $ENTRIES;
    }

    public static DriveModeState valueOf(String str) {
        return (DriveModeState) Enum.valueOf(DriveModeState.class, str);
    }

    public static DriveModeState[] values() {
        return (DriveModeState[]) $VALUES.clone();
    }
}
