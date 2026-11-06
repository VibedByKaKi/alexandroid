package com.amazon.alexa.client.alexaservice.base.application.ipc;

import com.amazon.alexa.utils.security.SignatureVerifier;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MessageReceiverAuthority_Factory implements Factory<MessageReceiverAuthority> {
    private final Provider<ErrorReporter> errorReporterProvider;
    private final Provider<SignatureVerifier> signatureVerifierProvider;

    public MessageReceiverAuthority_Factory(Provider<SignatureVerifier> provider, Provider<ErrorReporter> provider2) {
        this.signatureVerifierProvider = provider;
        this.errorReporterProvider = provider2;
    }

    public static MessageReceiverAuthority_Factory create(Provider<SignatureVerifier> provider, Provider<ErrorReporter> provider2) {
        return new MessageReceiverAuthority_Factory(provider, provider2);
    }

    public static MessageReceiverAuthority newInstance(SignatureVerifier signatureVerifier, ErrorReporter errorReporter) {
        return new MessageReceiverAuthority(signatureVerifier, errorReporter);
    }

    @Override // javax.inject.Provider
    public MessageReceiverAuthority get() {
        return newInstance(this.signatureVerifierProvider.get(), this.errorReporterProvider.get());
    }
}
