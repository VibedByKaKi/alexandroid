package org.apache.commons.net.ftp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FTPSServerSocketFactory extends ServerSocketFactory {
    private final SSLContext sslContext;

    public FTPSServerSocketFactory(SSLContext sSLContext) {
        this.sslContext = sSLContext;
    }

    private SSLServerSocketFactory getServerSocketFactory() {
        return this.sslContext.getServerSocketFactory();
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket() throws IOException {
        return init(getServerSocketFactory().createServerSocket());
    }

    public ServerSocket init(ServerSocket serverSocket) {
        ((SSLServerSocket) serverSocket).setUseClientMode(true);
        return serverSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i) throws IOException {
        return init(getServerSocketFactory().createServerSocket(i));
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i2) throws IOException {
        return init(getServerSocketFactory().createServerSocket(i, i2));
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) throws IOException {
        return init(getServerSocketFactory().createServerSocket(i, i2, inetAddress));
    }
}
