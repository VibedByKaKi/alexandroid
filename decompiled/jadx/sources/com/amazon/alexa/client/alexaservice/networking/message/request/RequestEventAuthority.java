package com.amazon.alexa.client.alexaservice.networking.message.request;

import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ResponseCompletedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.ResponsePendingEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.SendMessageEvent;
import com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.client.core.messages.Message;
import com.amazon.alexa.client.core.messages.MessageMetadata;
import com.amazon.alexa.client.core.messages.Namespace;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class RequestEventAuthority {
    private static final String TAG = "RequestEventAuthority";
    private final AlexaClientEventBus eventBus;
    private final Map<RequestIdentifier, SendMessageEvent> records = new HashMap();
    private final Map<RequestIdentifier, List<Message>> responses = new HashMap();
    private final Map<SendMessageEvent, RequestIdentifier> messageToRequestIdMap = new HashMap();

    @Inject
    public RequestEventAuthority(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
    }

    private MessageMetadata getMessageMetadata(String str, Message message) {
        return MessageMetadata.create(str, message.hasDialogRequestIdentifier() ? message.getDialogRequestIdentifier() : message.getMessageMetadata().getOriginatingDialogRequestIdentifier());
    }

    public synchronized void addResponse(RequestIdentifier requestIdentifier, Message message, @Nullable String str) {
        try {
            String.format("Adding response to request. ReqId=%s, Response=%s", requestIdentifier, message);
            List<Message> list = this.responses.get(requestIdentifier);
            SendMessageEvent sendMessageEvent = this.records.get(requestIdentifier);
            if (sendMessageEvent != null) {
                message.setMessageMetadata(getMessageMetadata(str, sendMessageEvent.getMessage()));
                sendMessageEvent.getSendMessageCallback().onMessageReceived(requestIdentifier, message);
            } else {
                message.setMessageMetadata(MessageMetadata.create(str, DialogRequestIdentifier.NONE));
            }
            if (list != null) {
                list.add(message);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean contains(RequestIdentifier requestIdentifier) {
        return this.records.containsKey(requestIdentifier);
    }

    public synchronized boolean expectingMoreResponse(RequestIdentifier requestIdentifier) {
        List<Message> list = this.responses.get(requestIdentifier);
        boolean z = false;
        if (list == null) {
            return false;
        }
        boolean z2 = false;
        for (Message message : list) {
            Namespace namespace = AvsApiConstants.InteractionModel.NAMESPACE;
            if (AvsApiConstants.isMessage(namespace, AvsApiConstants.InteractionModel.Directives.RequestProcessingCompleted.NAME, message)) {
                z2 = true;
            }
            if (AvsApiConstants.isMessage(namespace, AvsApiConstants.InteractionModel.Directives.RequestProcessingStarted.NAME, message)) {
                z = true;
            }
        }
        return (!z2) & z;
    }

    public synchronized boolean finishEvent(RequestIdentifier requestIdentifier, boolean z, @Nullable Integer num, @Nullable Exception exc) {
        try {
            String str = TAG;
            String.format("Finishing event. ReqId=%s, Success=%b", requestIdentifier, Boolean.valueOf(z));
            List<Message> remove = this.responses.remove(requestIdentifier);
            SendMessageEvent remove2 = this.records.remove(requestIdentifier);
            this.messageToRequestIdMap.remove(remove2);
            if (remove2 == null) {
                return false;
            }
            SendMessageCallback sendMessageCallback = remove2.getSendMessageCallback();
            if (requestIdentifier.getDialogRequestIdentifier() != null && remove != null) {
                Log.i(str, String.format("DialogRequestId %s had %d directive(s).", requestIdentifier.getDialogRequestIdentifier().getValue(), Integer.valueOf(remove.size())));
            }
            if (z) {
                if (remove == null) {
                    remove = Collections.EMPTY_LIST;
                }
                sendMessageCallback.onSuccess(requestIdentifier, remove);
            } else {
                sendMessageCallback.onFailure(requestIdentifier, num, exc);
            }
            this.eventBus.post(ResponseCompletedEvent.create(requestIdentifier));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public synchronized String getEventName(RequestIdentifier requestIdentifier) {
        if (!this.records.containsKey(requestIdentifier)) {
            return null;
        }
        return this.records.get(requestIdentifier).getMessage().getHeader().getName().getValue();
    }

    public synchronized boolean hasReceivedRequestProcessingCompleted(RequestIdentifier requestIdentifier) {
        List<Message> list = this.responses.get(requestIdentifier);
        if (list == null) {
            return false;
        }
        Iterator<Message> it2 = list.iterator();
        while (it2.hasNext()) {
            if (AvsApiConstants.isMessage(AvsApiConstants.InteractionModel.NAMESPACE, AvsApiConstants.InteractionModel.Directives.RequestProcessingCompleted.NAME, it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants.Alexa.Conversation.NAMESPACE.equals(r3) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean isTextDialog(com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            if (r3 != 0) goto L6
            monitor-exit(r2)
            return r0
        L6:
            java.util.Map<com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier, com.amazon.alexa.client.alexaservice.eventing.events.SendMessageEvent> r1 = r2.records     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L38
            java.util.Map<com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier, com.amazon.alexa.client.alexaservice.eventing.events.SendMessageEvent> r1 = r2.records     // Catch: java.lang.Throwable -> L33
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L33
            com.amazon.alexa.client.alexaservice.eventing.events.SendMessageEvent r3 = (com.amazon.alexa.client.alexaservice.eventing.events.SendMessageEvent) r3     // Catch: java.lang.Throwable -> L33
            com.amazon.alexa.client.core.messages.Message r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L33
            com.amazon.alexa.client.core.messages.Header r3 = r3.getHeader()     // Catch: java.lang.Throwable -> L33
            com.amazon.alexa.client.core.messages.Namespace r3 = r3.getNamespace()     // Catch: java.lang.Throwable -> L33
            com.amazon.alexa.client.core.messages.Namespace r1 = com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants.Input.Text.NAMESPACE     // Catch: java.lang.Throwable -> L33
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L35
            com.amazon.alexa.client.core.messages.Namespace r1 = com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants.Alexa.Conversation.NAMESPACE     // Catch: java.lang.Throwable -> L33
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L36
            goto L35
        L33:
            r3 = move-exception
            goto L3a
        L35:
            r0 = 1
        L36:
            monitor-exit(r2)
            return r0
        L38:
            monitor-exit(r2)
            return r0
        L3a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.client.alexaservice.networking.message.request.RequestEventAuthority.isTextDialog(com.amazon.alexa.client.alexaservice.dialog.core.RequestIdentifier):boolean");
    }

    public synchronized boolean responseContainsSpeech(RequestIdentifier requestIdentifier) {
        List<Message> list = this.responses.get(requestIdentifier);
        if (list == null) {
            return false;
        }
        Iterator<Message> it2 = list.iterator();
        while (it2.hasNext()) {
            if (AvsApiConstants.isMessage(AvsApiConstants.SpeechSynthesizer.NAMESPACE, AvsApiConstants.SpeechSynthesizer.Directives.Speak.NAME, it2.next())) {
                return true;
            }
        }
        return false;
    }

    public synchronized void startEvent(RequestIdentifier requestIdentifier, SendMessageEvent sendMessageEvent) {
        String.format("Starting event. ReqId=%s, Event=%s", requestIdentifier, sendMessageEvent);
        this.records.put(requestIdentifier, sendMessageEvent);
        this.responses.put(requestIdentifier, new LinkedList());
        this.messageToRequestIdMap.put(sendMessageEvent, requestIdentifier);
        this.eventBus.post(ResponsePendingEvent.create(requestIdentifier));
    }

    public synchronized boolean finishEvent(SendMessageEvent sendMessageEvent, boolean z, @Nullable Integer num, @Nullable Exception exc) {
        boolean z2;
        String.format("Finishing event. Event=%s, Success=%b", sendMessageEvent, Boolean.valueOf(z));
        RequestIdentifier requestIdentifier = this.messageToRequestIdMap.get(sendMessageEvent);
        if (requestIdentifier != null) {
            z2 = finishEvent(requestIdentifier, z, num, exc);
        }
        return z2;
    }
}
