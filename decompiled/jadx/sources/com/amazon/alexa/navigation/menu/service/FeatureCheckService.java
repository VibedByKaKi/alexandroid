package com.amazon.alexa.navigation.menu.service;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.navigation.menu.constants.FeatureConstants;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class FeatureCheckService {
    private static final String TAG = "FeatureCheckService";
    private static FeatureCheckService instance;
    FeatureServiceV2 featureServiceV2;

    private FeatureCheckService(FeatureServiceV2 featureServiceV2) {
        this.featureServiceV2 = featureServiceV2;
    }

    public static FeatureCheckService getInstance() {
        if (instance == null) {
            instance = new FeatureCheckService((FeatureServiceV2) ComponentRegistry.getInstance().getLazy(FeatureServiceV2.class).get());
        }
        return instance;
    }

    public static void resetForTest() {
        instance = null;
    }

    public boolean bottomBarLaunched() {
        return this.featureServiceV2.hasAccess("AlexaMobileFoundationAndroid", "BOTTOM_NAV_BAR_REDESIGN_LAUNCH", false);
    }

    public boolean hasAccessToYourProfileIngress() {
        return this.featureServiceV2.hasAccess("ALEXA_IDENTITY_EXPERIENCE_FRONTEND", "ALEXA_PROFILE_HOME_HEADER_INGRESS_ANDROID", false);
    }

    public boolean isAppRedesignEnabled() {
        return this.featureServiceV2.hasAccess("ALEXA_MOBILE_HOME_FRONTEND", "ALEXA_CH_HOME_AGENT_FORWARD_PROTOTYPE_ANDROID", false);
    }

    public boolean isAppRedesignEnabledForNonPremiumUsers() {
        return this.featureServiceV2.hasAccess("ALEXA_MOBILE_HOME_FRONTEND", "ALEXA_CH_HOME_AGENT_FORWARD_ON_CLASSIC_ANDROID_EXPERIMENT", false);
    }

    public boolean isBranchHighValueActionEnabled() {
        return this.featureServiceV2.hasAccess("ALEXA_MOBILE_GROWTH", "BRANCH_HVA_ANDROID", false);
    }

    public boolean isSeeMoreCoachMarkEnabled() {
        return this.featureServiceV2.hasAccess("COACH_MARKS_ANDROID", false);
    }

    public boolean isSimplifiedEarlyAccessEnabled() {
        return this.featureServiceV2.hasAccess("ALEXA_SUBSCRIPTIONS_GROWTH_MOBILE", FeatureConstants.Features.SIMPLIFIED_EARLY_ACCESS, false);
    }

    public boolean shouldShowAPlusPersistentUpsell() {
        return this.featureServiceV2.getTreatmentAndRecordTrigger("ALEXA_MOBILE_GROWTH", FeatureConstants.Features.ALEXA_MOBILE_AMI_APLUS_PERSISTENT_UPSELL_ANDROID, "C").equals("T1");
    }

    public boolean shouldShowCalendar() {
        return this.featureServiceV2.hasAccess("ALEXA_MOBILE_MECS_STAY_ORGANIZED_ANDROID", false);
    }

    public boolean shouldShowCommunicationAndEntertainment() {
        return true;
    }

    public boolean shouldShowDevicesCardTile() {
        return this.featureServiceV2.hasAccess("ALEXA_MOBILE_HOME_FRONTEND", "ALEXA_CH_HOME_AGENT_FORWARD_DYNAMIC_CARDS_ANDROID", false);
    }

    public boolean shouldShowSmartHomeForwardMoreMenu() {
        return true;
    }

    public boolean shouldShowUpdatedAlexaMark() {
        return "T1".equals(this.featureServiceV2.getTreatment("AlexaMobileFoundationAndroid", "ALEXA_MOBILE_DYNAMIC_APP_ICON", "C"));
    }
}
