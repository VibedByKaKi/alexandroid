package com.amazon.alexa.sharing.util;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class FeatureServiceUtil {
    public static final String CWA_MOBILE_SHARE_SHEET = "CWA_MOBILE_SHARE_SHEET";
    public static final String EXTERNAL_SHARE_TO_SHARE_SHEET = "MOBILE_SOCIAL_SHARE_TO_NON_ALEXA";
    public static final String SHARING_COMO_21693_EXTERNAL_LINK_ANDROID = "SHARING_COMO_21693_EXTERNAL_LINK_ANDROID";
    public static final String SHARING_COMO_22247_ANDROID_SHEET = "SHARING_COMO_22247_ANDROID_SHEET";
    FeatureServiceV2 featureServiceV2;

    @Inject
    public FeatureServiceUtil(FeatureServiceV2 featureServiceV2) {
        this.featureServiceV2 = featureServiceV2;
    }

    public boolean isCWAShareSheetEnabled() {
        return this.featureServiceV2.hasAccess("CWA_MOBILE_SHARE_SHEET", false);
    }

    public boolean isLinkSharingEnabled() {
        return this.featureServiceV2.hasAccess("SHARING_COMO_21693_EXTERNAL_LINK_ANDROID", false);
    }

    public boolean isShareSheetEnabled() {
        return this.featureServiceV2.hasAccess("SHARING_COMO_22247_ANDROID_SHEET", false);
    }
}
