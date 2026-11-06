package com.amazon.alexa.capabilities;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent;
import com.amazon.alexa.client.core.componentstate.ComponentStateProvider;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class FireOsCapabilityAgentsModule {
    public static final String FIRE_OS_COMPONENT_STATE_PROVIDERS = "fire_os_component_state_providers";
    public static final String FIRE_OS_TABLET_CAPABILITIES = "fire_os_tablet_capabilities";

    @Inject
    @VisibleForTesting(otherwise = 2)
    Lazy<FireOSCapabilitiesMetricsListener> metricListener;

    @Provides
    @Named(FIRE_OS_TABLET_CAPABILITIES)
    public static Set<CapabilityAgent> providesFireOsCapabilityAgents(Context context, FireOSCapabilitiesMetricsListener fireOSCapabilitiesMetricsListener) {
        return Collections.EMPTY_SET;
    }

    @Provides
    @Named(FIRE_OS_COMPONENT_STATE_PROVIDERS)
    public static Set<ComponentStateProvider> providesFireOsComponentStateProviders(Context context) {
        return Collections.EMPTY_SET;
    }
}
