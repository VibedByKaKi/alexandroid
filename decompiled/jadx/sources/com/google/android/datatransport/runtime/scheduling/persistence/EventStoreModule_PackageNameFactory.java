package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class EventStoreModule_PackageNameFactory implements Factory<String> {
    private final Provider<Context> contextProvider;

    public EventStoreModule_PackageNameFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static EventStoreModule_PackageNameFactory create(Provider<Context> provider) {
        return new EventStoreModule_PackageNameFactory(provider);
    }

    public static String packageName(Context context) {
        return (String) Preconditions.checkNotNull(EventStoreModule.packageName(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public String get() {
        return packageName(this.contextProvider.get());
    }
}
