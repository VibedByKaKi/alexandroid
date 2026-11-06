package com.amazon.alexa.aamb.proxy;

import com.amazon.alexa.accessory.frames.eventbus.EventBusManager;
import com.amazon.alexa.accessory.frames.eventbus.MediaImportEventBusManager;
import com.amazon.alexa.accessory.frames.eventbus.SmartPlayEventBusManager;
import com.amazon.alexa.accessory.frames.media.autoimport.AutoImportLifecycleManager;
import com.amazon.alexa.accessory.notificationpublisher.eventBus.NotificationsMultipartCapabilityAgentEventBusManager;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AambProxy$$ExternalSyntheticLambda0 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AambProxy$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    public final void handle(Message message) {
        switch (this.$r8$classId) {
            case 0:
                Objects.toString(message);
                break;
            case 1:
                EventBusManager.lambda$subscribeToEventBusMessages$0(message);
                break;
            case 2:
                EventBusManager.lambda$subscribeToEventBusMessages$1(message);
                break;
            case 3:
                MediaImportEventBusManager.lambda$initializeStatusRequestHandler$0(message);
                break;
            case 4:
                SmartPlayEventBusManager.lambda$subscribeToEventBusMessages$7(message);
                break;
            case 5:
                AutoImportLifecycleManager.subscribeToStatusRequests$lambda$0(message);
                break;
            default:
                NotificationsMultipartCapabilityAgentEventBusManager.lambda$subscribeToEventBusMessages$0(message);
                break;
        }
    }
}
