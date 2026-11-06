package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/OpenNavigationLink;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "android", "Lcom/amazon/alexa/ra/core/data/model/NavigationRoute;", "ios", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/NavigationRoute;Lcom/amazon/alexa/ra/core/data/model/NavigationRoute;)V", "getAndroid", "()Lcom/amazon/alexa/ra/core/data/model/NavigationRoute;", "getIos", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class OpenNavigationLink implements JSONConvertible {
    public static final int $stable = 0;

    @SerializedName("android")
    @Nullable
    private final NavigationRoute android;

    @SerializedName("ios")
    @Nullable
    private final NavigationRoute ios;

    public OpenNavigationLink(@Nullable NavigationRoute navigationRoute, @Nullable NavigationRoute navigationRoute2) {
        this.android = navigationRoute;
        this.ios = navigationRoute2;
    }

    public static /* synthetic */ OpenNavigationLink copy$default(OpenNavigationLink openNavigationLink, NavigationRoute navigationRoute, NavigationRoute navigationRoute2, int i, Object obj) {
        if ((i & 1) != 0) {
            navigationRoute = openNavigationLink.android;
        }
        if ((i & 2) != 0) {
            navigationRoute2 = openNavigationLink.ios;
        }
        return openNavigationLink.copy(navigationRoute, navigationRoute2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final NavigationRoute getAndroid() {
        return this.android;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final NavigationRoute getIos() {
        return this.ios;
    }

    @NotNull
    public final OpenNavigationLink copy(@Nullable NavigationRoute android2, @Nullable NavigationRoute ios) {
        return new OpenNavigationLink(android2, ios);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenNavigationLink)) {
            return false;
        }
        OpenNavigationLink openNavigationLink = (OpenNavigationLink) other;
        return Intrinsics.areEqual(this.android, openNavigationLink.android) && Intrinsics.areEqual(this.ios, openNavigationLink.ios);
    }

    @Nullable
    public final NavigationRoute getAndroid() {
        return this.android;
    }

    @Nullable
    public final NavigationRoute getIos() {
        return this.ios;
    }

    public int hashCode() {
        NavigationRoute navigationRoute = this.android;
        int hashCode = (navigationRoute == null ? 0 : navigationRoute.hashCode()) * 31;
        NavigationRoute navigationRoute2 = this.ios;
        return hashCode + (navigationRoute2 != null ? navigationRoute2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OpenNavigationLink(android=" + this.android + ", ios=" + this.ios + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
