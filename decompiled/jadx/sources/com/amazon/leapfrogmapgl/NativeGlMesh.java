package com.amazon.leapfrogmapgl;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0011HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006!"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeGlMesh;", "", "positions", "", "normals", "colors", "indices", "", "<init>", "([F[F[F[I)V", "getPositions", "()[F", "getNormals", "getColors", "getIndices", "()[I", "vertexCount", "", "getVertexCount", "()I", "indexCount", "getIndexCount", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeGlMesh {

    @NotNull
    private final float[] colors;
    private final int indexCount;

    @NotNull
    private final int[] indices;

    @NotNull
    private final float[] normals;

    @NotNull
    private final float[] positions;
    private final int vertexCount;

    public NativeGlMesh(@NotNull float[] fArr, @NotNull float[] fArr2, @NotNull float[] fArr3, @NotNull int[] iArr) {
        fArr.getClass();
        fArr2.getClass();
        fArr3.getClass();
        iArr.getClass();
        this.positions = fArr;
        this.normals = fArr2;
        this.colors = fArr3;
        this.indices = iArr;
        this.vertexCount = fArr.length / 3;
        this.indexCount = iArr.length;
    }

    public static /* synthetic */ NativeGlMesh copy$default(NativeGlMesh nativeGlMesh, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0) {
            fArr = nativeGlMesh.positions;
        }
        if ((i & 2) != 0) {
            fArr2 = nativeGlMesh.normals;
        }
        if ((i & 4) != 0) {
            fArr3 = nativeGlMesh.colors;
        }
        if ((i & 8) != 0) {
            iArr = nativeGlMesh.indices;
        }
        return nativeGlMesh.copy(fArr, fArr2, fArr3, iArr);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final float[] getPositions() {
        return this.positions;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final float[] getNormals() {
        return this.normals;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final float[] getColors() {
        return this.colors;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final int[] getIndices() {
        return this.indices;
    }

    @NotNull
    public final NativeGlMesh copy(@NotNull float[] positions, @NotNull float[] normals, @NotNull float[] colors, @NotNull int[] indices) {
        positions.getClass();
        normals.getClass();
        colors.getClass();
        indices.getClass();
        return new NativeGlMesh(positions, normals, colors, indices);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeGlMesh)) {
            return false;
        }
        NativeGlMesh nativeGlMesh = (NativeGlMesh) other;
        return Intrinsics.areEqual(this.positions, nativeGlMesh.positions) && Intrinsics.areEqual(this.normals, nativeGlMesh.normals) && Intrinsics.areEqual(this.colors, nativeGlMesh.colors) && Intrinsics.areEqual(this.indices, nativeGlMesh.indices);
    }

    @NotNull
    public final float[] getColors() {
        return this.colors;
    }

    public final int getIndexCount() {
        return this.indexCount;
    }

    @NotNull
    public final int[] getIndices() {
        return this.indices;
    }

    @NotNull
    public final float[] getNormals() {
        return this.normals;
    }

    @NotNull
    public final float[] getPositions() {
        return this.positions;
    }

    public final int getVertexCount() {
        return this.vertexCount;
    }

    public int hashCode() {
        return Arrays.hashCode(this.indices) + ((Arrays.hashCode(this.colors) + ((Arrays.hashCode(this.normals) + (Arrays.hashCode(this.positions) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String arrays = Arrays.toString(this.positions);
        String arrays2 = Arrays.toString(this.normals);
        return DoubleList$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("NativeGlMesh(positions=", arrays, ", normals=", arrays2, ", colors="), Arrays.toString(this.colors), ", indices=", Arrays.toString(this.indices), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
