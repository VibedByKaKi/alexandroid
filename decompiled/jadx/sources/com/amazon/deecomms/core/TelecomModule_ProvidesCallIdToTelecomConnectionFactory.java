package com.amazon.deecomms.core;

import android.telecom.Connection;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class TelecomModule_ProvidesCallIdToTelecomConnectionFactory implements Factory<Map<String, Connection>> {
    private final TelecomModule module;

    public TelecomModule_ProvidesCallIdToTelecomConnectionFactory(TelecomModule telecomModule) {
        this.module = telecomModule;
    }

    public static TelecomModule_ProvidesCallIdToTelecomConnectionFactory create(TelecomModule telecomModule) {
        return new TelecomModule_ProvidesCallIdToTelecomConnectionFactory(telecomModule);
    }

    public static Map<String, Connection> providesCallIdToTelecomConnection(TelecomModule telecomModule) {
        return (Map) Preconditions.checkNotNullFromProvides(telecomModule.providesCallIdToTelecomConnection());
    }

    @Override // javax.inject.Provider
    public Map<String, Connection> get() {
        return providesCallIdToTelecomConnection(this.module);
    }
}
