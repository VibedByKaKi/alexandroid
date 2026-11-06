package com.amazon.apl.player.audio;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioAttributes;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.amazon.apl.player.audio.AudioPlayer;
import com.amazon.apl.player.neoplayer.ITrackPlayer;
import com.amazon.apl.player.neoplayer.TrackPlayer;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeoutException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NeoAudioPlayer implements AudioPlayer {
    private static final boolean DEBUG = "userdebug".equals(Build.TYPE);
    static String FIRE_TV_FEATURE = "amazon.hardware.fire_tv";
    static final int MAX_LEVELS = 5;
    static final String METRICS_METADATA_ACTUAL_TIME = "actual_time";
    static final String METRICS_METADATA_BUDGETED_TIME = "budgeted_time";
    static final String METRICS_METADATA_WIFI_PERMISSIONS_MISSING_FROM_PKG = "pkg_needs_wifi_perm";
    static final String METRICS_METADATA_WIFI_SIGNAL = "wifi_signal";
    static final String METRICS_SLOW_MEDIA_FILE_READ = "TtsMediaPlayer.SlowMediaFileRead";
    private static final String TAG = "NeoAudioPlayer";
    private final Context mContext;
    final ITrackPlayer mITrackPlayer;
    private NeoPlayerFactory mNeoPlayerFactory;
    NeoPlayerListener mNeoPlayerListener;
    PackageManager pm;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NeoPlayerFactory {
        public ITrackPlayer create() {
            return new TrackPlayer(1);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class NeoPlayerListener implements ITrackPlayer.Listener {
        private final AudioPlayer.AudioPlayerListener mInternalListener;

        public NeoPlayerListener(AudioPlayer.AudioPlayerListener audioPlayerListener) {
            if (audioPlayerListener != null) {
                this.mInternalListener = audioPlayerListener;
            } else {
                Single$$ExternalSyntheticBUOutline0.m$3("listener cannot be null.");
                throw null;
            }
        }

        @Override // com.amazon.apl.player.neoplayer.ITrackPlayer.Listener
        public void onPlayerError(Exception exc) {
            this.mInternalListener.onPlayerError(exc);
        }

        @Override // com.amazon.apl.player.neoplayer.ITrackPlayer.Listener
        public void onPlayerStateChanged(ITrackPlayer.NeoPlayerState neoPlayerState) {
            this.mInternalListener.onPlayerStateChanged(true, AudioPlayer.AudioPlayerState.values()[neoPlayerState.ordinal()]);
        }
    }

    public NeoAudioPlayer(Context context, NeoPlayerFactory neoPlayerFactory, boolean z, int i) {
        this.mNeoPlayerFactory = neoPlayerFactory;
        this.mContext = context;
        this.pm = context.getPackageManager();
        Trace.beginSection("NeoAudioPlayer create");
        try {
            this.mITrackPlayer = newNeoPlayer(z, i);
        } finally {
            Trace.endSection();
        }
    }

    private int getWifiSignalLevel() {
        WifiInfo connectionInfo;
        WifiManager wifiManager = getWifiManager();
        if (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) {
            return -1;
        }
        return calculateSignalLevel(connectionInfo.getRssi());
    }

    public int calculateSignalLevel(int i) {
        return WifiManager.calculateSignalLevel(i, 5);
    }

    @Override // com.amazon.apl.player.audio.AudioPlayer
    public long getCurrentPosition() {
        Trace.beginSection("NeoAudioPlayer getCurrentPosition");
        try {
            return this.mITrackPlayer.getCurrentPosition();
        } finally {
            Trace.endSection();
        }
    }

    public WifiManager getWifiManager() {
        return (WifiManager) this.mContext.getSystemService("wifi");
    }

    public ITrackPlayer newNeoPlayer(boolean z, int i) {
        ITrackPlayer create = this.mNeoPlayerFactory.create();
        if (z || this.pm.hasSystemFeature(FIRE_TV_FEATURE)) {
            create.setAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(1).setFlags(1).build());
            return create;
        }
        if (i == 1) {
            create.setAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(2).build());
            return create;
        }
        if (i == 3) {
            create.setAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
            return create;
        }
        Log.e(TAG, String.format("Stream type %d not supported", Integer.valueOf(i)));
        return create;
    }

    @Override // com.amazon.apl.player.audio.AudioPlayer
    public void play() {
        try {
            this.mITrackPlayer.play();
        } catch (IllegalStateException | TimeoutException e) {
            Log.e(TAG, "Failed to play.", e);
        }
    }

    @Override // com.amazon.apl.player.audio.AudioPlayer
    public void prepare(InputStream inputStream) {
        Trace.beginSection("NeoAudioPlayer play");
        try {
            if (inputStream == null) {
                throw new IllegalArgumentException("inputStream cannot be null.");
            }
            try {
                this.mITrackPlayer.loadStream(inputStream);
            } catch (IOException e) {
                Log.e(TAG, "Could not read from stream.", e);
            } catch (TimeoutException e2) {
                Log.e(TAG, "Timed out waiting for previous play to stop.", e2);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.amazon.apl.player.audio.AudioPlayer
    public void release() {
        Trace.beginSection("NeoAudioPlayer release");
        try {
            removeListener();
            this.mITrackPlayer.release();
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.amazon.apl.player.audio.AudioPlayer
    public synchronized void removeListener() {
        Trace.beginSection("NeoAudioPlayer removeListener");
        try {
            if (this.mNeoPlayerListener == null) {
                return;
            }
            this.mITrackPlayer.setListener(null);
            this.mNeoPlayerListener = null;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.amazon.apl.player.audio.AudioPlayer
    public void setListener(AudioPlayer.AudioPlayerListener audioPlayerListener) {
        Trace.beginSection("NeoAudioPlayer setListener");
        try {
            if (audioPlayerListener == null) {
                throw new IllegalArgumentException("backendPlayerListener cannot be null.");
            }
            NeoPlayerListener neoPlayerListener = new NeoPlayerListener(audioPlayerListener);
            this.mNeoPlayerListener = neoPlayerListener;
            this.mITrackPlayer.setListener(neoPlayerListener);
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.amazon.apl.player.audio.AudioPlayer
    public void stop() throws TimeoutException {
        Trace.beginSection("NeoAudioPlayer stop");
        try {
            this.mITrackPlayer.stop();
        } finally {
            Trace.endSection();
        }
    }

    public NeoAudioPlayer(Context context, boolean z, int i) {
        this(context, new NeoPlayerFactory(), z, i);
    }
}
