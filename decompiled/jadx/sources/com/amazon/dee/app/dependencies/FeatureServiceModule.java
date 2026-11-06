package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.featureservice.api.FeatureServiceLifecycle;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.featureservice.api.FoundationFeatureServiceV2;
import com.amazon.alexa.featureservice.api.PlatformFeatureServiceV2;
import com.amazon.alexa.featureservice.configuration.FeatureServiceConfiguration;
import com.amazon.alexa.featureservice.dependencies.DaggerInitializer;
import com.amazon.alexa.featureservice.implementation.AlexaMobileAndroidFeatureServiceImpl;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.dee.app.services.network.interceptor.FeatureServiceReplaceableInterceptor;
import com.dee.app.http.CoralService;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import java.util.ArrayList;
import javax.inject.Named;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class FeatureServiceModule {
    private static final String TAG = "FeatureServiceModule";

    @Provides
    @ApplicationScope
    public AlexaMobileAndroidFeatureServiceImpl providesAlexaMobileAndroidFeatureServiceImpl(DaggerInitializer daggerInitializer) {
        return (AlexaMobileAndroidFeatureServiceImpl) daggerInitializer.getFeatureServiceComponent().getFeatureService();
    }

    @Provides
    @ApplicationScope
    public DaggerInitializer providesFsv2DaggerInitializer(Context context, Lazy<OkHttpClient> lazy, Lazy<EnvironmentService> lazy2, Lazy<EventBus> lazy3, Lazy<CoralService> lazy4, Lazy<IdentityService> lazy5, Lazy<Mobilytics> lazy6, Lazy<FeatureServiceV2> lazy7, @Named("CookieAuth") Interceptor interceptor, @Named("CookieRefresh") Interceptor interceptor2, @Named("FeatureRequest") Interceptor interceptor3, @Named("FeatureGzip") Interceptor interceptor4, @Named("NetworkLatency") Interceptor interceptor5, @Named("AcceptContentType") Interceptor interceptor6, @Named("AcceptLanguage") Interceptor interceptor7, @Named("ClientTimestamp") Interceptor interceptor8, @Named("UserAgentAppend") Interceptor interceptor9) {
        OkHttpClient.Builder newBuilder = lazy.get().newBuilder();
        ArrayList arrayList = new ArrayList();
        for (Interceptor interceptor10 : lazy.get().interceptors()) {
            if (!(interceptor10 instanceof FeatureServiceReplaceableInterceptor)) {
                arrayList.add(interceptor10);
            }
        }
        newBuilder.interceptors().clear();
        newBuilder.interceptors().addAll(arrayList);
        newBuilder.addInterceptor(interceptor3).addInterceptor(interceptor4).addInterceptor(interceptor).addInterceptor(interceptor2).addInterceptor(interceptor6).addInterceptor(interceptor7).addInterceptor(interceptor8).addInterceptor(interceptor5).addInterceptor(interceptor9).build();
        OkHttpClient build = newBuilder.build();
        lazy5.get().isRegistered(ServiceModule.TAG);
        return new DaggerInitializer(context, build, lazy2, lazy3, lazy6, lazy4);
    }

    @Provides
    @ApplicationScope
    public FeatureServiceConfiguration providesFsv2TestConfiguration(DaggerInitializer daggerInitializer) {
        return daggerInitializer.getFeatureServiceComponent().getConfiguration();
    }

    @Provides
    @ApplicationScope
    public FeatureServiceLifecycle provideFeatureServiceLifecycle(AlexaMobileAndroidFeatureServiceImpl alexaMobileAndroidFeatureServiceImpl) {
        return alexaMobileAndroidFeatureServiceImpl;
    }

    @Provides
    @ApplicationScope
    public FeatureServiceV2 provideFeatureServiceV2(PlatformFeatureServiceV2 platformFeatureServiceV2) {
        return platformFeatureServiceV2;
    }

    @Provides
    @ApplicationScope
    public PlatformFeatureServiceV2 providePlatformFeatureServiceV2(AlexaMobileAndroidFeatureServiceImpl alexaMobileAndroidFeatureServiceImpl) {
        return alexaMobileAndroidFeatureServiceImpl;
    }

    @Provides
    @ApplicationScope
    public FoundationFeatureServiceV2 providesFoundationFeatureServiceV2(AlexaMobileAndroidFeatureServiceImpl alexaMobileAndroidFeatureServiceImpl) {
        return alexaMobileAndroidFeatureServiceImpl;
    }
}
