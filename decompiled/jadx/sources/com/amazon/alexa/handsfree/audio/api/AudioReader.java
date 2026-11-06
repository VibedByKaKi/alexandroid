package com.amazon.alexa.handsfree.audio.api;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaServicesConnection;
import com.amazon.alexa.handsfree.audio.AlexaConnectionListener;
import com.amazon.alexa.handsfree.audio.AlexaConnectionListenerFactory;
import com.amazon.alexa.handsfree.audio.AlexaServicesConnectionFactory;
import com.amazon.alexa.handsfree.audio.ConnectedListenerProvider;
import com.amazon.alexa.handsfree.audio.ReleaseListenerProvider;
import com.amazon.alexa.handsfree.audio.UserSpeechProvider;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AudioReader {
    private static final String TAG = "AudioReader";
    private final AlexaConnectionListenerFactory mAlexaConnectionListenerFactory;
    private final AlexaServicesConnectionFactory mAlexaServicesConnectionFactory;
    private final ConnectedListenerProvider mConnectedListenerProvider;
    private AlexaServicesConnection mCurrentAlexaServicesConnection;
    private OnReleaseListener mOnReleaseListener;
    private final ReleaseListenerProvider mReleaseListenerProvider;
    private UserSpeechProvider mUserSpeechProvider;

    public AudioReader() {
        this(new AlexaServicesConnectionFactory(), new AlexaConnectionListenerFactory(), new ReleaseListenerProvider(), new ConnectedListenerProvider(), null);
    }

    private void recordAppInformationLogs(@NonNull Context context) {
        AMPDInformationProvider aMPDInformationProvider = AMPDInformationProvider.getInstance(context);
        String str = TAG;
        String voiceAppPackageNameString = aMPDInformationProvider.getVoiceAppPackageNameString();
        String voiceAppVersionString = aMPDInformationProvider.getVoiceAppVersionString();
        String voiceAppVersionName = aMPDInformationProvider.getVoiceAppVersionName();
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Current voice app is ", voiceAppPackageNameString, " with versionCode ", voiceAppVersionString, " and versionName ");
        m.append(voiceAppVersionName);
        Log.d(str, m.toString());
        Log.d(str, "Audio is being routed to " + context.getPackageName());
    }

    public AlexaServicesConnection getCurrentAlexaServicesConnection() {
        return this.mCurrentAlexaServicesConnection;
    }

    public OnReleaseListener getOnReleaseListener() {
        return this.mOnReleaseListener;
    }

    public UserSpeechProvider getUserSpeechProvider() {
        return this.mUserSpeechProvider;
    }

    public void onAlexaConnectionConnected() {
        this.mUserSpeechProvider.requestDialog(this.mCurrentAlexaServicesConnection);
    }

    public void onAlexaConnectionFailed() {
        UserSpeechProvider userSpeechProvider = this.mUserSpeechProvider;
        if (userSpeechProvider != null) {
            userSpeechProvider.connectionFailedEvent();
        }
        this.mCurrentAlexaServicesConnection = null;
    }

    public void onAudioReceived(byte[] bArr) {
        if (this.mUserSpeechProvider == null) {
            Log.e(TAG, "onAudioReceived: audio received when wake word is not detected");
            return;
        }
        Log.d(TAG, "onAudioReceived: size " + bArr.length);
        this.mUserSpeechProvider.recordAudio(bArr);
    }

    public void onServiceDestroyed() {
        Log.d(TAG, "onServiceDestroyed");
        OnReleaseListener onReleaseListener = this.mOnReleaseListener;
        if (onReleaseListener != null) {
            onReleaseListener.onRelease();
        }
        this.mCurrentAlexaServicesConnection = null;
    }

    public void onTransferFinished() {
        if (this.mUserSpeechProvider == null) {
            Log.e(TAG, "onTransferFinished: userSpeechProvider is null");
        } else {
            Log.i(TAG, "onTransferFinished");
            this.mUserSpeechProvider.resetAudio();
        }
    }

    public void onWakeWordDetected(@NonNull Context context, @NonNull UserSpeechProvider userSpeechProvider) {
        Log.i(TAG, "onWakeWordDetected");
        recordAppInformationLogs(context);
        this.mUserSpeechProvider = userSpeechProvider;
        this.mCurrentAlexaServicesConnection = this.mAlexaServicesConnectionFactory.getAlexaServicesConnection(context);
        AlexaConnectionListener alexaConnectionListener = this.mAlexaConnectionListenerFactory.getAlexaConnectionListener(this);
        OnReleaseListener audioReleaser = this.mReleaseListenerProvider.getAudioReleaser(alexaConnectionListener, this.mCurrentAlexaServicesConnection);
        this.mOnReleaseListener = audioReleaser;
        userSpeechProvider.setOnReleaseListener(audioReleaser);
        alexaConnectionListener.setOnReleaseListener(this.mOnReleaseListener);
        alexaConnectionListener.setOnConnectedListener(this.mConnectedListenerProvider.getConnectedListener(this.mCurrentAlexaServicesConnection));
        alexaConnectionListener.connect(this.mCurrentAlexaServicesConnection);
    }

    public void onWakeWordDetectionAborted(@NonNull String str) {
        this.mOnReleaseListener.onRelease();
        if (this.mUserSpeechProvider == null) {
            Log.e(TAG, "onWakeWordDetectionAborted: userSpeechProvider is null");
            return;
        }
        Log.i(TAG, "onWakeWordDetectionAborted: wake word detection aborted, message: " + str);
        this.mUserSpeechProvider.resetAudio();
        this.mCurrentAlexaServicesConnection = null;
    }

    public AudioReader(@NonNull AlexaServicesConnectionFactory alexaServicesConnectionFactory, @NonNull AlexaConnectionListenerFactory alexaConnectionListenerFactory, @NonNull ReleaseListenerProvider releaseListenerProvider, @NonNull ConnectedListenerProvider connectedListenerProvider, @Nullable UserSpeechProvider userSpeechProvider) {
        this.mAlexaServicesConnectionFactory = alexaServicesConnectionFactory;
        this.mAlexaConnectionListenerFactory = alexaConnectionListenerFactory;
        this.mReleaseListenerProvider = releaseListenerProvider;
        this.mConnectedListenerProvider = connectedListenerProvider;
        this.mUserSpeechProvider = userSpeechProvider;
    }
}
