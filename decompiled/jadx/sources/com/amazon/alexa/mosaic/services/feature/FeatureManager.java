package com.amazon.alexa.mosaic.services.feature;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.mosaic.factories.DefaultComponentFactory;
import com.amazon.apl.android.Content$$ExternalSyntheticLambda0;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class FeatureManager implements FeatureServiceV2.FeatureUpdateListener {
    private static final String TAG = "FeatureManager";
    private static volatile FeatureManager instance;
    private final Map<Feature, Boolean> featureMap;
    private final FeatureServiceV2 featureService;
    private final Handler handler;

    private FeatureManager() {
        this(new DefaultComponentFactory().createFeatureService(), new Handler(Looper.getMainLooper()));
    }

    public static FeatureManager getInstance() {
        if (instance == null) {
            synchronized (FeatureManager.class) {
                try {
                    if (instance == null) {
                        instance = new FeatureManager();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private void initializeFeatureMap() {
        for (Feature feature : Feature.values()) {
            updateFeatureStatus(feature);
        }
    }

    private void updateFeatureStatus(Feature feature) {
        this.featureMap.put(feature, Boolean.valueOf(isEnabled(this.featureService.getTreatmentAndRecordTrigger(feature.getNamespace(), feature.getName(), "C_DEFAULT"))));
    }

    public boolean isEnabled(Feature feature) {
        Boolean bool = this.featureMap.get(feature);
        return bool != null && bool.booleanValue();
    }

    @Override // com.amazon.alexa.featureservice.api.FeatureServiceV2.FeatureUpdateListener
    public void onFeatureUpdate(String str, String str2) {
        this.handler.post(new Content$$ExternalSyntheticLambda0(this, 12, str, str2));
    }

    public void startObserving() {
        for (Feature feature : Feature.values()) {
            this.featureService.observeFeature(feature.getNamespace(), feature.getName(), this);
        }
    }

    public void stopObserving() {
        this.featureService.unsubscribe(this);
    }

    @Override // com.amazon.alexa.featureservice.api.FeatureServiceV2.FeatureUpdateListener
    public void onFeatureUpdate(String str) {
        AppLaunchChecker$$ExternalSyntheticOutline0.m("on feature update with name: ", str, TAG);
    }

    private boolean isEnabled(String str) {
        return (str.equals("C") || str.equals("C_DEFAULT")) ? false : true;
    }

    @VisibleForTesting
    public FeatureManager(FeatureServiceV2 featureServiceV2, Handler handler) {
        this.featureMap = new HashMap();
        this.featureService = featureServiceV2;
        this.handler = handler;
        initializeFeatureMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateFeatureStatus, reason: merged with bridge method [inline-methods] */
    public void lambda$onFeatureUpdate$0(String str, String str2) {
        Feature fromNamespaceAndName = Feature.fromNamespaceAndName(str, str2);
        if (fromNamespaceAndName == null || !this.featureMap.containsKey(fromNamespaceAndName)) {
            return;
        }
        updateFeatureStatus(fromNamespaceAndName);
    }
}
