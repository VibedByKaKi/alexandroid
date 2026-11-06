package com.amazon.dee.app.framework;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.amazon.alexa.routing.api.Route;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.routing.api.RoutingAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class ApplicationRoutingAdapter implements RoutingAdapter {
    SimpleArrayMap<String, RoutingAdapter.RouteConfiguration> configurations;

    public ApplicationRoutingAdapter() {
        SimpleArrayMap<String, RoutingAdapter.RouteConfiguration> simpleArrayMap = new SimpleArrayMap<>();
        this.configurations = simpleArrayMap;
        simpleArrayMap.put("main", RoutingAdapter.RouteConfiguration.enter().andNavigate());
    }

    @Override // com.amazon.alexa.routing.api.RoutingAdapter
    @Nullable
    public RoutingAdapter.RouteConfiguration getConfiguration(@NonNull Route route) {
        return this.configurations.get(route.getName());
    }

    @Override // com.amazon.alexa.routing.api.RoutingAdapter
    public int getId() {
        return 4;
    }

    @Override // com.amazon.alexa.routing.api.RoutingAdapter
    public void navigate(@NonNull RouteContext routeContext, Runnable runnable) {
        runnable.run();
    }

    @Override // com.amazon.alexa.routing.api.RoutingAdapter
    public void exit() {
    }

    @Override // com.amazon.alexa.routing.api.RoutingAdapter
    public void reenter() {
    }

    @Override // com.amazon.alexa.routing.api.RoutingAdapter
    public void push(RouteContext routeContext) {
    }

    @Override // com.amazon.alexa.routing.api.RoutingAdapter
    public void replace(@NonNull RouteContext routeContext) {
    }

    @Override // com.amazon.alexa.routing.api.RoutingAdapter
    public void enter(@NonNull Route route, Route route2) {
    }

    @Override // com.amazon.alexa.routing.api.RoutingAdapter
    public void leave(@NonNull Route route, Route route2) {
    }
}
