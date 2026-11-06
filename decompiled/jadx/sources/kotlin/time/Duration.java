package kotlin.time;

import androidx.collection.SieveCacheKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.presence.service.PresenceServiceConfiguration;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openjdk.tools.javac.code.Flags;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SinceKotlin(version = "1.6")
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0089\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b%\u0010(J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b*\u0010&J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b*\u0010(J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u000fJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b6\u0010\u000fJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b8\u0010\u000fJ\u0018\u0010;\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u009d\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2u\u0010@\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0AH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010JJ\u0088\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2`\u0010@\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0KH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010LJs\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2K\u0010@\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0MH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010NJ^\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0OH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010PJ\u0015\u0010^\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bb\u00100J\u0015\u0010c\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bd\u0010eJ\u000f\u0010t\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJA\u0010x\u001a\u00020y*\u00060zj\u0002`{2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010.\u001a\u00020u2\u0006\u0010\u007f\u001a\u00020\rH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J!\u0010t\u001a\u00020u2\u0006\u0010.\u001a\u00020\u00132\t\b\u0002\u0010\u0082\u0001\u001a\u00020\t¢\u0006\u0005\bv\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u0015\u0010\u0086\u0001\u001a\u00020\r2\t\u0010\u0019\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0003J\n\u0010\u0088\u0001\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0015\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u00109\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001a\u0010Q\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bT\u0010\u000bR\u001a\u0010U\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bW\u0010\u000bR\u001a\u0010X\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bY\u0010S\u001a\u0004\bZ\u0010\u000bR\u001a\u0010[\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0011\u0010f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0011\u0010h\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0011\u0010j\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0011\u0010l\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0011\u0010n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0011\u0010p\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0011\u0010r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bs\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "value", "getValue-impl", "unitDiscriminator", "", "getUnitDiscriminator-impl", "(J)I", "isInNanos", "", "isInNanos-impl", "(J)Z", "isInMillis", "isInMillis-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unaryMinus", "unaryMinus-UwyO8pc", "plus", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "plus-LRDsOJo", "(JJ)J", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "minus", "minus-LRDsOJo", "times", ModelTransformer.KEY_BATTERY_SCALE, "times-UwyO8pc", "(JI)J", "", "(JD)J", "div", "div-UwyO8pc", "div-LRDsOJo", "(JJ)D", "truncateTo", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "isInfinite", "isInfinite-impl", "isFinite", "isFinite-impl", "absoluteValue", "getAbsoluteValue-UwyO8pc", "compareTo", "compareTo-LRDsOJo", "(JJ)I", "toComponents", ExifInterface.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", BizMetricsConstants.DURATION_METADATA_NAME, "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hoursComponent", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "toDouble", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toLong", "toLong-impl", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeSeconds", "getInWholeSeconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString", "toIsoString-impl", "equals", "", "hashCode", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1062:1\n37#1:1063\n37#1:1064\n37#1:1065\n37#1:1066\n37#1:1067\n500#1:1068\n517#1:1076\n170#2,6:1069\n1#3:1075\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n38#1:1063\n39#1:1064\n274#1:1065\n294#1:1066\n478#1:1067\n727#1:1068\n818#1:1076\n769#1:1069,6\n*E\n"})
/* loaded from: classes10.dex */
public final class Duration implements Comparable<Duration> {
    private static final long INFINITE;
    private static final long NEG_INFINITE;
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m26661constructorimpl(0);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0015\u00100\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b5\u00103J\u0015\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b7J\u0015\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b9R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001bR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001f\u0010!\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001f\u0010!\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001bR\u001f\u0010!\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001dR\u001f\u0010$\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001f\u0010$\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001bR\u001f\u0010$\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001dR\u001f\u0010'\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001f\u0010'\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001bR\u001f\u0010'\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001dR\u001f\u0010*\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u001f\u0010*\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001bR\u001f\u0010*\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001dR\u001f\u0010-\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018R\u001f\u0010-\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001bR\u001f\u0010-\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001d¨\u0006:"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "ZERO", "Lkotlin/time/Duration;", "getZERO-UwyO8pc", "()J", "J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "convert", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "nanoseconds", "", "getNanoseconds-UwyO8pc$annotations", "(I)V", "getNanoseconds-UwyO8pc", "(I)J", "", "(J)V", "(J)J", "(D)V", "(D)J", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", BizMetricsConstants.DURATION_METADATA_NAME, "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "days", "getDays-UwyO8pc$annotations", "getDays-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseOrNull", "parseOrNull-FghU774", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m26709getDaysUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.DAYS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m26715getHoursUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.HOURS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m26721getMicrosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m26727getMillisecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m26733getMinutesUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.MINUTES);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m26739getNanosecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m26745getSecondsUwyO8pc(int i) {
            return DurationKt.toDuration(i, DurationUnit.SECONDS);
        }

        @ExperimentalTime
        public final double convert(double value, @NotNull DurationUnit sourceUnit, @NotNull DurationUnit targetUnit) {
            sourceUnit.getClass();
            targetUnit.getClass();
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m26750getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m26751getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m26752getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m26753parseUwyO8pc(@NotNull String value) {
            long parseDuration;
            value.getClass();
            try {
                parseDuration = DurationKt.parseDuration(value, false);
                return parseDuration;
            } catch (IllegalArgumentException e) {
                Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Invalid duration string format: '", value, "'."), e);
                return 0L;
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m26754parseIsoStringUwyO8pc(@NotNull String value) {
            long parseDuration;
            value.getClass();
            try {
                parseDuration = DurationKt.parseDuration(value, true);
                return parseDuration;
            } catch (IllegalArgumentException e) {
                Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Invalid ISO duration string format: '", value, "'."), e);
                return 0L;
            }
        }

        @Nullable
        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m26755parseIsoStringOrNullFghU774(@NotNull String value) {
            long parseDuration;
            value.getClass();
            try {
                parseDuration = DurationKt.parseDuration(value, true);
                return Duration.m26659boximpl(parseDuration);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Nullable
        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m26756parseOrNullFghU774(@NotNull String value) {
            long parseDuration;
            value.getClass();
            try {
                parseDuration = DurationKt.parseDuration(value, false);
                return Duration.m26659boximpl(parseDuration);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26712getDaysUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26718getHoursUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26724getMicrosecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26730getMillisecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26736getMinutesUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26742getNanosecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26748getSecondsUwyO8pc$annotations(int i) {
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26713getDaysUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26719getHoursUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26725getMicrosecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26731getMillisecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26737getMinutesUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26743getNanosecondsUwyO8pc$annotations(long j) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26749getSecondsUwyO8pc$annotations(long j) {
        }

        private Companion() {
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m26710getDaysUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.DAYS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m26716getHoursUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.HOURS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m26722getMicrosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m26728getMillisecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m26734getMinutesUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.MINUTES);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m26740getNanosecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m26746getSecondsUwyO8pc(long j) {
            return DurationKt.toDuration(j, DurationUnit.SECONDS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m26708getDaysUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.DAYS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m26714getHoursUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.HOURS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m26720getMicrosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m26726getMillisecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m26732getMinutesUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.MINUTES);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m26738getNanosecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m26744getSecondsUwyO8pc(double d) {
            return DurationKt.toDuration(d, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26711getDaysUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26717getHoursUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26723getMicrosecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26729getMillisecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26735getMinutesUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26741getNanosecondsUwyO8pc$annotations(double d) {
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26747getSecondsUwyO8pc$annotations(double d) {
        }
    }

    static {
        long durationOfMillis;
        long durationOfMillis2;
        durationOfMillis = DurationKt.durationOfMillis(4611686018427387903L);
        INFINITE = durationOfMillis;
        durationOfMillis2 = DurationKt.durationOfMillis(-4611686018427387903L);
        NEG_INFINITE = durationOfMillis2;
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m26657addValuesMixedRangesUwyO8pc(long j, long j2, long j3) {
        long nanosToMillis;
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        nanosToMillis = DurationKt.nanosToMillis(j3);
        long j4 = j2 + nanosToMillis;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            durationOfMillis = DurationKt.durationOfMillis(RangesKt.coerceIn(j4, -4611686018427387903L, 4611686018427387903L));
            return durationOfMillis;
        }
        millisToNanos = DurationKt.millisToNanos(nanosToMillis);
        long j5 = j3 - millisToNanos;
        millisToNanos2 = DurationKt.millisToNanos(j4);
        durationOfNanos = DurationKt.durationOfNanos(millisToNanos2 + j5);
        return durationOfNanos;
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m26658appendFractionalimpl(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        String padStart;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            padStart = StringsKt__StringsKt.padStart(String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) padStart, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) padStart, 0, i6);
            }
        }
        sb.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m26659boximpl(long j) {
        return new Duration(j);
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m26660compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m26687isNegativeimpl(j) ? -i : i;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m26661constructorimpl(long j) {
        if (!DurationJvmKt.getDurationAssertionsEnabled()) {
            return j;
        }
        if (m26685isInNanosimpl(j)) {
            long m26681getValueimpl = m26681getValueimpl(j);
            if (-4611686018426999999L <= m26681getValueimpl && m26681getValueimpl < 4611686018427000000L) {
                return j;
            }
            Buffer$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(m26681getValueimpl(j), " ns is out of nanoseconds range", new StringBuilder()));
            return 0L;
        }
        long m26681getValueimpl2 = m26681getValueimpl(j);
        if (-4611686018427387903L > m26681getValueimpl2 || m26681getValueimpl2 >= 4611686018427387904L) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(m26681getValueimpl(j), " ms is out of milliseconds range", new StringBuilder()));
            return 0L;
        }
        long m26681getValueimpl3 = m26681getValueimpl(j);
        if (-4611686018426L > m26681getValueimpl3) {
            return j;
        }
        if (m26681getValueimpl3 >= 4611686018427L) {
            return j;
        }
        Buffer$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(m26681getValueimpl(j), " ms is denormalized", new StringBuilder()));
        return 0L;
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m26662divLRDsOJo(long j, long j2) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(m26679getStorageUnitimpl(j), m26679getStorageUnitimpl(j2));
        return m26697toDoubleimpl(j, durationUnit) / m26697toDoubleimpl(j2, durationUnit);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m26664divUwyO8pc(long j, int i) {
        long durationOfMillis;
        long millisToNanos;
        long millisToNanos2;
        long durationOfNanos;
        long durationOfNanos2;
        if (i == 0) {
            if (m26688isPositiveimpl(j)) {
                return INFINITE;
            }
            if (m26687isNegativeimpl(j)) {
                return NEG_INFINITE;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Dividing zero duration by zero yields an undefined result.");
            return 0L;
        }
        if (m26685isInNanosimpl(j)) {
            durationOfNanos2 = DurationKt.durationOfNanos(m26681getValueimpl(j) / i);
            return durationOfNanos2;
        }
        if (m26686isInfiniteimpl(j)) {
            return m26692timesUwyO8pc(j, MathKt.getSign(i));
        }
        long j2 = i;
        long m26681getValueimpl = m26681getValueimpl(j) / j2;
        if (-4611686018426L > m26681getValueimpl || m26681getValueimpl >= 4611686018427L) {
            durationOfMillis = DurationKt.durationOfMillis(m26681getValueimpl);
            return durationOfMillis;
        }
        millisToNanos = DurationKt.millisToNanos(m26681getValueimpl(j) - (m26681getValueimpl * j2));
        millisToNanos2 = DurationKt.millisToNanos(m26681getValueimpl);
        durationOfNanos = DurationKt.durationOfNanos(millisToNanos2 + (millisToNanos / j2));
        return durationOfNanos;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26665equalsimpl(long j, Object obj) {
        return (obj instanceof Duration) && j == ((Duration) obj).getRawValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26666equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m26667getAbsoluteValueUwyO8pc(long j) {
        return m26687isNegativeimpl(j) ? m26705unaryMinusUwyO8pc(j) : j;
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m26668getHoursComponentimpl(long j) {
        if (m26686isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m26670getInWholeHoursimpl(j) % 24);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m26669getInWholeDaysimpl(long j) {
        return m26700toLongimpl(j, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m26670getInWholeHoursimpl(long j) {
        return m26700toLongimpl(j, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m26671getInWholeMicrosecondsimpl(long j) {
        return m26700toLongimpl(j, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m26672getInWholeMillisecondsimpl(long j) {
        return (m26684isInMillisimpl(j) && m26683isFiniteimpl(j)) ? m26681getValueimpl(j) : m26700toLongimpl(j, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m26673getInWholeMinutesimpl(long j) {
        return m26700toLongimpl(j, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m26674getInWholeNanosecondsimpl(long j) {
        long millisToNanos;
        long m26681getValueimpl = m26681getValueimpl(j);
        if (m26685isInNanosimpl(j)) {
            return m26681getValueimpl;
        }
        if (m26681getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (m26681getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        millisToNanos = DurationKt.millisToNanos(m26681getValueimpl);
        return millisToNanos;
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m26675getInWholeSecondsimpl(long j) {
        return m26700toLongimpl(j, DurationUnit.SECONDS);
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m26676getMinutesComponentimpl(long j) {
        if (m26686isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m26673getInWholeMinutesimpl(j) % 60);
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m26677getNanosecondsComponentimpl(long j) {
        if (m26686isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m26684isInMillisimpl(j) ? DurationKt.millisToNanos(m26681getValueimpl(j) % 1000) : m26681getValueimpl(j) % 1000000000);
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m26678getSecondsComponentimpl(long j) {
        if (m26686isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m26675getInWholeSecondsimpl(j) % 60);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m26679getStorageUnitimpl(long j) {
        return m26685isInNanosimpl(j) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m26680getUnitDiscriminatorimpl(long j) {
        return ((int) j) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m26681getValueimpl(long j) {
        return j >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26682hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m26683isFiniteimpl(long j) {
        return !m26686isInfiniteimpl(j);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m26684isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m26685isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m26686isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m26687isNegativeimpl(long j) {
        return j < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m26688isPositiveimpl(long j) {
        return j > 0;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m26689minusLRDsOJo(long j, long j2) {
        return m26690plusLRDsOJo(j, m26705unaryMinusUwyO8pc(j2));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m26690plusLRDsOJo(long j, long j2) {
        long durationOfMillisNormalized;
        long durationOfNanosNormalized;
        if (m26686isInfiniteimpl(j)) {
            if (m26683isFiniteimpl(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (m26686isInfiniteimpl(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return m26684isInMillisimpl(j) ? m26657addValuesMixedRangesUwyO8pc(j, m26681getValueimpl(j), m26681getValueimpl(j2)) : m26657addValuesMixedRangesUwyO8pc(j, m26681getValueimpl(j2), m26681getValueimpl(j));
        }
        long m26681getValueimpl = m26681getValueimpl(j) + m26681getValueimpl(j2);
        if (m26685isInNanosimpl(j)) {
            durationOfNanosNormalized = DurationKt.durationOfNanosNormalized(m26681getValueimpl);
            return durationOfNanosNormalized;
        }
        durationOfMillisNormalized = DurationKt.durationOfMillisNormalized(m26681getValueimpl);
        return durationOfMillisNormalized;
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m26692timesUwyO8pc(long j, int i) {
        long coerceIn;
        long durationOfMillis;
        long nanosToMillis;
        long millisToNanos;
        long nanosToMillis2;
        long coerceIn2;
        long durationOfMillis2;
        long durationOfNanosNormalized;
        long durationOfNanos;
        if (m26686isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m26705unaryMinusUwyO8pc(j);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Multiplying infinite duration by zero yields an undefined result.");
            return 0L;
        }
        if (i == 0) {
            return ZERO;
        }
        long m26681getValueimpl = m26681getValueimpl(j);
        long j2 = i;
        long j3 = m26681getValueimpl * j2;
        if (!m26685isInNanosimpl(j)) {
            if (j3 / j2 != m26681getValueimpl) {
                return MathKt.getSign(i) * MathKt.getSign(m26681getValueimpl) > 0 ? INFINITE : NEG_INFINITE;
            }
            coerceIn = RangesKt___RangesKt.coerceIn(j3, new LongRange(-4611686018427387903L, 4611686018427387903L));
            durationOfMillis = DurationKt.durationOfMillis(coerceIn);
            return durationOfMillis;
        }
        if (-2147483647L <= m26681getValueimpl && m26681getValueimpl < Flags.BRIDGE) {
            durationOfNanos = DurationKt.durationOfNanos(j3);
            return durationOfNanos;
        }
        if (j3 / j2 == m26681getValueimpl) {
            durationOfNanosNormalized = DurationKt.durationOfNanosNormalized(j3);
            return durationOfNanosNormalized;
        }
        nanosToMillis = DurationKt.nanosToMillis(m26681getValueimpl);
        millisToNanos = DurationKt.millisToNanos(nanosToMillis);
        long j4 = nanosToMillis * j2;
        nanosToMillis2 = DurationKt.nanosToMillis((m26681getValueimpl - millisToNanos) * j2);
        long j5 = nanosToMillis2 + j4;
        if (j4 / j2 != nanosToMillis || (j5 ^ j4) < 0) {
            return MathKt.getSign(i) * MathKt.getSign(m26681getValueimpl) > 0 ? INFINITE : NEG_INFINITE;
        }
        coerceIn2 = RangesKt___RangesKt.coerceIn(j5, new LongRange(-4611686018427387903L, 4611686018427387903L));
        durationOfMillis2 = DurationKt.durationOfMillis(coerceIn2);
        return durationOfMillis2;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m26696toComponentsimpl(long j, @NotNull Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> function5) {
        function5.getClass();
        return function5.invoke(Long.valueOf(m26669getInWholeDaysimpl(j)), Integer.valueOf(m26668getHoursComponentimpl(j)), Integer.valueOf(m26676getMinutesComponentimpl(j)), Integer.valueOf(m26678getSecondsComponentimpl(j)), Integer.valueOf(m26677getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m26697toDoubleimpl(long j, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m26681getValueimpl(j), m26679getStorageUnitimpl(j), durationUnit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m26698toIntimpl(long j, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        return (int) RangesKt.coerceIn(m26700toLongimpl(j, durationUnit), SieveCacheKt.NodeMetaAndPreviousMask, SieveCacheKt.NodeLinkMask);
    }

    @NotNull
    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m26699toIsoStringimpl(long j) {
        StringBuilder sb = new StringBuilder();
        if (m26687isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long m26667getAbsoluteValueUwyO8pc = m26667getAbsoluteValueUwyO8pc(j);
        long m26670getInWholeHoursimpl = m26670getInWholeHoursimpl(m26667getAbsoluteValueUwyO8pc);
        int m26676getMinutesComponentimpl = m26676getMinutesComponentimpl(m26667getAbsoluteValueUwyO8pc);
        int m26678getSecondsComponentimpl = m26678getSecondsComponentimpl(m26667getAbsoluteValueUwyO8pc);
        int m26677getNanosecondsComponentimpl = m26677getNanosecondsComponentimpl(m26667getAbsoluteValueUwyO8pc);
        long j2 = m26686isInfiniteimpl(j) ? 9999999999999L : m26670getInWholeHoursimpl;
        boolean z = false;
        boolean z2 = j2 != 0;
        boolean z3 = (m26678getSecondsComponentimpl == 0 && m26677getNanosecondsComponentimpl == 0) ? false : true;
        if (m26676getMinutesComponentimpl != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(j2);
            sb.append('H');
        }
        if (z) {
            sb.append(m26676getMinutesComponentimpl);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            m26658appendFractionalimpl(j, sb, m26678getSecondsComponentimpl, m26677getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m26700toLongimpl(long j, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        if (j == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m26681getValueimpl(j), m26679getStorageUnitimpl(j), durationUnit);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26701toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m26687isNegativeimpl = m26687isNegativeimpl(j);
        StringBuilder sb = new StringBuilder();
        if (m26687isNegativeimpl) {
            sb.append('-');
        }
        long m26667getAbsoluteValueUwyO8pc = m26667getAbsoluteValueUwyO8pc(j);
        long m26669getInWholeDaysimpl = m26669getInWholeDaysimpl(m26667getAbsoluteValueUwyO8pc);
        int m26668getHoursComponentimpl = m26668getHoursComponentimpl(m26667getAbsoluteValueUwyO8pc);
        int m26676getMinutesComponentimpl = m26676getMinutesComponentimpl(m26667getAbsoluteValueUwyO8pc);
        int m26678getSecondsComponentimpl = m26678getSecondsComponentimpl(m26667getAbsoluteValueUwyO8pc);
        int m26677getNanosecondsComponentimpl = m26677getNanosecondsComponentimpl(m26667getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = m26669getInWholeDaysimpl != 0;
        boolean z2 = m26668getHoursComponentimpl != 0;
        boolean z3 = m26676getMinutesComponentimpl != 0;
        boolean z4 = (m26678getSecondsComponentimpl == 0 && m26677getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(m26669getInWholeDaysimpl);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m26668getHoursComponentimpl);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m26676getMinutesComponentimpl);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (m26678getSecondsComponentimpl != 0 || z || z2 || z3) {
                m26658appendFractionalimpl(j, sb, m26678getSecondsComponentimpl, m26677getNanosecondsComponentimpl, 9, CmcdData.Factory.STREAMING_FORMAT_SS, false);
            } else if (m26677getNanosecondsComponentimpl >= 1000000) {
                m26658appendFractionalimpl(j, sb, m26677getNanosecondsComponentimpl / 1000000, m26677getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (m26677getNanosecondsComponentimpl >= 1000) {
                m26658appendFractionalimpl(j, sb, m26677getNanosecondsComponentimpl / 1000, m26677getNanosecondsComponentimpl % 1000, 3, PresenceServiceConfiguration.US, false);
            } else {
                sb.append(m26677getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i = i4;
        }
        if (m26687isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m26703toStringimpl$default(long j, DurationUnit durationUnit, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m26702toStringimpl(j, durationUnit, i);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m26704truncateToUwyO8pc$kotlin_stdlib(long j, @NotNull DurationUnit durationUnit) {
        durationUnit.getClass();
        DurationUnit m26679getStorageUnitimpl = m26679getStorageUnitimpl(j);
        if (durationUnit.compareTo(m26679getStorageUnitimpl) <= 0 || m26686isInfiniteimpl(j)) {
            return j;
        }
        return DurationKt.toDuration(m26681getValueimpl(j) - (m26681getValueimpl(j) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit, m26679getStorageUnitimpl)), m26679getStorageUnitimpl);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m26705unaryMinusUwyO8pc(long j) {
        long durationOf;
        durationOf = DurationKt.durationOf(-m26681getValueimpl(j), ((int) j) & 1);
        return durationOf;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m26706compareToLRDsOJo(duration.getRawValue());
    }

    public boolean equals(Object other) {
        return m26665equalsimpl(this.rawValue, other);
    }

    public int hashCode() {
        return m26682hashCodeimpl(this.rawValue);
    }

    @NotNull
    public String toString() {
        return m26701toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m26706compareToLRDsOJo(long j) {
        return m26660compareToLRDsOJo(this.rawValue, j);
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m26695toComponentsimpl(long j, @NotNull Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> function4) {
        function4.getClass();
        return function4.invoke(Long.valueOf(m26670getInWholeHoursimpl(j)), Integer.valueOf(m26676getMinutesComponentimpl(j)), Integer.valueOf(m26678getSecondsComponentimpl(j)), Integer.valueOf(m26677getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m26694toComponentsimpl(long j, @NotNull Function3<? super Long, ? super Integer, ? super Integer, ? extends T> function3) {
        function3.getClass();
        return function3.invoke(Long.valueOf(m26673getInWholeMinutesimpl(j)), Integer.valueOf(m26678getSecondsComponentimpl(j)), Integer.valueOf(m26677getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m26693toComponentsimpl(long j, @NotNull Function2<? super Long, ? super Integer, ? extends T> function2) {
        function2.getClass();
        return function2.invoke(Long.valueOf(m26675getInWholeSecondsimpl(j)), Integer.valueOf(m26677getNanosecondsComponentimpl(j)));
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m26663divUwyO8pc(long j, double d) {
        int roundToInt = MathKt.roundToInt(d);
        if (roundToInt == d && roundToInt != 0) {
            return m26664divUwyO8pc(j, roundToInt);
        }
        DurationUnit m26679getStorageUnitimpl = m26679getStorageUnitimpl(j);
        return DurationKt.toDuration(m26697toDoubleimpl(j, m26679getStorageUnitimpl) / d, m26679getStorageUnitimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m26691timesUwyO8pc(long j, double d) {
        int roundToInt = MathKt.roundToInt(d);
        if (roundToInt == d) {
            return m26692timesUwyO8pc(j, roundToInt);
        }
        DurationUnit m26679getStorageUnitimpl = m26679getStorageUnitimpl(j);
        return DurationKt.toDuration(m26697toDoubleimpl(j, m26679getStorageUnitimpl) * d, m26679getStorageUnitimpl);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m26702toStringimpl(long j, @NotNull DurationUnit durationUnit, int i) {
        durationUnit.getClass();
        if (i >= 0) {
            double m26697toDoubleimpl = m26697toDoubleimpl(j, durationUnit);
            if (Double.isInfinite(m26697toDoubleimpl)) {
                return String.valueOf(m26697toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(m26697toDoubleimpl, RangesKt.coerceAtMost(i, 12)) + DurationUnitKt__DurationUnitKt.shortName(durationUnit);
        }
        Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(i, "decimals must be not negative, but was "));
        return null;
    }
}
