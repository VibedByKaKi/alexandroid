package com.facebook.datasource;

import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.infer.annotation.Nullsafe;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class FirstAvailableDataSourceSupplier<T> implements Supplier<DataSource<T>> {
    private final List<Supplier<DataSource<T>>> mDataSourceSuppliers;

    private FirstAvailableDataSourceSupplier(List<Supplier<DataSource<T>>> list) {
        Preconditions.checkArgument(!list.isEmpty(), "List of suppliers is empty!");
        this.mDataSourceSuppliers = list;
    }

    public static <T> FirstAvailableDataSourceSupplier<T> create(List<Supplier<DataSource<T>>> list) {
        return new FirstAvailableDataSourceSupplier<>(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FirstAvailableDataSourceSupplier) {
            return Objects.equal(this.mDataSourceSuppliers, ((FirstAvailableDataSourceSupplier) obj).mDataSourceSuppliers);
        }
        return false;
    }

    @Override // com.facebook.common.internal.Supplier
    public DataSource<T> get() {
        return new FirstAvailableDataSource();
    }

    public int hashCode() {
        return this.mDataSourceSuppliers.hashCode();
    }

    public String toString() {
        return Objects.toStringHelper(this).add("list", this.mDataSourceSuppliers).toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @ThreadSafe
    public class FirstAvailableDataSource extends AbstractDataSource<T> {
        private int mIndex = 0;

        @Nullable
        private DataSource<T> mCurrentDataSource = null;

        @Nullable
        private DataSource<T> mDataSourceWithResult = null;

        public FirstAvailableDataSource() {
            if (startNextDataSource()) {
                return;
            }
            setFailure(new RuntimeException("No data source supplier or supplier returned null."));
        }

        private synchronized boolean clearCurrentDataSource(DataSource<T> dataSource) {
            if (!isClosed() && dataSource == this.mCurrentDataSource) {
                this.mCurrentDataSource = null;
                return true;
            }
            return false;
        }

        private void closeSafely(@Nullable DataSource<T> dataSource) {
            if (dataSource != null) {
                dataSource.close();
            }
        }

        @Nullable
        private synchronized DataSource<T> getDataSourceWithResult() {
            return this.mDataSourceWithResult;
        }

        @Nullable
        private synchronized Supplier<DataSource<T>> getNextSupplier() {
            if (isClosed() || this.mIndex >= FirstAvailableDataSourceSupplier.this.mDataSourceSuppliers.size()) {
                return null;
            }
            List list = FirstAvailableDataSourceSupplier.this.mDataSourceSuppliers;
            int i = this.mIndex;
            this.mIndex = i + 1;
            return (Supplier) list.get(i);
        }

        private void maybeSetDataSourceWithResult(DataSource<T> dataSource, boolean z) {
            DataSource<T> dataSource2;
            synchronized (this) {
                if (dataSource == this.mCurrentDataSource && dataSource != (dataSource2 = this.mDataSourceWithResult)) {
                    if (dataSource2 != null && !z) {
                        dataSource2 = null;
                        closeSafely(dataSource2);
                    }
                    this.mDataSourceWithResult = dataSource;
                    closeSafely(dataSource2);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onDataSourceFailed(DataSource<T> dataSource) {
            if (clearCurrentDataSource(dataSource)) {
                if (dataSource != getDataSourceWithResult()) {
                    closeSafely(dataSource);
                }
                if (startNextDataSource()) {
                    return;
                }
                setFailure(dataSource.getFailureCause(), dataSource.getExtras());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onDataSourceNewResult(DataSource<T> dataSource) {
            maybeSetDataSourceWithResult(dataSource, dataSource.isFinished());
            if (dataSource == getDataSourceWithResult()) {
                setResult(null, dataSource.isFinished(), dataSource.getExtras());
            }
        }

        private synchronized boolean setCurrentDataSource(DataSource<T> dataSource) {
            if (isClosed()) {
                return false;
            }
            this.mCurrentDataSource = dataSource;
            return true;
        }

        private boolean startNextDataSource() {
            Supplier<DataSource<T>> nextSupplier = getNextSupplier();
            DataSource<T> dataSource = nextSupplier != null ? nextSupplier.get() : null;
            int i = 0;
            if (!setCurrentDataSource(dataSource) || dataSource == null) {
                closeSafely(dataSource);
                return false;
            }
            dataSource.subscribe(new InternalDataSubscriber(this, i), CallerThreadExecutor.getInstance());
            return true;
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        public boolean close() {
            synchronized (this) {
                try {
                    if (!super.close()) {
                        return false;
                    }
                    DataSource<T> dataSource = this.mCurrentDataSource;
                    this.mCurrentDataSource = null;
                    DataSource<T> dataSource2 = this.mDataSourceWithResult;
                    this.mDataSourceWithResult = null;
                    closeSafely(dataSource2);
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
            DataSource<T> dataSourceWithResult;
            dataSourceWithResult = getDataSourceWithResult();
            return dataSourceWithResult != null ? dataSourceWithResult.getResult() : null;
        }

        @Override // com.facebook.datasource.AbstractDataSource, com.facebook.datasource.DataSource
        public synchronized boolean hasResult() {
            boolean z;
            DataSource<T> dataSourceWithResult = getDataSourceWithResult();
            if (dataSourceWithResult != null) {
                z = dataSourceWithResult.hasResult();
            }
            return z;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class InternalDataSubscriber implements DataSubscriber<T> {
            private InternalDataSubscriber() {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onFailure(DataSource<T> dataSource) {
                FirstAvailableDataSource.this.onDataSourceFailed(dataSource);
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.hasResult()) {
                    FirstAvailableDataSource.this.onDataSourceNewResult(dataSource);
                } else if (dataSource.isFinished()) {
                    FirstAvailableDataSource.this.onDataSourceFailed(dataSource);
                }
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onProgressUpdate(DataSource<T> dataSource) {
                FirstAvailableDataSource.this.setProgress(Math.max(FirstAvailableDataSource.this.getProgress(), dataSource.getProgress()));
            }

            public /* synthetic */ InternalDataSubscriber(FirstAvailableDataSource firstAvailableDataSource, int i) {
                this();
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onCancellation(DataSource<T> dataSource) {
            }
        }
    }
}
