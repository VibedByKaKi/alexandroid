package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.UserSpeechProviderBundleKeys;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\tH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaNextDialogTurn;", "", "dialogTurnId", "", "getDialogTurnId", "()Ljava/lang/String;", "startTurn", "", "audioSink", "Lcom/amazon/alexa/api/compat/model/AlexaAudioSink;", "stopCallback", "Lcom/amazon/alexa/api/compat/model/AlexaDialogTurnStopCallback;", UserSpeechProviderBundleKeys.AUDIO_METADATA, "Lcom/amazon/alexa/api/compat/model/AlexaAudioMetadata;", "metricsCallback", "Lcom/amazon/alexa/api/compat/model/AlexaDialogTurnMetricsCallback;", "createAudioSink", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaNextDialogTurn {
    static /* synthetic */ void startTurn$default(AlexaNextDialogTurn alexaNextDialogTurn, AlexaAudioSink alexaAudioSink, AlexaDialogTurnStopCallback alexaDialogTurnStopCallback, AlexaAudioMetadata alexaAudioMetadata, AlexaDialogTurnMetricsCallback alexaDialogTurnMetricsCallback, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: startTurn");
            return;
        }
        if ((i & 4) != 0) {
            alexaAudioMetadata = null;
        }
        if ((i & 8) != 0) {
            alexaDialogTurnMetricsCallback = null;
        }
        alexaNextDialogTurn.startTurn(alexaAudioSink, alexaDialogTurnStopCallback, alexaAudioMetadata, alexaDialogTurnMetricsCallback);
    }

    @NotNull
    default AlexaAudioSink createAudioSink() {
        throw new UnsupportedOperationException("createAudioSink is only supported on the Assistant transport");
    }

    @NotNull
    String getDialogTurnId();

    void startTurn(@NotNull AlexaAudioSink audioSink, @NotNull AlexaDialogTurnStopCallback stopCallback, @Nullable AlexaAudioMetadata audioMetadata, @Nullable AlexaDialogTurnMetricsCallback metricsCallback);
}
