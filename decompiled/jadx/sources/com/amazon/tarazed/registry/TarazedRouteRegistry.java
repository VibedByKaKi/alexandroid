package com.amazon.tarazed.registry;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/tarazed/registry/TarazedRouteRegistry;", "", "(Ljava/lang/String;I)V", "HOME", "HELP_AND_FEEDBACK", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TarazedRouteRegistry {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TarazedRouteRegistry[] $VALUES;
    public static final TarazedRouteRegistry HOME = new TarazedRouteRegistry("HOME", 0);
    public static final TarazedRouteRegistry HELP_AND_FEEDBACK = new TarazedRouteRegistry("HELP_AND_FEEDBACK", 1);

    private static final /* synthetic */ TarazedRouteRegistry[] $values() {
        return new TarazedRouteRegistry[]{HOME, HELP_AND_FEEDBACK};
    }

    static {
        TarazedRouteRegistry[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TarazedRouteRegistry(String str, int i) {
    }

    @NotNull
    public static EnumEntries<TarazedRouteRegistry> getEntries() {
        return $ENTRIES;
    }

    public static TarazedRouteRegistry valueOf(String str) {
        return (TarazedRouteRegistry) Enum.valueOf(TarazedRouteRegistry.class, str);
    }

    public static TarazedRouteRegistry[] values() {
        return (TarazedRouteRegistry[]) $VALUES.clone();
    }
}
