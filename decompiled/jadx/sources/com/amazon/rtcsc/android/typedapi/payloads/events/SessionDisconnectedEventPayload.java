package com.amazon.rtcsc.android.typedapi.payloads.events;

import com.amazon.rtcsc.android.typedapi.payloads.Payload;
import com.amazon.rtcsc.android.typedapi.types.Error;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SessionDisconnectedEventPayload extends Payload {
    private Error error;

    public SessionDisconnectedEventPayload(String str, String str2, Error error) {
        this.sessionId = str;
        this.sessionDomain = str2;
        this.error = error;
    }

    @Override // com.amazon.rtcsc.android.typedapi.payloads.Payload
    public boolean canEqual(Object obj) {
        return obj instanceof SessionDisconnectedEventPayload;
    }

    @Override // com.amazon.rtcsc.android.typedapi.payloads.Payload
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionDisconnectedEventPayload)) {
            return false;
        }
        SessionDisconnectedEventPayload sessionDisconnectedEventPayload = (SessionDisconnectedEventPayload) obj;
        if (!sessionDisconnectedEventPayload.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Error error = getError();
        Error error2 = sessionDisconnectedEventPayload.getError();
        return error != null ? error.equals(error2) : error2 == null;
    }

    public Error getError() {
        return this.error;
    }

    @Override // com.amazon.rtcsc.android.typedapi.payloads.Payload
    public int hashCode() {
        int hashCode = super.hashCode();
        Error error = getError();
        return (hashCode * 59) + (error == null ? 43 : error.hashCode());
    }
}
