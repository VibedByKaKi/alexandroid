package com.amazon.deecomms.calling.contracts.incoming;

import androidx.annotation.NonNull;
import com.amazon.deecomms.calling.contracts.BaseViewContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IncomingAudioCallViewContract<T> extends BaseViewContract<T> {
    void activateCallControls();

    void hideCallControls();

    void hideCallStatus();

    void hideRemoteParticipantName();

    void showCallStatus(@NonNull String str);

    void showIncomingCallPermissions(@NonNull String[] strArr);

    void showRemoteParticipantName(@NonNull String str);
}
