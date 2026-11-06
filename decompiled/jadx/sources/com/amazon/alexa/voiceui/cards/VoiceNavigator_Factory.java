package com.amazon.alexa.voiceui.cards;

import android.app.Activity;
import android.content.pm.PackageManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class VoiceNavigator_Factory implements Factory<VoiceNavigator> {
    private final Provider<Activity> activityProvider;
    private final Provider<PackageManager> packageManagerProvider;

    public VoiceNavigator_Factory(Provider<Activity> provider, Provider<PackageManager> provider2) {
        this.activityProvider = provider;
        this.packageManagerProvider = provider2;
    }

    public static VoiceNavigator_Factory create(Provider<Activity> provider, Provider<PackageManager> provider2) {
        return new VoiceNavigator_Factory(provider, provider2);
    }

    public static VoiceNavigator newInstance(Activity activity, PackageManager packageManager) {
        return new VoiceNavigator(activity, packageManager);
    }

    @Override // javax.inject.Provider
    public VoiceNavigator get() {
        return newInstance(this.activityProvider.get(), this.packageManagerProvider.get());
    }
}
