package com.amazon.alexa.mobilytics.integration.ama;

import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.identity.MobilyticsRoute;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MobilyticsRouteImpl implements MobilyticsRoute {
    private final String currentRoute;
    private final long numberOfRoutes;
    private final String previousRoute;

    public MobilyticsRouteImpl(@NonNull String str, @NonNull String str2, long j) {
        this.currentRoute = str;
        this.previousRoute = str2;
        this.numberOfRoutes = j;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsRoute
    @NonNull
    public String currentRoute() {
        return this.currentRoute;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsRoute
    public long numberOfRouteChanges() {
        return this.numberOfRoutes;
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsRoute
    @NonNull
    public String previousRoute() {
        return this.previousRoute;
    }
}
