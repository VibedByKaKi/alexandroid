package com.amazon.alexa.accessory.speechapi.speech;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.UserSpeechProviderBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/speech/NextDialogTurn;", "", "getDialogTurnId", "", "startTurn", "", "audioSink", "Lcom/amazon/alexa/accessory/speechapi/speech/AccessorySink;", "dialogTurnStopCallback", "Lcom/amazon/alexa/accessory/speechapi/speech/DialogTurnStopCallback;", UserSpeechProviderBundleKeys.AUDIO_METADATA, "Lcom/amazon/alexa/accessory/speechapi/speech/AccessoryAudioMetadata;", "dialogTurnMetricsCallback", "Lcom/amazon/alexa/accessory/speechapi/speech/DialogTurnMetricsCallback;", "AlexaAccessoryAndroid-speech-api_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface NextDialogTurn {
    @NotNull
    String getDialogTurnId();

    void startTurn(@NotNull AccessorySink audioSink, @NotNull DialogTurnStopCallback dialogTurnStopCallback, @NotNull AccessoryAudioMetadata audioMetadata, @NotNull DialogTurnMetricsCallback dialogTurnMetricsCallback);
}
