package com.amazon.alexa.configservice.dependencies;

import android.content.Context;
import com.amazon.alexa.configservice.client.CloudfrontConfigClient;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import java.io.File;
import javax.inject.Singleton;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class NetworkModule {
    private static final int CACHE_SIZE = 5242880;
    private final Context context;

    public NetworkModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public CloudfrontConfigClient providesCloudfrontConfigClient(Lazy<OkHttpClient> lazy, Lazy<EnvironmentService> lazy2) {
        return new CloudfrontConfigClient(lazy, lazy2);
    }

    @Provides
    @Singleton
    public EnvironmentService providesEnvironmentService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(EnvironmentService.class).get();
        return (EnvironmentService) obj;
    }

    @Provides
    @Singleton
    public OkHttpClient providesOkHttpClient() {
        return new OkHttpClient().newBuilder().retryOnConnectionFailure(false).cache(new Cache(new File(this.context.getCacheDir(), "configsHttpCacheDir"), 5242880L)).build();
    }
}
