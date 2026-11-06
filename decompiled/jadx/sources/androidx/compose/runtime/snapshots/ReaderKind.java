package androidx.compose.runtime.snapshots;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081@\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind;", "", "mask", "", "constructor-impl", "(I)I", "getMask", "()I", "withReadIn", "reader", "withReadIn-3QSx2Dw", "(II)I", "isReadIn", "", "isReadIn-h_f27i8", "(II)Z", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "Companion", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes13.dex */
public final class ReaderKind {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int mask;

    private /* synthetic */ ReaderKind(int i) {
        this.mask = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m4102boximpl(int i) {
        return new ReaderKind(i);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m4104constructorimpl$default(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m4103constructorimpl(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4105equalsimpl(int i, Object obj) {
        return (obj instanceof ReaderKind) && i == ((ReaderKind) obj).m4111unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4106equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4107hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m4108isReadInh_f27i8(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4109toStringimpl(int i) {
        return ArcMode$$ExternalSyntheticOutline0.m("ReaderKind(mask=", i, ')');
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m4110withReadIn3QSx2Dw(int i, int i2) {
        return m4103constructorimpl(i | i2);
    }

    public boolean equals(Object other) {
        return m4105equalsimpl(this.mask, other);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return m4107hashCodeimpl(this.mask);
    }

    public String toString() {
        return m4109toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4111unboximpl() {
        return this.mask;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind$Companion;", "", "<init>", "()V", "Composition", "Landroidx/compose/runtime/snapshots/ReaderKind;", "getComposition-6f8NoZ8", "()I", "SnapshotStateObserver", "getSnapshotStateObserver-6f8NoZ8", "SnapshotFlow", "getSnapshotFlow-6f8NoZ8", SmartFragmentContent.RUNTIME}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m4112getComposition6f8NoZ8() {
            return ReaderKind.m4103constructorimpl(1);
        }

        /* renamed from: getSnapshotFlow-6f8NoZ8, reason: not valid java name */
        public final int m4113getSnapshotFlow6f8NoZ8() {
            return ReaderKind.m4103constructorimpl(4);
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m4114getSnapshotStateObserver6f8NoZ8() {
            return ReaderKind.m4103constructorimpl(2);
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4103constructorimpl(int i) {
        return i;
    }
}
