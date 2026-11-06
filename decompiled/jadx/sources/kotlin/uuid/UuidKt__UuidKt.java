package kotlin.uuid;

import com.amazon.alexa.apl.handler.event.LoadIndexListDataEventHandler;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.HexExtensionsKt;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a,\u0010\b\u001a\u00020\t*\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0001\u001a\u0014\u0010\u000e\u001a\u00020\t*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000fH\u0001\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000fH\u0001\u001a\u0019\u0010\u0016\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u0018\u001a\u0019\u0010\u0016\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u0018¨\u0006\u001a"}, d2 = {"uuidFromRandomBytes", "Lkotlin/uuid/Uuid;", "randomBytes", "", "getLongAtCommonImpl", "", "index", "", "formatBytesIntoCommonImpl", "", "dst", "dstOffset", LoadIndexListDataEventHandler.START_INDEX_KEY, "endIndex", "checkHyphenAt", "", "setLongAtCommonImpl", "value", "uuidParseHexDashCommonImpl", "hexDashString", "uuidParseHexCommonImpl", "hexString", "truncateForErrorMessage", "maxLength", "truncateForErrorMessage$UuidKt__UuidKt", "maxSize", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/uuid/UuidKt")
@SourceDebugExtension({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/UuidKt__UuidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,648:1\n1#2:649\n*E\n"})
/* loaded from: classes10.dex */
class UuidKt__UuidKt extends UuidKt__UuidJVMKt {
    public static final void checkHyphenAt(@NotNull String str, int i) {
        str.getClass();
        if (str.charAt(i) == '-') {
            return;
        }
        StringBuilder m0m = a$$ExternalSyntheticOutline0.m0m(i, "Expected '-' (hyphen) at index ", ", but was '");
        m0m.append(str.charAt(i));
        m0m.append('\'');
        throw new IllegalArgumentException(m0m.toString().toString());
    }

    @ExperimentalUuidApi
    public static final void formatBytesIntoCommonImpl(long j, @NotNull byte[] bArr, int i, int i2, int i3) {
        bArr.getClass();
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = HexExtensionsKt.getBYTE_TO_LOWER_CASE_HEX_DIGITS()[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final long getLongAtCommonImpl(@NotNull byte[] bArr, int i) {
        bArr.getClass();
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    public static final void setLongAtCommonImpl(@NotNull byte[] bArr, int i, long j) {
        bArr.getClass();
        int i2 = 7;
        while (-1 < i2) {
            bArr[i] = (byte) (j >> (i2 << 3));
            i2--;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage$UuidKt__UuidKt(String str, int i) {
        return str.length() <= i ? str : str.substring(0, i).concat("...");
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid uuidFromRandomBytes(@NotNull byte[] bArr) {
        bArr.getClass();
        byte b = (byte) (bArr[6] & 15);
        bArr[6] = b;
        bArr[6] = (byte) (b | 64);
        byte b2 = (byte) (bArr[8] & Utf8.REPLACEMENT_BYTE);
        bArr[8] = b2;
        bArr[8] = (byte) (b2 | 128);
        return Uuid.Companion.fromByteArray(bArr);
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid uuidParseHexCommonImpl(@NotNull String str) {
        str.getClass();
        return Uuid.Companion.fromLongs(HexExtensionsKt.hexToLong$default(str, 0, 16, null, 4, null), HexExtensionsKt.hexToLong$default(str, 16, 32, null, 4, null));
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid uuidParseHexDashCommonImpl(@NotNull String str) {
        str.getClass();
        long hexToLong$default = HexExtensionsKt.hexToLong$default(str, 0, 8, null, 4, null);
        checkHyphenAt(str, 8);
        long hexToLong$default2 = HexExtensionsKt.hexToLong$default(str, 9, 13, null, 4, null);
        checkHyphenAt(str, 13);
        long hexToLong$default3 = HexExtensionsKt.hexToLong$default(str, 14, 18, null, 4, null);
        checkHyphenAt(str, 18);
        long hexToLong$default4 = HexExtensionsKt.hexToLong$default(str, 19, 23, null, 4, null);
        checkHyphenAt(str, 23);
        return Uuid.Companion.fromLongs((hexToLong$default << 32) | (hexToLong$default2 << 16) | hexToLong$default3, (hexToLong$default4 << 48) | HexExtensionsKt.hexToLong$default(str, 24, 36, null, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage$UuidKt__UuidKt(byte[] bArr, int i) {
        return ArraysKt.joinToString$default(bArr, null, MarkdownConstants.LEFT_BRACKET, MarkdownConstants.RIGHT_BRACKET, i, null, 49);
    }
}
