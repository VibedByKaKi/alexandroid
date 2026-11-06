package com.amazon.alexa.handsfree.audio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaConnectingFailedReason;
import com.amazon.alexa.api.AlexaServicesConnection;
import com.amazon.alexa.handsfree.audio.api.AudioReader;
import com.amazon.alexa.handsfree.audio.api.OnConnectedListener;
import com.amazon.alexa.handsfree.audio.api.OnReleaseListener;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaConnectionListener implements AlexaServicesConnection.ConnectionListener {
    private static final String TAG = "AlexaConnectionListener";
    private final AudioReader mAudioReader;
    private OnConnectedListener mOnConnectedListener;
    private OnReleaseListener mOnReleaseListener;

    public AlexaConnectionListener(@NonNull AudioReader audioReader) {
        this.mAudioReader = audioReader;
    }

    public void connect(@NonNull AlexaServicesConnection alexaServicesConnection) {
        Log.i(TAG, "Attempting to connect");
        alexaServicesConnection.registerListener(this);
        alexaServicesConnection.connect();
    }

    @Override // com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListener
    public void onConnected() {
        String str = TAG;
        Log.i(str, "onConnected.");
        this.mAudioReader.onAlexaConnectionConnected();
        OnConnectedListener onConnectedListener = this.mOnConnectedListener;
        if (onConnectedListener != null) {
            onConnectedListener.onConnected();
        } else {
            Log.e(str, "mOnConnectedListener was not set");
        }
    }

    @Override // com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListener
    public void onConnectingFailed(@NonNull AlexaConnectingFailedReason alexaConnectingFailedReason, @Nullable String str) {
        String str2 = TAG;
        Log.i(str2, "onConnectingFailed, reason: " + alexaConnectingFailedReason);
        this.mAudioReader.onAlexaConnectionFailed();
        OnReleaseListener onReleaseListener = this.mOnReleaseListener;
        if (onReleaseListener != null) {
            onReleaseListener.onRelease();
        } else {
            Log.e(str2, "onReleaseListener was not set");
        }
    }

    @Override // com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListener
    public void onDisconnected() {
        String str = TAG;
        Log.i(str, "onDisconnected");
        OnReleaseListener onReleaseListener = this.mOnReleaseListener;
        if (onReleaseListener != null) {
            onReleaseListener.onRelease();
        } else {
            Log.e(str, "onReleaseListener was not set");
        }
    }

    public void setOnConnectedListener(@NonNull OnConnectedListener onConnectedListener) {
        this.mOnConnectedListener = onConnectedListener;
    }

    public void setOnReleaseListener(@NonNull OnReleaseListener onReleaseListener) {
        this.mOnReleaseListener = onReleaseListener;
    }
}
