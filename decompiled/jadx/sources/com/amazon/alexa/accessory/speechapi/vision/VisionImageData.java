package com.amazon.alexa.accessory.speechapi.vision;

import android.os.ParcelFileDescriptor;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionImageData;", "", "resolution", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameResolution;", "imageType", "", "imageDataSize", "", "imageDataFd", "Landroid/os/ParcelFileDescriptor;", "(Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameResolution;Ljava/lang/String;ILandroid/os/ParcelFileDescriptor;)V", "getImageDataFd", "()Landroid/os/ParcelFileDescriptor;", "getImageDataSize", "()I", "getImageType", "()Ljava/lang/String;", "getResolution", "()Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameResolution;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VisionImageData {

    @NotNull
    private final ParcelFileDescriptor imageDataFd;
    private final int imageDataSize;

    @NotNull
    private final String imageType;

    @NotNull
    private final VisionFrameResolution resolution;

    public VisionImageData(@NotNull VisionFrameResolution visionFrameResolution, @NotNull String str, int i, @NotNull ParcelFileDescriptor parcelFileDescriptor) {
        visionFrameResolution.getClass();
        str.getClass();
        parcelFileDescriptor.getClass();
        this.resolution = visionFrameResolution;
        this.imageType = str;
        this.imageDataSize = i;
        this.imageDataFd = parcelFileDescriptor;
    }

    public static /* synthetic */ VisionImageData copy$default(VisionImageData visionImageData, VisionFrameResolution visionFrameResolution, String str, int i, ParcelFileDescriptor parcelFileDescriptor, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            visionFrameResolution = visionImageData.resolution;
        }
        if ((i2 & 2) != 0) {
            str = visionImageData.imageType;
        }
        if ((i2 & 4) != 0) {
            i = visionImageData.imageDataSize;
        }
        if ((i2 & 8) != 0) {
            parcelFileDescriptor = visionImageData.imageDataFd;
        }
        return visionImageData.copy(visionFrameResolution, str, i, parcelFileDescriptor);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final VisionFrameResolution getResolution() {
        return this.resolution;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getImageType() {
        return this.imageType;
    }

    /* renamed from: component3, reason: from getter */
    public final int getImageDataSize() {
        return this.imageDataSize;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ParcelFileDescriptor getImageDataFd() {
        return this.imageDataFd;
    }

    @NotNull
    public final VisionImageData copy(@NotNull VisionFrameResolution resolution, @NotNull String imageType, int imageDataSize, @NotNull ParcelFileDescriptor imageDataFd) {
        resolution.getClass();
        imageType.getClass();
        imageDataFd.getClass();
        return new VisionImageData(resolution, imageType, imageDataSize, imageDataFd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisionImageData)) {
            return false;
        }
        VisionImageData visionImageData = (VisionImageData) other;
        return Intrinsics.areEqual(this.resolution, visionImageData.resolution) && Intrinsics.areEqual(this.imageType, visionImageData.imageType) && this.imageDataSize == visionImageData.imageDataSize && Intrinsics.areEqual(this.imageDataFd, visionImageData.imageDataFd);
    }

    @NotNull
    public final ParcelFileDescriptor getImageDataFd() {
        return this.imageDataFd;
    }

    public final int getImageDataSize() {
        return this.imageDataSize;
    }

    @NotNull
    public final String getImageType() {
        return this.imageType;
    }

    @NotNull
    public final VisionFrameResolution getResolution() {
        return this.resolution;
    }

    public int hashCode() {
        return this.imageDataFd.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.imageDataSize, ArcMode$$ExternalSyntheticOutline0.m(this.resolution.hashCode() * 31, 31, this.imageType), 31);
    }

    @NotNull
    public String toString() {
        return "VisionImageData(resolution=" + this.resolution + ", imageType=" + this.imageType + ", imageDataSize=" + this.imageDataSize + ", imageDataFd=" + this.imageDataFd + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
