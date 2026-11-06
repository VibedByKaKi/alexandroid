package com.facebook.datasource;

import com.facebook.common.internal.Supplier;
import com.facebook.infer.annotation.Nullsafe;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class DataSources {
    private DataSources() {
    }

    public static <T> Supplier<DataSource<T>> getFailedDataSourceSupplier(final Throwable th) {
        return new Supplier<DataSource<T>>() { // from class: com.facebook.datasource.DataSources.1
            @Override // com.facebook.common.internal.Supplier
            public DataSource<T> get() {
                return DataSources.immediateFailedDataSource(th);
            }
        };
    }

    public static <T> DataSource<T> immediateDataSource(T t) {
        SimpleDataSource create = SimpleDataSource.create();
        create.setResult(t);
        return create;
    }

    public static <T> DataSource<T> immediateFailedDataSource(Throwable th) {
        SimpleDataSource create = SimpleDataSource.create();
        create.setFailure(th);
        return create;
    }

    public static DataSource<Void> immediateSuccessfulDataSource() {
        return SuccessfulVoidDataSource.INSTANCE;
    }

    @Nullable
    public static <T> T waitForFinalResult(DataSource<T> dataSource, long j, TimeUnit timeUnit) throws Throwable {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        int i = 0;
        final ValueHolder valueHolder = new ValueHolder(i);
        final ValueHolder valueHolder2 = new ValueHolder(i);
        dataSource.subscribe(new DataSubscriber<T>() { // from class: com.facebook.datasource.DataSources.2
            @Override // com.facebook.datasource.DataSubscriber
            public void onCancellation(DataSource<T> dataSource2) {
                countDownLatch.countDown();
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onFailure(DataSource<T> dataSource2) {
                try {
                    valueHolder2.value = (T) dataSource2.getFailureCause();
                } finally {
                    countDownLatch.countDown();
                }
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onNewResult(DataSource<T> dataSource2) {
                if (dataSource2.isFinished()) {
                    try {
                        ValueHolder.this.value = dataSource2.getResult();
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onProgressUpdate(DataSource<T> dataSource2) {
            }
        }, new Executor() { // from class: com.facebook.datasource.DataSources.3
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                runnable.run();
            }
        });
        if (j < 0) {
            countDownLatch.await();
        } else if (!countDownLatch.await(j, timeUnit)) {
            throw new TimeoutException();
        }
        T t = valueHolder2.value;
        if (t == null) {
            return valueHolder.value;
        }
        throw ((Throwable) t);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ValueHolder<T> {

        @Nullable
        public T value;

        private ValueHolder() {
            this.value = null;
        }

        public /* synthetic */ ValueHolder(int i) {
            this();
        }
    }

    @Nullable
    public static <T> T waitForFinalResult(DataSource<T> dataSource) throws Throwable {
        return (T) waitForFinalResult(dataSource, -1L, TimeUnit.MILLISECONDS);
    }
}
