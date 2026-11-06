package com.amazon.whisperjoin.softap.wifi.requests;

import com.google.common.base.Optional;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class RequestException extends IOException {
    private Integer errorCode;

    public RequestException(int i) {
        this(String.format("%d error code returned from response", Integer.valueOf(i)));
        this.errorCode = Integer.valueOf(i);
    }

    public Optional<Integer> getErrorCode() {
        return Optional.fromNullable(this.errorCode);
    }

    public RequestException(String str) {
        super(str);
        this.errorCode = null;
    }

    public RequestException(String str, Throwable th) {
        super(str, th);
        this.errorCode = null;
    }

    public RequestException(Throwable th) {
        super(th);
        this.errorCode = null;
    }
}
