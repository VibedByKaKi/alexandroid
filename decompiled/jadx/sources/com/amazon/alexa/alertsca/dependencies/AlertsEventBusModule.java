package com.amazon.alexa.alertsca.dependencies;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import org.greenrobot.eventbus.EventBus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes16.dex */
public class AlertsEventBusModule {
    @Provides
    @Singleton
    public EventBus providesEventBus() {
        return EventBus.getDefault();
    }
}
