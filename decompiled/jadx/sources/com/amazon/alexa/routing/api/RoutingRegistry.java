package com.amazon.alexa.routing.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.amazon.alexa.routing.api.Route;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface RoutingRegistry extends Iterable<Route> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Register {
        Register asRoot();

        Register doNotKeepInBackStack();

        @Deprecated
        Register withHandleHeaderTitle();

        Register withHeaderTitle(@StringRes Integer num);

        Register withParent(String str);

        Register withParentDefault(String str);

        Register withSingleChildRouteInBackStack();

        Register withTemplate(@NonNull String str);

        Register withTheme(Route.Theme theme);
    }

    @NonNull
    Route get(String str);

    @Nullable
    RouteMatch getByUrl(String str);

    Register register(@NonNull Route route);

    @NonNull
    Register register(String str, int i);

    void unregister(@NonNull Route route);
}
