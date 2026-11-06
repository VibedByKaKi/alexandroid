package androidx.compose.ui.hapticfeedback;

import com.amazon.alexa.mobile.assistant.client.metrics.RaUiEventMetricsAdapter;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", "value", "", "constructor-impl", "(I)I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "Companion", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes13.dex */
public final class HapticFeedbackType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    private /* synthetic */ HapticFeedbackType(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ HapticFeedbackType m5427boximpl(int i) {
        return new HapticFeedbackType(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5429equalsimpl(int i, Object obj) {
        return (obj instanceof HapticFeedbackType) && i == ((HapticFeedbackType) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5430equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5431hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5432toStringimpl(int i) {
        Companion companion = INSTANCE;
        return m5430equalsimpl0(i, companion.m5434getConfirm5zf0vsI()) ? "Confirm" : m5430equalsimpl0(i, companion.m5435getContextClick5zf0vsI()) ? "ContextClick" : m5430equalsimpl0(i, companion.m5436getGestureEnd5zf0vsI()) ? "GestureEnd" : m5430equalsimpl0(i, companion.m5437getGestureThresholdActivate5zf0vsI()) ? "GestureThresholdActivate" : m5430equalsimpl0(i, companion.m5438getKeyboardTap5zf0vsI()) ? "KeyboardTap" : m5430equalsimpl0(i, companion.m5439getLongPress5zf0vsI()) ? "LongPress" : m5430equalsimpl0(i, companion.m5440getReject5zf0vsI()) ? "Reject" : m5430equalsimpl0(i, companion.m5441getSegmentFrequentTick5zf0vsI()) ? "SegmentFrequentTick" : m5430equalsimpl0(i, companion.m5442getSegmentTick5zf0vsI()) ? "SegmentTick" : m5430equalsimpl0(i, companion.m5443getTextHandleMove5zf0vsI()) ? "TextHandleMove" : m5430equalsimpl0(i, companion.m5444getToggleOff5zf0vsI()) ? "ToggleOff" : m5430equalsimpl0(i, companion.m5445getToggleOn5zf0vsI()) ? "ToggleOn" : m5430equalsimpl0(i, companion.m5446getVirtualKey5zf0vsI()) ? "VirtualKey" : RaUiEventMetricsAdapter.INVALID_METRIC_NAME_SUFFIX;
    }

    public boolean equals(Object other) {
        return m5429equalsimpl(this.value, other);
    }

    public int hashCode() {
        return m5431hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m5432toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050!R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007R\u0011\u0010\u0018\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0007R\u0011\u0010\u001a\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0007R\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0007¨\u0006\""}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "<init>", "()V", "Confirm", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "getConfirm-5zf0vsI", "()I", "ContextClick", "getContextClick-5zf0vsI", "GestureEnd", "getGestureEnd-5zf0vsI", "GestureThresholdActivate", "getGestureThresholdActivate-5zf0vsI", "KeyboardTap", "getKeyboardTap-5zf0vsI", "LongPress", "getLongPress-5zf0vsI", "Reject", "getReject-5zf0vsI", "SegmentFrequentTick", "getSegmentFrequentTick-5zf0vsI", "SegmentTick", "getSegmentTick-5zf0vsI", "TextHandleMove", "getTextHandleMove-5zf0vsI", "ToggleOff", "getToggleOff-5zf0vsI", "ToggleOn", "getToggleOn-5zf0vsI", "VirtualKey", "getVirtualKey-5zf0vsI", "values", "", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m5434getConfirm5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5447getConfirm5zf0vsI();
        }

        /* renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m5435getContextClick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5448getContextClick5zf0vsI();
        }

        /* renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m5436getGestureEnd5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5449getGestureEnd5zf0vsI();
        }

        /* renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m5437getGestureThresholdActivate5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5450getGestureThresholdActivate5zf0vsI();
        }

        /* renamed from: getKeyboardTap-5zf0vsI, reason: not valid java name */
        public final int m5438getKeyboardTap5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5451getKeyboardTap5zf0vsI();
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m5439getLongPress5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5452getLongPress5zf0vsI();
        }

        /* renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m5440getReject5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5453getReject5zf0vsI();
        }

        /* renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m5441getSegmentFrequentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5454getSegmentFrequentTick5zf0vsI();
        }

        /* renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m5442getSegmentTick5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5455getSegmentTick5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m5443getTextHandleMove5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5456getTextHandleMove5zf0vsI();
        }

        /* renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m5444getToggleOff5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5457getToggleOff5zf0vsI();
        }

        /* renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m5445getToggleOn5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5458getToggleOn5zf0vsI();
        }

        /* renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m5446getVirtualKey5zf0vsI() {
            return PlatformHapticFeedbackType.INSTANCE.m5459getVirtualKey5zf0vsI();
        }

        @NotNull
        public final List<HapticFeedbackType> values() {
            return CollectionsKt.listOf((Object[]) new HapticFeedbackType[]{HapticFeedbackType.m5427boximpl(m5434getConfirm5zf0vsI()), HapticFeedbackType.m5427boximpl(m5435getContextClick5zf0vsI()), HapticFeedbackType.m5427boximpl(m5436getGestureEnd5zf0vsI()), HapticFeedbackType.m5427boximpl(m5437getGestureThresholdActivate5zf0vsI()), HapticFeedbackType.m5427boximpl(m5438getKeyboardTap5zf0vsI()), HapticFeedbackType.m5427boximpl(m5439getLongPress5zf0vsI()), HapticFeedbackType.m5427boximpl(m5440getReject5zf0vsI()), HapticFeedbackType.m5427boximpl(m5441getSegmentFrequentTick5zf0vsI()), HapticFeedbackType.m5427boximpl(m5442getSegmentTick5zf0vsI()), HapticFeedbackType.m5427boximpl(m5443getTextHandleMove5zf0vsI()), HapticFeedbackType.m5427boximpl(m5444getToggleOff5zf0vsI()), HapticFeedbackType.m5427boximpl(m5445getToggleOn5zf0vsI()), HapticFeedbackType.m5427boximpl(m5446getVirtualKey5zf0vsI())});
        }

        private Companion() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5428constructorimpl(int i) {
        return i;
    }
}
