package org.java_websocket.exceptions;

import java.io.IOException;
import org.java_websocket.WebSocket;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class WrappedIOException extends Exception {
    private final transient WebSocket connection;
    private final IOException ioException;

    public WrappedIOException(WebSocket webSocket, IOException iOException) {
        this.connection = webSocket;
        this.ioException = iOException;
    }

    public WebSocket getConnection() {
        return this.connection;
    }

    public IOException getIOException() {
        return this.ioException;
    }
}
