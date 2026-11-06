package org.apache.commons.net;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.nio.charset.Charset;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class SocketClient {
    private static final int DEFAULT_CONNECT_TIMEOUT = 60000;
    public static final String NETASCII_EOL = "\r\n";
    private ProtocolCommandSupport commandSupport;
    private Proxy connProxy;
    private static final SocketFactory DEFAULT_SOCKET_FACTORY = SocketFactory.getDefault();
    private static final ServerSocketFactory DEFAULT_SERVER_SOCKET_FACTORY = ServerSocketFactory.getDefault();
    protected int connectTimeout = 60000;
    private int receiveBufferSize = -1;
    private int sendBufferSize = -1;
    private Charset charset = Charset.defaultCharset();
    protected Socket _socket_ = null;
    protected String _hostname_ = null;
    protected InputStream _input_ = null;
    protected OutputStream _output_ = null;
    protected int _timeout_ = 0;
    protected int _defaultPort_ = 0;
    protected SocketFactory _socketFactory_ = DEFAULT_SOCKET_FACTORY;
    protected ServerSocketFactory _serverSocketFactory_ = DEFAULT_SERVER_SOCKET_FACTORY;

    private void _connect(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws SocketException, IOException {
        Socket createSocket = this._socketFactory_.createSocket();
        this._socket_ = createSocket;
        int i3 = this.receiveBufferSize;
        if (i3 != -1) {
            createSocket.setReceiveBufferSize(i3);
        }
        int i4 = this.sendBufferSize;
        if (i4 != -1) {
            this._socket_.setSendBufferSize(i4);
        }
        if (inetAddress2 != null) {
            this._socket_.bind(new InetSocketAddress(inetAddress2, i2));
        }
        this._socket_.connect(new InetSocketAddress(inetAddress, i), this.connectTimeout);
        _connectAction_();
    }

    private void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    public void _connectAction_() throws IOException {
        applySocketAttributes();
        this._input_ = this._socket_.getInputStream();
        this._output_ = this._socket_.getOutputStream();
    }

    public void addProtocolCommandListener(ProtocolCommandListener protocolCommandListener) {
        getCommandSupport().addProtocolCommandListener(protocolCommandListener);
    }

    public void applySocketAttributes() throws SocketException {
        this._socket_.setSoTimeout(this._timeout_);
    }

    public void connect(String str, int i) throws SocketException, IOException {
        this._hostname_ = str;
        _connect(InetAddress.getByName(str), i, null, -1);
    }

    public void createCommandSupport() {
        this.commandSupport = new ProtocolCommandSupport(this);
    }

    public void disconnect() throws IOException {
        closeQuietly(this._socket_);
        closeQuietly(this._input_);
        closeQuietly(this._output_);
        this._socket_ = null;
        this._hostname_ = null;
        this._input_ = null;
        this._output_ = null;
    }

    public void fireCommandSent(String str, String str2) {
        if (getCommandSupport().getListenerCount() > 0) {
            getCommandSupport().fireCommandSent(str, str2);
        }
    }

    public void fireReplyReceived(int i, String str) {
        if (getCommandSupport().getListenerCount() > 0) {
            getCommandSupport().fireReplyReceived(i, str);
        }
    }

    public Charset getCharset() {
        return this.charset;
    }

    @Deprecated
    public String getCharsetName() {
        return this.charset.name();
    }

    public ProtocolCommandSupport getCommandSupport() {
        return this.commandSupport;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public int getDefaultPort() {
        return this._defaultPort_;
    }

    public int getDefaultTimeout() {
        return this._timeout_;
    }

    public boolean getKeepAlive() throws SocketException {
        return this._socket_.getKeepAlive();
    }

    public InetAddress getLocalAddress() {
        return this._socket_.getLocalAddress();
    }

    public int getLocalPort() {
        return this._socket_.getLocalPort();
    }

    public Proxy getProxy() {
        return this.connProxy;
    }

    public int getReceiveBufferSize() {
        return this.receiveBufferSize;
    }

    public InetAddress getRemoteAddress() {
        return this._socket_.getInetAddress();
    }

    public int getRemotePort() {
        return this._socket_.getPort();
    }

    public int getSendBufferSize() {
        return this.sendBufferSize;
    }

    public ServerSocketFactory getServerSocketFactory() {
        return this._serverSocketFactory_;
    }

    public int getSoLinger() throws SocketException {
        return this._socket_.getSoLinger();
    }

    public int getSoTimeout() throws SocketException {
        return this._socket_.getSoTimeout();
    }

    public boolean getTcpNoDelay() throws SocketException {
        return this._socket_.getTcpNoDelay();
    }

    public boolean isAvailable() {
        if (isConnected()) {
            try {
                if (this._socket_.getInetAddress() == null || this._socket_.getPort() == 0 || this._socket_.getRemoteSocketAddress() == null || this._socket_.isClosed() || this._socket_.isInputShutdown() || this._socket_.isOutputShutdown()) {
                    return false;
                }
                this._socket_.getInputStream();
                this._socket_.getOutputStream();
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public boolean isConnected() {
        Socket socket = this._socket_;
        if (socket == null) {
            return false;
        }
        return socket.isConnected();
    }

    public void removeProtocolCommandListener(ProtocolCommandListener protocolCommandListener) {
        getCommandSupport().removeProtocolCommandListener(protocolCommandListener);
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public void setConnectTimeout(int i) {
        this.connectTimeout = i;
    }

    public void setDefaultPort(int i) {
        this._defaultPort_ = i;
    }

    public void setDefaultTimeout(int i) {
        this._timeout_ = i;
    }

    public void setKeepAlive(boolean z) throws SocketException {
        this._socket_.setKeepAlive(z);
    }

    public void setProxy(Proxy proxy) {
        setSocketFactory(new DefaultSocketFactory(proxy));
        this.connProxy = proxy;
    }

    public void setReceiveBufferSize(int i) throws SocketException {
        this.receiveBufferSize = i;
    }

    public void setSendBufferSize(int i) throws SocketException {
        this.sendBufferSize = i;
    }

    public void setServerSocketFactory(ServerSocketFactory serverSocketFactory) {
        if (serverSocketFactory == null) {
            this._serverSocketFactory_ = DEFAULT_SERVER_SOCKET_FACTORY;
        } else {
            this._serverSocketFactory_ = serverSocketFactory;
        }
    }

    public void setSoLinger(boolean z, int i) throws SocketException {
        this._socket_.setSoLinger(z, i);
    }

    public void setSoTimeout(int i) throws SocketException {
        this._socket_.setSoTimeout(i);
    }

    public void setSocketFactory(SocketFactory socketFactory) {
        if (socketFactory == null) {
            this._socketFactory_ = DEFAULT_SOCKET_FACTORY;
        } else {
            this._socketFactory_ = socketFactory;
        }
        this.connProxy = null;
    }

    public void setTcpNoDelay(boolean z) throws SocketException {
        this._socket_.setTcpNoDelay(z);
    }

    public boolean verifyRemote(Socket socket) {
        return socket.getInetAddress().equals(getRemoteAddress());
    }

    private void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public void connect(InetAddress inetAddress, int i) throws SocketException, IOException {
        this._hostname_ = null;
        _connect(inetAddress, i, null, -1);
    }

    public void connect(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws SocketException, IOException {
        this._hostname_ = null;
        _connect(inetAddress, i, inetAddress2, i2);
    }

    public void connect(String str, int i, InetAddress inetAddress, int i2) throws SocketException, IOException {
        this._hostname_ = str;
        _connect(InetAddress.getByName(str), i, inetAddress, i2);
    }

    public void connect(InetAddress inetAddress) throws SocketException, IOException {
        this._hostname_ = null;
        connect(inetAddress, this._defaultPort_);
    }

    public void connect(String str) throws SocketException, IOException {
        connect(str, this._defaultPort_);
    }
}
