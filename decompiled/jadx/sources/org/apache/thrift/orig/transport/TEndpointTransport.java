package org.apache.thrift.orig.transport;

import org.apache.thrift.orig.TConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TEndpointTransport extends TTransport {
    private TConfiguration _configuration;
    protected long knownMessageSize;
    protected long remainingMessageSize;

    public TEndpointTransport(TConfiguration tConfiguration) throws TTransportException {
        this._configuration = tConfiguration == null ? new TConfiguration() : tConfiguration;
        resetConsumedMessageSize(-1L);
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void checkReadBytesAvailable(long j) throws TTransportException {
        if (this.remainingMessageSize >= j) {
            return;
        }
        throw new TTransportException(6, "Message size exceeds limit: " + getMaxMessageSize());
    }

    public void countConsumedMessageBytes(long j) throws TTransportException {
        long j2 = this.remainingMessageSize;
        if (j2 >= j) {
            this.remainingMessageSize = j2 - j;
            return;
        }
        this.remainingMessageSize = 0L;
        throw new TTransportException(6, "Message size exceeds limit: " + getMaxMessageSize());
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public TConfiguration getConfiguration() {
        return this._configuration;
    }

    public int getMaxFrameSize() {
        return getConfiguration().getMaxFrameSize();
    }

    public long getMaxMessageSize() {
        return getConfiguration().getMaxMessageSize();
    }

    public void resetConsumedMessageSize(long j) throws TTransportException {
        if (j < 0) {
            this.knownMessageSize = getMaxMessageSize();
            this.remainingMessageSize = getMaxMessageSize();
        } else if (j <= this.knownMessageSize) {
            this.knownMessageSize = j;
            this.remainingMessageSize = j;
        } else {
            throw new TTransportException(6, "Message size exceeds limit: " + getMaxMessageSize());
        }
    }

    public void setMaxFrameSize(int i) {
        getConfiguration().setMaxFrameSize(i);
    }

    @Override // org.apache.thrift.orig.transport.TTransport
    public void updateKnownMessageSize(long j) throws TTransportException {
        long j2 = this.knownMessageSize - this.remainingMessageSize;
        if (j == 0) {
            j = -1;
        }
        resetConsumedMessageSize(j);
        countConsumedMessageBytes(j2);
    }
}
