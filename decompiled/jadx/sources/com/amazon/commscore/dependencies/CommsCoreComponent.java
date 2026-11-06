package com.amazon.commscore.dependencies;

import android.content.Context;
import com.amazon.commscore.api.commsbridge.CommsBridgeService;
import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import com.amazon.commscore.commsbridge.dependencies.CommsBridgeServiceModule;
import com.amazon.commscore.commsidentity.dependencies.CommsIdentityModule;
import com.amazon.commscore.dependencies.annotation.ApplicationContext;
import com.amazon.commscore.metrics.dependencies.MetricServiceModule;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {ApplicationModule.class, MetricServiceModule.class, CommsIdentityModule.class, CommsBridgeServiceModule.class, AlexaModule.class})
@Singleton
/* loaded from: classes20.dex */
public interface CommsCoreComponent {
    CommsBridgeService getCommsBridgeService();

    @ApplicationContext
    Context getContext();

    AlexaCommsCoreIdentityService getIdentityService();

    AlexaCommsCoreMetricsService getMetricsService();
}
