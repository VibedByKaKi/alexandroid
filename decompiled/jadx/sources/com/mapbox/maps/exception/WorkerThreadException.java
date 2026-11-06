package com.mapbox.maps.exception;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/mapbox/maps/exception/WorkerThreadException;", "Ljava/lang/RuntimeException;", "()V", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class WorkerThreadException extends RuntimeException {
    public WorkerThreadException() {
        super("The exception that is thrown when an application attempts to \nperform a map operation on a worker thread.");
    }
}
