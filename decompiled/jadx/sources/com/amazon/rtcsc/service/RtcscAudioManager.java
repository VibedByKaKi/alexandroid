package com.amazon.rtcsc.service;

import amazon.media.AmazonAudioManager;
import android.content.Context;
import android.media.AudioManager;
import android.util.Log;
import com.amazon.rtcsc.interfaces.RtcscAudioFocusConfig;
import com.amazon.rtcsc.service.deviceconfiguration.DeviceInfo;
import com.amazon.rtcsc.utils.RtcscLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RtcscAudioManager {
    protected static final int AMAZON_AUDIO_MANAGER_FORCE_NONE = 0;
    protected static final int AMAZON_AUDIO_MANAGER_FORCE_REMOTE_INPUT = 3;
    protected static final int AMAZON_AUDIO_MANAGER_FOR_COMMUNICATION = 0;
    private final AudioManager mAudioManager;
    private boolean mIsStreamlineFireTv;
    private int mSavedAudioMode;
    private boolean mShouldRestore;
    private final RtcscLogger mLog = RtcscLogger.getLogger(RtcscAudioManager.class);
    AudioManager.OnAudioFocusChangeListener audioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: com.amazon.rtcsc.service.RtcscAudioManager.1
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == 1) {
                RtcscAudioManager.this.mLog.i("onAudioFocusChange GAINED");
            } else if (i == -2) {
                RtcscAudioManager.this.mLog.i("onAudioFocusChange LOSS TRANSIENT");
            } else if (i == -1) {
                RtcscAudioManager.this.mLog.i("onAudioFocusChange LOSS");
            }
        }
    };

    public RtcscAudioManager(Context context) {
        this.mAudioManager = (AudioManager) context.getSystemService("audio");
        if (DeviceInfo.isStreamlineFireTV(context)) {
            this.mIsStreamlineFireTv = true;
        }
    }

    public static boolean setForceUse(int i, int i2) {
        try {
            Class<?> cls = Class.forName("android.media.AudioSystem");
            Class cls2 = Integer.TYPE;
            cls.getMethod("setForceUse", cls2, cls2).invoke(null, Integer.valueOf(i), Integer.valueOf(i2));
            return true;
        } catch (ReflectiveOperationException e) {
            Log.e(RtcscAudioManager.class.getName(), "Error calling AudioSystem.setForceUse", e);
            return false;
        }
    }

    public int acquireAudioFocus(RtcscAudioFocusConfig rtcscAudioFocusConfig) {
        int i = rtcscAudioFocusConfig == RtcscAudioFocusConfig.GAIN_TRANSIENT ? 2 : 1;
        this.mLog.i("AcquireAudioFocus with config: " + rtcscAudioFocusConfig + ", focusGainType: " + i);
        int requestAudioFocus = this.mAudioManager.requestAudioFocus(this.audioFocusChangeListener, 0, i);
        if (requestAudioFocus == 1) {
            this.mLog.i("AudioFocus request granted.");
            return requestAudioFocus;
        }
        if (requestAudioFocus == 0) {
            this.mLog.e("AudioFocus request failed.");
        }
        return requestAudioFocus;
    }

    public void forceRemoteMicrophoneAsSource(boolean z) {
        this.mLog.i("forceRemoteMicrophoneAsSource enabled: " + z);
        AudioManager audioManager = this.mAudioManager;
        if (audioManager == null) {
            this.mLog.e("mAudioManager is null. forceRemoteMicrophoneAsSource failed.");
            return;
        }
        if (this.mIsStreamlineFireTv) {
            return;
        }
        if (!(audioManager instanceof AmazonAudioManager)) {
            this.mLog.e("Cannot cast mAudioManager to AmazonAudioManager. forceRemoteMicrophoneAsSource failed.");
            return;
        }
        AmazonAudioManager amazonAudioManager = (AmazonAudioManager) audioManager;
        if (z) {
            amazonAudioManager.setForceUse(AmazonAudioManager.FOR_COMMUNICATION, 3);
        } else {
            amazonAudioManager.setForceUse(AmazonAudioManager.FOR_COMMUNICATION, AmazonAudioManager.FORCE_NONE);
        }
    }

    public void releaseAudioFocus() {
        this.mLog.i("releaseAudioFocus");
        int abandonAudioFocus = this.mAudioManager.abandonAudioFocus(this.audioFocusChangeListener);
        if (abandonAudioFocus == 1) {
            this.mLog.i("Abandoned AudioFocus");
        } else if (abandonAudioFocus == 0) {
            this.mLog.e("Failed to Abandon AudioFocus");
        }
    }

    public void restoreAudioMode() {
        if (!this.mShouldRestore) {
            this.mLog.i("Skipped restoring audio mode.");
            return;
        }
        this.mAudioManager.setMode(this.mSavedAudioMode);
        this.mLog.i("Restoring the audio mode");
        this.mShouldRestore = false;
    }

    public void setCommunicationsMode() {
        int mode = this.mAudioManager.getMode();
        this.mLog.i("Current Audio Mode is " + mode);
        if (mode == 3) {
            this.mLog.i("Skipped setting audio mode. Already set to MODE_IN_COMMUNICATION");
            return;
        }
        this.mSavedAudioMode = mode;
        this.mShouldRestore = true;
        this.mAudioManager.setMode(3);
        this.mLog.i("Audio Mode set to MODE_IN_COMMUNICATION");
    }
}
