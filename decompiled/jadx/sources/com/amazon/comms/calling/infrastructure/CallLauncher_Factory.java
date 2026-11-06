package com.amazon.comms.calling.infrastructure;

import android.content.Context;
import com.amazon.comms.calling.data.util.Utils;
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
public final class CallLauncher_Factory implements Factory<CallLauncher> {
    private final Provider<Context> contextProvider;
    private final Provider<Utils> utilsProvider;

    public CallLauncher_Factory(Provider<Context> provider, Provider<Utils> provider2) {
        this.contextProvider = provider;
        this.utilsProvider = provider2;
    }

    public static CallLauncher_Factory create(Provider<Context> provider, Provider<Utils> provider2) {
        return new CallLauncher_Factory(provider, provider2);
    }

    public static CallLauncher newInstance(Context context, Utils utils) {
        return new CallLauncher(context, utils);
    }

    @Override // javax.inject.Provider
    public CallLauncher get() {
        return newInstance(this.contextProvider.get(), this.utilsProvider.get());
    }
}
