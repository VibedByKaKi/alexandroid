package com.amazon.leapfrogmapgl;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeSurfaceLighting;", "", "ambientColor", "", "ambientIntensity", "", "directionalColor", "directionalIntensity", "directionalDirection", "<init>", "([FF[FF[F)V", "getAmbientColor", "()[F", "getAmbientIntensity", "()F", "getDirectionalColor", "getDirectionalIntensity", "getDirectionalDirection", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeSurfaceLighting {

    @NotNull
    private final float[] ambientColor;
    private final float ambientIntensity;

    @NotNull
    private final float[] directionalColor;

    @NotNull
    private final float[] directionalDirection;
    private final float directionalIntensity;

    public NativeSurfaceLighting(@NotNull float[] fArr, float f, @NotNull float[] fArr2, float f2, @NotNull float[] fArr3) {
        fArr.getClass();
        fArr2.getClass();
        fArr3.getClass();
        this.ambientColor = fArr;
        this.ambientIntensity = f;
        this.directionalColor = fArr2;
        this.directionalIntensity = f2;
        this.directionalDirection = fArr3;
    }

    public static /* synthetic */ NativeSurfaceLighting copy$default(NativeSurfaceLighting nativeSurfaceLighting, float[] fArr, float f, float[] fArr2, float f2, float[] fArr3, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = nativeSurfaceLighting.ambientColor;
        }
        if ((i & 2) != 0) {
            f = nativeSurfaceLighting.ambientIntensity;
        }
        if ((i & 4) != 0) {
            fArr2 = nativeSurfaceLighting.directionalColor;
        }
        if ((i & 8) != 0) {
            f2 = nativeSurfaceLighting.directionalIntensity;
        }
        if ((i & 16) != 0) {
            fArr3 = nativeSurfaceLighting.directionalDirection;
        }
        float[] fArr4 = fArr3;
        float[] fArr5 = fArr2;
        return nativeSurfaceLighting.copy(fArr, f, fArr5, f2, fArr4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final float[] getAmbientColor() {
        return this.ambientColor;
    }

    /* renamed from: component2, reason: from getter */
    public final float getAmbientIntensity() {
        return this.ambientIntensity;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final float[] getDirectionalColor() {
        return this.directionalColor;
    }

    /* renamed from: component4, reason: from getter */
    public final float getDirectionalIntensity() {
        return this.directionalIntensity;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final float[] getDirectionalDirection() {
        return this.directionalDirection;
    }

    @NotNull
    public final NativeSurfaceLighting copy(@NotNull float[] ambientColor, float ambientIntensity, @NotNull float[] directionalColor, float directionalIntensity, @NotNull float[] directionalDirection) {
        ambientColor.getClass();
        directionalColor.getClass();
        directionalDirection.getClass();
        return new NativeSurfaceLighting(ambientColor, ambientIntensity, directionalColor, directionalIntensity, directionalDirection);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeSurfaceLighting)) {
            return false;
        }
        NativeSurfaceLighting nativeSurfaceLighting = (NativeSurfaceLighting) other;
        return Intrinsics.areEqual(this.ambientColor, nativeSurfaceLighting.ambientColor) && Float.compare(this.ambientIntensity, nativeSurfaceLighting.ambientIntensity) == 0 && Intrinsics.areEqual(this.directionalColor, nativeSurfaceLighting.directionalColor) && Float.compare(this.directionalIntensity, nativeSurfaceLighting.directionalIntensity) == 0 && Intrinsics.areEqual(this.directionalDirection, nativeSurfaceLighting.directionalDirection);
    }

    @NotNull
    public final float[] getAmbientColor() {
        return this.ambientColor;
    }

    public final float getAmbientIntensity() {
        return this.ambientIntensity;
    }

    @NotNull
    public final float[] getDirectionalColor() {
        return this.directionalColor;
    }

    @NotNull
    public final float[] getDirectionalDirection() {
        return this.directionalDirection;
    }

    public final float getDirectionalIntensity() {
        return this.directionalIntensity;
    }

    public int hashCode() {
        return Arrays.hashCode(this.directionalDirection) + DoubleList$$ExternalSyntheticOutline0.m(this.directionalIntensity, (Arrays.hashCode(this.directionalColor) + DoubleList$$ExternalSyntheticOutline0.m(this.ambientIntensity, Arrays.hashCode(this.ambientColor) * 31, 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        String arrays = Arrays.toString(this.ambientColor);
        float f = this.ambientIntensity;
        String arrays2 = Arrays.toString(this.directionalColor);
        float f2 = this.directionalIntensity;
        String arrays3 = Arrays.toString(this.directionalDirection);
        StringBuilder sb = new StringBuilder("NativeSurfaceLighting(ambientColor=");
        sb.append(arrays);
        sb.append(", ambientIntensity=");
        sb.append(f);
        sb.append(", directionalColor=");
        sb.append(arrays2);
        sb.append(", directionalIntensity=");
        sb.append(f2);
        sb.append(", directionalDirection=");
        return a$$ExternalSyntheticOutline0.m(sb, arrays3, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
