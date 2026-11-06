package com.dee.app.contacts.common.utils;

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
/* loaded from: classes6.dex */
public final class PermissionsUtils_Factory implements Factory<PermissionsUtils> {
    private final Provider<ActivityLifecycleUtil> activityLifecycleUtilProvider;
    private final Provider<Context> contextProvider;

    public PermissionsUtils_Factory(Provider<ActivityLifecycleUtil> provider, Provider<Context> provider2) {
        this.activityLifecycleUtilProvider = provider;
        this.contextProvider = provider2;
    }

    public static PermissionsUtils_Factory create(Provider<ActivityLifecycleUtil> provider, Provider<Context> provider2) {
        return new PermissionsUtils_Factory(provider, provider2);
    }

    public static PermissionsUtils newInstance(ActivityLifecycleUtil activityLifecycleUtil, Context context) {
        return new PermissionsUtils(activityLifecycleUtil, context);
    }

    @Override // javax.inject.Provider
    public PermissionsUtils get() {
        return newInstance(this.activityLifecycleUtilProvider.get(), this.contextProvider.get());
    }
}
