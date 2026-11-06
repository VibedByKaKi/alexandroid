package com.amazon.dee.app.benefits.ea;

import android.content.Context;
import com.amazon.alexa.benefits.api.BenefitsService;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("com.amazon.dee.app.dependencies.ApplicationScope")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class AlexaPlusEaBenefitsRefreshObserver_Factory implements Factory<AlexaPlusEaBenefitsRefreshObserver> {
    private final Provider<BenefitsService> benefitsServiceProvider;
    private final Provider<Context> contextProvider;

    public AlexaPlusEaBenefitsRefreshObserver_Factory(Provider<Context> provider, Provider<BenefitsService> provider2) {
        this.contextProvider = provider;
        this.benefitsServiceProvider = provider2;
    }

    public static AlexaPlusEaBenefitsRefreshObserver_Factory create(Provider<Context> provider, Provider<BenefitsService> provider2) {
        return new AlexaPlusEaBenefitsRefreshObserver_Factory(provider, provider2);
    }

    public static AlexaPlusEaBenefitsRefreshObserver newInstance(Context context, Lazy<BenefitsService> lazy) {
        return new AlexaPlusEaBenefitsRefreshObserver(context, lazy);
    }

    @Override // javax.inject.Provider
    public AlexaPlusEaBenefitsRefreshObserver get() {
        return newInstance(this.contextProvider.get(), DoubleCheck.lazy(this.benefitsServiceProvider));
    }
}
