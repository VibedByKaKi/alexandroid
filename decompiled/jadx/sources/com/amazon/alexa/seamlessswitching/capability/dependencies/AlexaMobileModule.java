package com.amazon.alexa.seamlessswitching.capability.dependencies;

import android.content.Context;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class AlexaMobileModule {
    private final Context appContext;

    public AlexaMobileModule(Context context) {
        this.appContext = context.getApplicationContext();
    }

    @Provides
    public Context providesContext() {
        return this.appContext.getApplicationContext();
    }

    @Provides
    public FeatureServiceV2 providesFeatureServiceV2() {
        Object obj;
        obj = ComponentRegistry.getInstance().getLazy(FeatureServiceV2.class).get();
        return (FeatureServiceV2) obj;
    }

    @Provides
    public LazyComponent<Mobilytics> providesMobilyticsLazy() {
        return ComponentRegistry.getInstance().getLazy(Mobilytics.class);
    }
}
