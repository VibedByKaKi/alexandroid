package com.amazon.deecomms.calling.contracts.active;

import com.amazon.deecomms.calling.contracts.BaseViewContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface ActiveAudioCallViewContract<T> extends BaseViewContract<T> {
    void activateCallControls();

    void hideCallStatus();

    void hideDialpad();

    void hideErrorMessage();

    void hideRemoteParticipantName();

    void setKeyboardPanMechanism();

    void showAudioPickerPopup();

    void showBluetoothHeadsetOn();

    void showCallDuration(String str);

    void showCallStatus(String str);

    void showCallVideoDowngradedUI();

    void showDialpad();

    void showErrorMessage();

    void showMicMuted();

    void showMicUnMuted();

    void showRealTimeTextIncapable();

    void showRemoteParticipantName(String str);

    void showSpeakerOff();

    void showSpeakerOn();
}
