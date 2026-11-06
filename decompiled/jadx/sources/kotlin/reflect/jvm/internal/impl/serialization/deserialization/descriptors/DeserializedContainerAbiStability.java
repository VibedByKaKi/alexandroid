package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class DeserializedContainerAbiStability {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeserializedContainerAbiStability[] $VALUES;
    public static final DeserializedContainerAbiStability STABLE = new DeserializedContainerAbiStability("STABLE", 0);
    public static final DeserializedContainerAbiStability UNSTABLE = new DeserializedContainerAbiStability("UNSTABLE", 1);

    private static final /* synthetic */ DeserializedContainerAbiStability[] $values() {
        return new DeserializedContainerAbiStability[]{STABLE, UNSTABLE};
    }

    static {
        DeserializedContainerAbiStability[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DeserializedContainerAbiStability(String str, int i) {
    }

    public static DeserializedContainerAbiStability valueOf(String str) {
        return (DeserializedContainerAbiStability) Enum.valueOf(DeserializedContainerAbiStability.class, str);
    }

    public static DeserializedContainerAbiStability[] values() {
        return (DeserializedContainerAbiStability[]) $VALUES.clone();
    }
}
