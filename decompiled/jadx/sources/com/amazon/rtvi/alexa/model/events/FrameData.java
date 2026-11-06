package com.amazon.rtvi.alexa.model.events;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.rtvi.alexa.model.common.EnrichmentData;
import com.amazon.rtvi.alexa.model.common.FrameMetadata;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jg\u0010+\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010,\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00062"}, d2 = {"Lcom/amazon/rtvi/alexa/model/events/FrameData;", "Lcom/amazon/rtvi/alexa/model/events/RTVIEvent;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "frameMetadata", "Lcom/amazon/rtvi/alexa/model/common/FrameMetadata;", "eventTimestampEpochMilliseconds", "", "frameData", "enrichmentData", "", "Lcom/amazon/rtvi/alexa/model/common/EnrichmentData;", "generatingFrameAddons", "", "correlationId", "frameBytes", "", "<init>", "(Ljava/lang/String;Lcom/amazon/rtvi/alexa/model/common/FrameMetadata;JLjava/lang/String;Ljava/util/List;ZLjava/lang/String;[B)V", "getSessionId", "()Ljava/lang/String;", "getFrameMetadata", "()Lcom/amazon/rtvi/alexa/model/common/FrameMetadata;", "getEventTimestampEpochMilliseconds", "()J", "getFrameData", "getEnrichmentData", "()Ljava/util/List;", "getGeneratingFrameAddons", "()Z", "getCorrelationId", "getFrameBytes", "()[B", "eventName", "getEventName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FrameData implements RTVIEvent {

    @Nullable
    private final String correlationId;

    @Nullable
    private final List<EnrichmentData> enrichmentData;

    @Nullable
    private final String eventName;
    private final long eventTimestampEpochMilliseconds;

    @JsonIgnore
    @Nullable
    private final byte[] frameBytes;

    @Nullable
    private final String frameData;

    @NotNull
    private final FrameMetadata frameMetadata;
    private final boolean generatingFrameAddons;

    @NotNull
    private final String sessionId;

    /* JADX WARN: Multi-variable type inference failed */
    public FrameData(@JsonProperty("sessionId") @NotNull String str, @JsonProperty("frameMetadata") @NotNull FrameMetadata frameMetadata, @JsonProperty("eventTimestampEpochMilliseconds") long j, @JsonProperty("frameData") @Nullable String str2, @JsonProperty("enrichmentData") @Nullable List<? extends EnrichmentData> list, @JsonProperty("generatingFrameAddons") boolean z, @JsonProperty("correlationId") @Nullable String str3, @Nullable byte[] bArr) {
        str.getClass();
        frameMetadata.getClass();
        this.sessionId = str;
        this.frameMetadata = frameMetadata;
        this.eventTimestampEpochMilliseconds = j;
        this.frameData = str2;
        this.enrichmentData = list;
        this.generatingFrameAddons = z;
        this.correlationId = str3;
        this.frameBytes = bArr;
        this.eventName = "FrameData";
    }

    public static /* synthetic */ FrameData copy$default(FrameData frameData, String str, FrameMetadata frameMetadata, long j, String str2, List list, boolean z, String str3, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = frameData.sessionId;
        }
        if ((i & 2) != 0) {
            frameMetadata = frameData.frameMetadata;
        }
        if ((i & 4) != 0) {
            j = frameData.eventTimestampEpochMilliseconds;
        }
        if ((i & 8) != 0) {
            str2 = frameData.frameData;
        }
        if ((i & 16) != 0) {
            list = frameData.enrichmentData;
        }
        if ((i & 32) != 0) {
            z = frameData.generatingFrameAddons;
        }
        if ((i & 64) != 0) {
            str3 = frameData.correlationId;
        }
        if ((i & 128) != 0) {
            bArr = frameData.frameBytes;
        }
        byte[] bArr2 = bArr;
        boolean z2 = z;
        String str4 = str2;
        long j2 = j;
        return frameData.copy(str, frameMetadata, j2, str4, list, z2, str3, bArr2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FrameMetadata getFrameMetadata() {
        return this.frameMetadata;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEventTimestampEpochMilliseconds() {
        return this.eventTimestampEpochMilliseconds;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getFrameData() {
        return this.frameData;
    }

    @Nullable
    public final List<EnrichmentData> component5() {
        return this.enrichmentData;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getGeneratingFrameAddons() {
        return this.generatingFrameAddons;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getCorrelationId() {
        return this.correlationId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final byte[] getFrameBytes() {
        return this.frameBytes;
    }

    @NotNull
    public final FrameData copy(@JsonProperty("sessionId") @NotNull String sessionId, @JsonProperty("frameMetadata") @NotNull FrameMetadata frameMetadata, @JsonProperty("eventTimestampEpochMilliseconds") long eventTimestampEpochMilliseconds, @JsonProperty("frameData") @Nullable String frameData, @JsonProperty("enrichmentData") @Nullable List<? extends EnrichmentData> enrichmentData, @JsonProperty("generatingFrameAddons") boolean generatingFrameAddons, @JsonProperty("correlationId") @Nullable String correlationId, @Nullable byte[] frameBytes) {
        sessionId.getClass();
        frameMetadata.getClass();
        return new FrameData(sessionId, frameMetadata, eventTimestampEpochMilliseconds, frameData, enrichmentData, generatingFrameAddons, correlationId, frameBytes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrameData)) {
            return false;
        }
        FrameData frameData = (FrameData) other;
        return Intrinsics.areEqual(this.sessionId, frameData.sessionId) && Intrinsics.areEqual(this.frameMetadata, frameData.frameMetadata) && this.eventTimestampEpochMilliseconds == frameData.eventTimestampEpochMilliseconds && Intrinsics.areEqual(this.frameData, frameData.frameData) && Intrinsics.areEqual(this.enrichmentData, frameData.enrichmentData) && this.generatingFrameAddons == frameData.generatingFrameAddons && Intrinsics.areEqual(this.correlationId, frameData.correlationId) && Intrinsics.areEqual(this.frameBytes, frameData.frameBytes);
    }

    @Nullable
    public final String getCorrelationId() {
        return this.correlationId;
    }

    @Nullable
    public final List<EnrichmentData> getEnrichmentData() {
        return this.enrichmentData;
    }

    @Override // com.amazon.rtvi.alexa.model.events.RTVIEvent
    @Nullable
    public String getEventName() {
        return this.eventName;
    }

    public final long getEventTimestampEpochMilliseconds() {
        return this.eventTimestampEpochMilliseconds;
    }

    @Nullable
    public final byte[] getFrameBytes() {
        return this.frameBytes;
    }

    @Nullable
    public final String getFrameData() {
        return this.frameData;
    }

    @NotNull
    public final FrameMetadata getFrameMetadata() {
        return this.frameMetadata;
    }

    public final boolean getGeneratingFrameAddons() {
        return this.generatingFrameAddons;
    }

    @Override // com.amazon.rtvi.alexa.model.events.RTVIEvent
    @NotNull
    public String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        int m = BitVector$$ExternalSyntheticOutline0.m(this.eventTimestampEpochMilliseconds, (this.frameMetadata.hashCode() + (this.sessionId.hashCode() * 31)) * 31, 31);
        String str = this.frameData;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        List<EnrichmentData> list = this.enrichmentData;
        int m2 = DoubleList$$ExternalSyntheticOutline0.m(this.generatingFrameAddons, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31);
        String str2 = this.correlationId;
        int hashCode2 = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        byte[] bArr = this.frameBytes;
        return hashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    @NotNull
    public String toString() {
        String str = this.sessionId;
        FrameMetadata frameMetadata = this.frameMetadata;
        long j = this.eventTimestampEpochMilliseconds;
        String str2 = this.frameData;
        List<EnrichmentData> list = this.enrichmentData;
        boolean z = this.generatingFrameAddons;
        String str3 = this.correlationId;
        String arrays = Arrays.toString(this.frameBytes);
        StringBuilder sb = new StringBuilder("FrameData(sessionId=");
        sb.append(str);
        sb.append(", frameMetadata=");
        sb.append(frameMetadata);
        sb.append(", eventTimestampEpochMilliseconds=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(j, ", frameData=", str2, sb);
        sb.append(", enrichmentData=");
        sb.append(list);
        sb.append(", generatingFrameAddons=");
        sb.append(z);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, ", correlationId=", str3, ", frameBytes=", arrays);
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    public /* synthetic */ FrameData(String str, FrameMetadata frameMetadata, long j, String str2, List list, boolean z, String str3, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, frameMetadata, j, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list, z, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : bArr);
    }
}
