package com.amazon.deecomms.accessories;

import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.alexa.AlexaInterface;
import com.amazon.deecomms.alexa.CallTypeEvent;
import com.amazon.deecomms.alexa.CallTypeEventConstants;
import com.amazon.deecomms.alexa.CallTypeEventModel;
import com.amazon.deecomms.alexa.CallTypeEventType;
import com.amazon.deecomms.calling.util.CallUtils;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.sip.SipClientState;
import java.util.Collections;
import javax.inject.Inject;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class VipCallingHandler {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, VipCallingHandler.class);
    private AlexaInterface mAlexaInterface;
    private SipClientState mSipClientState;

    @Inject
    public VipCallingHandler(@NonNull AlexaInterface alexaInterface, @NonNull @Named("CurrentCall") SipClientState sipClientState) {
        this.mAlexaInterface = alexaInterface;
        this.mSipClientState = sipClientState;
    }

    public void requestOutboundVipCall() {
        LOG.i("Requesting an outbound VIP call");
        this.mAlexaInterface.sendCommsEvent(new CallTypeEvent(CallTypeEventType.OUTBOUND_CALL_REQUEST, new CallTypeEventModel(CallTypeEventConstants.VUI_ONLY, Collections.singletonList(CallTypeEventConstants.VIP_CALL), CallUtils.generateCallId(), this.mSipClientState)));
    }
}
