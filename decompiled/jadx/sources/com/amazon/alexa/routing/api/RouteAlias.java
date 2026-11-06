package com.amazon.alexa.routing.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RouteAlias {
    private final ParameterMapper parameterMap;
    private final int priority;
    private final Route target;
    private final RouteTemplate template;

    public RouteAlias(Route route, String str) {
        this.target = route;
        this.template = new RouteTemplate(str);
        this.parameterMap = null;
        this.priority = route.getPriority();
    }

    public ParameterMapper getParameterMap() {
        return this.parameterMap;
    }

    public int getPriority() {
        return this.priority;
    }

    public Route getTarget() {
        return this.target;
    }

    public RouteTemplate getTemplate() {
        return this.template;
    }

    public RouteAlias(Route route, String str, int i) {
        this.target = route;
        this.template = new RouteTemplate(str);
        this.parameterMap = null;
        this.priority = i;
    }

    public RouteAlias(Route route, String str, ParameterMapper parameterMapper) {
        this.target = route;
        this.template = new RouteTemplate(str);
        this.parameterMap = parameterMapper;
        this.priority = route.getPriority();
    }

    public RouteAlias(Route route, String str, int i, ParameterMapper parameterMapper) {
        this.target = route;
        this.template = new RouteTemplate(str);
        this.parameterMap = parameterMapper;
        this.priority = i;
    }
}
