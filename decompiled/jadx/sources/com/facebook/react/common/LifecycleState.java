package com.facebook.react.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/common/LifecycleState;", "", "<init>", "(Ljava/lang/String;I)V", "BEFORE_CREATE", "BEFORE_RESUME", "RESUMED", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LifecycleState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LifecycleState[] $VALUES;
    public static final LifecycleState BEFORE_CREATE = new LifecycleState("BEFORE_CREATE", 0);
    public static final LifecycleState BEFORE_RESUME = new LifecycleState("BEFORE_RESUME", 1);
    public static final LifecycleState RESUMED = new LifecycleState("RESUMED", 2);

    private static final /* synthetic */ LifecycleState[] $values() {
        return new LifecycleState[]{BEFORE_CREATE, BEFORE_RESUME, RESUMED};
    }

    static {
        LifecycleState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private LifecycleState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<LifecycleState> getEntries() {
        return $ENTRIES;
    }

    public static LifecycleState valueOf(String str) {
        return (LifecycleState) Enum.valueOf(LifecycleState.class, str);
    }

    public static LifecycleState[] values() {
        return (LifecycleState[]) $VALUES.clone();
    }
}
