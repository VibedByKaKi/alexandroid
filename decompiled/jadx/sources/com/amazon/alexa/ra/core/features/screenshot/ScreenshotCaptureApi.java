package com.amazon.alexa.ra.core.features.screenshot;

import com.amazon.alexa.ra.core.data.model.LocalMediaInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH¦@¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0096@¢\u0006\u0002\u0010\u0006J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/screenshot/ScreenshotCaptureApi;", "", "isAvailable", "", "capture", "Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanupCache", "", "queryPageContent", "pageContentEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getPageContentEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "start", "stop", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface ScreenshotCaptureApi {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static SharedFlow<Unit> getPageContentEvents(@NotNull ScreenshotCaptureApi screenshotCaptureApi) {
            return ScreenshotCaptureApi.super.getPageContentEvents();
        }

        @Deprecated
        @Nullable
        public static Object queryPageContent(@NotNull ScreenshotCaptureApi screenshotCaptureApi, @NotNull Continuation<? super LocalMediaInfo> continuation) {
            return ScreenshotCaptureApi.super.queryPageContent(continuation);
        }

        @Deprecated
        public static void start(@NotNull ScreenshotCaptureApi screenshotCaptureApi) {
            ScreenshotCaptureApi.super.start();
        }

        @Deprecated
        public static void stop(@NotNull ScreenshotCaptureApi screenshotCaptureApi) {
            ScreenshotCaptureApi.super.stop();
        }
    }

    static /* synthetic */ Object queryPageContent$suspendImpl(ScreenshotCaptureApi screenshotCaptureApi, Continuation<? super LocalMediaInfo> continuation) {
        return null;
    }

    @Nullable
    Object capture(@NotNull Continuation<? super LocalMediaInfo> continuation);

    @Nullable
    Object cleanupCache(@NotNull Continuation<? super Unit> continuation);

    @NotNull
    default SharedFlow<Unit> getPageContentEvents() {
        return SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    }

    boolean isAvailable();

    @Nullable
    default Object queryPageContent(@NotNull Continuation<? super LocalMediaInfo> continuation) {
        return queryPageContent$suspendImpl(this, continuation);
    }

    default void start() {
    }

    default void stop() {
    }
}
