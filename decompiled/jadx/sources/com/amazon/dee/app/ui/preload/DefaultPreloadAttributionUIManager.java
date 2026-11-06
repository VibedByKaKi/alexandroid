package com.amazon.dee.app.ui.preload;

import android.content.Context;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.amazon.alexa.preload.attribution.PreloadAttributionManager;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.alexa.routing.data.RouteName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DefaultPreloadAttributionUIManager implements PreloadAttributionUIManager {
    private static final String TAG = "DefaultPreloadAttributionUIManager";
    private PreloadAttributionManager attributionManager;
    private Context context;
    private int headerClickCount = 0;
    private RoutingService routingService;

    public DefaultPreloadAttributionUIManager(Context context, RoutingService routingService, PreloadAttributionManager preloadAttributionManager) {
        this.context = context;
        this.routingService = routingService;
        this.attributionManager = preloadAttributionManager;
    }

    @Nullable
    public String getCurrentRoute() {
        RouteContext currentRoute = this.routingService.getCurrentRoute();
        if (currentRoute != null) {
            return currentRoute.getRoute().getName();
        }
        return null;
    }

    @Override // com.amazon.dee.app.ui.preload.PreloadAttributionUIManager
    public void onAppHeaderClicked() {
        if (!RouteName.HELP.equals(getCurrentRoute())) {
            this.headerClickCount = 0;
            return;
        }
        int i = this.headerClickCount + 1;
        this.headerClickCount = i;
        if (i == 5) {
            showAttributionTagToast();
            this.headerClickCount = 0;
        }
    }

    public void showAttributionTagToast() {
        String attributionTag = this.attributionManager.getAttributionTag();
        if (attributionTag == null) {
            return;
        }
        Toast.makeText(this.context, attributionTag, 1).show();
    }
}
