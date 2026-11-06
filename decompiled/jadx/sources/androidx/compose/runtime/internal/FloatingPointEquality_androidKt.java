package androidx.compose.runtime.internal;

import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0080\b\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0005¨\u0006\b"}, d2 = {"isNan", "", "", "(F)Z", "", "(D)Z", "equalsWithNanFix", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, SmartFragmentContent.RUNTIME}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FloatingPointEquality_androidKt {
    public static final boolean equalsWithNanFix(double d, double d2) {
        return d == d2;
    }

    public static final boolean isNan(double d) {
        return (Double.doubleToRawLongBits(d) & Long.MAX_VALUE) > 9218868437227405312L;
    }

    public static final boolean equalsWithNanFix(float f, float f2) {
        return f == f2;
    }

    public static final boolean isNan(float f) {
        return (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) > 2139095040;
    }
}
