package com.amazon.deecomms.calling.controller;

import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.alexa.ModeSwitchHelper;
import com.amazon.deecomms.calling.util.CallUtils;
import com.amazon.deecomms.common.ApplicationManager;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.service.DeviceCallingAndroidService;
import com.amazon.deecomms.common.sip.SipClientState;
import com.amazon.deecomms.common.util.DeviceUtils;
import com.amazon.deecomms.common.util.Utils;
import com.amazon.deecomms.core.CapabilitiesManager;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazon.deecomms.util.ThreadUtils;
import com.google.common.annotations.VisibleForTesting;
import com.mapbox.common.LifecycleUtils$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CallManager {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, CallManager.class);
    private final ApplicationManager applicationManager;
    private final CallPayloadValidator callPayloadValidator;
    private boolean isCallDowngraded;
    private final Context mContext;
    private boolean mIsCallActivityLaunchedOnce;
    private boolean mIsCallUINavigatedAway;
    private boolean mIsCallUIVisible;
    private boolean mIsOptInUIVisible;
    private final ModeSwitchHelper modeSwitchHelper;
    private final SipClientState previousSipClientState;
    private final SipClientState sipClientState;
    private final List<String> mActiveCallList = new ArrayList();
    private AtomicInteger mNumberOfCalls = new AtomicInteger(0);

    public CallManager(@NonNull Context context, @NonNull @Named("CurrentCall") SipClientState sipClientState, @NonNull @Named("PreviousCall") SipClientState sipClientState2, @NonNull ApplicationManager applicationManager, @NonNull CallPayloadValidator callPayloadValidator, @NonNull ModeSwitchHelper modeSwitchHelper) {
        this.mContext = context;
        this.sipClientState = sipClientState;
        this.applicationManager = applicationManager;
        this.modeSwitchHelper = modeSwitchHelper;
        this.previousSipClientState = sipClientState2;
        this.callPayloadValidator = callPayloadValidator;
    }

    private void callTerminated() {
        this.modeSwitchHelper.detectAndReactToBackgroundModeSwitch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enableVideoStreamInVideoCall$0(boolean z) {
        this.sipClientState.setUserTurnedVideoOff(!z);
        CallUtils.enableVideoStreamInVideoCall(this.sipClientState, z);
    }

    @VisibleForTesting
    public void cloneSipClientStateForMetricsHack() {
        this.previousSipClientState.setCallId(this.sipClientState.getCallId());
        this.previousSipClientState.setRemoteParticipantName(this.sipClientState.getRemoteParticipantName());
        this.previousSipClientState.setCurrentActiveCall(this.sipClientState.getCurrentActiveCall());
        this.previousSipClientState.setCallProvider(this.sipClientState.getCallProvider());
        this.previousSipClientState.setCallType(this.sipClientState.getCallType());
        this.previousSipClientState.setCallConnectDurationInMillis(this.sipClientState.getCallConnectDurationInMillis());
        this.previousSipClientState.setCallee(this.sipClientState.getCallee());
        this.previousSipClientState.setCaller(this.sipClientState.getCaller());
        this.previousSipClientState.setCallState(this.sipClientState.getCallState());
        this.previousSipClientState.setDeviceGruu(this.sipClientState.getDeviceGruu());
        this.previousSipClientState.setLocalParticipantId(this.sipClientState.getLocalParticipantId());
        this.previousSipClientState.setRemoteParticipantId(this.sipClientState.getRemoteParticipantId());
        this.previousSipClientState.setReason(this.sipClientState.getReason());
        this.previousSipClientState.setSipRegistrationStatus(this.sipClientState.getSipRegistrationStatus());
        this.previousSipClientState.setSrtpKey(this.sipClientState.getSrtpKey());
        this.previousSipClientState.setEnhancedProcessingState(this.sipClientState.getEnhancedProcessingState());
        this.previousSipClientState.setRealTimeTextMetrics(this.sipClientState.getRealTimeTextMetrics());
    }

    public boolean dequeueActiveCall(String str) {
        boolean z;
        synchronized (this.mActiveCallList) {
            try {
                z = false;
                if (this.mActiveCallList.contains(str)) {
                    cloneSipClientStateForMetricsHack();
                    this.mActiveCallList.remove(str);
                    this.sipClientState.reset();
                    setCallActivityLaunchedOnce(false);
                    setCallDowngraded(false);
                    this.applicationManager.callEnded();
                    z = true;
                } else {
                    LOG.e("Not able to dequeue call. CallId not present: " + str);
                }
                if (this.mActiveCallList.isEmpty()) {
                    callTerminated();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.callPayloadValidator.resetCounter();
        return z;
    }

    public void enableVideoStreamInVideoCall(boolean z) {
        ThreadUtils.runOnMainThread(new LifecycleUtils$$ExternalSyntheticLambda2(this, z, 9));
    }

    public boolean enqueueActiveCall(String str) {
        boolean z;
        synchronized (this.mActiveCallList) {
            try {
                if (this.mActiveCallList.isEmpty()) {
                    this.mActiveCallList.add(str);
                    this.sipClientState.setCallId(str);
                    LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(new Intent(Constants.NOTIFY_ALEXA_CALL));
                    this.applicationManager.incomingCall();
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public int incrementAndGetNumberOfCalls() {
        return this.mNumberOfCalls.incrementAndGet();
    }

    public boolean isActiveCallPresentWithId(String str) {
        boolean contains;
        synchronized (this.mActiveCallList) {
            contains = this.mActiveCallList.contains(str);
        }
        return contains;
    }

    public boolean isAnyActiveCallPresent() {
        boolean z;
        synchronized (this.mActiveCallList) {
            z = !this.mActiveCallList.isEmpty();
        }
        return z;
    }

    public boolean isCallActivityLaunchedOnce() {
        return this.mIsCallActivityLaunchedOnce;
    }

    public boolean isCallDowngraded() {
        return this.isCallDowngraded;
    }

    public boolean isCallUINavigatedAway() {
        return this.mIsCallUINavigatedAway;
    }

    public boolean isCallUIVisible() {
        return this.mIsCallUIVisible;
    }

    public boolean isInAlexaCallInboundRingingMode() {
        return this.sipClientState.getCallState() == SipClientState.CallState.INBOUND_RINGING;
    }

    public boolean isInAlexaCallMode() {
        return this.sipClientState.getCallState() == SipClientState.CallState.INBOUND_RINGING || this.sipClientState.getCallState() == SipClientState.CallState.OUTBOUND_RINGING || isAnyActiveCallPresent();
    }

    public boolean isInAlexaCallOffhookMode() {
        return this.sipClientState.getCallState() == SipClientState.CallState.OUTBOUND_RINGING || isAnyActiveCallPresent();
    }

    public boolean isOptInUIVisible() {
        return this.mIsOptInUIVisible;
    }

    @VisibleForTesting
    public boolean isPCCCallInProgress(@NonNull CapabilitiesManager capabilitiesManager) {
        return (DeviceUtils.isCommsNativeDefaulted(capabilitiesManager) || Utils.areAccessoriesConnected()) && CallUtils.getCallState((TelephonyManager) this.mContext.getSystemService(HintConstants.AUTOFILL_HINT_PHONE), this.mContext) != 0;
    }

    public void reportCallUICompleted(@Nullable String str, @Nullable String str2) {
        Context context = CommsDaggerWrapper.getComponent().getContext();
        Intent intent = new Intent(context, (Class<?>) DeviceCallingAndroidService.class);
        intent.setAction(Constants.SEND_CALL_METRICS);
        intent.putExtra(Constants.CALL_ID, str);
        intent.putExtra(Constants.CALL_RATING, str2);
        context.startService(intent);
    }

    public void setCallActivityLaunchedOnce(boolean z) {
        this.mIsCallActivityLaunchedOnce = z;
    }

    public void setCallDowngraded(boolean z) {
        this.isCallDowngraded = z;
    }

    public void setCallUINavigation(boolean z) {
        this.mIsCallUINavigatedAway = z;
    }

    public void setCallUIVisibility(boolean z) {
        this.mIsCallUIVisible = z;
    }

    public void setOptInUIVisibility(boolean z) {
        this.mIsOptInUIVisible = z;
    }
}
