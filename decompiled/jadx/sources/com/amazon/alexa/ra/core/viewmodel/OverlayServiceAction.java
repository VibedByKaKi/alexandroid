package com.amazon.alexa.ra.core.viewmodel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/viewmodel/OverlayServiceAction;", "", "<init>", "(Ljava/lang/String;I)V", "START", "KEEP", "STOP", "LEAVE_ALONE", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class OverlayServiceAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OverlayServiceAction[] $VALUES;
    public static final OverlayServiceAction START = new OverlayServiceAction("START", 0);
    public static final OverlayServiceAction KEEP = new OverlayServiceAction("KEEP", 1);
    public static final OverlayServiceAction STOP = new OverlayServiceAction("STOP", 2);
    public static final OverlayServiceAction LEAVE_ALONE = new OverlayServiceAction("LEAVE_ALONE", 3);

    private static final /* synthetic */ OverlayServiceAction[] $values() {
        return new OverlayServiceAction[]{START, KEEP, STOP, LEAVE_ALONE};
    }

    static {
        OverlayServiceAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private OverlayServiceAction(String str, int i) {
    }

    @NotNull
    public static EnumEntries<OverlayServiceAction> getEntries() {
        return $ENTRIES;
    }

    public static OverlayServiceAction valueOf(String str) {
        return (OverlayServiceAction) Enum.valueOf(OverlayServiceAction.class, str);
    }

    public static OverlayServiceAction[] values() {
        return (OverlayServiceAction[]) $VALUES.clone();
    }
}
