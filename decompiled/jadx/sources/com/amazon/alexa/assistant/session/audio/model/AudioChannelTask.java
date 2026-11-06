package com.amazon.alexa.assistant.session.audio.model;

import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelTask;", "", "channel", "Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelType;", "getChannel", "()Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelType;", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "audioTaskStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState;", "getAudioTaskStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "schedule", "", "release", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AudioChannelTask {
    @NotNull
    StateFlow<AudioTaskState> getAudioTaskStateFlow();

    @NotNull
    AudioChannelType getChannel();

    @NotNull
    String getIdentifier();

    void release();

    void schedule();
}
