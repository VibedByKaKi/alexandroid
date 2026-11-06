package com.amazon.deecomms.remoteConfig;

import com.amazon.deecomms.auth.Stage;
import com.amazon.deecomms.common.receiver.CommsConnectivityMonitor;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class ConfigurationSyncService_MembersInjector implements MembersInjector<ConfigurationSyncService> {
    private final Provider<CommsConnectivityMonitor> commsConnectivityMonitorProvider;
    private final Provider<Stage> stageProvider;

    public ConfigurationSyncService_MembersInjector(Provider<Stage> provider, Provider<CommsConnectivityMonitor> provider2) {
        this.stageProvider = provider;
        this.commsConnectivityMonitorProvider = provider2;
    }

    public static MembersInjector<ConfigurationSyncService> create(Provider<Stage> provider, Provider<CommsConnectivityMonitor> provider2) {
        return new ConfigurationSyncService_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.deecomms.remoteConfig.ConfigurationSyncService.commsConnectivityMonitor")
    public static void injectCommsConnectivityMonitor(ConfigurationSyncService configurationSyncService, CommsConnectivityMonitor commsConnectivityMonitor) {
        configurationSyncService.commsConnectivityMonitor = commsConnectivityMonitor;
    }

    @InjectedFieldSignature("com.amazon.deecomms.remoteConfig.ConfigurationSyncService.stage")
    public static void injectStage(ConfigurationSyncService configurationSyncService, Stage stage) {
        configurationSyncService.stage = stage;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ConfigurationSyncService configurationSyncService) {
        injectStage(configurationSyncService, this.stageProvider.get());
        injectCommsConnectivityMonitor(configurationSyncService, this.commsConnectivityMonitorProvider.get());
    }
}
