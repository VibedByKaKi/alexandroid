package com.amazon.alexa.client.alexaservice.ui.core;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.android.ui.ActivityStarter;
import com.amazon.alexa.android.ui.ActivityStarterModule;
import com.amazon.alexa.api.AlexaConnectingFailedReason;
import com.amazon.alexa.api.AlexaEvent;
import com.amazon.alexa.api.AlexaServices;
import com.amazon.alexa.api.AlexaServicesConnection;
import com.amazon.alexa.client.alexaservice.base.application.ContextModule;
import com.amazon.alexa.utils.TimeProvider;
import dagger.Component;
import java.util.LinkedList;
import java.util.Queue;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class UnlockDeviceActivity extends Activity {
    public static final String EXTRA_LAUNCH_INTENT = "launchIntent";
    public static final String EXTRA_UNLOCK_FAILURE_EVENT = "unlockFailureEvent";
    public static final String EXTRA_UNLOCK_SUCCESS_EVENT = "unlockSuccessEvent";
    private static final int MAX_PENDING_QUEUE_SIZE = 20;
    private static final String TAG = "UnlockDeviceActivity";
    private static final int WINDOW_FLAGS = 6815872;

    @Inject
    ActivityStarter activityStarter;

    @VisibleForTesting
    AlexaConnectionListener alexaConnectionListener;
    private AlexaServicesConnection alexaServicesConnection;
    private volatile boolean isReceiverRegistered;

    @Inject
    KeyguardManager keyguardManager;
    private boolean keyguardUnlockRequested;

    @Inject
    PowerManager powerManager;

    @Inject
    TimeProvider timeProvider;

    @VisibleForTesting
    UserPresentReceiver userPresentReceiver;
    private PowerManager.WakeLock wakeLock;
    private static final long LAUNCH_AFTER_UNLOCK_TIMEOUT_MS = 20000;
    private static final IntentFilter USER_PRESENT_FILTER = new IntentFilter("android.intent.action.USER_PRESENT");
    private final Queue<AlexaEvent> pendingAlexaEvents = new LinkedList();
    private boolean isFinishCalled = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public class AlexaConnectionListener implements AlexaServicesConnection.ConnectionListener {
        public AlexaConnectionListener() {
        }

        @Override // com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListener
        public void onConnected() {
            Log.i(UnlockDeviceActivity.TAG, "alexaServicesConnection connected.");
            while (UnlockDeviceActivity.this.pendingAlexaEvents.size() > 0) {
                String unused = UnlockDeviceActivity.TAG;
                UnlockDeviceActivity unlockDeviceActivity = UnlockDeviceActivity.this;
                unlockDeviceActivity.doSendAlexaEvent((AlexaEvent) unlockDeviceActivity.pendingAlexaEvents.remove());
            }
            if (UnlockDeviceActivity.this.isFinishCalled) {
                UnlockDeviceActivity.this.finish();
            }
        }

        @Override // com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListener
        public void onConnectingFailed(AlexaConnectingFailedReason alexaConnectingFailedReason, String str) {
            Log.w(UnlockDeviceActivity.TAG, "alexaServicesConnection failed to connect: " + alexaConnectingFailedReason.name());
            if (UnlockDeviceActivity.this.pendingAlexaEvents.size() > 0) {
                Log.e(UnlockDeviceActivity.TAG, "failed to send events in queue, alexa service connection failed.");
            }
            if (UnlockDeviceActivity.this.isFinishCalled) {
                UnlockDeviceActivity.this.finish();
            }
        }

        @Override // com.amazon.alexa.api.ConnectionListenerLifecycles.ConnectionListener
        public void onDisconnected() {
            Log.i(UnlockDeviceActivity.TAG, "alexaServicesConnection disconnected.");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Component(modules = {ContextModule.class, UnlockActivityModule.class, ActivityStarterModule.class})
    @Singleton
    public interface UnlockDeviceActivityComponent {
        void inject(UnlockDeviceActivity unlockDeviceActivity);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public class UserPresentReceiver extends BroadcastReceiver {
        private long invokedAt;

        @VisibleForTesting
        final TimeProvider timeProvider;

        public UserPresentReceiver(TimeProvider timeProvider) {
            this.timeProvider = timeProvider;
            this.invokedAt = timeProvider.elapsedRealTime();
        }

        @VisibleForTesting
        public void handleUnlockAfterTimeout() {
            UnlockDeviceActivity.this.sendPendingEventIfNeeded(false);
            UnlockDeviceActivity.this.checkedFinish();
        }

        @VisibleForTesting
        public void handleUnlockWithinTimeout() {
            UnlockDeviceActivity.this.launchIntent();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                context.unregisterReceiver(this);
                UnlockDeviceActivity.this.isReceiverRegistered = false;
                if (this.timeProvider.elapsedRealTime() - this.invokedAt < UnlockDeviceActivity.LAUNCH_AFTER_UNLOCK_TIMEOUT_MS) {
                    handleUnlockWithinTimeout();
                } else {
                    handleUnlockAfterTimeout();
                }
            } catch (IllegalArgumentException e) {
                Log.e(UnlockDeviceActivity.TAG, "Couldn't unregister receiver", e);
            }
        }

        public void updateInvokedAt() {
            this.invokedAt = this.timeProvider.elapsedRealTime();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkedFinish() {
        this.isFinishCalled = true;
        if (this.pendingAlexaEvents.size() == 0) {
            finish();
        }
    }

    private AlexaEvent getPendingEvent(boolean z) {
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        return z ? (AlexaEvent) intent.getParcelableExtra(EXTRA_UNLOCK_SUCCESS_EVENT) : (AlexaEvent) intent.getParcelableExtra(EXTRA_UNLOCK_FAILURE_EVENT);
    }

    private Intent getPendingIntent() {
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        return (Intent) intent.getParcelableExtra(EXTRA_LAUNCH_INTENT);
    }

    private void injectDependencies(@Nullable Bundle bundle) {
        DaggerUnlockDeviceActivity_UnlockDeviceActivityComponent.builder().contextModule(new ContextModule(getApplicationContext())).unlockActivityModule(new UnlockActivityModule()).build().inject(this);
    }

    private void preventActivityAnimation() {
        overridePendingTransition(0, 0);
    }

    private void preventCloseAnimation() {
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, 0, 0);
        }
    }

    private void unlockDevice() {
        if (this.keyguardUnlockRequested) {
            return;
        }
        this.keyguardUnlockRequested = true;
        this.keyguardManager.requestDismissKeyguard(this, new KeyguardManager.KeyguardDismissCallback() { // from class: com.amazon.alexa.client.alexaservice.ui.core.UnlockDeviceActivity.1
            @Override // android.app.KeyguardManager.KeyguardDismissCallback
            public void onDismissCancelled() {
                Log.w(UnlockDeviceActivity.TAG, "Keyguard cancelled");
                UnlockDeviceActivity.this.sendPendingEventIfNeeded(false);
                UnlockDeviceActivity.this.checkedFinish();
            }

            @Override // android.app.KeyguardManager.KeyguardDismissCallback
            public void onDismissError() {
                Log.w(UnlockDeviceActivity.TAG, "Keyguard dismiss error");
                UnlockDeviceActivity.this.sendPendingEventIfNeeded(false);
                UnlockDeviceActivity.this.checkedFinish();
            }

            @Override // android.app.KeyguardManager.KeyguardDismissCallback
            public void onDismissSucceeded() {
                String unused = UnlockDeviceActivity.TAG;
                UnlockDeviceActivity.this.launchIntent();
            }
        });
    }

    @VisibleForTesting
    public void doSendAlexaEvent(AlexaEvent alexaEvent) {
        AlexaServices.EventSender.send(this.alexaServicesConnection, alexaEvent);
    }

    @VisibleForTesting
    public boolean isConnectedToAlexaServices() {
        return this.alexaServicesConnection.isConnected();
    }

    @VisibleForTesting
    public void launchIntent() {
        Intent pendingIntent = getPendingIntent();
        if (pendingIntent != null) {
            try {
                if (pendingIntent.hasExtra("startTimestamp")) {
                    pendingIntent.putExtra("startTimestamp", SystemClock.elapsedRealtime());
                }
                this.activityStarter.startActivity(pendingIntent);
                sendPendingEventIfNeeded(true);
            } catch (ActivityNotFoundException e) {
                Log.w(TAG, "Activity not found: " + e.getMessage());
                sendPendingEventIfNeeded(false);
            }
        }
        checkedFinish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        preventActivityAnimation();
        preventCloseAnimation();
        injectDependencies(bundle);
        this.wakeLock = this.powerManager.newWakeLock(268435466, "vox:unlockDeviceActivity");
        this.userPresentReceiver = new UserPresentReceiver(this.timeProvider);
        this.alexaConnectionListener = new AlexaConnectionListener();
        AlexaServicesConnection alexaServicesConnection = new AlexaServicesConnection(getApplicationContext());
        this.alexaServicesConnection = alexaServicesConnection;
        alexaServicesConnection.registerListener(this.alexaConnectionListener);
        this.alexaServicesConnection.connect();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.isReceiverRegistered) {
            unregisterReceiver(this.userPresentReceiver);
            this.isReceiverRegistered = false;
        }
        this.alexaServicesConnection.deregisterListener(this.alexaConnectionListener);
        this.alexaServicesConnection.disconnect();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        preventActivityAnimation();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.wakeLock.acquire();
        if (this.keyguardManager.isKeyguardLocked()) {
            unlockDevice();
        } else {
            launchIntent();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        preventActivityAnimation();
        this.wakeLock.release();
    }

    @VisibleForTesting
    public void queueUpEvent(AlexaEvent alexaEvent) {
        if (this.pendingAlexaEvents.size() > 20) {
            Log.e(TAG, "max pending event reached. dropping the event.");
        } else {
            this.pendingAlexaEvents.add(alexaEvent);
        }
    }

    @VisibleForTesting
    public void sendPendingEventIfNeeded(boolean z) {
        AlexaEvent pendingEvent = getPendingEvent(z);
        if (pendingEvent == null) {
            return;
        }
        if (isConnectedToAlexaServices()) {
            doSendAlexaEvent(pendingEvent);
        } else {
            queueUpEvent(pendingEvent);
        }
    }
}
