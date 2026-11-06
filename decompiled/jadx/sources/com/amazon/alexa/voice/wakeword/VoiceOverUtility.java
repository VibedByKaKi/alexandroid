package com.amazon.alexa.voice.wakeword;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.view.accessibility.AccessibilityManager;
import com.amazon.alexa.voice.metrics.VoxMetricEvent;
import com.amazon.alexa.voice.metrics.VoxMetricEventName;
import com.amazon.alexa.voice.metrics.VoxMetricEventProcessingService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VoiceOverUtility {
    private static final int ACCESSIBILITY_STREAM = 10;
    private final Context context;
    private final VoxMetricEventProcessingService voxMetricEventProcessingService;

    public VoiceOverUtility(Context context, VoxMetricEventProcessingService voxMetricEventProcessingService) {
        this.context = context;
        this.voxMetricEventProcessingService = voxMetricEventProcessingService;
    }

    @SuppressLint({"MissingPermission"})
    public boolean isExternalAudioDeviceConnected() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled() && defaultAdapter.getProfileConnectionState(1) == 2;
    }

    @SuppressLint({"PrivateApi"})
    public boolean isVoiceOverCurrentlySpeaking() {
        Boolean bool = Boolean.FALSE;
        try {
            Class<?> cls = Class.forName("android.media.AudioSystem");
            Class cls2 = Integer.TYPE;
            bool = (Boolean) cls.getDeclaredMethod("isStreamActive", cls2, cls2).invoke(null, 10, 0);
        } catch (Exception unused) {
            this.voxMetricEventProcessingService.process(VoxMetricEvent.occurNow(VoxMetricEventName.VOX_CHECKING_ACCESSIBILITY_STREAM_FAILED));
        }
        return bool.booleanValue();
    }

    public boolean isVoiceOverServiceEnabled() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.context.getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        return !accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty();
    }

    public boolean isWiredHeadsetConnected() {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.context.getSystemService("audio")).getDevices(3)) {
            if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3) {
                return true;
            }
        }
        return false;
    }
}
