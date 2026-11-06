package com.amazon.alexa.pmi.implementation.taplatency;

import android.view.Window;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/taplatency/HookedWindow;", "", "window", "Landroid/view/Window;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/view/Window$OnFrameMetricsAvailableListener;", "<init>", "(Landroid/view/Window;Landroid/view/Window$OnFrameMetricsAvailableListener;)V", "getWindow", "()Landroid/view/Window;", "getListener", "()Landroid/view/Window$OnFrameMetricsAvailableListener;", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class HookedWindow {

    @NotNull
    private final Window.OnFrameMetricsAvailableListener listener;

    @NotNull
    private final Window window;

    public HookedWindow(@NotNull Window window, @NotNull Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        window.getClass();
        onFrameMetricsAvailableListener.getClass();
        this.window = window;
        this.listener = onFrameMetricsAvailableListener;
    }

    @NotNull
    public final Window.OnFrameMetricsAvailableListener getListener() {
        return this.listener;
    }

    @NotNull
    public final Window getWindow() {
        return this.window;
    }
}
