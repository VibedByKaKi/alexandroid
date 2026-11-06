package com.amazon.alexa.voiceui.notifications;

import com.amazon.alexa.voiceui.lockscreen.LockscreenController;
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
public final class SmartLockNotificationInteractor_Factory implements Factory<SmartLockNotificationInteractor> {
    private final Provider<LockscreenController> lockscreenControllerProvider;

    public SmartLockNotificationInteractor_Factory(Provider<LockscreenController> provider) {
        this.lockscreenControllerProvider = provider;
    }

    public static SmartLockNotificationInteractor_Factory create(Provider<LockscreenController> provider) {
        return new SmartLockNotificationInteractor_Factory(provider);
    }

    public static SmartLockNotificationInteractor newInstance(LockscreenController lockscreenController) {
        return new SmartLockNotificationInteractor(lockscreenController);
    }

    @Override // javax.inject.Provider
    public SmartLockNotificationInteractor get() {
        return newInstance(this.lockscreenControllerProvider.get());
    }
}
