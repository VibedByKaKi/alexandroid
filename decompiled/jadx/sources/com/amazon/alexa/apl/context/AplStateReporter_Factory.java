package com.amazon.alexa.apl.context;

import com.amazon.alexa.apl.sdk.AlexaClientSdkApis;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes16.dex */
public final class AplStateReporter_Factory implements Factory<AplStateReporter> {
    private final Provider<AlexaClientSdkApis> alexaClientSdkApisProvider;

    public AplStateReporter_Factory(Provider<AlexaClientSdkApis> provider) {
        this.alexaClientSdkApisProvider = provider;
    }

    public static AplStateReporter_Factory create(Provider<AlexaClientSdkApis> provider) {
        return new AplStateReporter_Factory(provider);
    }

    public static AplStateReporter newInstance(AlexaClientSdkApis alexaClientSdkApis) {
        return new AplStateReporter(alexaClientSdkApis);
    }

    @Override // javax.inject.Provider
    public AplStateReporter get() {
        return newInstance(this.alexaClientSdkApisProvider.get());
    }
}
