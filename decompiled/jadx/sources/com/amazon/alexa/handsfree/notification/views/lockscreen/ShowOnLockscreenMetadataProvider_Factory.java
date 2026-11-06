package com.amazon.alexa.handsfree.notification.views.lockscreen;

import com.amazon.alexa.handsfree.notification.views.NotificationStateProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class ShowOnLockscreenMetadataProvider_Factory implements Factory<ShowOnLockscreenMetadataProvider> {
    private final Provider<NotificationStateProvider> notificationStateProvider;

    public ShowOnLockscreenMetadataProvider_Factory(Provider<NotificationStateProvider> provider) {
        this.notificationStateProvider = provider;
    }

    public static ShowOnLockscreenMetadataProvider_Factory create(Provider<NotificationStateProvider> provider) {
        return new ShowOnLockscreenMetadataProvider_Factory(provider);
    }

    public static ShowOnLockscreenMetadataProvider newInstance(NotificationStateProvider notificationStateProvider) {
        return new ShowOnLockscreenMetadataProvider(notificationStateProvider);
    }

    @Override // javax.inject.Provider
    public ShowOnLockscreenMetadataProvider get() {
        return newInstance(this.notificationStateProvider.get());
    }
}
