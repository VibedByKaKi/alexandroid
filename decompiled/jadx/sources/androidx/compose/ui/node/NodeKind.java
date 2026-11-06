package androidx.compose.ui.node;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00020\u00042\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0086\f¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0086\f¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0003¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/NodeKind;", ExifInterface.GPS_DIRECTION_TRUE, "", "mask", "", "constructor-impl", "(I)I", "getMask", "()I", "or", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "or-H91voCI", "(II)I", "or-impl", "equals", "", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes13.dex */
public final class NodeKind<T> {
    private final int mask;

    private /* synthetic */ NodeKind(int i) {
        this.mask = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NodeKind m6361boximpl(int i) {
        return new NodeKind(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6363equalsimpl(int i, Object obj) {
        return (obj instanceof NodeKind) && i == ((NodeKind) obj).m6369unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6364equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6365hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: or-H91voCI, reason: not valid java name */
    public static final int m6366orH91voCI(int i, int i2) {
        return i | i2;
    }

    /* renamed from: or-impl, reason: not valid java name */
    public static final int m6367orimpl(int i, int i2) {
        return i | i2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6368toStringimpl(int i) {
        return ArcMode$$ExternalSyntheticOutline0.m("NodeKind(mask=", i, ')');
    }

    public boolean equals(Object other) {
        return m6363equalsimpl(this.mask, other);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m6365hashCodeimpl(this.mask);
    }

    public String toString() {
        return m6368toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6369unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m6362constructorimpl(int i) {
        return i;
    }
}
