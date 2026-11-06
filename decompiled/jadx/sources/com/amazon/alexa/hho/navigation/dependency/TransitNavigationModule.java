package com.amazon.alexa.hho.navigation.dependency;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.hho.metrics.HHOMetricsService;
import com.amazon.alexa.hho.navigation.transit.location.LocationFilter;
import com.amazon.alexa.hho.navigation.transit.location.LocationFilterProtocol;
import com.amazon.alexa.hho.navigation.transit.session.metrics.SessionMetricHandler;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import com.amazon.alexa.sensor.api.location.LocationSensorAccess;
import com.amazon.dee.app.services.featureservice.Constants;
import com.dee.app.http.CoralService;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000bH\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0007¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/hho/navigation/dependency/TransitNavigationModule;", "", "<init>", "()V", "provideLocationFilter", "Lcom/amazon/alexa/hho/navigation/transit/location/LocationFilterProtocol;", "provideAlexaMobileFrameworkApis", "Lcom/amazon/alexa/api/compat/AlexaMobileFrameworkApisV2;", "context", "Landroid/content/Context;", "provideSessionHandlerThread", "Landroid/os/HandlerThread;", "provideSessionDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "thread", "provideLocationSensorAccess", "Lcom/amazon/alexa/sensor/api/location/LocationSensorAccess;", "provideCoralService", "Lcom/dee/app/http/CoralService;", "provideEventBus", "Lcom/amazon/alexa/eventbus/api/EventBus;", "provideSessionMetricHandler", "Lcom/amazon/alexa/hho/navigation/transit/session/metrics/SessionMetricHandler;", Constants.KEY_FEATURE_SERVICE, "Lcom/amazon/alexa/protocols/service/api/LazyComponent;", "Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;", "metrics", "Lcom/amazon/alexa/hho/metrics/HHOMetricsService;", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
@SourceDebugExtension({"SMAP\nTransitNavigationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitNavigationModule.kt\ncom/amazon/alexa/hho/navigation/dependency/TransitNavigationModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
/* loaded from: classes13.dex */
public final class TransitNavigationModule {
    @Provides
    @TransitScope
    @NotNull
    public final AlexaMobileFrameworkApisV2 provideAlexaMobileFrameworkApis(@NotNull Context context) {
        context.getClass();
        return new AlexaMobileFrameworkApisV2(context, "NavigationTransit", null, false, 12, null);
    }

    @Provides
    @TransitScope
    @NotNull
    public final CoralService provideCoralService() {
        return (CoralService) ChatData$$ExternalSyntheticOutline0.m(CoralService.class);
    }

    @Provides
    @TransitScope
    @NotNull
    public final EventBus provideEventBus() {
        return (EventBus) ChatData$$ExternalSyntheticOutline0.m(EventBus.class);
    }

    @Provides
    @TransitScope
    @NotNull
    public final LocationFilterProtocol provideLocationFilter() {
        return new LocationFilter();
    }

    @Provides
    @TransitScope
    @NotNull
    public final LocationSensorAccess provideLocationSensorAccess() {
        return (LocationSensorAccess) ChatData$$ExternalSyntheticOutline0.m(LocationSensorAccess.class);
    }

    @SessionDispatcher
    @Provides
    @NotNull
    @TransitScope
    public final CoroutineDispatcher provideSessionDispatcher(@SessionHandlerThread @NotNull HandlerThread thread) {
        thread.getClass();
        return HandlerDispatcherKt.from(new Handler(thread.getLooper()), "Navigation-SessionCoroutineDispatcher");
    }

    @Provides
    @NotNull
    @TransitScope
    @SessionHandlerThread
    public final HandlerThread provideSessionHandlerThread() {
        return DoubleList$$ExternalSyntheticOutline0.m("Navigation-SessionThread");
    }

    @Provides
    @TransitScope
    @Nullable
    public final SessionMetricHandler provideSessionMetricHandler(@NotNull LazyComponent<FeatureServiceV2> featureService, @NotNull HHOMetricsService metrics) {
        featureService.getClass();
        metrics.getClass();
        FeatureServiceV2 featureServiceV2 = featureService.get();
        if (Intrinsics.areEqual(featureServiceV2 != null ? featureServiceV2.getTreatmentAndRecordTrigger("ALEXA_HHO_MOBILE", "ALEXA_HHO_MOBILE_NAVIGATION_METRICS", "C") : null, "T1")) {
            return new SessionMetricHandler("", metrics);
        }
        return null;
    }
}
