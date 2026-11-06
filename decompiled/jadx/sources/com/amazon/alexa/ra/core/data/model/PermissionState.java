package com.amazon.alexa.ra.core.data.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/PermissionState;", "", "<init>", "(Ljava/lang/String;I)V", "GRANTED", "NOT_GRANTED", "DENIED", "INVALID", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PermissionState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PermissionState[] $VALUES;
    public static final PermissionState GRANTED = new PermissionState("GRANTED", 0);
    public static final PermissionState NOT_GRANTED = new PermissionState("NOT_GRANTED", 1);
    public static final PermissionState DENIED = new PermissionState("DENIED", 2);
    public static final PermissionState INVALID = new PermissionState("INVALID", 3);

    private static final /* synthetic */ PermissionState[] $values() {
        return new PermissionState[]{GRANTED, NOT_GRANTED, DENIED, INVALID};
    }

    static {
        PermissionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PermissionState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PermissionState> getEntries() {
        return $ENTRIES;
    }

    public static PermissionState valueOf(String str) {
        return (PermissionState) Enum.valueOf(PermissionState.class, str);
    }

    public static PermissionState[] values() {
        return (PermissionState[]) $VALUES.clone();
    }
}
