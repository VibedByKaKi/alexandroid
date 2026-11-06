package com.amazon.alexa.handsfree.notification.dependencies;

import com.amazon.alexa.handsfree.notification.NotificationModule;
import com.amazon.alexa.handsfree.notification.NotificationOccurrenceCounter;
import dagger.Component;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {FalcoNotificationsModule.class})
@FalcoNotificationsScope
/* loaded from: classes17.dex */
public interface FalcoNotificationsComponent {
    NotificationModule notificationModule();

    NotificationOccurrenceCounter notificationOccurrenceCounter();
}
