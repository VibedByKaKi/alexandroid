package com.amazon.alexa.client.alexaservice.features.launcher;

import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.alexa.client.alexaservice.base.application.permissions.PermissionsChecker;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class TargetEvaluator_Factory implements Factory<TargetEvaluator> {
    private final Provider<Context> contextProvider;
    private final Provider<PackageManager> packageManagerProvider;
    private final Provider<PermissionsChecker> permissionsCheckerProvider;

    public TargetEvaluator_Factory(Provider<PackageManager> provider, Provider<PermissionsChecker> provider2, Provider<Context> provider3) {
        this.packageManagerProvider = provider;
        this.permissionsCheckerProvider = provider2;
        this.contextProvider = provider3;
    }

    public static TargetEvaluator_Factory create(Provider<PackageManager> provider, Provider<PermissionsChecker> provider2, Provider<Context> provider3) {
        return new TargetEvaluator_Factory(provider, provider2, provider3);
    }

    public static TargetEvaluator newInstance(PackageManager packageManager, PermissionsChecker permissionsChecker, Context context) {
        return new TargetEvaluator(packageManager, permissionsChecker, context);
    }

    @Override // javax.inject.Provider
    public TargetEvaluator get() {
        return newInstance(this.packageManagerProvider.get(), this.permissionsCheckerProvider.get(), this.contextProvider.get());
    }
}
