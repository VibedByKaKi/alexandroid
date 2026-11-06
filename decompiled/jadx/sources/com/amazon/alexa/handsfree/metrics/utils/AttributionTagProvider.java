package com.amazon.alexa.handsfree.metrics.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.preload.attribution.AttributionTagListener;
import com.amazon.alexa.preload.attribution.DefaultPreloadAttributionManager;
import com.amazon.alexa.preload.attribution.FeatureQueryBridge;
import com.amazon.alexa.preload.attribution.PreloadAttributionManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AttributionTagProvider implements AttributionTagListener {
    private static AttributionTagProvider sInstance;
    private boolean mComputedAttributionTag = false;
    private final List<AttributionTagListener> mListeners = new ArrayList();
    private PreloadAttributionManager mPreloadAttributionManager;

    @VisibleForTesting
    public AttributionTagProvider(@NonNull PreloadAttributionManager preloadAttributionManager) {
        this.mPreloadAttributionManager = preloadAttributionManager;
    }

    private void callListeners() {
        Iterator<AttributionTagListener> it2 = this.mListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onAttributionTagComputed();
        }
        this.mListeners.clear();
    }

    public static synchronized AttributionTagProvider getInstance() {
        AttributionTagProvider attributionTagProvider;
        synchronized (AttributionTagProvider.class) {
            try {
                if (sInstance == null) {
                    sInstance = new AttributionTagProvider();
                }
                attributionTagProvider = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return attributionTagProvider;
    }

    public void addListener(@NonNull AttributionTagListener attributionTagListener) {
        if (this.mComputedAttributionTag) {
            attributionTagListener.onAttributionTagComputed();
        } else {
            this.mListeners.add(attributionTagListener);
        }
    }

    @Nullable
    public String getAttributionTag() {
        return this.mPreloadAttributionManager.getAttributionTag();
    }

    public boolean hasComputedAttributionTag() {
        return this.mComputedAttributionTag;
    }

    public void initialize(@NonNull Context context) {
        this.mPreloadAttributionManager = new DefaultPreloadAttributionManager(context, this, new FeatureQueryBridge() { // from class: com.amazon.alexa.handsfree.metrics.utils.AttributionTagProvider.1
            private final FeatureServiceV2 featureServiceV2 = (FeatureServiceV2) Automotive$$ExternalSyntheticOutline0.m(FeatureServiceV2.class);

            @Override // com.amazon.alexa.preload.attribution.FeatureQueryBridge
            public boolean isActive(String str) {
                FeatureServiceV2 featureServiceV2 = this.featureServiceV2;
                if (featureServiceV2 == null) {
                    return false;
                }
                return featureServiceV2.hasAccess(str, false);
            }
        });
    }

    @Override // com.amazon.alexa.preload.attribution.AttributionTagListener
    public void onAttributionTagComputed() {
        this.mComputedAttributionTag = true;
        callListeners();
    }

    private AttributionTagProvider() {
    }
}
