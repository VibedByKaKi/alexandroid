package com.amazon.alexa.voiceui.lockscreen;

import android.app.Activity;
import android.app.KeyguardManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class LockscreenController_Factory implements Factory<LockscreenController> {
    private final Provider<Activity> activityProvider;
    private final Provider<KeyguardManager> keyguardManagerProvider;

    public LockscreenController_Factory(Provider<KeyguardManager> provider, Provider<Activity> provider2) {
        this.keyguardManagerProvider = provider;
        this.activityProvider = provider2;
    }

    public static LockscreenController_Factory create(Provider<KeyguardManager> provider, Provider<Activity> provider2) {
        return new LockscreenController_Factory(provider, provider2);
    }

    public static LockscreenController newInstance(KeyguardManager keyguardManager, Activity activity) {
        return new LockscreenController(keyguardManager, activity);
    }

    @Override // javax.inject.Provider
    public LockscreenController get() {
        return newInstance(this.keyguardManagerProvider.get(), this.activityProvider.get());
    }
}
