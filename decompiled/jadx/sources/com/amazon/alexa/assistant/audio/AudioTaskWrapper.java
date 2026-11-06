package com.amazon.alexa.assistant.audio;

import com.amazon.alexa.assistant.session.audio.model.AudioChannelTask;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/audio/AudioTaskWrapper;", "Lcom/amazon/alexa/assistant/audio/AudioTask;", "delegate", "Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelTask;", "<init>", "(Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelTask;)V", "getDelegate", "()Lcom/amazon/alexa/assistant/session/audio/model/AudioChannelTask;", "identifier", "", "getIdentifier", "()Ljava/lang/String;", "release", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class AudioTaskWrapper implements AudioTask {

    @NotNull
    private final AudioChannelTask delegate;

    public AudioTaskWrapper(@NotNull AudioChannelTask audioChannelTask) {
        audioChannelTask.getClass();
        this.delegate = audioChannelTask;
    }

    @NotNull
    public final AudioChannelTask getDelegate() {
        return this.delegate;
    }

    @Override // com.amazon.alexa.assistant.audio.AudioTask
    @NotNull
    public String getIdentifier() {
        return this.delegate.getIdentifier();
    }

    @Override // com.amazon.alexa.assistant.audio.AudioTask
    public void release() {
        this.delegate.release();
    }
}
