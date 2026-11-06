package com.amazon.alexa.accessory.repositories.voicestreaming;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.repositories.Producer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface VoiceStreamingProducer extends Producer<ActionHandler> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ActionHandler {
        void handleReleaseVoiceStreamLease(int i);

        void handleRequestVoiceStreamLease(int i, VoiceStreamLeaseListener voiceStreamLeaseListener);

        void handleStartVoiceStream(Producer.Result<Common.ErrorCode> result);

        void handleStartVoiceStreamLease(int i, Producer.Result<VoiceStreamStartResult> result);

        void handleStopVoiceStream(Producer.Result<Common.ErrorCode> result);

        void handleStopVoiceStreamLease(int i, Producer.Result<Common.ErrorCode> result);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface VoiceStreamLeaseListener {
        void onDenied();

        void onGranted(int i);

        void onPreempted(int i);
    }
}
