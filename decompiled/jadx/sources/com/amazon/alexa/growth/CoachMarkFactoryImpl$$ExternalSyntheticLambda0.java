package com.amazon.alexa.growth;

import com.amazon.alexa.assetManagementService.api.AssetManagementService;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserverRegistrar;
import com.amazon.alexa.protocols.service.api.ComponentGetter;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.alexa.tasks.api.TaskManager;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class CoachMarkFactoryImpl$$ExternalSyntheticLambda0 implements Provider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComponentGetter f$0;

    public /* synthetic */ CoachMarkFactoryImpl$$ExternalSyntheticLambda0(ComponentGetter componentGetter, int i) {
        this.$r8$classId = i;
        this.f$0 = componentGetter;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Mobilytics lambda$new$0;
        Mobilytics lambda$new$1;
        TaskManager lambda$new$2;
        FeatureServiceV2 lambda$new$3;
        RoutingService lambda$new$4;
        MainActivityLifecycleObserverRegistrar lambda$new$5;
        Mobilytics lambda$new$02;
        Mobilytics lambda$new$12;
        TaskManager lambda$new$22;
        MainActivityLifecycleObserverRegistrar lambda$new$32;
        AssetManagementService lambda$new$42;
        FeatureServiceV2 lambda$new$52;
        RoutingService lambda$new$6;
        int i = this.$r8$classId;
        ComponentGetter componentGetter = this.f$0;
        switch (i) {
            case 0:
                lambda$new$0 = CoachMarkFactoryImpl.lambda$new$0(componentGetter);
                return lambda$new$0;
            case 1:
                lambda$new$1 = CoachMarkFactoryImpl.lambda$new$1(componentGetter);
                return lambda$new$1;
            case 2:
                lambda$new$2 = CoachMarkFactoryImpl.lambda$new$2(componentGetter);
                return lambda$new$2;
            case 3:
                lambda$new$3 = CoachMarkFactoryImpl.lambda$new$3(componentGetter);
                return lambda$new$3;
            case 4:
                lambda$new$4 = CoachMarkFactoryImpl.lambda$new$4(componentGetter);
                return lambda$new$4;
            case 5:
                lambda$new$5 = CoachMarkFactoryImpl.lambda$new$5(componentGetter);
                return lambda$new$5;
            case 6:
                lambda$new$02 = TourOverlayFactoryImpl.lambda$new$0(componentGetter);
                return lambda$new$02;
            case 7:
                lambda$new$12 = TourOverlayFactoryImpl.lambda$new$1(componentGetter);
                return lambda$new$12;
            case 8:
                lambda$new$22 = TourOverlayFactoryImpl.lambda$new$2(componentGetter);
                return lambda$new$22;
            case 9:
                lambda$new$32 = TourOverlayFactoryImpl.lambda$new$3(componentGetter);
                return lambda$new$32;
            case 10:
                lambda$new$42 = TourOverlayFactoryImpl.lambda$new$4(componentGetter);
                return lambda$new$42;
            case 11:
                lambda$new$52 = TourOverlayFactoryImpl.lambda$new$5(componentGetter);
                return lambda$new$52;
            default:
                lambda$new$6 = TourOverlayFactoryImpl.lambda$new$6(componentGetter);
                return lambda$new$6;
        }
    }
}
