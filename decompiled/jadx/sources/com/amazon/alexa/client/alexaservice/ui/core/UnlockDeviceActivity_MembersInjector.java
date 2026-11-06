package com.amazon.alexa.client.alexaservice.ui.core;

import android.app.KeyguardManager;
import android.os.PowerManager;
import com.amazon.alexa.android.ui.ActivityStarter;
import com.amazon.alexa.utils.TimeProvider;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class UnlockDeviceActivity_MembersInjector implements MembersInjector<UnlockDeviceActivity> {
    private final Provider<ActivityStarter> activityStarterProvider;
    private final Provider<KeyguardManager> keyguardManagerProvider;
    private final Provider<PowerManager> powerManagerProvider;
    private final Provider<TimeProvider> timeProvider;

    public UnlockDeviceActivity_MembersInjector(Provider<KeyguardManager> provider, Provider<PowerManager> provider2, Provider<TimeProvider> provider3, Provider<ActivityStarter> provider4) {
        this.keyguardManagerProvider = provider;
        this.powerManagerProvider = provider2;
        this.timeProvider = provider3;
        this.activityStarterProvider = provider4;
    }

    public static MembersInjector<UnlockDeviceActivity> create(Provider<KeyguardManager> provider, Provider<PowerManager> provider2, Provider<TimeProvider> provider3, Provider<ActivityStarter> provider4) {
        return new UnlockDeviceActivity_MembersInjector(provider, provider2, provider3, provider4);
    }

    @InjectedFieldSignature("com.amazon.alexa.client.alexaservice.ui.core.UnlockDeviceActivity.activityStarter")
    public static void injectActivityStarter(UnlockDeviceActivity unlockDeviceActivity, ActivityStarter activityStarter) {
        unlockDeviceActivity.activityStarter = activityStarter;
    }

    @InjectedFieldSignature("com.amazon.alexa.client.alexaservice.ui.core.UnlockDeviceActivity.keyguardManager")
    public static void injectKeyguardManager(UnlockDeviceActivity unlockDeviceActivity, KeyguardManager keyguardManager) {
        unlockDeviceActivity.keyguardManager = keyguardManager;
    }

    @InjectedFieldSignature("com.amazon.alexa.client.alexaservice.ui.core.UnlockDeviceActivity.powerManager")
    public static void injectPowerManager(UnlockDeviceActivity unlockDeviceActivity, PowerManager powerManager) {
        unlockDeviceActivity.powerManager = powerManager;
    }

    @InjectedFieldSignature("com.amazon.alexa.client.alexaservice.ui.core.UnlockDeviceActivity.timeProvider")
    public static void injectTimeProvider(UnlockDeviceActivity unlockDeviceActivity, TimeProvider timeProvider) {
        unlockDeviceActivity.timeProvider = timeProvider;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UnlockDeviceActivity unlockDeviceActivity) {
        injectKeyguardManager(unlockDeviceActivity, this.keyguardManagerProvider.get());
        injectPowerManager(unlockDeviceActivity, this.powerManagerProvider.get());
        injectTimeProvider(unlockDeviceActivity, this.timeProvider.get());
        injectActivityStarter(unlockDeviceActivity, this.activityStarterProvider.get());
    }
}
