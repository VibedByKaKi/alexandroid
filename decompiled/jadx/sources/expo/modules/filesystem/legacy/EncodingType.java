package expo.modules.filesystem.legacy;

import com.ReactNativeBlobUtil.ReactNativeBlobUtilConst;
import com.amazon.coral.util.security.MessageDigestHelper;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/filesystem/legacy/EncodingType;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UTF8", MessageDigestHelper.BASE64_ENCODING, "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EncodingType implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EncodingType[] $VALUES;

    @NotNull
    private final String value;
    public static final EncodingType UTF8 = new EncodingType("UTF8", 0, ReactNativeBlobUtilConst.RNFB_RESPONSE_UTF8);
    public static final EncodingType BASE64 = new EncodingType(MessageDigestHelper.BASE64_ENCODING, 1, ReactNativeBlobUtilConst.RNFB_RESPONSE_BASE64);

    private static final /* synthetic */ EncodingType[] $values() {
        return new EncodingType[]{UTF8, BASE64};
    }

    static {
        EncodingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private EncodingType(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<EncodingType> getEntries() {
        return $ENTRIES;
    }

    public static EncodingType valueOf(String str) {
        return (EncodingType) Enum.valueOf(EncodingType.class, str);
    }

    public static EncodingType[] values() {
        return (EncodingType[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
