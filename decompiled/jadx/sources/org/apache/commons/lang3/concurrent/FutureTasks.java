package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class FutureTasks {
    private FutureTasks() {
    }

    public static <V> FutureTask<V> run(Callable<V> callable) {
        FutureTask<V> futureTask = new FutureTask<>(callable);
        futureTask.run();
        return futureTask;
    }
}
