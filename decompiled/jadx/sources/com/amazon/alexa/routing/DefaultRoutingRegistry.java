package com.amazon.alexa.routing;

import android.util.ArrayMap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.amazon.alexa.routing.api.Route;
import com.amazon.alexa.routing.api.RouteAlias;
import com.amazon.alexa.routing.api.RouteMatch;
import com.amazon.alexa.routing.api.RouteMatcher;
import com.amazon.alexa.routing.api.RouteTemplate;
import com.amazon.alexa.routing.api.RoutingRegistry;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultRoutingRegistry implements RoutingRegistry {
    private static final String TAG = "DefaultRoutingRegistry";
    private boolean requiresSorting = false;
    private final Map<String, Route> routes = new ArrayMap();
    private final List<RouteMatcher> matchers = new ArrayList();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class RoutingRegister implements RoutingRegistry.Register {
        private Route route;

        public RoutingRegister(Route route) {
            this.route = route;
        }

        @Override // com.amazon.alexa.routing.api.RoutingRegistry.Register
        public RoutingRegistry.Register asRoot() {
            this.route.setRoot(true);
            return this;
        }

        @Override // com.amazon.alexa.routing.api.RoutingRegistry.Register
        public RoutingRegistry.Register doNotKeepInBackStack() {
            this.route.setDoNotKeepInBackStack(true);
            return this;
        }

        @Override // com.amazon.alexa.routing.api.RoutingRegistry.Register
        @Deprecated
        public RoutingRegistry.Register withHandleHeaderTitle() {
            this.route.setHandlesHeaderTitle(true);
            return this;
        }

        @Override // com.amazon.alexa.routing.api.RoutingRegistry.Register
        public RoutingRegistry.Register withHeaderTitle(@StringRes Integer num) {
            this.route.setHeaderTitle(num);
            return this;
        }

        @Override // com.amazon.alexa.routing.api.RoutingRegistry.Register
        public RoutingRegistry.Register withParent(String str) {
            this.route.setParent(str);
            return this;
        }

        @Override // com.amazon.alexa.routing.api.RoutingRegistry.Register
        public RoutingRegistry.Register withParentDefault(String str) {
            Route route = (Route) DefaultRoutingRegistry.this.routes.get(str);
            if (route == null) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Route '", str, "' is not registered."));
                return null;
            }
            route.setDefaultChild(this.route);
            this.route.setParent(str);
            return this;
        }

        @Override // com.amazon.alexa.routing.api.RoutingRegistry.Register
        public RoutingRegistry.Register withSingleChildRouteInBackStack() {
            this.route.setSingleChildRouteInBackStack(true);
            return this;
        }

        @Override // com.amazon.alexa.routing.api.RoutingRegistry.Register
        public RoutingRegistry.Register withTemplate(@NonNull String str) {
            this.route.setTemplate(new RouteTemplate(str));
            return this;
        }

        @Override // com.amazon.alexa.routing.api.RoutingRegistry.Register
        public RoutingRegistry.Register withTheme(Route.Theme theme) {
            this.route.setTheme(theme);
            return this;
        }
    }

    private synchronized void ensureSorted() {
        if (this.requiresSorting) {
            Collections.sort(this.matchers, new DefaultRoutingRegistry$$ExternalSyntheticLambda0());
            this.requiresSorting = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$ensureSorted$0(RouteMatcher routeMatcher, RouteMatcher routeMatcher2) {
        int priority = routeMatcher.getPriority();
        int priority2 = routeMatcher2.getPriority();
        if (priority > priority2) {
            return 1;
        }
        return priority == priority2 ? 0 : -1;
    }

    private void removeMatchers(@NonNull Route route) {
        ArrayList arrayList = new ArrayList();
        for (RouteMatcher routeMatcher : this.matchers) {
            if (routeMatcher.getRoute().equals(route)) {
                arrayList.add(routeMatcher);
            }
        }
        this.matchers.removeAll(arrayList);
    }

    @Override // com.amazon.alexa.routing.api.RoutingRegistry
    @NonNull
    public synchronized Route get(String str) {
        Route route;
        route = this.routes.get(str);
        if (route == null) {
            throw new IllegalArgumentException("Route '" + str + "' is not registered.");
        }
        return route;
    }

    @Override // com.amazon.alexa.routing.api.RoutingRegistry
    @Nullable
    public synchronized RouteMatch getByUrl(String str) {
        ensureSorted();
        Iterator<RouteMatcher> it2 = this.matchers.iterator();
        while (it2.hasNext()) {
            RouteMatch match = it2.next().match(str);
            if (match != null) {
                Log.i(TAG, "[ROUTE] FOUND: " + match.getRoute().getName());
                return match;
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public synchronized Iterator<Route> iterator() {
        return Collections.unmodifiableCollection(new ArrayList(this.routes.values())).iterator();
    }

    @Override // com.amazon.alexa.routing.api.RoutingRegistry
    public synchronized RoutingRegistry.Register register(@NonNull Route route) {
        try {
            route.getName();
            if (this.routes.containsKey(route.getName())) {
                route.getName();
            }
            this.routes.put(route.getName(), route);
            this.matchers.add(new DefaultRouteMatcher(route));
            Iterator<RouteAlias> it2 = route.getAliases().iterator();
            while (it2.hasNext()) {
                this.matchers.add(new DefaultRouteAliasMatcher(it2.next()));
            }
            this.requiresSorting = true;
        } catch (Throwable th) {
            throw th;
        }
        return new RoutingRegister(route);
    }

    @Override // com.amazon.alexa.routing.api.RoutingRegistry
    public synchronized void unregister(@NonNull Route route) {
        route.getName();
        this.routes.remove(route.getName());
        removeMatchers(route);
    }

    @Override // com.amazon.alexa.routing.api.RoutingRegistry
    @NonNull
    public RoutingRegistry.Register register(String str, int i) {
        return register(new Route(str, i));
    }
}
