package com.mapbox.maps;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class MapRecorder {
    protected long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MapRecorderPeerCleaner implements Runnable {
        private long peer;

        public MapRecorderPeerCleaner(long j) {
            this.peer = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapRecorder.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
        try {
            nativeSelfRegister();
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public MapRecorder(long j) {
        setPeer(j);
    }

    public static native void cleanNativePeer(long j);

    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static native Expected<String, MapRecorder> createInstance(Map map);

    private static native void nativeSelfRegister();

    private void setPeer(long j) {
        this.peer = j;
        if (j == 0) {
            return;
        }
        CleanerService.register(this, new MapRecorderPeerCleaner(j));
    }

    @MainThread
    public native String getPlaybackState();

    @MainThread
    public native void replay(DataRef dataRef, MapPlayerOptions mapPlayerOptions, PlaybackFinished playbackFinished);

    @MainThread
    public native void startRecording(MapRecorderOptions mapRecorderOptions);

    @MainThread
    public native DataRef stopRecording();

    @MainThread
    public native void togglePauseReplay();
}
