package com.amazon.alexa.routing.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RoutePath {
    private final RouteContext from;
    private final int options;
    private final RouteContext to;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Options {
        public static final int BACK = 2;
        public static final int EXIT = 4;
        public static final int NAVIGATE = 1;
        public static final int NAVIGATE_WITHOUT_BACKSTACK = 0;
        public static final int NOTIFY_ONLY = 6;
        public static final int REPLACE = 5;
        public static final int UP = 3;
    }

    public RoutePath(RouteContext routeContext, RouteContext routeContext2, int i) {
        this.from = routeContext;
        this.to = routeContext2;
        this.options = i;
    }

    public RouteContext from() {
        return this.from;
    }

    public int getOptions() {
        return this.options;
    }

    public RouteContext to() {
        return this.to;
    }
}
