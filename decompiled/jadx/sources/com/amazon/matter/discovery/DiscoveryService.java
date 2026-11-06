package com.amazon.matter.discovery;

import androidx.annotation.NonNull;
import com.amazon.alexa.matter.eventbus.schema.DiscoverOverBleRequest;
import com.amazon.alexa.matter.eventbus.schema.RequestHeader;
import com.amazon.alexa.matter.service.request.RequestHandlingException;
import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsTimer;
import com.amazon.matter.data.PairDeviceRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface DiscoveryService {
    void discoverAndPairDevice(PairDeviceRequest pairDeviceRequest, MobilyticsMetricsTimer mobilyticsMetricsTimer);

    void discoverBleDevice(@NonNull DiscoverOverBleRequest discoverOverBleRequest, @NonNull RequestHeader requestHeader) throws RequestHandlingException;
}
