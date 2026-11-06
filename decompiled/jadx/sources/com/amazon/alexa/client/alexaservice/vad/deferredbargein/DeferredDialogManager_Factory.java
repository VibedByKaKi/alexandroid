package com.amazon.alexa.client.alexaservice.vad.deferredbargein;

import com.amazon.alexa.client.alexaservice.dialog.core.MultiTurnDialogAuthority;
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
public final class DeferredDialogManager_Factory implements Factory<DeferredDialogManager> {
    private final Provider<MultiTurnDialogAuthority> dialogAuthorityProvider;

    public DeferredDialogManager_Factory(Provider<MultiTurnDialogAuthority> provider) {
        this.dialogAuthorityProvider = provider;
    }

    public static DeferredDialogManager_Factory create(Provider<MultiTurnDialogAuthority> provider) {
        return new DeferredDialogManager_Factory(provider);
    }

    public static DeferredDialogManager newInstance(MultiTurnDialogAuthority multiTurnDialogAuthority) {
        return new DeferredDialogManager(multiTurnDialogAuthority);
    }

    @Override // javax.inject.Provider
    public DeferredDialogManager get() {
        return newInstance(this.dialogAuthorityProvider.get());
    }
}
