package matter.tlv;

import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\n\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lmatter/tlv/Type;", "", "lengthSize", "", "valueSize", "<init>", "(SS)V", "getLengthSize", "()S", "getValueSize", "encode", "", "Companion", "Lmatter/tlv/ArrayType;", "Lmatter/tlv/BooleanType;", "Lmatter/tlv/ByteStringType;", "Lmatter/tlv/DoubleType;", "Lmatter/tlv/EndOfContainerType;", "Lmatter/tlv/FloatType;", "Lmatter/tlv/ListType;", "Lmatter/tlv/NullType;", "Lmatter/tlv/SignedIntType;", "Lmatter/tlv/StructureType;", "Lmatter/tlv/UnsignedIntType;", "Lmatter/tlv/Utf8StringType;", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class Type {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final short lengthSize;
    private final short valueSize;

    private Type(short s, short s2) {
        this.lengthSize = s;
        this.valueSize = s2;
    }

    public abstract byte encode();

    public final short getLengthSize() {
        return this.lengthSize;
    }

    public final short getValueSize() {
        return this.valueSize;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t*\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002¨\u0006\u000e"}, d2 = {"Lmatter/tlv/Type$Companion;", "", "<init>", "()V", "from", "Lmatter/tlv/Type;", "controlByte", "", "toBinaryString", "", "kotlin.jvm.PlatformType", "extractSize", "", "byte", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final short extractSize(byte r2) {
            byte b = (byte) (r2 & 3);
            if (b == 0) {
                return (short) 1;
            }
            if (b == 1) {
                return (short) 2;
            }
            return b == 2 ? (short) 4 : (short) 8;
        }

        private final String toBinaryString(byte b) {
            return Integer.toBinaryString(b & 255);
        }

        @NotNull
        public final Type from(byte controlByte) {
            byte b = (byte) (controlByte & 28);
            if (b != 0 && b != 4 && b != 12 && b != 16) {
                b = (byte) (controlByte & 31);
            }
            if (b == 0) {
                return new SignedIntType(extractSize(controlByte));
            }
            if (b == 4) {
                return new UnsignedIntType(extractSize(controlByte));
            }
            if (b == 12) {
                return new Utf8StringType(extractSize(controlByte));
            }
            if (b == 16) {
                return new ByteStringType(extractSize(controlByte));
            }
            if (b == 8) {
                return new BooleanType(false);
            }
            if (b == 9) {
                return new BooleanType(true);
            }
            if (b == 10) {
                return new FloatType();
            }
            if (b == 11) {
                return new DoubleType();
            }
            if (b == 20) {
                return new NullType();
            }
            if (b == 21) {
                return new StructureType();
            }
            if (b == 22) {
                return new ArrayType();
            }
            if (b == 23) {
                return new ListType();
            }
            if (b == 24) {
                return EndOfContainerType.INSTANCE;
            }
            Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Unexpected control byte ", toBinaryString(b)));
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Type(short s, short s2, DefaultConstructorMarker defaultConstructorMarker) {
        this(s, s2);
    }
}
