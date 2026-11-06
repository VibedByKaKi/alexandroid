package com.amazon.deecomms.calling.telecom;

import android.content.Context;
import android.media.AudioManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class TelecomConnection_MembersInjector implements MembersInjector<TelecomConnection> {
    private final Provider<AudioManager> audioManagerProvider;
    private final Provider<Context> contextProvider;

    public TelecomConnection_MembersInjector(Provider<Context> provider, Provider<AudioManager> provider2) {
        this.contextProvider = provider;
        this.audioManagerProvider = provider2;
    }

    public static MembersInjector<TelecomConnection> create(Provider<Context> provider, Provider<AudioManager> provider2) {
        return new TelecomConnection_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.telecom.TelecomConnection.audioManager")
    public static void injectAudioManager(TelecomConnection telecomConnection, AudioManager audioManager) {
        telecomConnection.audioManager = audioManager;
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.telecom.TelecomConnection.context")
    public static void injectContext(TelecomConnection telecomConnection, Context context) {
        telecomConnection.context = context;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TelecomConnection telecomConnection) {
        injectContext(telecomConnection, this.contextProvider.get());
        injectAudioManager(telecomConnection, this.audioManagerProvider.get());
    }
}
