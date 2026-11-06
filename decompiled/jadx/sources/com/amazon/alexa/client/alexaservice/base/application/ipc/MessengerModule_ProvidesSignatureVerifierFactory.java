package com.amazon.alexa.client.alexaservice.base.application.ipc;

import android.content.Context;
import com.amazon.alexa.utils.security.SignatureVerifier;
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
/* loaded from: classes17.dex */
public final class MessengerModule_ProvidesSignatureVerifierFactory implements Factory<SignatureVerifier> {
    private final Provider<Context> contextProvider;
    private final MessengerModule module;

    public MessengerModule_ProvidesSignatureVerifierFactory(MessengerModule messengerModule, Provider<Context> provider) {
        this.module = messengerModule;
        this.contextProvider = provider;
    }

    public static MessengerModule_ProvidesSignatureVerifierFactory create(MessengerModule messengerModule, Provider<Context> provider) {
        return new MessengerModule_ProvidesSignatureVerifierFactory(messengerModule, provider);
    }

    public static SignatureVerifier providesSignatureVerifier(MessengerModule messengerModule, Context context) {
        return (SignatureVerifier) Preconditions.checkNotNullFromProvides(messengerModule.providesSignatureVerifier(context));
    }

    @Override // javax.inject.Provider
    public SignatureVerifier get() {
        return providesSignatureVerifier(this.module, this.contextProvider.get());
    }
}
