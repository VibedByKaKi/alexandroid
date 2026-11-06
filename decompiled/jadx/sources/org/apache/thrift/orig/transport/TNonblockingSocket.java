package org.apache.thrift.orig.transport;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.thrift.orig.TConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TNonblockingSocket extends TNonblockingTransport {
    private static final Logger LOGGER = LoggerFactory.getLogger(TNonblockingSocket.class.getName());
    private final SocketAddress socketAddress_;
    private final SocketChannel socketChannel_;

    private TNonblockingSocket(TConfiguration tConfiguration, SocketChannel socketChannel, int i, SocketAddress socketAddress) throws IOException, TTransportException {
        super(tConfiguration);
        this.socketChannel_ = socketChannel;
        this.socketAddress_ = socketAddress;
        socketChannel.configureBlocking(false);
        Socket socket = socketChannel.socket();
        socket.setSoLinger(false, 0);
        socket.setTcpNoDelay(true);
        socket.setKeepAlive(true);
        setTimeout(i);
    }

    @Override // org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.socketChannel_.close();
        } catch (IOException e) {
            LOGGER.warn("Could not close socket.", (Throwable) e);
        }
    }

    @Override // org.apache.thrift.orig.transport.TNonblockingTransport
    public boolean finishConnect() throws IOException {
        return this.socketChannel_.finishConnect();
    }

    public SocketChannel getSocketChannel() {
        return this.socketChannel_;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        return this.socketChannel_.isOpen() && this.socketChannel_.isConnected();
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void open() throws TTransportException {
        throw new RuntimeException("open() is not implemented for TNonblockingSocket");
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int read(byte[] bArr, int i, int i2) throws TTransportException {
        if ((this.socketChannel_.validOps() & 1) != 1) {
            throw new TTransportException(1, "Cannot read from write-only socket channel");
        }
        try {
            return this.socketChannel_.read(ByteBuffer.wrap(bArr, i, i2));
        } catch (IOException e) {
            throw new TTransportException(0, e);
        }
    }

    @Override // org.apache.thrift.orig.transport.TNonblockingTransport
    public SelectionKey registerSelector(Selector selector, int i) throws IOException {
        return this.socketChannel_.register(selector, i);
    }

    public void setTimeout(int i) {
        try {
            this.socketChannel_.socket().setSoTimeout(i);
        } catch (SocketException e) {
            LOGGER.warn("Could not set socket timeout.", (Throwable) e);
        }
    }

    @Override // org.apache.thrift.orig.transport.TNonblockingTransport
    public boolean startConnect() throws IOException {
        return this.socketChannel_.connect(this.socketAddress_);
    }

    public String toString() {
        return "[remote: " + this.socketChannel_.socket().getRemoteSocketAddress() + ", local: " + this.socketChannel_.socket().getLocalAddress() + MarkdownConstants.RIGHT_BRACKET;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void write(byte[] bArr, int i, int i2) throws TTransportException {
        if ((this.socketChannel_.validOps() & 4) != 4) {
            throw new TTransportException(1, "Cannot write to write-only socket channel");
        }
        write(ByteBuffer.wrap(bArr, i, i2));
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void flush() throws TTransportException {
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int write(ByteBuffer byteBuffer) throws TTransportException {
        try {
            return this.socketChannel_.write(byteBuffer);
        } catch (IOException e) {
            throw new TTransportException(0, e);
        }
    }

    public TNonblockingSocket(String str, int i, int i2) throws IOException, TTransportException {
        this(SocketChannel.open(), i2, new InetSocketAddress(str, i));
    }

    public TNonblockingSocket(SocketChannel socketChannel) throws IOException, TTransportException {
        this(socketChannel, 0, (SocketAddress) null);
        if (socketChannel.isConnected()) {
            return;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Socket must already be connected");
        throw null;
    }

    private TNonblockingSocket(SocketChannel socketChannel, int i, SocketAddress socketAddress) throws IOException, TTransportException {
        this(new TConfiguration(), socketChannel, i, socketAddress);
    }

    public TNonblockingSocket(String str, int i) throws IOException, TTransportException {
        this(str, i, 0);
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int read(ByteBuffer byteBuffer) throws TTransportException {
        try {
            return this.socketChannel_.read(byteBuffer);
        } catch (IOException e) {
            throw new TTransportException(0, e);
        }
    }
}
