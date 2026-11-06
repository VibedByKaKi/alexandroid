package com.amazon.deecomms.calling.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class Result<T> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Error<T> extends Result<T> {
        private final Exception exception;

        public Error(Exception exc) {
            super(0);
            this.exception = exc;
        }

        public Exception getException() {
            return this.exception;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Success<T> extends Result<T> {
        private final T data;

        public Success(T t) {
            super(0);
            this.data = t;
        }

        public T getData() {
            return this.data;
        }
    }

    public /* synthetic */ Result(int i) {
        this();
    }

    private Result() {
    }
}
