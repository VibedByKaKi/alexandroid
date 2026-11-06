package org.apache.thrift.orig.transport;

import java.io.Closeable;
import java.net.InetSocketAddress;
import org.apache.thrift.orig.TConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TServerTransport implements Closeable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class AbstractServerTransportArgs<T extends AbstractServerTransportArgs<T>> {
        InetSocketAddress bindAddr;
        int backlog = 0;
        int clientTimeout = 0;
        int maxFrameSize = TConfiguration.DEFAULT_MAX_FRAME_SIZE;

        public T backlog(int i) {
            this.backlog = i;
            return this;
        }

        public T bindAddr(InetSocketAddress inetSocketAddress) {
            this.bindAddr = inetSocketAddress;
            return this;
        }

        public T clientTimeout(int i) {
            this.clientTimeout = i;
            return this;
        }

        public T maxFrameSize(int i) {
            this.maxFrameSize = i;
            return this;
        }

        public T port(int i) {
            this.bindAddr = new InetSocketAddress(i);
            return this;
        }
    }

    public abstract TTransport accept() throws TTransportException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract void listen() throws TTransportException;

    public void interrupt() {
    }
}
