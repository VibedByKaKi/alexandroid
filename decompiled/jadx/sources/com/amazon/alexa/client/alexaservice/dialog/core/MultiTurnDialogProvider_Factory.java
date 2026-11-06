package com.amazon.alexa.client.alexaservice.dialog.core;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MultiTurnDialogProvider_Factory implements Factory<MultiTurnDialogProvider> {
    private final Provider<DialogAuthority> dialogAuthorityProvider;
    private final Provider<StartDialogTurnCallbacksProvider> startDialogTurnCallbacksProvider;

    public MultiTurnDialogProvider_Factory(Provider<DialogAuthority> provider, Provider<StartDialogTurnCallbacksProvider> provider2) {
        this.dialogAuthorityProvider = provider;
        this.startDialogTurnCallbacksProvider = provider2;
    }

    public static MultiTurnDialogProvider_Factory create(Provider<DialogAuthority> provider, Provider<StartDialogTurnCallbacksProvider> provider2) {
        return new MultiTurnDialogProvider_Factory(provider, provider2);
    }

    public static MultiTurnDialogProvider newInstance(DialogAuthority dialogAuthority, StartDialogTurnCallbacksProvider startDialogTurnCallbacksProvider) {
        return new MultiTurnDialogProvider(dialogAuthority, startDialogTurnCallbacksProvider);
    }

    @Override // javax.inject.Provider
    public MultiTurnDialogProvider get() {
        return newInstance(this.dialogAuthorityProvider.get(), this.startDialogTurnCallbacksProvider.get());
    }
}
