package com.amazon.alexa.api;

import androidx.annotation.VisibleForTesting;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class RegisteredObjectContainer {
    private final Map<Object, RegisteredObjectRunnable> registeredObjects = Collections.synchronizedMap(new LinkedHashMap());

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RegisteredObjectRunnable {
        private final Runnable deregisterRunnable;
        private final Runnable registerRunnable;

        public RegisteredObjectRunnable(Runnable runnable, Runnable runnable2) {
            this.registerRunnable = runnable;
            this.deregisterRunnable = runnable2;
        }

        public void deregister() {
            this.deregisterRunnable.run();
        }

        public void register() {
            this.registerRunnable.run();
        }
    }

    public void clear() {
        this.registeredObjects.clear();
    }

    public void deregisterAllRunnables() {
        synchronized (this.registeredObjects) {
            try {
                Iterator it2 = new LinkedHashSet(this.registeredObjects.values()).iterator();
                while (it2.hasNext()) {
                    ((RegisteredObjectRunnable) it2.next()).deregister();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void register(Object obj, Runnable runnable, Runnable runnable2) {
        if (this.registeredObjects.containsKey(obj)) {
            return;
        }
        this.registeredObjects.put(obj, new RegisteredObjectRunnable(runnable, runnable2));
    }

    public void registerAllRunnables() {
        synchronized (this.registeredObjects) {
            try {
                Iterator it2 = new LinkedHashSet(this.registeredObjects.values()).iterator();
                while (it2.hasNext()) {
                    ((RegisteredObjectRunnable) it2.next()).register();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public RegisteredObjectRunnable remove(Object obj) {
        return this.registeredObjects.remove(obj);
    }

    @VisibleForTesting
    public int size() {
        return this.registeredObjects.size();
    }
}
