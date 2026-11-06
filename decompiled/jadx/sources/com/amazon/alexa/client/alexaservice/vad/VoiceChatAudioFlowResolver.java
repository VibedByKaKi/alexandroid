package com.amazon.alexa.client.alexaservice.vad;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.frames.TopContactProvider$$ExternalSyntheticLambda0;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.client.alexaservice.vad.KnownDevicesToHandle;
import com.amazon.alexa.ra.features.featurecheck.FeatureSource;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class VoiceChatAudioFlowResolver {

    @VisibleForTesting
    static final long ROUTE_CHANGE_DEBOUNCE_MS = 500;
    private static final String TAG = "VCMAudioFlowResolver";

    @Nullable
    private final AudioManager audioManager;

    @Nullable
    private Handler debounceHandler;

    @Nullable
    private AudioDeviceCallback deviceCallback;

    @NonNull
    private final FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority;
    private final CopyOnWriteArraySet<Runnable> routeChangeListeners = new CopyOnWriteArraySet<>();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.client.alexaservice.vad.VoiceChatAudioFlowResolver$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$client$alexaservice$vad$KnownDevicesToHandle$FeatureGate;

        static {
            int[] iArr = new int[KnownDevicesToHandle.FeatureGate.values().length];
            $SwitchMap$com$amazon$alexa$client$alexaservice$vad$KnownDevicesToHandle$FeatureGate = iArr;
            try {
                iArr[KnownDevicesToHandle.FeatureGate.KH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Inject
    public VoiceChatAudioFlowResolver(@Nullable AudioManager audioManager, @NonNull FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority) {
        this.audioManager = audioManager;
        this.featureFlagConfigurationAuthority = featureFlagConfigurationAuthority;
    }

    private boolean isFeatureGateEnabled(KnownDevicesToHandle.FeatureGate featureGate) {
        if (AnonymousClass2.$SwitchMap$com$amazon$alexa$client$alexaservice$vad$KnownDevicesToHandle$FeatureGate[featureGate.ordinal()] != 1) {
            return false;
        }
        return this.featureFlagConfigurationAuthority.isEnabled(FeatureSource.AVS_ANDROID_NAMESPACE, Feature.ALEXA_VOICE_ANDROID_LIVE_MODE_AUDIO_MODE_NORMAL_KH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scheduleRouteChangeNotification$0() {
        Iterator<Runnable> it2 = this.routeChangeListeners.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleRouteChangeNotification() {
        Handler handler = this.debounceHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new TopContactProvider$$ExternalSyntheticLambda0(this, 27), 500L);
    }

    public synchronized void addRouteChangeListener(@NonNull Runnable runnable) {
        if (this.audioManager == null) {
            return;
        }
        this.routeChangeListeners.add(runnable);
        if (this.deviceCallback == null) {
            this.debounceHandler = new Handler(Looper.getMainLooper());
            AudioDeviceCallback audioDeviceCallback = new AudioDeviceCallback() { // from class: com.amazon.alexa.client.alexaservice.vad.VoiceChatAudioFlowResolver.1
                @Override // android.media.AudioDeviceCallback
                public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                    VoiceChatAudioFlowResolver.this.scheduleRouteChangeNotification();
                }

                @Override // android.media.AudioDeviceCallback
                public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                    VoiceChatAudioFlowResolver.this.scheduleRouteChangeNotification();
                }
            };
            this.deviceCallback = audioDeviceCallback;
            this.audioManager.registerAudioDeviceCallback(audioDeviceCallback, this.debounceHandler);
        }
    }

    public boolean isAecValidatedDevice() {
        return KnownDevicesToHandle.match(Build.MANUFACTURER, Build.MODEL) != null;
    }

    @VisibleForTesting
    public boolean isOutputBuiltInSpeaker() {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return true;
        }
        try {
            AudioDeviceInfo[] devices = audioManager.getDevices(2);
            if (devices.length == 0) {
                return false;
            }
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                int type = audioDeviceInfo.getType();
                if (type != 1 && type != 2) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            Log.w(TAG, "getDevices failed; assuming external route for safety", e);
            return false;
        }
    }

    public synchronized void removeRouteChangeListener(@NonNull Runnable runnable) {
        AudioDeviceCallback audioDeviceCallback;
        AudioManager audioManager;
        this.routeChangeListeners.remove(runnable);
        if (this.routeChangeListeners.isEmpty() && (audioDeviceCallback = this.deviceCallback) != null && (audioManager = this.audioManager) != null) {
            audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
            this.deviceCallback = null;
            Handler handler = this.debounceHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.debounceHandler = null;
            }
        }
    }

    public VoiceChatAudioFlow resolveFlow() {
        KnownDevicesToHandle.DeviceRule match = KnownDevicesToHandle.match(Build.MANUFACTURER, Build.MODEL);
        if (match != null) {
            VoiceChatAudioFlow voiceChatAudioFlow = match.flow;
            VoiceChatAudioFlow voiceChatAudioFlow2 = VoiceChatAudioFlow.PREFER_AUDIO_MODE_NORMAL;
            if (voiceChatAudioFlow == voiceChatAudioFlow2) {
                if (!isFeatureGateEnabled(match.featureGate)) {
                    Objects.toString(match.featureGate);
                    return VoiceChatAudioFlow.COMM_MODE;
                }
                if (!isOutputBuiltInSpeaker()) {
                    return VoiceChatAudioFlow.COMM_MODE;
                }
                Objects.toString(match.featureGate);
                return voiceChatAudioFlow2;
            }
        }
        return VoiceChatAudioFlow.COMM_MODE;
    }
}
