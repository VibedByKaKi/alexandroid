package com.amazon.alexa.client.alexaservice.features.fireos;

import com.amazon.alexa.capabilities.FireOSCapabilitiesMetricsListener;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import dagger.Module;
import dagger.Provides;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class FireOSCapabilitiesModule {
    private static final String TAG = "FireOSCapabilitiesModule";

    @Provides
    @Inject
    public FireOSCapabilitiesMetricsListener fireOSCapabilitiesMetricsListener(AlexaClientEventBus alexaClientEventBus) {
        return new FireOSCapabilitiesListener(alexaClientEventBus);
    }
}
