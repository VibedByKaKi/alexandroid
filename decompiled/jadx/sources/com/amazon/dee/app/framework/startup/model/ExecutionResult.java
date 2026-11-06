package com.amazon.dee.app.framework.startup.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class ExecutionResult<T> {
    private T data;
    private long endTime;
    private long startTime;

    private ExecutionResult(T t, long j, long j2) {
        this.data = t;
        this.startTime = j;
        this.endTime = j2;
    }

    public static <T> Error<T> error(T t, long j, long j2) {
        return new Error<>(t, j, j2, 0);
    }

    public static <T> ExecutionResult<T> from(T t, long j, long j2) {
        return new ExecutionResult<>(t, j, j2);
    }

    public T getData() {
        return this.data;
    }

    public long getDuration() {
        return this.endTime - this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Error<T> extends ExecutionResult {
        private Error(T t, long j, long j2) {
            super(t, j, j2, 0);
        }

        public /* synthetic */ Error(Object obj, long j, long j2, int i) {
            this(obj, j, j2);
        }
    }

    public /* synthetic */ ExecutionResult(Object obj, long j, long j2, int i) {
        this(obj, j, j2);
    }
}
