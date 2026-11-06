package com.amazon.alexa.mobilytics.integration.ama.message.eventBus;

import androidx.annotation.NonNull;
import com.amazon.alexa.benefits.AppEventObserver$$ExternalSyntheticLambda0;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.mobilytics.identity.message.MobilyticsMessageListener;
import com.amazon.alexa.mobilytics.identity.message.MobilyticsMessageProvider;
import com.amazon.alexa.mobilytics.identity.message.eventBus.MobilyticsEventBusMessageType;
import com.amazon.alexa.mobilytics.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MobilyticsEventBusMessageProvider implements MobilyticsMessageProvider {
    private static final String TAG = Log.tag((Class<?>) MobilyticsEventBusMessageProvider.class);
    List<MobilyticsMessageListener> listeners = new ArrayList();

    public MobilyticsEventBusMessageProvider(@NonNull EventBus eventBus) {
        MultiFilterSubscriber newSubscriber = eventBus.getNewSubscriber();
        if (newSubscriber != null) {
            final int i = 0;
            newSubscriber.subscribeFilter(new AppEventObserver$$ExternalSyntheticLambda0(24), new MessageHandler(this) { // from class: com.amazon.alexa.mobilytics.integration.ama.message.eventBus.MobilyticsEventBusMessageProvider$$ExternalSyntheticLambda1
                public final /* synthetic */ MobilyticsEventBusMessageProvider f$0;

                {
                    this.f$0 = this;
                }

                @Override // com.amazon.alexa.eventbus.api.MessageHandler
                /* renamed from: handle */
                public final void lambda$subscribe$1(Message message) {
                    int i2 = i;
                    MobilyticsEventBusMessageProvider mobilyticsEventBusMessageProvider = this.f$0;
                    switch (i2) {
                        case 0:
                            mobilyticsEventBusMessageProvider.lambda$new$1(message);
                            break;
                        default:
                            mobilyticsEventBusMessageProvider.lambda$new$3(message);
                            break;
                    }
                }
            });
            final int i2 = 1;
            newSubscriber.subscribeFilter(new AppEventObserver$$ExternalSyntheticLambda0(25), new MessageHandler(this) { // from class: com.amazon.alexa.mobilytics.integration.ama.message.eventBus.MobilyticsEventBusMessageProvider$$ExternalSyntheticLambda1
                public final /* synthetic */ MobilyticsEventBusMessageProvider f$0;

                {
                    this.f$0 = this;
                }

                @Override // com.amazon.alexa.eventbus.api.MessageHandler
                /* renamed from: handle */
                public final void lambda$subscribe$1(Message message) {
                    int i22 = i2;
                    MobilyticsEventBusMessageProvider mobilyticsEventBusMessageProvider = this.f$0;
                    switch (i22) {
                        case 0:
                            mobilyticsEventBusMessageProvider.lambda$new$1(message);
                            break;
                        default:
                            mobilyticsEventBusMessageProvider.lambda$new$3(message);
                            break;
                    }
                }
            });
        }
    }

    private void callListeners(MobilyticsEventBusMessageType mobilyticsEventBusMessageType) {
        Iterator<MobilyticsMessageListener> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            it2.next().onMessageReceived(mobilyticsEventBusMessageType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(Message message) {
        return MobilyticsEventBusMessageType.SERVICES_CAN_START.toString().equals(message.getEventType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Message message) {
        Log.i(TAG, "Received service start signal");
        callListeners(MobilyticsEventBusMessageType.SERVICES_CAN_START);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$2(Message message) {
        return MobilyticsEventBusMessageType.BMCL_INITIALIZE.toString().equals(message.getEventType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3(Message message) {
        Log.i(TAG, "Received BMCL initialize signal");
        callListeners(MobilyticsEventBusMessageType.BMCL_INITIALIZE);
    }

    @Override // com.amazon.alexa.mobilytics.identity.message.MobilyticsMessageProvider
    public void addListener(MobilyticsMessageListener mobilyticsMessageListener) {
        this.listeners.add(mobilyticsMessageListener);
    }

    @Override // com.amazon.alexa.mobilytics.identity.message.MobilyticsMessageProvider
    public void removeListeners() {
        this.listeners.clear();
    }
}
