package com.amazon.alexa.capabilityagent.deviceproximity.dagger;

import android.content.Context;
import com.amazon.alexa.accessoryclient.client.accessories.Accessories;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApis;
import com.amazon.alexa.capabilityagent.deviceproximity.common.util.Logger;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/dagger/ServiceModule;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "provideAccessories", "Lcom/amazon/alexa/accessoryclient/client/accessories/Accessories;", "providesAmfApis", "Lcom/amazon/alexa/api/compat/AlexaMobileFrameworkApis;", "provideCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideLazyFeatureService", "Lcom/amazon/alexa/protocols/service/api/LazyComponent;", "Lcom/amazon/alexa/featureservice/api/FeatureServiceV2;", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes17.dex */
public final class ServiceModule {

    @NotNull
    private final Context context;

    public ServiceModule(@NotNull Context context) {
        context.getClass();
        this.context = context;
        Logger.INSTANCE.init(context);
    }

    @Provides
    @Singleton
    @NotNull
    public final Accessories provideAccessories() {
        return Accessories.Shared.INSTANCE.get(this.context);
    }

    @Provides
    @Singleton
    @NotNull
    public final CoroutineDispatcher provideCoroutineDispatcher() {
        return Dispatchers.getIO();
    }

    @Provides
    @Singleton
    @NotNull
    public final LazyComponent<FeatureServiceV2> provideLazyFeatureService() {
        LazyComponent<FeatureServiceV2> lazy = ComponentRegistry.getInstance().getLazy(FeatureServiceV2.class);
        lazy.getClass();
        return lazy;
    }

    @Provides
    @Singleton
    @NotNull
    public final AlexaMobileFrameworkApis providesAmfApis() {
        return new AlexaMobileFrameworkApis(this.context, Logger.TAG);
    }
}
