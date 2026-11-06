package com.th3rdwave.safeareacontext;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewEdgeModes;", "", "<init>", "(Ljava/lang/String;I)V", "OFF", "ADDITIVE", "MAXIMUM", "react-native-safe-area-context_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SafeAreaViewEdgeModes {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SafeAreaViewEdgeModes[] $VALUES;
    public static final SafeAreaViewEdgeModes OFF = new SafeAreaViewEdgeModes("OFF", 0);
    public static final SafeAreaViewEdgeModes ADDITIVE = new SafeAreaViewEdgeModes("ADDITIVE", 1);
    public static final SafeAreaViewEdgeModes MAXIMUM = new SafeAreaViewEdgeModes("MAXIMUM", 2);

    private static final /* synthetic */ SafeAreaViewEdgeModes[] $values() {
        return new SafeAreaViewEdgeModes[]{OFF, ADDITIVE, MAXIMUM};
    }

    static {
        SafeAreaViewEdgeModes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SafeAreaViewEdgeModes(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SafeAreaViewEdgeModes> getEntries() {
        return $ENTRIES;
    }

    public static SafeAreaViewEdgeModes valueOf(String str) {
        return (SafeAreaViewEdgeModes) Enum.valueOf(SafeAreaViewEdgeModes.class, str);
    }

    public static SafeAreaViewEdgeModes[] values() {
        return (SafeAreaViewEdgeModes[]) $VALUES.clone();
    }
}
