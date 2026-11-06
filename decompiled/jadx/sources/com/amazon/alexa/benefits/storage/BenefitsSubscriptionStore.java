package com.amazon.alexa.benefits.storage;

import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.amazon.alexa.benefits.api.constants.BenefitsEvent;
import com.amazon.alexa.benefits.api.models.BenefitsObserver;
import com.amazon.alexa.benefits.api.models.GetBenefitsEntitlementResponse;
import com.amazon.alexa.benefits.api.models.Subscription;
import com.amazon.alexa.benefits.util.LogUtils;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import dagger.Lazy;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class BenefitsSubscriptionStore {
    private static final String TAG = "com.amazon.alexa.benefits.storage.BenefitsSubscriptionStore";
    private final Lazy<EventBus> eventBus;

    @VisibleForTesting
    final ArrayMap<String, ArraySet<BenefitsObserver>> subscriberMap = new ArrayMap<>();

    @Inject
    public BenefitsSubscriptionStore(Lazy<EventBus> lazy) {
        this.eventBus = lazy;
    }

    public synchronized void clearStore() {
        LogUtils.d(TAG, "Clearing subscriber map");
        this.subscriberMap.clear();
        this.eventBus.get().lambda$getPublisher$0(new Message.Builder().setEventType(BenefitsEvent.BENEFITS_SUBSCRIBERS_CLEARED).build());
    }

    public synchronized Set<String> getSubscriptionKeySet() {
        return this.subscriberMap.keySet();
    }

    public synchronized void notifyGetBenefitsEntitlement(String str, GetBenefitsEntitlementResponse getBenefitsEntitlementResponse) {
        try {
            ArraySet<BenefitsObserver> arraySet = this.subscriberMap.get(str);
            if (arraySet != null) {
                LogUtils.d(TAG, "Notifying subscribers of changes to entitlement status for benefit " + str);
                Iterator<BenefitsObserver> it2 = arraySet.iterator();
                while (it2.hasNext()) {
                    it2.next().notifyIfChanged(getBenefitsEntitlementResponse);
                }
            } else {
                LogUtils.d(TAG, "There were no subscribers to notify for benefit " + str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Subscription subscribe(final String str, final BenefitsObserver benefitsObserver) {
        LogUtils.d(TAG, "Subscribing observer to benefit " + str);
        ArraySet<BenefitsObserver> orDefault = this.subscriberMap.getOrDefault(str, new ArraySet<>());
        orDefault.add(benefitsObserver);
        this.subscriberMap.put(str, orDefault);
        return new Subscription() { // from class: com.amazon.alexa.benefits.storage.BenefitsSubscriptionStore.1
            @Override // com.amazon.alexa.benefits.api.models.Subscription
            public void unsubscribe() {
                BenefitsSubscriptionStore.this.unsubscribe(str, benefitsObserver);
            }
        };
    }

    public synchronized void unsubscribe(String str, BenefitsObserver benefitsObserver) {
        ArraySet<BenefitsObserver> arraySet = this.subscriberMap.get(str);
        if (arraySet == null) {
            LogUtils.d(TAG, "Unable to unsubscribe observer for benefit " + str + "; observer not found");
            return;
        }
        LogUtils.d(TAG, "Unsubscribing observer from benefit " + str);
        arraySet.remove(benefitsObserver);
        if (arraySet.isEmpty()) {
            this.subscriberMap.remove(str);
        }
    }
}
