package androidx.compose.ui.layout;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0012\u0010\u000e\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0012\u0010\u0010\u001a\u00020\t8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b\u0088\u0001\u0002¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/layout/ValueInsets;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue", "()J", "left", "", "getLeft-impl", "(J)I", "top", "getTop-impl", "right", "getRight-impl", "bottom", "getBottom-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nValueInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueInsets.android.kt\nandroidx/compose/ui/layout/ValueInsets\n*L\n1#1,67:1\n28#1,10:68\n*S KotlinDebug\n*F\n+ 1 ValueInsets.android.kt\nandroidx/compose/ui/layout/ValueInsets\n*L\n40#1:68,10\n*E\n"})
/* loaded from: classes13.dex */
public final class ValueInsets {
    private final long packedValue;

    private /* synthetic */ ValueInsets(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ValueInsets m6178boximpl(long j) {
        return new ValueInsets(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6180equalsimpl(long j, Object obj) {
        return (obj instanceof ValueInsets) && j == ((ValueInsets) obj).m6188unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6181equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m6182getBottomimpl(long j) {
        return (int) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* renamed from: getLeft-impl, reason: not valid java name */
    public static final int m6183getLeftimpl(long j) {
        return (int) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* renamed from: getRight-impl, reason: not valid java name */
    public static final int m6184getRightimpl(long j) {
        return (int) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m6185getTopimpl(long j) {
        return (int) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6186hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6187toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("ValueInsets(");
        sb.append((int) ((j >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb.append(", ");
        sb.append((int) ((j >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb.append(", ");
        sb.append((int) ((j >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        sb.append(", ");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, (int) (j & WebSocketProtocol.PAYLOAD_SHORT_MAX), ')');
    }

    public boolean equals(Object obj) {
        return m6180equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m6186hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m6187toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6188unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6179constructorimpl(long j) {
        return j;
    }
}
