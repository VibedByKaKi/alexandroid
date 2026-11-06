package com.amazon.alexa.mobilytics.auth;

import android.content.Context;
import com.amazon.alexa.mobilytics.auth.CognitoCredentialsProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class CognitoCredentialsProvider_Factory_Factory implements Factory<CognitoCredentialsProvider.Factory> {
    private final Provider<Context> contextProvider;

    public CognitoCredentialsProvider_Factory_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static CognitoCredentialsProvider_Factory_Factory create(Provider<Context> provider) {
        return new CognitoCredentialsProvider_Factory_Factory(provider);
    }

    public static CognitoCredentialsProvider.Factory newInstance(Context context) {
        return new CognitoCredentialsProvider.Factory(context);
    }

    @Override // javax.inject.Provider
    public CognitoCredentialsProvider.Factory get() {
        return newInstance(this.contextProvider.get());
    }
}
