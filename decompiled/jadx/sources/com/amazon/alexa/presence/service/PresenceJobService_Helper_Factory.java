package com.amazon.alexa.presence.service;

import android.content.Context;
import com.amazon.alexa.presence.service.PresenceJobService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class PresenceJobService_Helper_Factory implements Factory<PresenceJobService.Helper> {
    private final Provider<Context> ctxProvider;

    public PresenceJobService_Helper_Factory(Provider<Context> provider) {
        this.ctxProvider = provider;
    }

    public static PresenceJobService_Helper_Factory create(Provider<Context> provider) {
        return new PresenceJobService_Helper_Factory(provider);
    }

    public static PresenceJobService.Helper newInstance(Context context) {
        return new PresenceJobService.Helper(context);
    }

    @Override // javax.inject.Provider
    public PresenceJobService.Helper get() {
        return newInstance(this.ctxProvider.get());
    }
}
