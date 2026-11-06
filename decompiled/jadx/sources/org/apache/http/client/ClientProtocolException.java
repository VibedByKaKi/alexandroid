package org.apache.http.client;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ClientProtocolException extends IOException {
    private static final long serialVersionUID = -5596590843227115865L;

    public ClientProtocolException(Throwable th) {
        initCause(th);
    }

    public ClientProtocolException(String str) {
        super(str);
    }

    public ClientProtocolException() {
    }

    public ClientProtocolException(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
