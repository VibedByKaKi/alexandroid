package com.amazonaws.handlers;

import com.amazonaws.Request;
import com.amazonaws.util.TimingInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes5.dex */
public abstract class AbstractRequestHandler implements RequestHandler {
    @Override // com.amazonaws.handlers.RequestHandler
    public void beforeRequest(Request<?> request) {
    }

    @Override // com.amazonaws.handlers.RequestHandler
    public void afterError(Request<?> request, Exception exc) {
    }

    @Override // com.amazonaws.handlers.RequestHandler
    public void afterResponse(Request<?> request, Object obj, TimingInfo timingInfo) {
    }
}
