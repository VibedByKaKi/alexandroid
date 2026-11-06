package com.amazon.alexa.client.alexaservice.dialog.voice.metrics;

import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class UserPerceivedLatencyCalculatedEvent extends Event.NotGated {
    public static UserPerceivedLatencyCalculatedEvent create(String str, DialogRequestIdentifier dialogRequestIdentifier, DialogTurnIdentifier dialogTurnIdentifier, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2) {
        return new AutoValue_UserPerceivedLatencyCalculatedEvent(str, dialogRequestIdentifier, dialogTurnIdentifier, j, j2, j3, j4, j5, j6, j7, z, z2);
    }

    public abstract long getAlexaSpeechReadyRealtimeMs();

    public abstract long getAlexaSpeechStartedRealtimeMs();

    public abstract long getClientSideUplContributionMs();

    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract DialogTurnIdentifier getDialogTurnIdentifier();

    public abstract long getEndOfSpeechOffsetRealtimeMs();

    public abstract String getInvocationType();

    public abstract long getNormalizedClientSideUplContributionMs();

    public abstract long getNormalizedUserPerceivedLatencyMs();

    public abstract long getTotalUserPerceivedLatencyMs();

    public abstract boolean isOpusEncoded();

    public abstract boolean isUsingLegacyAlgorithm();
}
