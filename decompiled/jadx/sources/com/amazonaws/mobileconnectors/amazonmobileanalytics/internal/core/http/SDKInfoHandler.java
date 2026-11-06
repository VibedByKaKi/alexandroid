package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.http;

import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.SDKInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public final class SDKInfoHandler extends RequestHandler2 {
    static final String CLIENT_SDK_VERSION_HEADER_NAME = "x-amzn-ClientSDKVersion";
    private final SDKInfo sdkInfo;

    public SDKInfoHandler(SDKInfo sDKInfo) {
        this.sdkInfo = sDKInfo;
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    public void beforeRequest(Request<?> request) {
        if (request != null) {
            request.addHeader(CLIENT_SDK_VERSION_HEADER_NAME, this.sdkInfo.toString());
        }
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    public void afterResponse(Request<?> request, Response<?> response) {
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    public void afterError(Request<?> request, Response<?> response, Exception exc) {
    }
}
