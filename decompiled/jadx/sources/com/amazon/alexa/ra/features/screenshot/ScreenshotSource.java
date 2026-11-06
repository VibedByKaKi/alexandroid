package com.amazon.alexa.ra.features.screenshot;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.common.metrics.MetricEventProcessingApi;
import com.amazon.alexa.ra.core.data.model.LocalMediaInfo;
import com.amazon.alexa.ra.core.features.screenshot.ScreenshotCaptureApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\u00020\u000eH\u0096@¢\u0006\u0002\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/ra/features/screenshot/ScreenshotSource;", "Lcom/amazon/alexa/ra/core/features/screenshot/ScreenshotCaptureApi;", "context", "Landroid/content/Context;", "metricEventProcessingService", "Lcom/amazon/alexa/ra/common/metrics/MetricEventProcessingApi;", "<init>", "(Landroid/content/Context;Lcom/amazon/alexa/ra/common/metrics/MetricEventProcessingApi;)V", "isAvailable", "", "capture", "Lcom/amazon/alexa/ra/core/data/model/LocalMediaInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanupCache", "", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ScreenshotSource implements ScreenshotCaptureApi {
    public static final int $stable = 0;

    public /* synthetic */ ScreenshotSource(Context context, MetricEventProcessingApi metricEventProcessingApi, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : metricEventProcessingApi);
    }

    @Override // com.amazon.alexa.ra.core.features.screenshot.ScreenshotCaptureApi
    @Nullable
    public Object capture(@NotNull Continuation<? super LocalMediaInfo> continuation) {
        return null;
    }

    @Override // com.amazon.alexa.ra.core.features.screenshot.ScreenshotCaptureApi
    @Nullable
    public Object cleanupCache(@NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.amazon.alexa.ra.core.features.screenshot.ScreenshotCaptureApi
    public boolean isAvailable() {
        return false;
    }

    public ScreenshotSource(@NotNull Context context, @Nullable MetricEventProcessingApi metricEventProcessingApi) {
        context.getClass();
    }
}
