package kotlin.reflect.jvm.internal.impl.descriptors;

import com.amazon.deecomms.calling.incallcommands.constants.CommsFocusConstants;
import com.amazon.leapfrogmapgl.indoor.RoadProbe;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class ClassKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ClassKind[] $VALUES;

    @Nullable
    private final String codeRepresentation;
    public static final ClassKind CLASS = new ClassKind("CLASS", 0, RoadProbe.CLASS_PROPERTY);
    public static final ClassKind INTERFACE = new ClassKind("INTERFACE", 1, CommsFocusConstants.INTERFACE);
    public static final ClassKind ENUM_CLASS = new ClassKind("ENUM_CLASS", 2, "enum class");
    public static final ClassKind ENUM_ENTRY = new ClassKind("ENUM_ENTRY", 3, null);
    public static final ClassKind ANNOTATION_CLASS = new ClassKind("ANNOTATION_CLASS", 4, "annotation class");
    public static final ClassKind OBJECT = new ClassKind("OBJECT", 5, "object");

    private static final /* synthetic */ ClassKind[] $values() {
        return new ClassKind[]{CLASS, INTERFACE, ENUM_CLASS, ENUM_ENTRY, ANNOTATION_CLASS, OBJECT};
    }

    static {
        ClassKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ClassKind(String str, int i, String str2) {
        this.codeRepresentation = str2;
    }

    public static ClassKind valueOf(String str) {
        return (ClassKind) Enum.valueOf(ClassKind.class, str);
    }

    public static ClassKind[] values() {
        return (ClassKind[]) $VALUES.clone();
    }

    public final boolean isSingleton() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
