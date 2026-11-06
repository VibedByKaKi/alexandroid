package com.amazon.alexa.handsfree.metrics.events;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.metrics.caching.deserializers.MobilyticsMetricsCounterWrapperDeserializer;
import com.amazon.alexa.handsfree.metrics.caching.serializers.MobilyticsOperationalEventSerializer;
import com.amazon.alexa.handsfree.metrics.utils.MobilyticsPmetFactory;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.mobilytics.event.metadata.AMPDMetadata;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsOperationalEvent;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonDeserialize(using = MobilyticsMetricsCounterWrapperDeserializer.class)
@JsonSerialize(using = MobilyticsOperationalEventSerializer.class)
/* loaded from: classes17.dex */
public class MobilyticsMetricsCounterWrapper extends DefaultMobilyticsMetricsCounter implements Metric, AMPDMetadataProvider {
    private final transient AMPDMetadata mAMPDMetadata;

    public MobilyticsMetricsCounterWrapper(@NonNull String str, @Nullable String str2) {
        super(str, MobilyticsPmetFactory.PMET_METHOD_NAME, str2, OwnerIdentifier.ALEXA_APP_HANDS_FREE_ANDROID);
        this.mAMPDMetadata = new AMPDMetadata();
    }

    @Override // com.amazon.alexa.handsfree.metrics.events.AMPDMetadataProvider
    public AMPDMetadata getAMPDMetadata() {
        return this.mAMPDMetadata;
    }

    @Override // com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent
    /* renamed from: withContentId, reason: merged with bridge method [inline-methods] */
    public DefaultMobilyticsOperationalEvent withContentId2(@Nullable String str) {
        super.withContentId2(str);
        return this;
    }

    @Override // com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent
    /* renamed from: withContentType, reason: merged with bridge method [inline-methods] */
    public DefaultMobilyticsOperationalEvent withContentType2(@Nullable String str) {
        super.withContentType2(str);
        return this;
    }

    @Override // com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsOperationalEvent
    public MobilyticsMetricsCounterWrapper withEventNumericValue(@NonNull Long l) {
        super.withEventNumericValue(l);
        return this;
    }

    @Override // com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent
    /* renamed from: withInputType, reason: merged with bridge method [inline-methods] */
    public DefaultMobilyticsOperationalEvent withInputType2(@Nullable String str) {
        super.withInputType2(str);
        return this;
    }

    @Override // com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent
    /* renamed from: withSourceContext, reason: merged with bridge method [inline-methods] */
    public DefaultMobilyticsOperationalEvent withSourceContext2(@Nullable String str) {
        super.withSourceContext2(str);
        return this;
    }
}
