package com.amazon.tarazed.session.dialog;

import com.amazon.tarazed.type.SessionType;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class TarazedDialogMessageProvider_Factory implements Factory<TarazedDialogMessageProvider> {
    private final Provider<SessionType> sessionTypeProvider;

    public TarazedDialogMessageProvider_Factory(Provider<SessionType> provider) {
        this.sessionTypeProvider = provider;
    }

    public static Factory<TarazedDialogMessageProvider> create(Provider<SessionType> provider) {
        return new TarazedDialogMessageProvider_Factory(provider);
    }

    @Override // javax.inject.Provider
    public TarazedDialogMessageProvider get() {
        return new TarazedDialogMessageProvider(this.sessionTypeProvider.get());
    }
}
