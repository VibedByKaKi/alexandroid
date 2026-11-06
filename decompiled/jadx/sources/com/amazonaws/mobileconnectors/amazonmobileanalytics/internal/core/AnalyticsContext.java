package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.configuration.Configuration;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver.Id;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.System;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.SDKInfo;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.DeliveryClient;
import com.amazonaws.services.mobileanalytics.AmazonMobileAnalyticsClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public interface AnalyticsContext {
    Configuration getConfiguration();

    DeliveryClient getDeliveryClient();

    AmazonMobileAnalyticsClient getERSClient();

    String getNetworkType();

    SDKInfo getSDKInfo();

    System getSystem();

    Id getUniqueId();
}
