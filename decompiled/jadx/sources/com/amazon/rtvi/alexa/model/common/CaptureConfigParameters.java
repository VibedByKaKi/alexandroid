package com.amazon.rtvi.alexa.model.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/amazon/rtvi/alexa/model/common/CaptureConfigParameters;", "", "resolutionParameters", "Lcom/amazon/rtvi/alexa/model/common/ResolutionParameters;", "encodedImageFormatParameters", "Lcom/amazon/rtvi/alexa/model/common/EncodedImageFormatParameters;", "transmissionChannelParameters", "Lcom/amazon/rtvi/alexa/model/common/TransmissionChannelParameters;", "modeConfig", "Lcom/amazon/rtvi/alexa/model/common/ModeConfig;", "<init>", "(Lcom/amazon/rtvi/alexa/model/common/ResolutionParameters;Lcom/amazon/rtvi/alexa/model/common/EncodedImageFormatParameters;Lcom/amazon/rtvi/alexa/model/common/TransmissionChannelParameters;Lcom/amazon/rtvi/alexa/model/common/ModeConfig;)V", "getResolutionParameters", "()Lcom/amazon/rtvi/alexa/model/common/ResolutionParameters;", "getEncodedImageFormatParameters", "()Lcom/amazon/rtvi/alexa/model/common/EncodedImageFormatParameters;", "getTransmissionChannelParameters", "()Lcom/amazon/rtvi/alexa/model/common/TransmissionChannelParameters;", "getModeConfig", "()Lcom/amazon/rtvi/alexa/model/common/ModeConfig;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CaptureConfigParameters {

    @Nullable
    private final EncodedImageFormatParameters encodedImageFormatParameters;

    @NotNull
    private final ModeConfig modeConfig;

    @Nullable
    private final ResolutionParameters resolutionParameters;

    @Nullable
    private final TransmissionChannelParameters transmissionChannelParameters;

    public /* synthetic */ CaptureConfigParameters(ResolutionParameters resolutionParameters, EncodedImageFormatParameters encodedImageFormatParameters, TransmissionChannelParameters transmissionChannelParameters, ModeConfig modeConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : resolutionParameters, (i & 2) != 0 ? null : encodedImageFormatParameters, (i & 4) != 0 ? null : transmissionChannelParameters, modeConfig);
    }

    public static /* synthetic */ CaptureConfigParameters copy$default(CaptureConfigParameters captureConfigParameters, ResolutionParameters resolutionParameters, EncodedImageFormatParameters encodedImageFormatParameters, TransmissionChannelParameters transmissionChannelParameters, ModeConfig modeConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            resolutionParameters = captureConfigParameters.resolutionParameters;
        }
        if ((i & 2) != 0) {
            encodedImageFormatParameters = captureConfigParameters.encodedImageFormatParameters;
        }
        if ((i & 4) != 0) {
            transmissionChannelParameters = captureConfigParameters.transmissionChannelParameters;
        }
        if ((i & 8) != 0) {
            modeConfig = captureConfigParameters.modeConfig;
        }
        return captureConfigParameters.copy(resolutionParameters, encodedImageFormatParameters, transmissionChannelParameters, modeConfig);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ResolutionParameters getResolutionParameters() {
        return this.resolutionParameters;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final EncodedImageFormatParameters getEncodedImageFormatParameters() {
        return this.encodedImageFormatParameters;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final TransmissionChannelParameters getTransmissionChannelParameters() {
        return this.transmissionChannelParameters;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ModeConfig getModeConfig() {
        return this.modeConfig;
    }

    @NotNull
    public final CaptureConfigParameters copy(@JsonProperty("resolutionParameters") @Nullable ResolutionParameters resolutionParameters, @JsonProperty("encodedImageFormatParameters") @Nullable EncodedImageFormatParameters encodedImageFormatParameters, @JsonProperty("transmissionChannelParameters") @Nullable TransmissionChannelParameters transmissionChannelParameters, @JsonProperty("modeConfig") @NotNull ModeConfig modeConfig) {
        modeConfig.getClass();
        return new CaptureConfigParameters(resolutionParameters, encodedImageFormatParameters, transmissionChannelParameters, modeConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptureConfigParameters)) {
            return false;
        }
        CaptureConfigParameters captureConfigParameters = (CaptureConfigParameters) other;
        return Intrinsics.areEqual(this.resolutionParameters, captureConfigParameters.resolutionParameters) && Intrinsics.areEqual(this.encodedImageFormatParameters, captureConfigParameters.encodedImageFormatParameters) && Intrinsics.areEqual(this.transmissionChannelParameters, captureConfigParameters.transmissionChannelParameters) && Intrinsics.areEqual(this.modeConfig, captureConfigParameters.modeConfig);
    }

    @Nullable
    public final EncodedImageFormatParameters getEncodedImageFormatParameters() {
        return this.encodedImageFormatParameters;
    }

    @NotNull
    public final ModeConfig getModeConfig() {
        return this.modeConfig;
    }

    @Nullable
    public final ResolutionParameters getResolutionParameters() {
        return this.resolutionParameters;
    }

    @Nullable
    public final TransmissionChannelParameters getTransmissionChannelParameters() {
        return this.transmissionChannelParameters;
    }

    public int hashCode() {
        ResolutionParameters resolutionParameters = this.resolutionParameters;
        int hashCode = (resolutionParameters == null ? 0 : resolutionParameters.hashCode()) * 31;
        EncodedImageFormatParameters encodedImageFormatParameters = this.encodedImageFormatParameters;
        int hashCode2 = (hashCode + (encodedImageFormatParameters == null ? 0 : encodedImageFormatParameters.hashCode())) * 31;
        TransmissionChannelParameters transmissionChannelParameters = this.transmissionChannelParameters;
        return this.modeConfig.hashCode() + ((hashCode2 + (transmissionChannelParameters != null ? transmissionChannelParameters.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "CaptureConfigParameters(resolutionParameters=" + this.resolutionParameters + ", encodedImageFormatParameters=" + this.encodedImageFormatParameters + ", transmissionChannelParameters=" + this.transmissionChannelParameters + ", modeConfig=" + this.modeConfig + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public CaptureConfigParameters(@JsonProperty("resolutionParameters") @Nullable ResolutionParameters resolutionParameters, @JsonProperty("encodedImageFormatParameters") @Nullable EncodedImageFormatParameters encodedImageFormatParameters, @JsonProperty("transmissionChannelParameters") @Nullable TransmissionChannelParameters transmissionChannelParameters, @JsonProperty("modeConfig") @NotNull ModeConfig modeConfig) {
        modeConfig.getClass();
        this.resolutionParameters = resolutionParameters;
        this.encodedImageFormatParameters = encodedImageFormatParameters;
        this.transmissionChannelParameters = transmissionChannelParameters;
        this.modeConfig = modeConfig;
    }
}
