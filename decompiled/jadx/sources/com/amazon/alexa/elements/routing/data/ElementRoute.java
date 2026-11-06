package com.amazon.alexa.elements.routing.data;

import com.amazon.alexa.routing.api.FABVisibility;
import com.amazon.alexa.routing.api.Route;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ElementRoute {
    public static final int DEFAULT_ELEMENTS_PRIORITY = 50;
    public ElementAlias[] aliases;
    public final int contentMode;
    public FABVisibility fabVisibilityOverride;
    public final String module;
    public final String name;
    private final int priority;
    public final boolean supportsDelegatedProfile;
    public final String template;

    public ElementRoute(String str, String str2, int i, String str3, int i2, boolean z) {
        this.fabVisibilityOverride = FABVisibility.DEFAULT;
        this.name = str;
        this.priority = i2;
        this.template = str2;
        this.contentMode = i;
        this.module = str3;
        this.supportsDelegatedProfile = z;
    }

    public Route buildRoute() {
        Route.Builder withModule = new Route.Builder(this.name, 1).withPriority(this.priority).asRoot().withParent("main").withTemplate(this.template).withContentMode(this.contentMode).withModule(this.module);
        if (this.supportsDelegatedProfile) {
            withModule = withModule.supportsDelegatedProfile();
        }
        FABVisibility fABVisibility = this.fabVisibilityOverride;
        if (fABVisibility != null) {
            withModule = withModule.withFABVisibilityOverride(fABVisibility);
        }
        ElementAlias[] elementAliasArr = this.aliases;
        if (elementAliasArr != null) {
            for (ElementAlias elementAlias : elementAliasArr) {
                withModule = elementAlias.priority != null ? withModule.withAlias(elementAlias.getTemplate(), elementAlias.getPriority()) : withModule.withAlias(elementAlias.getTemplate());
            }
        }
        return withModule.build();
    }

    public ElementRoute setAliases(ElementAlias... elementAliasArr) {
        this.aliases = elementAliasArr;
        return this;
    }

    public ElementRoute setFabVisibilityOverride(String str) {
        this.fabVisibilityOverride = FABVisibility.parse(str);
        return this;
    }

    public ElementRoute(String str, String str2, int i, String str3, boolean z) {
        this(str, str2, i, str3, 50, z);
    }

    public ElementRoute(String str, String str2, int i, String str3, int i2) {
        this(str, str2, i, str3, i2, false);
    }

    public ElementRoute(String str, String str2, int i, String str3) {
        this(str, str2, i, str3, 50);
    }
}
