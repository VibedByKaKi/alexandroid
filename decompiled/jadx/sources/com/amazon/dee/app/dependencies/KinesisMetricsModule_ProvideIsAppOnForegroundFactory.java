package com.amazon.dee.app.dependencies;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.function.Supplier;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes3.dex */
public final class KinesisMetricsModule_ProvideIsAppOnForegroundFactory implements Factory<Supplier<Boolean>> {
    private final Provider<Context> contextProvider;

    public KinesisMetricsModule_ProvideIsAppOnForegroundFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static KinesisMetricsModule_ProvideIsAppOnForegroundFactory create(Provider<Context> provider) {
        return new KinesisMetricsModule_ProvideIsAppOnForegroundFactory(provider);
    }

    public static Supplier<Boolean> provideIsAppOnForeground(Context context) {
        return (Supplier) Preconditions.checkNotNullFromProvides(KinesisMetricsModule.provideIsAppOnForeground(context));
    }

    @Override // javax.inject.Provider
    public Supplier<Boolean> get() {
        return provideIsAppOnForeground(this.contextProvider.get());
    }
}
