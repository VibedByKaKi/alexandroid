package com.amazon.deecomms.calling.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import android.os.PowerManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ProximityLockHelper {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ProximityLockHelper.class);
    private static final String PROXIMITY_SENSOR_WAKE_LOCK_TAG = "AlexaComms:CommsProximitySensorWakeLock";
    private static ProximityLockHelper sInstance;
    private final AudioManager audioManager;
    private final Context context;
    private boolean isCallInProgress;
    private PowerManager.WakeLock proximitySensorWakeLock;
    private final BroadcastReceiver speakerStateReceiver;

    private ProximityLockHelper(Context context) {
        int i = 0;
        Preconditions.checkState(Looper.getMainLooper() == Looper.myLooper());
        this.context = context;
        SpeakerStateReceiver speakerStateReceiver = new SpeakerStateReceiver(this, i);
        this.speakerStateReceiver = speakerStateReceiver;
        LocalBroadcastManager.getInstance(context).registerReceiver(speakerStateReceiver, new IntentFilter(CallUtils.INTENT_ACTION_SPEAKER));
        this.audioManager = (AudioManager) context.getSystemService("audio");
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager.isWakeLockLevelSupported(32)) {
            this.proximitySensorWakeLock = powerManager.newWakeLock(32, PROXIMITY_SENSOR_WAKE_LOCK_TAG);
        } else {
            LOG.w("Proximity lock not supported for the current API level");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void acquireLockInternal() {
        PowerManager.WakeLock wakeLock = this.proximitySensorWakeLock;
        if (wakeLock == null || wakeLock.isHeld() || this.audioManager.isSpeakerphoneOn()) {
            return;
        }
        LOG.i("Proximity lock acquired");
        this.proximitySensorWakeLock.acquire();
    }

    public static synchronized ProximityLockHelper getInstance(Context context) {
        ProximityLockHelper proximityLockHelper;
        synchronized (ProximityLockHelper.class) {
            try {
                if (sInstance == null) {
                    sInstance = new ProximityLockHelper(context);
                }
                proximityLockHelper = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return proximityLockHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void releaseLockInternal() {
        PowerManager.WakeLock wakeLock = this.proximitySensorWakeLock;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        LOG.i("Proximity lock released");
        this.proximitySensorWakeLock.release();
    }

    public void cleanup() {
        Preconditions.checkState(Looper.getMainLooper() == Looper.myLooper());
        releaseLockInternal();
        LocalBroadcastManager.getInstance(this.context).unregisterReceiver(this.speakerStateReceiver);
    }

    public void markCallEnded() {
        Preconditions.checkState(Looper.getMainLooper() == Looper.myLooper());
        this.isCallInProgress = false;
        releaseLockInternal();
    }

    public void markCallStarted() {
        Preconditions.checkState(Looper.getMainLooper() == Looper.myLooper());
        this.isCallInProgress = true;
        acquireLockInternal();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class SpeakerStateReceiver extends BroadcastReceiver {
        private SpeakerStateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ProximityLockHelper proximityLockHelper = ProximityLockHelper.this;
            if (!proximityLockHelper.isCallInProgress) {
                ProximityLockHelper.LOG.e("Received speaker state notification when there is no ongoing call");
                return;
            }
            boolean isSpeakerphoneOn = proximityLockHelper.audioManager.isSpeakerphoneOn();
            ProximityLockHelper proximityLockHelper2 = ProximityLockHelper.this;
            if (isSpeakerphoneOn) {
                proximityLockHelper2.releaseLockInternal();
            } else {
                proximityLockHelper2.acquireLockInternal();
            }
        }

        public /* synthetic */ SpeakerStateReceiver(ProximityLockHelper proximityLockHelper, int i) {
            this();
        }
    }
}
