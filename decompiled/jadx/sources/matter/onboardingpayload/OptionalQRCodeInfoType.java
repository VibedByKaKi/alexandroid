package matter.onboardingpayload;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lmatter/onboardingpayload/OptionalQRCodeInfoType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNKNOWN", "TYPE_STRING", "TYPE_INT32", "TYPE_INT64", "TYPE_UINT32", "TYPE_UINT64", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OptionalQRCodeInfoType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionalQRCodeInfoType[] $VALUES;
    public static final OptionalQRCodeInfoType TYPE_UNKNOWN = new OptionalQRCodeInfoType("TYPE_UNKNOWN", 0);
    public static final OptionalQRCodeInfoType TYPE_STRING = new OptionalQRCodeInfoType("TYPE_STRING", 1);
    public static final OptionalQRCodeInfoType TYPE_INT32 = new OptionalQRCodeInfoType("TYPE_INT32", 2);
    public static final OptionalQRCodeInfoType TYPE_INT64 = new OptionalQRCodeInfoType("TYPE_INT64", 3);
    public static final OptionalQRCodeInfoType TYPE_UINT32 = new OptionalQRCodeInfoType("TYPE_UINT32", 4);
    public static final OptionalQRCodeInfoType TYPE_UINT64 = new OptionalQRCodeInfoType("TYPE_UINT64", 5);

    private static final /* synthetic */ OptionalQRCodeInfoType[] $values() {
        return new OptionalQRCodeInfoType[]{TYPE_UNKNOWN, TYPE_STRING, TYPE_INT32, TYPE_INT64, TYPE_UINT32, TYPE_UINT64};
    }

    static {
        OptionalQRCodeInfoType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private OptionalQRCodeInfoType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<OptionalQRCodeInfoType> getEntries() {
        return $ENTRIES;
    }

    public static OptionalQRCodeInfoType valueOf(String str) {
        return (OptionalQRCodeInfoType) Enum.valueOf(OptionalQRCodeInfoType.class, str);
    }

    public static OptionalQRCodeInfoType[] values() {
        return (OptionalQRCodeInfoType[]) $VALUES.clone();
    }
}
