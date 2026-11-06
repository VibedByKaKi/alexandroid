package matter.tlv;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0010¢\u0006\u0002\b\nJ\r\u0010\u000b\u001a\u00020\fH\u0010¢\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lmatter/tlv/IntValue;", "Lmatter/tlv/Value;", "value", "", "<init>", "(J)V", "getValue", "()J", "toType", "Lmatter/tlv/SignedIntType;", "toType$AlexaMobileAndroidMatter_release", "encode", "", "encode$AlexaMobileAndroidMatter_release", "toAny", "()Ljava/lang/Long;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class IntValue extends Value {
    private final long value;

    public IntValue(long j) {
        super(null);
        this.value = j;
    }

    public static /* synthetic */ IntValue copy$default(IntValue intValue, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = intValue.value;
        }
        return intValue.copy(j);
    }

    /* renamed from: component1, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    @NotNull
    public final IntValue copy(long value) {
        return new IntValue(value);
    }

    @Override // matter.tlv.Value
    @NotNull
    public byte[] encode$AlexaMobileAndroidMatter_release() {
        return UtilsKt.toByteArrayLittleEndian(Long.valueOf(this.value), toType$AlexaMobileAndroidMatter_release().getValueSize());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IntValue) && this.value == ((IntValue) other).value;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }

    @Override // matter.tlv.Value
    @NotNull
    public Long toAny() {
        return Long.valueOf(this.value);
    }

    @NotNull
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m("IntValue(value=", this.value, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @Override // matter.tlv.Value
    @NotNull
    public SignedIntType toType$AlexaMobileAndroidMatter_release() {
        return new SignedIntType(UtilsKt.signedIntSize(this.value));
    }
}
