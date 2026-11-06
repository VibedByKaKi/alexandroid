package com.amazon.alexa.ra.core.ui.custom;

import com.amazon.devicesetup.common.v1.WifiConnectionState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/custom/GlowAnimationState;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "INGRESS", WifiConnectionState.IDLE, "MODULATION", "EGRESS", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class GlowAnimationState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GlowAnimationState[] $VALUES;
    public static final GlowAnimationState NONE = new GlowAnimationState("NONE", 0);
    public static final GlowAnimationState INGRESS = new GlowAnimationState("INGRESS", 1);
    public static final GlowAnimationState IDLE = new GlowAnimationState(WifiConnectionState.IDLE, 2);
    public static final GlowAnimationState MODULATION = new GlowAnimationState("MODULATION", 3);
    public static final GlowAnimationState EGRESS = new GlowAnimationState("EGRESS", 4);

    private static final /* synthetic */ GlowAnimationState[] $values() {
        return new GlowAnimationState[]{NONE, INGRESS, IDLE, MODULATION, EGRESS};
    }

    static {
        GlowAnimationState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private GlowAnimationState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<GlowAnimationState> getEntries() {
        return $ENTRIES;
    }

    public static GlowAnimationState valueOf(String str) {
        return (GlowAnimationState) Enum.valueOf(GlowAnimationState.class, str);
    }

    public static GlowAnimationState[] values() {
        return (GlowAnimationState[]) $VALUES.clone();
    }
}
