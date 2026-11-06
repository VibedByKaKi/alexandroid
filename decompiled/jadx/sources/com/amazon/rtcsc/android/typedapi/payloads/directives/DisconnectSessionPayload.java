package com.amazon.rtcsc.android.typedapi.payloads.directives;

import com.amazon.rtcsc.android.typedapi.payloads.Payload;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DisconnectSessionPayload extends Payload {
    public DisconnectSessionPayload(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("sessionId is marked non-null but is null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("sessionDomain is marked non-null but is null");
            throw null;
        }
        this.sessionDomain = str2;
        this.sessionId = str;
    }
}
