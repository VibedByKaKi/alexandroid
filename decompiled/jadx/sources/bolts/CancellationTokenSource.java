package bolts;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class CancellationTokenSource implements Closeable {
    private boolean cancellationRequested;
    private boolean closed;
    private ScheduledFuture<?> scheduledCancellation;
    private final Object lock = new Object();
    private final List<CancellationTokenRegistration> registrations = new ArrayList();
    private final ScheduledExecutorService executor = BoltsExecutors.scheduled();

    private void cancelAfter(long j, TimeUnit timeUnit) {
        if (j < -1) {
            Single$$ExternalSyntheticBUOutline0.m$3("Delay must be >= -1");
            return;
        }
        if (j == 0) {
            cancel();
            return;
        }
        synchronized (this.lock) {
            try {
                if (this.cancellationRequested) {
                    return;
                }
                cancelScheduledCancellation();
                if (j != -1) {
                    this.scheduledCancellation = this.executor.schedule(new Runnable() { // from class: bolts.CancellationTokenSource.1
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (CancellationTokenSource.this.lock) {
                                CancellationTokenSource.this.scheduledCancellation = null;
                            }
                            CancellationTokenSource.this.cancel();
                        }
                    }, j, timeUnit);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void cancelScheduledCancellation() {
        ScheduledFuture<?> scheduledFuture = this.scheduledCancellation;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.scheduledCancellation = null;
        }
    }

    private void notifyListeners(List<CancellationTokenRegistration> list) {
        Iterator<CancellationTokenRegistration> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().runAction();
        }
    }

    private void throwIfClosed() {
        if (this.closed) {
            Single$$ExternalSyntheticBUOutline0.m$2("Object already closed");
        }
    }

    public void cancel() {
        synchronized (this.lock) {
            try {
                throwIfClosed();
                if (this.cancellationRequested) {
                    return;
                }
                cancelScheduledCancellation();
                this.cancellationRequested = true;
                notifyListeners(new ArrayList(this.registrations));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                if (this.closed) {
                    return;
                }
                cancelScheduledCancellation();
                Iterator<CancellationTokenRegistration> it2 = this.registrations.iterator();
                while (it2.hasNext()) {
                    it2.next().close();
                }
                this.registrations.clear();
                this.closed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public CancellationToken getToken() {
        CancellationToken cancellationToken;
        synchronized (this.lock) {
            throwIfClosed();
            cancellationToken = new CancellationToken(this);
        }
        return cancellationToken;
    }

    public boolean isCancellationRequested() {
        boolean z;
        synchronized (this.lock) {
            throwIfClosed();
            z = this.cancellationRequested;
        }
        return z;
    }

    public CancellationTokenRegistration register(Runnable runnable) {
        CancellationTokenRegistration cancellationTokenRegistration;
        synchronized (this.lock) {
            try {
                throwIfClosed();
                cancellationTokenRegistration = new CancellationTokenRegistration(this, runnable);
                if (this.cancellationRequested) {
                    cancellationTokenRegistration.runAction();
                } else {
                    this.registrations.add(cancellationTokenRegistration);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cancellationTokenRegistration;
    }

    public void throwIfCancellationRequested() throws CancellationException {
        synchronized (this.lock) {
            try {
                throwIfClosed();
                if (this.cancellationRequested) {
                    throw new CancellationException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        Locale locale = Locale.US;
        StringBuilder m = TableInfo$$ExternalSyntheticOutline0.m(getClass().getName(), "@", Integer.toHexString(hashCode()), "[cancellationRequested=", Boolean.toString(isCancellationRequested()));
        m.append(MarkdownConstants.RIGHT_BRACKET);
        return m.toString();
    }

    public void unregister(CancellationTokenRegistration cancellationTokenRegistration) {
        synchronized (this.lock) {
            throwIfClosed();
            this.registrations.remove(cancellationTokenRegistration);
        }
    }

    public void cancelAfter(long j) {
        cancelAfter(j, TimeUnit.MILLISECONDS);
    }
}
