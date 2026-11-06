package com.amazon.alexa.smarthomecameras.session;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.AlexaLatencyMetadata;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.FirstFrameLatencyMetadata;
import com.amazon.alexa.smarthomecameras.liveviewcontroller.v2.model.LvcTimestamp;
import java.time.Instant;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class StartLiveViewLatency {

    @Nullable
    private final AlexaLatencyMetadata alexaLatencyMetadata;

    @NonNull
    private final Instant receivedAt;

    private StartLiveViewLatency(@Nullable AlexaLatencyMetadata alexaLatencyMetadata, @NonNull Instant instant) {
        this.alexaLatencyMetadata = alexaLatencyMetadata;
        this.receivedAt = instant;
    }

    public static StartLiveViewLatency receivedNow(@Nullable AlexaLatencyMetadata alexaLatencyMetadata) {
        return new StartLiveViewLatency(alexaLatencyMetadata, Instant.now());
    }

    @NonNull
    public FirstFrameLatencyMetadata firstFrameRenderedAt(@NonNull Instant instant) {
        return new FirstFrameLatencyMetadata(LvcTimestamp.format(this.receivedAt), LvcTimestamp.format(instant));
    }

    @Nullable
    public AlexaLatencyMetadata getAlexaLatencyMetadata() {
        return this.alexaLatencyMetadata;
    }

    @NonNull
    public Instant getReceivedAt() {
        return this.receivedAt;
    }
}
