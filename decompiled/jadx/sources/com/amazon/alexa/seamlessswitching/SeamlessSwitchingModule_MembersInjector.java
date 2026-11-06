package com.amazon.alexa.seamlessswitching;

import com.amazon.alexa.seamlessswitching.capability.agent.IOComponentsBluetoothCapabilityAgent;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class SeamlessSwitchingModule_MembersInjector implements MembersInjector<SeamlessSwitchingModule> {
    private final Provider<IOComponentsBluetoothCapabilityAgent> ioComponentsBluetoothCapabilityAgentProvider;

    public SeamlessSwitchingModule_MembersInjector(Provider<IOComponentsBluetoothCapabilityAgent> provider) {
        this.ioComponentsBluetoothCapabilityAgentProvider = provider;
    }

    public static MembersInjector<SeamlessSwitchingModule> create(Provider<IOComponentsBluetoothCapabilityAgent> provider) {
        return new SeamlessSwitchingModule_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.seamlessswitching.SeamlessSwitchingModule.ioComponentsBluetoothCapabilityAgent")
    public static void injectIoComponentsBluetoothCapabilityAgent(SeamlessSwitchingModule seamlessSwitchingModule, IOComponentsBluetoothCapabilityAgent iOComponentsBluetoothCapabilityAgent) {
        seamlessSwitchingModule.ioComponentsBluetoothCapabilityAgent = iOComponentsBluetoothCapabilityAgent;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SeamlessSwitchingModule seamlessSwitchingModule) {
        injectIoComponentsBluetoothCapabilityAgent(seamlessSwitchingModule, this.ioComponentsBluetoothCapabilityAgentProvider.get());
    }
}
