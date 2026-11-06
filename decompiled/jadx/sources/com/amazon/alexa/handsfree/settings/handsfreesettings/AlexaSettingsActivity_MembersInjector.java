package com.amazon.alexa.handsfree.settings.handsfreesettings;

import com.amazon.alexa.handsfree.protocols.Initializer;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class AlexaSettingsActivity_MembersInjector implements MembersInjector<AlexaSettingsActivity> {
    private final Provider<Initializer> mInitializerProvider;

    public AlexaSettingsActivity_MembersInjector(Provider<Initializer> provider) {
        this.mInitializerProvider = provider;
    }

    public static MembersInjector<AlexaSettingsActivity> create(Provider<Initializer> provider) {
        return new AlexaSettingsActivity_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.handsfree.settings.handsfreesettings.AlexaSettingsActivity.mInitializer")
    public static void injectMInitializer(AlexaSettingsActivity alexaSettingsActivity, Initializer initializer) {
        alexaSettingsActivity.mInitializer = initializer;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AlexaSettingsActivity alexaSettingsActivity) {
        injectMInitializer(alexaSettingsActivity, this.mInitializerProvider.get());
    }
}
