package com.amazon.comms.calling.infrastructure;

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
/* loaded from: classes20.dex */
public final class StringHelperImpl_Factory implements Factory<StringHelperImpl> {
    private final Provider<Context> contextProvider;

    public StringHelperImpl_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static StringHelperImpl_Factory create(Provider<Context> provider) {
        return new StringHelperImpl_Factory(provider);
    }

    public static StringHelperImpl newInstance(Context context) {
        return new StringHelperImpl(context);
    }

    @Override // javax.inject.Provider
    public StringHelperImpl get() {
        return newInstance(this.contextProvider.get());
    }
}
