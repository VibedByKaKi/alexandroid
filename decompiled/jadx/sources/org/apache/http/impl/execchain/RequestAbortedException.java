package org.apache.http.impl.execchain;

import java.io.InterruptedIOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class RequestAbortedException extends InterruptedIOException {
    private static final long serialVersionUID = 4973849966012490112L;

    public RequestAbortedException(String str, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
    }

    public RequestAbortedException(String str) {
        super(str);
    }
}
