package com.amazon.alexa.client.alexaservice.networking.bootstrap;

import com.amazon.alexa.client.alexaservice.networking.errors.AVSConnectionFailedReason;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface AVSConnectionStateCallback {
    public static final AVSConnectionStateCallback NOOP = new AVSConnectionStateCallback() { // from class: com.amazon.alexa.client.alexaservice.networking.bootstrap.AVSConnectionStateCallback.1
        @Override // com.amazon.alexa.client.alexaservice.networking.bootstrap.AVSConnectionStateCallback
        public void onPendingResult() {
        }

        @Override // com.amazon.alexa.client.alexaservice.networking.bootstrap.AVSConnectionStateCallback
        public void onSuccess() {
        }

        @Override // com.amazon.alexa.client.alexaservice.networking.bootstrap.AVSConnectionStateCallback
        public void onFailure(AVSConnectionFailedReason aVSConnectionFailedReason) {
        }
    };

    void onFailure(AVSConnectionFailedReason aVSConnectionFailedReason);

    void onPendingResult();

    void onSuccess();
}
