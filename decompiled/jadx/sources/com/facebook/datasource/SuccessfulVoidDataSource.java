package com.facebook.datasource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/datasource/SuccessfulVoidDataSource;", "Lcom/facebook/datasource/AbstractDataSource;", "Ljava/lang/Void;", "<init>", "()V", "fbcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SuccessfulVoidDataSource extends AbstractDataSource<Void> {

    @NotNull
    public static final SuccessfulVoidDataSource INSTANCE;

    static {
        SuccessfulVoidDataSource successfulVoidDataSource = new SuccessfulVoidDataSource();
        INSTANCE = successfulVoidDataSource;
        successfulVoidDataSource.setResult(null, true);
    }

    private SuccessfulVoidDataSource() {
    }
}
