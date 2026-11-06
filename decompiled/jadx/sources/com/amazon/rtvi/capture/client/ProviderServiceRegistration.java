package com.amazon.rtvi.capture.client;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceConsumer;
import com.amazon.rtvi.capture.interfaces.ICaptureSourceProvider;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class ProviderServiceRegistration implements AutoCloseable {
    private static final String TAG = "ProviderServiceRegistration";
    private volatile boolean closed = false;
    private ICaptureSourceConsumer consumer = null;
    private final ICaptureSourceProvider provider;
    private final CopyOnWriteArrayList<ProviderServiceRegistration> registrations;

    public ProviderServiceRegistration(@NonNull ICaptureSourceProvider iCaptureSourceProvider, @NonNull CopyOnWriteArrayList<ProviderServiceRegistration> copyOnWriteArrayList) {
        this.provider = iCaptureSourceProvider;
        this.registrations = copyOnWriteArrayList;
        copyOnWriteArrayList.add(this);
        copyOnWriteArrayList.size();
    }

    public void attachConsumer(@NonNull ICaptureSourceConsumer iCaptureSourceConsumer) throws RemoteException {
        synchronized (this) {
            this.consumer = iCaptureSourceConsumer;
        }
        iCaptureSourceConsumer.registerProvider(this.provider);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            try {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                ICaptureSourceConsumer iCaptureSourceConsumer = this.consumer;
                if (iCaptureSourceConsumer != null) {
                    try {
                        try {
                            iCaptureSourceConsumer.unregisterProvider(this.provider);
                            Log.i(TAG, "Provider unregistered via AutoCloseable");
                        } catch (RemoteException e) {
                            Log.e(TAG, "Failed to unregister provider via AutoCloseable", e);
                        }
                    } finally {
                        this.registrations.remove(this);
                        this.registrations.size();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public ICaptureSourceProvider getProvider() {
        return this.provider;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public void shutdown() {
        synchronized (this) {
            try {
                if (this.closed) {
                    return;
                }
                this.closed = true;
                ICaptureSourceConsumer iCaptureSourceConsumer = this.consumer;
                if (iCaptureSourceConsumer != null) {
                    try {
                        iCaptureSourceConsumer.unregisterProvider(this.provider);
                        Log.i(TAG, "Provider unregistered via shutdown");
                    } catch (RemoteException e) {
                        Log.e(TAG, "Failed to unregister provider via shutdown", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
