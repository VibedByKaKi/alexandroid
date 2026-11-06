package com.amazon.alexa.api;

import com.amazon.alexa.api.Bundles;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class VoiceActivityDetectionMessagePayload extends BaseMessagePayload {
    public VoiceActivityDetectionMessagePayload(ExtendedClient extendedClient, VoiceChatModeState voiceChatModeState, VoiceChatModeChangeReason voiceChatModeChangeReason) {
        super(extendedClient);
        add(VoiceActivityDetectionArgumentKey.STATE, voiceChatModeState.name());
        add(VoiceActivityDetectionArgumentKey.REASON, voiceChatModeChangeReason.name());
    }

    public VoiceActivityDetectionMessagePayload(ExtendedClient extendedClient, long j, long j2) {
        super(extendedClient);
        add((Bundles.Key) VoiceActivityDetectionArgumentKey.TIMESTAMP, j);
        add((Bundles.Key) VoiceActivityDetectionArgumentKey.DURATION, j2);
    }

    public VoiceActivityDetectionMessagePayload(ExtendedClient extendedClient, VoiceChatModeState voiceChatModeState) {
        super(extendedClient);
        add(VoiceActivityDetectionArgumentKey.STATE, voiceChatModeState.name());
    }

    public VoiceActivityDetectionMessagePayload(ExtendedClient extendedClient, long j, float f) {
        super(extendedClient);
        add((Bundles.Key) VoiceActivityDetectionArgumentKey.TIMESTAMP, j);
        add(VoiceActivityDetectionArgumentKey.CONFIDENCE_LEVEL, f);
    }
}
