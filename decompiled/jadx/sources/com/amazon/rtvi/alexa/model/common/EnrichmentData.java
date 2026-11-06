package com.amazon.rtvi.alexa.model.common;

import com.amazon.rtvi.alexa.model.enums.EnrichmentType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonSubTypes({@JsonSubTypes.Type(name = "OCR_TEXT_RECOGNITION", value = TextEnrichmentData.class), @JsonSubTypes.Type(name = "GESTURE_DETECTION", value = GestureEnrichmentData.class), @JsonSubTypes.Type(name = "OPTICAL_MACHINE_READABLE_CODE_DETECTION", value = CodeDetectionEnrichmentData.class), @JsonSubTypes.Type(name = "FACE_DETECTION", value = FaceDetectionEnrichmentData.class)})
@JsonTypeInfo(include = JsonTypeInfo.As.PROPERTY, property = "type", use = JsonTypeInfo.Id.NAME)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/amazon/rtvi/alexa/model/common/EnrichmentData;", "", "type", "Lcom/amazon/rtvi/alexa/model/enums/EnrichmentType;", "enrichmentDataId", "", "frameId", "processingTimestampEpochMilliseconds", "", "<init>", "(Lcom/amazon/rtvi/alexa/model/enums/EnrichmentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getType", "()Lcom/amazon/rtvi/alexa/model/enums/EnrichmentType;", "getEnrichmentDataId", "()Ljava/lang/String;", "getFrameId", "getProcessingTimestampEpochMilliseconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class EnrichmentData {

    @NotNull
    private final String enrichmentDataId;

    @NotNull
    private final String frameId;

    @Nullable
    private final Long processingTimestampEpochMilliseconds;

    @NotNull
    private final EnrichmentType type;

    public EnrichmentData(@JsonProperty("type") @NotNull EnrichmentType enrichmentType, @JsonProperty("enrichmentDataId") @NotNull String str, @JsonProperty("frameId") @NotNull String str2, @JsonProperty("processingTimestampEpochMilliseconds") @Nullable Long l) {
        enrichmentType.getClass();
        str.getClass();
        str2.getClass();
        this.type = enrichmentType;
        this.enrichmentDataId = str;
        this.frameId = str2;
        this.processingTimestampEpochMilliseconds = l;
    }

    @NotNull
    public String getEnrichmentDataId() {
        return this.enrichmentDataId;
    }

    @NotNull
    public String getFrameId() {
        return this.frameId;
    }

    @Nullable
    public Long getProcessingTimestampEpochMilliseconds() {
        return this.processingTimestampEpochMilliseconds;
    }

    @NotNull
    public EnrichmentType getType() {
        return this.type;
    }

    public /* synthetic */ EnrichmentData(EnrichmentType enrichmentType, String str, String str2, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enrichmentType, str, str2, (i & 8) != 0 ? null : l);
    }
}
