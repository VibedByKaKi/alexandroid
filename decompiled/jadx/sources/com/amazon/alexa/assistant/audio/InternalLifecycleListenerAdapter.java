package com.amazon.alexa.assistant.audio;

import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import com.amazon.alexa.assistant.audio.AudioTask;
import com.amazon.alexa.assistant.session.audio.model.AudioTaskState;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/audio/InternalLifecycleListenerAdapter;", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskLifecycleListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/assistant/audio/AudioTaskLifecycleListener;", "<init>", "(Lcom/amazon/alexa/assistant/audio/AudioTaskLifecycleListener;)V", "onForeground", "", "onBackground", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_STOP, "reason", "Lcom/amazon/alexa/assistant/session/audio/model/AudioTaskState$StoppedReason;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final class InternalLifecycleListenerAdapter implements com.amazon.alexa.assistant.session.audio.model.AudioTaskLifecycleListener {

    @NotNull
    private final AudioTaskLifecycleListener listener;

    public InternalLifecycleListenerAdapter(@NotNull AudioTaskLifecycleListener audioTaskLifecycleListener) {
        audioTaskLifecycleListener.getClass();
        this.listener = audioTaskLifecycleListener;
    }

    @Override // com.amazon.alexa.assistant.session.audio.model.AudioTaskLifecycleListener
    public void onBackground() {
        this.listener.onBackground();
    }

    @Override // com.amazon.alexa.assistant.session.audio.model.AudioTaskLifecycleListener
    public void onForeground() {
        this.listener.onForeground();
    }

    @Override // com.amazon.alexa.assistant.session.audio.model.AudioTaskLifecycleListener
    public void onStop(@NotNull AudioTaskState.StoppedReason reason) {
        AudioTask.StopReason stopReason;
        reason.getClass();
        AudioTaskLifecycleListener audioTaskLifecycleListener = this.listener;
        stopReason = DefaultExternalAudioTaskSchedulerKt.toPublic(reason);
        audioTaskLifecycleListener.onStop(stopReason);
    }
}
