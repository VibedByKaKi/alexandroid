package com.amazon.alexa.client.alexaservice.networking.bootstrap;

import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.alexaservice.base.capabilities.discovery.DiscoveryFeatureChecker;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.feature.consumer.api.Treatment;
import com.amazon.alexa.utils.device.FireTabletUtils;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class ConnectionSetupFeatureChecker {
    private final DiscoveryFeatureChecker discoveryFeatureChecker;
    private final FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority;

    @Inject
    public ConnectionSetupFeatureChecker(FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority, DiscoveryFeatureChecker discoveryFeatureChecker) {
        this.featureFlagConfigurationAuthority = featureFlagConfigurationAuthority;
        this.discoveryFeatureChecker = discoveryFeatureChecker;
    }

    private Treatment nonBlockingConnectionSetupTreatment() {
        if (this.discoveryFeatureChecker.isApiGatewayEnabled() || FireTabletUtils.isFireOS() || FireTabletUtils.isKHTablet()) {
            return Treatment.C;
        }
        Treatment treatment = this.featureFlagConfigurationAuthority.getTreatment(Feature.ALEXA_VOICE_ANDROID_DOWNCHANNEL_PING_KEEP_ALIVE);
        return treatment != null ? treatment : Treatment.C;
    }

    public boolean isNonBlockingPublishEnabled() {
        return nonBlockingConnectionSetupTreatment() == Treatment.T2;
    }

    public boolean isNonBlockingSyncEnabled() {
        Treatment nonBlockingConnectionSetupTreatment = nonBlockingConnectionSetupTreatment();
        return nonBlockingConnectionSetupTreatment == Treatment.T1 || nonBlockingConnectionSetupTreatment == Treatment.T2;
    }
}
