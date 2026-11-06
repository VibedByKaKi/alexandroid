package com.amazon.alexa.ra.features.windowresize;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.features.windowresize.NoOpWindowResizeClient;
import com.amazon.alexa.ra.core.features.windowresize.WindowResizeClient;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/ra/features/windowresize/WindowResizeClientProvider;", "", "<init>", "()V", MetricsConstants.Method.CACHE_GET, "Lcom/amazon/alexa/ra/core/features/windowresize/WindowResizeClient;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class WindowResizeClientProvider {
    public static final int $stable = 0;

    @NotNull
    public static final WindowResizeClientProvider INSTANCE = new WindowResizeClientProvider();

    private WindowResizeClientProvider() {
    }

    @NotNull
    public final WindowResizeClient get() {
        return new NoOpWindowResizeClient();
    }
}
