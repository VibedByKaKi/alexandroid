package com.facebook.datasource;

import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface DataSubscriber<T> {
    void onCancellation(@Nonnull DataSource<T> dataSource);

    void onFailure(@Nonnull DataSource<T> dataSource);

    void onNewResult(@Nonnull DataSource<T> dataSource);

    void onProgressUpdate(@Nonnull DataSource<T> dataSource);
}
