package com.amazon.deecomms.alexa;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.api.compat.model.AlexaCapability;
import com.amazon.alexa.api.compat.model.AlexaCapabilityAgentServiceV2;
import com.amazon.alexa.api.compat.model.AlexaDirective;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.core.CapabilitiesManager;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerDirectiveHandler;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MessagingControllerCapabilityAgent extends AlexaCapabilityAgentServiceV2 {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, MessagingControllerCapabilityAgent.class);

    @Inject
    CapabilitiesManager capabilitiesManager;

    @Inject
    Context context;

    @Override // com.amazon.alexa.api.compat.model.AlexaCapabilityAgentServiceV2
    public Set<AlexaCapability> getCapabilities() {
        return Collections.singleton(new AlexaCapability("AlexaInterface", MessagingControllerConstant.MESSAGING_CONTROLLER_NAMESPACE, "0.1", null, null));
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaCapabilityAgentServiceV2, android.app.Service
    public void onCreate() {
        CommsDaggerWrapper.getComponent().inject(this);
        super.onCreate();
        LOG.i("MessagingControllerCapabilityAgent created");
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaCapabilityAgentServiceV2
    public boolean process(@NonNull AlexaDirective alexaDirective) {
        return new MessagingControllerDirectiveHandler(this.capabilitiesManager).handleDirective(this.context, alexaDirective.getName(), alexaDirective.getAlexaPayload().getPayload());
    }
}
