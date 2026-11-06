package org.webrtc;

import java.util.IdentityHashMap;
import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class VideoTrack extends MediaStreamTrack {
    private final IdentityHashMap<VideoSink, Long> sinks;

    public VideoTrack(long j) {
        super(j);
        this.sinks = new IdentityHashMap<>();
    }

    private static native void nativeAddSink(long j, long j2);

    private static native void nativeFreeSink(long j);

    private static native void nativeRemoveSink(long j, long j2);

    private static native long nativeWrapSink(VideoSink videoSink);

    public void addSink(VideoSink videoSink) {
        if (videoSink == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The VideoSink is not allowed to be null");
        } else {
            if (this.sinks.containsKey(videoSink)) {
                return;
            }
            long nativeWrapSink = nativeWrapSink(videoSink);
            this.sinks.put(videoSink, Long.valueOf(nativeWrapSink));
            nativeAddSink(getNativeMediaStreamTrack(), nativeWrapSink);
        }
    }

    @Override // org.webrtc.MediaStreamTrack
    public void dispose() {
        Iterator<Long> it2 = this.sinks.values().iterator();
        while (it2.hasNext()) {
            long longValue = it2.next().longValue();
            nativeRemoveSink(getNativeMediaStreamTrack(), longValue);
            nativeFreeSink(longValue);
        }
        this.sinks.clear();
        super.dispose();
    }

    public long getNativeVideoTrack() {
        return getNativeMediaStreamTrack();
    }

    public void removeSink(VideoSink videoSink) {
        Long remove = this.sinks.remove(videoSink);
        if (remove != null) {
            nativeRemoveSink(getNativeMediaStreamTrack(), remove.longValue());
            nativeFreeSink(remove.longValue());
        }
    }
}
