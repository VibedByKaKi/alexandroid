package com.amazon.alexa.ra.rtvi;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/rtvi/VisualFrame;", "", "jpegBytes", "", "width", "", "height", "<init>", "([BII)V", "getJpegBytes", "()[B", "getWidth", "()I", "getHeight", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "component1", "component2", "component3", "copy", "toString", "", "ui-rtvi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class VisualFrame {
    private final int height;

    @NotNull
    private final byte[] jpegBytes;
    private final int width;

    public VisualFrame(@NotNull byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.jpegBytes = bArr;
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ VisualFrame copy$default(VisualFrame visualFrame, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bArr = visualFrame.jpegBytes;
        }
        if ((i3 & 2) != 0) {
            i = visualFrame.width;
        }
        if ((i3 & 4) != 0) {
            i2 = visualFrame.height;
        }
        return visualFrame.copy(bArr, i, i2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final byte[] getJpegBytes() {
        return this.jpegBytes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final VisualFrame copy(@NotNull byte[] jpegBytes, int width, int height) {
        jpegBytes.getClass();
        return new VisualFrame(jpegBytes, width, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisualFrame)) {
            return false;
        }
        VisualFrame visualFrame = (VisualFrame) other;
        return this.width == visualFrame.width && this.height == visualFrame.height && Arrays.equals(this.jpegBytes, visualFrame.jpegBytes);
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final byte[] getJpegBytes() {
        return this.jpegBytes;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.jpegBytes) * 31) + this.width) * 31) + this.height;
    }

    @NotNull
    public String toString() {
        String arrays = Arrays.toString(this.jpegBytes);
        int i = this.width;
        return a$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(i, "VisualFrame(jpegBytes=", arrays, ", width=", ", height="), this.height, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
