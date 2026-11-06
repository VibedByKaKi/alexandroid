package com.amazon.alexa.accessory.capabilities.state.exceptions;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.protocol.Common;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class StateException extends IOException {
    private final Common.ErrorCode errorCode;

    public StateException(String str, Common.ErrorCode errorCode) {
        super(str);
        Preconditions.notNull(errorCode, "errorCode");
        this.errorCode = errorCode;
    }

    public Common.ErrorCode getErrorCode() {
        return this.errorCode;
    }
}
