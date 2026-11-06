package com.amazon.alexa.client.alexaservice.features.comms;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
abstract class CallInfo {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CallState {
        INBOUND_RINGING,
        ACTIVE
    }

    public static CallInfo create(CallState callState, @Nullable String str) {
        return create(UUID.randomUUID().toString(), callState, str);
    }

    public static CallInfo withState(CallInfo callInfo, CallState callState) {
        return create(callInfo.getId(), callState, callInfo.getPhoneNumber());
    }

    public abstract CallState getCallState();

    public abstract String getId();

    public abstract String getPhoneNumber();

    public static CallInfo create(String str, CallState callState, @Nullable String str2) {
        return new AutoValue_CallInfo(str, callState, str2);
    }
}
