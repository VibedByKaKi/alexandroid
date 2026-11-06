package com.amazon.deecomms.calling.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.comms.calling.service.Call;
import com.amazon.deecomms.calling.api.CallInfo;
import com.amazon.deecomms.calling.api.CallTarget;
import com.amazon.deecomms.calling.api.Caller;
import com.amazon.deecomms.calling.api.ContactCallTarget;
import com.amazon.deecomms.calling.api.GroupCallTarget;
import com.amazon.deecomms.calling.api.enums.CallDirection;
import com.amazon.deecomms.calling.api.enums.CallMediaStream;
import com.amazon.deecomms.calling.api.enums.CallState;
import com.amazon.deecomms.calling.api.enums.ContactIdentifierType;
import com.amazon.deecomms.calling.api.enums.GroupIdentifierType;
import com.amazon.deecomms.calling.model.CallContext;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CallingAPIPopulator {

    @NonNull
    private final CallContext callContext;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.deecomms.calling.impl.CallingAPIPopulator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$comms$calling$service$Call$State;

        static {
            int[] iArr = new int[Call.State.values().length];
            $SwitchMap$com$amazon$comms$calling$service$Call$State = iArr;
            try {
                iArr[Call.State.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$comms$calling$service$Call$State[Call.State.Created.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$comms$calling$service$Call$State[Call.State.Ringing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$comms$calling$service$Call$State[Call.State.Complete.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$comms$calling$service$Call$State[Call.State.OnLocalHold.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$comms$calling$service$Call$State[Call.State.OnRemoteHold.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Inject
    public CallingAPIPopulator(@NonNull CallContext callContext) {
        this.callContext = callContext;
    }

    @NonNull
    public CallState calculateCallState(@NonNull Call call, @NonNull CallDirection callDirection) {
        CallState callState = CallState.INACTIVE;
        int i = AnonymousClass1.$SwitchMap$com$amazon$comms$calling$service$Call$State[call.getState().ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? callState : callDirection == CallDirection.Outgoing ? CallState.OUTBOUND_RINGING : CallState.INBOUND_RINGING : callDirection == CallDirection.Outgoing ? CallState.CALLING : CallState.INBOUND_RECEIVED : CallState.ACTIVE;
    }

    @NonNull
    public CallTarget calculateCallTarget(@NonNull Call call, @NonNull CallDirection callDirection) {
        return this.callContext.isGroupCall() ? new GroupCallTarget(GroupIdentifierType.Groupid, call.getRemoteParticipant().getProviderSpecifiedId(), call.isDropInCall()) : callDirection == CallDirection.Outgoing ? new ContactCallTarget(ContactIdentifierType.Commsid, call.getRemoteParticipant().getProviderSpecifiedId(), call.isDropInCall()) : new ContactCallTarget(ContactIdentifierType.Commsid, call.getLocalParticipant().getProviderSpecifiedId(), call.isDropInCall());
    }

    @NonNull
    public Caller calculateCaller(@NonNull Call call, @NonNull CallDirection callDirection) {
        return callDirection == CallDirection.Outgoing ? new Caller(ContactIdentifierType.Commsid, call.getLocalParticipant().getProviderSpecifiedId(), null) : new Caller(ContactIdentifierType.Commsid, call.getRemoteParticipant().getProviderSpecifiedId(), null);
    }

    @NonNull
    public CallMediaStream[] calculateSupportedMediaStreams(@NonNull Call call) {
        return call.getMediaStatus().isLocalVideoCapable() ? new CallMediaStream[]{CallMediaStream.Audio, CallMediaStream.Video} : new CallMediaStream[]{CallMediaStream.Audio};
    }

    @Nullable
    public CallInfo getCurrentCallInfo() {
        Call currentCall = this.callContext.getCurrentCall();
        if (currentCall == null) {
            return null;
        }
        CallDirection callDirection = currentCall.getOrigin() == Call.Side.Local ? CallDirection.Outgoing : CallDirection.Incoming;
        return new CallInfo(currentCall.getCallId(), calculateCaller(currentCall, callDirection), calculateCallTarget(currentCall, callDirection), calculateCallState(currentCall, callDirection), callDirection, calculateSupportedMediaStreams(currentCall));
    }
}
