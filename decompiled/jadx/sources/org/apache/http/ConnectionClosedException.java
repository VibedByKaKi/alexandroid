package org.apache.http;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ConnectionClosedException extends IOException {
    private static final long serialVersionUID = 617550366255636674L;

    public ConnectionClosedException(String str, Object... objArr) {
        super(HttpException.clean(String.format(str, objArr)));
    }

    public ConnectionClosedException(String str) {
        super(HttpException.clean(str));
    }

    public ConnectionClosedException() {
        super("Connection is closed");
    }
}
