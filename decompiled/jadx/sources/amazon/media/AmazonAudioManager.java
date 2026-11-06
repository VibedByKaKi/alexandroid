package amazon.media;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class AmazonAudioManager extends AudioManager {
    public static final int AUDIO_INPUT_CLOSED = 6;
    public static final int AUDIO_INPUT_CONFIG_CHANGED = 7;
    public static final int AUDIO_INPUT_OPENED = 5;
    public static final int AUDIO_INPUT_REGISTERED = 4;
    public static final int AUDIO_OUTPUT_CLOSED = 2;
    public static final int AUDIO_OUTPUT_CONFIG_CHANGED = 3;
    public static final int AUDIO_OUTPUT_OPENED = 1;
    public static final int AUDIO_OUTPUT_REGISTERED = 0;
    public static final int DIALOGUE_ENHANCER = 2;
    public static final int ERROR = -1;
    public static final int ERROR_BAD_VALUE = -3;
    public static final int FLAG_A2DP_OUT = 0;
    public static final int FLAG_AUTO_OUT = 0;
    public static final int FLAG_HDMI_OUT = 0;
    public static final int FLAG_SPEAKER_OUT = 0;
    public static final int FLAG_STUB_OUT = 0;
    public static final int FLAG_TIME_SYNC = 0;
    public static final int FORCE_BT_SCO = 0;
    public static final int FORCE_BUILTIN_MIC = 0;
    public static final int FORCE_DUAL_WITH_SPEAKER = 0;
    public static final int FORCE_HDMI_ARC = 0;
    public static final int FORCE_HDMI_SYSTEM_AUDIO_ENFORCED = 0;
    public static final int FORCE_NONE = 0;
    public static final int FORCE_NONE_DEVICE_VOLUME = 1000;
    public static final int FORCE_SPDIF = 0;
    public static final int FORCE_SPEAKER = 0;
    public static final int FORCE_SPEAKER_DEVICE_VOLUME = 1001;
    public static final int FOR_COMMUNICATION = 0;
    public static final int FOR_MEDIA = 0;
    public static final int FOR_RECORD = 0;
    public static final int FOR_SYSTEM = 0;
    public static final int FOR_ULTRASOUND_PRESENCE_DETECTION = 0;
    public static final int HDMI_OUT_ACTIVE = 1;
    public static final int HDMI_OUT_NOT_ACTIVE = 0;
    public static final int HDMI_OUT_STATE_UNKNOWN = 2;
    public static final int HEADPHONE_VIRTUALIZER = 3;
    public static final int NOT_SUPPORTED = -2;
    public static final int NO_ERROR = 0;
    public static final int ROUTING_MODE_HDMI = 0;
    public static final int ROUTING_MODE_SPEAKER = 0;
    public static final int VOLUME_LEVELER = 1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IAudioFocusSwitchObserver {
        void onAcquire(String str, int i, int i2);

        void onRelease(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IAudioIOObserver {
        void onIOChanged(int i, int i2, AudioFormat audioFormat);
    }

    private AmazonAudioManager() {
        super(null);
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public int abandonAudioFocusAndReleaseDucking(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public boolean getAdvancedAudioSettingState(int i) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public boolean getDolbyDapEnabled() {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public boolean getDualModeAudioCapability() {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public int getHdmiOutStateHint() {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public String getPackageInFocus() {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void registerAudioIOObserver(IAudioIOObserver iAudioIOObserver, Handler handler) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public boolean registerAudioSwitchObserver(IAudioFocusSwitchObserver iAudioFocusSwitchObserver) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public int requestAudioFocus(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2, boolean z) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public int requestAudioFocusWithDucking(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public int resetAudioRoutingMode(int i) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public int setAdvancedAudioSettingState(int i, boolean z) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void setAudioMute(boolean z) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public int setAudioRoutingMode(int i, int i2) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public boolean setDolbyDapEnabled(boolean z) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void setForceUse(int i, int i2) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public int setHdmiOutStateHint(int i) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void unregisterAudioIOObserver(IAudioIOObserver iAudioIOObserver) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    public void unregisterAudioSwitchObserver(IAudioFocusSwitchObserver iAudioFocusSwitchObserver) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }

    @Deprecated
    public int requestAudioFocusWithDucking(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2) {
        throw new RuntimeException("Stub! You are bundling a stubbed jar in the apk! Please move it to the classpath instead.");
    }
}
