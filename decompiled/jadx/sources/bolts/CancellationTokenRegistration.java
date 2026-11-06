package bolts;

import java.io.Closeable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class CancellationTokenRegistration implements Closeable {
    private Runnable action;
    private boolean closed;
    private final Object lock = new Object();
    private CancellationTokenSource tokenSource;

    public CancellationTokenRegistration(CancellationTokenSource cancellationTokenSource, Runnable runnable) {
        this.tokenSource = cancellationTokenSource;
        this.action = runnable;
    }

    private void throwIfClosed() {
        if (this.closed) {
            Single$$ExternalSyntheticBUOutline0.m$2("Object already closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                this.tokenSource.unregister(this);
                this.tokenSource = null;
                this.action = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void runAction() {
        synchronized (this.lock) {
            throwIfClosed();
            this.action.run();
            close();
        }
    }
}
