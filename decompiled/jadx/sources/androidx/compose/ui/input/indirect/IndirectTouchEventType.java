package androidx.compose.ui.input.indirect;

import androidx.compose.ui.ExperimentalIndirectTouchTypeApi;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ExperimentalIndirectTouchTypeApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectTouchEventType;", "", "value", "", "constructor-impl", "(I)I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes13.dex */
public final class IndirectTouchEventType {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int Unknown = m5475constructorimpl(0);
    private static final int Press = m5475constructorimpl(1);
    private static final int Release = m5475constructorimpl(2);
    private static final int Move = m5475constructorimpl(3);

    private /* synthetic */ IndirectTouchEventType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IndirectTouchEventType m5474boximpl(int i) {
        return new IndirectTouchEventType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5476equalsimpl(int i, Object obj) {
        return (obj instanceof IndirectTouchEventType) && i == ((IndirectTouchEventType) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5477equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5478hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5479toStringimpl(int i) {
        return m5477equalsimpl0(i, Press) ? "Press" : m5477equalsimpl0(i, Release) ? "Release" : m5477equalsimpl0(i, Move) ? "Move" : "Unknown";
    }

    public boolean equals(Object other) {
        return m5476equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m5478hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m5479toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @ExperimentalIndirectTouchTypeApi
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectTouchEventType$Companion;", "", "<init>", "()V", "Unknown", "Landroidx/compose/ui/input/indirect/IndirectTouchEventType;", "getUnknown-LxEHWp8", "()I", "I", "Press", "getPress-LxEHWp8", "Release", "getRelease-LxEHWp8", "Move", "getMove-LxEHWp8", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getMove-LxEHWp8, reason: not valid java name */
        public final int m5481getMoveLxEHWp8() {
            return IndirectTouchEventType.Move;
        }

        /* renamed from: getPress-LxEHWp8, reason: not valid java name */
        public final int m5482getPressLxEHWp8() {
            return IndirectTouchEventType.Press;
        }

        /* renamed from: getRelease-LxEHWp8, reason: not valid java name */
        public final int m5483getReleaseLxEHWp8() {
            return IndirectTouchEventType.Release;
        }

        /* renamed from: getUnknown-LxEHWp8, reason: not valid java name */
        public final int m5484getUnknownLxEHWp8() {
            return IndirectTouchEventType.Unknown;
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5475constructorimpl(int i) {
        return i;
    }
}
