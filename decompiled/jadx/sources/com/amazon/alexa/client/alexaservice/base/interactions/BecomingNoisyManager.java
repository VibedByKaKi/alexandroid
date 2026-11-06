package com.amazon.alexa.client.alexaservice.base.interactions;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.amazon.alexa.api.AlexaPlaybackState;
import com.amazon.alexa.client.alexaservice.audio.events.AudioPlaybackChangedEvent;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.Channels;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class BecomingNoisyManager extends BroadcastReceiver {
    private static final int RECEIVER_NOT_EXPORTED = 4;
    private final Channels channels;
    private final Context context;
    private boolean isRegistered = false;
    static final IntentFilter NOISY_INTENT_FILTER = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
    private static final String TAG = "BecomingNoisyManager";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.client.alexaservice.base.interactions.BecomingNoisyManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$AlexaPlaybackState;

        static {
            int[] iArr = new int[AlexaPlaybackState.values().length];
            $SwitchMap$com$amazon$alexa$api$AlexaPlaybackState = iArr;
            try {
                iArr[AlexaPlaybackState.STOPPABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaPlaybackState[AlexaPlaybackState.STOPPABLE_AND_NAVIGABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$AlexaPlaybackState[AlexaPlaybackState.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public BecomingNoisyManager(Context context, AlexaClientEventBus alexaClientEventBus, Channels channels) {
        alexaClientEventBus.register(this);
        this.context = context;
        this.channels = channels;
    }

    @Subscribe
    public void onAudioPlaybackChangedEvent(AudioPlaybackChangedEvent audioPlaybackChangedEvent) {
        Objects.toString(audioPlaybackChangedEvent.getAlexaPlaybackState());
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$AlexaPlaybackState[audioPlaybackChangedEvent.getAlexaPlaybackState().ordinal()];
        if (i != 1 && i != 2) {
            if (this.isRegistered) {
                this.context.unregisterReceiver(this);
                this.isRegistered = false;
                return;
            }
            return;
        }
        if (this.isRegistered) {
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i2 >= 34) {
            context.registerReceiver(this, NOISY_INTENT_FILTER, 4);
        } else {
            context.registerReceiver(this, NOISY_INTENT_FILTER);
        }
        this.isRegistered = true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.channels.stopContentChannel();
        }
    }
}
