package com.amazon.alexa.api.messages;

import android.os.HandlerThread;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class MessageHandlerManager {
    private static final String TAG = "MessageHandlerManager";
    private static final String THREAD_NAME_SUFFIX = "-handlerThread";
    private final Map<Class, HandlerThread> handlers = new HashMap();

    public synchronized void clear() {
        try {
            Iterator<HandlerThread> it2 = this.handlers.values().iterator();
            while (it2.hasNext()) {
                it2.next().quitSafely();
            }
            this.handlers.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean contains(Class<? extends MessageProcessor> cls) {
        return this.handlers.containsKey(cls);
    }

    public HandlerThread createHandlerThread(Class<? extends MessageProcessor> cls) {
        Objects.toString(cls);
        return new HandlerThread(cls.getSimpleName().concat(THREAD_NAME_SUFFIX));
    }

    public synchronized HandlerThread getHandlerThread(Class<? extends MessageProcessor> cls) {
        try {
            if (!this.handlers.containsKey(cls)) {
                HandlerThread createHandlerThread = createHandlerThread(cls);
                createHandlerThread.start();
                this.handlers.put(cls, createHandlerThread);
            }
            Objects.toString(cls);
        } catch (Throwable th) {
            throw th;
        }
        return this.handlers.get(cls);
    }

    public synchronized void releaseHandlerThread(Class<? extends MessageProcessor> cls) {
        try {
            if (this.handlers.containsKey(cls)) {
                Objects.toString(cls);
                this.handlers.remove(cls).quitSafely();
            } else {
                Log.w(TAG, "trying to release a handler without having any for " + cls);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
