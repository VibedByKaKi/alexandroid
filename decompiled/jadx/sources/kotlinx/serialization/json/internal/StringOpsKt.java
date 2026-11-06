package kotlinx.serialization.json.internal;

import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0010\u001a\u00020\u0011*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0000\u001a\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u0006H\u0000¢\u0006\u0002\u0010\u0017\"&\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000b\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"toHexChar", "", "i", "", "ESCAPE_STRINGS", "", "", "getESCAPE_STRINGS$annotations", "()V", "getESCAPE_STRINGS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "ESCAPE_MARKERS", "", "getESCAPE_MARKERS", "()[B", "printQuoted", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "toBooleanStrictOrNull", "", "(Ljava/lang/String;)Ljava/lang/Boolean;", "kotlinx-serialization-json"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StringOpsKt {

    @NotNull
    private static final byte[] ESCAPE_MARKERS;

    @NotNull
    private static final String[] ESCAPE_STRINGS;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + toHexChar(i >> 12) + toHexChar(i >> 8) + toHexChar(i >> 4) + toHexChar(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        ESCAPE_STRINGS = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = 34;
        bArr[92] = JsonWriter.ESCAPE;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        ESCAPE_MARKERS = bArr;
    }

    @NotNull
    public static final byte[] getESCAPE_MARKERS() {
        return ESCAPE_MARKERS;
    }

    @NotNull
    public static final String[] getESCAPE_STRINGS() {
        return ESCAPE_STRINGS;
    }

    public static final void printQuoted(@NotNull StringBuilder sb, @NotNull String str) {
        sb.getClass();
        str.getClass();
        sb.append('\"');
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            String[] strArr = ESCAPE_STRINGS;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) str, i, i2);
                sb.append(strArr[charAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    @Nullable
    public static final Boolean toBooleanStrictOrNull(@NotNull String str) {
        str.getClass();
        if (StringsKt.equals(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (StringsKt.equals(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static final char toHexChar(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }

    @JsonFriendModuleApi
    public static /* synthetic */ void getESCAPE_STRINGS$annotations() {
    }
}
