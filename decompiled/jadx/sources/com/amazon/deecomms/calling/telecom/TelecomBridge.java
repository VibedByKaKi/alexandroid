package com.amazon.deecomms.calling.telecom;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.comms.calling.service.Call;
import com.amazon.comms.calling.service.HangupReason;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.R;
import com.amazon.deecomms.alexa.CommsEventSender$$ExternalSyntheticOutline0;
import com.amazon.deecomms.calling.util.CallUtils;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.common.util.Utils;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.Queue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(26)
/* loaded from: classes5.dex */
public class TelecomBridge {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, TelecomBridge.class);
    private final Map<String, Connection> callIdByTelecomConnection;
    private final PhoneAccountHandle phoneAccountHandle;
    private final Queue<String> telecomCallIds;
    private final Object telecomLock;
    private final TelecomManager telecomManager;

    public TelecomBridge(@NonNull TelecomManager telecomManager, @NonNull PhoneAccountHandle phoneAccountHandle, @NonNull Map<String, Connection> map, @NonNull Queue<String> queue, @NonNull Object obj) {
        this.telecomManager = telecomManager;
        this.phoneAccountHandle = phoneAccountHandle;
        this.callIdByTelecomConnection = map;
        this.telecomCallIds = queue;
        this.telecomLock = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri getSipUri(@NonNull String str) {
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, "@");
        m1m.append(Utils.getStringFromResource(R.string.alexa_app_name));
        String sb = m1m.toString();
        CommsEventSender$$ExternalSyntheticOutline0.m(LOG, "User info ", sb);
        return Uri.fromParts("sip", sb, "");
    }

    public void activateTelecomConnection(@NonNull String str) {
        synchronized (this.telecomLock) {
            try {
                if (!isValidCallId(str)) {
                    LOG.i("Callid empty for activateTelecomConnection. Call won't be managed with Telecom.");
                    return;
                }
                CommsLogger commsLogger = LOG;
                commsLogger.i("activateTelecomConnection()");
                if (this.callIdByTelecomConnection.containsKey(str)) {
                    commsLogger.i("Setting telecom connection to active.");
                    this.callIdByTelecomConnection.get(str).setActive();
                    MetricsHelper.recordCounterMetricOperational("comms.telecom.con.activate", 1.0d);
                } else {
                    commsLogger.i("Accepted call that is not in telecom yet. Telecom Service was too slow. Won't be able to manage this call with telecom i.e. hang up the call.");
                    this.telecomCallIds.remove(str);
                    MetricsHelper.recordCounterMetricOperational("comms.telecom.con.activate", 0.0d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addTelecomCall(@NonNull Call call, boolean z) {
        synchronized (this.telecomLock) {
            try {
                CommsLogger commsLogger = LOG;
                commsLogger.i("AddTelecomCall called. IsIncoming call: " + z);
                String callId = call.getCallId();
                if (!isValidCallId(callId)) {
                    MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.callid.empty");
                    commsLogger.i("Callid empty for addTelecomCall. Call won't be managed with Telecom.");
                    return;
                }
                String providerSpecifiedId = call.getRemoteParticipant().getProviderSpecifiedId();
                if (providerSpecifiedId == null || providerSpecifiedId.isEmpty()) {
                    commsLogger.i("commsid null or empty");
                    MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.commsid.empty");
                } else {
                    Bundle bundle = new Bundle();
                    if (z) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("IS_VIDEO_CALL", call.isVideoRequested());
                        bundle.putParcelable("android.telecom.extra.INCOMING_CALL_EXTRAS", bundle2);
                        createCallTask(providerSpecifiedId, callId, bundle, true).execute(new Void[0]);
                    } else {
                        createCallTask(providerSpecifiedId, callId, bundle, false).execute(new Void[0]);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public AsyncTask<Void, Void, Void> createCallTask(@NonNull final String str, @NonNull final String str2, @NonNull final Bundle bundle, @NonNull final boolean z) {
        return new AsyncTask<Void, Void, Void>() { // from class: com.amazon.deecomms.calling.telecom.TelecomBridge.1
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... voidArr) {
                String callerNameForCommsId = CallUtils.getCallerNameForCommsId(str, z ? TelecomConstants.INCOMING_CALL_REASON : TelecomConstants.OUTGOING_CALL_REASON);
                if (callerNameForCommsId == null || callerNameForCommsId.isEmpty()) {
                    TelecomBridge.LOG.e("Caller name empty");
                    MetricsHelper.recordCounterMetricOperational("comms.telecom.caller.name.empty", 1.0d);
                    return null;
                }
                synchronized (TelecomBridge.this.telecomLock) {
                    try {
                        TelecomBridge.this.telecomCallIds.add(str2);
                        Uri sipUri = TelecomBridge.this.getSipUri(callerNameForCommsId);
                        if (z) {
                            TelecomBridge.LOG.i("addTelecomIncomingCall()");
                            MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.addIncomingCall");
                            bundle.putParcelable("android.telecom.extra.INCOMING_CALL_ADDRESS", sipUri);
                            TelecomBridge telecomBridge = TelecomBridge.this;
                            telecomBridge.telecomManager.addNewIncomingCall(telecomBridge.phoneAccountHandle, bundle);
                        } else {
                            TelecomBridge.LOG.i("addTelecomOutgoingCall()");
                            MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.placeCall");
                            bundle.putParcelable("android.telecom.extra.PHONE_ACCOUNT_HANDLE", TelecomBridge.this.phoneAccountHandle);
                            try {
                                TelecomBridge.this.telecomManager.placeCall(sipUri, bundle);
                            } catch (SecurityException e) {
                                TelecomBridge.LOG.e("Telecom framework requested permission for self-managed connection, even though it should not. ", e);
                                MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.place.call.permission.crash");
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            }
        };
    }

    public void destroyTelecomConnection(@NonNull String str, @NonNull HangupReason hangupReason) {
        synchronized (this.telecomLock) {
            try {
                if (!isValidCallId(str)) {
                    LOG.i("Callid empty for destroyTelecomConnection. Call won't be managed with Telecom.");
                    return;
                }
                CommsLogger commsLogger = LOG;
                commsLogger.i("destroyTelecomConnection()");
                if (this.telecomCallIds.remove(str) && this.callIdByTelecomConnection.containsKey(str)) {
                    Connection remove = this.callIdByTelecomConnection.remove(str);
                    if (remove.getState() != 6) {
                        commsLogger.i("Destroying Telecom Connection. Reason: " + hangupReason + ", state " + remove.getState());
                        remove.setDisconnected(new DisconnectCause(hangupReason == HangupReason.LocalHangup ? 2 : 3));
                        remove.destroy();
                    } else {
                        commsLogger.i("Telecom Connection already destroyed by another call: PSTN on 3rd party, or multi-action button");
                    }
                } else {
                    commsLogger.i("No need to destroy connection, it wasn't created yet.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Connection getCurrentConnection() {
        synchronized (this.telecomLock) {
            try {
                String peek = this.telecomCallIds.peek();
                if (peek == null) {
                    return null;
                }
                return this.callIdByTelecomConnection.get(peek);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public boolean isValidCallId(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }
}
