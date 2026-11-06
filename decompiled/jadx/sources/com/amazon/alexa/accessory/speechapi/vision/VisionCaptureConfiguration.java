package com.amazon.alexa.accessory.speechapi.vision;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.amazonphotos.AmazonPhotosConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Jf\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000bHÖ\u0001J\t\u0010-\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001f\u0010\u001d¨\u0006."}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureConfiguration;", "", AmazonPhotosConstants.CAPTURE_MODE_KEY, "Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureMode;", "frameResolution", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameResolution;", "frameRate", "", "frameImageType", "", "maxFrameBytes", "", "maxFrameCount", "enrichmentsEnabled", "", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionEnrichmentType;", "(Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureMode;Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameResolution;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getCaptureMode", "()Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureMode;", "getEnrichmentsEnabled", "()Ljava/util/List;", "getFrameImageType", "()Ljava/lang/String;", "getFrameRate", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getFrameResolution", "()Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameResolution;", "getMaxFrameBytes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxFrameCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureMode;Lcom/amazon/alexa/accessory/speechapi/vision/VisionFrameResolution;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/amazon/alexa/accessory/speechapi/vision/VisionCaptureConfiguration;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VisionCaptureConfiguration {

    @NotNull
    private final VisionCaptureMode captureMode;

    @Nullable
    private final List<VisionEnrichmentType> enrichmentsEnabled;

    @Nullable
    private final String frameImageType;

    @Nullable
    private final Float frameRate;

    @Nullable
    private final VisionFrameResolution frameResolution;

    @Nullable
    private final Integer maxFrameBytes;

    @Nullable
    private final Integer maxFrameCount;

    public /* synthetic */ VisionCaptureConfiguration(VisionCaptureMode visionCaptureMode, VisionFrameResolution visionFrameResolution, Float f, String str, Integer num, Integer num2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(visionCaptureMode, (i & 2) != 0 ? null : visionFrameResolution, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : list);
    }

    public static /* synthetic */ VisionCaptureConfiguration copy$default(VisionCaptureConfiguration visionCaptureConfiguration, VisionCaptureMode visionCaptureMode, VisionFrameResolution visionFrameResolution, Float f, String str, Integer num, Integer num2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            visionCaptureMode = visionCaptureConfiguration.captureMode;
        }
        if ((i & 2) != 0) {
            visionFrameResolution = visionCaptureConfiguration.frameResolution;
        }
        if ((i & 4) != 0) {
            f = visionCaptureConfiguration.frameRate;
        }
        if ((i & 8) != 0) {
            str = visionCaptureConfiguration.frameImageType;
        }
        if ((i & 16) != 0) {
            num = visionCaptureConfiguration.maxFrameBytes;
        }
        if ((i & 32) != 0) {
            num2 = visionCaptureConfiguration.maxFrameCount;
        }
        if ((i & 64) != 0) {
            list = visionCaptureConfiguration.enrichmentsEnabled;
        }
        Integer num3 = num2;
        List list2 = list;
        Integer num4 = num;
        Float f2 = f;
        return visionCaptureConfiguration.copy(visionCaptureMode, visionFrameResolution, f2, str, num4, num3, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final VisionCaptureMode getCaptureMode() {
        return this.captureMode;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final VisionFrameResolution getFrameResolution() {
        return this.frameResolution;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Float getFrameRate() {
        return this.frameRate;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getFrameImageType() {
        return this.frameImageType;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getMaxFrameBytes() {
        return this.maxFrameBytes;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getMaxFrameCount() {
        return this.maxFrameCount;
    }

    @Nullable
    public final List<VisionEnrichmentType> component7() {
        return this.enrichmentsEnabled;
    }

    @NotNull
    public final VisionCaptureConfiguration copy(@NotNull VisionCaptureMode captureMode, @Nullable VisionFrameResolution frameResolution, @Nullable Float frameRate, @Nullable String frameImageType, @Nullable Integer maxFrameBytes, @Nullable Integer maxFrameCount, @Nullable List<? extends VisionEnrichmentType> enrichmentsEnabled) {
        captureMode.getClass();
        return new VisionCaptureConfiguration(captureMode, frameResolution, frameRate, frameImageType, maxFrameBytes, maxFrameCount, enrichmentsEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisionCaptureConfiguration)) {
            return false;
        }
        VisionCaptureConfiguration visionCaptureConfiguration = (VisionCaptureConfiguration) other;
        return this.captureMode == visionCaptureConfiguration.captureMode && Intrinsics.areEqual(this.frameResolution, visionCaptureConfiguration.frameResolution) && Intrinsics.areEqual((Object) this.frameRate, (Object) visionCaptureConfiguration.frameRate) && Intrinsics.areEqual(this.frameImageType, visionCaptureConfiguration.frameImageType) && Intrinsics.areEqual(this.maxFrameBytes, visionCaptureConfiguration.maxFrameBytes) && Intrinsics.areEqual(this.maxFrameCount, visionCaptureConfiguration.maxFrameCount) && Intrinsics.areEqual(this.enrichmentsEnabled, visionCaptureConfiguration.enrichmentsEnabled);
    }

    @NotNull
    public final VisionCaptureMode getCaptureMode() {
        return this.captureMode;
    }

    @Nullable
    public final List<VisionEnrichmentType> getEnrichmentsEnabled() {
        return this.enrichmentsEnabled;
    }

    @Nullable
    public final String getFrameImageType() {
        return this.frameImageType;
    }

    @Nullable
    public final Float getFrameRate() {
        return this.frameRate;
    }

    @Nullable
    public final VisionFrameResolution getFrameResolution() {
        return this.frameResolution;
    }

    @Nullable
    public final Integer getMaxFrameBytes() {
        return this.maxFrameBytes;
    }

    @Nullable
    public final Integer getMaxFrameCount() {
        return this.maxFrameCount;
    }

    public int hashCode() {
        int hashCode = this.captureMode.hashCode() * 31;
        VisionFrameResolution visionFrameResolution = this.frameResolution;
        int hashCode2 = (hashCode + (visionFrameResolution == null ? 0 : visionFrameResolution.hashCode())) * 31;
        Float f = this.frameRate;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.frameImageType;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.maxFrameBytes;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxFrameCount;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<VisionEnrichmentType> list = this.enrichmentsEnabled;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        VisionCaptureMode visionCaptureMode = this.captureMode;
        VisionFrameResolution visionFrameResolution = this.frameResolution;
        Float f = this.frameRate;
        String str = this.frameImageType;
        Integer num = this.maxFrameBytes;
        Integer num2 = this.maxFrameCount;
        List<VisionEnrichmentType> list = this.enrichmentsEnabled;
        StringBuilder sb = new StringBuilder("VisionCaptureConfiguration(captureMode=");
        sb.append(visionCaptureMode);
        sb.append(", frameResolution=");
        sb.append(visionFrameResolution);
        sb.append(", frameRate=");
        sb.append(f);
        sb.append(", frameImageType=");
        sb.append(str);
        sb.append(", maxFrameBytes=");
        sb.append(num);
        sb.append(", maxFrameCount=");
        sb.append(num2);
        sb.append(", enrichmentsEnabled=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list, sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VisionCaptureConfiguration(@NotNull VisionCaptureMode visionCaptureMode, @Nullable VisionFrameResolution visionFrameResolution, @Nullable Float f, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable List<? extends VisionEnrichmentType> list) {
        visionCaptureMode.getClass();
        this.captureMode = visionCaptureMode;
        this.frameResolution = visionFrameResolution;
        this.frameRate = f;
        this.frameImageType = str;
        this.maxFrameBytes = num;
        this.maxFrameCount = num2;
        this.enrichmentsEnabled = list;
    }
}
