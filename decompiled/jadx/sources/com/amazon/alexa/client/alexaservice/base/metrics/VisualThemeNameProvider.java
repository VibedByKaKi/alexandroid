package com.amazon.alexa.client.alexaservice.base.metrics;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.alexaservice.base.capabilities.events.CapabilityRefreshEvent;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.features.bmclentitlement.BMCLEntitlementAuthority;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class VisualThemeNameProvider {

    @VisibleForTesting
    static final String VISUAL_THEME_MP = "mp";

    @VisibleForTesting
    static final String VISUAL_THEME_TRADITIONAL = "traditional";
    private final BMCLEntitlementAuthority bmclEntitlementAuthority;
    private volatile String cachedVisualTheme;
    private final FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority;

    @Inject
    public VisualThemeNameProvider(AlexaClientEventBus alexaClientEventBus, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority, BMCLEntitlementAuthority bMCLEntitlementAuthority) {
        this.featureFlagConfigurationAuthority = featureFlagConfigurationAuthority;
        this.bmclEntitlementAuthority = bMCLEntitlementAuthority;
        alexaClientEventBus.register(this);
    }

    private String resolve() {
        return ((this.featureFlagConfigurationAuthority.isEnabled("MULTIMODAL_ORCHESTRATOR", Feature.Alexa_Visual_Mobile_Android) || (this.featureFlagConfigurationAuthority.isEnabled("MOSAIC", Feature.Alexa_Visual_Mobile_Entitlement_Android) && this.bmclEntitlementAuthority.isVisualExperienceEntitled())) || this.featureFlagConfigurationAuthority.isEnabled(Feature.CONVERSATION_1_7_CAPABILITY)) ? "mp" : "traditional";
    }

    public synchronized String getVisualTheme() {
        if (this.cachedVisualTheme != null) {
            return this.cachedVisualTheme;
        }
        this.cachedVisualTheme = resolve();
        return this.cachedVisualTheme;
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public synchronized void on(CapabilityRefreshEvent capabilityRefreshEvent) {
        this.cachedVisualTheme = null;
    }
}
