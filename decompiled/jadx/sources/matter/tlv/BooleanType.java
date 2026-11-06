package matter.tlv;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lmatter/tlv/BooleanType;", "Lmatter/tlv/Type;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "encode", "", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BooleanType extends Type {
    private final boolean value;

    public BooleanType(boolean z) {
        super((short) 0, (short) 0, null);
        this.value = z;
    }

    @Override // matter.tlv.Type
    public byte encode() {
        return this.value ? (byte) 9 : (byte) 8;
    }

    public final boolean getValue() {
        return this.value;
    }
}
