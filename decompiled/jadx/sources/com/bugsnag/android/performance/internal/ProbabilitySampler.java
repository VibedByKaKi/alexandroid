package com.bugsnag.android.performance.internal;

import androidx.annotation.FloatRange;
import com.bugsnag.android.performance.internal.Sampler;
import java.util.Collection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/performance/internal/ProbabilitySampler;", "Lcom/bugsnag/android/performance/internal/Sampler;", "sampleProbability", "", "(D)V", "getSampleProbability", "()D", "setSampleProbability", "shouldKeepSpan", "", "span", "Lcom/bugsnag/android/performance/internal/SpanImpl;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProbabilitySampler implements Sampler {
    private double sampleProbability;

    public ProbabilitySampler(@FloatRange(from = 0.0d, to = 1.0d) double d) {
        this.sampleProbability = d;
    }

    @Override // com.bugsnag.android.performance.internal.Sampler
    public double getSampleProbability() {
        return this.sampleProbability;
    }

    @Override // com.bugsnag.android.performance.internal.Sampler
    @NotNull
    public Collection<SpanImpl> sampled(@NotNull Collection<SpanImpl> collection) {
        return Sampler.DefaultImpls.sampled(this, collection);
    }

    public void setSampleProbability(double d) {
        this.sampleProbability = d;
    }

    @Override // com.bugsnag.android.performance.internal.Sampler
    public boolean shouldKeepSpan(@NotNull SpanImpl span) {
        span.getClass();
        double sampleProbability = getSampleProbability();
        if (sampleProbability < span.getSamplingProbability()) {
            span.setSamplingProbability$bugsnag_android_performance_release(sampleProbability);
        }
        return sampleProbability > 0.0d && span.getSamplingValue() <= sampleProbability;
    }
}
