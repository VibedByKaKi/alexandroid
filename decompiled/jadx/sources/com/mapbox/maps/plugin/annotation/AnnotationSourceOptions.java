package com.mapbox.maps.plugin.annotation;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JJ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/AnnotationSourceOptions;", "", "maxZoom", "", "buffer", "lineMetrics", "", "tolerance", "", "clusterOptions", "Lcom/mapbox/maps/plugin/annotation/ClusterOptions;", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Double;Lcom/mapbox/maps/plugin/annotation/ClusterOptions;)V", "getBuffer", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getClusterOptions", "()Lcom/mapbox/maps/plugin/annotation/ClusterOptions;", "getLineMetrics", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxZoom", "getTolerance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Double;Lcom/mapbox/maps/plugin/annotation/ClusterOptions;)Lcom/mapbox/maps/plugin/annotation/AnnotationSourceOptions;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AnnotationSourceOptions {

    @Nullable
    private final Long buffer;

    @Nullable
    private final ClusterOptions clusterOptions;

    @Nullable
    private final Boolean lineMetrics;

    @Nullable
    private final Long maxZoom;

    @Nullable
    private final Double tolerance;

    public /* synthetic */ AnnotationSourceOptions(Long l, Long l2, Boolean bool, Double d, ClusterOptions clusterOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : clusterOptions);
    }

    public static /* synthetic */ AnnotationSourceOptions copy$default(AnnotationSourceOptions annotationSourceOptions, Long l, Long l2, Boolean bool, Double d, ClusterOptions clusterOptions, int i, Object obj) {
        if ((i & 1) != 0) {
            l = annotationSourceOptions.maxZoom;
        }
        if ((i & 2) != 0) {
            l2 = annotationSourceOptions.buffer;
        }
        if ((i & 4) != 0) {
            bool = annotationSourceOptions.lineMetrics;
        }
        if ((i & 8) != 0) {
            d = annotationSourceOptions.tolerance;
        }
        if ((i & 16) != 0) {
            clusterOptions = annotationSourceOptions.clusterOptions;
        }
        ClusterOptions clusterOptions2 = clusterOptions;
        Boolean bool2 = bool;
        return annotationSourceOptions.copy(l, l2, bool2, d, clusterOptions2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Long getMaxZoom() {
        return this.maxZoom;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Long getBuffer() {
        return this.buffer;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getLineMetrics() {
        return this.lineMetrics;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getTolerance() {
        return this.tolerance;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final ClusterOptions getClusterOptions() {
        return this.clusterOptions;
    }

    @NotNull
    public final AnnotationSourceOptions copy(@Nullable Long maxZoom, @Nullable Long buffer, @Nullable Boolean lineMetrics, @Nullable Double tolerance, @Nullable ClusterOptions clusterOptions) {
        return new AnnotationSourceOptions(maxZoom, buffer, lineMetrics, tolerance, clusterOptions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotationSourceOptions)) {
            return false;
        }
        AnnotationSourceOptions annotationSourceOptions = (AnnotationSourceOptions) other;
        return Intrinsics.areEqual(this.maxZoom, annotationSourceOptions.maxZoom) && Intrinsics.areEqual(this.buffer, annotationSourceOptions.buffer) && Intrinsics.areEqual(this.lineMetrics, annotationSourceOptions.lineMetrics) && Intrinsics.areEqual((Object) this.tolerance, (Object) annotationSourceOptions.tolerance) && Intrinsics.areEqual(this.clusterOptions, annotationSourceOptions.clusterOptions);
    }

    @Nullable
    public final Long getBuffer() {
        return this.buffer;
    }

    @Nullable
    public final ClusterOptions getClusterOptions() {
        return this.clusterOptions;
    }

    @Nullable
    public final Boolean getLineMetrics() {
        return this.lineMetrics;
    }

    @Nullable
    public final Long getMaxZoom() {
        return this.maxZoom;
    }

    @Nullable
    public final Double getTolerance() {
        return this.tolerance;
    }

    public int hashCode() {
        Long l = this.maxZoom;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.buffer;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.lineMetrics;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d = this.tolerance;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        ClusterOptions clusterOptions = this.clusterOptions;
        return hashCode4 + (clusterOptions != null ? clusterOptions.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AnnotationSourceOptions(maxZoom=" + this.maxZoom + ", buffer=" + this.buffer + ", lineMetrics=" + this.lineMetrics + ", tolerance=" + this.tolerance + ", clusterOptions=" + this.clusterOptions + ')';
    }

    @JvmOverloads
    public AnnotationSourceOptions(@Nullable Long l) {
        this(l, null, null, null, null, 30, null);
    }

    @JvmOverloads
    public AnnotationSourceOptions(@Nullable Long l, @Nullable Long l2) {
        this(l, l2, null, null, null, 28, null);
    }

    @JvmOverloads
    public AnnotationSourceOptions(@Nullable Long l, @Nullable Long l2, @Nullable Boolean bool) {
        this(l, l2, bool, null, null, 24, null);
    }

    @JvmOverloads
    public AnnotationSourceOptions(@Nullable Long l, @Nullable Long l2, @Nullable Boolean bool, @Nullable Double d) {
        this(l, l2, bool, d, null, 16, null);
    }

    @JvmOverloads
    public AnnotationSourceOptions(@Nullable Long l, @Nullable Long l2, @Nullable Boolean bool, @Nullable Double d, @Nullable ClusterOptions clusterOptions) {
        this.maxZoom = l;
        this.buffer = l2;
        this.lineMetrics = bool;
        this.tolerance = d;
        this.clusterOptions = clusterOptions;
    }

    @JvmOverloads
    public AnnotationSourceOptions() {
        this(null, null, null, null, null, 31, null);
    }
}
