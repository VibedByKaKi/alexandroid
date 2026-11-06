package com.amazon.photos.discovery.internal.util;

import com.amazon.alexa.featureservice.constants.FeatureServiceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/amazon/photos/discovery/internal/util/RetryableOperationUtil;", "", "()V", "runWithRetry", "", "maxAttempts", "", "operation", "Lcom/amazon/photos/discovery/internal/util/RetryableOperationUtil$RetryableOperation;", "RetryableOperation", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RetryableOperationUtil {

    @NotNull
    public static final RetryableOperationUtil INSTANCE = new RetryableOperationUtil();

    private RetryableOperationUtil() {
    }

    public final void runWithRetry(int maxAttempts, @NotNull RetryableOperation operation) {
        operation.getClass();
        boolean z = false;
        while (true) {
            if (!z) {
                int i = maxAttempts - 1;
                if (maxAttempts <= 0) {
                    maxAttempts = i;
                    break;
                }
                operation.preOperation();
                try {
                    try {
                        operation.run();
                        z = true;
                    } catch (Exception e) {
                        operation.handleException(e, i);
                    }
                    operation.postOperation(z, i);
                    maxAttempts = i;
                } catch (Throwable th) {
                    operation.postOperation(z, i);
                    throw th;
                }
            } else {
                break;
            }
        }
        operation.finalOperation(z, maxAttempts);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H&¨\u0006\u0010"}, d2 = {"Lcom/amazon/photos/discovery/internal/util/RetryableOperationUtil$RetryableOperation;", "", "()V", "finalOperation", "", FeatureServiceMetrics.EventType.PREFETCH_COMPLETED, "", "numRetry", "", "handleException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "postOperation", "preOperation", "run", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class RetryableOperation {
        public abstract void run();

        public void preOperation() {
        }

        public void finalOperation(boolean completed, int numRetry) {
        }

        public void handleException(@Nullable Exception e, int numRetry) {
        }

        public void postOperation(boolean completed, int numRetry) {
        }
    }
}
