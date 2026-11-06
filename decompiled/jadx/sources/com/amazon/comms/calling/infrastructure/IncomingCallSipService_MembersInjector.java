package com.amazon.comms.calling.infrastructure;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class IncomingCallSipService_MembersInjector implements MembersInjector<IncomingCallSipService> {
    private final Provider<IncomingCallSipObserver> incomingCallSipObserverProvider;

    public IncomingCallSipService_MembersInjector(Provider<IncomingCallSipObserver> provider) {
        this.incomingCallSipObserverProvider = provider;
    }

    public static MembersInjector<IncomingCallSipService> create(Provider<IncomingCallSipObserver> provider) {
        return new IncomingCallSipService_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.comms.calling.infrastructure.IncomingCallSipService.incomingCallSipObserver")
    public static void injectIncomingCallSipObserver(IncomingCallSipService incomingCallSipService, IncomingCallSipObserver incomingCallSipObserver) {
        incomingCallSipService.incomingCallSipObserver = incomingCallSipObserver;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(IncomingCallSipService incomingCallSipService) {
        injectIncomingCallSipObserver(incomingCallSipService, this.incomingCallSipObserverProvider.get());
    }
}
