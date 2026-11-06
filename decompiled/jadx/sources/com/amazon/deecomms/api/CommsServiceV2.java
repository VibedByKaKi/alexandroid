package com.amazon.deecomms.api;

import com.amazon.alexa.protocols.messaging.MessagingReceiver;
import com.amazon.deecomms.sharing.ContentSharingService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface CommsServiceV2 {
    ContentSharingService contentSharingService();

    MessagingReceiver conversationMessagingReceiver();

    OobeService oobeService();
}
