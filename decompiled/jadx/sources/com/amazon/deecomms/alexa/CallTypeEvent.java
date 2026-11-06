package com.amazon.deecomms.alexa;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CallTypeEvent extends InCallEvent<CallTypeEventType, CallTypeEventModel> {
    public CallTypeEventModel callTypeEventModel;

    public CallTypeEvent(@NonNull CallTypeEventType callTypeEventType, @NonNull CallTypeEventModel callTypeEventModel) {
        super(callTypeEventType, callTypeEventModel.getCallId(), callTypeEventModel);
        this.callTypeEventModel = callTypeEventModel;
    }

    @Override // com.amazon.deecomms.alexa.InCallEvent
    @NonNull
    public Bundle toBundle() {
        String callType = this.callTypeEventModel.getCallType();
        Bundle m = ParcelCompat$$ExternalSyntheticOutline0.m("ACTION", "com.amazon.deecomms.alexa.CALL_TYPE_EVENT_ACTION");
        m.putString("inCallEvent", getEventName());
        m.putStringArrayList("callFlags", new ArrayList<>(this.callTypeEventModel.getCallFlags()));
        m.putString("callId", this.callId);
        m.putString("callExperienceType", callType);
        m.putString("SipClientState", this.callTypeEventModel.getSipDeviceStateSerialized());
        return m;
    }
}
