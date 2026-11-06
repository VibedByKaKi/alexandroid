package com.amazon.alexa.android.extension.discovery;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class ConnectionMonitorList<E extends IInterface, C> extends RemoteCallbackList<E> {
    AtomicBoolean mKilled = new AtomicBoolean(false);

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        r0 = getRegisteredCallbackItem(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized E get(C r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            if (r5 != 0) goto L6
            monitor-exit(r4)
            return r0
        L6:
            int r1 = r4.getRegisteredCallbackCount()     // Catch: java.lang.Throwable -> L1c
            r2 = 0
        Lb:
            if (r2 >= r1) goto L21
            java.lang.Object r3 = r4.getRegisteredCallbackCookie(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            android.os.IInterface r0 = r4.getRegisteredCallbackItem(r2)     // Catch: java.lang.Throwable -> L1c
            goto L21
        L1c:
            r5 = move-exception
            goto L23
        L1e:
            int r2 = r2 + 1
            goto Lb
        L21:
            monitor-exit(r4)
            return r0
        L23:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.android.extension.discovery.ConnectionMonitorList.get(java.lang.Object):android.os.IInterface");
    }

    public synchronized E getByIndex(int i) {
        if (i >= getRegisteredCallbackCount()) {
            return null;
        }
        return getRegisteredCallbackItem(i);
    }

    public boolean isKilled() {
        return this.mKilled.get();
    }

    @Override // android.os.RemoteCallbackList
    public void kill() {
        this.mKilled.set(true);
        super.kill();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.RemoteCallbackList
    public void onCallbackDied(E e, Object obj) {
        onDied(e, obj);
    }

    public void onDied(E e, C c) {
    }
}
