package com.amazon.whisperjoin.softap.callbacks.errors;

import com.amazon.whisperjoin.softap.callbacks.DeviceConnectionStateChangedListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class UnexpectedDisconnectionFailureHandler implements DeviceConnectionStateChangedListener {
    private final ProvisioningErrorHandler provisioningErrorHandler;

    public UnexpectedDisconnectionFailureHandler(ProvisioningErrorHandler provisioningErrorHandler) {
        this.provisioningErrorHandler = provisioningErrorHandler;
    }

    @Override // com.amazon.whisperjoin.softap.callbacks.DeviceConnectionStateChangedListener
    public void onConnectionLost(Throwable th) {
        this.provisioningErrorHandler.handleConnectionError(th);
    }
}
