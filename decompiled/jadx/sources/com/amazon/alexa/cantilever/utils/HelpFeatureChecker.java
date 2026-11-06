package com.amazon.alexa.cantilever.utils;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class HelpFeatureChecker {
    private static final String HELP_FEATURE_GATE_NAME_SPACE = "HELP_AND_FEEDBACK";
    private static final String HOME_CHANNEL_NAMESPACE = "ALEXA_MOBILE_HOME_FRONTEND";
    private static final String TAG = "HelpFeatureChecker";
    private final Provider<FeatureServiceV2> featureServiceV2 = ComponentRegistry.getInstance().getLazy(FeatureServiceV2.class);

    private boolean evaluateTreatment(String str, HelpFeature helpFeature, WeblabTreatment weblabTreatment) {
        Provider<FeatureServiceV2> provider = this.featureServiceV2;
        if (provider == null || provider.get() == null) {
            Log.w(TAG, "FeatureServiceV2 is null");
            return false;
        }
        if (helpFeature == null || weblabTreatment == null) {
            Log.w(TAG, "HelpFeature or WeblabTreatment cannot be null");
            return false;
        }
        try {
            return weblabTreatment == WeblabTreatment.valueOf(this.featureServiceV2.get().getTreatmentAndRecordTrigger(str, helpFeature.getFeatureName(), WeblabTreatment.C_DEFAULT.name()));
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Invalid treatment value", e);
            return false;
        }
    }

    @VisibleForTesting
    public boolean checkFeatureAccess(@NonNull String str) {
        return hasFeatureAccess(str);
    }

    public boolean hasAccessToRedesignNonPremiumUser() {
        return this.featureServiceV2.get().hasAccess("ALEXA_MOBILE_HOME_FRONTEND", "ALEXA_CH_HOME_AGENT_FORWARD_ON_CLASSIC_ANDROID_EXPERIMENT", false);
    }

    public boolean hasAccessToRedesignPremiumUser() {
        return this.featureServiceV2.get().hasAccess("ALEXA_MOBILE_HOME_FRONTEND", "ALEXA_CH_HOME_AGENT_FORWARD_PROTOTYPE_ANDROID", false);
    }

    public boolean hasAccessToShareArticle() {
        return evaluateTreatment(HELP_FEATURE_GATE_NAME_SPACE, HelpFeature.SHARE_HELP_ARTICLE, WeblabTreatment.T1);
    }

    @VisibleForTesting
    public boolean hasFeatureAccess(@NonNull String str) {
        Provider<FeatureServiceV2> provider = this.featureServiceV2;
        if (provider != null && provider.get() != null) {
            return this.featureServiceV2.get().hasAccess(str, false);
        }
        Log.i(TAG, "FeatureServiceV2 cannot be null");
        return false;
    }

    public boolean hasFullscreenAccess() {
        return checkFeatureAccess("ALEXA_ANDROID_MAYDAY_CANTILEVER_FULL_SCREEN");
    }

    public boolean hasMSSPeerToPeerAccess() {
        return checkFeatureAccess("ALEXA_MOBILE_ANDROID_TARAZED_P2P_VIEW");
    }
}
