package com.amazon.alexa.client.alexaservice.base.capabilities.discovery;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.utils.device.FireTabletUtils;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class DiscoveryFeatureChecker {

    @VisibleForTesting
    static final String BETA_APP_PACKAGE_NAME = "com.amazon.dee.app.beta";

    @VisibleForTesting
    static final String SAMPLE_APP_PACKAGE_NAME = "com.amazon.alexa.sampleapp";
    private final FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority;
    private final boolean isAppEligible;
    private final boolean isBetaAppEligible;

    @Inject
    public DiscoveryFeatureChecker(Context context, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority) {
        this.isAppEligible = isAppEligible(context);
        this.isBetaAppEligible = isBetaApp(context);
        this.featureFlagConfigurationAuthority = featureFlagConfigurationAuthority;
    }

    private static boolean isAppEligible(Context context) {
        return context.getPackageName().equals(SAMPLE_APP_PACKAGE_NAME);
    }

    private static boolean isBetaApp(Context context) {
        return context.getPackageName().equals("com.amazon.dee.app.beta");
    }

    private boolean isV3Enabled() {
        if (FireTabletUtils.isKHTablet() && this.featureFlagConfigurationAuthority.isEnabled("KH_TABLET_ALEXA", Feature.ALEXA_KH_TABLET_V3_DISCOVERY_BLOCK)) {
            return false;
        }
        return (FireTabletUtils.isKHTablet() && this.featureFlagConfigurationAuthority.isEnabled("KH_TABLET_ALEXA", Feature.ALEXA_KH_TABLET_V3_DISCOVERY)) || this.isAppEligible || this.isBetaAppEligible || this.featureFlagConfigurationAuthority.isEnabled(Feature.ALEXA_VOX_ANDROID_V3_PROD);
    }

    public boolean isApiGatewayEnabled() {
        return isV3Enabled();
    }

    public boolean isSpeechRecognizerUpgraded() {
        return isV3Enabled();
    }

    public boolean isSpeechSynthesizerUpgraded() {
        return isV3Enabled();
    }

    public boolean isV3PublishEnabled() {
        return isV3Enabled();
    }
}
