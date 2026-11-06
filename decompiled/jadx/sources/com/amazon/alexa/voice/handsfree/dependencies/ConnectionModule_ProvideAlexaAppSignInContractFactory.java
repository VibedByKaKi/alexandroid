package com.amazon.alexa.voice.handsfree.dependencies;

import com.amazon.alexa.handsfree.protocols.utils.AlexaAppSignInContract;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ConnectionModule_ProvideAlexaAppSignInContractFactory implements Factory<AlexaAppSignInContract> {
    private final ConnectionModule module;

    public ConnectionModule_ProvideAlexaAppSignInContractFactory(ConnectionModule connectionModule) {
        this.module = connectionModule;
    }

    public static ConnectionModule_ProvideAlexaAppSignInContractFactory create(ConnectionModule connectionModule) {
        return new ConnectionModule_ProvideAlexaAppSignInContractFactory(connectionModule);
    }

    public static AlexaAppSignInContract provideAlexaAppSignInContract(ConnectionModule connectionModule) {
        return (AlexaAppSignInContract) Preconditions.checkNotNull(connectionModule.provideAlexaAppSignInContract(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public AlexaAppSignInContract get() {
        return provideAlexaAppSignInContract(this.module);
    }
}
