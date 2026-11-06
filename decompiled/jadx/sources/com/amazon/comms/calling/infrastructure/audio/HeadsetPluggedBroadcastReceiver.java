package com.amazon.comms.calling.infrastructure.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.comms.calling.dependency.DaggerWrapper;
import com.amazon.comms.calling.domain.model.AudioRoutes;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/audio/HeadsetPluggedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "audioRouteChangeObservable", "Lcom/amazon/comms/calling/infrastructure/audio/AudioRouteChangeObservable;", "getAudioRouteChangeObservable", "()Lcom/amazon/comms/calling/infrastructure/audio/AudioRouteChangeObservable;", "setAudioRouteChangeObservable", "(Lcom/amazon/comms/calling/infrastructure/audio/AudioRouteChangeObservable;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class HeadsetPluggedBroadcastReceiver extends BroadcastReceiver {

    @Inject
    public AudioRouteChangeObservable audioRouteChangeObservable;

    public HeadsetPluggedBroadcastReceiver() {
        DaggerWrapper.INSTANCE.getComponent().inject(this);
    }

    @NotNull
    public final AudioRouteChangeObservable getAudioRouteChangeObservable() {
        AudioRouteChangeObservable audioRouteChangeObservable = this.audioRouteChangeObservable;
        if (audioRouteChangeObservable != null) {
            return audioRouteChangeObservable;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audioRouteChangeObservable");
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -1676458352) {
                if (hashCode == -549244379 && action.equals("android.media.AUDIO_BECOMING_NOISY")) {
                    getAudioRouteChangeObservable().onAudioRouteChanged(AudioRoutes.EARPIECE);
                    return;
                }
                return;
            }
            if (action.equals("android.intent.action.HEADSET_PLUG")) {
                getAudioRouteChangeObservable().onAudioRouteChanged(intent.getIntExtra("state", 0) == 1 ? AudioRoutes.WIREDHEADSET : AudioRoutes.EARPIECE);
            }
        }
    }

    public final void setAudioRouteChangeObservable(@NotNull AudioRouteChangeObservable audioRouteChangeObservable) {
        audioRouteChangeObservable.getClass();
        this.audioRouteChangeObservable = audioRouteChangeObservable;
    }
}
