package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class DeprecationLevelValue {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeprecationLevelValue[] $VALUES;
    public static final DeprecationLevelValue WARNING = new DeprecationLevelValue("WARNING", 0);
    public static final DeprecationLevelValue ERROR = new DeprecationLevelValue("ERROR", 1);
    public static final DeprecationLevelValue HIDDEN = new DeprecationLevelValue("HIDDEN", 2);

    private static final /* synthetic */ DeprecationLevelValue[] $values() {
        return new DeprecationLevelValue[]{WARNING, ERROR, HIDDEN};
    }

    static {
        DeprecationLevelValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DeprecationLevelValue(String str, int i) {
    }

    public static DeprecationLevelValue valueOf(String str) {
        return (DeprecationLevelValue) Enum.valueOf(DeprecationLevelValue.class, str);
    }

    public static DeprecationLevelValue[] values() {
        return (DeprecationLevelValue[]) $VALUES.clone();
    }
}
