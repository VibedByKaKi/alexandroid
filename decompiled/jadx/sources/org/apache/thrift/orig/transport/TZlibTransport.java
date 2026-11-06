package org.apache.thrift.orig.transport;

import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.apache.thrift.orig.TConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TZlibTransport extends TIOStreamTransport {
    private TTransport transport_;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Factory extends TTransportFactory {
        @Override // org.apache.thrift.orig.transport.TTransportFactory
        public TTransport getTransport(TTransport tTransport) throws TTransportException {
            return new TZlibTransport(tTransport);
        }
    }

    public TZlibTransport(TTransport tTransport, int i) throws TTransportException {
        super(tTransport.getConfiguration() == null ? new TConfiguration() : tTransport.getConfiguration());
        this.transport_ = tTransport;
        this.inputStream_ = new InflaterInputStream(new TTransportInputStream(this.transport_), new Inflater());
        this.outputStream_ = new DeflaterOutputStream((OutputStream) new TTransportOutputStream(this.transport_), new Deflater(i, false), true);
    }

    @Override // org.apache.thrift.orig.transport.TIOStreamTransport, org.apache.thrift.orig.transport.TTransport, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.transport_.isOpen()) {
            this.transport_.close();
        }
    }

    @Override // org.apache.thrift.orig.transport.TIOStreamTransport, org.apache.thrift.orig.transport.TTransport
    public boolean isOpen() {
        return this.transport_.isOpen();
    }

    @Override // org.apache.thrift.orig.transport.TIOStreamTransport, org.apache.thrift.orig.transport.TTransport
    public void open() throws TTransportException {
        this.transport_.open();
    }

    public TZlibTransport(TTransport tTransport) throws TTransportException {
        this(tTransport, 9);
    }
}
