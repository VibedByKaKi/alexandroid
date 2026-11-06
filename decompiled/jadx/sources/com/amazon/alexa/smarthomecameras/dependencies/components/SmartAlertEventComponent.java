package com.amazon.alexa.smarthomecameras.dependencies.components;

import android.content.Context;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.alexa.smarthomecameras.dependencies.modules.ContextModule;
import com.amazon.alexa.smarthomecameras.dependencies.modules.RoutingServiceModule;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {ContextModule.class, RoutingServiceModule.class})
@Singleton
/* loaded from: classes19.dex */
public interface SmartAlertEventComponent {
    Context context();

    RoutingService routingService();
}
