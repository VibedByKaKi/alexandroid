package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import com.amazon.alexa.client.alexaservice.dialog.voice.metrics.HandsFreeTimestampSender;
import com.amazon.alexa.utils.TimeProvider;
import com.amazon.alexa.utils.device.AlexaHandsFreeDeviceInformation;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AudioLatencyTimestampRepository {
    private final AlexaHandsFreeDeviceInformation alexaHandsFreeDeviceInformation;
    private long audioStartElapsedRealTime;
    private final HandsFreeTimestampSender handsFreeTimestampSender;
    private final TimeProvider timeProvider;

    @Inject
    public AudioLatencyTimestampRepository(HandsFreeTimestampSender handsFreeTimestampSender, TimeProvider timeProvider, AlexaHandsFreeDeviceInformation alexaHandsFreeDeviceInformation) {
        this.handsFreeTimestampSender = handsFreeTimestampSender;
        this.timeProvider = timeProvider;
        this.alexaHandsFreeDeviceInformation = alexaHandsFreeDeviceInformation;
    }

    private long getCurrentTimeMillisFromElapsedRealTime(long j) {
        return (this.timeProvider.currentTimeMillis() - this.timeProvider.elapsedRealTime()) + j;
    }

    public long getAudioStartTime() {
        return this.audioStartElapsedRealTime;
    }

    public boolean isAudioStartTimeAvailable() {
        return this.audioStartElapsedRealTime != 0;
    }

    public boolean isDeviceHandsFree() {
        return this.alexaHandsFreeDeviceInformation.isCurrentDeviceHandsFree();
    }

    public void resetAudioStartTime() {
        this.audioStartElapsedRealTime = 0L;
    }

    public void setAudioStartTime(long j) {
        this.audioStartElapsedRealTime = j;
        if (isDeviceHandsFree()) {
            this.handsFreeTimestampSender.send(HandsFreeTimestampSender.TimestampName.AUDIO_START_TIME, null, getCurrentTimeMillisFromElapsedRealTime(j));
        }
    }
}
