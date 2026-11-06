package com.amazon.leapfrogmapgl;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.mobile.heremapsexplore.Constants.ResponseFields;
import com.facebook.react.uimanager.ViewProps;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015¨\u0006%"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeCameraFit;", "", "id", "", "coordinates", "", "", ViewProps.PADDING, "bearing", "", ResponseFields.PITCH, "fitPitch", "<init>", "(Ljava/lang/String;Ljava/util/List;[DDDD)V", "getId", "()Ljava/lang/String;", "getCoordinates", "()Ljava/util/List;", "getPadding", "()[D", "getBearing", "()D", "getPitch", "getFitPitch", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeCameraFit {
    private final double bearing;

    @NotNull
    private final List<double[]> coordinates;
    private final double fitPitch;

    @NotNull
    private final String id;

    @NotNull
    private final double[] padding;
    private final double pitch;

    public NativeCameraFit(@NotNull String str, @NotNull List<double[]> list, @NotNull double[] dArr, double d, double d2, double d3) {
        str.getClass();
        list.getClass();
        dArr.getClass();
        this.id = str;
        this.coordinates = list;
        this.padding = dArr;
        this.bearing = d;
        this.pitch = d2;
        this.fitPitch = d3;
    }

    public static /* synthetic */ NativeCameraFit copy$default(NativeCameraFit nativeCameraFit, String str, List list, double[] dArr, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeCameraFit.id;
        }
        if ((i & 2) != 0) {
            list = nativeCameraFit.coordinates;
        }
        if ((i & 4) != 0) {
            dArr = nativeCameraFit.padding;
        }
        if ((i & 8) != 0) {
            d = nativeCameraFit.bearing;
        }
        if ((i & 16) != 0) {
            d2 = nativeCameraFit.pitch;
        }
        if ((i & 32) != 0) {
            d3 = nativeCameraFit.fitPitch;
        }
        double d4 = d3;
        double d5 = d2;
        double[] dArr2 = dArr;
        return nativeCameraFit.copy(str, list, dArr2, d, d5, d4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<double[]> component2() {
        return this.coordinates;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final double[] getPadding() {
        return this.padding;
    }

    /* renamed from: component4, reason: from getter */
    public final double getBearing() {
        return this.bearing;
    }

    /* renamed from: component5, reason: from getter */
    public final double getPitch() {
        return this.pitch;
    }

    /* renamed from: component6, reason: from getter */
    public final double getFitPitch() {
        return this.fitPitch;
    }

    @NotNull
    public final NativeCameraFit copy(@NotNull String id, @NotNull List<double[]> coordinates, @NotNull double[] padding, double bearing, double pitch, double fitPitch) {
        id.getClass();
        coordinates.getClass();
        padding.getClass();
        return new NativeCameraFit(id, coordinates, padding, bearing, pitch, fitPitch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeCameraFit)) {
            return false;
        }
        NativeCameraFit nativeCameraFit = (NativeCameraFit) other;
        return Intrinsics.areEqual(this.id, nativeCameraFit.id) && Intrinsics.areEqual(this.coordinates, nativeCameraFit.coordinates) && Intrinsics.areEqual(this.padding, nativeCameraFit.padding) && Double.compare(this.bearing, nativeCameraFit.bearing) == 0 && Double.compare(this.pitch, nativeCameraFit.pitch) == 0 && Double.compare(this.fitPitch, nativeCameraFit.fitPitch) == 0;
    }

    public final double getBearing() {
        return this.bearing;
    }

    @NotNull
    public final List<double[]> getCoordinates() {
        return this.coordinates;
    }

    public final double getFitPitch() {
        return this.fitPitch;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final double[] getPadding() {
        return this.padding;
    }

    public final double getPitch() {
        return this.pitch;
    }

    public int hashCode() {
        return Double.hashCode(this.fitPitch) + AppLaunchChecker$$ExternalSyntheticOutline0.m(this.pitch, AppLaunchChecker$$ExternalSyntheticOutline0.m(this.bearing, (Arrays.hashCode(this.padding) + ArcMode$$ExternalSyntheticOutline0.m(this.coordinates, this.id.hashCode() * 31, 31)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        List<double[]> list = this.coordinates;
        String arrays = Arrays.toString(this.padding);
        double d = this.bearing;
        double d2 = this.pitch;
        double d3 = this.fitPitch;
        StringBuilder m14724m = AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14724m("NativeCameraFit(id=", str, ", coordinates=", (List) list, ", padding=");
        m14724m.append(arrays);
        m14724m.append(", bearing=");
        m14724m.append(d);
        ChatData$$ExternalSyntheticOutline0.m(m14724m, ", pitch=", d2, ", fitPitch=");
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(d3, MarkdownConstants.RIGHT_PARENTHESIS, m14724m);
    }
}
