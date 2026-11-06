package com.facebook.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Supplier;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.NotThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@NotThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class RetainingDataSourceSupplier<T> implements Supplier<DataSource<T>> {
    private final Set<RetainingDataSource> mDataSources = Collections.newSetFromMap(new WeakHashMap());

    @Nullable
    private Supplier<DataSource<T>> mCurrentDataSourceSupplier = null;

    @Override // com.facebook.common.internal.Supplier
    public DataSource<T> get() {
        RetainingDataSource retainingDataSource = new RetainingDataSource(0);
        retainingDataSource.setSupplier(this.mCurrentDataSourceSupplier);
        this.mDataSources.add(retainingDataSource);
        return retainingDataSource;
    }

    public void replaceSupplier(Supplier<DataSource<T>> supplier) {
        this.mCurrentDataSourceSupplier = supplier;
        for (RetainingDataSource retainingDataSource : this.mDataSources) {
            if (!retainingDataSource.isClosed()) {
                retainingDataSource.setSupplier(supplier);
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RetainingDataSource<T> extends AbstractDataSource<T> {

        @GuardedBy("RetainingDataSource.this")
        @Nullable
        private DataSource<T> mDataSource;

        private RetainingDataSource() {
            this.mDataSource = null;
        }

        private static <T> void closeSafely(DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onDataSourceNewResult(DataSource<T> dataSource) {
            if (dataSource == this.mDataSource) {
                setResult(null, false, dataSource.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onDatasourceProgress(DataSource<T> dataSource) {
            if (dataSource == this.mDataSource) {
                setProgress(dataSource.getProgress());
            }
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    DataSource<T> dataSource = this.mDataSource;
                    this.mDataSource = null;
                    closeSafely(dataSource);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        @Nullable
        public synchronized T getResult() {
            DataSource<T> dataSource;
            dataSource = this.mDataSource;
            return dataSource != null ? dataSource.getResult() : null;
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        public boolean hasMultipleResults() {
            return true;
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        public synchronized boolean hasResult() {
            boolean z;
            DataSource<T> dataSource = this.mDataSource;
            if (dataSource != null) {
                z = dataSource.hasResult();
            }
            return z;
        }

        public void setSupplier(@Nullable Supplier<DataSource<T>> supplier) {
            if (isClosed()) {
                return;
            }
            DataSource<T> dataSource = supplier != null ? supplier.get() : null;
            synchronized (this) {
                try {
                    if (isClosed()) {
                        closeSafely(dataSource);
                        return;
                    }
                    DataSource<T> dataSource2 = this.mDataSource;
                    this.mDataSource = dataSource;
                    if (dataSource != null) {
                        dataSource.subscribe(new InternalDataSubscriber(this, 0), CallerThreadExecutor.getInstance());
                    }
                    closeSafely(dataSource2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class InternalDataSubscriber implements DataSubscriber<T> {
            private InternalDataSubscriber() {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onFailure(DataSource<T> dataSource) {
                RetainingDataSource.this.onDataSourceFailed();
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.hasResult()) {
                    RetainingDataSource.this.onDataSourceNewResult(dataSource);
                } else if (dataSource.isFinished()) {
                    RetainingDataSource.this.onDataSourceFailed();
                }
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onProgressUpdate(DataSource<T> dataSource) {
                RetainingDataSource.this.onDatasourceProgress(dataSource);
            }

            public /* synthetic */ InternalDataSubscriber(RetainingDataSource retainingDataSource, int i) {
                this();
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onCancellation(DataSource<T> dataSource) {
            }
        }

        public /* synthetic */ RetainingDataSource(int i) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onDataSourceFailed() {
        }
    }
}
