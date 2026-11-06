package com.amazon.rtvi.alexa.model.common;

import com.amazon.alexa.accessory.frames.amazonphotos.AmazonPhotosConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.rtvi.alexa.model.enums.CaptureMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/amazon/rtvi/alexa/model/common/ModeConfig;", "", AmazonPhotosConstants.CAPTURE_MODE_KEY, "Lcom/amazon/rtvi/alexa/model/enums/CaptureMode;", "minimumDurationBetweenFramesInMilliseconds", "", "maximumDurationBetweenFramesInMilliseconds", "<init>", "(Lcom/amazon/rtvi/alexa/model/enums/CaptureMode;Ljava/lang/Long;Ljava/lang/Long;)V", "getCaptureMode", "()Lcom/amazon/rtvi/alexa/model/enums/CaptureMode;", "getMinimumDurationBetweenFramesInMilliseconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMaximumDurationBetweenFramesInMilliseconds", "component1", "component2", "component3", "copy", "(Lcom/amazon/rtvi/alexa/model/enums/CaptureMode;Ljava/lang/Long;Ljava/lang/Long;)Lcom/amazon/rtvi/alexa/model/common/ModeConfig;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ModeConfig {

    @NotNull
    private final CaptureMode captureMode;

    @Nullable
    private final Long maximumDurationBetweenFramesInMilliseconds;

    @Nullable
    private final Long minimumDurationBetweenFramesInMilliseconds;

    public /* synthetic */ ModeConfig(CaptureMode captureMode, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureMode, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2);
    }

    public static /* synthetic */ ModeConfig copy$default(ModeConfig modeConfig, CaptureMode captureMode, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            captureMode = modeConfig.captureMode;
        }
        if ((i & 2) != 0) {
            l = modeConfig.minimumDurationBetweenFramesInMilliseconds;
        }
        if ((i & 4) != 0) {
            l2 = modeConfig.maximumDurationBetweenFramesInMilliseconds;
        }
        return modeConfig.copy(captureMode, l, l2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CaptureMode getCaptureMode() {
        return this.captureMode;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Long getMinimumDurationBetweenFramesInMilliseconds() {
        return this.minimumDurationBetweenFramesInMilliseconds;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Long getMaximumDurationBetweenFramesInMilliseconds() {
        return this.maximumDurationBetweenFramesInMilliseconds;
    }

    @NotNull
    public final ModeConfig copy(@JsonProperty("captureMode") @NotNull CaptureMode captureMode, @JsonProperty("minimumDurationBetweenFramesInMilliseconds") @Nullable Long minimumDurationBetweenFramesInMilliseconds, @JsonProperty("maximumDurationBetweenFramesInMilliseconds") @Nullable Long maximumDurationBetweenFramesInMilliseconds) {
        captureMode.getClass();
        return new ModeConfig(captureMode, minimumDurationBetweenFramesInMilliseconds, maximumDurationBetweenFramesInMilliseconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModeConfig)) {
            return false;
        }
        ModeConfig modeConfig = (ModeConfig) other;
        return this.captureMode == modeConfig.captureMode && Intrinsics.areEqual(this.minimumDurationBetweenFramesInMilliseconds, modeConfig.minimumDurationBetweenFramesInMilliseconds) && Intrinsics.areEqual(this.maximumDurationBetweenFramesInMilliseconds, modeConfig.maximumDurationBetweenFramesInMilliseconds);
    }

    @NotNull
    public final CaptureMode getCaptureMode() {
        return this.captureMode;
    }

    @Nullable
    public final Long getMaximumDurationBetweenFramesInMilliseconds() {
        return this.maximumDurationBetweenFramesInMilliseconds;
    }

    @Nullable
    public final Long getMinimumDurationBetweenFramesInMilliseconds() {
        return this.minimumDurationBetweenFramesInMilliseconds;
    }

    public int hashCode() {
        int hashCode = this.captureMode.hashCode() * 31;
        Long l = this.minimumDurationBetweenFramesInMilliseconds;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.maximumDurationBetweenFramesInMilliseconds;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ModeConfig(captureMode=" + this.captureMode + ", minimumDurationBetweenFramesInMilliseconds=" + this.minimumDurationBetweenFramesInMilliseconds + ", maximumDurationBetweenFramesInMilliseconds=" + this.maximumDurationBetweenFramesInMilliseconds + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ModeConfig(@JsonProperty("captureMode") @NotNull CaptureMode captureMode, @JsonProperty("minimumDurationBetweenFramesInMilliseconds") @Nullable Long l, @JsonProperty("maximumDurationBetweenFramesInMilliseconds") @Nullable Long l2) {
        captureMode.getClass();
        this.captureMode = captureMode;
        this.minimumDurationBetweenFramesInMilliseconds = l;
        this.maximumDurationBetweenFramesInMilliseconds = l2;
    }
}
