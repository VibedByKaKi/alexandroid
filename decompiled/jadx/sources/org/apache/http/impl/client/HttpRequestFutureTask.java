package org.apache.http.impl.client;

import java.util.concurrent.FutureTask;
import org.apache.http.client.methods.HttpUriRequest;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class HttpRequestFutureTask<V> extends FutureTask<V> {
    private final HttpRequestTaskCallable<V> callable;
    private final HttpUriRequest request;

    public HttpRequestFutureTask(HttpUriRequest httpUriRequest, HttpRequestTaskCallable<V> httpRequestTaskCallable) {
        super(httpRequestTaskCallable);
        this.request = httpUriRequest;
        this.callable = httpRequestTaskCallable;
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.callable.cancel();
        if (z) {
            this.request.abort();
        }
        return super.cancel(z);
    }

    public long endedTime() {
        if (isDone()) {
            return this.callable.getEnded();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Task is not done yet");
        return 0L;
    }

    public long requestDuration() {
        if (isDone()) {
            return endedTime() - startedTime();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Task is not done yet");
        return 0L;
    }

    public long scheduledTime() {
        return this.callable.getScheduled();
    }

    public long startedTime() {
        return this.callable.getStarted();
    }

    public long taskDuration() {
        if (isDone()) {
            return endedTime() - scheduledTime();
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Task is not done yet");
        return 0L;
    }

    @Override // java.util.concurrent.FutureTask
    public String toString() {
        return this.request.getRequestLine().getUri();
    }
}
