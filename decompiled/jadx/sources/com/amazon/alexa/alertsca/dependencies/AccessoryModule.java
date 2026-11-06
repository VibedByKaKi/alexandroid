package com.amazon.alexa.alertsca.dependencies;

import com.amazon.alexa.accessories.protocols.ConnectedAccessoryInquirer;
import com.amazon.alexa.accessory.sco.ScoPrioritizer;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes16.dex */
public class AccessoryModule {
    @Provides
    @Singleton
    public ConnectedAccessoryInquirer providesConnectedAccessoryInquirer() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(ConnectedAccessoryInquirer.class).get();
        return (ConnectedAccessoryInquirer) obj;
    }

    @Provides
    @Singleton
    public ScoPrioritizer providesScoPrioritizer() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(ScoPrioritizer.class).get();
        return (ScoPrioritizer) obj;
    }
}
