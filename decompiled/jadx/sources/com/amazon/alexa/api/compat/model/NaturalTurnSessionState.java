package com.amazon.alexa.api.compat.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/api/compat/model/NaturalTurnSessionState;", "", "<init>", "(Ljava/lang/String;I)V", "INACTIVE", "ACTIVE", "MUTED", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class NaturalTurnSessionState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NaturalTurnSessionState[] $VALUES;
    public static final NaturalTurnSessionState INACTIVE = new NaturalTurnSessionState("INACTIVE", 0);
    public static final NaturalTurnSessionState ACTIVE = new NaturalTurnSessionState("ACTIVE", 1);
    public static final NaturalTurnSessionState MUTED = new NaturalTurnSessionState("MUTED", 2);

    private static final /* synthetic */ NaturalTurnSessionState[] $values() {
        return new NaturalTurnSessionState[]{INACTIVE, ACTIVE, MUTED};
    }

    static {
        NaturalTurnSessionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private NaturalTurnSessionState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<NaturalTurnSessionState> getEntries() {
        return $ENTRIES;
    }

    public static NaturalTurnSessionState valueOf(String str) {
        return (NaturalTurnSessionState) Enum.valueOf(NaturalTurnSessionState.class, str);
    }

    public static NaturalTurnSessionState[] values() {
        return (NaturalTurnSessionState[]) $VALUES.clone();
    }
}
