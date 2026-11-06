package com.facebook.datasource;

import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface DataSource<T> {
    boolean close();

    @Nullable
    Map<String, Object> getExtras();

    @Nullable
    Throwable getFailureCause();

    float getProgress();

    @Nullable
    T getResult();

    boolean hasFailed();

    boolean hasMultipleResults();

    boolean hasResult();

    boolean isClosed();

    boolean isFinished();

    void subscribe(DataSubscriber<T> dataSubscriber, Executor executor);
}
