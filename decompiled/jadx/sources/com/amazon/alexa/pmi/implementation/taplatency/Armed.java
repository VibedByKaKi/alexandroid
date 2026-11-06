package com.amazon.alexa.pmi.implementation.taplatency;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.featureservice.constants.FeatureConstants;
import com.amazon.alexa.pmi.taplatency.TapRenderType;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/Armed;", "", "tapUpTimeMs", "", "label", "", "isReactNative", "", FeatureConstants.Network.TREATMENT, "rawX", "", "rawY", "<init>", "(JLjava/lang/String;ZLjava/lang/String;FF)V", "getTapUpTimeMs", "()J", "getLabel", "()Ljava/lang/String;", "()Z", "getTreatment", "getRawX", "()F", "getRawY", "renderType", "Lcom/amazon/alexa/pmi/taplatency/TapRenderType;", "getRenderType", "()Lcom/amazon/alexa/pmi/taplatency/TapRenderType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class Armed {
    private final boolean isReactNative;

    @NotNull
    private final String label;
    private final float rawX;
    private final float rawY;
    private final long tapUpTimeMs;

    @NotNull
    private final String treatment;

    public Armed(long j, @NotNull String str, boolean z, @NotNull String str2, float f, float f2) {
        str.getClass();
        str2.getClass();
        this.tapUpTimeMs = j;
        this.label = str;
        this.isReactNative = z;
        this.treatment = str2;
        this.rawX = f;
        this.rawY = f2;
    }

    public static /* synthetic */ Armed copy$default(Armed armed, long j, String str, boolean z, String str2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = armed.tapUpTimeMs;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = armed.label;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            z = armed.isReactNative;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = armed.treatment;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            f = armed.rawX;
        }
        float f3 = f;
        if ((i & 32) != 0) {
            f2 = armed.rawY;
        }
        return armed.copy(j2, str3, z2, str4, f3, f2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTapUpTimeMs() {
        return this.tapUpTimeMs;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsReactNative() {
        return this.isReactNative;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTreatment() {
        return this.treatment;
    }

    /* renamed from: component5, reason: from getter */
    public final float getRawX() {
        return this.rawX;
    }

    /* renamed from: component6, reason: from getter */
    public final float getRawY() {
        return this.rawY;
    }

    @NotNull
    public final Armed copy(long tapUpTimeMs, @NotNull String label, boolean isReactNative, @NotNull String treatment, float rawX, float rawY) {
        label.getClass();
        treatment.getClass();
        return new Armed(tapUpTimeMs, label, isReactNative, treatment, rawX, rawY);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Armed)) {
            return false;
        }
        Armed armed = (Armed) other;
        return this.tapUpTimeMs == armed.tapUpTimeMs && Intrinsics.areEqual(this.label, armed.label) && this.isReactNative == armed.isReactNative && Intrinsics.areEqual(this.treatment, armed.treatment) && Float.compare(this.rawX, armed.rawX) == 0 && Float.compare(this.rawY, armed.rawY) == 0;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public final float getRawX() {
        return this.rawX;
    }

    public final float getRawY() {
        return this.rawY;
    }

    @NotNull
    public final TapRenderType getRenderType() {
        return this.isReactNative ? TapRenderType.REACT_NATIVE : TapRenderType.NATIVE;
    }

    public final long getTapUpTimeMs() {
        return this.tapUpTimeMs;
    }

    @NotNull
    public final String getTreatment() {
        return this.treatment;
    }

    public int hashCode() {
        return Float.hashCode(this.rawY) + DoubleList$$ExternalSyntheticOutline0.m(this.rawX, ArcMode$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(this.isReactNative, ArcMode$$ExternalSyntheticOutline0.m(Long.hashCode(this.tapUpTimeMs) * 31, 31, this.label), 31), 31, this.treatment), 31);
    }

    public final boolean isReactNative() {
        return this.isReactNative;
    }

    @NotNull
    public String toString() {
        long j = this.tapUpTimeMs;
        String str = this.label;
        boolean z = this.isReactNative;
        String str2 = this.treatment;
        float f = this.rawX;
        float f2 = this.rawY;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("Armed(tapUpTimeMs=", j, ", label=", str);
        m.append(", isReactNative=");
        m.append(z);
        m.append(", treatment=");
        m.append(str2);
        m.append(", rawX=");
        m.append(f);
        m.append(", rawY=");
        m.append(f2);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
