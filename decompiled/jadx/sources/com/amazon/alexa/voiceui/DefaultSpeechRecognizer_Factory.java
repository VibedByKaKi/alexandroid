package com.amazon.alexa.voiceui;

import com.amazon.alexa.voice.ui.permissions.AndroidPermissionsChecker;
import com.amazon.alexa.voice.ui.permissions.AndroidPermissionsRequester;
import com.amazon.alexa.voiceui.voice.AlexaUserInterfaceOptionsTracker;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes20.dex */
public final class DefaultSpeechRecognizer_Factory implements Factory<DefaultSpeechRecognizer> {
    private final Provider<AlexaServicesApis> alexaServicesApisProvider;
    private final Provider<AlexaUserInterfaceOptionsTracker> alexaUserInterfaceOptionsTrackerProvider;
    private final Provider<AndroidPermissionsChecker> androidPermissionsCheckerProvider;
    private final Provider<AndroidPermissionsRequester> permissionsRequesterProvider;

    public DefaultSpeechRecognizer_Factory(Provider<AndroidPermissionsChecker> provider, Provider<AlexaServicesApis> provider2, Provider<AlexaUserInterfaceOptionsTracker> provider3, Provider<AndroidPermissionsRequester> provider4) {
        this.androidPermissionsCheckerProvider = provider;
        this.alexaServicesApisProvider = provider2;
        this.alexaUserInterfaceOptionsTrackerProvider = provider3;
        this.permissionsRequesterProvider = provider4;
    }

    public static DefaultSpeechRecognizer_Factory create(Provider<AndroidPermissionsChecker> provider, Provider<AlexaServicesApis> provider2, Provider<AlexaUserInterfaceOptionsTracker> provider3, Provider<AndroidPermissionsRequester> provider4) {
        return new DefaultSpeechRecognizer_Factory(provider, provider2, provider3, provider4);
    }

    public static DefaultSpeechRecognizer newInstance(AndroidPermissionsChecker androidPermissionsChecker, AlexaServicesApis alexaServicesApis, AlexaUserInterfaceOptionsTracker alexaUserInterfaceOptionsTracker, AndroidPermissionsRequester androidPermissionsRequester) {
        return new DefaultSpeechRecognizer(androidPermissionsChecker, alexaServicesApis, alexaUserInterfaceOptionsTracker, androidPermissionsRequester);
    }

    @Override // javax.inject.Provider
    public DefaultSpeechRecognizer get() {
        return newInstance(this.androidPermissionsCheckerProvider.get(), this.alexaServicesApisProvider.get(), this.alexaUserInterfaceOptionsTrackerProvider.get(), this.permissionsRequesterProvider.get());
    }
}
