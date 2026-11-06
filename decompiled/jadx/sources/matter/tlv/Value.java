package matter.tlv;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H ¢\u0006\u0002\b\u0006J\r\u0010\u0007\u001a\u00020\bH ¢\u0006\u0002\b\tJ\n\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0016\u0082\u0001\f\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lmatter/tlv/Value;", "", "<init>", "()V", "toType", "Lmatter/tlv/Type;", "toType$AlexaMobileAndroidMatter_release", "encode", "", "encode$AlexaMobileAndroidMatter_release", "toAny", "Lmatter/tlv/ArrayValue;", "Lmatter/tlv/BooleanValue;", "Lmatter/tlv/ByteStringValue;", "Lmatter/tlv/DoubleValue;", "Lmatter/tlv/EndOfContainerValue;", "Lmatter/tlv/FloatValue;", "Lmatter/tlv/IntValue;", "Lmatter/tlv/ListValue;", "Lmatter/tlv/NullValue;", "Lmatter/tlv/StructureValue;", "Lmatter/tlv/UnsignedIntValue;", "Lmatter/tlv/Utf8StringValue;", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class Value {
    public /* synthetic */ Value(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract byte[] encode$AlexaMobileAndroidMatter_release();

    @Nullable
    public Object toAny() {
        return null;
    }

    @NotNull
    public abstract Type toType$AlexaMobileAndroidMatter_release();

    private Value() {
    }
}
