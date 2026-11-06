package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes7.dex */
public final class FileDataSourceFactory implements DataSource.Factory {
    private final FileDataSource.Factory wrappedFactory;

    public FileDataSourceFactory(@Nullable TransferListener transferListener) {
        this.wrappedFactory = new FileDataSource.Factory().setListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public FileDataSource createDataSource() {
        return this.wrappedFactory.createDataSource();
    }

    public FileDataSourceFactory() {
        this(null);
    }
}
