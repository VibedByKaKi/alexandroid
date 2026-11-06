package com.amazon.identity.kcpsdk.common;

import com.amazon.identity.auth.device.v6;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BackoffException extends IOException {
    private final v6 mBackoffInfo;
    private final int mErrorCode;
    private final String mErrorMsg;

    public BackoffException(String str, v6 v6Var) {
        super(str);
        this.mErrorCode = -1;
        this.mErrorMsg = str;
        this.mBackoffInfo = v6Var;
    }
}
