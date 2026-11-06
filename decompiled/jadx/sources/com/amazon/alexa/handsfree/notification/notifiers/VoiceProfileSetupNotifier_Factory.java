package com.amazon.alexa.handsfree.notification.notifiers;

import android.content.Context;
import com.amazon.alexa.handsfree.notification.IntentActionParser;
import com.amazon.alexa.handsfree.notification.api.UVRSettingsProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class VoiceProfileSetupNotifier_Factory implements Factory<VoiceProfileSetupNotifier> {
    private final Provider<Context> contextProvider;
    private final Provider<IntentActionParser> intentActionParserProvider;
    private final Provider<UVRSettingsProvider> uvrSettingsProvider;

    public VoiceProfileSetupNotifier_Factory(Provider<Context> provider, Provider<IntentActionParser> provider2, Provider<UVRSettingsProvider> provider3) {
        this.contextProvider = provider;
        this.intentActionParserProvider = provider2;
        this.uvrSettingsProvider = provider3;
    }

    public static VoiceProfileSetupNotifier_Factory create(Provider<Context> provider, Provider<IntentActionParser> provider2, Provider<UVRSettingsProvider> provider3) {
        return new VoiceProfileSetupNotifier_Factory(provider, provider2, provider3);
    }

    public static VoiceProfileSetupNotifier newInstance(Context context, IntentActionParser intentActionParser, UVRSettingsProvider uVRSettingsProvider) {
        return new VoiceProfileSetupNotifier(context, intentActionParser, uVRSettingsProvider);
    }

    @Override // javax.inject.Provider
    public VoiceProfileSetupNotifier get() {
        return newInstance(this.contextProvider.get(), this.intentActionParserProvider.get(), this.uvrSettingsProvider.get());
    }
}
