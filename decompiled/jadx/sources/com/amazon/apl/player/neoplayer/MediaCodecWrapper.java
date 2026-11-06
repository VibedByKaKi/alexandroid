package com.amazon.apl.player.neoplayer;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.nio.ByteBuffer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaCodecWrapper {
    private static final String TAG = "MediaCodecWrapper";
    private final MediaCodec mMediaCodec;
    private MediaFormat mMediaFormat;

    public MediaCodecWrapper(MediaCodec mediaCodec) {
        Trace.beginSection("MediaCodecWrapper create(MediaCodec)");
        try {
            if (mediaCodec == null) {
                throw new IllegalArgumentException("MediaCodec cannot be null");
            }
            this.mMediaCodec = mediaCodec;
        } finally {
            Trace.endSection();
        }
    }

    private MediaCodec createMediaCodec(String str) {
        try {
            return MediaCodec.createDecoderByType(str);
        } catch (IOException e) {
            Log.e(TAG, "Failed to create mediaCodec to wrap.", e);
            Single$$ExternalSyntheticBUOutline0.m$3(Automotive$$ExternalSyntheticOutline0.m(e, a$$ExternalSyntheticOutline0.m2m("MediaCodec could not initialize with argument ", str, ". Reason: ")));
            return null;
        }
    }

    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        Trace.beginSection("MediaCodecWrapper configure");
        try {
            this.mMediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        } finally {
            Trace.endSection();
        }
    }

    public int dequeueInputBuffer(long j) {
        Trace.beginSection("MediaCodecWrapper dequeueInputBuffer");
        try {
            return this.mMediaCodec.dequeueInputBuffer(j);
        } finally {
            Trace.endSection();
        }
    }

    public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j) {
        Trace.beginSection("MediaCodecWrapper dequeueOutputBuffer");
        try {
            return this.mMediaCodec.dequeueOutputBuffer(bufferInfo, j);
        } finally {
            Trace.endSection();
        }
    }

    public void flush() {
        Trace.beginSection("MediaCodecWrapper flush()");
        try {
            this.mMediaCodec.flush();
        } finally {
            Trace.endSection();
        }
    }

    public ByteBuffer getInputBuffer(int i) {
        Trace.beginSection("MediaCodecWrapper getInputBuffer");
        try {
            return this.mMediaCodec.getInputBuffer(i);
        } finally {
            Trace.endSection();
        }
    }

    public MediaFormat getInputFormat() {
        Trace.beginSection("MediaCodecWrapper getInputFormat");
        try {
            return this.mMediaCodec.getInputFormat();
        } finally {
            Trace.endSection();
        }
    }

    public MediaCodec.BufferInfo getMediaCodecBufferInfo() {
        Trace.beginSection("MediaCodecWrapper getMediaCodecBufferInfo");
        try {
            return new MediaCodec.BufferInfo();
        } finally {
            Trace.endSection();
        }
    }

    public ByteBuffer getOutputBuffer(int i) {
        Trace.beginSection("MediaCodecWrapper getOutputBuffer");
        try {
            return this.mMediaCodec.getOutputBuffer(i);
        } finally {
            Trace.endSection();
        }
    }

    public MediaFormat getOutputFormat() {
        Trace.beginSection("MediaCodecWrapper getOutputFormat");
        try {
            return this.mMediaCodec.getOutputFormat();
        } finally {
            Trace.endSection();
        }
    }

    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        Trace.beginSection("MediaCodecWrapper queueInputBuffer");
        try {
            this.mMediaCodec.queueInputBuffer(i, i2, i3, j, i4);
        } finally {
            Trace.endSection();
        }
    }

    public void release() {
        Trace.beginSection("MediaCodecWrapper release");
        try {
            this.mMediaCodec.release();
        } finally {
            Trace.endSection();
        }
    }

    public void releaseOutputBuffer(int i, boolean z) {
        Trace.beginSection("MediaCodecWrapper releaseOutputBuffer");
        try {
            this.mMediaCodec.releaseOutputBuffer(i, z);
        } finally {
            Trace.endSection();
        }
    }

    public void reset() {
        Trace.beginSection("MediaCodecWrapper reset()");
        try {
            this.mMediaCodec.reset();
        } finally {
            Trace.endSection();
        }
    }

    public void start() {
        Trace.beginSection("MediaCodecWrapper start");
        try {
            this.mMediaCodec.start();
            this.mMediaFormat = this.mMediaCodec.getOutputFormat();
        } finally {
            Trace.endSection();
        }
    }

    public void stop() {
        Trace.beginSection("MediaCodecWrapper stop");
        try {
            this.mMediaCodec.stop();
        } finally {
            Trace.endSection();
        }
    }

    public MediaCodecWrapper(String str) {
        Trace.beginSection("MediaCodecWrapper create(String)");
        try {
            this.mMediaCodec = createMediaCodec(str);
        } finally {
            Trace.endSection();
        }
    }
}
