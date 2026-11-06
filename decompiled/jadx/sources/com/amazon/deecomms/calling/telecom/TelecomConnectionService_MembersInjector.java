package com.amazon.deecomms.calling.telecom;

import android.telecom.Connection;
import com.amazon.deecomms.calling.telecom.audiomanagement.TelecomCallAudioRouteObservable;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import java.util.Map;
import java.util.Queue;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class TelecomConnectionService_MembersInjector implements MembersInjector<TelecomConnectionService> {
    private final Provider<Map<String, Connection>> callIdToTelecomConnectionProvider;
    private final Provider<TelecomBridge> telecomBridgeProvider;
    private final Provider<TelecomCallAudioRouteObservable> telecomCallAudioRouteObservableProvider;
    private final Provider<Queue<String>> telecomCallIdsProvider;
    private final Provider<Object> telecomLockProvider;

    public TelecomConnectionService_MembersInjector(Provider<Map<String, Connection>> provider, Provider<Queue<String>> provider2, Provider<Object> provider3, Provider<TelecomBridge> provider4, Provider<TelecomCallAudioRouteObservable> provider5) {
        this.callIdToTelecomConnectionProvider = provider;
        this.telecomCallIdsProvider = provider2;
        this.telecomLockProvider = provider3;
        this.telecomBridgeProvider = provider4;
        this.telecomCallAudioRouteObservableProvider = provider5;
    }

    public static MembersInjector<TelecomConnectionService> create(Provider<Map<String, Connection>> provider, Provider<Queue<String>> provider2, Provider<Object> provider3, Provider<TelecomBridge> provider4, Provider<TelecomCallAudioRouteObservable> provider5) {
        return new TelecomConnectionService_MembersInjector(provider, provider2, provider3, provider4, provider5);
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.telecom.TelecomConnectionService.callIdToTelecomConnection")
    public static void injectCallIdToTelecomConnection(TelecomConnectionService telecomConnectionService, Map<String, Connection> map) {
        telecomConnectionService.callIdToTelecomConnection = map;
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.telecom.TelecomConnectionService.telecomBridge")
    public static void injectTelecomBridge(TelecomConnectionService telecomConnectionService, TelecomBridge telecomBridge) {
        telecomConnectionService.telecomBridge = telecomBridge;
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.telecom.TelecomConnectionService.telecomCallAudioRouteObservable")
    public static void injectTelecomCallAudioRouteObservable(TelecomConnectionService telecomConnectionService, TelecomCallAudioRouteObservable telecomCallAudioRouteObservable) {
        telecomConnectionService.telecomCallAudioRouteObservable = telecomCallAudioRouteObservable;
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.telecom.TelecomConnectionService.telecomCallIds")
    public static void injectTelecomCallIds(TelecomConnectionService telecomConnectionService, Queue<String> queue) {
        telecomConnectionService.telecomCallIds = queue;
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.telecom.TelecomConnectionService.telecomLock")
    public static void injectTelecomLock(TelecomConnectionService telecomConnectionService, Object obj) {
        telecomConnectionService.telecomLock = obj;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TelecomConnectionService telecomConnectionService) {
        injectCallIdToTelecomConnection(telecomConnectionService, this.callIdToTelecomConnectionProvider.get());
        injectTelecomCallIds(telecomConnectionService, this.telecomCallIdsProvider.get());
        injectTelecomLock(telecomConnectionService, this.telecomLockProvider.get());
        injectTelecomBridge(telecomConnectionService, this.telecomBridgeProvider.get());
        injectTelecomCallAudioRouteObservable(telecomConnectionService, this.telecomCallAudioRouteObservableProvider.get());
    }
}
