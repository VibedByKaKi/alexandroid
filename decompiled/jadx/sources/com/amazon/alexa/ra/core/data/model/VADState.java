package com.amazon.alexa.ra.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/VADState;", "", "<init>", "(Ljava/lang/String;I)V", "INACTIVE", "INITIALIZING", "ACTIVE", "MUTED", "ERROR", "isRunning", "", "()Z", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class VADState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VADState[] $VALUES;
    public static final VADState INACTIVE = new VADState("INACTIVE", 0);
    public static final VADState INITIALIZING = new VADState("INITIALIZING", 1);
    public static final VADState ACTIVE = new VADState("ACTIVE", 2);
    public static final VADState MUTED = new VADState("MUTED", 3);
    public static final VADState ERROR = new VADState("ERROR", 4);

    private static final /* synthetic */ VADState[] $values() {
        return new VADState[]{INACTIVE, INITIALIZING, ACTIVE, MUTED, ERROR};
    }

    static {
        VADState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VADState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<VADState> getEntries() {
        return $ENTRIES;
    }

    public static VADState valueOf(String str) {
        return (VADState) Enum.valueOf(VADState.class, str);
    }

    public static VADState[] values() {
        return (VADState[]) $VALUES.clone();
    }

    public final boolean isRunning() {
        return this == ACTIVE || this == MUTED;
    }
}
