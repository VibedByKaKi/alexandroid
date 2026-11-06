package com.bugsnag.android.performance;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/performance/SpanMetrics;", "", "rendering", "", "cpu", "memory", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCpu", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMemory", "getRendering", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SpanMetrics {

    @Nullable
    private final Boolean cpu;

    @Nullable
    private final Boolean memory;

    @Nullable
    private final Boolean rendering;

    public /* synthetic */ SpanMetrics(Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof SpanMetrics)) {
            return false;
        }
        SpanMetrics spanMetrics = (SpanMetrics) other;
        return Intrinsics.areEqual(this.rendering, spanMetrics.rendering) && Intrinsics.areEqual(this.cpu, spanMetrics.cpu) && Intrinsics.areEqual(this.memory, spanMetrics.memory);
    }

    @Nullable
    public final Boolean getCpu() {
        return this.cpu;
    }

    @Nullable
    public final Boolean getMemory() {
        return this.memory;
    }

    @Nullable
    public final Boolean getRendering() {
        return this.rendering;
    }

    public int hashCode() {
        Boolean bool = this.rendering;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.cpu;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.memory;
        return hashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpanMetrics(rendering=" + this.rendering + ", cpu=" + this.cpu + ", memory=" + this.memory + ')';
    }

    public SpanMetrics(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.rendering = bool;
        this.cpu = bool2;
        this.memory = bool3;
    }

    public SpanMetrics() {
        this(null, null, null, 7, null);
    }
}
