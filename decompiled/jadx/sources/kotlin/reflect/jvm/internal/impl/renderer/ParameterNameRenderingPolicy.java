package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class ParameterNameRenderingPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ParameterNameRenderingPolicy[] $VALUES;
    public static final ParameterNameRenderingPolicy ALL = new ParameterNameRenderingPolicy("ALL", 0);
    public static final ParameterNameRenderingPolicy ONLY_NON_SYNTHESIZED = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);
    public static final ParameterNameRenderingPolicy NONE = new ParameterNameRenderingPolicy("NONE", 2);

    private static final /* synthetic */ ParameterNameRenderingPolicy[] $values() {
        return new ParameterNameRenderingPolicy[]{ALL, ONLY_NON_SYNTHESIZED, NONE};
    }

    static {
        ParameterNameRenderingPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ParameterNameRenderingPolicy(String str, int i) {
    }

    public static ParameterNameRenderingPolicy valueOf(String str) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, str);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) $VALUES.clone();
    }
}
