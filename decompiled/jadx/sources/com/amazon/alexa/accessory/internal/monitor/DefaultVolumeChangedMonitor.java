package com.amazon.alexa.accessory.internal.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.SparseIntArray;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.accessory.internal.monitor.VolumeChangedMonitor;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DefaultVolumeChangedMonitor implements VolumeChangedMonitor {

    @VisibleForTesting
    static final String MUTE_STATE_CHANGED_ACTION = "com.amazon.alexa.intent.action.MUTE_STATE_CHANGED_ACTION";
    private final MuteStateBroadcastReceiver broadcastReceiver;
    private final VolumeContentObserver contentObserver;
    private final Context context;
    private final IntentFilter intentFilter;
    private final Set<VolumeChangedMonitor.Observer> observers;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class AudioManagerVolume {
        private final AudioManager audioManager;
        private final SparseIntArray volumeLevels;

        public AudioManagerVolume(Context context) {
            Preconditions.notNull(context, "context");
            SparseIntArray sparseIntArray = new SparseIntArray();
            this.volumeLevels = sparseIntArray;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.audioManager = audioManager;
            sparseIntArray.put(3, audioManager.getStreamVolume(3));
            sparseIntArray.put(0, audioManager.getStreamVolume(0));
            sparseIntArray.put(1, audioManager.getStreamVolume(1));
            sparseIntArray.put(2, audioManager.getStreamVolume(2));
            sparseIntArray.put(5, audioManager.getStreamVolume(5));
        }

        public boolean hasVolumeChanged() {
            boolean z = false;
            for (int i = 0; i < this.volumeLevels.size(); i++) {
                int keyAt = this.volumeLevels.keyAt(i);
                int streamVolume = this.audioManager.getStreamVolume(keyAt);
                if (streamVolume != this.volumeLevels.get(keyAt)) {
                    z = true;
                }
                this.volumeLevels.put(keyAt, streamVolume);
            }
            return z;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class VolumeContentObserver extends ContentObserver {
        private final AudioManagerVolume audioManagerVolume;

        public VolumeContentObserver(Context context) {
            super(new Handler(Looper.myLooper()));
            this.audioManagerVolume = new AudioManagerVolume(context);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            if (this.audioManagerVolume.hasVolumeChanged()) {
                DefaultVolumeChangedMonitor.this.notifyVolumeChanged();
            }
        }
    }

    public DefaultVolumeChangedMonitor(Context context) {
        Preconditions.notNull(context, "context");
        this.context = context;
        this.observers = new HashSet();
        this.contentObserver = new VolumeContentObserver(context);
        this.broadcastReceiver = new MuteStateBroadcastReceiver(this, 0);
        this.intentFilter = new IntentFilter(MUTE_STATE_CHANGED_ACTION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyVolumeChanged() {
        Iterator it2 = new HashSet(this.observers).iterator();
        while (it2.hasNext()) {
            ((VolumeChangedMonitor.Observer) it2.next()).onVolumeChanged();
        }
    }

    @Override // com.amazon.alexa.accessory.internal.monitor.VolumeChangedMonitor
    public void addObserver(VolumeChangedMonitor.Observer observer) {
        Preconditions.mainThread();
        Preconditions.notNull(observer, "observer");
        if (this.observers.isEmpty()) {
            this.context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.contentObserver);
            int i = Build.VERSION.SDK_INT;
            Context context = this.context;
            if (i >= 33) {
                ContextCompat.registerReceiver(context, this.broadcastReceiver, this.intentFilter, 2);
            } else {
                context.registerReceiver(this.broadcastReceiver, this.intentFilter);
            }
        }
        this.observers.add(observer);
    }

    @Override // com.amazon.alexa.accessory.internal.monitor.VolumeChangedMonitor
    public void removeObserver(VolumeChangedMonitor.Observer observer) {
        Preconditions.mainThread();
        Preconditions.notNull(observer, "observer");
        if (this.observers.remove(observer) && this.observers.isEmpty()) {
            this.context.getContentResolver().unregisterContentObserver(this.contentObserver);
            this.context.unregisterReceiver(this.broadcastReceiver);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class MuteStateBroadcastReceiver extends BroadcastReceiver {
        private MuteStateBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DefaultVolumeChangedMonitor.this.notifyVolumeChanged();
        }

        public /* synthetic */ MuteStateBroadcastReceiver(DefaultVolumeChangedMonitor defaultVolumeChangedMonitor, int i) {
            this();
        }
    }
}
