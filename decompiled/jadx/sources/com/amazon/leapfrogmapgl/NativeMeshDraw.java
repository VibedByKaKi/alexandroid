package com.amazon.leapfrogmapgl;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeMeshDraw;", "", "meshId", "", "materialId", "castShadow", "", "receiveShadow", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "getMeshId", "()Ljava/lang/String;", "getMaterialId", "getCastShadow", "()Z", "getReceiveShadow", "component1", "component2", "component3", "component4", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeMeshDraw {
    private final boolean castShadow;

    @NotNull
    private final String materialId;

    @NotNull
    private final String meshId;
    private final boolean receiveShadow;

    public NativeMeshDraw(@NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.meshId = str;
        this.materialId = str2;
        this.castShadow = z;
        this.receiveShadow = z2;
    }

    public static /* synthetic */ NativeMeshDraw copy$default(NativeMeshDraw nativeMeshDraw, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeMeshDraw.meshId;
        }
        if ((i & 2) != 0) {
            str2 = nativeMeshDraw.materialId;
        }
        if ((i & 4) != 0) {
            z = nativeMeshDraw.castShadow;
        }
        if ((i & 8) != 0) {
            z2 = nativeMeshDraw.receiveShadow;
        }
        return nativeMeshDraw.copy(str, str2, z, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMeshId() {
        return this.meshId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMaterialId() {
        return this.materialId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCastShadow() {
        return this.castShadow;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getReceiveShadow() {
        return this.receiveShadow;
    }

    @NotNull
    public final NativeMeshDraw copy(@NotNull String meshId, @NotNull String materialId, boolean castShadow, boolean receiveShadow) {
        meshId.getClass();
        materialId.getClass();
        return new NativeMeshDraw(meshId, materialId, castShadow, receiveShadow);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeMeshDraw)) {
            return false;
        }
        NativeMeshDraw nativeMeshDraw = (NativeMeshDraw) other;
        return Intrinsics.areEqual(this.meshId, nativeMeshDraw.meshId) && Intrinsics.areEqual(this.materialId, nativeMeshDraw.materialId) && this.castShadow == nativeMeshDraw.castShadow && this.receiveShadow == nativeMeshDraw.receiveShadow;
    }

    public final boolean getCastShadow() {
        return this.castShadow;
    }

    @NotNull
    public final String getMaterialId() {
        return this.materialId;
    }

    @NotNull
    public final String getMeshId() {
        return this.meshId;
    }

    public final boolean getReceiveShadow() {
        return this.receiveShadow;
    }

    public int hashCode() {
        return Boolean.hashCode(this.receiveShadow) + DoubleList$$ExternalSyntheticOutline0.m(this.castShadow, ArcMode$$ExternalSyntheticOutline0.m(this.meshId.hashCode() * 31, 31, this.materialId), 31);
    }

    @NotNull
    public String toString() {
        String str = this.meshId;
        String str2 = this.materialId;
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("NativeMeshDraw(meshId=", str, ", materialId=", str2, ", castShadow="), this.castShadow, ", receiveShadow=", this.receiveShadow, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
