package com.amazon.deecomms.core;

import androidx.annotation.NonNull;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.api.CommsDynamicFeature;
import com.amazon.deecomms.common.Constants;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import rx.subjects.BehaviorSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class FeatureFlagManager {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, FeatureFlagManager.class);
    private final EnumMap<CommsDynamicFeature, BehaviorSubject<Boolean>> featureFlags = new EnumMap<>(CommsDynamicFeature.class);
    private final Lazy<FeatureServiceV2> featureServiceV2Lazy;

    @Inject
    public FeatureFlagManager(Lazy<FeatureServiceV2> lazy) {
        for (CommsDynamicFeature commsDynamicFeature : CommsDynamicFeature.values()) {
            this.featureFlags.put((EnumMap<CommsDynamicFeature, BehaviorSubject<Boolean>>) commsDynamicFeature, (CommsDynamicFeature) BehaviorSubject.create(Boolean.FALSE));
        }
        this.featureServiceV2Lazy = lazy;
    }

    private boolean hasAccess(String str, boolean z) {
        return this.featureServiceV2Lazy.get().hasAccess(str, z);
    }

    private boolean isNamespaceFeatureEnabled(@NonNull CommsDynamicFeature commsDynamicFeature, boolean z) {
        return z ? hasAccess(commsDynamicFeature.getNameSpace(), commsDynamicFeature.getPrimaryFeatureName(), false) || isCommsAllFeatureEnabled() : hasAccess(commsDynamicFeature.getNameSpace(), commsDynamicFeature.getPrimaryFeatureName(), false);
    }

    public ArrayList<String> getAllFeatures() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<CommsDynamicFeature> it2 = this.featureFlags.keySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getPrimaryFeatureName());
        }
        return arrayList;
    }

    public boolean isCommsAllFeatureEnabled() {
        return hasAccess(CommsDynamicFeature.COMMS_ALL_FEATURES.getPrimaryFeatureName(), false) || hasAccess(CommsDynamicFeature.COMMS_ALL_FEATURES_NEW.getPrimaryFeatureName(), false);
    }

    public boolean isFeatureEnabled(@NonNull CommsDynamicFeature commsDynamicFeature, boolean z) {
        return commsDynamicFeature.hasNameSpace() ? isNamespaceFeatureEnabled(commsDynamicFeature, z) : z ? hasAccess(commsDynamicFeature.getPrimaryFeatureName(), false) || isCommsAllFeatureEnabled() : hasAccess(commsDynamicFeature.getPrimaryFeatureName(), false);
    }

    public void observeFeature(@NonNull CommsDynamicFeature commsDynamicFeature, FeatureServiceV2.FeatureUpdateListener featureUpdateListener) {
        boolean hasNameSpace = commsDynamicFeature.hasNameSpace();
        Lazy<FeatureServiceV2> lazy = this.featureServiceV2Lazy;
        if (hasNameSpace) {
            lazy.get().observeFeature(commsDynamicFeature.getNameSpace(), commsDynamicFeature.getPrimaryFeatureName(), featureUpdateListener);
        } else {
            lazy.get().observeFeature(commsDynamicFeature.getPrimaryFeatureName(), featureUpdateListener);
        }
    }

    public void setFeature(@NonNull CommsDynamicFeature commsDynamicFeature, @NonNull Boolean bool) {
        LOG.d("setting feature: " + commsDynamicFeature + " to " + bool);
        this.featureFlags.get(commsDynamicFeature).onNext(bool);
    }

    public void setFeatures(EnumMap<CommsDynamicFeature, Boolean> enumMap) {
        LOG.d("setting features: " + enumMap);
        for (Map.Entry<CommsDynamicFeature, Boolean> entry : enumMap.entrySet()) {
            if (entry.getValue() != null) {
                setFeature(entry.getKey(), entry.getValue());
            }
        }
    }

    private boolean hasAccess(String str, String str2, boolean z) {
        return this.featureServiceV2Lazy.get().hasAccess(str, str2, z);
    }

    public boolean isFeatureEnabled(@NonNull CommsDynamicFeature commsDynamicFeature) {
        return isFeatureEnabled(commsDynamicFeature, true);
    }

    public boolean isFeatureEnabled(@NonNull List<CommsDynamicFeature> list) {
        for (int i = 0; i < list.size(); i++) {
            if (hasAccess(list.get(i).getPrimaryFeatureName(), false)) {
                return true;
            }
        }
        return false;
    }
}
