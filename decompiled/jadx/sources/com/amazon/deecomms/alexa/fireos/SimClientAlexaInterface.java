package com.amazon.deecomms.alexa.fireos;

import amazon.speech.simclient.context.ContextClient;
import amazon.speech.simclient.context.DeviceContextAddCallback;
import amazon.speech.simclient.context.DeviceContextAddResult;
import amazon.speech.simclient.event.EventClient;
import amazon.speech.simclient.focus.ExplicitFocusClient;
import amazon.speech.simclient.focus.FocusModificationCallback;
import amazon.speech.simclient.focus.FocusModificationResult;
import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.comms.models.device.DirectivePayloadVersion;
import com.amazon.deecomms.accessories.AccessoriesHardwareIntentHandler$$ExternalSyntheticOutline0;
import com.amazon.deecomms.alexa.AlexaInterface;
import com.amazon.deecomms.alexa.InCallEvent;
import com.amazon.deecomms.common.Constants;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SimClientAlexaInterface implements AlexaInterface {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, SimClientAlexaInterface.class);
    private Optional<ContextClient> contextClient;
    private Optional<EventClient> eventClient;
    private Optional<ExplicitFocusClient> focusClient;
    private final Set<SimEventListener> simEventListeners = Sets.newConcurrentHashSet();
    private ObjectMapper objectMapper = new ObjectMapper();
    private SimEventSender mSimEventSender = new SimEventSender(this);

    public SimClientAlexaInterface(Context context) {
        this.eventClient = EventClient.isEventServiceAvailable(context) ? Optional.of(new EventClient(context)) : Optional.empty();
        this.focusClient = ExplicitFocusClient.isFocusServiceAvailable(context) ? Optional.of(new ExplicitFocusClient(context)) : Optional.empty();
        this.contextClient = ContextClient.isContextServiceAvailable(context) ? Optional.of(new ContextClient(context)) : Optional.empty();
        sendDeviceContextVersion();
    }

    private void sendDeviceContextVersion() {
        if (!this.contextClient.isPresent()) {
            LOG.e("No context client!");
            return;
        }
        try {
            CommsLogger commsLogger = LOG;
            commsLogger.i("Sending device context version");
            commsLogger.i("Sending device context version : " + this.contextClient.get().addDeviceContext("SipClient", "SipClient", this.objectMapper.writeValueAsString(DirectivePayloadVersion.builder().version("1.0").build()), true, new DeviceContextAddCallback() { // from class: com.amazon.deecomms.alexa.fireos.SimClientAlexaInterface.3
                @Override // amazon.speech.simclient.context.DeviceContextAddCallback
                public void onFinished(DeviceContextAddResult deviceContextAddResult) {
                    SimClientAlexaInterface.LOG.i("Device context sent with result : " + deviceContextAddResult.toString());
                }
            }));
        } catch (JsonProcessingException e) {
            LOG.e(String.format("Error updating device context: %s", e));
        }
    }

    @Override // com.amazon.deecomms.alexa.AlexaInterface
    public void acquireCommsFocus() {
        if (this.focusClient.isPresent()) {
            AccessoriesHardwareIntentHandler$$ExternalSyntheticOutline0.m("Comms focus acquire requested with result :", this.focusClient.get().acquireFocus("SipClient", 4, new FocusModificationCallback() { // from class: com.amazon.deecomms.alexa.fireos.SimClientAlexaInterface.1
                @Override // amazon.speech.simclient.focus.FocusModificationCallback
                public void onFinished(FocusModificationResult focusModificationResult) {
                    SimClientAlexaInterface.LOG.i("Comms focus acquired with result :" + focusModificationResult.toString());
                }
            }), LOG);
        } else {
            LOG.i("No active focus client. Unable to acquire comms focus");
        }
    }

    public synchronized void addListener(SimEventListener simEventListener) {
        this.simEventListeners.add(simEventListener);
    }

    public synchronized Optional<ContextClient> getContextClient() {
        return this.contextClient;
    }

    public synchronized Optional<EventClient> getEventClient() {
        return this.eventClient;
    }

    public Set<SimEventListener> getSimEventListeners() {
        return this.simEventListeners;
    }

    @Override // com.amazon.deecomms.alexa.AlexaInterface
    public void releaseCommsFocus() {
        if (this.focusClient.isPresent()) {
            AccessoriesHardwareIntentHandler$$ExternalSyntheticOutline0.m("Comms focus release requested with result :", this.focusClient.get().releaseFocus("SipClient", 4, new FocusModificationCallback() { // from class: com.amazon.deecomms.alexa.fireos.SimClientAlexaInterface.2
                @Override // amazon.speech.simclient.focus.FocusModificationCallback
                public void onFinished(FocusModificationResult focusModificationResult) {
                    SimClientAlexaInterface.LOG.i("Comms focus released with result :" + focusModificationResult.toString());
                }
            }), LOG);
        } else {
            LOG.i("No active focus client. Unable to acquire comms focus");
        }
    }

    @Override // com.amazon.deecomms.alexa.AlexaInterface
    public boolean sendCommsEvent(@NonNull InCallEvent inCallEvent) {
        return this.mSimEventSender.sendEvent(inCallEvent);
    }
}
