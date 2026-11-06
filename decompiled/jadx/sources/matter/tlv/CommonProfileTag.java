package matter.tlv;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lmatter/tlv/CommonProfileTag;", "Lmatter/tlv/Tag;", "size", "", "tagNumber", "Lkotlin/UInt;", "<init>", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getSize", "()I", "getTagNumber-pVg5ArA", "I", "component1", "component2", "component2-pVg5ArA", "copy", "copy-Qn1smSk", "(II)Lmatter/tlv/CommonProfileTag;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CommonProfileTag extends Tag {
    private final int size;
    private final int tagNumber;

    private CommonProfileTag(int i, int i2) {
        super(null);
        this.size = i;
        this.tagNumber = i2;
    }

    /* renamed from: copy-Qn1smSk$default, reason: not valid java name */
    public static /* synthetic */ CommonProfileTag m26999copyQn1smSk$default(CommonProfileTag commonProfileTag, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = commonProfileTag.size;
        }
        if ((i3 & 2) != 0) {
            i2 = commonProfileTag.tagNumber;
        }
        return commonProfileTag.m27001copyQn1smSk(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component2-pVg5ArA, reason: not valid java name and from getter */
    public final int getTagNumber() {
        return this.tagNumber;
    }

    @NotNull
    /* renamed from: copy-Qn1smSk, reason: not valid java name */
    public final CommonProfileTag m27001copyQn1smSk(int size, int tagNumber) {
        return new CommonProfileTag(size, tagNumber, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonProfileTag)) {
            return false;
        }
        CommonProfileTag commonProfileTag = (CommonProfileTag) other;
        return this.size == commonProfileTag.size && this.tagNumber == commonProfileTag.tagNumber;
    }

    @Override // matter.tlv.Tag
    public int getSize() {
        return this.size;
    }

    /* renamed from: getTagNumber-pVg5ArA, reason: not valid java name */
    public final int m27002getTagNumberpVg5ArA() {
        return this.tagNumber;
    }

    public int hashCode() {
        return UInt.m25401hashCodeimpl(this.tagNumber) + (Integer.hashCode(this.size) * 31);
    }

    @NotNull
    public String toString() {
        return DoubleList$$ExternalSyntheticOutline0.m("CommonProfileTag(size=", this.size, ", tagNumber=", UInt.m25435toStringimpl(this.tagNumber), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ CommonProfileTag(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }
}
