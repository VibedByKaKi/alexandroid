package com.amazon.leapfrogmapgl;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0015HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006%"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeMesh;", "", "id", "", "positions", "", "normals", "colors", "indices", "", "<init>", "(Ljava/lang/String;[F[F[F[I)V", "getId", "()Ljava/lang/String;", "getPositions", "()[F", "getNormals", "getColors", "getIndices", "()[I", "vertexCount", "", "getVertexCount", "()I", "indexCount", "getIndexCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeMesh {

    @NotNull
    private final float[] colors;

    @NotNull
    private final String id;
    private final int indexCount;

    @NotNull
    private final int[] indices;

    @NotNull
    private final float[] normals;

    @NotNull
    private final float[] positions;
    private final int vertexCount;

    public NativeMesh(@NotNull String str, @NotNull float[] fArr, @NotNull float[] fArr2, @NotNull float[] fArr3, @NotNull int[] iArr) {
        str.getClass();
        fArr.getClass();
        fArr2.getClass();
        fArr3.getClass();
        iArr.getClass();
        this.id = str;
        this.positions = fArr;
        this.normals = fArr2;
        this.colors = fArr3;
        this.indices = iArr;
        this.vertexCount = fArr.length / 3;
        this.indexCount = iArr.length;
    }

    public static /* synthetic */ NativeMesh copy$default(NativeMesh nativeMesh, String str, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeMesh.id;
        }
        if ((i & 2) != 0) {
            fArr = nativeMesh.positions;
        }
        if ((i & 4) != 0) {
            fArr2 = nativeMesh.normals;
        }
        if ((i & 8) != 0) {
            fArr3 = nativeMesh.colors;
        }
        if ((i & 16) != 0) {
            iArr = nativeMesh.indices;
        }
        int[] iArr2 = iArr;
        float[] fArr4 = fArr2;
        return nativeMesh.copy(str, fArr, fArr4, fArr3, iArr2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final float[] getPositions() {
        return this.positions;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final float[] getNormals() {
        return this.normals;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final float[] getColors() {
        return this.colors;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final int[] getIndices() {
        return this.indices;
    }

    @NotNull
    public final NativeMesh copy(@NotNull String id, @NotNull float[] positions, @NotNull float[] normals, @NotNull float[] colors, @NotNull int[] indices) {
        id.getClass();
        positions.getClass();
        normals.getClass();
        colors.getClass();
        indices.getClass();
        return new NativeMesh(id, positions, normals, colors, indices);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeMesh)) {
            return false;
        }
        NativeMesh nativeMesh = (NativeMesh) other;
        return Intrinsics.areEqual(this.id, nativeMesh.id) && Intrinsics.areEqual(this.positions, nativeMesh.positions) && Intrinsics.areEqual(this.normals, nativeMesh.normals) && Intrinsics.areEqual(this.colors, nativeMesh.colors) && Intrinsics.areEqual(this.indices, nativeMesh.indices);
    }

    @NotNull
    public final float[] getColors() {
        return this.colors;
    }

    @NotNull
    public final String getId() {
        return this.id;
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
        return Arrays.hashCode(this.indices) + ((Arrays.hashCode(this.colors) + ((Arrays.hashCode(this.normals) + ((Arrays.hashCode(this.positions) + (this.id.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String arrays = Arrays.toString(this.positions);
        String arrays2 = Arrays.toString(this.normals);
        String arrays3 = Arrays.toString(this.colors);
        String arrays4 = Arrays.toString(this.indices);
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("NativeMesh(id=", str, ", positions=", arrays, ", normals=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, arrays2, ", colors=", arrays3, ", indices=");
        return a$$ExternalSyntheticOutline0.m(m, arrays4, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
