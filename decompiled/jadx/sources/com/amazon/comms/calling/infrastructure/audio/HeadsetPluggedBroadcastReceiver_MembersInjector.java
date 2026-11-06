package com.amazon.comms.calling.infrastructure.audio;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class HeadsetPluggedBroadcastReceiver_MembersInjector implements MembersInjector<HeadsetPluggedBroadcastReceiver> {
    private final Provider<AudioRouteChangeObservable> audioRouteChangeObservableProvider;

    public HeadsetPluggedBroadcastReceiver_MembersInjector(Provider<AudioRouteChangeObservable> provider) {
        this.audioRouteChangeObservableProvider = provider;
    }

    public static MembersInjector<HeadsetPluggedBroadcastReceiver> create(Provider<AudioRouteChangeObservable> provider) {
        return new HeadsetPluggedBroadcastReceiver_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.comms.calling.infrastructure.audio.HeadsetPluggedBroadcastReceiver.audioRouteChangeObservable")
    public static void injectAudioRouteChangeObservable(HeadsetPluggedBroadcastReceiver headsetPluggedBroadcastReceiver, AudioRouteChangeObservable audioRouteChangeObservable) {
        headsetPluggedBroadcastReceiver.audioRouteChangeObservable = audioRouteChangeObservable;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(HeadsetPluggedBroadcastReceiver headsetPluggedBroadcastReceiver) {
        injectAudioRouteChangeObservable(headsetPluggedBroadcastReceiver, this.audioRouteChangeObservableProvider.get());
    }
}
