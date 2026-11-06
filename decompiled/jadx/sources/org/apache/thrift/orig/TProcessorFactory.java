package org.apache.thrift.orig;

import org.apache.thrift.orig.transport.TTransport;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TProcessorFactory {
    private final TProcessor processor_;

    public TProcessorFactory(TProcessor tProcessor) {
        this.processor_ = tProcessor;
    }

    public TProcessor getProcessor(TTransport tTransport) {
        return this.processor_;
    }

    public boolean isAsyncProcessor() {
        return this.processor_ instanceof TAsyncProcessor;
    }
}
