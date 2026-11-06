package com.amazon.alexa.hho.navigation.thirdpartydeeplinking.ui;

import android.app.KeyguardManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes13.dex */
public final class LockScreenManager_Factory implements Factory<LockScreenManager> {
    private final Provider<KeyguardManager> keyguardManagerProvider;

    public LockScreenManager_Factory(Provider<KeyguardManager> provider) {
        this.keyguardManagerProvider = provider;
    }

    public static LockScreenManager_Factory create(Provider<KeyguardManager> provider) {
        return new LockScreenManager_Factory(provider);
    }

    public static LockScreenManager newInstance(KeyguardManager keyguardManager) {
        return new LockScreenManager(keyguardManager);
    }

    @Override // javax.inject.Provider
    public LockScreenManager get() {
        return newInstance(this.keyguardManagerProvider.get());
    }
}
