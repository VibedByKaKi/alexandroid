package com.bugsnag.android.performance.internal;

import android.os.SystemClock;
import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.bugsnag.android.performance.HasAttributes;
import com.bugsnag.android.performance.Span;
import com.bugsnag.android.performance.SpanContext;
import com.bugsnag.android.performance.SpanKind;
import com.bugsnag.android.performance.internal.SpanImpl;
import com.bugsnag.android.performance.internal.integration.NotifierIntegration;
import com.bugsnag.android.performance.internal.metrics.SpanMetricsSnapshot;
import com.bugsnag.android.performance.internal.processing.AttributeLimits;
import com.bugsnag.android.performance.internal.processing.JsonTraceWriter;
import com.bugsnag.android.performance.internal.processing.Timeout;
import com.bugsnag.android.performance.internal.processing.TimeoutExecutor;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0015\n\u0002\u0010\u0016\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0003pqrBp\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0010\u0010O\u001a\u0004\u0018\u00010P2\u0006\u0010Q\u001a\u00020\nJ\u0006\u0010R\u001a\u00020SJ\b\u0010T\u001a\u00020SH\u0016J\u0010\u0010T\u001a\u00020S2\u0006\u0010,\u001a\u00020\nH\u0016J\u0013\u0010U\u001a\u00020\u00102\b\u0010V\u001a\u0004\u0018\u00010WH\u0096\u0002J\b\u0010X\u001a\u00020%H\u0016J\u0006\u0010Y\u001a\u00020\u0010J\b\u0010Z\u001a\u00020\u0010H\u0016J\u0006\u0010[\u001a\u00020\u0010J\u0006\u0010\\\u001a\u00020\u0010J\u0015\u0010]\u001a\u00020S2\u0006\u0010,\u001a\u00020\nH\u0001¢\u0006\u0002\b^J\r\u0010_\u001a\u00020SH\u0001¢\u0006\u0002\b`J%\u0010a\u001a\u00020S2\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010bH\u0016¢\u0006\u0002\u0010cJ\u0018\u0010a\u001a\u00020S2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0010H\u0016J\u0018\u0010a\u001a\u00020S2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u00108\u001a\u00020>H\u0016J\u001a\u0010a\u001a\u00020S2\u0006\u0010\u0003\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u00010dH\u0016J\u0018\u0010a\u001a\u00020S2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u00108\u001a\u00020%H\u0016J\u001a\u0010a\u001a\u00020S2\u0006\u0010\u0003\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u00010eH\u0016J\u0018\u0010a\u001a\u00020S2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u00108\u001a\u00020\nH\u0016J\u001a\u0010a\u001a\u00020S2\u0006\u0010\u0003\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u00010fH\u0016J\u001a\u0010a\u001a\u00020S2\u0006\u0010\u0003\u001a\u00020\u00042\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010a\u001a\u00020S2\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u00108\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010gH\u0016J\u001f\u0010h\u001a\u00020S2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010i\u001a\b\u0012\u0004\u0012\u00020S0jH\u0082\bJ\u0015\u0010k\u001a\u00020S2\u0006\u0010l\u001a\u00020mH\u0000¢\u0006\u0002\bnJ\b\u0010o\u001a\u00020\u0004H\u0016R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0005\u001a\u00020\u0006X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u00020%X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\n8A@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R$\u0010\u0003\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010;R\u0014\u0010<\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b=\u0010.R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010?\u001a\u00020>2\b\b\u0001\u00108\u001a\u00020>8A@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020>X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010AR\u0014\u0010\r\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010.R\u0016\u0010\t\u001a\u00020\n8\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010.R\u0019\u0010H\u001a\u00020IX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010JR\u0016\u0010\u0015\u001a\u00020\u00168\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006s"}, d2 = {"Lcom/bugsnag/android/performance/internal/SpanImpl;", "Lcom/bugsnag/android/performance/Span;", "Lcom/bugsnag/android/performance/HasAttributes;", "name", "", "category", "Lcom/bugsnag/android/performance/internal/SpanCategory;", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "Lcom/bugsnag/android/performance/SpanKind;", "startTime", "", "traceId", "Ljava/util/UUID;", "spanId", "parentSpanId", "makeContext", "", "attributeLimits", "Lcom/bugsnag/android/performance/internal/processing/AttributeLimits;", "metrics", "Lcom/bugsnag/android/performance/internal/metrics/SpanMetricsSnapshot;", "timeoutExecutor", "Lcom/bugsnag/android/performance/internal/processing/TimeoutExecutor;", "processor", "Lcom/bugsnag/android/performance/internal/SpanProcessor;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bugsnag/android/performance/SpanKind;JLjava/util/UUID;JJZLcom/bugsnag/android/performance/internal/processing/AttributeLimits;Lcom/bugsnag/android/performance/internal/metrics/SpanMetricsSnapshot;Lcom/bugsnag/android/performance/internal/processing/TimeoutExecutor;Lcom/bugsnag/android/performance/internal/SpanProcessor;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "attributes", "Lcom/bugsnag/android/performance/internal/Attributes;", "getAttributes", "()Lcom/bugsnag/android/performance/internal/Attributes;", "getCategory-haBhItc$bugsnag_android_performance_release", "()Ljava/lang/String;", "Ljava/lang/String;", "conditions", "", "Lcom/bugsnag/android/performance/internal/SpanImpl$ConditionImpl;", "customAttributesCount", "", "droppedAttributesCount", "getDroppedAttributesCount$bugsnag_android_performance_release", "()I", "setDroppedAttributesCount$bugsnag_android_performance_release", "(I)V", "<set-?>", "endTime", "getEndTime$internal", "()J", "isSealed", "isSealed$bugsnag_android_performance_release", "()Z", "setSealed$bugsnag_android_performance_release", "(Z)V", "getKind$bugsnag_android_performance_release", "()Lcom/bugsnag/android/performance/SpanKind;", "getMetrics$bugsnag_android_performance_release", "()Lcom/bugsnag/android/performance/internal/metrics/SpanMetricsSnapshot;", "value", "getName", "setName$bugsnag_android_performance_release", "(Ljava/lang/String;)V", "next", "getParentSpanId", "", "samplingProbability", "getSamplingProbability$bugsnag_android_performance_release", "()D", "setSamplingProbability$bugsnag_android_performance_release", "(D)V", "samplingValue", "getSamplingValue$bugsnag_android_performance_release", "getSpanId", "getStartTime$internal", "state", "Lcom/bugsnag/android/performance/internal/SpanState;", "Ljava/util/concurrent/atomic/AtomicInteger;", "getTimeoutExecutor$internal", "()Lcom/bugsnag/android/performance/internal/processing/TimeoutExecutor;", "getTraceId", "()Ljava/util/UUID;", "block", "Lcom/bugsnag/android/performance/internal/SpanImpl$Condition;", "timeoutMs", ClientCookie.DISCARD_ATTR, "", "end", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_IS_BLOCKED, "isEnded", "isOpen", "isSampled", "markEndTime", "markEndTime$internal", "sendForProcessing", "sendForProcessing$internal", "setAttribute", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "", "", "", "", "setAttributeImpl", "setter", "Lkotlin/Function0;", "toJson", "json", "Lcom/bugsnag/android/performance/internal/processing/JsonTraceWriter;", "toJson$bugsnag_android_performance_release", "toString", "Companion", JsonDocumentFields.CONDITION, "ConditionImpl", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nSpanImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanImpl.kt\ncom/bugsnag/android/performance/internal/SpanImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 JsonTraceWriter.kt\ncom/bugsnag/android/performance/internal/processing/JsonTraceWriter\n*L\n1#1,618:1\n321#1,12:632\n321#1,12:644\n321#1,12:656\n321#1,12:668\n321#1,12:680\n321#1,12:692\n321#1,12:704\n321#1,12:716\n321#1,12:728\n1855#2,2:619\n27#3,2:621\n93#3,2:623\n29#3,2:625\n95#3,3:627\n31#3,2:630\n*S KotlinDebug\n*F\n+ 1 SpanImpl.kt\ncom/bugsnag/android/performance/internal/SpanImpl\n*L\n231#1:632,12\n249#1:644,12\n258#1:656,12\n267#1:668,12\n276#1:680,12\n285#1:692,12\n294#1:704,12\n303#1:716,12\n312#1:728,12\n133#1:619,2\n174#1:621,2\n174#1:623,2\n174#1:625,2\n174#1:627,3\n174#1:630,2\n*E\n"})
/* loaded from: classes6.dex */
public final class SpanImpl implements Span, HasAttributes {
    private static final long INVALID_ID = 0;

    @Nullable
    private final AttributeLimits attributeLimits;

    @NotNull
    private final Attributes attributes;

    @NotNull
    private final String category;

    @Nullable
    private Set<ConditionImpl> conditions;
    private int customAttributesCount;
    private int droppedAttributesCount;
    private long endTime;
    private boolean isSealed;

    @NotNull
    private final SpanKind kind;
    private final boolean makeContext;

    @Nullable
    private final SpanMetricsSnapshot metrics;

    @NotNull
    private String name;

    @JvmField
    public /* synthetic */ SpanImpl next;
    private final long parentSpanId;

    @NotNull
    private final SpanProcessor processor;
    private double samplingProbability;
    private final double samplingValue;
    private final long spanId;
    private final long startTime;

    @NotNull
    private final AtomicInteger state;

    @NotNull
    private final TimeoutExecutor timeoutExecutor;

    @NotNull
    private final UUID traceId;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Random spanIdRandom = new Random(new SecureRandom().nextLong());

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/performance/internal/SpanImpl$Condition;", "", "cancel", "", "close", "endTime", "", "upgrade", "Lcom/bugsnag/android/performance/SpanContext;", "wrap", "Lcom/bugsnag/android/performance/Span;", "span", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Condition {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void close$default(Condition condition, long j, int i, Object obj) {
                if (obj != null) {
                    Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: close");
                    return;
                }
                if ((i & 1) != 0) {
                    j = SystemClock.elapsedRealtimeNanos();
                }
                condition.close(j);
            }

            @NotNull
            public static Span wrap(@NotNull final Condition condition, @NotNull final Span span) {
                span.getClass();
                return new Span(condition) { // from class: com.bugsnag.android.performance.internal.SpanImpl$Condition$wrap$1
                    private final /* synthetic */ Span $$delegate_0;
                    final /* synthetic */ SpanImpl.Condition this$0;

                    {
                        this.this$0 = condition;
                        this.$$delegate_0 = Span.this;
                    }

                    @Override // com.bugsnag.android.performance.Span, java.io.Closeable, java.lang.AutoCloseable
                    public void close() {
                        this.$$delegate_0.close();
                    }

                    @Override // com.bugsnag.android.performance.Span
                    public void end() {
                        Span.this.end();
                        SpanImpl.Condition.DefaultImpls.close$default(this.this$0, 0L, 1, null);
                    }

                    @Override // com.bugsnag.android.performance.Span
                    @NotNull
                    public String getName() {
                        return this.$$delegate_0.getName();
                    }

                    @Override // com.bugsnag.android.performance.SpanContext
                    public long getSpanId() {
                        return this.$$delegate_0.getSpanId();
                    }

                    @Override // com.bugsnag.android.performance.SpanContext
                    @NotNull
                    public UUID getTraceId() {
                        return this.$$delegate_0.getTraceId();
                    }

                    @Override // com.bugsnag.android.performance.Span
                    public boolean isEnded() {
                        return this.$$delegate_0.isEnded();
                    }

                    @Override // com.bugsnag.android.performance.HasAttributes
                    public void setAttribute(@NotNull String name, double value) {
                        name.getClass();
                        this.$$delegate_0.setAttribute(name, value);
                    }

                    @Override // com.bugsnag.android.performance.SpanContext
                    @NotNull
                    public Runnable wrap(@NotNull Runnable runnable) {
                        runnable.getClass();
                        return this.$$delegate_0.wrap(runnable);
                    }

                    @Override // com.bugsnag.android.performance.HasAttributes
                    public void setAttribute(@NotNull String name, int value) {
                        name.getClass();
                        this.$$delegate_0.setAttribute(name, value);
                    }

                    @Override // com.bugsnag.android.performance.HasAttributes
                    public void setAttribute(@NotNull String name, long value) {
                        name.getClass();
                        this.$$delegate_0.setAttribute(name, value);
                    }

                    @Override // com.bugsnag.android.performance.SpanContext
                    @NotNull
                    public <T> Callable<T> wrap(@NotNull Callable<T> callable) {
                        callable.getClass();
                        return this.$$delegate_0.wrap(callable);
                    }

                    @Override // com.bugsnag.android.performance.HasAttributes
                    public void setAttribute(@NotNull String name, @Nullable String value) {
                        name.getClass();
                        this.$$delegate_0.setAttribute(name, value);
                    }

                    @Override // com.bugsnag.android.performance.HasAttributes
                    public void setAttribute(@NotNull String name, @Nullable Collection<? extends Object> value) {
                        name.getClass();
                        this.$$delegate_0.setAttribute(name, value);
                    }

                    @Override // com.bugsnag.android.performance.HasAttributes
                    public void setAttribute(@NotNull String name, boolean value) {
                        name.getClass();
                        this.$$delegate_0.setAttribute(name, value);
                    }

                    @Override // com.bugsnag.android.performance.HasAttributes
                    public void setAttribute(@NotNull String name, @Nullable double[] value) {
                        name.getClass();
                        this.$$delegate_0.setAttribute(name, value);
                    }

                    @Override // com.bugsnag.android.performance.Span
                    public void end(long endTime) {
                        Span.this.end(endTime);
                        this.this$0.close(endTime);
                    }

                    @Override // com.bugsnag.android.performance.HasAttributes
                    public void setAttribute(@NotNull String name, @Nullable int[] value) {
                        name.getClass();
                        this.$$delegate_0.setAttribute(name, value);
                    }

                    @Override // com.bugsnag.android.performance.HasAttributes
                    public void setAttribute(@NotNull String name, @Nullable long[] value) {
                        name.getClass();
                        this.$$delegate_0.setAttribute(name, value);
                    }

                    @Override // com.bugsnag.android.performance.HasAttributes
                    public void setAttribute(@NotNull String name, @Nullable String[] value) {
                        name.getClass();
                        this.$$delegate_0.setAttribute(name, value);
                    }
                };
            }
        }

        void cancel();

        void close(long endTime);

        @Nullable
        SpanContext upgrade();

        @NotNull
        Span wrap(@NotNull Span span);
    }

    private SpanImpl(String str, String str2, SpanKind spanKind, long j, UUID uuid, long j2, long j3, boolean z, AttributeLimits attributeLimits, SpanMetricsSnapshot spanMetricsSnapshot, TimeoutExecutor timeoutExecutor, SpanProcessor spanProcessor) {
        this.category = str2;
        this.kind = spanKind;
        this.startTime = j;
        this.traceId = uuid;
        this.spanId = j2;
        this.parentSpanId = j3;
        this.makeContext = z;
        this.attributeLimits = attributeLimits;
        this.metrics = spanMetricsSnapshot;
        this.timeoutExecutor = timeoutExecutor;
        this.processor = spanProcessor;
        Attributes attributes = new Attributes();
        this.attributes = attributes;
        this.name = str;
        this.samplingProbability = 1.0d;
        this.state = SpanState.m23858constructorimpl();
        setSamplingProbability$bugsnag_android_performance_release(1.0d);
        attributes.set("bugsnag.span.category", str2);
        this.samplingValue = INSTANCE.samplingValueFor(getTraceId());
        if (z) {
            SpanContext.INSTANCE.attach$bugsnag_android_performance_release(this);
        }
    }

    private final void setAttributeImpl(String name, Function0<Unit> setter) {
        AttributeLimits attributeLimits = this.attributeLimits;
        int attributeCountLimit = attributeLimits != null ? attributeLimits.getAttributeCountLimit() : Integer.MAX_VALUE;
        if (this.isSealed) {
            return;
        }
        if (this.attributes.contains$bugsnag_android_performance_release(name)) {
            setter.invoke();
        } else if (this.customAttributesCount >= attributeCountLimit) {
            this.droppedAttributesCount++;
        } else {
            setter.invoke();
            this.customAttributesCount++;
        }
    }

    @Nullable
    public final Condition block(long timeoutMs) {
        synchronized (this) {
            if (!SpanState.m23856blockimpl(this.state) && this.conditions == null) {
                Unit unit = Unit.INSTANCE;
                return null;
            }
            if (this.conditions == null) {
                this.conditions = new HashSet();
            }
            ConditionImpl conditionImpl = new ConditionImpl(this, SystemClock.elapsedRealtime() + timeoutMs);
            this.timeoutExecutor.scheduleTimeout(conditionImpl);
            Set<ConditionImpl> set = this.conditions;
            if (set != null) {
                set.add(conditionImpl);
            }
            return conditionImpl;
        }
    }

    @Override // com.bugsnag.android.performance.Span, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Span.DefaultImpls.close(this);
    }

    public final void discard() {
        if (SpanState.m23860discardimpl(this.state)) {
            if (this.conditions != null) {
                synchronized (this) {
                    try {
                        Set<ConditionImpl> set = this.conditions;
                        if (set != null) {
                            Iterator<T> it2 = set.iterator();
                            while (it2.hasNext()) {
                                ((ConditionImpl) it2.next()).cancel();
                            }
                        }
                        this.conditions = null;
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            NotifierIntegration.INSTANCE.onSpanEnded(this);
            if (this.makeContext) {
                SpanContext.INSTANCE.detach$bugsnag_android_performance_release(this);
            }
        }
    }

    @Override // com.bugsnag.android.performance.Span
    public void end(long endTime) {
        if (SpanState.m23862endingimpl(this.state)) {
            markEndTime$internal(endTime);
            if (this.makeContext) {
                SpanContext.INSTANCE.detach$bugsnag_android_performance_release(this);
            }
            NotifierIntegration.INSTANCE.onSpanEnded(this);
            SpanState.m23861endimpl(this.state);
            if (isBlocked()) {
                return;
            }
            sendForProcessing$internal();
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SpanImpl.class, other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        SpanImpl spanImpl = (SpanImpl) other;
        return Intrinsics.areEqual(getTraceId(), spanImpl.getTraceId()) && getSpanId() == spanImpl.getSpanId() && this.parentSpanId == spanImpl.parentSpanId;
    }

    @NotNull
    public final Attributes getAttributes() {
        return this.attributes;
    }

    @NotNull
    /* renamed from: getCategory-haBhItc$bugsnag_android_performance_release, reason: not valid java name and from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: getDroppedAttributesCount$bugsnag_android_performance_release, reason: from getter */
    public final int getDroppedAttributesCount() {
        return this.droppedAttributesCount;
    }

    @JvmName(name = "getEndTime$internal")
    /* renamed from: getEndTime$internal, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* renamed from: getKind$bugsnag_android_performance_release, reason: from getter */
    public final SpanKind getKind() {
        return this.kind;
    }

    @Nullable
    /* renamed from: getMetrics$bugsnag_android_performance_release, reason: from getter */
    public final SpanMetricsSnapshot getMetrics() {
        return this.metrics;
    }

    @Override // com.bugsnag.android.performance.Span
    @NotNull
    public String getName() {
        return this.name;
    }

    public final long getParentSpanId() {
        return this.parentSpanId;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    /* renamed from: getSamplingProbability$bugsnag_android_performance_release, reason: from getter */
    public final double getSamplingProbability() {
        return this.samplingProbability;
    }

    /* renamed from: getSamplingValue$bugsnag_android_performance_release, reason: from getter */
    public final double getSamplingValue() {
        return this.samplingValue;
    }

    @Override // com.bugsnag.android.performance.SpanContext
    public long getSpanId() {
        return this.spanId;
    }

    @JvmName(name = "getStartTime$internal")
    /* renamed from: getStartTime$internal, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @JvmName(name = "getTimeoutExecutor$internal")
    @NotNull
    /* renamed from: getTimeoutExecutor$internal, reason: from getter */
    public final TimeoutExecutor getTimeoutExecutor() {
        return this.timeoutExecutor;
    }

    @Override // com.bugsnag.android.performance.SpanContext
    @NotNull
    public UUID getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        return Long.hashCode(this.parentSpanId) + ((Long.hashCode(getSpanId()) + (getTraceId().hashCode() * 31)) * 31);
    }

    public final boolean isBlocked() {
        if (!SpanState.m23866isBlockedimpl(this.state)) {
            return false;
        }
        Set<ConditionImpl> set = this.conditions;
        return set == null || (set != null && (set.isEmpty() ^ true));
    }

    @Override // com.bugsnag.android.performance.Span
    public boolean isEnded() {
        return !SpanState.m23868isOpenimpl(this.state);
    }

    public final boolean isOpen() {
        return SpanState.m23868isOpenimpl(this.state);
    }

    public final boolean isSampled() {
        return this.samplingValue <= this.samplingProbability;
    }

    /* renamed from: isSealed$bugsnag_android_performance_release, reason: from getter */
    public final boolean getIsSealed() {
        return this.isSealed;
    }

    @JvmName(name = "markEndTime$internal")
    public final void markEndTime$internal(long endTime) {
        this.endTime = endTime;
        SpanMetricsSnapshot spanMetricsSnapshot = this.metrics;
        if (spanMetricsSnapshot != null) {
            spanMetricsSnapshot.finish(this);
        }
    }

    @JvmName(name = "sendForProcessing$internal")
    public final void sendForProcessing$internal() {
        if (SpanState.m23869processimpl(this.state)) {
            this.processor.onEnd(this);
        }
    }

    @Override // com.bugsnag.android.performance.HasAttributes
    public void setAttribute(@NotNull String name, @Nullable String value) {
        name.getClass();
        AttributeLimits attributeLimits = this.attributeLimits;
        int attributeCountLimit = attributeLimits != null ? attributeLimits.getAttributeCountLimit() : Integer.MAX_VALUE;
        if (this.isSealed) {
            return;
        }
        if (this.attributes.contains$bugsnag_android_performance_release(name)) {
            this.attributes.set(name, value);
        } else if (this.customAttributesCount >= attributeCountLimit) {
            this.droppedAttributesCount++;
        } else {
            this.attributes.set(name, value);
            this.customAttributesCount++;
        }
    }

    public final void setDroppedAttributesCount$bugsnag_android_performance_release(int i) {
        this.droppedAttributesCount = i;
    }

    public void setName$bugsnag_android_performance_release(@NotNull String str) {
        str.getClass();
        if (isEnded()) {
            return;
        }
        this.name = str;
    }

    public final void setSamplingProbability$bugsnag_android_performance_release(@FloatRange(from = 0.0d, to = 1.0d) double d) {
        double coerceIn = RangesKt.coerceIn(d, 0.0d, 1.0d);
        this.samplingProbability = coerceIn;
        this.attributes.set("bugsnag.sampling.p", coerceIn);
    }

    public final void setSealed$bugsnag_android_performance_release(boolean z) {
        this.isSealed = z;
    }

    public final void toJson$bugsnag_android_performance_release(@NotNull JsonTraceWriter json) {
        json.getClass();
        json.setCurrentSpan$bugsnag_android_performance_release(this);
        json.beginObject();
        json.name("name").value(getName());
        json.name(ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME).value(this.kind.otelOrdinal);
        json.name("spanId").value(EncodingUtils.toHexString(getSpanId()));
        json.name("traceId").value(EncodingUtils.toHexString(getTraceId()));
        JsonTraceWriter name = json.name("startTimeUnixNano");
        BugsnagClock bugsnagClock = BugsnagClock.INSTANCE;
        name.value(String.valueOf(bugsnagClock.elapsedNanosToUnixTime(this.startTime)));
        json.name("endTimeUnixNano").value(String.valueOf(bugsnagClock.elapsedNanosToUnixTime(this.endTime)));
        if (this.parentSpanId != 0) {
            json.name("parentSpanId").value(EncodingUtils.toHexString(this.parentSpanId));
        }
        if (this.attributes.getSize() > 0) {
            json.name("attributes").value(this.attributes);
        }
        if (this.droppedAttributesCount > 0) {
            json.name("droppedAttributesCount").value(this.droppedAttributesCount);
        }
        json.endObject();
        json.setCurrentSpan$bugsnag_android_performance_release(null);
    }

    @NotNull
    public String toString() {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m("Span(");
        m.append(this.kind);
        m.append(' ');
        m.append(getName());
        m.append(", id=");
        EncodingUtils.appendHexLong(m, getSpanId());
        if (this.parentSpanId != 0) {
            m.append(", parentId=");
            EncodingUtils.appendHexLong(m, this.parentSpanId);
        }
        m.append(", traceId=");
        EncodingUtils.appendHexLong(EncodingUtils.appendHexLong(m, getTraceId().getMostSignificantBits()), getTraceId().getLeastSignificantBits());
        m.append(", startTime=");
        m.append(this.startTime);
        if (SpanState.m23868isOpenimpl(this.state)) {
            m.append(", no endTime");
        } else {
            m.append(", endTime=");
            m.append(this.endTime);
        }
        m.append(')');
        return m.toString();
    }

    @Override // com.bugsnag.android.performance.SpanContext
    @NotNull
    public Runnable wrap(@NotNull Runnable runnable) {
        return Span.DefaultImpls.wrap(this, runnable);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/performance/internal/SpanImpl$Companion;", "", "()V", "INVALID_ID", "", "spanIdRandom", "Ljava/util/Random;", "nextSpanId", "samplingValueFor", "", "traceId", "Ljava/util/UUID;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long nextSpanId() {
            long nextLong;
            do {
                nextLong = SpanImpl.spanIdRandom.nextLong();
            } while (nextLong == 0);
            return nextLong;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final double samplingValueFor(UUID traceId) {
            long mostSignificantBits = traceId.getMostSignificantBits() >>> 1;
            if (mostSignificantBits == 0) {
                return 0.0d;
            }
            return mostSignificantBits / 9.223372036854776E18d;
        }

        private Companion() {
        }
    }

    @Override // com.bugsnag.android.performance.SpanContext
    @NotNull
    public <T> Callable<T> wrap(@NotNull Callable<T> callable) {
        return Span.DefaultImpls.wrap(this, callable);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0019\u0010\u0011\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013H\u0082\bJ\b\u0010\u0014\u001a\u00020\u000eH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/bugsnag/android/performance/internal/SpanImpl$ConditionImpl;", "Lcom/bugsnag/android/performance/internal/SpanImpl$Condition;", "Lcom/bugsnag/android/performance/internal/processing/Timeout;", "span", "Lcom/bugsnag/android/performance/internal/SpanImpl;", "target", "", "(Lcom/bugsnag/android/performance/internal/SpanImpl;J)V", "isUpgraded", "", "isValid", "getTarget", "()J", "cancel", "", "close", "endTime", "releaseCondition", "completeRelease", "Lkotlin/Function0;", "run", "toString", "", "upgrade", "Lcom/bugsnag/android/performance/SpanContext;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSpanImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanImpl.kt\ncom/bugsnag/android/performance/internal/SpanImpl$ConditionImpl\n+ 2 SpanImpl.kt\ncom/bugsnag/android/performance/internal/SpanImpl$ConditionImpl$releaseCondition$1\n*L\n1#1,618:1\n473#1,18:619\n472#1,12:637\n485#1,6:650\n472#2:649\n*S KotlinDebug\n*F\n+ 1 SpanImpl.kt\ncom/bugsnag/android/performance/internal/SpanImpl$ConditionImpl\n*L\n438#1:619,18\n468#1:637,12\n468#1:650,6\n468#1:649\n*E\n"})
    public static final class ConditionImpl implements Condition, Timeout {
        private boolean isUpgraded;
        private boolean isValid;

        @NotNull
        private final SpanImpl span;
        private final long target;

        public ConditionImpl(@NotNull SpanImpl spanImpl, long j) {
            spanImpl.getClass();
            this.span = spanImpl;
            this.target = j;
            this.isValid = true;
        }

        private final void releaseCondition(Function0<Unit> completeRelease) {
            synchronized (this.span) {
                try {
                    if (!this.isValid) {
                        InlineMarker.finallyStart(2);
                        InlineMarker.finallyEnd(2);
                        return;
                    }
                    this.isValid = false;
                    Set set = this.span.conditions;
                    if (set != null) {
                        set.remove(this);
                    }
                    this.span.getTimeoutExecutor().cancelTimeout(this);
                    completeRelease.invoke();
                    Set set2 = this.span.conditions;
                    if ((set2 == null || set2.isEmpty()) && this.span.isEnded()) {
                        this.span.sendForProcessing$internal();
                    }
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
        }

        public static /* synthetic */ void releaseCondition$default(ConditionImpl conditionImpl, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = new Function0<Unit>() { // from class: com.bugsnag.android.performance.internal.SpanImpl$ConditionImpl$releaseCondition$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }
                };
            }
            synchronized (conditionImpl.span) {
                try {
                    if (!conditionImpl.isValid) {
                        InlineMarker.finallyStart(2);
                        InlineMarker.finallyEnd(2);
                        return;
                    }
                    conditionImpl.isValid = false;
                    Set set = conditionImpl.span.conditions;
                    if (set != null) {
                        set.remove(conditionImpl);
                    }
                    conditionImpl.span.getTimeoutExecutor().cancelTimeout(conditionImpl);
                    function0.invoke();
                    Set set2 = conditionImpl.span.conditions;
                    if ((set2 == null || set2.isEmpty()) && conditionImpl.span.isEnded()) {
                        conditionImpl.span.sendForProcessing$internal();
                    }
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                } catch (Throwable th) {
                    InlineMarker.finallyStart(1);
                    InlineMarker.finallyEnd(1);
                    throw th;
                }
            }
        }

        @Override // com.bugsnag.android.performance.internal.SpanImpl.Condition
        public void cancel() {
            synchronized (this.span) {
                if (this.isUpgraded) {
                    return;
                }
                synchronized (this.span) {
                    try {
                        if (this.isValid) {
                            this.isValid = false;
                            Set set = this.span.conditions;
                            if (set != null) {
                                set.remove(this);
                            }
                            this.span.getTimeoutExecutor().cancelTimeout(this);
                            Set set2 = this.span.conditions;
                            if ((set2 == null || set2.isEmpty()) && this.span.isEnded()) {
                                this.span.sendForProcessing$internal();
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }

        @Override // com.bugsnag.android.performance.internal.SpanImpl.Condition
        public void close(long endTime) {
            synchronized (this.span) {
                try {
                    if (this.isValid) {
                        this.isValid = false;
                        Set set = this.span.conditions;
                        if (set != null) {
                            set.remove(this);
                        }
                        this.span.getTimeoutExecutor().cancelTimeout(this);
                        if (this.isUpgraded) {
                            SpanImpl spanImpl = this.span;
                            spanImpl.endTime = Math.max(endTime, spanImpl.getEndTime());
                        }
                        Set set2 = this.span.conditions;
                        if ((set2 == null || set2.isEmpty()) && this.span.isEnded()) {
                            this.span.sendForProcessing$internal();
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.bugsnag.android.performance.internal.processing.Timeout, java.util.concurrent.Delayed
        public long getDelay(@NotNull TimeUnit timeUnit) {
            return Timeout.DefaultImpls.getDelay(this, timeUnit);
        }

        @Override // com.bugsnag.android.performance.internal.processing.Timeout
        public long getRelativeMs() {
            return Timeout.DefaultImpls.getRelativeMs(this);
        }

        @Override // com.bugsnag.android.performance.internal.processing.Timeout
        public long getTarget() {
            return this.target;
        }

        @Override // java.lang.Runnable
        public void run() {
            cancel();
        }

        @NotNull
        public String toString() {
            return "Condition[isValid=" + this.isValid + ", isUpgraded=" + this.isUpgraded + ", span=" + this.span + AbstractJsonLexerKt.END_LIST;
        }

        @Override // com.bugsnag.android.performance.internal.SpanImpl.Condition
        @Nullable
        public SpanContext upgrade() {
            synchronized (this.span) {
                if (!this.isValid) {
                    return null;
                }
                this.span.getTimeoutExecutor().cancelTimeout(this);
                this.isUpgraded = true;
                return this.span;
            }
        }

        @Override // com.bugsnag.android.performance.internal.SpanImpl.Condition
        @NotNull
        public Span wrap(@NotNull Span span) {
            return Condition.DefaultImpls.wrap(this, span);
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull Delayed delayed) {
            return Timeout.DefaultImpls.compareTo(this, delayed);
        }
    }

    @Override // com.bugsnag.android.performance.Span
    public void end() {
        end(SystemClock.elapsedRealtimeNanos());
    }

    @Override // com.bugsnag.android.performance.HasAttributes
    public void setAttribute(@NotNull String name, long value) {
        name.getClass();
        if (this.isSealed) {
            return;
        }
        this.attributes.set(name, value);
    }

    @Override // com.bugsnag.android.performance.HasAttributes
    public void setAttribute(@NotNull String name, int value) {
        name.getClass();
        AttributeLimits attributeLimits = this.attributeLimits;
        int attributeCountLimit = attributeLimits != null ? attributeLimits.getAttributeCountLimit() : Integer.MAX_VALUE;
        if (this.isSealed) {
            return;
        }
        if (this.attributes.contains$bugsnag_android_performance_release(name)) {
            this.attributes.set(name, value);
        } else if (this.customAttributesCount < attributeCountLimit) {
            this.attributes.set(name, value);
            this.customAttributesCount++;
        } else {
            this.droppedAttributesCount++;
        }
    }

    @Override // com.bugsnag.android.performance.HasAttributes
    public void setAttribute(@NotNull String name, double value) {
        name.getClass();
        AttributeLimits attributeLimits = this.attributeLimits;
        int attributeCountLimit = attributeLimits != null ? attributeLimits.getAttributeCountLimit() : Integer.MAX_VALUE;
        if (this.isSealed) {
            return;
        }
        if (this.attributes.contains$bugsnag_android_performance_release(name)) {
            this.attributes.set(name, value);
        } else if (this.customAttributesCount < attributeCountLimit) {
            this.attributes.set(name, value);
            this.customAttributesCount++;
        } else {
            this.droppedAttributesCount++;
        }
    }

    public /* synthetic */ SpanImpl(String str, String str2, SpanKind spanKind, long j, UUID uuid, long j2, long j3, boolean z, AttributeLimits attributeLimits, SpanMetricsSnapshot spanMetricsSnapshot, TimeoutExecutor timeoutExecutor, SpanProcessor spanProcessor, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, spanKind, j, uuid, j2, j3, z, attributeLimits, spanMetricsSnapshot, timeoutExecutor, spanProcessor);
    }

    public /* synthetic */ SpanImpl(String str, String str2, SpanKind spanKind, long j, UUID uuid, long j2, long j3, boolean z, AttributeLimits attributeLimits, SpanMetricsSnapshot spanMetricsSnapshot, TimeoutExecutor timeoutExecutor, SpanProcessor spanProcessor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, spanKind, j, uuid, (i & 32) != 0 ? INSTANCE.nextSpanId() : j2, j3, z, attributeLimits, spanMetricsSnapshot, timeoutExecutor, spanProcessor, null);
    }

    @Override // com.bugsnag.android.performance.HasAttributes
    public void setAttribute(@NotNull String name, boolean value) {
        name.getClass();
        AttributeLimits attributeLimits = this.attributeLimits;
        int attributeCountLimit = attributeLimits != null ? attributeLimits.getAttributeCountLimit() : Integer.MAX_VALUE;
        if (this.isSealed) {
            return;
        }
        if (this.attributes.contains$bugsnag_android_performance_release(name)) {
            this.attributes.set(name, value);
        } else if (this.customAttributesCount < attributeCountLimit) {
            this.attributes.set(name, value);
            this.customAttributesCount++;
        } else {
            this.droppedAttributesCount++;
        }
    }

    @Override // com.bugsnag.android.performance.HasAttributes
    public void setAttribute(@NotNull String name, @Nullable String[] value) {
        name.getClass();
        AttributeLimits attributeLimits = this.attributeLimits;
        int attributeCountLimit = attributeLimits != null ? attributeLimits.getAttributeCountLimit() : Integer.MAX_VALUE;
        if (this.isSealed) {
            return;
        }
        if (this.attributes.contains$bugsnag_android_performance_release(name)) {
            this.attributes.set(name, value);
        } else if (this.customAttributesCount < attributeCountLimit) {
            this.attributes.set(name, value);
            this.customAttributesCount++;
        } else {
            this.droppedAttributesCount++;
        }
    }

    @Override // com.bugsnag.android.performance.HasAttributes
    public void setAttribute(@NotNull String name, @Nullable Collection<? extends Object> value) {
        name.getClass();
        AttributeLimits attributeLimits = this.attributeLimits;
        int attributeCountLimit = attributeLimits != null ? attributeLimits.getAttributeCountLimit() : Integer.MAX_VALUE;
        if (this.isSealed) {
            return;
        }
        if (this.attributes.contains$bugsnag_android_performance_release(name)) {
            this.attributes.set(name, value);
        } else if (this.customAttributesCount < attributeCountLimit) {
            this.attributes.set(name, value);
            this.customAttributesCount++;
        } else {
            this.droppedAttributesCount++;
        }
    }

    @Override // com.bugsnag.android.performance.HasAttributes
    public void setAttribute(@NotNull String name, @Nullable int[] value) {
        name.getClass();
        AttributeLimits attributeLimits = this.attributeLimits;
        int attributeCountLimit = attributeLimits != null ? attributeLimits.getAttributeCountLimit() : Integer.MAX_VALUE;
        if (this.isSealed) {
            return;
        }
        if (this.attributes.contains$bugsnag_android_performance_release(name)) {
            this.attributes.set(name, value);
        } else if (this.customAttributesCount < attributeCountLimit) {
            this.attributes.set(name, value);
            this.customAttributesCount++;
        } else {
            this.droppedAttributesCount++;
        }
    }

    @Override // com.bugsnag.android.performance.HasAttributes
    public void setAttribute(@NotNull String name, @Nullable long[] value) {
        name.getClass();
        AttributeLimits attributeLimits = this.attributeLimits;
        int attributeCountLimit = attributeLimits != null ? attributeLimits.getAttributeCountLimit() : Integer.MAX_VALUE;
        if (this.isSealed) {
            return;
        }
        if (this.attributes.contains$bugsnag_android_performance_release(name)) {
            this.attributes.set(name, value);
        } else if (this.customAttributesCount < attributeCountLimit) {
            this.attributes.set(name, value);
            this.customAttributesCount++;
        } else {
            this.droppedAttributesCount++;
        }
    }

    @Override // com.bugsnag.android.performance.HasAttributes
    public void setAttribute(@NotNull String name, @Nullable double[] value) {
        name.getClass();
        AttributeLimits attributeLimits = this.attributeLimits;
        int attributeCountLimit = attributeLimits != null ? attributeLimits.getAttributeCountLimit() : Integer.MAX_VALUE;
        if (this.isSealed) {
            return;
        }
        if (this.attributes.contains$bugsnag_android_performance_release(name)) {
            this.attributes.set(name, value);
        } else if (this.customAttributesCount < attributeCountLimit) {
            this.attributes.set(name, value);
            this.customAttributesCount++;
        } else {
            this.droppedAttributesCount++;
        }
    }
}
