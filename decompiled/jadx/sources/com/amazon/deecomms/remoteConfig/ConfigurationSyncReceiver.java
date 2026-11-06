package com.amazon.deecomms.remoteConfig;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ConfigurationSyncReceiver extends BroadcastReceiver {
    public static final String ACTION_RETRY_SYNC = "com.amazon.deecomms.receiver.ACTION_RETRY_SYNC";
    public static final String CONFIG_SYNC_ALARM_ACTION = "com.amazon.deecomms.receiver.CONFIG_SYNC_ACTION";
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ConfigurationSyncReceiver.class);

    private void requestSync(Context context, int i) {
        LOG.i("Requesting sync. Attempt number " + i);
        Intent intent = new Intent(context, (Class<?>) ConfigurationSyncService.class);
        intent.setAction(ConfigurationSyncService.ACTION_SYNC_CONFIG);
        intent.putExtra(ConfigurationSyncService.EXTRA_RETRY_ATTEMPT, i);
        ConfigurationSyncService.enqueueWork(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        CommsLogger commsLogger = LOG;
        commsLogger.i("OnReceive - Alarm received in ConfigurationSyncReceiver- " + System.currentTimeMillis() + "Received event " + intent.getAction());
        if (CONFIG_SYNC_ALARM_ACTION.equals(intent.getAction()) || "android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            requestSync(context, 0);
            return;
        }
        if (!ACTION_RETRY_SYNC.equals(intent.getAction())) {
            commsLogger.i("Ignoring event " + intent.getAction());
        } else {
            commsLogger.i("Requesting sync retry. Retry attempt number: " + intent.getIntExtra(ConfigurationSyncService.EXTRA_RETRY_ATTEMPT, 0));
            requestSync(context, intent.getIntExtra(ConfigurationSyncService.EXTRA_RETRY_ATTEMPT, 0));
        }
    }
}
