package org.apache.thrift.orig.transport;

import java.io.IOException;
import java.io.RandomAccessFile;
import org.apache.thrift.orig.TConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TSimpleFileTransport extends TEndpointTransport {
    private RandomAccessFile file;
    private final String path_;
    private final boolean readable;
    private final boolean writable;

    public TSimpleFileTransport(TConfiguration tConfiguration, String str, boolean z, boolean z2, boolean z3) throws TTransportException {
        super(tConfiguration);
        this.file = null;
        if (str.length() <= 0) {
            throw new TTransportException("No path specified");
        }
        if (!z && !z2) {
            throw new TTransportException("Neither READ nor WRITE specified");
        }
        this.readable = z;
        this.writable = z2;
        this.path_ = str;
        if (z3) {
            open();
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception unused) {
            }
            this.file = null;
        }
    }

    public long getFilePointer() throws TTransportException {
        try {
            return this.file.getFilePointer();
        } catch (IOException e) {
            throw new TTransportException(e.getMessage());
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        return this.file != null;
    }

    public long length() throws TTransportException {
        try {
            return this.file.length();
        } catch (IOException e) {
            throw new TTransportException(e.getMessage());
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void open() throws TTransportException {
        if (this.file == null) {
            try {
                this.file = new RandomAccessFile(this.path_, this.writable ? "rw" : "r");
            } catch (IOException e) {
                this.file = null;
                throw new TTransportException(e.getMessage());
            }
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public int read(byte[] bArr, int i, int i2) throws TTransportException {
        if (!this.readable) {
            throw new TTransportException("Read operation on write only file");
        }
        checkReadBytesAvailable(i2);
        try {
            return this.file.read(bArr, i, i2);
        } catch (IOException e) {
            this.file = null;
            throw new TTransportException(e.getMessage());
        }
    }

    public void seek(long j) throws TTransportException {
        try {
            this.file.seek(j);
        } catch (IOException e) {
            throw new TTransportException(e.getMessage());
        }
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void write(byte[] bArr, int i, int i2) throws TTransportException {
        try {
            this.file.write(bArr, i, i2);
        } catch (IOException e) {
            this.file = null;
            throw new TTransportException(e.getMessage());
        }
    }

    public TSimpleFileTransport(String str, boolean z, boolean z2, boolean z3) throws TTransportException {
        this(new TConfiguration(), str, z, z2, z3);
    }

    public TSimpleFileTransport(String str, boolean z, boolean z2) throws TTransportException {
        this(str, z, z2, true);
    }

    public TSimpleFileTransport(String str) throws TTransportException {
        this(str, true, false, true);
    }
}
