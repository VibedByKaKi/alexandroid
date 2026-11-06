package matter.tlv;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0010¢\u0006\u0002\b\u0006J\r\u0010\u0007\u001a\u00020\bH\u0010¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Lmatter/tlv/EndOfContainerValue;", "Lmatter/tlv/Value;", "<init>", "()V", "toType", "Lmatter/tlv/EndOfContainerType;", "toType$AlexaMobileAndroidMatter_release", "encode", "", "encode$AlexaMobileAndroidMatter_release", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EndOfContainerValue extends Value {

    @NotNull
    public static final EndOfContainerValue INSTANCE = new EndOfContainerValue();

    private EndOfContainerValue() {
        super(null);
    }

    @Override // matter.tlv.Value
    @NotNull
    public byte[] encode$AlexaMobileAndroidMatter_release() {
        return new byte[0];
    }

    @Override // matter.tlv.Value
    @NotNull
    public EndOfContainerType toType$AlexaMobileAndroidMatter_release() {
        return EndOfContainerType.INSTANCE;
    }
}
