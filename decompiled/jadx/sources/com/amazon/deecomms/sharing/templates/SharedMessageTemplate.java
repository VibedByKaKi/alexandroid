package com.amazon.deecomms.sharing.templates;

import com.amazon.deecomms.sharing.exceptions.SharingSDKException;
import com.amazon.deecomms.sharing.payload.eventBus.SharingEventBusPayload;
import com.amazon.deecomms.sharing.payload.parse.ReactMessageMetadata;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface SharedMessageTemplate {
    ReactMessageMetadata getMessageMetadata();

    HashMap<String, String> getMetadata();

    String getTemplateName();

    boolean isValidTemplate();

    SharingEventBusPayload toEventBusPayload() throws SharingSDKException;
}
