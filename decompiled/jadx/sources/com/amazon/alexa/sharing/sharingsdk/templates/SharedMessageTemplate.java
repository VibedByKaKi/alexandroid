package com.amazon.alexa.sharing.sharingsdk.templates;

import com.amazon.alexa.sharing.api.exceptions.AlexaSharingSDKException;
import com.amazon.alexa.sharing.sharingsdk.payload.ReactMessageMetadata;
import com.amazon.alexa.sharing.sharingsdk.payload.response.SharingSDKResponsePayload;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface SharedMessageTemplate {
    ReactMessageMetadata getMessageMetadata();

    HashMap<String, String> getMetadata();

    String getTemplateName();

    boolean isValidTemplate();

    SharingSDKResponsePayload toResponsePayload() throws AlexaSharingSDKException;
}
