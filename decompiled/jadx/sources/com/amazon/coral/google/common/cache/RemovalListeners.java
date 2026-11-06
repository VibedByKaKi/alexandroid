package com.amazon.coral.google.common.cache;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.common.base.Preconditions;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes19.dex */
public final class RemovalListeners {
    private RemovalListeners() {
    }

    public static <K, V> RemovalListener<K, V> asynchronous(final RemovalListener<K, V> removalListener, final Executor executor) {
        Preconditions.checkNotNull(removalListener);
        Preconditions.checkNotNull(executor);
        return new RemovalListener() { // from class: com.amazon.coral.google.common.cache.RemovalListeners$$ExternalSyntheticLambda1
            @Override // com.amazon.coral.google.common.cache.RemovalListener
            public final void onRemoval(RemovalNotification removalNotification) {
                RemovalListeners.lambda$asynchronous$1(executor, removalListener, removalNotification);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$asynchronous$1(Executor executor, final RemovalListener removalListener, final RemovalNotification removalNotification) {
        executor.execute(new Runnable() { // from class: com.amazon.coral.google.common.cache.RemovalListeners$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                RemovalListener.this.onRemoval(removalNotification);
            }
        });
    }
}
