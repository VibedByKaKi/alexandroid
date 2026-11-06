package com.amazon.alexa.assistant.session.audio.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\rH&J\b\u0010\u0014\u001a\u00020\rH&J\b\u0010\u0015\u001a\u00020\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioChannel;", "", "channelType", "Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelType;", "getChannelType", "()Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelType;", "channelState", "Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelState;", "getChannelState", "()Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelState;", "setChannelState", "(Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelState;)V", "moveToForeground", "", "moveToBackground", "pushTask", "audioTask", "Lcom/amazon/alexa/assistant/session/audio/model/ControllableAudioTask;", "popTask", "startInterruption", "endInterruption", "resumeInterruption", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AudioChannel {
    void endInterruption();

    @NotNull
    AudioChannelState getChannelState();

    @NotNull
    AudioChannelType getChannelType();

    void moveToBackground();

    void moveToForeground();

    void popTask(@NotNull ControllableAudioTask audioTask);

    void pushTask(@NotNull ControllableAudioTask audioTask);

    void resumeInterruption();

    void setChannelState(@NotNull AudioChannelState audioChannelState);

    void startInterruption();
}
