package com.amazon.deecomms.smsmessaging.messagingcontroller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.api.compat.model.AlexaEvent;
import com.amazon.comms.log.CommsLogger;
import com.amazon.dee.app.util.Observables$$ExternalSyntheticLambda2;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.core.CapabilitiesManager;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazon.deecomms.smsmessaging.database.SMSDatabaseManager;
import com.amazon.deecomms.smsmessaging.database.SMSDatabaseUtils;
import com.amazon.deecomms.smsmessaging.database.SMSMessageContract;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.amazon.deecomms.smsmessaging.service.fetchsms.SMSReadManager;
import com.amazon.deecomms.smsmessaging.service.fetchsms.SMSReceiveManager;
import dagger.Lazy;
import java.util.Set;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MessagingControllerManager {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, MessagingControllerManager.class);
    private AlexaServiceConnectionReceiver alexaServiceConnectionReceiver;
    private Lazy<AlexaMobileFrameworkApisV2> frameworkApis;
    private CapabilitiesManager mCapabilitiesManager;

    @Inject
    Context mContext;
    private MessagingControllerContextProvider mMessagingControllerContextProvider;
    private SMSReceiveManager mSMSReceiveManager;

    public MessagingControllerManager(@NonNull CapabilitiesManager capabilitiesManager, @NonNull Lazy<AlexaMobileFrameworkApisV2> lazy, @NonNull MessagingControllerContextProvider messagingControllerContextProvider) {
        CommsDaggerWrapper.getComponent().inject(this);
        this.mCapabilitiesManager = capabilitiesManager;
        this.frameworkApis = lazy;
        this.mMessagingControllerContextProvider = messagingControllerContextProvider;
        this.mSMSReceiveManager = new SMSReceiveManager(this.mContext, this);
        this.alexaServiceConnectionReceiver = new AlexaServiceConnectionReceiver(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeMessagingController$0() {
        LOG.i("Trying to start SMS Monitor in initializeMessagingController.");
        newAndStartSMSReceiveManager();
    }

    private void sendEvent(@NonNull String str, @NonNull String str2) {
        if (!this.frameworkApis.get().isStarted()) {
            LOG.w("sendEvent — frameworkApis not started, event dropped: " + str);
            return;
        }
        MessagingControllerEventModel messagingControllerEventModel = new MessagingControllerEventModel(MessagingControllerEventModel.createHeader(str), MessagingControllerEventModel.createPayload(str2));
        LOG.i("Sending Messaging Controller Event: " + messagingControllerEventModel.getAlexaHeader().getName());
        this.frameworkApis.get().getCapabilitiesApi().sendEvent(new AlexaEvent(messagingControllerEventModel.getAlexaHeader(), messagingControllerEventModel.getAlexaPayload()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopSMSReceiveManager() {
        SMSReceiveManager sMSReceiveManager = this.mSMSReceiveManager;
        if (sMSReceiveManager != null) {
            sMSReceiveManager.stopMessageMonitoring();
        }
    }

    public boolean checkPermissions() {
        boolean z;
        boolean z2 = false;
        if (ContextCompat.checkSelfPermission(this.mContext, "android.permission.READ_SMS") != 0) {
            LOG.i("Missing READ_SMS permission.");
            z = false;
        } else {
            z = true;
        }
        if (ContextCompat.checkSelfPermission(this.mContext, "android.permission.RECEIVE_SMS") != 0) {
            LOG.i("Missing RECEIVE_SMS permission.");
            z = false;
        }
        if (ContextCompat.checkSelfPermission(this.mContext, "android.permission.RECEIVE_MMS") != 0) {
            LOG.i("Missing RECEIVE_MMS permission.");
        } else {
            z2 = z;
        }
        LOG.i("Permission Not Granted READ_PHONE_STATE");
        if (!z2) {
            MetricsHelper.recordSingleOccurrenceOperational(SMSMessageContract.MC_MISS_PERMISSION);
        }
        return z2;
    }

    public void finalize() throws Throwable {
        stopSMSReceiveManager();
        super.finalize();
    }

    public void fullSync(@NonNull Context context, int i) {
        LOG.i("Start fullSync.");
        Set<String> allMessageIds = new SMSDatabaseUtils(SMSDatabaseManager.getInstance(context)).getAllMessageIds(SMSMessageContract.READ_TABLE_NAME);
        SMSReadManager sMSReadManager = new SMSReadManager(context);
        sMSReadManager.setReadMessageIdSet(allMessageIds);
        sendEvent(MessagingControllerConstant.MessagingControllerEvents.UploadConversations.toString(), sMSReadManager.getFullSyncPayload(sMSReadManager.getUnreadSMSMMSMessages(i)).toString());
    }

    public void initializeMessagingController() {
        if (!CommsDaggerWrapper.getComponent().getTelephonyManager().isSmsCapable()) {
            LOG.i("Device does not have SMS Capability...skipping MC initialization");
            return;
        }
        CommsLogger commsLogger = LOG;
        commsLogger.i("Initializing messagingController component");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constants.ALEXA_SERVICE_CONNECTION_CONNECTED);
        intentFilter.addAction(Constants.ALEXA_SERVICE_CONNECTION_DISCONNECTED);
        intentFilter.addAction(Constants.ACCESSORY_UPDATED);
        commsLogger.i("Registering receiver for ASC MCC");
        LocalBroadcastManager.getInstance(CommsDaggerWrapper.getComponent().getContext()).registerReceiver(this.alexaServiceConnectionReceiver, intentFilter);
        this.mMessagingControllerContextProvider.updateContext(new Observables$$ExternalSyntheticLambda2(this, 21));
    }

    public void newAndStartSMSReceiveManager() {
        if (!CommsDaggerWrapper.getComponent().getCommsAccessorySessionListener().isAnyAccessoryConnected() || !checkPermissions()) {
            LOG.i("Accessory is not connected or no SMS permission.Not starting SMS monitor.No FullSync.");
            return;
        }
        this.mSMSReceiveManager.startMessageMonitoring();
        fullSync(this.mContext, 40);
        MetricsHelper.recordSingleOccurrenceOperational(SMSMessageContract.MC_UPLOAD_CONNECT);
    }

    public void sendUpdateSendMessageStatusEvent(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MessagingControllerConstant.MESSAGING_CONTROLLER_SEND_MESSAGE_REQUEST_ID, str);
            jSONObject.put("status", str2);
            jSONObject.put(MessagingControllerConstant.MESSAGING_CONTROLLER_STATUS_REASON_KEY, str3);
            jSONObject.put(MessagingControllerConstant.MESSAGING_CONTROLLER_DETAIL_KEY, str4);
            sendEvent(MessagingControllerConstant.MessagingControllerEvents.UpdateSendMessageStatus.toString(), jSONObject.toString());
        } catch (JSONException e) {
            LOG.e("sendUpdateSendMessageStatusEvent error, " + e);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class AlexaServiceConnectionReceiver extends BroadcastReceiver {
        private AlexaServiceConnectionReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CommsLogger commsLogger = MessagingControllerManager.LOG;
            commsLogger.i("Received intent in MCC ASC Receiver");
            if (Constants.ALEXA_SERVICE_CONNECTION_CONNECTED.equals(intent.getAction())) {
                commsLogger.i("Alexa Service connection for MCC connected");
                MessagingControllerManager.this.mMessagingControllerContextProvider.updateContext(null);
                ((AlexaMobileFrameworkApisV2) MessagingControllerManager.this.frameworkApis.get()).getContextProviderApi().registerContextsProvider(CommsDaggerWrapper.getComponent().getMessagingControllerContextProvider());
                commsLogger.i("Connected. Start SMS listener and do FullSync");
                MessagingControllerManager.this.newAndStartSMSReceiveManager();
                return;
            }
            if (Constants.ALEXA_SERVICE_CONNECTION_DISCONNECTED.equals(intent.getAction())) {
                commsLogger.i("Alexa Service connection for MCC disconnected");
                MessagingControllerManager.this.mMessagingControllerContextProvider.updateContext(null);
                MessagingControllerManager.this.stopSMSReceiveManager();
            } else if (Constants.ACCESSORY_UPDATED.equals(intent.getAction())) {
                commsLogger.i("Echo Auto status updated..updating MCC Context Provider");
                MessagingControllerManager.this.mMessagingControllerContextProvider.updateContext(null);
            }
        }

        public /* synthetic */ AlexaServiceConnectionReceiver(MessagingControllerManager messagingControllerManager, int i) {
            this();
        }
    }
}
