package com.amazon.alexa.client.alexaservice.base.capabilities;

import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.utils.device.FireTabletUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class CardStudioGate {
    private CardStudioGate() {
    }

    public static boolean isEnabled(FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority) {
        if (featureFlagConfigurationAuthority.isEnabled("ALEXA_MOBILE_HOME_FRONTEND", Feature.ALEXA_MOBILE_CARD_STUDIO_ANDROID)) {
            return true;
        }
        return FireTabletUtils.isKHTablet() && featureFlagConfigurationAuthority.isEnabled("ALEXA_MOBILE_HOME_FRONTEND", Feature.ALEXA_MOBILE_CARD_STUDIO_KH);
    }
}
