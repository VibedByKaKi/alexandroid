package com.amazon.alexa.apl.media;

import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import com.amazon.alexa.api.AlexaAudioChannel;
import com.amazon.alexa.api.AlexaAudioTask;
import com.amazon.alexa.api.AlexaAudioTaskBehavior;
import com.amazon.alexa.api.AlexaAudioTaskChannelPriority;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/apl/media/AplTtsAudioTask;", "Lcom/amazon/alexa/api/AlexaAudioTask;", "ttsPlayer", "Lcom/amazon/alexa/apl/media/AplTtsPlayer;", "aplAudioFocusManager", "Lcom/amazon/alexa/apl/media/AplAudioFocusManager;", "(Lcom/amazon/alexa/apl/media/AplTtsPlayer;Lcom/amazon/alexa/apl/media/AplAudioFocusManager;)V", "getAlexaAudioChannel", "Lcom/amazon/alexa/api/AlexaAudioChannel;", "getAlexaAudioTaskBehavior", "Lcom/amazon/alexa/api/AlexaAudioTaskBehavior;", "getAlexaAudioTaskChannelPriority", "Lcom/amazon/alexa/api/AlexaAudioTaskChannelPriority;", "getAudioTaskComponentName", "", "onBackground", "", "onForeground", "onPause", "onResume", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_STOP, "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AplTtsAudioTask implements AlexaAudioTask {
    private static final String TAG = "AplTtsAudioTask";

    @NotNull
    private final AplAudioFocusManager aplAudioFocusManager;

    @NotNull
    private final AplTtsPlayer ttsPlayer;

    public AplTtsAudioTask(@NotNull AplTtsPlayer aplTtsPlayer, @NotNull AplAudioFocusManager aplAudioFocusManager) {
        aplTtsPlayer.getClass();
        aplAudioFocusManager.getClass();
        this.ttsPlayer = aplTtsPlayer;
        this.aplAudioFocusManager = aplAudioFocusManager;
    }

    @Override // com.amazon.alexa.api.AlexaAudioTask
    @NotNull
    public AlexaAudioChannel getAlexaAudioChannel() {
        return AlexaAudioChannel.DIALOG;
    }

    @Override // com.amazon.alexa.api.AlexaAudioTask
    @NotNull
    public AlexaAudioTaskBehavior getAlexaAudioTaskBehavior() {
        return AlexaAudioTaskBehavior.ENQUEUE;
    }

    @Override // com.amazon.alexa.api.AlexaAudioTask
    @NotNull
    public AlexaAudioTaskChannelPriority getAlexaAudioTaskChannelPriority() {
        return AlexaAudioTaskChannelPriority.MEDIUM;
    }

    @Override // com.amazon.alexa.api.AlexaAudioTask
    @NotNull
    public String getAudioTaskComponentName() {
        return "Alexa.Presentation.APL";
    }

    @Override // com.amazon.alexa.api.AlexaAudioTask
    public void onBackground() {
        this.aplAudioFocusManager.abandonRequest();
    }

    @Override // com.amazon.alexa.api.AlexaAudioTask
    public void onForeground() {
        if (this.aplAudioFocusManager.requestFocus()) {
            this.ttsPlayer.playDelegate();
        }
    }

    @Override // com.amazon.alexa.api.AlexaAudioTask
    public void onStop() {
        this.ttsPlayer.finish();
    }

    @Override // com.amazon.alexa.api.AlexaAudioTask
    public void onPause() {
    }

    @Override // com.amazon.alexa.api.AlexaAudioTask
    public void onResume() {
    }
}
