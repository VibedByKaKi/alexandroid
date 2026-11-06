package com.amazon.alexa.handsfree.notification.dependencies;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.notification.NotificationModule;
import com.amazon.alexa.handsfree.notification.NotificationOccurrenceCounter;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class FalcoNotificationsModule {
    @NonNull
    @Provides
    public NotificationModule provideNotificationModule() {
        return NotificationModule.getInstance();
    }

    @NonNull
    @Provides
    public NotificationOccurrenceCounter provideNotificationOccurrenceCounter() {
        return NotificationOccurrenceCounter.getInstance();
    }
}
