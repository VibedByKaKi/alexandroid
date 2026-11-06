package com.amazon.rtcsc.capabilityagent.common.core;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.api.compat.model.AlexaEvent;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.api.compat.model.AlexaPayload;
import com.amazon.rtcsc.capabilityagent.avs.RtcscCapabilityAgentServiceAVS;
import com.amazon.rtcsc.capabilityagent.avs.RtcscContextProvider;
import com.amazon.rtcsc.capabilityagent.common.util.RtcscLogger;
import com.amazon.rtcsc.capabilityagentclient.RtcscCAEventListener;
import com.amazon.rtcsc.interfaces.RtcscErrorCode;
import dagger.Lazy;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes5.dex */
public class RtcscCapabilityAgentEventListener extends RtcscCAEventListener {
    private static final String TAG = "RtcscCpAgntEventListener";
    private final Context mContext;
    private final Lazy<AlexaMobileFrameworkApisV2> mFrameworkApis;
    private final RtcscContextProvider mRtcscContextProvider;
    private ConcurrentHashMap<String, String> mSessionIdToCorrelationMap;

    @Inject
    public RtcscCapabilityAgentEventListener(Context context, Lazy<AlexaMobileFrameworkApisV2> lazy, RtcscContextProvider rtcscContextProvider) {
        RtcscLogger.i(TAG, "Constructor -- RtcscCapabilityAgentEventListener", new Object[0]);
        this.mContext = context;
        this.mFrameworkApis = lazy;
        this.mRtcscContextProvider = rtcscContextProvider;
        this.mSessionIdToCorrelationMap = new ConcurrentHashMap<>();
    }

    private void stopCapabilityAgentService() {
        RtcscLogger.i(TAG, "Stopping AVS CapabilityAgent service", new Object[0]);
        this.mContext.stopService(new Intent().setClass(this.mContext, RtcscCapabilityAgentServiceAVS.class));
    }

    public void addCorrelationToken(String str, String str2) {
        RtcscLogger.i(TAG, a$$ExternalSyntheticOutline0.m("addCorrelationToken. sessionId: ", str), new Object[0]);
        RtcscLogger.d(TAG, "correlationToken: " + str2, new Object[0]);
        if (str2 != null) {
            this.mSessionIdToCorrelationMap.put(str, str2);
        }
    }

    @VisibleForTesting
    public String getCorrelationToken(String str) {
        return this.mSessionIdToCorrelationMap.get(str);
    }

    @VisibleForTesting
    public String getValue(String str) {
        String str2 = this.mSessionIdToCorrelationMap.get(str);
        return str2 == null ? "" : str2;
    }

    @VisibleForTesting
    public boolean hasKey(String str) {
        return this.mSessionIdToCorrelationMap.get(str) != null;
    }

    @Override // com.amazon.rtcsc.capabilityagentclient.RtcscCAEventListener, com.amazon.rtcsc.interfaces.IRtcscEventListener
    public void onError(RtcscErrorCode rtcscErrorCode) {
        RtcscLogger.i(TAG, "Received onError from RtcscService. errorCode : " + rtcscErrorCode, new Object[0]);
    }

    @Override // com.amazon.rtcsc.capabilityagentclient.RtcscCAEventListener, com.amazon.rtcsc.interfaces.IRtcscEventListener
    public void onRTCSessionContextUpdated(String str) {
        RtcscLogger.i(TAG, a$$ExternalSyntheticOutline0.m("Updated Session Context Received from RtcscService. Context: ", str), new Object[0]);
        this.mRtcscContextProvider.setRtcscSessionContext(str);
    }

    @Override // com.amazon.rtcsc.capabilityagentclient.RtcscCAEventListener, com.amazon.rtcsc.interfaces.IRtcscEventListener
    public void onSendEvent(String str, String str2, String str3, String str4) {
        Locale locale = Locale.US;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("Received event from RtcscService. sessionId: ", str, ". eventName: ", str2, ", sessionContext: ");
        m.append(str4);
        RtcscLogger.i(TAG, m.toString(), new Object[0]);
        RtcscLogger.d(TAG, "Payload: %s", str3);
        String correlationToken = getCorrelationToken(str);
        if (correlationToken != null) {
            RtcscLogger.d(TAG, a$$ExternalSyntheticOutline0.m("Using correlationToken: ", correlationToken, " for event : ", str2), new Object[0]);
            this.mFrameworkApis.get().getCapabilitiesApi().sendEvent(new AlexaEvent(AlexaHeader.builder().setNamespace("Alexa.RTCSessionController").setName(str2).setCorrelationToken(correlationToken).setPayloadVersion("3.1").build(), new AlexaPayload(str3)));
        } else {
            RtcscLogger.w(TAG, "correlationToken not present. Not forwarding event to cloud", new Object[0]);
        }
        removeCorrelationTokenOnSessionEnd(str, str2);
    }

    public void removeCorrelationTokenOnSessionEnd(String str, String str2) {
        str2.getClass();
        switch (str2) {
            case "SessionDisconnected":
            case "InitiateSessionFailed":
            case "InitiateSessionWithOfferFailed":
                this.mSessionIdToCorrelationMap.remove(str);
                if (this.mSessionIdToCorrelationMap.isEmpty()) {
                    stopCapabilityAgentService();
                }
                RtcscLogger.i(TAG, a$$ExternalSyntheticOutline0.m("Removed mapping for sessionId: ", str, " eventName: ", str2), new Object[0]);
                break;
            default:
                RtcscLogger.i(TAG, "Not an event that disconnects session. Not removing mapping", new Object[0]);
                break;
        }
    }
}
