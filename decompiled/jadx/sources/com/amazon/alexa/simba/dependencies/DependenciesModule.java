package com.amazon.alexa.simba.dependencies;

import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.feedback.client.FeedbackClient;
import com.amazon.alexa.metis.client.MetisClient;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import com.amazon.alexa.simba.client.SimbaClient;
import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/simba/dependencies/DependenciesModule;", "", "()V", "provideFeedbackClient", "Lcom/amazon/alexa/feedback/client/FeedbackClient;", "gson", "Lcom/google/gson/Gson;", "provideMetisClient", "Lcom/amazon/alexa/metis/client/MetisClient;", "provideSimbaClient", "Lcom/amazon/alexa/simba/client/SimbaClient;", "providesDeviceInformationProvider", "Lcom/amazon/alexa/simba/dependencies/DeviceInformationProvider;", "providesGson", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes19.dex */
public final class DependenciesModule {
    @Provides
    @Singleton
    @NotNull
    public final FeedbackClient provideFeedbackClient(@NotNull Gson gson) {
        gson.getClass();
        return new FeedbackClient(gson);
    }

    @Provides
    @Singleton
    @NotNull
    public final MetisClient provideMetisClient(@NotNull Gson gson) {
        gson.getClass();
        return new MetisClient(gson);
    }

    @Provides
    @Singleton
    @NotNull
    public final SimbaClient provideSimbaClient(@NotNull Gson gson) {
        gson.getClass();
        return new SimbaClient(gson);
    }

    @Provides
    @Singleton
    @NotNull
    public final DeviceInformationProvider providesDeviceInformationProvider() {
        LazyComponent lazy = ComponentRegistry.getInstance().getLazy(DeviceInformation.class);
        lazy.getClass();
        LazyComponent lazy2 = ComponentRegistry.getInstance().getLazy(EnvironmentService.class);
        lazy2.getClass();
        return new DeviceInformationProvider(lazy, lazy2);
    }

    @Provides
    @Singleton
    @NotNull
    public final Gson providesGson() {
        return new Gson();
    }
}
