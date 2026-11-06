package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnitType;
import com.amazon.alexa.mobile.assistant.client.metrics.RaUiEventMetricsAdapter;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087@\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0007\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0086\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0086\n¢\u0006\u0004\b\u000b\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000fH\u0086\n¢\u0006\u0004\b\u000b\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH\u0086\n¢\u0006\u0004\b\u0012\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\rH\u0086\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000fH\u0086\n¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0000H\u0086\n¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010*\u001a\u00020\"2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u00038@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0005R\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010\u0005R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010'\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010)\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006-"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "packedValue", "", "constructor-impl", "(J)J", "unaryMinus", "unaryMinus-XSAIIZE", "div", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "div-kPz2Gy4", "(JF)J", "", "(JD)J", "", "(JI)J", "times", "times-kPz2Gy4", "compareTo", "compareTo--R2X_6o", "(JJ)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", ContactProviderContract.AddressEntry.COLUMN_ADDRESS_RAW_TYPE, "getRawType$annotations", "()V", "getRawType-impl", "type", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "isSp", "", "isSp-impl", "(J)Z", "isEm", "isEm-impl", "value", "getValue-impl", "(J)F", "equals", "hashCode", "Companion", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nTextUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,371:1\n22#2:372\n*S KotlinDebug\n*F\n+ 1 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n241#1:372\n*E\n"})
/* loaded from: classes13.dex */
public final class TextUnit {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    static {
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        TextUnitTypes = new TextUnitType[]{TextUnitType.m7587boximpl(companion.m7596getUnspecifiedUIouoOA()), TextUnitType.m7587boximpl(companion.m7595getSpUIouoOA()), TextUnitType.m7587boximpl(companion.m7594getEmUIouoOA())};
        Unspecified = TextUnitKt.pack(0L, Float.NaN);
    }

    private /* synthetic */ TextUnit(long j) {
        this.packedValue = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextUnit m7552boximpl(long j) {
        return new TextUnit(j);
    }

    /* renamed from: compareTo--R2X_6o, reason: not valid java name */
    public static final int m7553compareToR2X_6o(long j, long j2) {
        TextUnitKt.m7576checkArithmeticNB67dxo(j, j2);
        return Float.compare(m7562getValueimpl(j), m7562getValueimpl(j2));
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m7555divkPz2Gy4(long j, double d) {
        TextUnitKt.m7575checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7560getRawTypeimpl(j), (float) (m7562getValueimpl(j) / d));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7558equalsimpl(long j, Object obj) {
        return (obj instanceof TextUnit) && j == ((TextUnit) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7559equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getRawType-impl, reason: not valid java name */
    public static final long m7560getRawTypeimpl(long j) {
        return j & 1095216660480L;
    }

    /* renamed from: getType-UIouoOA, reason: not valid java name */
    public static final long m7561getTypeUIouoOA(long j) {
        return TextUnitTypes[(int) (m7560getRawTypeimpl(j) >>> 32)].getType();
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m7562getValueimpl(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7563hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isEm-impl, reason: not valid java name */
    public static final boolean m7564isEmimpl(long j) {
        return m7560getRawTypeimpl(j) == 8589934592L;
    }

    /* renamed from: isSp-impl, reason: not valid java name */
    public static final boolean m7565isSpimpl(long j) {
        return m7560getRawTypeimpl(j) == 4294967296L;
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7566timeskPz2Gy4(long j, double d) {
        TextUnitKt.m7575checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7560getRawTypeimpl(j), (float) (m7562getValueimpl(j) * d));
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7569toStringimpl(long j) {
        long m7561getTypeUIouoOA = m7561getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m7590equalsimpl0(m7561getTypeUIouoOA, companion.m7596getUnspecifiedUIouoOA())) {
            return "Unspecified";
        }
        if (TextUnitType.m7590equalsimpl0(m7561getTypeUIouoOA, companion.m7595getSpUIouoOA())) {
            return m7562getValueimpl(j) + ".sp";
        }
        if (!TextUnitType.m7590equalsimpl0(m7561getTypeUIouoOA, companion.m7594getEmUIouoOA())) {
            return RaUiEventMetricsAdapter.INVALID_METRIC_NAME_SUFFIX;
        }
        return m7562getValueimpl(j) + ".em";
    }

    /* renamed from: unaryMinus-XSAIIZE, reason: not valid java name */
    public static final long m7570unaryMinusXSAIIZE(long j) {
        TextUnitKt.m7575checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7560getRawTypeimpl(j), -m7562getValueimpl(j));
    }

    public boolean equals(Object other) {
        return m7558equalsimpl(this.packedValue, other);
    }

    public int hashCode() {
        return m7563hashCodeimpl(this.packedValue);
    }

    @NotNull
    public String toString() {
        return m7569toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "<init>", "()V", "TextUnitTypes", "", "Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit", "()[Landroidx/compose/ui/unit/TextUnitType;", "[Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "Landroidx/compose/ui/unit/TextUnit;", "getUnspecified-XSAIIZE$annotations", "getUnspecified-XSAIIZE", "()J", "J", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextUnitType[] getTextUnitTypes$ui_unit() {
            return TextUnit.TextUnitTypes;
        }

        /* renamed from: getUnspecified-XSAIIZE, reason: not valid java name */
        public final long m7573getUnspecifiedXSAIIZE() {
            return TextUnit.Unspecified;
        }

        private Companion() {
        }

        @Stable
        /* renamed from: getUnspecified-XSAIIZE$annotations, reason: not valid java name */
        public static /* synthetic */ void m7572getUnspecifiedXSAIIZE$annotations() {
        }
    }

    @PublishedApi
    public static /* synthetic */ void getRawType$annotations() {
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m7556divkPz2Gy4(long j, float f) {
        TextUnitKt.m7575checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7560getRawTypeimpl(j), m7562getValueimpl(j) / f);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7567timeskPz2Gy4(long j, float f) {
        TextUnitKt.m7575checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7560getRawTypeimpl(j), m7562getValueimpl(j) * f);
    }

    /* renamed from: div-kPz2Gy4, reason: not valid java name */
    public static final long m7557divkPz2Gy4(long j, int i) {
        TextUnitKt.m7575checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7560getRawTypeimpl(j), m7562getValueimpl(j) / i);
    }

    /* renamed from: times-kPz2Gy4, reason: not valid java name */
    public static final long m7568timeskPz2Gy4(long j, int i) {
        TextUnitKt.m7575checkArithmeticR2X_6o(j);
        return TextUnitKt.pack(m7560getRawTypeimpl(j), m7562getValueimpl(j) * i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7554constructorimpl(long j) {
        return j;
    }
}
