package com.amazon.alexa.assistant.session.audio.channel;

import com.amazon.alexa.assistant.session.audio.model.ControllableAudioTask;
import com.amazon.alexa.assistant.toolkit.lifecycle.LifecycleComponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/session/audio/channel/ChannelCoordinator;", "Lcom/amazon/alexa/assistant/toolkit/lifecycle/LifecycleComponent;", "hasActiveChannel", "", "getHasActiveChannel", "()Z", "setHasActiveChannel", "(Z)V", "scheduleTask", "", "task", "Lcom/amazon/alexa/assistant/session/audio/model/ControllableAudioTask;", "releaseTask", "session_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ChannelCoordinator extends LifecycleComponent {
    boolean getHasActiveChannel();

    void releaseTask(@NotNull ControllableAudioTask task);

    void scheduleTask(@NotNull ControllableAudioTask task);

    void setHasActiveChannel(boolean z);
}
