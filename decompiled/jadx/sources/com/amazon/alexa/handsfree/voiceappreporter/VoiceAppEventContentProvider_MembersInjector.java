package com.amazon.alexa.handsfree.voiceappreporter;

import com.amazon.alexa.handsfree.voiceappreporter.database.VoiceAppEventReporterDatabaseHelper;
import dagger.MembersInjector;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class VoiceAppEventContentProvider_MembersInjector implements MembersInjector<VoiceAppEventContentProvider> {
    private final Provider<VoiceAppEventReporterDatabaseHelper> mVoiceAppEventReporterDatabaseHelperProvider;

    public VoiceAppEventContentProvider_MembersInjector(Provider<VoiceAppEventReporterDatabaseHelper> provider) {
        this.mVoiceAppEventReporterDatabaseHelperProvider = provider;
    }

    public static MembersInjector<VoiceAppEventContentProvider> create(Provider<VoiceAppEventReporterDatabaseHelper> provider) {
        return new VoiceAppEventContentProvider_MembersInjector(provider);
    }

    public static void injectMVoiceAppEventReporterDatabaseHelper(VoiceAppEventContentProvider voiceAppEventContentProvider, VoiceAppEventReporterDatabaseHelper voiceAppEventReporterDatabaseHelper) {
        voiceAppEventContentProvider.mVoiceAppEventReporterDatabaseHelper = voiceAppEventReporterDatabaseHelper;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(VoiceAppEventContentProvider voiceAppEventContentProvider) {
        injectMVoiceAppEventReporterDatabaseHelper(voiceAppEventContentProvider, this.mVoiceAppEventReporterDatabaseHelperProvider.get());
    }
}
