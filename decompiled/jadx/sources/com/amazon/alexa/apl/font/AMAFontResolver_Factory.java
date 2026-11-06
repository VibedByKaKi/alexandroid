package com.amazon.alexa.apl.font;

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
/* loaded from: classes16.dex */
public final class AMAFontResolver_Factory implements Factory<AMAFontResolver> {
    private final Provider<Context> mContextProvider;

    public AMAFontResolver_Factory(Provider<Context> provider) {
        this.mContextProvider = provider;
    }

    public static AMAFontResolver_Factory create(Provider<Context> provider) {
        return new AMAFontResolver_Factory(provider);
    }

    public static AMAFontResolver newInstance(Context context) {
        return new AMAFontResolver(context);
    }

    @Override // javax.inject.Provider
    public AMAFontResolver get() {
        return newInstance(this.mContextProvider.get());
    }
}
