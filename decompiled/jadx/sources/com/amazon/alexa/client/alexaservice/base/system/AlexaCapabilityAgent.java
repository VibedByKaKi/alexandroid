package com.amazon.alexa.client.alexaservice.base.system;

import android.util.Log;
import com.amazon.alexa.client.alexaservice.base.capabilities.discovery.DiscoveryFeatureChecker;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.alexaservice.core.capabilities.DynamicCapabilityAgent;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.core.capabilities.Capability;
import com.amazon.alexa.client.core.messages.Message;
import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.client.core.messagesequencer.MessageProcessingCallbacks;
import com.google.gson.JsonElement;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaCapabilityAgent extends DynamicCapabilityAgent {
    private static final String TAG = "AlexaCapabilityAgent";
    private final DiscoveryFeatureChecker discoveryFeatureChecker;
    private final AlexaClientEventBus eventBus;

    @Inject
    public AlexaCapabilityAgent(AlexaClientEventBus alexaClientEventBus, DiscoveryFeatureChecker discoveryFeatureChecker) {
        super(new Capability[0]);
        this.eventBus = alexaClientEventBus;
        this.discoveryFeatureChecker = discoveryFeatureChecker;
    }

    @Override // com.amazon.alexa.client.core.capabilities.agents.BaseCapabilityAgent, com.amazon.alexa.client.core.capabilities.agents.CapabilityAgent
    public Set<Capability> getCapabilities() {
        return Collections.singleton(Capability.create(AvsApiConstants.Alexa.CAPABILITY, "3.0"));
    }

    @Override // com.amazon.alexa.client.alexaservice.core.capabilities.DynamicCapabilityAgent
    public boolean isEnabled() {
        return this.discoveryFeatureChecker.isV3PublishEnabled();
    }

    @Override // com.amazon.alexa.client.core.capabilities.agents.BaseCapabilityAgent
    public void onProcess(Message message, MessageProcessingCallbacks messageProcessingCallbacks) {
        Name name = message.getHeader().getName();
        String str = TAG;
        name.getValue();
        if (AvsApiConstants.System.Directives.ReportState.NAME.equals(name)) {
            this.eventBus.post(ReportStateEvent.create());
        } else if (AvsApiConstants.Alexa.Directives.EventProcessed.NAME.equals(name)) {
            JsonElement jsonElement = message.getHeader().getAdditionalFields().get("eventCorrelationToken");
            if (jsonElement != null) {
                this.eventBus.post(EventProcessedEvent.create(jsonElement.getAsString()));
            } else {
                Log.w(str, "Event was successful, but no event correlation token was found");
            }
        }
        messageProcessingCallbacks.onFinished();
    }
}
