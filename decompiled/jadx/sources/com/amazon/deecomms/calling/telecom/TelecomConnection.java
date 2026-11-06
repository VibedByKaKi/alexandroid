package com.amazon.deecomms.calling.telecom;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.DisconnectCause;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.alexa.CommsEventSender$$ExternalSyntheticOutline0;
import com.amazon.deecomms.calling.telecom.audiomanagement.TelecomAudioUtils;
import com.amazon.deecomms.calling.telecom.audiomanagement.TelecomCallAudioRouteObservable;
import com.amazon.deecomms.calling.util.CallUtils;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazon.deecomms.perms.PermissionsHelper;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(26)
/* loaded from: classes5.dex */
public class TelecomConnection extends Connection {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, TelecomConnection.class);

    @Inject
    public AudioManager audioManager;

    @Inject
    public Context context;
    private TelecomCallAudioRouteObservable telecomCallAudioRouteObservable;

    public TelecomConnection(@NonNull boolean z, @NonNull ConnectionRequest connectionRequest, @NonNull TelecomCallAudioRouteObservable telecomCallAudioRouteObservable) {
        CommsDaggerWrapper.getComponent().inject(this);
        this.telecomCallAudioRouteObservable = telecomCallAudioRouteObservable;
        setAudioModeIsVoip(true);
        if (z) {
            boolean z2 = connectionRequest.getExtras().getBundle("android.telecom.extra.INCOMING_CALL_EXTRAS").getBoolean("IS_VIDEO_CALL", false);
            Bundle bundle = new Bundle();
            bundle.putBoolean("IS_VIDEO_CALL", z2);
            setExtras(bundle);
        }
        setConnectionCapabilities(getConnectionCapabilities() | 524352);
        setConnectionProperties(getConnectionProperties() | 128);
    }

    @VisibleForTesting
    public void acceptIncomingCall(@NonNull Bundle bundle) {
        boolean z = bundle.getBoolean("IS_VIDEO_CALL");
        if (PermissionsHelper.checkPermissions(this.context, z ? PermissionsHelper.getPermissionListForVideoCalling() : PermissionsHelper.getPermissionListForAudio()).length == 0) {
            LOG.i("Accepting incoming call.");
            CallUtils.acceptIncomingCall(this.context, z);
            return;
        }
        LOG.i("No permissions to pick up call, requesting.");
        Intent intent = new Intent(Constants.CALL_PERMISSION_REQUEST_ACTION);
        intent.putExtra("IS_VIDEO_CALL", z);
        intent.putExtra(Constants.PERMISSION_REQUEST_SCREEN_NAME, z ? MetricKeys.SCREEN_NAME_INCOMING_VIDEO_CALL : MetricKeys.SCREEN_NAME_INCOMING_CALL);
        LocalBroadcastManager.getInstance(this.context).sendBroadcast(intent);
    }

    @Override // android.telecom.Connection
    public void onAbort() {
        LOG.i("onAbort() called");
        MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.actBtn.abort");
        destroy();
    }

    @Override // android.telecom.Connection
    public void onAnswer() {
        LOG.i("Multi-action button clicked: onAnswer() called.");
        MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.actBtn.answer");
        acceptIncomingCall(getExtras());
    }

    @Override // android.telecom.Connection
    public void onCallAudioStateChanged(@Nullable CallAudioState callAudioState) {
        if (callAudioState != null) {
            String audioRouteToString = CallAudioState.audioRouteToString(callAudioState.getRoute());
            CommsEventSender$$ExternalSyntheticOutline0.m(LOG, "onCallAudioStateChanged state is: ", audioRouteToString);
            TelecomAudioUtils.verifyRouteSelected(this.audioManager, audioRouteToString);
            this.telecomCallAudioRouteObservable.onCallAudioStateUpdated(callAudioState);
            MetricsHelper.recordOperationalMetricWithSource("comms.telecom.audio.change", audioRouteToString);
        }
    }

    @Override // android.telecom.Connection
    public void onDisconnect() {
        int state = getState();
        setDisconnected(new DisconnectCause(2));
        destroy();
        LOG.i("Bluetooth multi-action button clicked: onDisconnect() or PSTN/another 3rd party Telecom call started");
        MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.actBtn.dsc.or.call");
        onDisconnectHelper(state);
    }

    @VisibleForTesting
    public void onDisconnectHelper(int i) {
        if (i == 4) {
            LOG.i("Ending active call.");
            CallUtils.endActiveCall(this.context);
        } else if (i == 3) {
            LOG.i("Cancelling outgoing call");
            CallUtils.cancelOutgoingCall(this.context);
        } else if (i == 2) {
            LOG.i("Rejecting incoming call");
            CallUtils.rejectCall(this.context);
        }
    }

    @Override // android.telecom.Connection
    public void onHold() {
        LOG.i("onHold() called");
    }

    @Override // android.telecom.Connection
    public void onReject() {
        setDisconnected(new DisconnectCause(2));
        destroy();
        LOG.i("onReject() called");
        onRejectHelper();
    }

    @VisibleForTesting
    public void onRejectHelper() {
        MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.reject.con.call");
        CallUtils.rejectCall(this.context);
    }

    @Override // android.telecom.Connection
    public void onShowIncomingCallUi() {
        LOG.i("onShowIncomingCallUi() called");
    }

    @NonNull
    public String toFailedConnection() {
        int state = getState();
        DisconnectCause disconnectCause = getDisconnectCause();
        if (disconnectCause == null) {
            return a$$ExternalSyntheticOutline0.m(state, "FailedConnectionInfo - State: ");
        }
        return "FailedConnectionInfo - Reason: " + disconnectCause.getReason() + ", description: " + ((Object) disconnectCause.getDescription()) + ", label: " + ((Object) disconnectCause.getLabel()) + ", state " + state;
    }

    @VisibleForTesting
    public TelecomConnection(@NonNull Context context, @NonNull TelecomCallAudioRouteObservable telecomCallAudioRouteObservable) {
        this.context = context;
        this.telecomCallAudioRouteObservable = telecomCallAudioRouteObservable;
    }
}
