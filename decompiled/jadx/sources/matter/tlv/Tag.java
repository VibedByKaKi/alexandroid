package matter.tlv;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.apl.handler.event.LoadIndexListDataEventHandler;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lmatter/tlv/Tag;", "", "<init>", "()V", "size", "", "getSize", "()I", "Companion", "Lmatter/tlv/AnonymousTag;", "Lmatter/tlv/CommonProfileTag;", "Lmatter/tlv/ContextSpecificTag;", "Lmatter/tlv/FullyQualifiedTag;", "Lmatter/tlv/ImplicitProfileTag;", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class Tag {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ Tag(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int getSize();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005J \u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lmatter/tlv/Tag$Companion;", "", "<init>", "()V", "from", "Lmatter/tlv/Tag;", "controlByte", "", LoadIndexListDataEventHandler.START_INDEX_KEY, "", "bytes", "", "encode", "encodedType", "tag", "checkBytes", "expectedBytes", "actualBytes", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final byte[] checkBytes(int startIndex, int expectedBytes, byte[] actualBytes) {
            int length = actualBytes.length - startIndex;
            if (expectedBytes <= length) {
                return ArraysKt.sliceArray(actualBytes, RangesKt.until(startIndex, expectedBytes + startIndex));
            }
            Buffer$$ExternalSyntheticBUOutline0.m(startIndex, ErrorUtils$$ExternalSyntheticOutline0.m29m(expectedBytes, length, "Invalid tag: Expected ", " but only ", " bytes available at "));
            return null;
        }

        @NotNull
        public final byte[] encode(byte encodedType, @NotNull Tag tag) {
            byte b;
            byte[] plus;
            tag.getClass();
            boolean z = tag instanceof AnonymousTag;
            if (z) {
                b = 0;
            } else if (tag instanceof ContextSpecificTag) {
                b = 32;
            } else if (tag instanceof CommonProfileTag) {
                b = ((CommonProfileTag) tag).getSize() == 2 ? (byte) 64 : (byte) 96;
            } else if (tag instanceof ImplicitProfileTag) {
                b = ((ImplicitProfileTag) tag).getSize() == 2 ? Byte.MIN_VALUE : (byte) -96;
            } else {
                if (!(tag instanceof FullyQualifiedTag)) {
                    PathKt$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                b = ((FullyQualifiedTag) tag).getSize() == 6 ? (byte) -64 : (byte) -32;
            }
            byte b2 = (byte) (encodedType | b);
            if (z) {
                plus = new byte[0];
            } else if (tag instanceof ContextSpecificTag) {
                ContextSpecificTag contextSpecificTag = (ContextSpecificTag) tag;
                if (Integer.compareUnsigned(UInt.m25389constructorimpl(contextSpecificTag.getTagNumber()), UInt.m25389constructorimpl(255)) > 0) {
                    Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(contextSpecificTag.getTagNumber(), "Invalid tag value ", " for context specific tag"));
                    return null;
                }
                plus = new byte[]{(byte) contextSpecificTag.getTagNumber()};
            } else if (tag instanceof CommonProfileTag) {
                CommonProfileTag commonProfileTag = (CommonProfileTag) tag;
                plus = UtilsKt.m27025toByteArrayLittleEndianqim9Vi0(commonProfileTag.m27002getTagNumberpVg5ArA(), (short) commonProfileTag.getSize());
            } else if (tag instanceof ImplicitProfileTag) {
                ImplicitProfileTag implicitProfileTag = (ImplicitProfileTag) tag;
                plus = UtilsKt.m27025toByteArrayLittleEndianqim9Vi0(implicitProfileTag.m27014getTagNumberpVg5ArA(), (short) implicitProfileTag.getSize());
            } else {
                if (!(tag instanceof FullyQualifiedTag)) {
                    PathKt$$ExternalSyntheticBUOutline0.m();
                    return null;
                }
                FullyQualifiedTag fullyQualifiedTag = (FullyQualifiedTag) tag;
                plus = ArraysKt.plus(ArraysKt.plus(UtilsKt.m27026toByteArrayLittleEndianvckuEUM(fullyQualifiedTag.m27010getVendorIdMh2AYeg(), (short) 2), UtilsKt.m27026toByteArrayLittleEndianvckuEUM(fullyQualifiedTag.m27008getProfileNumberMh2AYeg(), (short) 2)), UtilsKt.m27025toByteArrayLittleEndianqim9Vi0(fullyQualifiedTag.m27009getTagNumberpVg5ArA(), (short) (fullyQualifiedTag.getSize() - 4)));
            }
            return ArraysKt.plus(new byte[]{b2}, plus);
        }

        @NotNull
        public final Tag from(byte controlByte, int startIndex, @NotNull byte[] bytes) {
            bytes.getClass();
            byte b = (byte) (controlByte & (-32));
            if (b == 0) {
                return AnonymousTag.INSTANCE;
            }
            if (b == 32) {
                return new ContextSpecificTag(UByte.m25312constructorimpl(ArraysKt.first(checkBytes(startIndex, 1, bytes))) & 255);
            }
            int i = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (b == 64) {
                return new CommonProfileTag(i, UInt.m25389constructorimpl((int) UtilsKt.fromLittleEndianToLong$default(checkBytes(startIndex, 2, bytes), false, 1, null)), defaultConstructorMarker);
            }
            int i2 = 4;
            if (b == 96) {
                return new CommonProfileTag(i2, UInt.m25389constructorimpl((int) UtilsKt.fromLittleEndianToLong$default(checkBytes(startIndex, 4, bytes), false, 1, null)), defaultConstructorMarker);
            }
            if (b == Byte.MIN_VALUE) {
                return new ImplicitProfileTag(i, UInt.m25389constructorimpl((int) UtilsKt.fromLittleEndianToLong$default(checkBytes(startIndex, 2, bytes), false, 1, null)), defaultConstructorMarker);
            }
            if (b == -96) {
                return new ImplicitProfileTag(i2, UInt.m25389constructorimpl((int) UtilsKt.fromLittleEndianToLong$default(checkBytes(startIndex, 4, bytes), false, 1, null)), defaultConstructorMarker);
            }
            if (b == -64) {
                return new FullyQualifiedTag(6, UShort.m25575constructorimpl((short) UtilsKt.fromLittleEndianToLong$default(checkBytes(startIndex, 2, bytes), false, 1, null)), UShort.m25575constructorimpl((short) UtilsKt.fromLittleEndianToLong$default(checkBytes(startIndex + 2, 2, bytes), false, 1, null)), UInt.m25389constructorimpl((int) UtilsKt.fromLittleEndianToLong$default(checkBytes(startIndex + 4, 2, bytes), false, 1, null)), null);
            }
            if (b == -32) {
                return new FullyQualifiedTag(8, UShort.m25575constructorimpl((short) UtilsKt.fromLittleEndianToLong$default(checkBytes(startIndex, 2, bytes), false, 1, null)), UShort.m25575constructorimpl((short) UtilsKt.fromLittleEndianToLong$default(checkBytes(startIndex + 2, 2, bytes), false, 1, null)), UInt.m25389constructorimpl((int) UtilsKt.fromLittleEndianToLong$default(checkBytes(startIndex + 4, 4, bytes), false, 1, null)), null);
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(controlByte, "Invalid control byte "));
            return null;
        }

        private Companion() {
        }
    }

    private Tag() {
    }
}
