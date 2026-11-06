package com.amazon.deecomms.notifications;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class NotificationActivatedReceiver_MembersInjector implements MembersInjector<NotificationActivatedReceiver> {
    private final Provider<NotificationLatencyMetricHelper> mNotificationLatencyMetricHelperProvider;

    public NotificationActivatedReceiver_MembersInjector(Provider<NotificationLatencyMetricHelper> provider) {
        this.mNotificationLatencyMetricHelperProvider = provider;
    }

    public static MembersInjector<NotificationActivatedReceiver> create(Provider<NotificationLatencyMetricHelper> provider) {
        return new NotificationActivatedReceiver_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.notifications.NotificationActivatedReceiver.mNotificationLatencyMetricHelper")
    public static void injectMNotificationLatencyMetricHelper(NotificationActivatedReceiver notificationActivatedReceiver, NotificationLatencyMetricHelper notificationLatencyMetricHelper) {
        notificationActivatedReceiver.mNotificationLatencyMetricHelper = notificationLatencyMetricHelper;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NotificationActivatedReceiver notificationActivatedReceiver) {
        injectMNotificationLatencyMetricHelper(notificationActivatedReceiver, this.mNotificationLatencyMetricHelperProvider.get());
    }
}
