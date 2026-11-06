package com.amazon.leapfrogmapgl;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeMaterialResource;", "", "id", "", "roughness", "", "metalness", "opacity", "alphaMode", "depthWrite", "", "<init>", "(Ljava/lang/String;FFFLjava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getRoughness", "()F", "getMetalness", "getOpacity", "getAlphaMode", "getDepthWrite", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeMaterialResource {

    @NotNull
    private final String alphaMode;
    private final boolean depthWrite;

    @NotNull
    private final String id;
    private final float metalness;
    private final float opacity;
    private final float roughness;

    public NativeMaterialResource(@NotNull String str, float f, float f2, float f3, @NotNull String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.roughness = f;
        this.metalness = f2;
        this.opacity = f3;
        this.alphaMode = str2;
        this.depthWrite = z;
    }

    public static /* synthetic */ NativeMaterialResource copy$default(NativeMaterialResource nativeMaterialResource, String str, float f, float f2, float f3, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeMaterialResource.id;
        }
        if ((i & 2) != 0) {
            f = nativeMaterialResource.roughness;
        }
        if ((i & 4) != 0) {
            f2 = nativeMaterialResource.metalness;
        }
        if ((i & 8) != 0) {
            f3 = nativeMaterialResource.opacity;
        }
        if ((i & 16) != 0) {
            str2 = nativeMaterialResource.alphaMode;
        }
        if ((i & 32) != 0) {
            z = nativeMaterialResource.depthWrite;
        }
        String str3 = str2;
        boolean z2 = z;
        return nativeMaterialResource.copy(str, f, f2, f3, str3, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final float getRoughness() {
        return this.roughness;
    }

    /* renamed from: component3, reason: from getter */
    public final float getMetalness() {
        return this.metalness;
    }

    /* renamed from: component4, reason: from getter */
    public final float getOpacity() {
        return this.opacity;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getAlphaMode() {
        return this.alphaMode;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDepthWrite() {
        return this.depthWrite;
    }

    @NotNull
    public final NativeMaterialResource copy(@NotNull String id, float roughness, float metalness, float opacity, @NotNull String alphaMode, boolean depthWrite) {
        id.getClass();
        alphaMode.getClass();
        return new NativeMaterialResource(id, roughness, metalness, opacity, alphaMode, depthWrite);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeMaterialResource)) {
            return false;
        }
        NativeMaterialResource nativeMaterialResource = (NativeMaterialResource) other;
        return Intrinsics.areEqual(this.id, nativeMaterialResource.id) && Float.compare(this.roughness, nativeMaterialResource.roughness) == 0 && Float.compare(this.metalness, nativeMaterialResource.metalness) == 0 && Float.compare(this.opacity, nativeMaterialResource.opacity) == 0 && Intrinsics.areEqual(this.alphaMode, nativeMaterialResource.alphaMode) && this.depthWrite == nativeMaterialResource.depthWrite;
    }

    @NotNull
    public final String getAlphaMode() {
        return this.alphaMode;
    }

    public final boolean getDepthWrite() {
        return this.depthWrite;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final float getMetalness() {
        return this.metalness;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final float getRoughness() {
        return this.roughness;
    }

    public int hashCode() {
        return Boolean.hashCode(this.depthWrite) + ArcMode$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(this.opacity, DoubleList$$ExternalSyntheticOutline0.m(this.metalness, DoubleList$$ExternalSyntheticOutline0.m(this.roughness, this.id.hashCode() * 31, 31), 31), 31), 31, this.alphaMode);
    }

    @NotNull
    public String toString() {
        return "NativeMaterialResource(id=" + this.id + ", roughness=" + this.roughness + ", metalness=" + this.metalness + ", opacity=" + this.opacity + ", alphaMode=" + this.alphaMode + ", depthWrite=" + this.depthWrite + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
