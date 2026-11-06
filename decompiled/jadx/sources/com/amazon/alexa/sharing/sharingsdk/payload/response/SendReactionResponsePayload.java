package com.amazon.alexa.sharing.sharingsdk.payload.response;

import com.amazon.alexa.sharing.repo.models.acms.payload.sharing.ACMSPayloadReaction;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SendReactionResponsePayload implements SharingSDKResponsePayload {
    public HashMap<String, String> metadata = new HashMap<>();
    public ACMSPayloadReaction payload = new ACMSPayloadReaction();
    public String name = "";
}
