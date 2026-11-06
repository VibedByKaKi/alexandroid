package com.amazon.alexa.aamb.transport;

import com.amazon.alexa.aamb.transport.Transport;
import java.io.IOException;
import java.net.Socket;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class SocketConnection extends Transport.Connection {
    private final Socket socket;

    public SocketConnection(Socket socket) throws IOException {
        this.socket = socket;
        this.inputStream = socket.getInputStream();
        this.outputStream = socket.getOutputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inputStream.close();
        this.outputStream.close();
        this.socket.close();
    }
}
