package com.amazon.alexa.assistant.capability.playbackcontroller.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/capability/playbackcontroller/model/ToggleAction;", "", "<init>", "(Ljava/lang/String;I)V", "SELECT", "DESELECT", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ToggleAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ToggleAction[] $VALUES;
    public static final ToggleAction SELECT = new ToggleAction("SELECT", 0);
    public static final ToggleAction DESELECT = new ToggleAction("DESELECT", 1);

    private static final /* synthetic */ ToggleAction[] $values() {
        return new ToggleAction[]{SELECT, DESELECT};
    }

    static {
        ToggleAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ToggleAction(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ToggleAction> getEntries() {
        return $ENTRIES;
    }

    public static ToggleAction valueOf(String str) {
        return (ToggleAction) Enum.valueOf(ToggleAction.class, str);
    }

    public static ToggleAction[] values() {
        return (ToggleAction[]) $VALUES.clone();
    }
}
