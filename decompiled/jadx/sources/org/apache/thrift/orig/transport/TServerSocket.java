package org.apache.thrift.orig.transport;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import org.apache.thrift.orig.transport.TServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TServerSocket extends TServerTransport {
    private static final Logger LOGGER = LoggerFactory.getLogger(TServerSocket.class.getName());
    private int clientTimeout_;
    private ServerSocket serverSocket_;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ServerSocketTransportArgs extends TServerTransport.AbstractServerTransportArgs<ServerSocketTransportArgs> {
        ServerSocket serverSocket;

        public ServerSocketTransportArgs serverSocket(ServerSocket serverSocket) {
            this.serverSocket = serverSocket;
            return this;
        }
    }

    public TServerSocket(ServerSocketTransportArgs serverSocketTransportArgs) throws TTransportException {
        this.serverSocket_ = null;
        this.clientTimeout_ = 0;
        this.clientTimeout_ = serverSocketTransportArgs.clientTimeout;
        ServerSocket serverSocket = serverSocketTransportArgs.serverSocket;
        if (serverSocket != null) {
            this.serverSocket_ = serverSocket;
            return;
        }
        try {
            ServerSocket serverSocket2 = new ServerSocket();
            this.serverSocket_ = serverSocket2;
            serverSocket2.setReuseAddress(true);
            this.serverSocket_.bind(serverSocketTransportArgs.bindAddr, serverSocketTransportArgs.backlog);
        } catch (IOException e) {
            close();
            throw new TTransportException("Could not create ServerSocket on address " + serverSocketTransportArgs.bindAddr.toString() + ".", e);
        }
    }

    @Override // org.apache.thrift.orig.transport.TServerTransport
    public TSocket accept() throws TTransportException {
        ServerSocket serverSocket = this.serverSocket_;
        if (serverSocket == null) {
            throw new TTransportException(1, "No underlying server socket.");
        }
        try {
            Socket accept = serverSocket.accept();
            if (accept == null) {
                throw new TTransportException("Blocking server's accept() may not return NULL");
            }
            TSocket tSocket = new TSocket(accept);
            tSocket.setTimeout(this.clientTimeout_);
            return tSocket;
        } catch (Exception e) {
            throw new TTransportException(e);
        }
    }

    @Override // org.apache.thrift.orig.transport.TServerTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ServerSocket serverSocket = this.serverSocket_;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException e) {
                LOGGER.warn("Could not close server socket.", (Throwable) e);
            }
            this.serverSocket_ = null;
        }
    }

    public ServerSocket getServerSocket() {
        return this.serverSocket_;
    }

    @Override // org.apache.thrift.orig.transport.TServerTransport
    public void interrupt() {
        close();
    }

    @Override // org.apache.thrift.orig.transport.TServerTransport
    public void listen() throws TTransportException {
        ServerSocket serverSocket = this.serverSocket_;
        if (serverSocket != null) {
            try {
                serverSocket.setSoTimeout(0);
            } catch (SocketException e) {
                LOGGER.error("Could not set socket timeout.", (Throwable) e);
            }
        }
    }

    public TServerSocket(ServerSocket serverSocket, int i) throws TTransportException {
        this(new ServerSocketTransportArgs().serverSocket(serverSocket).clientTimeout(i));
    }

    public TServerSocket(int i) throws TTransportException {
        this(i, 0);
    }

    public TServerSocket(int i, int i2) throws TTransportException {
        this(new InetSocketAddress(i), i2);
    }

    public TServerSocket(InetSocketAddress inetSocketAddress) throws TTransportException {
        this(inetSocketAddress, 0);
    }

    public TServerSocket(InetSocketAddress inetSocketAddress, int i) throws TTransportException {
        this(new ServerSocketTransportArgs().bindAddr(inetSocketAddress).clientTimeout(i));
    }

    public TServerSocket(ServerSocket serverSocket) throws TTransportException {
        this(serverSocket, 0);
    }
}
