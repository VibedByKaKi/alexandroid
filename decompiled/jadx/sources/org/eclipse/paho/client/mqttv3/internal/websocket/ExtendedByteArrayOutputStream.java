package org.eclipse.paho.client.mqttv3.internal.websocket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class ExtendedByteArrayOutputStream extends ByteArrayOutputStream {
    final WebSocketNetworkModule webSocketNetworkModule;
    final WebSocketSecureNetworkModule webSocketSecureNetworkModule;

    public ExtendedByteArrayOutputStream(WebSocketNetworkModule webSocketNetworkModule) {
        this.webSocketNetworkModule = webSocketNetworkModule;
        this.webSocketSecureNetworkModule = null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        ByteBuffer wrap;
        synchronized (this) {
            wrap = ByteBuffer.wrap(toByteArray());
            reset();
        }
        getSocketOutputStream().write(new WebSocketFrame((byte) 2, true, wrap.array()).encodeFrame());
        getSocketOutputStream().flush();
    }

    public OutputStream getSocketOutputStream() throws IOException {
        WebSocketNetworkModule webSocketNetworkModule = this.webSocketNetworkModule;
        if (webSocketNetworkModule != null) {
            return webSocketNetworkModule.getSocketOutputStream();
        }
        WebSocketSecureNetworkModule webSocketSecureNetworkModule = this.webSocketSecureNetworkModule;
        if (webSocketSecureNetworkModule != null) {
            return webSocketSecureNetworkModule.getSocketOutputStream();
        }
        return null;
    }

    public ExtendedByteArrayOutputStream(WebSocketSecureNetworkModule webSocketSecureNetworkModule) {
        this.webSocketNetworkModule = null;
        this.webSocketSecureNetworkModule = webSocketSecureNetworkModule;
    }
}
