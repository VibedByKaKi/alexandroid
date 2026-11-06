package rx.internal.util;

import java.util.concurrent.CountDownLatch;
import rx.Single$$ExternalSyntheticBUOutline0;
import rx.Subscription;
import rx.annotations.Experimental;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Experimental
/* loaded from: classes12.dex */
public final class BlockingUtils {
    private BlockingUtils() {
    }

    @Experimental
    public static void awaitForComplete(CountDownLatch countDownLatch, Subscription subscription) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            subscription.unsubscribe();
            Thread.currentThread().interrupt();
            Single$$ExternalSyntheticBUOutline0.m$1("Interrupted while waiting for subscription to complete.", e);
        }
    }
}
