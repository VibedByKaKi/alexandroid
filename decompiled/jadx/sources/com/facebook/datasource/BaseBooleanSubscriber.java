package com.facebook.datasource;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public abstract class BaseBooleanSubscriber implements DataSubscriber<Boolean> {
    @Override // com.facebook.datasource.DataSubscriber
    public void onFailure(DataSource<Boolean> dataSource) {
        try {
            onFailureImpl(dataSource);
        } finally {
            dataSource.close();
        }
    }

    public abstract void onFailureImpl(DataSource<Boolean> dataSource);

    @Override // com.facebook.datasource.DataSubscriber
    public void onNewResult(DataSource<Boolean> dataSource) {
        try {
            onNewResultImpl(dataSource.getResult().booleanValue());
        } finally {
            dataSource.close();
        }
    }

    public abstract void onNewResultImpl(boolean z);

    @Override // com.facebook.datasource.DataSubscriber
    public void onCancellation(DataSource<Boolean> dataSource) {
    }

    @Override // com.facebook.datasource.DataSubscriber
    public void onProgressUpdate(DataSource<Boolean> dataSource) {
    }
}
