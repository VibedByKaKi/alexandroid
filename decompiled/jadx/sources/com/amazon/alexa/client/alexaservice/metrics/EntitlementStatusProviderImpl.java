package com.amazon.alexa.client.alexaservice.metrics;

import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.frames.TopContactProvider$$ExternalSyntheticLambda0;
import com.amazon.alexa.client.alexaservice.features.bmclentitlement.BMCLEntitlementAuthority;
import com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatus;
import com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2;
import com.amazon.alexa.mobilytics.identity.MobilyticsUser;
import com.amazon.alexa.mobilytics.identity.message.eventBus.MobilyticsEventBusMessageType;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EntitlementStatusProviderImpl implements MobilyticsEntitlementStatusProviderV2 {
    private static final String TAG = "EntitlementStatusProviderImpl";
    private final BMCLEntitlementAuthority bmclEntitlementAuthority;
    private final List<MobilyticsEntitlementStatusProviderV2.Listener> listeners = new CopyOnWriteArrayList();

    @Inject
    public EntitlementStatusProviderImpl(BMCLEntitlementAuthority bMCLEntitlementAuthority) {
        this.bmclEntitlementAuthority = bMCLEntitlementAuthority;
        bMCLEntitlementAuthority.addUpdateListener(new TopContactProvider$$ExternalSyntheticLambda0(this, 26));
    }

    private MobilyticsEntitlementStatus createEntitlementStatusInstance(final boolean z) {
        return new MobilyticsEntitlementStatus() { // from class: com.amazon.alexa.client.alexaservice.metrics.EntitlementStatusProviderImpl.1
            @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatus
            public String benefitsEntitled() {
                return EntitlementStatusProviderImpl.this.bmclEntitlementAuthority.getEntitledBenefit();
            }

            @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatus
            public long status() {
                return z ? 0L : 1L;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListeners() {
        MobilyticsEntitlementStatus entitlementStatus = getEntitlementStatus();
        Iterator<MobilyticsEntitlementStatusProviderV2.Listener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onEntitlementStatusChanged(entitlementStatus);
            } catch (RuntimeException e) {
                Log.e(TAG, "Error notifying entitlement status listener", e);
            }
        }
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    public void addListener(MobilyticsEntitlementStatusProviderV2.Listener listener) {
        this.listeners.add(listener);
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    @Nullable
    public MobilyticsEntitlementStatus getEntitlementStatus() {
        return createEntitlementStatusInstance(this.bmclEntitlementAuthority.isBMCLEntitled());
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    public List<String> getPremiumBenefitLabels() {
        return this.bmclEntitlementAuthority.getPremiumBenefitLabels();
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    public void removeListener(MobilyticsEntitlementStatusProviderV2.Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    public void onMessageReceived(MobilyticsEventBusMessageType mobilyticsEventBusMessageType) {
    }

    @Override // com.amazon.alexa.mobilytics.identity.MobilyticsEntitlementStatusProviderV2
    public void onUserChanged(@Nullable MobilyticsUser mobilyticsUser) {
    }
}
