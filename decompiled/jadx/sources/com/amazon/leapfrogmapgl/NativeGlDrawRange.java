package com.amazon.leapfrogmapgl;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/leapfrogmapgl/NativeGlDrawRange;", "", "indexOffset", "", "indexCount", "<init>", "(II)V", "getIndexOffset", "()I", "getIndexCount", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "LeapfrogMapGLAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NativeGlDrawRange {
    private final int indexCount;
    private final int indexOffset;

    public NativeGlDrawRange(int i, int i2) {
        this.indexOffset = i;
        this.indexCount = i2;
    }

    public static /* synthetic */ NativeGlDrawRange copy$default(NativeGlDrawRange nativeGlDrawRange, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = nativeGlDrawRange.indexOffset;
        }
        if ((i3 & 2) != 0) {
            i2 = nativeGlDrawRange.indexCount;
        }
        return nativeGlDrawRange.copy(i, i2);
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
    public final NativeGlDrawRange copy(int indexOffset, int indexCount) {
        return new NativeGlDrawRange(indexOffset, indexCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeGlDrawRange)) {
            return false;
        }
        NativeGlDrawRange nativeGlDrawRange = (NativeGlDrawRange) other;
        return this.indexOffset == nativeGlDrawRange.indexOffset && this.indexCount == nativeGlDrawRange.indexCount;
    }

    public final int getIndexCount() {
        return this.indexCount;
    }

    public final int getIndexOffset() {
        return this.indexOffset;
    }

    public int hashCode() {
        return Integer.hashCode(this.indexCount) + (Integer.hashCode(this.indexOffset) * 31);
    }

    @NotNull
    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(this.indexOffset, this.indexCount, "NativeGlDrawRange(indexOffset=", ", indexCount=", MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
