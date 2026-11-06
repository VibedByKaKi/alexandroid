package com.swmansion.gesturehandler.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/swmansion/gesturehandler/core/PointerEventsConfig;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BOX_NONE", "BOX_ONLY", "AUTO", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PointerEventsConfig {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PointerEventsConfig[] $VALUES;
    public static final PointerEventsConfig NONE = new PointerEventsConfig("NONE", 0);
    public static final PointerEventsConfig BOX_NONE = new PointerEventsConfig("BOX_NONE", 1);
    public static final PointerEventsConfig BOX_ONLY = new PointerEventsConfig("BOX_ONLY", 2);
    public static final PointerEventsConfig AUTO = new PointerEventsConfig("AUTO", 3);

    private static final /* synthetic */ PointerEventsConfig[] $values() {
        return new PointerEventsConfig[]{NONE, BOX_NONE, BOX_ONLY, AUTO};
    }

    static {
        PointerEventsConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PointerEventsConfig(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PointerEventsConfig> getEntries() {
        return $ENTRIES;
    }

    public static PointerEventsConfig valueOf(String str) {
        return (PointerEventsConfig) Enum.valueOf(PointerEventsConfig.class, str);
    }

    public static PointerEventsConfig[] values() {
        return (PointerEventsConfig[]) $VALUES.clone();
    }
}
