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
public final class ActivityLifecycleUtil_Factory implements Factory<ActivityLifecycleUtil> {
    private final Provider<Context> contextProvider;

    public ActivityLifecycleUtil_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static ActivityLifecycleUtil_Factory create(Provider<Context> provider) {
        return new ActivityLifecycleUtil_Factory(provider);
    }

    public static ActivityLifecycleUtil newInstance(Context context) {
        return new ActivityLifecycleUtil(context);
    }

    @Override // javax.inject.Provider
    public ActivityLifecycleUtil get() {
        return newInstance(this.contextProvider.get());
    }
}
