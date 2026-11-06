package com.amazon.deecomms.sharing.payload.eventBus;

import com.amazon.deecomms.sharing.payload.acms.ACMSPayloadReaction;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SendReactionEventBusPayload implements SharingEventBusPayload {
    public HashMap<String, String> metadata = new HashMap<>();
    public ACMSPayloadReaction payload = new ACMSPayloadReaction();
    public String name = "";
}
