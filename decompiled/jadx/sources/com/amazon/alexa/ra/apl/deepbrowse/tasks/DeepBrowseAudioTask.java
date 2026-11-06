package com.amazon.alexa.ra.apl.deepbrowse.tasks;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import com.amazon.alexa.api.compat.model.AlexaAudioChannel;
import com.amazon.alexa.api.compat.model.AlexaAudioTask;
import com.amazon.alexa.api.compat.model.AlexaAudioTaskBehavior;
import com.amazon.alexa.api.compat.model.AlexaAudioTaskChannelPriority;
import com.amazon.alexa.mosaic.apl.dependencies.tts.IPlayback;
import com.amazon.tarazed.session.sessionEvents.StateChangeEventTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B2\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/apl/deepbrowse/tasks/DeepBrowseAudioTask;", "Lcom/amazon/alexa/api/compat/model/AlexaAudioTask;", StateChangeEventTypes.PLAYBACK_STATE_CHANGE, "Lcom/amazon/alexa/mosaic/apl/dependencies/tts/IPlayback;", "unschedule", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "task", "", "<init>", "(Lcom/amazon/alexa/mosaic/apl/dependencies/tts/IPlayback;Lkotlin/jvm/functions/Function1;)V", "getUnschedule", "()Lkotlin/jvm/functions/Function1;", "getAlexaAudioChannel", "Lcom/amazon/alexa/api/compat/model/AlexaAudioChannel;", "getAudioTaskComponentName", "", "getAlexaAudioTaskChannelPriority", "Lcom/amazon/alexa/api/compat/model/AlexaAudioTaskChannelPriority;", "getAlexaAudioTaskBehavior", "Lcom/amazon/alexa/api/compat/model/AlexaAudioTaskBehavior;", "onBackground", "onForeground", "onPause", "onResume", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_STOP, "AVSMobileFramework-ra-apl-deep-browse-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DeepBrowseAudioTask implements AlexaAudioTask {
    public static final int $stable = 8;

    @NotNull
    private final IPlayback playback;

    @NotNull
    private final Function1<AlexaAudioTask, Unit> unschedule;

    /* JADX WARN: Multi-variable type inference failed */
    public DeepBrowseAudioTask(@NotNull IPlayback iPlayback, @NotNull Function1<? super AlexaAudioTask, Unit> function1) {
        iPlayback.getClass();
        function1.getClass();
        this.playback = iPlayback;
        this.unschedule = function1;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    @NotNull
    /* renamed from: getAlexaAudioChannel */
    public AlexaAudioChannel getChannel() {
        return AlexaAudioChannel.DIALOG;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    @NotNull
    /* renamed from: getAlexaAudioTaskBehavior */
    public AlexaAudioTaskBehavior getBehavior() {
        return AlexaAudioTaskBehavior.ENQUEUE;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    @NotNull
    /* renamed from: getAlexaAudioTaskChannelPriority */
    public AlexaAudioTaskChannelPriority getPriority() {
        return AlexaAudioTaskChannelPriority.MEDIUM;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    @NotNull
    /* renamed from: getAudioTaskComponentName */
    public String getComponentName() {
        return "Alexa.Presentation.APL";
    }

    @NotNull
    public final Function1<AlexaAudioTask, Unit> getUnschedule() {
        return this.unschedule;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    public void onBackground() {
        this.unschedule.invoke(this);
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    public void onForeground() {
        this.playback.onStart();
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    public void onStop() {
        this.playback.onStop();
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    public void onPause() {
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
    public void onResume() {
    }
}
