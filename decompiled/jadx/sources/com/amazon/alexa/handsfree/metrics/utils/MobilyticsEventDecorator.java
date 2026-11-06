package com.amazon.alexa.handsfree.metrics.utils;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.metrics.mobilytics.MobilyticsMetadataProvider;
import com.amazon.alexa.handsfree.protocols.metrics.Metric;
import com.amazon.alexa.mobilytics.event.DefaultMobilyticsEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MobilyticsEventDecorator {
    private final String mAndroidId;
    private final AttributionTagProvider mAttributionTagProvider;
    private final MobilyticsMetadataProvider mMobilyticsMetadataProvider;

    public MobilyticsEventDecorator(@NonNull AttributionTagProvider attributionTagProvider, @NonNull MobilyticsMetadataProvider mobilyticsMetadataProvider, @NonNull String str) {
        this.mAttributionTagProvider = attributionTagProvider;
        this.mMobilyticsMetadataProvider = mobilyticsMetadataProvider;
        this.mAndroidId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void decorate(@NonNull Metric metric, @NonNull String str) {
        if (metric instanceof DefaultMobilyticsEvent) {
            DefaultMobilyticsEvent defaultMobilyticsEvent = (DefaultMobilyticsEvent) metric;
            defaultMobilyticsEvent.withSourceContext2(str);
            defaultMobilyticsEvent.withEventMetadata(this.mMobilyticsMetadataProvider.getMobilyticsMetadata(defaultMobilyticsEvent));
            defaultMobilyticsEvent.withContentProvider(this.mAttributionTagProvider.getAttributionTag());
            defaultMobilyticsEvent.withContentVersion(this.mAndroidId);
        }
    }
}
