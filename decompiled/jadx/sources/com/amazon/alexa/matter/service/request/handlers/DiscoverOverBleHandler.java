package com.amazon.alexa.matter.service.request.handlers;

import androidx.annotation.NonNull;
import com.amazon.alexa.matter.eventbus.schema.DiscoverOverBleRequest;
import com.amazon.alexa.matter.eventbus.schema.RequestHeader;
import com.amazon.alexa.matter.service.request.GenericMultiplexedRequestHandler;
import com.amazon.alexa.matter.service.request.RequestHandlingException;
import com.amazon.alexa.matter.service.response.Responder;
import com.amazon.alexa.matter.utils.logging.MatterLogger;
import com.amazon.alexa.matter.utils.logging.PrefixLogger;
import com.amazon.matter.discovery.DiscoveryService;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes14.dex */
public class DiscoverOverBleHandler extends GenericMultiplexedRequestHandler<DiscoverOverBleRequest> {

    @NonNull
    private final DiscoveryService mDiscoveryService;

    @Inject
    public DiscoverOverBleHandler(@NonNull DiscoveryService discoveryService, @NonNull MatterLogger matterLogger) {
        super(PrefixLogger.scopedTo(DiscoverOverBleHandler.class, matterLogger));
        this.mDiscoveryService = discoveryService;
    }

    @Override // com.amazon.alexa.matter.service.request.MultiplexedRequestHandler
    public void handle(@NonNull DiscoverOverBleRequest discoverOverBleRequest, @NonNull RequestHeader requestHeader, @NonNull Responder responder) {
        this.mLogger.info("handle(..., { \"requestID\": \"" + requestHeader.getRequestID() + "\" }, ...)");
        try {
            this.mDiscoveryService.discoverBleDevice(discoverOverBleRequest, requestHeader);
            this.mLogger.info("Started BLE discovery");
        } catch (RequestHandlingException e) {
            this.mLogger.error("Failed to start BLE discovery", e);
            responder.respond(requestHeader, e);
        }
    }
}
