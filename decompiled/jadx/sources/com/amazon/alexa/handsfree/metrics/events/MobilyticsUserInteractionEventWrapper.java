package com.amazon.alexa.handsfree.metrics.events;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.metrics.caching.deserializers.MobilyticsUserInteractionEventWrapperDeserializer;
import com.amazon.alexa.handsfree.metrics.caching.serializers.MobilyticsUserInteractionEventSerializer;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.metadata.AMPDMetadata;
import com.amazon.alexa.mobilytics.event.userinteraction.DefaultMobilyticsUserInteractionEvent;
import com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.InteractionDetails;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonDeserialize(using = MobilyticsUserInteractionEventWrapperDeserializer.class)
@JsonSerialize(using = MobilyticsUserInteractionEventSerializer.class)
/* loaded from: classes17.dex */
public class MobilyticsUserInteractionEventWrapper extends DefaultMobilyticsUserInteractionEvent implements Metric, AMPDMetadataProvider {
    private final transient AMPDMetadata mAMPDMetadata;

    public MobilyticsUserInteractionEventWrapper(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        super(str, str2, str3, str4, OwnerIdentifier.ALEXA_APP_HANDS_FREE_ANDROID);
        this.mAMPDMetadata = new AMPDMetadata();
    }

    @Override // com.amazon.alexa.handsfree.metrics.events.AMPDMetadataProvider
    public AMPDMetadata getAMPDMetadata() {
        return this.mAMPDMetadata;
    }

    public MobilyticsUserInteractionEventWrapper withEnrollmentType(@NonNull String str) {
        this.mAMPDMetadata.withEnrollmentType(str);
        return this;
    }

    public MobilyticsUserInteractionEventWrapper withSVAcceptThresholdLower(@NonNull String str) {
        this.mAMPDMetadata.withSvThresholdLower(str);
        return this;
    }

    public MobilyticsUserInteractionEventWrapper withSVAcceptThresholdUpper(@NonNull String str) {
        this.mAMPDMetadata.withSvThresholdUpper(str);
        return this;
    }

    public MobilyticsUserInteractionEventWrapper withSVModelID(@NonNull String str) {
        this.mAMPDMetadata.withSvModelId(str);
        return this;
    }

    public MobilyticsUserInteractionEventWrapper withSVRawScore(@NonNull String str) {
        this.mAMPDMetadata.withSvRawScore(str);
        return this;
    }

    public MobilyticsUserInteractionEventWrapper withWakeWordConfidence(@NonNull String str) {
        this.mAMPDMetadata.withWakeWordConfidence(str);
        return this;
    }

    public MobilyticsUserInteractionEventWrapper withWakeWordModelId(@NonNull String str) {
        this.mAMPDMetadata.withWwModelId(str);
        return this;
    }

    @Override // com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent
    /* renamed from: withContentType */
    public DefaultMobilyticsUserInteractionEvent withContentType2(@Nullable String str) {
        super.withContentType2(str);
        return this;
    }

    @Override // com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent
    /* renamed from: withInputType */
    public DefaultMobilyticsUserInteractionEvent withInputType2(@Nullable String str) {
        super.withInputType2(str);
        return this;
    }

    @Override // com.amazon.alexa.mobilytics.event.userinteraction.DefaultMobilyticsUserInteractionEvent
    public MobilyticsUserInteractionEventWrapper withInteractionDetails(@Nullable InteractionDetails interactionDetails) {
        super.withInteractionDetails(interactionDetails);
        return this;
    }
}
