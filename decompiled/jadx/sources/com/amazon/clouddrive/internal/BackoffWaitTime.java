package com.amazon.clouddrive.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class BackoffWaitTime {
    private static final long BASE_WAIT_TIME = 1000;
    private static final int FAILURE_CEILING = 8;
    private static final RequestRetryCount mRequestRetryCount = new RequestRetryCount();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RequestRetryCount {
        private final Map<Class<?>, AtomicInteger> mRequestRetryCounts;

        private RequestRetryCount() {
            this.mRequestRetryCounts = new HashMap();
        }

        public synchronized int getRetiresForRequestAndIncrement(Class<?> cls) {
            boolean containsKey = this.mRequestRetryCounts.containsKey(cls);
            Map<Class<?>, AtomicInteger> map = this.mRequestRetryCounts;
            if (containsKey) {
                return map.get(cls).getAndIncrement();
            }
            map.put(cls, new AtomicInteger(1));
            return 0;
        }

        public synchronized void removeRequestRetryCount(Class<?> cls) {
            this.mRequestRetryCounts.remove(cls);
        }
    }

    public static void addSuccess(Class<?> cls) {
        mRequestRetryCount.removeRequestRetryCount(cls);
    }

    public static long getMaxWaitTime(int i, Class<?> cls) {
        return 1000 << Math.min(Math.max(mRequestRetryCount.getRetiresForRequestAndIncrement(cls), i), 8);
    }

    public static long getNextWaitTime(int i, Class<?> cls) {
        return Math.round(Math.random() * getMaxWaitTime(i, cls));
    }
}
