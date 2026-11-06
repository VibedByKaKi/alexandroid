package com.amazon.alexa.perfusermonitoring.internal;

import com.amazon.alexa.perfusermonitoring.api.PerformanceSpan;
import com.bugsnag.android.performance.Span;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012<\b\u0002\u0010\u0006\u001a6\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\u0004\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\b\u0012\b\b\u0004\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u0006\u001a6\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\b\u0012\b\b\u0004\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\b\u0012\b\b\u0004\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/perfusermonitoring/internal/PerformanceSpanImpl;", "Lcom/amazon/alexa/perfusermonitoring/api/PerformanceSpan;", "bugsnagSpan", "Lcom/bugsnag/android/performance/Span;", "name", "", "onEnded", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "endTime", "", "(Lcom/bugsnag/android/performance/Span;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "getBugsnagSpan$AlexaMobileAndroidPerformanceUserMonitoring_release", "()Lcom/bugsnag/android/performance/Span;", "end", "setAttribute", "value", "AlexaMobileAndroidPerformanceUserMonitoring_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PerformanceSpanImpl implements PerformanceSpan {

    @NotNull
    private final Span bugsnagSpan;

    @NotNull
    private final String name;

    @Nullable
    private final Function2<String, Long, Unit> onEnded;

    /* JADX WARN: Multi-variable type inference failed */
    public PerformanceSpanImpl(@NotNull Span span, @NotNull String str, @Nullable Function2<? super String, ? super Long, Unit> function2) {
        span.getClass();
        str.getClass();
        this.bugsnagSpan = span;
        this.name = str;
        this.onEnded = function2;
    }

    @Override // com.amazon.alexa.perfusermonitoring.api.PerformanceSpan
    public void end() {
        long currentTimeMillis = System.currentTimeMillis();
        this.bugsnagSpan.end(Utils.INSTANCE.convertToNanosOrGetCurrent$AlexaMobileAndroidPerformanceUserMonitoring_release(Long.valueOf(currentTimeMillis)));
        Function2<String, Long, Unit> function2 = this.onEnded;
        if (function2 != null) {
            function2.invoke(this.name, Long.valueOf(currentTimeMillis));
        }
    }

    @NotNull
    /* renamed from: getBugsnagSpan$AlexaMobileAndroidPerformanceUserMonitoring_release, reason: from getter */
    public final Span getBugsnagSpan() {
        return this.bugsnagSpan;
    }

    @Override // com.amazon.alexa.perfusermonitoring.api.PerformanceSpan
    public void setAttribute(@NotNull String name, @NotNull String value) {
        name.getClass();
        value.getClass();
        this.bugsnagSpan.setAttribute(Utils.INSTANCE.buildKeyWithDefaultCategory$AlexaMobileAndroidPerformanceUserMonitoring_release(name), value);
    }

    public /* synthetic */ PerformanceSpanImpl(Span span, String str, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(span, str, (i & 4) != 0 ? null : function2);
    }

    @Override // com.amazon.alexa.perfusermonitoring.api.PerformanceSpan
    public void end(long endTime) {
        this.bugsnagSpan.end(Utils.INSTANCE.convertToNanosOrGetCurrent$AlexaMobileAndroidPerformanceUserMonitoring_release(Long.valueOf(endTime)));
        Function2<String, Long, Unit> function2 = this.onEnded;
        if (function2 != null) {
            function2.invoke(this.name, Long.valueOf(endTime));
        }
    }
}
