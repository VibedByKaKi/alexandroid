package com.mapbox.maps.plugin.annotation;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.mapbox.bindgen.Value;
import com.reactcommunity.rndatetimepicker.Common;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001BÃ\u0001\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00140\u0013\u0012(\b\u0002\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016j\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0018¢\u0006\u0002\u0010\u0019J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u001b\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00140\u0013HÆ\u0003J)\u00102\u001a\"\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016j\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0018HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003JÅ\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00140\u00132(\b\u0002\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016j\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0018HÆ\u0001J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\fHÖ\u0001J\t\u0010?\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R1\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016j\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0018¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R#\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001d¨\u0006@"}, d2 = {"Lcom/mapbox/maps/plugin/annotation/ClusterOptions;", "", "cluster", "", "clusterRadius", "", "circleRadiusExpression", "Lcom/mapbox/bindgen/Value;", "circleRadius", "", "textColorExpression", Common.TEXT_COLOR, "", "textSizeExpression", "textSize", "textField", "clusterMaxZoom", "clusterMinPoints", "colorLevels", "", "Lkotlin/Pair;", "clusterProperties", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(ZJLcom/mapbox/bindgen/Value;DLcom/mapbox/bindgen/Value;ILcom/mapbox/bindgen/Value;DLcom/mapbox/bindgen/Value;JJLjava/util/List;Ljava/util/HashMap;)V", "getCircleRadius", "()D", "getCircleRadiusExpression", "()Lcom/mapbox/bindgen/Value;", "getCluster", "()Z", "getClusterMaxZoom", "()J", "getClusterMinPoints", "getClusterProperties", "()Ljava/util/HashMap;", "getClusterRadius", "getColorLevels", "()Ljava/util/List;", "getTextColor", "()I", "getTextColorExpression", "getTextField", "getTextSize", "getTextSizeExpression", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ClusterOptions {
    private final double circleRadius;

    @Nullable
    private final Value circleRadiusExpression;
    private final boolean cluster;
    private final long clusterMaxZoom;
    private final long clusterMinPoints;

    @Nullable
    private final HashMap<String, Object> clusterProperties;
    private final long clusterRadius;

    @NotNull
    private final List<Pair<Integer, Integer>> colorLevels;
    private final int textColor;

    @Nullable
    private final Value textColorExpression;

    @Nullable
    private final Value textField;
    private final double textSize;

    @Nullable
    private final Value textSizeExpression;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ClusterOptions(boolean r22, long r23, com.mapbox.bindgen.Value r25, double r26, com.mapbox.bindgen.Value r28, int r29, com.mapbox.bindgen.Value r30, double r31, com.mapbox.bindgen.Value r33, long r34, long r36, java.util.List r38, java.util.HashMap r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r21 = this;
            r0 = r40
            r1 = r0 & 1
            if (r1 == 0) goto L8
            r1 = 1
            goto La
        L8:
            r1 = r22
        La:
            r2 = r0 & 2
            if (r2 == 0) goto L11
            r2 = 50
            goto L13
        L11:
            r2 = r23
        L13:
            r4 = r0 & 4
            if (r4 == 0) goto L19
            r4 = 0
            goto L1b
        L19:
            r4 = r25
        L1b:
            r6 = r0 & 8
            if (r6 == 0) goto L22
            r6 = 4625759767262920704(0x4032000000000000, double:18.0)
            goto L24
        L22:
            r6 = r26
        L24:
            r8 = r0 & 16
            if (r8 == 0) goto L2a
            r8 = 0
            goto L2c
        L2a:
            r8 = r28
        L2c:
            r9 = r0 & 32
            if (r9 == 0) goto L32
            r9 = -1
            goto L34
        L32:
            r9 = r29
        L34:
            r10 = r0 & 64
            if (r10 == 0) goto L3a
            r10 = 0
            goto L3c
        L3a:
            r10 = r30
        L3c:
            r11 = r0 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L43
            r11 = 4622945017495814144(0x4028000000000000, double:12.0)
            goto L45
        L43:
            r11 = r31
        L45:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L4b
            r13 = 0
            goto L4d
        L4b:
            r13 = r33
        L4d:
            r14 = r0 & 512(0x200, float:7.17E-43)
            if (r14 == 0) goto L54
            r14 = 14
            goto L56
        L54:
            r14 = r34
        L56:
            r5 = r0 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L5d
            r16 = 2
            goto L5f
        L5d:
            r16 = r36
        L5f:
            r5 = r0 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L7e
            kotlin.Pair r5 = new kotlin.Pair
            r18 = 0
            r41 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r18 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r19 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r5.<init>(r1, r2)
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r5)
            goto L84
        L7e:
            r41 = r1
            r19 = r2
            r1 = r38
        L84:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto La5
            r40 = 0
        L8a:
            r22 = r21
            r23 = r41
            r39 = r1
            r26 = r4
            r27 = r6
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r34 = r13
            r35 = r14
            r37 = r16
            r24 = r19
            goto La8
        La5:
            r40 = r39
            goto L8a
        La8:
            r22.<init>(r23, r24, r26, r27, r29, r30, r31, r32, r34, r35, r37, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.plugin.annotation.ClusterOptions.<init>(boolean, long, com.mapbox.bindgen.Value, double, com.mapbox.bindgen.Value, int, com.mapbox.bindgen.Value, double, com.mapbox.bindgen.Value, long, long, java.util.List, java.util.HashMap, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCluster() {
        return this.cluster;
    }

    /* renamed from: component10, reason: from getter */
    public final long getClusterMaxZoom() {
        return this.clusterMaxZoom;
    }

    /* renamed from: component11, reason: from getter */
    public final long getClusterMinPoints() {
        return this.clusterMinPoints;
    }

    @NotNull
    public final List<Pair<Integer, Integer>> component12() {
        return this.colorLevels;
    }

    @Nullable
    public final HashMap<String, Object> component13() {
        return this.clusterProperties;
    }

    /* renamed from: component2, reason: from getter */
    public final long getClusterRadius() {
        return this.clusterRadius;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Value getCircleRadiusExpression() {
        return this.circleRadiusExpression;
    }

    /* renamed from: component4, reason: from getter */
    public final double getCircleRadius() {
        return this.circleRadius;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Value getTextColorExpression() {
        return this.textColorExpression;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Value getTextSizeExpression() {
        return this.textSizeExpression;
    }

    /* renamed from: component8, reason: from getter */
    public final double getTextSize() {
        return this.textSize;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Value getTextField() {
        return this.textField;
    }

    @NotNull
    public final ClusterOptions copy(boolean cluster, long clusterRadius, @Nullable Value circleRadiusExpression, double circleRadius, @Nullable Value textColorExpression, int textColor, @Nullable Value textSizeExpression, double textSize, @Nullable Value textField, long clusterMaxZoom, long clusterMinPoints, @NotNull List<Pair<Integer, Integer>> colorLevels, @Nullable HashMap<String, Object> clusterProperties) {
        colorLevels.getClass();
        return new ClusterOptions(cluster, clusterRadius, circleRadiusExpression, circleRadius, textColorExpression, textColor, textSizeExpression, textSize, textField, clusterMaxZoom, clusterMinPoints, colorLevels, clusterProperties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClusterOptions)) {
            return false;
        }
        ClusterOptions clusterOptions = (ClusterOptions) other;
        return this.cluster == clusterOptions.cluster && this.clusterRadius == clusterOptions.clusterRadius && Intrinsics.areEqual(this.circleRadiusExpression, clusterOptions.circleRadiusExpression) && Double.compare(this.circleRadius, clusterOptions.circleRadius) == 0 && Intrinsics.areEqual(this.textColorExpression, clusterOptions.textColorExpression) && this.textColor == clusterOptions.textColor && Intrinsics.areEqual(this.textSizeExpression, clusterOptions.textSizeExpression) && Double.compare(this.textSize, clusterOptions.textSize) == 0 && Intrinsics.areEqual(this.textField, clusterOptions.textField) && this.clusterMaxZoom == clusterOptions.clusterMaxZoom && this.clusterMinPoints == clusterOptions.clusterMinPoints && Intrinsics.areEqual(this.colorLevels, clusterOptions.colorLevels) && Intrinsics.areEqual(this.clusterProperties, clusterOptions.clusterProperties);
    }

    public final double getCircleRadius() {
        return this.circleRadius;
    }

    @Nullable
    public final Value getCircleRadiusExpression() {
        return this.circleRadiusExpression;
    }

    public final boolean getCluster() {
        return this.cluster;
    }

    public final long getClusterMaxZoom() {
        return this.clusterMaxZoom;
    }

    public final long getClusterMinPoints() {
        return this.clusterMinPoints;
    }

    @Nullable
    public final HashMap<String, Object> getClusterProperties() {
        return this.clusterProperties;
    }

    public final long getClusterRadius() {
        return this.clusterRadius;
    }

    @NotNull
    public final List<Pair<Integer, Integer>> getColorLevels() {
        return this.colorLevels;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    @Nullable
    public final Value getTextColorExpression() {
        return this.textColorExpression;
    }

    @Nullable
    public final Value getTextField() {
        return this.textField;
    }

    public final double getTextSize() {
        return this.textSize;
    }

    @Nullable
    public final Value getTextSizeExpression() {
        return this.textSizeExpression;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    public int hashCode() {
        boolean z = this.cluster;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int m = BitVector$$ExternalSyntheticOutline0.m(this.clusterRadius, r0 * 31, 31);
        Value value = this.circleRadiusExpression;
        int m2 = AppLaunchChecker$$ExternalSyntheticOutline0.m(this.circleRadius, (m + (value == null ? 0 : value.hashCode())) * 31, 31);
        Value value2 = this.textColorExpression;
        int m3 = ArcMode$$ExternalSyntheticOutline0.m(this.textColor, (m2 + (value2 == null ? 0 : value2.hashCode())) * 31, 31);
        Value value3 = this.textSizeExpression;
        int m4 = AppLaunchChecker$$ExternalSyntheticOutline0.m(this.textSize, (m3 + (value3 == null ? 0 : value3.hashCode())) * 31, 31);
        Value value4 = this.textField;
        int m5 = ArcMode$$ExternalSyntheticOutline0.m(this.colorLevels, BitVector$$ExternalSyntheticOutline0.m(this.clusterMinPoints, BitVector$$ExternalSyntheticOutline0.m(this.clusterMaxZoom, (m4 + (value4 == null ? 0 : value4.hashCode())) * 31, 31), 31), 31);
        HashMap<String, Object> hashMap = this.clusterProperties;
        return m5 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ClusterOptions(cluster=" + this.cluster + ", clusterRadius=" + this.clusterRadius + ", circleRadiusExpression=" + this.circleRadiusExpression + ", circleRadius=" + this.circleRadius + ", textColorExpression=" + this.textColorExpression + ", textColor=" + this.textColor + ", textSizeExpression=" + this.textSizeExpression + ", textSize=" + this.textSize + ", textField=" + this.textField + ", clusterMaxZoom=" + this.clusterMaxZoom + ", clusterMinPoints=" + this.clusterMinPoints + ", colorLevels=" + this.colorLevels + ", clusterProperties=" + this.clusterProperties + ')';
    }

    @JvmOverloads
    public ClusterOptions(boolean z) {
        this(z, 0L, null, 0.0d, null, 0, null, 0.0d, null, 0L, 0L, null, null, 8190, null);
    }

    @JvmOverloads
    public ClusterOptions(boolean z, long j) {
        this(z, j, null, 0.0d, null, 0, null, 0.0d, null, 0L, 0L, null, null, 8188, null);
    }

    @JvmOverloads
    public ClusterOptions(boolean z, long j, @Nullable Value value) {
        this(z, j, value, 0.0d, null, 0, null, 0.0d, null, 0L, 0L, null, null, 8184, null);
    }

    @JvmOverloads
    public ClusterOptions(boolean z, long j, @Nullable Value value, double d) {
        this(z, j, value, d, null, 0, null, 0.0d, null, 0L, 0L, null, null, 8176, null);
    }

    @JvmOverloads
    public ClusterOptions(boolean z, long j, @Nullable Value value, double d, @Nullable Value value2) {
        this(z, j, value, d, value2, 0, null, 0.0d, null, 0L, 0L, null, null, 8160, null);
    }

    @JvmOverloads
    public ClusterOptions(boolean z, long j, @Nullable Value value, double d, @Nullable Value value2, int i) {
        this(z, j, value, d, value2, i, null, 0.0d, null, 0L, 0L, null, null, 8128, null);
    }

    @JvmOverloads
    public ClusterOptions(boolean z, long j, @Nullable Value value, double d, @Nullable Value value2, int i, @Nullable Value value3) {
        this(z, j, value, d, value2, i, value3, 0.0d, null, 0L, 0L, null, null, 8064, null);
    }

    @JvmOverloads
    public ClusterOptions(boolean z, long j, @Nullable Value value, double d, @Nullable Value value2, int i, @Nullable Value value3, double d2) {
        this(z, j, value, d, value2, i, value3, d2, null, 0L, 0L, null, null, 7936, null);
    }

    @JvmOverloads
    public ClusterOptions(boolean z, long j, @Nullable Value value, double d, @Nullable Value value2, int i, @Nullable Value value3, double d2, @Nullable Value value4) {
        this(z, j, value, d, value2, i, value3, d2, value4, 0L, 0L, null, null, 7680, null);
    }

    @JvmOverloads
    public ClusterOptions(boolean z, long j, @Nullable Value value, double d, @Nullable Value value2, int i, @Nullable Value value3, double d2, @Nullable Value value4, long j2) {
        this(z, j, value, d, value2, i, value3, d2, value4, j2, 0L, null, null, 7168, null);
    }

    @JvmOverloads
    public ClusterOptions(boolean z, long j, @Nullable Value value, double d, @Nullable Value value2, int i, @Nullable Value value3, double d2, @Nullable Value value4, long j2, long j3) {
        this(z, j, value, d, value2, i, value3, d2, value4, j2, j3, null, null, 6144, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ClusterOptions(boolean z, long j, @Nullable Value value, double d, @Nullable Value value2, int i, @Nullable Value value3, double d2, @Nullable Value value4, long j2, long j3, @NotNull List<Pair<Integer, Integer>> list) {
        this(z, j, value, d, value2, i, value3, d2, value4, j2, j3, list, null, 4096, null);
        list.getClass();
    }

    @JvmOverloads
    public ClusterOptions(boolean z, long j, @Nullable Value value, double d, @Nullable Value value2, int i, @Nullable Value value3, double d2, @Nullable Value value4, long j2, long j3, @NotNull List<Pair<Integer, Integer>> list, @Nullable HashMap<String, Object> hashMap) {
        list.getClass();
        this.cluster = z;
        this.clusterRadius = j;
        this.circleRadiusExpression = value;
        this.circleRadius = d;
        this.textColorExpression = value2;
        this.textColor = i;
        this.textSizeExpression = value3;
        this.textSize = d2;
        this.textField = value4;
        this.clusterMaxZoom = j2;
        this.clusterMinPoints = j3;
        this.colorLevels = list;
        this.clusterProperties = hashMap;
    }

    @JvmOverloads
    public ClusterOptions() {
        this(false, 0L, null, 0.0d, null, 0, null, 0.0d, null, 0L, 0L, null, null, 8191, null);
    }
}
