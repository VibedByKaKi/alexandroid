package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaAudioMetadata;
import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.api.AlexaDialogTurnStopCallback;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.UserSpeechProviderBundleKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J,\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaNextDialogTurnAdapter;", "Lcom/amazon/alexa/api/compat/AlexaNextDialogTurn;", "noncompatDialogTurn", "Lcom/amazon/alexa/api/AlexaNextDialogTurn;", "dialogTurnId", "", "<init>", "(Lcom/amazon/alexa/api/AlexaNextDialogTurn;Ljava/lang/String;)V", "getNoncompatDialogTurn", "()Lcom/amazon/alexa/api/AlexaNextDialogTurn;", "getDialogTurnId", "()Ljava/lang/String;", "startTurn", "", "audioSink", "Lcom/amazon/alexa/api/AlexaAudioSink;", "stopCallback", "Lcom/amazon/alexa/api/AlexaDialogTurnStopCallback;", "metricsCallback", "Lcom/amazon/alexa/api/compat/AlexaDialogTurnMetricsCallback;", UserSpeechProviderBundleKeys.AUDIO_METADATA, "Lcom/amazon/alexa/api/AlexaAudioMetadata;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAlexaNextDialogTurnAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlexaNextDialogTurnAdapter.kt\ncom/amazon/alexa/api/compat/AlexaNextDialogTurnAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
/* loaded from: classes16.dex */
public final class AlexaNextDialogTurnAdapter implements AlexaNextDialogTurn {

    @NotNull
    private final String dialogTurnId;

    @NotNull
    private final com.amazon.alexa.api.AlexaNextDialogTurn noncompatDialogTurn;

    public AlexaNextDialogTurnAdapter(@NotNull com.amazon.alexa.api.AlexaNextDialogTurn alexaNextDialogTurn, @NotNull String str) {
        alexaNextDialogTurn.getClass();
        str.getClass();
        this.noncompatDialogTurn = alexaNextDialogTurn;
        this.dialogTurnId = str;
    }

    @Override // com.amazon.alexa.api.compat.AlexaNextDialogTurn
    @NotNull
    public String getDialogTurnId() {
        return this.dialogTurnId;
    }

    @NotNull
    public final com.amazon.alexa.api.AlexaNextDialogTurn getNoncompatDialogTurn() {
        return this.noncompatDialogTurn;
    }

    @Override // com.amazon.alexa.api.compat.AlexaNextDialogTurn
    public void startTurn(@NotNull AlexaAudioSink audioSink, @NotNull AlexaDialogTurnStopCallback stopCallback, @Nullable AlexaDialogTurnMetricsCallback metricsCallback) {
        audioSink.getClass();
        stopCallback.getClass();
        this.noncompatDialogTurn.startTurn(audioSink, stopCallback, metricsCallback != null ? new AlexaDialogTurnMetricsCallbackAdapter(metricsCallback) : null);
    }

    @Override // com.amazon.alexa.api.compat.AlexaNextDialogTurn
    public void startTurn(@NotNull AlexaAudioSink audioSink, @NotNull AlexaDialogTurnStopCallback stopCallback) {
        audioSink.getClass();
        stopCallback.getClass();
        this.noncompatDialogTurn.startTurn(audioSink, stopCallback);
    }

    @Override // com.amazon.alexa.api.compat.AlexaNextDialogTurn
    public void startTurn(@NotNull AlexaAudioSink audioSink, @NotNull AlexaDialogTurnStopCallback stopCallback, @Nullable AlexaAudioMetadata audioMetadata) {
        audioSink.getClass();
        stopCallback.getClass();
        this.noncompatDialogTurn.startTurn(audioSink, stopCallback, audioMetadata);
    }

    @Override // com.amazon.alexa.api.compat.AlexaNextDialogTurn
    public void startTurn(@NotNull AlexaAudioSink audioSink, @NotNull AlexaDialogTurnStopCallback stopCallback, @Nullable AlexaAudioMetadata audioMetadata, @Nullable AlexaDialogTurnMetricsCallback metricsCallback) {
        audioSink.getClass();
        stopCallback.getClass();
        this.noncompatDialogTurn.startTurn(audioSink, stopCallback, audioMetadata, metricsCallback != null ? new AlexaDialogTurnMetricsCallbackAdapter(metricsCallback) : null);
    }
}
