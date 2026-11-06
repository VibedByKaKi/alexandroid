package com.amazon.dee.app.elements;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.amazon.alexa.routing.api.FABVisibility;
import com.amazon.alexa.routing.api.ParameterMapper;
import com.amazon.alexa.routing.api.Route;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class ReactRoute {
    static final String LAYER_FULL_SCREEN = "full-screen";
    static final String LAYER_FULL_WIDTH = "full-width";
    static final String LAYER_ROOT = "root";
    static final String ROUTE_ALIASES = "aliases";
    static final String ROUTE_FAB_VISIBILITY_OVERRIDE = "fabVisibilityOverride";
    static final String ROUTE_FEATURE = "feature";
    static final String ROUTE_LAYER = "layer";
    static final String ROUTE_MODULE = "module";
    static final String ROUTE_NAME = "name";
    static final String ROUTE_PARENT = "parent";
    static final String ROUTE_PRIORITY = "priority";
    static final String ROUTE_SUPPORTS_DELEGATED_PROFILE = "supportsDelegatedProfile";
    static final String ROUTE_TEMPLATE = "template";
    ArrayList<ReactRouteAlias> aliases = new ArrayList<>();
    String fabVisibilityOverride;
    String feature;
    String layer;
    String module;
    String name;
    String parent;
    int priority;
    boolean supportsDelegatedProfile;
    String uri;

    public ReactRoute(@NonNull Map map) {
        this.module = null;
        this.feature = null;
        this.parent = null;
        String str = map.containsKey("name") ? (String) map.get("name") : null;
        String str2 = map.containsKey("template") ? (String) map.get("template") : null;
        if (str == null || str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Malformed route registration: missing name or template");
            throw null;
        }
        this.name = str;
        this.uri = str2;
        this.parent = ElementsUtils.getOrDefault(map, "parent", (String) null);
        this.priority = ElementsUtils.getOrDefault(map, "priority", 50);
        this.feature = ElementsUtils.getOrDefault(map, "feature", (String) null);
        this.module = ElementsUtils.getOrDefault(map, "module", "unknown");
        this.layer = ElementsUtils.getOrDefault(map, ROUTE_LAYER, LAYER_ROOT);
        this.fabVisibilityOverride = ElementsUtils.getOrDefault(map, ROUTE_FAB_VISIBILITY_OVERRIDE, "default");
        this.supportsDelegatedProfile = ElementsUtils.getOrDefault(map, ROUTE_SUPPORTS_DELEGATED_PROFILE, false);
        if (map.containsKey(ROUTE_ALIASES)) {
            Iterator it2 = ((ArrayList) map.get(ROUTE_ALIASES)).iterator();
            while (it2.hasNext()) {
                this.aliases.add(new ReactRouteAlias((Map) it2.next()));
            }
        }
    }

    public static int resolveContentMode(String str) {
        if (LAYER_FULL_SCREEN.equals(str)) {
            return 2;
        }
        return (LAYER_FULL_WIDTH.equals(str) || LAYER_ROOT.equals(str)) ? 1 : 2;
    }

    public Route toRoute() {
        Route.Builder builder = new Route.Builder(this.name, 1);
        builder.withTemplate(this.uri);
        String str = this.parent;
        if (str != null) {
            builder.withParent(str);
        }
        String str2 = this.module;
        if (str2 != null) {
            builder.withModule(str2);
        }
        builder.withParent("main");
        builder.withContentMode(resolveContentMode(this.layer));
        builder.withFABVisibilityOverride(FABVisibility.parse(this.fabVisibilityOverride));
        builder.withPriority(this.priority);
        if (this.supportsDelegatedProfile) {
            builder.supportsDelegatedProfile();
        }
        Iterator<ReactRouteAlias> it2 = this.aliases.iterator();
        while (it2.hasNext()) {
            final ReactRouteAlias next = it2.next();
            builder.withAlias(next.uri, next.priority, new ParameterMapper() { // from class: com.amazon.dee.app.elements.ReactRoute$$ExternalSyntheticLambda0
                @Override // com.amazon.alexa.routing.api.ParameterMapper
                public final Bundle map(Bundle bundle) {
                    Bundle transformProps;
                    transformProps = ReactRouteAlias.this.transformProps(bundle);
                    return transformProps;
                }
            });
        }
        return builder.build();
    }
}
