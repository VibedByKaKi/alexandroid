package com.amazon.leapfrogmapgl;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeMeshRenderSidecar;", "", "protocolVersion", "", "materials", "", "", "Lcom/amazon/leapfrogmapgl/NativeMaterialResource;", "draws", "", "Lcom/amazon/leapfrogmapgl/NativeMeshDraw;", "<init>", "(ILjava/util/Map;Ljava/util/List;)V", "getProtocolVersion", "()I", "getMaterials", "()Ljava/util/Map;", "getDraws", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeMeshRenderSidecar {

    @NotNull
    private final List<NativeMeshDraw> draws;

    @NotNull
    private final Map<String, NativeMaterialResource> materials;
    private final int protocolVersion;

    public NativeMeshRenderSidecar(int i, @NotNull Map<String, NativeMaterialResource> map, @NotNull List<NativeMeshDraw> list) {
        map.getClass();
        list.getClass();
        this.protocolVersion = i;
        this.materials = map;
        this.draws = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeMeshRenderSidecar copy$default(NativeMeshRenderSidecar nativeMeshRenderSidecar, int i, Map map, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nativeMeshRenderSidecar.protocolVersion;
        }
        if ((i2 & 2) != 0) {
            map = nativeMeshRenderSidecar.materials;
        }
        if ((i2 & 4) != 0) {
            list = nativeMeshRenderSidecar.draws;
        }
        return nativeMeshRenderSidecar.copy(i, map, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    @NotNull
    public final Map<String, NativeMaterialResource> component2() {
        return this.materials;
    }

    @NotNull
    public final List<NativeMeshDraw> component3() {
        return this.draws;
    }

    @NotNull
    public final NativeMeshRenderSidecar copy(int protocolVersion, @NotNull Map<String, NativeMaterialResource> materials, @NotNull List<NativeMeshDraw> draws) {
        materials.getClass();
        draws.getClass();
        return new NativeMeshRenderSidecar(protocolVersion, materials, draws);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeMeshRenderSidecar)) {
            return false;
        }
        NativeMeshRenderSidecar nativeMeshRenderSidecar = (NativeMeshRenderSidecar) other;
        return this.protocolVersion == nativeMeshRenderSidecar.protocolVersion && Intrinsics.areEqual(this.materials, nativeMeshRenderSidecar.materials) && Intrinsics.areEqual(this.draws, nativeMeshRenderSidecar.draws);
    }

    @NotNull
    public final List<NativeMeshDraw> getDraws() {
        return this.draws;
    }

    @NotNull
    public final Map<String, NativeMaterialResource> getMaterials() {
        return this.materials;
    }

    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    public int hashCode() {
        return this.draws.hashCode() + TableInfo$$ExternalSyntheticOutline0.m(this.materials, Integer.hashCode(this.protocolVersion) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i = this.protocolVersion;
        Map<String, NativeMaterialResource> map = this.materials;
        List<NativeMeshDraw> list = this.draws;
        StringBuilder sb = new StringBuilder("NativeMeshRenderSidecar(protocolVersion=");
        sb.append(i);
        sb.append(", materials=");
        sb.append(map);
        sb.append(", draws=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list, sb);
    }
}
