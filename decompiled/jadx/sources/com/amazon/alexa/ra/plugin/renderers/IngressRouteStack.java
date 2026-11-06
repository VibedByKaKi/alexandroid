package com.amazon.alexa.ra.plugin.renderers;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mobilytics.event.serializer.handlers.RouteDataHandler;
import com.amazon.alexa.ra.core.ui.navigation.RaRoute;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/plugin/renderers/IngressRouteStack;", "", "<init>", "()V", "shouldApplyAsRoot", "", "incomingRoute", "", RouteDataHandler.CURRENT_ROUTE_KEY, "currentIsRoot", "standaloneHost", "AlexaMobileAndroidConversationCX_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class IngressRouteStack {
    public static final int $stable = 0;

    @NotNull
    public static final IngressRouteStack INSTANCE = new IngressRouteStack();

    private IngressRouteStack() {
    }

    public final boolean shouldApplyAsRoot(@NotNull String incomingRoute, @Nullable String currentRoute, boolean currentIsRoot, boolean standaloneHost) {
        incomingRoute.getClass();
        if (standaloneHost) {
            return false;
        }
        return Intrinsics.areEqual(incomingRoute, RaRoute.CONVERSATION_HISTORY_FULL_ROUTE) ? !Intrinsics.areEqual(currentRoute, RaRoute.CONVERSATION_HISTORY_FULL_ROUTE) : Intrinsics.areEqual(currentRoute, RaRoute.CONVERSATION_HISTORY_FULL_ROUTE) && currentIsRoot;
    }
}
