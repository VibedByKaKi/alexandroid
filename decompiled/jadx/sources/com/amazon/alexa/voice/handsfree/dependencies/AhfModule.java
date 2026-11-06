package com.amazon.alexa.voice.handsfree.dependencies;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.settings.WakeWordSettingsManagerProvider;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.UVRModule;
import com.amazon.alexa.handsfree.protocols.utils.AudioRoutingUtil;
import com.amazon.alexa.handsfree.protocols.utils.VoiceAppStatusProvider;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.PersonIdProvider;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class AhfModule {
    private final Context mApplicationContext;

    public AhfModule(Context context) {
        this.mApplicationContext = context;
    }

    @AhfScope
    @Provides
    public Context provideApplicationContext() {
        return this.mApplicationContext;
    }

    @AhfScope
    @Provides
    public AudioRoutingUtil provideAudioRoutingUtil(@NonNull Context context, @NonNull VoiceAppStatusProvider voiceAppStatusProvider) {
        return new AudioRoutingUtil(context, voiceAppStatusProvider, WakeWordSettingsManagerProvider.getInstance());
    }

    @AhfScope
    @Provides
    public ComponentRegistry provideComponentRegistry() {
        return ComponentRegistry.getInstance();
    }

    @AhfScope
    @Provides
    public EventBus provideEventBus(ComponentRegistry componentRegistry) {
        return (EventBus) componentRegistry.get(EventBus.class).get();
    }

    @AhfScope
    @Provides
    public FeatureServiceV2 provideFeatureServiceV2(ComponentRegistry componentRegistry) {
        return (FeatureServiceV2) componentRegistry.get(FeatureServiceV2.class).get();
    }

    @Nullable
    @AhfScope
    @Provides
    public IdentityService provideIdentityService(ComponentRegistry componentRegistry) {
        return (IdentityService) componentRegistry.get(IdentityService.class).orNull();
    }

    @AhfScope
    @Provides
    public Initializer provideInitializer() {
        return InitializerProvider.getInitializer();
    }

    @Nullable
    @AhfScope
    @Provides
    public PersonIdProvider providePersonIdProvider(ComponentRegistry componentRegistry) {
        return (PersonIdProvider) componentRegistry.get(PersonIdProvider.class).orNull();
    }

    @AhfScope
    @Provides
    public UVRModule provideUVRModule() {
        return UVRModule.INSTANCE;
    }
}
