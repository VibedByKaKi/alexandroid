package com.amazon.commscore.commsbridge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.commscore.commsbridge.BridgeMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class ResponseMessage extends BridgeMessage {
    private final Throwable error;

    private ResponseMessage(String str, String str2, Object obj, Throwable th) {
        super(str, str2, BridgeMessage.MessageType.RESPONSE, obj);
        this.error = th;
    }

    public static ResponseMessage create(@NonNull RequestMessage requestMessage, @Nullable Object obj) {
        return new ResponseMessage(requestMessage.getName(), requestMessage.getId(), obj, null);
    }

    @Nullable
    public Throwable getError() {
        return this.error;
    }

    public static ResponseMessage create(@NonNull RequestMessage requestMessage, @NonNull Throwable th) {
        return new ResponseMessage(requestMessage.getName(), requestMessage.getId(), null, th);
    }
}
