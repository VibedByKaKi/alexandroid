package com.amazon.commscore.dependencies;

import android.content.Context;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.ComponentGetter;
import dagger.internal.DoubleCheck;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class BaseComponentWrapper<T> {
    protected CommsCoreComponent commsCoreComponent;

    public BaseComponentWrapper(ComponentGetter componentGetter, Context context) {
        DaggerInitializer.initialize(context, DoubleCheck.lazy(componentGetter.get(IdentityService.class)), DoubleCheck.lazy(componentGetter.get(Mobilytics.class)), DoubleCheck.lazy(componentGetter.get(EventBus.class)), DoubleCheck.lazy(componentGetter.get(EnvironmentService.class)));
        this.commsCoreComponent = DaggerInitializer.get();
    }

    public abstract T getImplementation();
}
