package expo.modules.filesystem;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/filesystem/PickerType;", "", "<init>", "(Ljava/lang/String;I)V", "FILE", "DIRECTORY", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PickerType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PickerType[] $VALUES;
    public static final PickerType FILE = new PickerType("FILE", 0);
    public static final PickerType DIRECTORY = new PickerType("DIRECTORY", 1);

    private static final /* synthetic */ PickerType[] $values() {
        return new PickerType[]{FILE, DIRECTORY};
    }

    static {
        PickerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PickerType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PickerType> getEntries() {
        return $ENTRIES;
    }

    public static PickerType valueOf(String str) {
        return (PickerType) Enum.valueOf(PickerType.class, str);
    }

    public static PickerType[] values() {
        return (PickerType[]) $VALUES.clone();
    }
}
