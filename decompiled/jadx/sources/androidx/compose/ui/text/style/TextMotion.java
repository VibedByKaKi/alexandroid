package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import com.amazon.alexa.mobile.assistant.client.metrics.RaUiEventMetricsAdapter;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion;", "", "linearity", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "subpixelTextPositioning", "", "<init>", "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLinearity-4e0Vf04$ui_text", "()I", "I", "getSubpixelTextPositioning$ui_text", "()Z", "copy", "copy-JdDtMQo$ui_text", "(IZ)Landroidx/compose/ui/text/style/TextMotion;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "Linearity", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextMotion {
    public static final int $stable = 0;

    @NotNull
    private static final TextMotion Animated;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        Linearity.Companion companion = Linearity.INSTANCE;
        Static = new TextMotion(companion.m7288getFontHinting4e0Vf04(), false, defaultConstructorMarker);
        Animated = new TextMotion(companion.m7289getLinear4e0Vf04(), true, defaultConstructorMarker);
    }

    private TextMotion(int i, boolean z) {
        this.linearity = i;
        this.subpixelTextPositioning = z;
    }

    /* renamed from: copy-JdDtMQo$ui_text$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m7278copyJdDtMQo$ui_text$default(TextMotion textMotion, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = textMotion.linearity;
        }
        if ((i2 & 2) != 0) {
            z = textMotion.subpixelTextPositioning;
        }
        return textMotion.m7279copyJdDtMQo$ui_text(i, z);
    }

    @NotNull
    /* renamed from: copy-JdDtMQo$ui_text, reason: not valid java name */
    public final TextMotion m7279copyJdDtMQo$ui_text(int linearity, boolean subpixelTextPositioning) {
        return new TextMotion(linearity, subpixelTextPositioning, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) other;
        return Linearity.m7284equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text, reason: not valid java name and from getter */
    public final int getLinearity() {
        return this.linearity;
    }

    /* renamed from: getSubpixelTextPositioning$ui_text, reason: from getter */
    public final boolean getSubpixelTextPositioning() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return Boolean.hashCode(this.subpixelTextPositioning) + (Linearity.m7285hashCodeimpl(this.linearity) * 31);
    }

    @NotNull
    public String toString() {
        return Intrinsics.areEqual(this, Static) ? "TextMotion.Static" : Intrinsics.areEqual(this, Animated) ? "TextMotion.Animated" : RaUiEventMetricsAdapter.INVALID_METRIC_NAME_SUFFIX;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity;", "", "value", "", "constructor-impl", "(I)I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "Companion", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @JvmInline
    public static final class Linearity {
        private final int value;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final int Linear = m7282constructorimpl(1);
        private static final int FontHinting = m7282constructorimpl(2);
        private static final int None = m7282constructorimpl(3);

        private /* synthetic */ Linearity(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m7281boximpl(int i) {
            return new Linearity(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7283equalsimpl(int i, Object obj) {
            return (obj instanceof Linearity) && i == ((Linearity) obj).getValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7284equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7285hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        @NotNull
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7286toStringimpl(int i) {
            return m7284equalsimpl0(i, Linear) ? "Linearity.Linear" : m7284equalsimpl0(i, FontHinting) ? "Linearity.FontHinting" : m7284equalsimpl0(i, None) ? "Linearity.None" : RaUiEventMetricsAdapter.INVALID_METRIC_NAME_SUFFIX;
        }

        public boolean equals(Object obj) {
            return m7283equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7285hashCodeimpl(this.value);
        }

        @NotNull
        public String toString() {
            return m7286toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Linearity$Companion;", "", "<init>", "()V", "Linear", "Landroidx/compose/ui/text/style/TextMotion$Linearity;", "getLinear-4e0Vf04", "()I", "I", "FontHinting", "getFontHinting-4e0Vf04", "None", "getNone-4e0Vf04", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m7288getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m7289getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m7290getNone4e0Vf04() {
                return Linearity.None;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m7282constructorimpl(int i) {
            return i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/style/TextMotion$Companion;", "", "<init>", "()V", "Static", "Landroidx/compose/ui/text/style/TextMotion;", "getStatic", "()Landroidx/compose/ui/text/style/TextMotion;", "Animated", "getAnimated", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextMotion getAnimated() {
            return TextMotion.Animated;
        }

        @NotNull
        public final TextMotion getStatic() {
            return TextMotion.Static;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextMotion(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }
}
