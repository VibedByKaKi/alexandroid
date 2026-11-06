package com.amazon.alexa.accessory.speechapi.vision;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/vision/VisionEnrichmentData;", "", "()V", "frameCaptureTimestampMillis", "", "getFrameCaptureTimestampMillis", "()J", "processingTimestampMillis", "getProcessingTimestampMillis", "type", "Lcom/amazon/alexa/accessory/speechapi/vision/VisionEnrichmentType;", "getType", "()Lcom/amazon/alexa/accessory/speechapi/vision/VisionEnrichmentType;", "Lcom/amazon/alexa/accessory/speechapi/vision/FaceDetectionVisionEnrichmentData;", "Lcom/amazon/alexa/accessory/speechapi/vision/GestureDetectionVisionEnrichmentData;", "Lcom/amazon/alexa/accessory/speechapi/vision/OCRVisionEnrichmentData;", "Lcom/amazon/alexa/accessory/speechapi/vision/OpticalCodeDetectionVisionEnrichmentData;", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class VisionEnrichmentData {
    public /* synthetic */ VisionEnrichmentData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long getFrameCaptureTimestampMillis();

    public abstract long getProcessingTimestampMillis();

    @NotNull
    public abstract VisionEnrichmentType getType();

    private VisionEnrichmentData() {
    }
}
