package com.amazon.commscore.commsbridge;

import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.commscore.api.commsbridge.CommsBridgeError;
import com.amazon.commscore.api.commsbridge.RequestHandler;
import com.amazon.commscore.api.commsbridge.ResponseResolver;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class RequestDispatcherImpl implements RequestDispatcher {
    private static final CommsLogger LOG = CommsLogger.getLogger(RequestDispatcherImpl.class);
    private final RequestRegistry mRegistry;

    public RequestDispatcherImpl(@NonNull RequestRegistry requestRegistry) {
        this.mRegistry = requestRegistry;
    }

    @Override // com.amazon.commscore.commsbridge.RequestDispatcher
    public void dispatch(@NonNull RequestMessage requestMessage, @NonNull ResponseResolver responseResolver) {
        String name = requestMessage.getName();
        String obj = requestMessage.getPayload() != null ? requestMessage.getPayload().toString() : null;
        RequestHandler<String> requestHandlerByName = this.mRegistry.getRequestHandlerByName(name);
        if (requestHandlerByName != null) {
            requestHandlerByName.handleRequest(obj, responseResolver);
            return;
        }
        String m = a$$ExternalSyntheticOutline0.m("[comms-bridge] No registered handler for request named ", name);
        LOG.e(m);
        responseResolver.reject(new CommsBridgeError(m));
    }
}
