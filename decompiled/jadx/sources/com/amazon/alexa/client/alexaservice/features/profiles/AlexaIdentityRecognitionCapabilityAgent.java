package com.amazon.alexa.client.alexaservice.features.profiles;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.core.capabilities.Capability;
import com.amazon.alexa.client.core.capabilities.agents.BaseCapabilityAgent;
import com.amazon.alexa.client.core.messages.Message;
import com.amazon.alexa.client.core.messagesequencer.MessageProcessingCallbacks;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaIdentityRecognitionCapabilityAgent extends BaseCapabilityAgent {
    private static final String IS_1P_DEVICE = "is1pDevice";
    private static final String TAG = "AlexaIdentityRecognitionCapabilityAgent";

    @Inject
    public AlexaIdentityRecognitionCapabilityAgent() {
        super(Capability.create(AvsApiConstants.Alexa.Identity.Recognition.CAPABILITY, "1.3", getConfigurations()));
    }

    private static JsonObject getConfigurations() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add(IS_1P_DEVICE, new JsonPrimitive(Boolean.FALSE));
        return jsonObject;
    }

    @Override // com.amazon.alexa.client.core.capabilities.agents.BaseCapabilityAgent
    public void onProcess(@NonNull Message message, @NonNull MessageProcessingCallbacks messageProcessingCallbacks) {
        Log.e(TAG, "onProcess called for Alexa.Identity.Recognition capability but its directives are not supported");
        messageProcessingCallbacks.onFinished();
    }
}
