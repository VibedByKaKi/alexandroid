package com.amazon.deecomms.calling.contracts.active;

import androidx.annotation.NonNull;
import com.amazon.deecomms.calling.contracts.BaseViewContract;
import com.amazon.deecomms.calling.ui.listener.VideoDisplayListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface ActiveVideoCallViewContract<T> extends BaseViewContract<T> {
    void activateCallControls();

    int getCurrentRotation();

    void hideCallStatus();

    void hideRemoteParticipantName();

    void setKeyboardPanMechanism();

    void setRotationSupported(boolean z);

    void setVideoDisplayListener(@NonNull VideoDisplayListener videoDisplayListener);

    void showAudioPickerPopup();

    void showBluetoothHeadsetOn();

    void showCallCaptioningButton();

    void showCallDuration(String str);

    void showCallStatus(String str);

    void showEffectsMenuButton();

    void showFrontSelfVideoFeed();

    void showMicMuted();

    void showMicUnMuted();

    void showRealTimeTextIncapable();

    void showRearSelfVideoFeed();

    void showRemoteParticipantNameIfRequired(String str, boolean z);

    void showSpeakerOff();

    void showSpeakerOn();

    void showToggleCamera();

    void showVideoOff();

    void showVideoOffCallStatus();

    void showVideoOn();

    void updateRemoteViewBackground(boolean z);
}
