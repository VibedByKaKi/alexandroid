package com.amazon.dee.app.elements;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.amazon.alexa.routing.api.RouteParameter;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.dee.app.services.logging.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class ElementsRouteHolder {
    private static final String TAG = Log.tag((Class<?>) ElementsRouteHolder.class);

    @NonNull
    public final String uri;

    public ElementsRouteHolder(String str) {
        if (str.startsWith(ElementsUtils.V2_PREFIX)) {
            this.uri = str.substring(3);
        } else {
            Log.w(TAG, "Uri passed to route holder does not have V2 prefix.");
            this.uri = str;
        }
    }

    public RoutingService.RoutingBuilder configure(RoutingService.RoutingBuilder routingBuilder) {
        return routingBuilder.with(RouteParameter.ROUTE, Uri.encode(this.uri)).with("name", ElementsUtils.V2_PREFIX + this.uri);
    }

    public String toNativeUri(boolean z) {
        StringBuilder sb = new StringBuilder(ElementsUtils.V2_PREFIX);
        String str = this.uri;
        if (z) {
            str = Uri.encode(str);
        }
        sb.append(str);
        return sb.toString();
    }

    public String toNativeUri() {
        return toNativeUri(true);
    }
}
