package org.apache.logging.log4j.util;

import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class LazyUtil {
    private static final Object NULL = new Object() { // from class: org.apache.logging.log4j.util.LazyUtil.1
        public String toString() {
            return "null";
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Constant<T> implements Lazy<T> {
        private final T value;

        public Constant(T t) {
            this.value = t;
        }

        @Override // org.apache.logging.log4j.util.Lazy
        public boolean isInitialized() {
            return true;
        }

        @Override // org.apache.logging.log4j.util.Lazy
        public void set(T t) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            return String.valueOf(this.value);
        }

        @Override // org.apache.logging.log4j.util.Lazy
        public T value() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PureLazy<T> implements Lazy<T> {
        private final java.util.function.Supplier<T> supplier;
        private Object value;

        public PureLazy(java.util.function.Supplier<T> supplier) {
            this.supplier = supplier;
        }

        @Override // org.apache.logging.log4j.util.Lazy
        public boolean isInitialized() {
            return this.value != null;
        }

        @Override // org.apache.logging.log4j.util.Lazy
        public void set(T t) {
            this.value = t;
        }

        @Override // org.apache.logging.log4j.util.Lazy
        public T value() {
            Object obj = this.value;
            if (obj == null) {
                obj = this.supplier.get();
                this.value = LazyUtil.wrapNull(obj);
            }
            return (T) LazyUtil.unwrapNull(obj);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SafeLazy<T> implements Lazy<T> {
        private final Lock lock = new ReentrantLock();
        private final java.util.function.Supplier<T> supplier;
        private volatile Object value;

        public SafeLazy(java.util.function.Supplier<T> supplier) {
            this.supplier = supplier;
        }

        @Override // org.apache.logging.log4j.util.Lazy
        public boolean isInitialized() {
            return this.value != null;
        }

        public void reset() {
            this.value = null;
        }

        @Override // org.apache.logging.log4j.util.Lazy
        public void set(T t) {
            this.value = t;
        }

        public String toString() {
            return isInitialized() ? String.valueOf(this.value) : "Lazy value not initialized";
        }

        @Override // org.apache.logging.log4j.util.Lazy
        public T value() {
            Object obj = this.value;
            if (obj == null) {
                this.lock.lock();
                try {
                    obj = this.value;
                    if (obj == null) {
                        obj = this.supplier.get();
                        this.value = LazyUtil.wrapNull(obj);
                    }
                } finally {
                    this.lock.unlock();
                }
            }
            return (T) LazyUtil.unwrapNull(obj);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class WeakConstant<T> implements Lazy<T> {
        private final WeakReference<T> reference;

        public WeakConstant(T t) {
            this.reference = new WeakReference<>(t);
        }

        @Override // org.apache.logging.log4j.util.Lazy
        public boolean isInitialized() {
            return true;
        }

        @Override // org.apache.logging.log4j.util.Lazy
        public void set(T t) {
            throw new UnsupportedOperationException();
        }

        public String toString() {
            return String.valueOf(value());
        }

        @Override // org.apache.logging.log4j.util.Lazy
        public T value() {
            return this.reference.get();
        }
    }

    public static <T> T unwrapNull(Object obj) {
        if (obj == NULL) {
            return null;
        }
        return (T) Cast.cast(obj);
    }

    public static Object wrapNull(Object obj) {
        return obj == null ? NULL : obj;
    }
}
