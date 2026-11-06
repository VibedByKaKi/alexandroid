package com.amazon.alexa.eventbus.subscriber;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.eventbus.api.Subscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SimpleMultiFilterSubscriber implements MultiFilterSubscriber {

    @VisibleForTesting
    final Map<MultiFilterSubscriber.FilterUuid, FilterHandler> handlers = new ConcurrentHashMap();
    private final Subscriber.SubscriberUuid uuid = new SubscriberUuidImpl();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class FilterHandler {
        private final MessageFilter filter;
        private final MessageHandler handler;
        private final MultiFilterSubscriber.FilterUuid uuid = new FilterUuidImpl();

        public FilterHandler(@NonNull MessageFilter messageFilter, @NonNull MessageHandler messageHandler) {
            this.filter = messageFilter;
            this.handler = messageHandler;
        }

        public MessageFilter getFilter() {
            return this.filter;
        }

        public MultiFilterSubscriber.FilterUuid getFilterUuid() {
            return this.uuid;
        }

        public MessageHandler getHandler() {
            return this.handler;
        }
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    public Subscriber.SubscriberUuid getSubscriberUuid() {
        return this.uuid;
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    public UUID getUUID() {
        return this.uuid.getUuid();
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    public void onMessageReceived(@NonNull Message message) {
        ArrayList arrayList = new ArrayList();
        for (FilterHandler filterHandler : this.handlers.values()) {
            if (filterHandler.getFilter().isMatch(message)) {
                arrayList.add(filterHandler.getHandler());
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((MessageHandler) it2.next()).lambda$subscribe$1(message);
        }
    }

    @Override // com.amazon.alexa.eventbus.api.MultiFilterSubscriber
    @Deprecated
    public UUID subscribe(@NonNull MessageFilter messageFilter, @NonNull MessageHandler messageHandler) {
        return subscribeFilter(messageFilter, messageHandler).getUuid();
    }

    @Override // com.amazon.alexa.eventbus.api.MultiFilterSubscriber
    public MultiFilterSubscriber.FilterUuid subscribeFilter(@NonNull MessageFilter messageFilter, @NonNull MessageHandler messageHandler) {
        FilterHandler filterHandler = new FilterHandler(messageFilter, messageHandler);
        this.handlers.put(filterHandler.getFilterUuid(), filterHandler);
        return filterHandler.getFilterUuid();
    }

    @Override // com.amazon.alexa.eventbus.api.Subscriber
    public boolean supportsMessage(@NonNull Message message) {
        Iterator<FilterHandler> it2 = this.handlers.values().iterator();
        while (it2.hasNext()) {
            if (it2.next().getFilter().isMatch(message)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.eventbus.api.MultiFilterSubscriber
    @Deprecated
    public void unsubscribe(@NonNull UUID uuid) {
        for (MultiFilterSubscriber.FilterUuid filterUuid : this.handlers.keySet()) {
            if (filterUuid.getUuid().equals(uuid)) {
                this.handlers.remove(filterUuid);
                return;
            }
        }
    }

    @Override // com.amazon.alexa.eventbus.api.MultiFilterSubscriber
    public boolean unsubscribeFilter(@NonNull MultiFilterSubscriber.FilterUuid filterUuid) {
        return this.handlers.remove(filterUuid) != null;
    }
}
