package com.amazon.alexa.mobilytics.configuration;

import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface RecordChecker {
    void initialize();

    boolean isBlacklisted(@NonNull MobilyticsEvent mobilyticsEvent);

    boolean isDCMDeprecatedV2(@NonNull MobilyticsEvent mobilyticsEvent);

    boolean isDenylisted(@NonNull MobilyticsEvent mobilyticsEvent);

    boolean shouldBeSent(@NonNull DCMEndpoint dCMEndpoint, @NonNull MobilyticsEvent mobilyticsEvent);

    boolean shouldBeSent(@NonNull KinesisEndpoint kinesisEndpoint, @NonNull MobilyticsEvent mobilyticsEvent);
}
