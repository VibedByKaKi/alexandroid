package matter.tlv;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0013"}, d2 = {"Lmatter/tlv/ContextSpecificTag;", "Lmatter/tlv/Tag;", "tagNumber", "", "<init>", "(I)V", "getTagNumber", "()I", "size", "getSize", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ContextSpecificTag extends Tag {
    private final int size;
    private final int tagNumber;

    public ContextSpecificTag(int i) {
        super(null);
        this.tagNumber = i;
        this.size = 1;
    }

    public static /* synthetic */ ContextSpecificTag copy$default(ContextSpecificTag contextSpecificTag, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contextSpecificTag.tagNumber;
        }
        return contextSpecificTag.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTagNumber() {
        return this.tagNumber;
    }

    @NotNull
    public final ContextSpecificTag copy(int tagNumber) {
        return new ContextSpecificTag(tagNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContextSpecificTag) && this.tagNumber == ((ContextSpecificTag) other).tagNumber;
    }

    @Override // matter.tlv.Tag
    public int getSize() {
        return this.size;
    }

    public final int getTagNumber() {
        return this.tagNumber;
    }

    public int hashCode() {
        return Integer.hashCode(this.tagNumber);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m(this.tagNumber, "ContextSpecificTag(tagNumber=", MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
