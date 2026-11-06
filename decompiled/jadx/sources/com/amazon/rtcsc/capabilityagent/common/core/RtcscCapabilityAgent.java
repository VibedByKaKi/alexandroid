package com.amazon.rtcsc.capabilityagent.common.core;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.api.compat.model.AlexaCapability;
import com.amazon.alexa.api.compat.model.AlexaDirective;
import com.amazon.rtcsc.capabilityagent.common.util.RtcscLogger;
import com.amazon.rtcsc.capabilityagentclient.RtcscCAClient;
import com.amazon.rtcsc.interfaces.RtcscAppInfo;
import com.amazon.rtcsc.interfaces.RtcscErrorCode;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes5.dex */
public class RtcscCapabilityAgent extends RtcscCAClient {
    private static final String TAG = "RtcscCapabilityAgent";
    private Context mContext;
    private RtcscCapabilityAgentEventListener mEventListener;
    private RtcscAppInfo mRtcAppInfo;

    @Inject
    public RtcscCapabilityAgent(Context context, RtcscCapabilityAgentEventListener rtcscCapabilityAgentEventListener) {
        super(context);
        this.mRtcAppInfo = new RtcscAppInfo(RtcscConstants.RTCSC_CAPABILITY_AGENT_APP_IDENTIFIER);
        RtcscLogger.i(TAG, "Constructor -- RtcscCapabilityAgent", new Object[0]);
        this.mContext = context;
        this.mEventListener = rtcscCapabilityAgentEventListener;
    }

    private void registerEventListenerIfSessionStart(String str) {
        RtcscLogger.i(TAG, "registerListenerIfSessionStart", new Object[0]);
        if (str.equals("InitiateSession") || str.equals(RtcscConstants.RTCSC_DIRECTIVE_NAME_INITIATE_SESSION_WITH_OFFER)) {
            RtcscLogger.i(TAG, "Session initiating directive received. Registering RtcscCapabilityAgentEventListener.", new Object[0]);
            super.registerCAEventListener(this.mRtcAppInfo, this.mEventListener);
        }
    }

    public void disconnectFromService() {
        RtcscLogger.i(TAG, "disconnectFromService", new Object[0]);
        super.disconnectFromRtcscService();
    }

    public Set<AlexaCapability> getRtcscCapabilities() {
        RtcscLogger.i(TAG, "getRtcscCapabilities ", new Object[0]);
        HashSet hashSet = new HashSet();
        hashSet.add(new AlexaCapability("AlexaInterface", "Alexa.RTCSessionController", "3.1", null, null));
        RtcscLogger.i(TAG, "returning capability set of count %d", Integer.valueOf(hashSet.size()));
        return hashSet;
    }

    @Override // com.amazon.rtcsc.capabilityagentclient.RtcscCAClient
    public void onRtcscServiceConnected() {
        RtcscLogger.i(TAG, "onRtcscServiceConnected received.", new Object[0]);
    }

    @Override // com.amazon.rtcsc.capabilityagentclient.RtcscCAClient
    public void onRtcscServiceDisconnected() {
        RtcscLogger.i(TAG, "onRtcscServiceDisconnected received.", new Object[0]);
    }

    public boolean processRTCDirective(@NonNull AlexaDirective alexaDirective) {
        RtcscLogger.i(TAG, "processRTCDirective -- Process directives from Alexa", new Object[0]);
        if (alexaDirective.getAlexaPayload() == null) {
            RtcscLogger.e(TAG, "processRTCDirective -- Alexa Payload is null. Cannot proceed", new Object[0]);
            return false;
        }
        if (alexaDirective.getAlexaHeader() == null) {
            RtcscLogger.e(TAG, "processRTCDirective -- Alexa Header is null. Cannot proceed", new Object[0]);
            return false;
        }
        String namespace = alexaDirective.getNamespace();
        String name = alexaDirective.getName();
        String payload = alexaDirective.getAlexaPayload().getPayload();
        String correlationToken = alexaDirective.getAlexaHeader().getCorrelationToken();
        RtcscLogger.i(TAG, "processRTCDirective: Namespace : %s, Name : %s.", namespace, name);
        RtcscLogger.d(TAG, "processRTCDirective: Directive Payload: %s", payload);
        if (!"Alexa.RTCSessionController".equals(namespace)) {
            RtcscLogger.w(TAG, "processRTCDirective -- Not an Rtcsc namespace directive. Can't handle it", new Object[0]);
            return false;
        }
        RtcscLogger.i(TAG, a$$ExternalSyntheticOutline0.m("processRTCDirective -- Received directive: ", name), new Object[0]);
        registerEventListenerIfSessionStart(name);
        super.connectToRtcscService();
        name.getClass();
        switch (name) {
            case "InitiateSession":
            case "GenerateAnswerForSession":
            case "StartPeerConnection":
            case "SessionDisconnected":
            case "DisconnectSession":
            case "InitiateSessionWithOffer":
            case "SessionConnected":
                RtcscLogger.i(TAG, "processRTCDirective -- handle directive ".concat(name), new Object[0]);
                this.mEventListener.addCorrelationToken(new PayloadObject(payload).getSessionId(), correlationToken);
                RtcscErrorCode handleDirective = super.handleDirective(name, payload);
                RtcscErrorCode rtcscErrorCode = RtcscErrorCode.SUCCESS;
                if (handleDirective != rtcscErrorCode) {
                    RtcscLogger.e(TAG, "processRTCDirective -- Error handling RTCDirective: " + handleDirective, new Object[0]);
                } else {
                    RtcscLogger.i(TAG, "processRTCDirective -- Directive successfully sent to Capability Agent.", new Object[0]);
                }
                if (handleDirective == rtcscErrorCode) {
                }
                break;
            default:
                RtcscLogger.e(TAG, "processRTCDirective -- Not a valid RTCSC Directive. Can't handle it.", new Object[0]);
                break;
        }
        return false;
    }

    public void unregisterEventListener() {
        RtcscLogger.i(TAG, "unregisterEventListener", new Object[0]);
        super.unregisterCAEventListener(this.mRtcAppInfo);
    }
}
