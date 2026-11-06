package com.amazon.deecomms.calling.ui.listener;

import androidx.annotation.NonNull;
import com.amazon.deecomms.calling.enums.CallState;
import com.amazon.deecomms.calling.enums.CallType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface VideoStreamingListener {
    void onCameraToggledToFront(@NonNull CallState callState, @NonNull CallType callType);

    void onCameraToggledToRear(@NonNull CallState callState, @NonNull CallType callType);

    void onStartStreamingVideo(@NonNull CallState callState, @NonNull CallType callType);

    void onStopStreamingVideo(@NonNull CallState callState, @NonNull CallType callType);
}
