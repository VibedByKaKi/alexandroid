package com.amazon.leapfrogmapgl;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeGlDraw;", "", "indexOffset", "", "indexCount", "material", "Lcom/amazon/leapfrogmapgl/NativeGlMaterial;", "castShadow", "", "receiveShadow", "<init>", "(IILcom/amazon/leapfrogmapgl/NativeGlMaterial;ZZ)V", "getIndexOffset", "()I", "getIndexCount", "getMaterial", "()Lcom/amazon/leapfrogmapgl/NativeGlMaterial;", "getCastShadow", "()Z", "getReceiveShadow", "component1", "component2", "component3", "component4", "component5", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeGlDraw {
    private final boolean castShadow;
    private final int indexCount;
    private final int indexOffset;

    @NotNull
    private final NativeGlMaterial material;
    private final boolean receiveShadow;

    public NativeGlDraw(int i, int i2, @NotNull NativeGlMaterial nativeGlMaterial, boolean z, boolean z2) {
        nativeGlMaterial.getClass();
        this.indexOffset = i;
        this.indexCount = i2;
        this.material = nativeGlMaterial;
        this.castShadow = z;
        this.receiveShadow = z2;
    }

    public static /* synthetic */ NativeGlDraw copy$default(NativeGlDraw nativeGlDraw, int i, int i2, NativeGlMaterial nativeGlMaterial, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = nativeGlDraw.indexOffset;
        }
        if ((i3 & 2) != 0) {
            i2 = nativeGlDraw.indexCount;
        }
        if ((i3 & 4) != 0) {
            nativeGlMaterial = nativeGlDraw.material;
        }
        if ((i3 & 8) != 0) {
            z = nativeGlDraw.castShadow;
        }
        if ((i3 & 16) != 0) {
            z2 = nativeGlDraw.receiveShadow;
        }
        boolean z3 = z2;
        NativeGlMaterial nativeGlMaterial2 = nativeGlMaterial;
        return nativeGlDraw.copy(i, i2, nativeGlMaterial2, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndexOffset() {
        return this.indexOffset;
    }

    /* renamed from: component2, reason: from getter */
    public final int getIndexCount() {
        return this.indexCount;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final NativeGlMaterial getMaterial() {
        return this.material;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCastShadow() {
        return this.castShadow;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getReceiveShadow() {
        return this.receiveShadow;
    }

    @NotNull
    public final NativeGlDraw copy(int indexOffset, int indexCount, @NotNull NativeGlMaterial material, boolean castShadow, boolean receiveShadow) {
        material.getClass();
        return new NativeGlDraw(indexOffset, indexCount, material, castShadow, receiveShadow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeGlDraw)) {
            return false;
        }
        NativeGlDraw nativeGlDraw = (NativeGlDraw) other;
        return this.indexOffset == nativeGlDraw.indexOffset && this.indexCount == nativeGlDraw.indexCount && Intrinsics.areEqual(this.material, nativeGlDraw.material) && this.castShadow == nativeGlDraw.castShadow && this.receiveShadow == nativeGlDraw.receiveShadow;
    }

    public final boolean getCastShadow() {
        return this.castShadow;
    }

    public final int getIndexCount() {
        return this.indexCount;
    }

    public final int getIndexOffset() {
        return this.indexOffset;
    }

    @NotNull
    public final NativeGlMaterial getMaterial() {
        return this.material;
    }

    public final boolean getReceiveShadow() {
        return this.receiveShadow;
    }

    public int hashCode() {
        return Boolean.hashCode(this.receiveShadow) + DoubleList$$ExternalSyntheticOutline0.m(this.castShadow, (this.material.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.indexCount, Integer.hashCode(this.indexOffset) * 31, 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i = this.indexOffset;
        int i2 = this.indexCount;
        NativeGlMaterial nativeGlMaterial = this.material;
        boolean z = this.castShadow;
        boolean z2 = this.receiveShadow;
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "NativeGlDraw(indexOffset=", ", indexCount=", ", material=");
        m29m.append(nativeGlMaterial);
        m29m.append(", castShadow=");
        m29m.append(z);
        m29m.append(", receiveShadow=");
        return a$$ExternalSyntheticOutline0.m(m29m, z2, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
