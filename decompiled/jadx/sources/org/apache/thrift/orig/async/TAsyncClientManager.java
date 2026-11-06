package org.apache.thrift.orig.async;

import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeoutException;
import org.apache.thrift.orig.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TAsyncClientManager {
    private static final Logger LOGGER = LoggerFactory.getLogger(TAsyncClientManager.class.getName());
    private final ConcurrentLinkedQueue<TAsyncMethodCall<?>> pendingCalls = new ConcurrentLinkedQueue<>();
    private final SelectThread selectThread;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class SelectThread extends Thread {
        private final TreeSet<TAsyncMethodCall<?>> timeoutWatchSet = new TreeSet<>(new TAsyncMethodCallTimeoutComparator());
        private final Selector selector = SelectorProvider.provider().openSelector();
        private volatile boolean running = true;

        public SelectThread() throws IOException {
            setName("TAsyncClientManager#SelectorThread " + getId());
            setDaemon(true);
        }

        private void startPendingMethods() {
            while (true) {
                TAsyncMethodCall<?> tAsyncMethodCall = (TAsyncMethodCall) TAsyncClientManager.this.pendingCalls.poll();
                if (tAsyncMethodCall == null) {
                    return;
                }
                try {
                    tAsyncMethodCall.start(this.selector);
                    TAsyncClient client = tAsyncMethodCall.getClient();
                    if (client.hasTimeout() && !client.hasError()) {
                        this.timeoutWatchSet.add(tAsyncMethodCall);
                    }
                } catch (Exception e) {
                    TAsyncClientManager.LOGGER.warn("Caught exception in TAsyncClientManager!", (Throwable) e);
                    tAsyncMethodCall.onError(e);
                }
            }
        }

        private void timeoutMethods() {
            Iterator<TAsyncMethodCall<?>> it2 = this.timeoutWatchSet.iterator();
            long currentTimeMillis = System.currentTimeMillis();
            while (it2.hasNext()) {
                TAsyncMethodCall<?> next = it2.next();
                if (currentTimeMillis < next.getTimeoutTimestamp()) {
                    return;
                }
                it2.remove();
                next.onError(new TimeoutException("Operation " + next.getClass() + " timed out after " + (currentTimeMillis - next.getStartTime()) + " ms."));
            }
        }

        private void transitionMethods() {
            try {
                Iterator<SelectionKey> it2 = this.selector.selectedKeys().iterator();
                while (it2.hasNext()) {
                    SelectionKey next = it2.next();
                    it2.remove();
                    if (next.isValid()) {
                        TAsyncMethodCall tAsyncMethodCall = (TAsyncMethodCall) next.attachment();
                        tAsyncMethodCall.transition(next);
                        if (tAsyncMethodCall.isFinished() || tAsyncMethodCall.getClient().hasError()) {
                            this.timeoutWatchSet.remove(tAsyncMethodCall);
                        }
                    }
                }
            } catch (ClosedSelectorException e) {
                TAsyncClientManager.LOGGER.error("Caught ClosedSelectorException in TAsyncClientManager!", (Throwable) e);
            }
        }

        public void finish() {
            this.running = false;
            this.selector.wakeup();
        }

        public Selector getSelector() {
            return this.selector;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (this.running) {
                try {
                    try {
                        if (this.timeoutWatchSet.size() == 0) {
                            this.selector.select();
                        } else {
                            long timeoutTimestamp = this.timeoutWatchSet.first().getTimeoutTimestamp() - System.currentTimeMillis();
                            Selector selector = this.selector;
                            if (timeoutTimestamp > 0) {
                                selector.select(timeoutTimestamp);
                            } else {
                                selector.selectNow();
                            }
                        }
                    } catch (IOException e) {
                        TAsyncClientManager.LOGGER.error("Caught IOException in TAsyncClientManager!", (Throwable) e);
                    }
                    transitionMethods();
                    timeoutMethods();
                    startPendingMethods();
                } catch (Exception e2) {
                    TAsyncClientManager.LOGGER.error("Ignoring uncaught exception in SelectThread", (Throwable) e2);
                }
            }
            try {
                this.selector.close();
            } catch (IOException e3) {
                TAsyncClientManager.LOGGER.warn("Could not close selector. This may result in leaked resources!", (Throwable) e3);
            }
        }
    }

    public TAsyncClientManager() throws IOException {
        SelectThread selectThread = new SelectThread();
        this.selectThread = selectThread;
        selectThread.start();
    }

    public void call(TAsyncMethodCall<?> tAsyncMethodCall) throws TException {
        if (!isRunning()) {
            throw new TException("SelectThread is not running");
        }
        tAsyncMethodCall.prepareMethodCall();
        this.pendingCalls.add(tAsyncMethodCall);
        this.selectThread.getSelector().wakeup();
    }

    public boolean isRunning() {
        return this.selectThread.isAlive();
    }

    public void stop() {
        this.selectThread.finish();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TAsyncMethodCallTimeoutComparator implements Comparator<TAsyncMethodCall<?>>, Serializable {
        private TAsyncMethodCallTimeoutComparator() {
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(TAsyncMethodCall tAsyncMethodCall, TAsyncMethodCall tAsyncMethodCall2) {
            long timeoutTimestamp;
            long timeoutTimestamp2;
            if (tAsyncMethodCall.getTimeoutTimestamp() == tAsyncMethodCall2.getTimeoutTimestamp()) {
                timeoutTimestamp = tAsyncMethodCall.getSequenceId();
                timeoutTimestamp2 = tAsyncMethodCall2.getSequenceId();
            } else {
                timeoutTimestamp = tAsyncMethodCall.getTimeoutTimestamp();
                timeoutTimestamp2 = tAsyncMethodCall2.getTimeoutTimestamp();
            }
            return (int) (timeoutTimestamp - timeoutTimestamp2);
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(TAsyncMethodCall<?> tAsyncMethodCall, TAsyncMethodCall<?> tAsyncMethodCall2) {
            return compare2((TAsyncMethodCall) tAsyncMethodCall, (TAsyncMethodCall) tAsyncMethodCall2);
        }
    }
}
