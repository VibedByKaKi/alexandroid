package com.amazon.tarazed.ui.tv;

import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class MoveTVUIHandler_Factory implements Factory<MoveTVUIHandler> {
    private final Provider<TVUIManager> tvUIManagerProvider;

    public MoveTVUIHandler_Factory(Provider<TVUIManager> provider) {
        this.tvUIManagerProvider = provider;
    }

    public static Factory<MoveTVUIHandler> create(Provider<TVUIManager> provider) {
        return new MoveTVUIHandler_Factory(provider);
    }

    @Override // javax.inject.Provider
    public MoveTVUIHandler get() {
        return new MoveTVUIHandler(this.tvUIManagerProvider.get());
    }
}
