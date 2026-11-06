package matter.tlv;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0010¢\u0006\u0002\b\nJ\r\u0010\u000b\u001a\u00020\fH\u0010¢\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, d2 = {"Lmatter/tlv/BooleanValue;", "Lmatter/tlv/Value;", "value", "", "<init>", "(Z)V", "getValue", "()Z", "toType", "Lmatter/tlv/BooleanType;", "toType$AlexaMobileAndroidMatter_release", "encode", "", "encode$AlexaMobileAndroidMatter_release", "toAny", "()Ljava/lang/Boolean;", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class BooleanValue extends Value {
    private final boolean value;

    public BooleanValue(boolean z) {
        super(null);
        this.value = z;
    }

    public static /* synthetic */ BooleanValue copy$default(BooleanValue booleanValue, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = booleanValue.value;
        }
        return booleanValue.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    @NotNull
    public final BooleanValue copy(boolean value) {
        return new BooleanValue(value);
    }

    @Override // matter.tlv.Value
    @NotNull
    public byte[] encode$AlexaMobileAndroidMatter_release() {
        return new byte[0];
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BooleanValue) && this.value == ((BooleanValue) other).value;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.value);
    }

    @Override // matter.tlv.Value
    @NotNull
    public Boolean toAny() {
        return Boolean.valueOf(this.value);
    }

    @NotNull
    public String toString() {
        return Automotive$$ExternalSyntheticOutline0.m("BooleanValue(value=", MarkdownConstants.RIGHT_PARENTHESIS, this.value);
    }

    @Override // matter.tlv.Value
    @NotNull
    public BooleanType toType$AlexaMobileAndroidMatter_release() {
        return new BooleanType(this.value);
    }
}
