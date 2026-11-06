package com.amazon.deecomms.messaging.service;

import com.amazon.deecomms.messaging.controller.AudioStateManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class AudioDownloadService_MembersInjector implements MembersInjector<AudioDownloadService> {
    private final Provider<AudioStateManager> audioStateManagerProvider;

    public AudioDownloadService_MembersInjector(Provider<AudioStateManager> provider) {
        this.audioStateManagerProvider = provider;
    }

    public static MembersInjector<AudioDownloadService> create(Provider<AudioStateManager> provider) {
        return new AudioDownloadService_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.messaging.service.AudioDownloadService.audioStateManager")
    public static void injectAudioStateManager(AudioDownloadService audioDownloadService, AudioStateManager audioStateManager) {
        audioDownloadService.audioStateManager = audioStateManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AudioDownloadService audioDownloadService) {
        injectAudioStateManager(audioDownloadService, this.audioStateManagerProvider.get());
    }
}
