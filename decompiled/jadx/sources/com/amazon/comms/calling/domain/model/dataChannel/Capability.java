package com.amazon.comms.calling.domain.model.dataChannel;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/Capability;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SCREEN_EVENTS", "APPLICATION", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class Capability {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Capability[] $VALUES;

    @NotNull
    private final String value;

    @SerializedName("screen_events")
    public static final Capability SCREEN_EVENTS = new Capability("SCREEN_EVENTS", 0, "screen_events");

    @SerializedName("application")
    public static final Capability APPLICATION = new Capability("APPLICATION", 1, "application");

    private static final /* synthetic */ Capability[] $values() {
        return new Capability[]{SCREEN_EVENTS, APPLICATION};
    }

    static {
        Capability[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private Capability(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<Capability> getEntries() {
        return $ENTRIES;
    }

    public static Capability valueOf(String str) {
        return (Capability) Enum.valueOf(Capability.class, str);
    }

    public static Capability[] values() {
        return (Capability[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
