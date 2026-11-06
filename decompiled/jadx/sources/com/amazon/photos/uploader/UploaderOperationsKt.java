package com.amazon.photos.uploader;

import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"submitIfNotShutdown", "", "Ljava/util/concurrent/ExecutorService;", "task", "Ljava/lang/Runnable;", "AndroidPhotosUploader_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UploaderOperationsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitIfNotShutdown(ExecutorService executorService, Runnable runnable) {
        if (executorService.isShutdown()) {
            return;
        }
        executorService.submit(runnable);
    }
}
