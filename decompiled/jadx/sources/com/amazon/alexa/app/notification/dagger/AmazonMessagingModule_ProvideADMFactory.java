package com.amazon.alexa.app.notification.dagger;

import android.content.Context;
import com.amazon.device.messaging.ADM;
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
/* loaded from: classes.dex */
public final class AmazonMessagingModule_ProvideADMFactory implements Factory<ADM> {
    private final Provider<Context> contextProvider;
    private final AmazonMessagingModule module;

    public AmazonMessagingModule_ProvideADMFactory(AmazonMessagingModule amazonMessagingModule, Provider<Context> provider) {
        this.module = amazonMessagingModule;
        this.contextProvider = provider;
    }

    public static AmazonMessagingModule_ProvideADMFactory create(AmazonMessagingModule amazonMessagingModule, Provider<Context> provider) {
        return new AmazonMessagingModule_ProvideADMFactory(amazonMessagingModule, provider);
    }

    public static ADM provideADM(AmazonMessagingModule amazonMessagingModule, Context context) {
        return (ADM) Preconditions.checkNotNullFromProvides(amazonMessagingModule.provideADM(context));
    }

    @Override // javax.inject.Provider
    public ADM get() {
        return provideADM(this.module, this.contextProvider.get());
    }
}
