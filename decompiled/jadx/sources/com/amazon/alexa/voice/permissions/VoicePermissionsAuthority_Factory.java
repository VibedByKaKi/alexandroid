package com.amazon.alexa.voice.permissions;

import android.content.Context;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class VoicePermissionsAuthority_Factory implements Factory<VoicePermissionsAuthority> {
    private final Provider<ApplicationLifecycleService> applicationLifecycleServiceProvider;
    private final Provider<Context> contextProvider;

    public VoicePermissionsAuthority_Factory(Provider<Context> provider, Provider<ApplicationLifecycleService> provider2) {
        this.contextProvider = provider;
        this.applicationLifecycleServiceProvider = provider2;
    }

    public static VoicePermissionsAuthority_Factory create(Provider<Context> provider, Provider<ApplicationLifecycleService> provider2) {
        return new VoicePermissionsAuthority_Factory(provider, provider2);
    }

    public static VoicePermissionsAuthority newInstance(Context context, ApplicationLifecycleService applicationLifecycleService) {
        return new VoicePermissionsAuthority(context, applicationLifecycleService);
    }

    @Override // javax.inject.Provider
    public VoicePermissionsAuthority get() {
        return newInstance(this.contextProvider.get(), this.applicationLifecycleServiceProvider.get());
    }
}
