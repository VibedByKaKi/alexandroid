package com.amazon.deecomms.calling.telecom;

import android.annotation.TargetApi;
import android.net.Uri;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccountHandle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.alexa.CommsEventSender$$ExternalSyntheticOutline0;
import com.amazon.deecomms.calling.telecom.audiomanagement.TelecomCallAudioRouteObservable;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import java.util.Map;
import java.util.Queue;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@TargetApi(26)
/* loaded from: classes5.dex */
public class TelecomConnectionService extends ConnectionService {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, TelecomConnectionService.class);

    @Inject
    public Map<String, Connection> callIdToTelecomConnection;

    @Inject
    public TelecomBridge telecomBridge;

    @Inject
    public TelecomCallAudioRouteObservable telecomCallAudioRouteObservable;

    @Inject
    public Queue<String> telecomCallIds;

    @Inject
    public Object telecomLock;

    public TelecomConnectionService() {
        LOG.i("TelecomConnectionService constructor");
        CommsDaggerWrapper.getComponent().inject(this);
    }

    private String getUserName(@NonNull Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        return schemeSpecificPart.substring(0, schemeSpecificPart.lastIndexOf("@"));
    }

    @VisibleForTesting
    public void failedConnectionHelper() {
        String peek = this.telecomCallIds.peek();
        CommsLogger commsLogger = LOG;
        CommsEventSender$$ExternalSyntheticOutline0.m(commsLogger, "Call id removed is ", peek);
        if (peek != null) {
            this.telecomCallIds.remove();
            Connection remove = this.callIdToTelecomConnection.remove(peek);
            if (remove != null) {
                commsLogger.i(((TelecomConnection) remove).toFailedConnection());
            }
        }
    }

    @Override // android.telecom.ConnectionService
    public Connection onCreateIncomingConnection(@NonNull PhoneAccountHandle phoneAccountHandle, @NonNull ConnectionRequest connectionRequest) {
        synchronized (this.telecomLock) {
            try {
                CommsLogger commsLogger = LOG;
                StringBuilder sb = new StringBuilder("onCreateIncomingConnection. PhoneAccountHandle: ");
                sb.append(phoneAccountHandle);
                sb.append(", connectionRequest: ");
                sb.append(connectionRequest);
                sb.append(", and its account is: ");
                sb.append(connectionRequest != null ? connectionRequest.getAccountHandle() : null);
                commsLogger.i(sb.toString());
                MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.addIncomingCall.callback");
                String peek = this.telecomCallIds.peek();
                if (peek == null) {
                    commsLogger.i("Call id was null. Creating failed incoming  connection.");
                    return Connection.createFailedConnection(new DisconnectCause(1));
                }
                Uri address = connectionRequest.getAddress();
                String userName = getUserName(address);
                commsLogger.i("Creating new Telecom incoming connection. User name: " + userName);
                TelecomConnection telecomConnection = new TelecomConnection(true, connectionRequest, this.telecomCallAudioRouteObservable);
                telecomConnection.setRinging();
                telecomConnection.setAddress(address, 1);
                telecomConnection.setCallerDisplayName(userName, 1);
                this.callIdToTelecomConnection.put(peek, telecomConnection);
                return telecomConnection;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.telecom.ConnectionService
    public void onCreateIncomingConnectionFailed(@NonNull PhoneAccountHandle phoneAccountHandle, @NonNull ConnectionRequest connectionRequest) {
        synchronized (this.telecomLock) {
            LOG.i("onCreateIncomingConnectionFailed(). Call won't by managed by telecom.");
            MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.addIncomingCall.fail");
            failedConnectionHelper();
        }
    }

    @Override // android.telecom.ConnectionService
    public Connection onCreateOutgoingConnection(@NonNull PhoneAccountHandle phoneAccountHandle, @NonNull ConnectionRequest connectionRequest) {
        synchronized (this.telecomLock) {
            try {
                CommsLogger commsLogger = LOG;
                StringBuilder sb = new StringBuilder("onCreateOutgoingConnection. PhoneAccountHandle: ");
                sb.append(phoneAccountHandle);
                sb.append(", connectionRequest: ");
                sb.append(connectionRequest);
                sb.append(", and its account is: ");
                sb.append(connectionRequest != null ? connectionRequest.getAccountHandle() : null);
                commsLogger.i(sb.toString());
                MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.placeCall.callback");
                String peek = this.telecomCallIds.peek();
                if (peek == null) {
                    commsLogger.i("Call id was null. Creating failed outgoing connection.");
                    return Connection.createFailedConnection(new DisconnectCause(1));
                }
                Uri address = connectionRequest.getAddress();
                new StringBuilder("Creating a new Telecom outgoing connection. ").append(address);
                commsLogger.i(address.toString());
                TelecomConnection telecomConnection = new TelecomConnection(false, connectionRequest, this.telecomCallAudioRouteObservable);
                telecomConnection.setDialing();
                this.callIdToTelecomConnection.put(peek, telecomConnection);
                telecomConnection.setAddress(address, 1);
                return telecomConnection;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.telecom.ConnectionService
    public void onCreateOutgoingConnectionFailed(@NonNull PhoneAccountHandle phoneAccountHandle, @NonNull ConnectionRequest connectionRequest) {
        synchronized (this.telecomLock) {
            LOG.i("onCreateOutgoingConnectionFailed(). Call won't be managed by telecom.");
            MetricsHelper.recordSingleOccurrenceOperational("comms.telecom.placeCall.fail");
            failedConnectionHelper();
        }
    }

    @VisibleForTesting
    public TelecomConnectionService(@NonNull Map<String, Connection> map, @NonNull Queue<String> queue, @NonNull Object obj) {
        this.callIdToTelecomConnection = map;
        this.telecomCallIds = queue;
        this.telecomLock = obj;
    }
}
