package org.webrtc;

import android.content.Context;
import android.media.AudioManager;
import android.util.Log;
import java.util.List;
import org.webrtc.voiceengine.WebRtcAudioManager;
import org.webrtc.voiceengine.WebRtcAudioUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class WebRTCAudioUtilsShim {
    private static final String TAG = "WebRTCAudioUtilsShim";

    public static void disallowListDeviceForOpenSLESUsage() {
        WebRtcAudioManager.setBlacklistDeviceForOpenSLESUsage(true);
    }

    private static int getDefaultPlatformSupportedSampleRate(AudioManager audioManager, boolean z, int i) {
        String property;
        return (z || (property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE")) == null) ? i : Integer.parseInt(property);
    }

    public static List<Integer> readAndResetUnderrunCounts() {
        return WebRtcAudioUtils.readAndResetUnderrunCounts();
    }

    public static void requestFlagFastIfPossible(boolean z) {
        Log.i(TAG, "requestFlagFastIfPossible. viaAudioTrack= " + z);
        WebRtcAudioUtils.requestFlagFastIfPossible(z);
        if (z) {
            return;
        }
        WebRtcAudioManager.setBlacklistDeviceForOpenSLESUsage(false);
    }

    public static void setAudioCaptureRenderSampleRate(Context context, boolean z, int i, boolean z2, int i2) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int defaultPlatformSupportedSampleRate = getDefaultPlatformSupportedSampleRate(audioManager, z, i);
        int defaultPlatformSupportedSampleRate2 = getDefaultPlatformSupportedSampleRate(audioManager, z2, i2);
        Log.i(TAG, "Record_sample_rate: " + defaultPlatformSupportedSampleRate + " render_sample_rate: " + defaultPlatformSupportedSampleRate2);
        WebRtcAudioUtils.setDefaultInputOutputSampleRateHz(defaultPlatformSupportedSampleRate, defaultPlatformSupportedSampleRate2);
    }

    public static void setOutputAudioDevice(int i) {
        WebRtcAudioUtils.setOutputAudioDevice(i);
    }

    public static void setRenderTrackBufferSize(int i) {
        Log.i(TAG, "setRenderTrackBufferSize. bufferSizeInBytes= " + i);
        WebRtcAudioUtils.setRenderTrackBufferSize(i);
    }
}
