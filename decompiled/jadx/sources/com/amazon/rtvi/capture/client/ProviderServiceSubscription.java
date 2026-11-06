package com.amazon.rtvi.capture.client;

import androidx.annotation.NonNull;
import com.amazon.rtvi.capture.client.CaptureSourceClient;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class ProviderServiceSubscription implements AutoCloseable {
    private static final String TAG = "ProviderServiceSubscription";
    private final AtomicBoolean closed = new AtomicBoolean(false);
    private final CaptureSourceClient.Listener listener;
    private final CopyOnWriteArrayList<CaptureSourceClient.Listener> listeners;

    @SuppressFBWarnings(justification = "Intentionally storing reference to mutable list to manage listener lifecycle", value = {"EI_EXPOSE_REP2"})
    public ProviderServiceSubscription(@NonNull CaptureSourceClient.Listener listener, @NonNull CopyOnWriteArrayList<CaptureSourceClient.Listener> copyOnWriteArrayList) {
        this.listener = listener;
        this.listeners = copyOnWriteArrayList;
        copyOnWriteArrayList.add(listener);
        copyOnWriteArrayList.size();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed.compareAndSet(false, true)) {
            this.listeners.remove(this.listener);
            this.listeners.size();
        }
    }

    public boolean isClosed() {
        return this.closed.get();
    }
}
