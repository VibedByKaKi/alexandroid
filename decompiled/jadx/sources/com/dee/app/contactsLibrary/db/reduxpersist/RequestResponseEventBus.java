package com.dee.app.contactsLibrary.db.reduxpersist;

import androidx.annotation.NonNull;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;
import com.amazon.alexa.voice.events.AVSEventBusBridge$$ExternalSyntheticLambda1;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.UUID;
import javax.inject.Inject;
import rx.Observable;
import rx.subjects.PublishSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RequestResponseEventBus {
    private final String REQUEST = "REQUEST";
    private final String RESPONSE = "RESPONSE";
    private final EventBus mEventBus;

    @Inject
    public RequestResponseEventBus(@NonNull EventBus eventBus) {
        this.mEventBus = eventBus;
    }

    private String constructEventBusRequestId(String str, String str2) {
        return a$$ExternalSyntheticOutline0.m$1(str, ":REQUEST://", str2);
    }

    private String constructEventBusResponseId(String str, String str2) {
        return BitVector$$ExternalSyntheticOutline0.m(str, ":RESPONSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$processEventBus$0(String str, String str2, Message message) {
        return message != null && str.equals(message.getEventType()) && message.getPayloadAsString().contains(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processEventBus$1(PublishSubject publishSubject, Message message) {
        publishSubject.onNext(message.getPayloadAsString());
    }

    public Observable<String> processEventBus(String str, String str2) {
        final String uuid = UUID.randomUUID().toString();
        this.mEventBus.lambda$getPublisher$0(new Message.Builder().setEventType(constructEventBusRequestId(str, uuid)).setPayload(str2).build());
        PublishSubject create = PublishSubject.create();
        final String constructEventBusResponseId = constructEventBusResponseId(str, uuid);
        this.mEventBus.getSubscriber().subscribeFilter(new MessageFilter() { // from class: com.dee.app.contactsLibrary.db.reduxpersist.RequestResponseEventBus$$ExternalSyntheticLambda0
            @Override // com.amazon.alexa.eventbus.api.MessageFilter
            public final boolean isMatch(Message message) {
                boolean lambda$processEventBus$0;
                lambda$processEventBus$0 = RequestResponseEventBus.lambda$processEventBus$0(constructEventBusResponseId, uuid, message);
                return lambda$processEventBus$0;
            }
        }, new AVSEventBusBridge$$ExternalSyntheticLambda1(create, 19));
        return create.asObservable();
    }
}
