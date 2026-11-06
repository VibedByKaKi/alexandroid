package com.amazon.tarazed.ui.menu.databinding;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/tarazed/ui/menu/databinding/ControlButtonState;", "", "(Ljava/lang/String;I)V", "PAUSE", "PLAY", "SPINNER", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ControlButtonState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ControlButtonState[] $VALUES;
    public static final ControlButtonState PAUSE = new ControlButtonState("PAUSE", 0);
    public static final ControlButtonState PLAY = new ControlButtonState("PLAY", 1);
    public static final ControlButtonState SPINNER = new ControlButtonState("SPINNER", 2);

    private static final /* synthetic */ ControlButtonState[] $values() {
        return new ControlButtonState[]{PAUSE, PLAY, SPINNER};
    }

    static {
        ControlButtonState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ControlButtonState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ControlButtonState> getEntries() {
        return $ENTRIES;
    }

    public static ControlButtonState valueOf(String str) {
        return (ControlButtonState) Enum.valueOf(ControlButtonState.class, str);
    }

    public static ControlButtonState[] values() {
        return (ControlButtonState[]) $VALUES.clone();
    }
}
