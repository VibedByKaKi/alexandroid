package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaAudioMetadata;
import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.api.AlexaDataSink;
import com.amazon.alexa.api.AlexaDialogExtras;
import com.amazon.alexa.api.AlexaDialogTurnStopCallback;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.UserSpeechProviderBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J*\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\rH&J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaDialogTurn;", "", "dialogTurnId", "", "getDialogTurnId", "()Ljava/lang/String;", "startTurn", "", UserSpeechProviderBundleKeys.AUDIO_METADATA, "Lcom/amazon/alexa/api/AlexaAudioMetadata;", "audioSink", "Lcom/amazon/alexa/api/AlexaAudioSink;", "stopCallback", "Lcom/amazon/alexa/api/AlexaDialogTurnStopCallback;", UserSpeechProviderBundleKeys.DIALOG_EXTRAS, "Lcom/amazon/alexa/api/AlexaDialogExtras;", "metricsCallback", "Lcom/amazon/alexa/api/compat/AlexaDialogTurnMetricsCallback;", "dataSink", "Lcom/amazon/alexa/api/AlexaDataSink;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaDialogTurn {
    @NotNull
    String getDialogTurnId();

    void startTurn(@NotNull AlexaAudioMetadata audioMetadata, @NotNull AlexaAudioSink audioSink, @Nullable AlexaDataSink dataSink, @NotNull AlexaDialogTurnStopCallback stopCallback);

    void startTurn(@NotNull AlexaAudioMetadata audioMetadata, @NotNull AlexaAudioSink audioSink, @Nullable AlexaDataSink dataSink, @NotNull AlexaDialogTurnStopCallback stopCallback, @Nullable AlexaDialogExtras dialogExtras);

    void startTurn(@NotNull AlexaAudioMetadata audioMetadata, @NotNull AlexaAudioSink audioSink, @Nullable AlexaDataSink dataSink, @NotNull AlexaDialogTurnStopCallback stopCallback, @Nullable AlexaDialogTurnMetricsCallback metricsCallback);

    void startTurn(@NotNull AlexaAudioMetadata audioMetadata, @NotNull AlexaAudioSink audioSink, @Nullable AlexaDataSink dataSink, @NotNull AlexaDialogTurnStopCallback stopCallback, @Nullable AlexaDialogTurnMetricsCallback metricsCallback, @Nullable AlexaDialogExtras dialogExtras);

    void startTurn(@NotNull AlexaAudioMetadata audioMetadata, @NotNull AlexaAudioSink audioSink, @NotNull AlexaDialogTurnStopCallback stopCallback);

    void startTurn(@NotNull AlexaAudioMetadata audioMetadata, @NotNull AlexaAudioSink audioSink, @NotNull AlexaDialogTurnStopCallback stopCallback, @Nullable AlexaDialogExtras dialogExtras);

    void startTurn(@NotNull AlexaAudioMetadata audioMetadata, @NotNull AlexaAudioSink audioSink, @NotNull AlexaDialogTurnStopCallback stopCallback, @Nullable AlexaDialogTurnMetricsCallback metricsCallback);

    void startTurn(@NotNull AlexaAudioMetadata audioMetadata, @NotNull AlexaAudioSink audioSink, @NotNull AlexaDialogTurnStopCallback stopCallback, @Nullable AlexaDialogTurnMetricsCallback metricsCallback, @Nullable AlexaDialogExtras dialogExtras);
}
