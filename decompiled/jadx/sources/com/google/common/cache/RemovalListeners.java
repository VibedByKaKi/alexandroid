package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.mapbox.common.LifecycleUtils$$ExternalSyntheticLambda4;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
/* loaded from: classes8.dex */
public final class RemovalListeners {
    private RemovalListeners() {
    }

    public static <K, V> RemovalListener<K, V> asynchronous(final RemovalListener<K, V> removalListener, final Executor executor) {
        Preconditions.checkNotNull(removalListener);
        Preconditions.checkNotNull(executor);
        return new RemovalListener() { // from class: com.google.common.cache.RemovalListeners$$ExternalSyntheticLambda0
            @Override // com.google.common.cache.RemovalListener
            public final void onRemoval(RemovalNotification removalNotification) {
                RemovalListeners.lambda$asynchronous$0(executor, removalListener, removalNotification);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$asynchronous$0(Executor executor, RemovalListener removalListener, RemovalNotification removalNotification) {
        executor.execute(new LifecycleUtils$$ExternalSyntheticLambda4(removalListener, removalNotification, 26));
    }
}
