package matter.tlv;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmatter/tlv/AnonymousTag;", "Lmatter/tlv/Tag;", "<init>", "()V", "size", "", "getSize", "()I", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AnonymousTag extends Tag {

    @NotNull
    public static final AnonymousTag INSTANCE = new AnonymousTag();
    private static final int size = 0;

    private AnonymousTag() {
        super(null);
    }

    @Override // matter.tlv.Tag
    public int getSize() {
        return size;
    }
}
