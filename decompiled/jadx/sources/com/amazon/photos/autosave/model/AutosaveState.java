package com.amazon.photos.autosave.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/photos/autosave/model/AutosaveState;", "", "(Ljava/lang/String;I)V", "QUEUED", "SYNCED", "FAILED", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AutosaveState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AutosaveState[] $VALUES;
    public static final AutosaveState QUEUED = new AutosaveState("QUEUED", 0);
    public static final AutosaveState SYNCED = new AutosaveState("SYNCED", 1);
    public static final AutosaveState FAILED = new AutosaveState("FAILED", 2);

    private static final /* synthetic */ AutosaveState[] $values() {
        return new AutosaveState[]{QUEUED, SYNCED, FAILED};
    }

    static {
        AutosaveState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AutosaveState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AutosaveState> getEntries() {
        return $ENTRIES;
    }

    public static AutosaveState valueOf(String str) {
        return (AutosaveState) Enum.valueOf(AutosaveState.class, str);
    }

    public static AutosaveState[] values() {
        return (AutosaveState[]) $VALUES.clone();
    }
}
