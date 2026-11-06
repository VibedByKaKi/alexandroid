package com.amazon.dee.app.dependencies;

import android.webkit.CookieManager;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.identity.api.AccountService;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.routing.api.RoutingService;
import com.amazon.dee.app.services.coral.AcceptHeaderRequestInterceptor;
import com.amazon.dee.app.services.coral.AcceptLanguageRequestInterceptor;
import com.amazon.dee.app.services.coral.CookieAuthenticationRequestInterceptor;
import com.amazon.dee.app.services.coral.EnvironmentUrlResolver;
import com.amazon.dee.app.services.coral.HttpCoralAuthenticationResponseInterceptor;
import com.amazon.dee.app.services.coral.HttpCoralDefaultInterceptor;
import com.amazon.dee.app.services.coral.TimestampHeaderRequestInterceptor;
import com.amazon.dee.app.services.coral.UserAgentRequestInterceptor;
import com.dee.app.http.CoralService;
import com.dee.app.http.HttpClientResolver;
import com.dee.app.http.HttpCoralService;
import com.dee.app.http.UrlResolver;
import com.dee.app.metrics.MetricsServiceV2;
import com.google.gson.Gson;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class CoralModule {
    @Provides
    @ApplicationScope
    public CoralService provideCoralService(Lazy<CookieManager> lazy, HttpClientResolver httpClientResolver, Gson gson, UrlResolver urlResolver, Lazy<IdentityService> lazy2, Lazy<AccountService> lazy3, Lazy<RoutingService> lazy4, MetricsServiceV2 metricsServiceV2, Lazy<Mobilytics> lazy5, Lazy<FeatureServiceV2> lazy6, Lazy<EnvironmentService> lazy7) {
        HttpCoralService httpCoralService = new HttpCoralService(httpClientResolver, gson, urlResolver, metricsServiceV2);
        HttpCoralDefaultInterceptor httpCoralDefaultInterceptor = new HttpCoralDefaultInterceptor(lazy5, lazy6);
        httpCoralService.addResponseInterceptor(new HttpCoralAuthenticationResponseInterceptor(httpClientResolver, lazy2, lazy3, lazy4, lazy5));
        httpCoralService.addResponseInterceptor(httpCoralDefaultInterceptor);
        httpCoralService.addRequestInterceptor(new UserAgentRequestInterceptor());
        httpCoralService.addRequestInterceptor(new AcceptHeaderRequestInterceptor());
        httpCoralService.addRequestInterceptor(new TimestampHeaderRequestInterceptor());
        httpCoralService.addRequestInterceptor(new CookieAuthenticationRequestInterceptor(lazy, lazy2, lazy5, lazy6, lazy7));
        httpCoralService.addRequestInterceptor(new AcceptLanguageRequestInterceptor());
        httpCoralService.addRequestInterceptor(httpCoralDefaultInterceptor);
        return httpCoralService;
    }

    @Provides
    @ApplicationScope
    public UrlResolver provideUrlResolver(EnvironmentService environmentService) {
        return new EnvironmentUrlResolver(environmentService);
    }
}
