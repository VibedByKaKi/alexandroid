package kotlin.reflect.jvm.internal.impl.load.java.structure;

import com.amazon.clouddrive.model.NodeType;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class LightClassOriginKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LightClassOriginKind[] $VALUES;
    public static final LightClassOriginKind SOURCE = new LightClassOriginKind(NodeType.SOURCE, 0);
    public static final LightClassOriginKind BINARY = new LightClassOriginKind("BINARY", 1);

    private static final /* synthetic */ LightClassOriginKind[] $values() {
        return new LightClassOriginKind[]{SOURCE, BINARY};
    }

    static {
        LightClassOriginKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private LightClassOriginKind(String str, int i) {
    }

    public static LightClassOriginKind valueOf(String str) {
        return (LightClassOriginKind) Enum.valueOf(LightClassOriginKind.class, str);
    }

    public static LightClassOriginKind[] values() {
        return (LightClassOriginKind[]) $VALUES.clone();
    }
}
