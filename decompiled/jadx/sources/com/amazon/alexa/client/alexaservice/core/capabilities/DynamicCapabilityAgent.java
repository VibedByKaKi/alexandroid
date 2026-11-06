package com.amazon.alexa.client.alexaservice.core.capabilities;

import com.amazon.alexa.client.core.capabilities.Capability;
import com.amazon.alexa.client.core.capabilities.agents.BaseCapabilityAgent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class DynamicCapabilityAgent extends BaseCapabilityAgent {
    public DynamicCapabilityAgent(Capability... capabilityArr) {
        super(capabilityArr);
    }

    public abstract boolean isEnabled();
}
