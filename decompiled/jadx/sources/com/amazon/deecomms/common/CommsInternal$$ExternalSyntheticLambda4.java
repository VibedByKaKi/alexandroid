package com.amazon.deecomms.common;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;
import com.amazon.deecomms.conversation.CommsConversationService;
import com.amazon.deecomms.conversation.CommsConversationUIService;
import com.amazon.deecomms.core.decoupling.AlexaCommsServiceImpl;
import com.amazon.deecomms.media.photos.FileTransmitter;
import com.amazon.deecomms.media.photos.MAPAuthenticatedURLConnectionFactory;
import com.amazon.deecomms.media.photos.SharedPreferenceEndpointsCache;
import com.amazon.deecomms.services.CommsServiceV2Impl;
import com.amazon.matter.eventbus.EventBusManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsInternal$$ExternalSyntheticLambda4 implements MessageFilter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CommsInternal$$ExternalSyntheticLambda4(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageFilter
    public final boolean isMatch(Message message) {
        boolean lambda$subscribeEventBusListeners$0;
        boolean lambda$subscribeEventBusListeners$2;
        boolean lambda$subscribeForConversationUpdateEvent$7;
        boolean lambda$initializeComms$0;
        boolean lambda$start$0;
        boolean lambda$initialize$0;
        boolean lambda$initialize$2;
        boolean lambda$initialize$4;
        boolean lambda$initialize$6;
        boolean lambda$observeUserChanges$0;
        boolean lambda$new$0;
        boolean lambda$new$02;
        boolean lambda$initializeComponent$0;
        boolean lambda$initializeComponent$2;
        boolean lambda$initializeComponent$4;
        boolean lambda$initializeComponent$6;
        boolean lambda$startListening$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$subscribeEventBusListeners$0 = CommsInternal.lambda$subscribeEventBusListeners$0(message);
                return lambda$subscribeEventBusListeners$0;
            case 1:
                lambda$subscribeEventBusListeners$2 = CommsInternal.lambda$subscribeEventBusListeners$2(message);
                return lambda$subscribeEventBusListeners$2;
            case 2:
                lambda$subscribeForConversationUpdateEvent$7 = CommsInternal.lambda$subscribeForConversationUpdateEvent$7(message);
                return lambda$subscribeForConversationUpdateEvent$7;
            case 3:
                lambda$initializeComms$0 = CommsConversationService.lambda$initializeComms$0(message);
                return lambda$initializeComms$0;
            case 4:
                lambda$start$0 = CommsConversationUIService.lambda$start$0(message);
                return lambda$start$0;
            case 5:
                lambda$initialize$0 = AlexaCommsServiceImpl.lambda$initialize$0(message);
                return lambda$initialize$0;
            case 6:
                lambda$initialize$2 = AlexaCommsServiceImpl.lambda$initialize$2(message);
                return lambda$initialize$2;
            case 7:
                lambda$initialize$4 = AlexaCommsServiceImpl.lambda$initialize$4(message);
                return lambda$initialize$4;
            case 8:
                lambda$initialize$6 = AlexaCommsServiceImpl.lambda$initialize$6(message);
                return lambda$initialize$6;
            case 9:
                lambda$observeUserChanges$0 = FileTransmitter.lambda$observeUserChanges$0(message);
                return lambda$observeUserChanges$0;
            case 10:
                lambda$new$0 = MAPAuthenticatedURLConnectionFactory.lambda$new$0(message);
                return lambda$new$0;
            case 11:
                lambda$new$02 = SharedPreferenceEndpointsCache.lambda$new$0(message);
                return lambda$new$02;
            case 12:
                lambda$initializeComponent$0 = CommsServiceV2Impl.lambda$initializeComponent$0(message);
                return lambda$initializeComponent$0;
            case 13:
                lambda$initializeComponent$2 = CommsServiceV2Impl.lambda$initializeComponent$2(message);
                return lambda$initializeComponent$2;
            case 14:
                lambda$initializeComponent$4 = CommsServiceV2Impl.lambda$initializeComponent$4(message);
                return lambda$initializeComponent$4;
            case 15:
                lambda$initializeComponent$6 = CommsServiceV2Impl.lambda$initializeComponent$6(message);
                return lambda$initializeComponent$6;
            default:
                lambda$startListening$0 = EventBusManager.lambda$startListening$0(message);
                return lambda$startListening$0;
        }
    }
}
