package com.amazon.alexa.presence;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.facebook.react.modules.appstate.AppStateModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class FeatureGating {
    private static final String ALEXA_PRESENCE_MOBILE_NAMESPACE = "ALEXA_PRESENCE_MOBILE";
    public static final String C_TREATMENT = "C";
    public static final String T1_TREATMENT = "T1";
    private static final Logger LOG = LoggerFactory.getLogger((Class<?>) FeatureGating.class);
    private static final FeatureGating INSTANCE = new FeatureGating();

    public static String getTreatment(String str) {
        return INSTANCE.getTreatmentForFeature(str);
    }

    public static boolean isEnabled(String str) {
        return INSTANCE.isFeatureEnabled(str);
    }

    public String getTreatmentForFeature(String str) {
        FeatureServiceV2 featureServiceV2 = (FeatureServiceV2) Automotive$$ExternalSyntheticOutline0.m(FeatureServiceV2.class);
        if (featureServiceV2 != null) {
            return featureServiceV2.getTreatmentAndRecordTrigger(ALEXA_PRESENCE_MOBILE_NAMESPACE, str, "C");
        }
        LOG.info("Unable to retrieve treatment for {}. Defaulting to C treatment", str);
        return "C";
    }

    public boolean isFeatureEnabled(String str) {
        FeatureServiceV2 featureServiceV2 = (FeatureServiceV2) Automotive$$ExternalSyntheticOutline0.m(FeatureServiceV2.class);
        if (featureServiceV2 == null) {
            LOG.info("Unable to check feature status {}, FeatureQuery is currently unavailable.", str);
            return false;
        }
        boolean hasAccess = featureServiceV2.hasAccess(str, false);
        LOG.debug("Feature {} is {}.", str, hasAccess ? AppStateModule.APP_STATE_ACTIVE : "inactive");
        return hasAccess;
    }
}
