package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.policy;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Connectivity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class ConnectivityPolicy implements DeliveryPolicy {
    private static final boolean ALLOW_WAN_DEFAULT = true;
    private static final String ALLOW_WAN_KEY = "allowWANEventDelivery";
    private final Connectivity connectivity;
    private final AnalyticsContext context;
    private final boolean isWanAllowed;

    public ConnectivityPolicy(AnalyticsContext analyticsContext, boolean z) {
        this.context = analyticsContext;
        this.connectivity = analyticsContext.getSystem().getConnectivity();
        this.isWanAllowed = z;
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.policy.DeliveryPolicy
    public boolean isAllowed() {
        boolean z = this.context.getConfiguration().optBoolean(ALLOW_WAN_KEY, Boolean.TRUE).booleanValue() && this.isWanAllowed;
        if (this.connectivity.isConnected()) {
            return this.connectivity.hasWifi() || this.connectivity.hasWired() || (this.connectivity.hasWAN() && z);
        }
        return false;
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.policy.DeliveryPolicy
    public void handleDeliveryAttempt(boolean z) {
    }
}
