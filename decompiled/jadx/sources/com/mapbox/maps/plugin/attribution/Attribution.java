package com.mapbox.maps.plugin.attribution;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/mapbox/maps/plugin/attribution/Attribution;", "", "title", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "titleAbbreviated", "getTitleAbbreviated", "getUrl", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Attribution {

    @NotNull
    public static final String ABOUT_MAPS_URL = "https://www.mapbox.com/about/maps/";

    @NotNull
    public static final String ABOUT_TELEMETRY_URL = "https://www.mapbox.com/telemetry/";

    @NotNull
    public static final String GEOFENCING = "Mapbox Geofencing";

    @NotNull
    public static final String GEOFENCING_URL_MARKER = "geofencing_url_marker";

    @NotNull
    public static final String OSM = "OpenStreetMap";

    @NotNull
    public static final String OSM_ABBR = "OSM";

    @NotNull
    public static final String PRIVACY_POLICY = "Mapbox Privacy Policy";

    @NotNull
    public static final String PRIVACY_POLICY_URL = "https://www.mapbox.com/legal/privacy#product-privacy-policy/";

    @NotNull
    public static final String TELEMETRY_SETTINGS = "Mapbox Telemetry";

    @NotNull
    private final String title;

    @NotNull
    private final String url;

    public Attribution(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.url = str2;
    }

    public static /* synthetic */ Attribution copy$default(Attribution attribution, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attribution.title;
        }
        if ((i & 2) != 0) {
            str2 = attribution.url;
        }
        return attribution.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final Attribution copy(@NotNull String title, @NotNull String url) {
        title.getClass();
        url.getClass();
        return new Attribution(title, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Attribution)) {
            return false;
        }
        Attribution attribution = (Attribution) other;
        return Intrinsics.areEqual(this.title, attribution.title) && Intrinsics.areEqual(this.url, attribution.url);
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTitleAbbreviated() {
        return Intrinsics.areEqual(this.title, OSM) ? OSM_ABBR : this.title;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + (this.title.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Attribution(title=");
        sb.append(this.title);
        sb.append(", url=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.url, sb);
    }
}
