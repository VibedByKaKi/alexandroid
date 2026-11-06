package com.amazon.alexa.app.notification.messaging;

import androidx.annotation.NonNull;
import com.amazon.alexa.protocols.messaging.MessagingReceiver;
import com.amazon.alexa.protocols.messaging.MessagingService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class UnsupportedMessagingService implements MessagingService {
    @Override // com.amazon.alexa.protocols.messaging.MessagingService
    public void registerReceiver(@NonNull MessagingReceiver messagingReceiver) {
    }

    @Override // com.amazon.alexa.protocols.messaging.MessagingService
    public void registerReceiverWithHigherPriority(@NonNull MessagingReceiver messagingReceiver) {
    }

    @Override // com.amazon.alexa.protocols.messaging.MessagingService
    public void unregisterReceiver(@NonNull MessagingReceiver messagingReceiver) {
    }
}
