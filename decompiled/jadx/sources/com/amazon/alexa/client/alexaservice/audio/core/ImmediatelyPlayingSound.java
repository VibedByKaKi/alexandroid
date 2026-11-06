package com.amazon.alexa.client.alexaservice.audio.core;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class ImmediatelyPlayingSound implements PlayingSound {
    private final int streamId;

    public ImmediatelyPlayingSound(int i) {
        this.streamId = i;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.PlayingSound
    public int getStreamId() {
        return this.streamId;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.PlayingSound
    public boolean hasStarted() {
        return true;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.PlayingSound
    public void cancel() {
    }
}
