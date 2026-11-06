package com.amazon.deecomms.core;

import android.content.Context;
import com.amazon.deecomms.alexa.AlexaInterface;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class AlexaModule_ProvidesAlexaInterfaceFactory implements Factory<AlexaInterface> {
    private final Provider<Context> contextProvider;
    private final AlexaModule module;

    public AlexaModule_ProvidesAlexaInterfaceFactory(AlexaModule alexaModule, Provider<Context> provider) {
        this.module = alexaModule;
        this.contextProvider = provider;
    }

    public static AlexaModule_ProvidesAlexaInterfaceFactory create(AlexaModule alexaModule, Provider<Context> provider) {
        return new AlexaModule_ProvidesAlexaInterfaceFactory(alexaModule, provider);
    }

    public static AlexaInterface providesAlexaInterface(AlexaModule alexaModule, Context context) {
        return (AlexaInterface) Preconditions.checkNotNullFromProvides(alexaModule.providesAlexaInterface(context));
    }

    @Override // javax.inject.Provider
    public AlexaInterface get() {
        return providesAlexaInterface(this.module, this.contextProvider.get());
    }
}
