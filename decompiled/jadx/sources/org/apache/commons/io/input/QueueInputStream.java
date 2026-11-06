package org.apache.commons.io.input;

import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.apache.commons.io.output.QueueOutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class QueueInputStream extends InputStream {
    private final BlockingQueue<Integer> blockingQueue;

    public QueueInputStream(BlockingQueue<Integer> blockingQueue) {
        Objects.requireNonNull(blockingQueue, "blockingQueue");
        this.blockingQueue = blockingQueue;
    }

    public QueueOutputStream newQueueOutputStream() {
        return new QueueOutputStream(this.blockingQueue);
    }

    @Override // java.io.InputStream
    public int read() {
        Integer poll = this.blockingQueue.poll();
        if (poll == null) {
            return -1;
        }
        return poll.intValue() & 255;
    }

    public QueueInputStream() {
        this(new LinkedBlockingQueue());
    }
}
