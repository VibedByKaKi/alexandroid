package org.apache.thrift.orig.transport;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import org.apache.thrift.orig.TConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TIOStreamTransport extends TEndpointTransport {
    private static final Logger LOGGER = LoggerFactory.getLogger(TIOStreamTransport.class.getName());
    protected InputStream inputStream_;
    protected OutputStream outputStream_;

    public TIOStreamTransport() throws TTransportException {
        super(new TConfiguration());
        this.inputStream_ = null;
        this.outputStream_ = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            InputStream inputStream = this.inputStream_;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    LOGGER.warn("Error closing input stream.", (Throwable) e);
                }
            }
            OutputStream outputStream = this.outputStream_;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e2) {
                    LOGGER.warn("Error closing output stream.", (Throwable) e2);
                }
            }
        } finally {
            this.inputStream_ = null;
            this.outputStream_ = null;
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void flush() throws TTransportException {
        OutputStream outputStream = this.outputStream_;
        if (outputStream == null) {
            throw new TTransportException(1, "Cannot flush null outputStream");
        }
        try {
            outputStream.flush();
            resetConsumedMessageSize(-1L);
        } catch (IOException e) {
            throw new TTransportException(0, e);
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        return (this.inputStream_ == null && this.outputStream_ == null) ? false : true;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int read(byte[] bArr, int i, int i2) throws TTransportException {
        InputStream inputStream = this.inputStream_;
        if (inputStream == null) {
            throw new TTransportException(1, "Cannot read from null inputStream");
        }
        try {
            int read = inputStream.read(bArr, i, i2);
            if (read >= 0) {
                return read;
            }
            throw new TTransportException(4, "Socket is closed by peer.");
        } catch (SocketTimeoutException e) {
            throw new TTransportException(3, e);
        } catch (IOException e2) {
            throw new TTransportException(0, e2);
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void write(byte[] bArr, int i, int i2) throws TTransportException {
        OutputStream outputStream = this.outputStream_;
        if (outputStream == null) {
            throw new TTransportException(1, "Cannot write to null outputStream");
        }
        try {
            outputStream.write(bArr, i, i2);
        } catch (IOException e) {
            throw new TTransportException(0, e);
        }
    }

    public TIOStreamTransport(TConfiguration tConfiguration) throws TTransportException {
        super(tConfiguration);
        this.inputStream_ = null;
        this.outputStream_ = null;
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void open() throws TTransportException {
    }

    public TIOStreamTransport(TConfiguration tConfiguration, InputStream inputStream) throws TTransportException {
        super(tConfiguration);
        this.outputStream_ = null;
        this.inputStream_ = inputStream;
    }

    public TIOStreamTransport(InputStream inputStream) throws TTransportException {
        super(new TConfiguration());
        this.outputStream_ = null;
        this.inputStream_ = inputStream;
    }

    public TIOStreamTransport(TConfiguration tConfiguration, OutputStream outputStream) throws TTransportException {
        super(tConfiguration);
        this.inputStream_ = null;
        this.outputStream_ = outputStream;
    }

    public TIOStreamTransport(OutputStream outputStream) throws TTransportException {
        super(new TConfiguration());
        this.inputStream_ = null;
        this.outputStream_ = outputStream;
    }

    public TIOStreamTransport(TConfiguration tConfiguration, InputStream inputStream, OutputStream outputStream) throws TTransportException {
        super(tConfiguration);
        this.inputStream_ = inputStream;
        this.outputStream_ = outputStream;
    }

    public TIOStreamTransport(InputStream inputStream, OutputStream outputStream) throws TTransportException {
        super(new TConfiguration());
        this.inputStream_ = inputStream;
        this.outputStream_ = outputStream;
    }
}
