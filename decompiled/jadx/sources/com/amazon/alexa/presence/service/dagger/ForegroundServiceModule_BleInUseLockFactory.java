package com.amazon.alexa.presence.service.dagger;

import com.amazon.alexa.presence.locks.BLEInUseLock;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class ForegroundServiceModule_BleInUseLockFactory implements Factory<BLEInUseLock> {
    private final ForegroundServiceModule module;

    public ForegroundServiceModule_BleInUseLockFactory(ForegroundServiceModule foregroundServiceModule) {
        this.module = foregroundServiceModule;
    }

    public static BLEInUseLock bleInUseLock(ForegroundServiceModule foregroundServiceModule) {
        return (BLEInUseLock) Preconditions.checkNotNullFromProvides(foregroundServiceModule.bleInUseLock());
    }

    public static ForegroundServiceModule_BleInUseLockFactory create(ForegroundServiceModule foregroundServiceModule) {
        return new ForegroundServiceModule_BleInUseLockFactory(foregroundServiceModule);
    }

    @Override // javax.inject.Provider
    public BLEInUseLock get() {
        return bleInUseLock(this.module);
    }
}
