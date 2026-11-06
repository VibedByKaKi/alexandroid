package com.amazon.dee.app.ui.main;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.common.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/amazon/dee/app/ui/main/IngressRouteSet;", "", "routes", "", "", "routePrefixes", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "getRoutes", "()Ljava/util/Set;", "getRoutePrefixes", "matches", "", Constants.BUNDLE_KEY_REACT_NATIVE_ROUTE_NAME, "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIngressRoutes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IngressRoutes.kt\ncom/amazon/dee/app/ui/main/IngressRouteSet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1761#2,3:80\n*S KotlinDebug\n*F\n+ 1 IngressRoutes.kt\ncom/amazon/dee/app/ui/main/IngressRouteSet\n*L\n17#1:80,3\n*E\n"})
/* loaded from: classes5.dex */
public final /* data */ class IngressRouteSet {

    @JvmField
    @NotNull
    public static final IngressRouteSet EMPTY = new IngressRouteSet(SetsKt.emptySet(), SetsKt.emptySet());

    @NotNull
    private final Set<String> routePrefixes;

    @NotNull
    private final Set<String> routes;

    public IngressRouteSet(@NotNull Set<String> set, @NotNull Set<String> set2) {
        set.getClass();
        set2.getClass();
        this.routes = set;
        this.routePrefixes = set2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IngressRouteSet copy$default(IngressRouteSet ingressRouteSet, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            set = ingressRouteSet.routes;
        }
        if ((i & 2) != 0) {
            set2 = ingressRouteSet.routePrefixes;
        }
        return ingressRouteSet.copy(set, set2);
    }

    @NotNull
    public final Set<String> component1() {
        return this.routes;
    }

    @NotNull
    public final Set<String> component2() {
        return this.routePrefixes;
    }

    @NotNull
    public final IngressRouteSet copy(@NotNull Set<String> routes, @NotNull Set<String> routePrefixes) {
        routes.getClass();
        routePrefixes.getClass();
        return new IngressRouteSet(routes, routePrefixes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IngressRouteSet)) {
            return false;
        }
        IngressRouteSet ingressRouteSet = (IngressRouteSet) other;
        return Intrinsics.areEqual(this.routes, ingressRouteSet.routes) && Intrinsics.areEqual(this.routePrefixes, ingressRouteSet.routePrefixes);
    }

    @NotNull
    public final Set<String> getRoutePrefixes() {
        return this.routePrefixes;
    }

    @NotNull
    public final Set<String> getRoutes() {
        return this.routes;
    }

    public int hashCode() {
        return this.routePrefixes.hashCode() + (this.routes.hashCode() * 31);
    }

    public final boolean matches(@NotNull String routeName) {
        boolean startsWith$default;
        routeName.getClass();
        if (this.routes.contains(routeName)) {
            return true;
        }
        Set<String> set = this.routePrefixes;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(routeName, (String) it2.next(), false, 2, null);
            if (startsWith$default) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "IngressRouteSet(routes=" + this.routes + ", routePrefixes=" + this.routePrefixes + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
