package com.amazon.alexa.sendtoapp.notification;

import android.content.Context;
import com.amazon.alexa.protocols.messaging.MessagingReceiver;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class SendToAppMessagingReceiverModule {
    @Provides
    @IntoSet
    public MessagingReceiver providesSendToAppMessagingReceiver(Context context) {
        return new SendToAppMessagingReceiver(context, new SendToAppNotifications(context));
    }
}
