package com.amazon.comms.calling.infrastructure;

import android.app.NotificationManager;
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
public final class HeadsupNotification_Factory implements Factory<HeadsupNotification> {
    private final Provider<Context> contextProvider;
    private final Provider<NotificationManager> notificationManagerProvider;
    private final Provider<Utils> utilsProvider;

    public HeadsupNotification_Factory(Provider<Context> provider, Provider<NotificationManager> provider2, Provider<Utils> provider3) {
        this.contextProvider = provider;
        this.notificationManagerProvider = provider2;
        this.utilsProvider = provider3;
    }

    public static HeadsupNotification_Factory create(Provider<Context> provider, Provider<NotificationManager> provider2, Provider<Utils> provider3) {
        return new HeadsupNotification_Factory(provider, provider2, provider3);
    }

    public static HeadsupNotification newInstance(Context context, NotificationManager notificationManager, Utils utils) {
        return new HeadsupNotification(context, notificationManager, utils);
    }

    @Override // javax.inject.Provider
    public HeadsupNotification get() {
        return newInstance(this.contextProvider.get(), this.notificationManagerProvider.get(), this.utilsProvider.get());
    }
}
