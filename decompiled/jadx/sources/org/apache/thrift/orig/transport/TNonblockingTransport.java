package org.apache.thrift.orig.transport;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import org.apache.thrift.orig.TConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class TNonblockingTransport extends TEndpointTransport {
    public TNonblockingTransport(TConfiguration tConfiguration) throws TTransportException {
        super(tConfiguration);
    }

    public abstract boolean finishConnect() throws IOException;

    public abstract SelectionKey registerSelector(Selector selector, int i) throws IOException;

    public abstract boolean startConnect() throws IOException;
}
