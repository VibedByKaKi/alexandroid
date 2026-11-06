package org.apache.thrift.orig.server;

import org.apache.thrift.orig.server.AbstractNonblockingServer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class Invocation implements Runnable {
    private final AbstractNonblockingServer.FrameBuffer frameBuffer;

    public Invocation(AbstractNonblockingServer.FrameBuffer frameBuffer) {
        this.frameBuffer = frameBuffer;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.frameBuffer.invoke();
    }
}
