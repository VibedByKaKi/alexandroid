package com.amazon.dee.app.services.security;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class DefaultCertificateReaderService_Factory implements Factory<DefaultCertificateReaderService> {
    private final Provider<Context> appContextProvider;

    public DefaultCertificateReaderService_Factory(Provider<Context> provider) {
        this.appContextProvider = provider;
    }

    public static DefaultCertificateReaderService_Factory create(Provider<Context> provider) {
        return new DefaultCertificateReaderService_Factory(provider);
    }

    public static DefaultCertificateReaderService newInstance(Context context) {
        return new DefaultCertificateReaderService(context);
    }

    @Override // javax.inject.Provider
    public DefaultCertificateReaderService get() {
        return newInstance(this.appContextProvider.get());
    }
}
