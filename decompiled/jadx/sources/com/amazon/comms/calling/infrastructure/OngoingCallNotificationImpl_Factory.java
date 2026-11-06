package com.amazon.comms.calling.infrastructure;

import android.app.NotificationManager;
import android.content.Context;
import com.amazon.comms.calling.data.util.Utils;
import com.amazon.comms.calling.foundation.metrics.MetricsManager;
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
public final class OngoingCallNotificationImpl_Factory implements Factory<OngoingCallNotificationImpl> {
    private final Provider<Context> contextProvider;
    private final Provider<MetricsManager> metricManagerProvider;
    private final Provider<NotificationManager> notificationManagerProvider;
    private final Provider<StringHelper> stringHelperProvider;
    private final Provider<Utils> utilsProvider;

    public OngoingCallNotificationImpl_Factory(Provider<Context> provider, Provider<NotificationManager> provider2, Provider<Utils> provider3, Provider<MetricsManager> provider4, Provider<StringHelper> provider5) {
        this.contextProvider = provider;
        this.notificationManagerProvider = provider2;
        this.utilsProvider = provider3;
        this.metricManagerProvider = provider4;
        this.stringHelperProvider = provider5;
    }

    public static OngoingCallNotificationImpl_Factory create(Provider<Context> provider, Provider<NotificationManager> provider2, Provider<Utils> provider3, Provider<MetricsManager> provider4, Provider<StringHelper> provider5) {
        return new OngoingCallNotificationImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OngoingCallNotificationImpl newInstance(Context context, NotificationManager notificationManager, Utils utils, MetricsManager metricsManager, StringHelper stringHelper) {
        return new OngoingCallNotificationImpl(context, notificationManager, utils, metricsManager, stringHelper);
    }

    @Override // javax.inject.Provider
    public OngoingCallNotificationImpl get() {
        return newInstance(this.contextProvider.get(), this.notificationManagerProvider.get(), this.utilsProvider.get(), this.metricManagerProvider.get(), this.stringHelperProvider.get());
    }
}
