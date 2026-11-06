package com.amazon.alexa.viewmanagement.api;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.permissions.api.PermissionsService;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.viewmanagement.api.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface ViewControllerFactory<T extends ViewController> {
    default T createView(@NonNull Context context, @NonNull PermissionsService permissionsService, @NonNull RouteContext routeContext, @NonNull ViewManagerLoadingDelegate viewManagerLoadingDelegate) {
        return createView(context, permissionsService, routeContext, (ViewManagerEventNotifier) viewManagerLoadingDelegate);
    }

    @Deprecated
    default T createView(@NonNull Context context, @NonNull PermissionsService permissionsService, @NonNull RouteContext routeContext, @NonNull ViewManagerEventNotifier viewManagerEventNotifier) {
        return createView(context, routeContext, viewManagerEventNotifier);
    }

    @Deprecated
    default T createView(@NonNull Context context, @NonNull RouteContext routeContext, @NonNull ViewManagerEventNotifier viewManagerEventNotifier) {
        return null;
    }
}
