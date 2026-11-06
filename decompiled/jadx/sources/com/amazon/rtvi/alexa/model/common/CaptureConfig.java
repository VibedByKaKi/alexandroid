package com.amazon.rtvi.alexa.model.common;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.amazonphotos.AmazonPhotosConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.rtvi.alexa.model.enums.CaptureMode;
import com.amazon.rtvi.alexa.model.enums.TransmissionChannel;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/amazon/rtvi/alexa/model/common/CaptureConfig;", "", "resolution", "Lcom/amazon/rtvi/alexa/model/common/Resolution;", "encodedImageFormat", "", AmazonPhotosConstants.CAPTURE_MODE_KEY, "Lcom/amazon/rtvi/alexa/model/enums/CaptureMode;", "transmissionChannel", "Lcom/amazon/rtvi/alexa/model/enums/TransmissionChannel;", "<init>", "(Lcom/amazon/rtvi/alexa/model/common/Resolution;Ljava/lang/String;Lcom/amazon/rtvi/alexa/model/enums/CaptureMode;Lcom/amazon/rtvi/alexa/model/enums/TransmissionChannel;)V", "getResolution", "()Lcom/amazon/rtvi/alexa/model/common/Resolution;", "getEncodedImageFormat", "()Ljava/lang/String;", "getCaptureMode", "()Lcom/amazon/rtvi/alexa/model/enums/CaptureMode;", "getTransmissionChannel", "()Lcom/amazon/rtvi/alexa/model/enums/TransmissionChannel;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CaptureConfig {

    @NotNull
    private final CaptureMode captureMode;

    @NotNull
    private final String encodedImageFormat;

    @NotNull
    private final Resolution resolution;

    @NotNull
    private final TransmissionChannel transmissionChannel;

    public CaptureConfig(@JsonProperty("resolution") @NotNull Resolution resolution, @JsonProperty("encodedImageFormat") @NotNull String str, @JsonProperty("captureMode") @NotNull CaptureMode captureMode, @JsonProperty("transmissionChannel") @NotNull TransmissionChannel transmissionChannel) {
        resolution.getClass();
        str.getClass();
        captureMode.getClass();
        transmissionChannel.getClass();
        this.resolution = resolution;
        this.encodedImageFormat = str;
        this.captureMode = captureMode;
        this.transmissionChannel = transmissionChannel;
    }

    public static /* synthetic */ CaptureConfig copy$default(CaptureConfig captureConfig, Resolution resolution, String str, CaptureMode captureMode, TransmissionChannel transmissionChannel, int i, Object obj) {
        if ((i & 1) != 0) {
            resolution = captureConfig.resolution;
        }
        if ((i & 2) != 0) {
            str = captureConfig.encodedImageFormat;
        }
        if ((i & 4) != 0) {
            captureMode = captureConfig.captureMode;
        }
        if ((i & 8) != 0) {
            transmissionChannel = captureConfig.transmissionChannel;
        }
        return captureConfig.copy(resolution, str, captureMode, transmissionChannel);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Resolution getResolution() {
        return this.resolution;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEncodedImageFormat() {
        return this.encodedImageFormat;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CaptureMode getCaptureMode() {
        return this.captureMode;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TransmissionChannel getTransmissionChannel() {
        return this.transmissionChannel;
    }

    @NotNull
    public final CaptureConfig copy(@JsonProperty("resolution") @NotNull Resolution resolution, @JsonProperty("encodedImageFormat") @NotNull String encodedImageFormat, @JsonProperty("captureMode") @NotNull CaptureMode captureMode, @JsonProperty("transmissionChannel") @NotNull TransmissionChannel transmissionChannel) {
        resolution.getClass();
        encodedImageFormat.getClass();
        captureMode.getClass();
        transmissionChannel.getClass();
        return new CaptureConfig(resolution, encodedImageFormat, captureMode, transmissionChannel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureConfig)) {
            return false;
        }
        CaptureConfig captureConfig = (CaptureConfig) other;
        return Intrinsics.areEqual(this.resolution, captureConfig.resolution) && Intrinsics.areEqual(this.encodedImageFormat, captureConfig.encodedImageFormat) && this.captureMode == captureConfig.captureMode && this.transmissionChannel == captureConfig.transmissionChannel;
    }

    @NotNull
    public final CaptureMode getCaptureMode() {
        return this.captureMode;
    }

    @NotNull
    public final String getEncodedImageFormat() {
        return this.encodedImageFormat;
    }

    @NotNull
    public final Resolution getResolution() {
        return this.resolution;
    }

    @NotNull
    public final TransmissionChannel getTransmissionChannel() {
        return this.transmissionChannel;
    }

    public int hashCode() {
        return this.transmissionChannel.hashCode() + ((this.captureMode.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.resolution.hashCode() * 31, 31, this.encodedImageFormat)) * 31);
    }

    @NotNull
    public String toString() {
        return "CaptureConfig(resolution=" + this.resolution + ", encodedImageFormat=" + this.encodedImageFormat + ", captureMode=" + this.captureMode + ", transmissionChannel=" + this.transmissionChannel + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
