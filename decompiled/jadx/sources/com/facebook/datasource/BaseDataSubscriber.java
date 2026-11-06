package com.facebook.datasource;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public abstract class BaseDataSubscriber<T> implements DataSubscriber<T> {
    @Override // com.facebook.datasource.DataSubscriber
    public void onFailure(@Nonnull DataSource<T> dataSource) {
        try {
            onFailureImpl(dataSource);
        } finally {
            dataSource.close();
        }
    }

    public abstract void onFailureImpl(@Nonnull DataSource<T> dataSource);

    @Override // com.facebook.datasource.DataSubscriber
    public void onNewResult(@Nonnull DataSource<T> dataSource) {
        boolean isFinished = dataSource.isFinished();
        try {
            onNewResultImpl(dataSource);
        } finally {
            if (isFinished) {
                dataSource.close();
            }
        }
    }

    public abstract void onNewResultImpl(@Nonnull DataSource<T> dataSource);

    @Override // com.facebook.datasource.DataSubscriber
    public void onCancellation(@Nonnull DataSource<T> dataSource) {
    }

    @Override // com.facebook.datasource.DataSubscriber
    public void onProgressUpdate(@Nonnull DataSource<T> dataSource) {
    }
}
