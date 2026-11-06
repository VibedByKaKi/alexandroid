package com.amazon.deecomms.core;

import android.telecom.Connection;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import com.amazon.deecomms.calling.telecom.TelecomBridge;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;
import java.util.Queue;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class TelecomModule_ProvidesTelecomBridgeFactory implements Factory<TelecomBridge> {
    private final Provider<Map<String, Connection>> callIdByTelecomConnectionProvider;
    private final TelecomModule module;
    private final Provider<PhoneAccountHandle> phoneAccountHandleProvider;
    private final Provider<Queue<String>> telecomCallIdsProvider;
    private final Provider<Object> telecomLockProvider;
    private final Provider<TelecomManager> telecomManagerProvider;

    public TelecomModule_ProvidesTelecomBridgeFactory(TelecomModule telecomModule, Provider<TelecomManager> provider, Provider<PhoneAccountHandle> provider2, Provider<Map<String, Connection>> provider3, Provider<Queue<String>> provider4, Provider<Object> provider5) {
        this.module = telecomModule;
        this.telecomManagerProvider = provider;
        this.phoneAccountHandleProvider = provider2;
        this.callIdByTelecomConnectionProvider = provider3;
        this.telecomCallIdsProvider = provider4;
        this.telecomLockProvider = provider5;
    }

    public static TelecomModule_ProvidesTelecomBridgeFactory create(TelecomModule telecomModule, Provider<TelecomManager> provider, Provider<PhoneAccountHandle> provider2, Provider<Map<String, Connection>> provider3, Provider<Queue<String>> provider4, Provider<Object> provider5) {
        return new TelecomModule_ProvidesTelecomBridgeFactory(telecomModule, provider, provider2, provider3, provider4, provider5);
    }

    public static TelecomBridge providesTelecomBridge(TelecomModule telecomModule, TelecomManager telecomManager, PhoneAccountHandle phoneAccountHandle, Map<String, Connection> map, Queue<String> queue, Object obj) {
        return (TelecomBridge) Preconditions.checkNotNullFromProvides(telecomModule.providesTelecomBridge(telecomManager, phoneAccountHandle, map, queue, obj));
    }

    @Override // javax.inject.Provider
    public TelecomBridge get() {
        return providesTelecomBridge(this.module, this.telecomManagerProvider.get(), this.phoneAccountHandleProvider.get(), this.callIdByTelecomConnectionProvider.get(), this.telecomCallIdsProvider.get(), this.telecomLockProvider.get());
    }
}
