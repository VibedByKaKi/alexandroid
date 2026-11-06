package com.amazon.rtcsc.android.typedapi.payloads.events;

import com.amazon.rtcsc.android.typedapi.payloads.Payload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SessionConnectedEventPayload extends Payload {
    public SessionConnectedEventPayload(String str, String str2) {
        this.sessionId = str;
        this.sessionDomain = str2;
    }

    @Override // com.amazon.rtcsc.android.typedapi.payloads.Payload
    public boolean canEqual(Object obj) {
        return obj instanceof SessionConnectedEventPayload;
    }

    @Override // com.amazon.rtcsc.android.typedapi.payloads.Payload
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SessionConnectedEventPayload) && ((SessionConnectedEventPayload) obj).canEqual(this) && super.equals(obj);
    }

    @Override // com.amazon.rtcsc.android.typedapi.payloads.Payload
    public int hashCode() {
        return super.hashCode();
    }
}
