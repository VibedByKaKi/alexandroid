package com.amazon.alexa.ra.core.ui.navigation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\tJ\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u000fH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/core/ui/navigation/PendingReturnRouteStore;", "", "<init>", "()V", "pendingRoute", "", "returnSurface", "Lcom/amazon/alexa/ra/core/ui/navigation/OnboardingReturnSurface;", "setPendingRoute", "", "route", "consumePendingRoute", "consumeReturnSurface", MetricsConstants.Method.CACHE_CLEAR, "shouldRestoreOobe", "", "consumeShouldRestoreOobe", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class PendingReturnRouteStore {

    @Nullable
    private static volatile String pendingRoute;

    @NotNull
    public static final PendingReturnRouteStore INSTANCE = new PendingReturnRouteStore();

    @NotNull
    private static volatile OnboardingReturnSurface returnSurface = OnboardingReturnSurface.NONE;
    public static final int $stable = 8;

    private PendingReturnRouteStore() {
    }

    public static /* synthetic */ void setPendingRoute$default(PendingReturnRouteStore pendingReturnRouteStore, String str, OnboardingReturnSurface onboardingReturnSurface, int i, Object obj) {
        if ((i & 2) != 0) {
            onboardingReturnSurface = OnboardingReturnSurface.NONE;
        }
        pendingReturnRouteStore.setPendingRoute(str, onboardingReturnSurface);
    }

    public final void clear() {
        pendingRoute = null;
        returnSurface = OnboardingReturnSurface.NONE;
    }

    @Nullable
    public final String consumePendingRoute() {
        String str = pendingRoute;
        pendingRoute = null;
        return str;
    }

    @NotNull
    public final OnboardingReturnSurface consumeReturnSurface() {
        OnboardingReturnSurface onboardingReturnSurface = returnSurface;
        returnSurface = OnboardingReturnSurface.NONE;
        return onboardingReturnSurface;
    }

    @Deprecated(message = "Use consumeReturnSurface()", replaceWith = @ReplaceWith(expression = "consumeReturnSurface() == OnboardingReturnSurface.LIVE_MODE_OOBE", imports = {}))
    public final boolean consumeShouldRestoreOobe() {
        return consumeReturnSurface() == OnboardingReturnSurface.LIVE_MODE_OOBE;
    }

    @Deprecated(message = "Use setPendingRoute(route, OnboardingReturnSurface)", replaceWith = @ReplaceWith(expression = "setPendingRoute(route, if (shouldRestoreOobe) OnboardingReturnSurface.LIVE_MODE_OOBE else OnboardingReturnSurface.NONE)", imports = {}))
    public final void setPendingRoute(@NotNull String route, boolean shouldRestoreOobe) {
        route.getClass();
        setPendingRoute(route, shouldRestoreOobe ? OnboardingReturnSurface.LIVE_MODE_OOBE : OnboardingReturnSurface.NONE);
    }

    public final void setPendingRoute(@NotNull String route, @NotNull OnboardingReturnSurface returnSurface2) {
        route.getClass();
        returnSurface2.getClass();
        pendingRoute = route;
        returnSurface = returnSurface2;
    }
}
