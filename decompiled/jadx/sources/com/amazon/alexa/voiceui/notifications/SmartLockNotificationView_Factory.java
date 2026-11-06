package com.amazon.alexa.voiceui.notifications;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class SmartLockNotificationView_Factory implements Factory<SmartLockNotificationView> {
    private final Provider<Context> contextProvider;

    public SmartLockNotificationView_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static SmartLockNotificationView_Factory create(Provider<Context> provider) {
        return new SmartLockNotificationView_Factory(provider);
    }

    public static SmartLockNotificationView newInstance(Context context) {
        return new SmartLockNotificationView(context);
    }

    @Override // javax.inject.Provider
    public SmartLockNotificationView get() {
        return newInstance(this.contextProvider.get());
    }
}
