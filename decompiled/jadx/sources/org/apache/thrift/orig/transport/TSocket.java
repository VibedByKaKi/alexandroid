package org.apache.thrift.orig.transport;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import org.apache.thrift.orig.TConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TSocket extends TIOStreamTransport {
    private static final Logger LOGGER = LoggerFactory.getLogger(TSocket.class.getName());
    private int connectTimeout_;
    private String host_;
    private int port_;
    private int socketTimeout_;
    private Socket socket_;

    public TSocket(Socket socket) throws TTransportException {
        super(new TConfiguration());
        this.socket_ = socket;
        try {
            socket.setSoLinger(false, 0);
            this.socket_.setTcpNoDelay(true);
            this.socket_.setKeepAlive(true);
        } catch (SocketException e) {
            LOGGER.warn("Could not configure socket.", (Throwable) e);
        }
        if (isOpen()) {
            try {
                this.inputStream_ = new BufferedInputStream(this.socket_.getInputStream());
                this.outputStream_ = new BufferedOutputStream(this.socket_.getOutputStream());
            } catch (IOException e2) {
                close();
                throw new TTransportException(1, e2);
            }
        }
    }

    private void initSocket() {
        Socket socket = new Socket();
        this.socket_ = socket;
        try {
            socket.setSoLinger(false, 0);
            this.socket_.setTcpNoDelay(true);
            this.socket_.setKeepAlive(true);
            this.socket_.setSoTimeout(this.socketTimeout_);
        } catch (SocketException e) {
            LOGGER.error("Could not configure socket.", (Throwable) e);
        }
    }

    @Override // org.apache.thrift.orig.transport.TIOStreamTransport, org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        Socket socket = this.socket_;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                LOGGER.warn("Could not close socket.", (Throwable) e);
            }
            this.socket_ = null;
        }
    }

    public Socket getSocket() {
        if (this.socket_ == null) {
            initSocket();
        }
        return this.socket_;
    }

    @Override // org.apache.thrift.orig.transport.TIOStreamTransport, org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        Socket socket = this.socket_;
        if (socket == null) {
            return false;
        }
        return socket.isConnected();
    }

    @Override // org.apache.thrift.orig.transport.TIOStreamTransport, org.apache.thrift.orig.transport.TTransport
    public void open() throws TTransportException {
        if (isOpen()) {
            throw new TTransportException(2, "Socket already connected.");
        }
        String str = this.host_;
        if (str == null || str.length() == 0) {
            throw new TTransportException(1, "Cannot open null host.");
        }
        int i = this.port_;
        if (i <= 0 || i > 65535) {
            throw new TTransportException(1, "Invalid port " + this.port_);
        }
        if (this.socket_ == null) {
            initSocket();
        }
        try {
            this.socket_.connect(new InetSocketAddress(this.host_, this.port_), this.connectTimeout_);
            this.inputStream_ = new BufferedInputStream(this.socket_.getInputStream());
            this.outputStream_ = new BufferedOutputStream(this.socket_.getOutputStream());
        } catch (IOException e) {
            close();
            throw new TTransportException(1, e);
        }
    }

    public void setConnectTimeout(int i) {
        this.connectTimeout_ = i;
    }

    public void setSocketTimeout(int i) {
        this.socketTimeout_ = i;
        try {
            this.socket_.setSoTimeout(i);
        } catch (SocketException e) {
            LOGGER.warn("Could not set socket timeout.", (Throwable) e);
        }
    }

    public void setTimeout(int i) {
        setConnectTimeout(i);
        setSocketTimeout(i);
    }

    public TSocket(TConfiguration tConfiguration, String str, int i) throws TTransportException {
        this(tConfiguration, str, i, 0);
    }

    public TSocket(String str, int i) throws TTransportException {
        this(new TConfiguration(), str, i, 0);
    }

    public TSocket(String str, int i, int i2) throws TTransportException {
        this(new TConfiguration(), str, i, i2, i2);
    }

    public TSocket(TConfiguration tConfiguration, String str, int i, int i2) throws TTransportException {
        this(tConfiguration, str, i, i2, i2);
    }

    public TSocket(TConfiguration tConfiguration, String str, int i, int i2, int i3) throws TTransportException {
        super(tConfiguration);
        this.host_ = str;
        this.port_ = i;
        this.socketTimeout_ = i2;
        this.connectTimeout_ = i3;
        initSocket();
    }
}
