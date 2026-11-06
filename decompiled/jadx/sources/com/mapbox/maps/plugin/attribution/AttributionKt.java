package com.mapbox.maps.plugin.attribution;

import com.amazon.alexa.routing.data.RouteName;
import com.mapbox.annotation.MapboxExperimental;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\u0003"}, d2 = {"isMapboxFeedback", "", "Lcom/mapbox/maps/plugin/attribution/Attribution;", "sdk-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class AttributionKt {
    @MapboxExperimental
    public static final boolean isMapboxFeedback(@NotNull Attribution attribution) {
        boolean contains$default;
        boolean contains$default2;
        boolean contains$default3;
        attribution.getClass();
        contains$default = StringsKt__StringsKt.contains$default(attribution.getUrl(), "mapbox.com", false, 2, (Object) null);
        if (!contains$default) {
            return false;
        }
        contains$default2 = StringsKt__StringsKt.contains$default(attribution.getUrl(), RouteName.FEEDBACK, false, 2, (Object) null);
        if (contains$default2) {
            return true;
        }
        contains$default3 = StringsKt__StringsKt.contains$default(attribution.getUrl(), "contribute", false, 2, (Object) null);
        return contains$default3;
    }
}
