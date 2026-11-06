package com.amazon.apl.player.neoplayer;

import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MpegDataType {
    static final byte MPEG_16000_BYTE_CODE = 104;
    static final int MPEG_16000_FRAME_LENGTH = 216;
    static final int MPEG_16000_SAMPLE_RATE = 16000;
    static final byte MPEG_22050_BYTE_CODE = 96;
    static final int MPEG_22050_FRAME_LENGTH = 156;
    static final int MPEG_22050_SAMPLE_RATE = 22050;
    static final byte MPEG_24000_BYTE_CODE = 100;
    static final int MPEG_24000_FRAME_LENGTH = 144;
    static final int MPEG_24000_SAMPLE_RATE = 24000;
    static final int MPEG_v1_br256_48000_BYTE_CODE = 212;
    static final int MPEG_v1_br256_48000_FRAME_LENGTH = 768;
    static final int MPEG_v1_br256_48000_SAMPLE_RATE = 48000;
    private static final String TAG = "MpegDataType";
    private final int mFrameLength;
    private boolean mIsPadded;
    private final int mSampleRate;

    public MpegDataType(byte b) {
        if ((b & 2) > 0) {
            this.mIsPadded = true;
        }
        int i = b & 253;
        if (i == 96) {
            this.mSampleRate = MPEG_22050_SAMPLE_RATE;
            this.mFrameLength = 156;
            return;
        }
        if (i == 100) {
            this.mSampleRate = MPEG_24000_SAMPLE_RATE;
            this.mFrameLength = 144;
        } else if (i == 104) {
            this.mSampleRate = 16000;
            this.mFrameLength = 216;
        } else {
            if (i != 212) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(b, "Unrecognized MPEG Version: "));
                throw null;
            }
            this.mSampleRate = 48000;
            this.mFrameLength = 768;
        }
    }

    public static MpegDataType fromByte(byte b) {
        try {
            return new MpegDataType(b);
        } catch (IllegalArgumentException e) {
            Log.e(TAG, "Could not create MpegDataType.", e);
            return null;
        }
    }

    public int getFrameLength() {
        return this.mFrameLength;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public boolean isPadded() {
        return this.mIsPadded;
    }
}
