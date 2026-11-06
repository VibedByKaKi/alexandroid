package com.amazon.alexa.featureservice.service;

import android.util.Log;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.featureservice.util.FeatureServiceNamespace;
import com.amazon.alexa.featureservice.util.FeatureSubscriptionMap;
import java.util.Set;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class FeatureSubscriptionManager {
    private static final String TAG = "FeatureSubscriptionManager";
    private FeatureSubscriptionMap featureSubscriptionMap;

    @Inject
    public FeatureSubscriptionManager(FeatureSubscriptionMap featureSubscriptionMap) {
        this.featureSubscriptionMap = featureSubscriptionMap;
    }

    public synchronized void addSubscriber(String str, FeatureServiceV2.FeatureUpdateListener featureUpdateListener) {
        this.featureSubscriptionMap.add(str, featureUpdateListener);
    }

    public synchronized void notifySingleSubscriber(String str, FeatureServiceV2.FeatureUpdateListener featureUpdateListener) {
        try {
            String[] splitFeatureIdentifier = FeatureServiceNamespace.splitFeatureIdentifier(str);
            if (splitFeatureIdentifier.length > 1) {
                featureUpdateListener.onFeatureUpdate(splitFeatureIdentifier[0], splitFeatureIdentifier[1]);
            } else {
                featureUpdateListener.onFeatureUpdate(splitFeatureIdentifier[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void notifySubscribers(String str) {
        Set<FeatureServiceV2.FeatureUpdateListener> subscribers = this.featureSubscriptionMap.getSubscribers(str);
        if (subscribers != null) {
            for (FeatureServiceV2.FeatureUpdateListener featureUpdateListener : subscribers) {
                if (featureUpdateListener != null) {
                    try {
                        notifySingleSubscriber(str, featureUpdateListener);
                    } catch (Exception e) {
                        Log.e(TAG, "Exception while notifying subscriber", e);
                    }
                }
            }
        }
    }

    public synchronized void removeSubscriber(FeatureServiceV2.FeatureUpdateListener featureUpdateListener) {
        this.featureSubscriptionMap.remove(featureUpdateListener);
    }

    public synchronized void reset() {
        this.featureSubscriptionMap.clear();
    }
}
