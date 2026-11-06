package com.facebook.datasource;

import com.facebook.common.internal.Preconditions;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SimpleDataSource<T> extends AbstractDataSource<T> {
    private SimpleDataSource() {
    }

    public static <T> SimpleDataSource<T> create() {
        return new SimpleDataSource<>();
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public boolean setFailure(Throwable th) {
        return super.setFailure((Throwable) Preconditions.checkNotNull(th));
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public boolean setProgress(float f) {
        return super.setProgress(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean setResult(T t) {
        return super.setResult(Preconditions.checkNotNull(t), true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.datasource.AbstractDataSource
    public boolean setResult(T t, boolean z, Map<String, Object> map) {
        return super.setResult(Preconditions.checkNotNull(t), z, map);
    }
}
