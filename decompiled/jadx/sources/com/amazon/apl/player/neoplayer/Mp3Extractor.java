package com.amazon.apl.player.neoplayer;

import android.media.MediaFormat;
import android.os.Trace;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Mp3Extractor {
    static final int ALARMS_AUDIO_BITRATE = 256000;
    static final int BUFFER_SIZE = 1440;
    private static final int BYTE_ARRAY_INIT_SIZE = 1024;
    static final String MP3_FORMAT_NAME = "audio/mpeg";
    private static final int MP3_HEADER_SIZE = 4;
    static final int MPEG_2_LAYER_III_SAMPLES_PER_FRAME = 576;
    static final int PADDING_LENGTH = 1;
    private static final String TAG = "Mp3Extractor";
    static final int TTS_AUDIO_BITRATE = 48000;
    private ChannelMode mChannel;
    boolean mFirstReadOccurred;
    final byte[] mHeaderBuffer;
    BufferedInputStream mInputStream;
    private long mLastTrackCurrentTimeInMs;
    private MediaFormat mMediaFormat;
    boolean mSlowReadAlerted;
    MpegDataType mStreamDataType;
    private byte[] mThrowawayBytes;
    private long mTrackCurrentTimeInMs;
    private byte[] mTransferBytes;
    private static final byte[] MP3_BEGIN = {-1, -13};
    private static final byte[] MP3_V1_BEGIN = {-1, -5};

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ChannelMode {
        CHANNEL_MODE_STEREO(2, "Stereo"),
        CHANNEL_MODE_JNTSTEREO(2, "Joint Stereo"),
        CHANNEL_MODE_MONO(1, "Mono"),
        CHANNEL_MODE_DEFAULT(1, "Default (Mono)");

        private final int mChannelNum;
        private final String mName;

        ChannelMode(int i, String str) {
            this.mChannelNum = i;
            this.mName = str;
        }

        public static ChannelMode fromByte(byte b) {
            int i = (b & 192) >> 6;
            return i != 0 ? i != 1 ? i != 3 ? CHANNEL_MODE_DEFAULT : CHANNEL_MODE_MONO : CHANNEL_MODE_JNTSTEREO : CHANNEL_MODE_STEREO;
        }

        public int getChannelNum() {
            return this.mChannelNum;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    public Mp3Extractor() {
        Trace.beginSection("Mp3Extractor create");
        try {
            this.mHeaderBuffer = new byte[4];
            this.mThrowawayBytes = new byte[1024];
        } finally {
            Trace.endSection();
        }
    }

    private boolean advance(int i) throws IOException {
        Trace.beginSection("Mp3Extractor advance");
        try {
            BufferedInputStream bufferedInputStream = this.mInputStream;
            if (bufferedInputStream == null) {
                return false;
            }
            if (this.mThrowawayBytes.length < i) {
                this.mThrowawayBytes = new byte[i];
            }
            if (readBytesInternal(this.mThrowawayBytes, i, bufferedInputStream) < i) {
                return false;
            }
            Trace.endSection();
            return true;
        } finally {
            Trace.endSection();
        }
    }

    private boolean advanceToMp3Type(MpegDataType mpegDataType) throws IOException {
        Trace.beginSection("Mp3Extractor advanceToMp3Type");
        try {
            if (this.mInputStream == null) {
                return false;
            }
            Objects.toString(mpegDataType);
            MpegDataType dataType = getDataType();
            while (true) {
                if (dataType != null) {
                    if (dataType.getSampleRate() == mpegDataType.getSampleRate()) {
                        return true;
                    }
                }
                if (!advance(1)) {
                    return false;
                }
                dataType = getDataType();
            }
        } finally {
            Trace.endSection();
        }
    }

    private boolean advanceToValidMp3() throws IOException {
        Trace.beginSection("Mp3Extractor advanceToValidMp3");
        try {
            if (this.mInputStream == null) {
                return false;
            }
            MpegDataType dataType = getDataType();
            while (dataType == null) {
                if (!advance(1)) {
                    return false;
                }
                dataType = getDataType();
            }
            return true;
        } finally {
            Trace.endSection();
        }
    }

    private boolean checkFirstBytes(byte[] bArr, byte[] bArr2) {
        Trace.beginSection("Mp3Extractor checkFirstBytes");
        try {
            if (bArr2.length < bArr.length) {
                return false;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
            }
            Trace.endSection();
            return true;
        } finally {
            Trace.endSection();
        }
    }

    private void closeInputStream() {
        BufferedInputStream bufferedInputStream = this.mInputStream;
        if (bufferedInputStream == null) {
            return;
        }
        try {
            bufferedInputStream.close();
        } catch (IOException e) {
            Log.w(TAG, "Couldn't close input stream.", e);
        }
    }

    private int readBytesInternal(byte[] bArr, int i, InputStream inputStream) throws IOException {
        Trace.beginSection("Mp3Extractor readBytesInternal");
        try {
            if (this.mInputStream == null) {
                return -1;
            }
            int i2 = 0;
            int i3 = 0;
            while (i != 0 && i2 != -1) {
                if (this.mInputStream == null) {
                    break;
                }
                i2 = inputStream.read(bArr, i3, i);
                if (i2 != -1) {
                    i -= i2;
                    i3 += i2;
                } else {
                    closeInputStream();
                    this.mInputStream = null;
                }
            }
            return i3;
        } finally {
            Trace.endSection();
        }
    }

    private void switchFormats() throws IOException {
        MpegDataType dataType = getDataType();
        this.mStreamDataType = dataType;
        this.mTransferBytes = new byte[dataType.getFrameLength() + 1];
    }

    public BufferedInputStream createBufferedInputStream(InputStream inputStream, int i) {
        return new BufferedInputStream(inputStream, 1440);
    }

    public void fireSlowReadAlert(long j, long j2) {
        if (j > 0 && !this.mSlowReadAlerted) {
            Log.w(TAG, "The input stream read was too slow.");
            this.mSlowReadAlerted = true;
        }
    }

    public long getCurrentPosition() {
        return this.mTrackCurrentTimeInMs;
    }

    public long getCurrentSystemTime() {
        return System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.apl.player.neoplayer.MpegDataType getDataType() throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = "Mp3Extractor getDataType"
            android.os.Trace.beginSection(r0)
            java.io.BufferedInputStream r0 = r4.mInputStream     // Catch: java.lang.Throwable -> L79
            r1 = 0
            if (r0 != 0) goto L15
            java.lang.String r4 = "Mp3Extractor"
            java.lang.String r0 = "No input stream to get data type from. Returning null."
            android.util.Log.w(r4, r0)     // Catch: java.lang.Throwable -> L79
            android.os.Trace.endSection()
            return r1
        L15:
            java.lang.String r0 = "Mp3Extractor getDataType mark"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L79
            java.io.BufferedInputStream r0 = r4.mInputStream     // Catch: java.lang.Throwable -> L74
            r2 = 4
            r0.mark(r2)     // Catch: java.lang.Throwable -> L74
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L79
            byte[] r0 = r4.mHeaderBuffer     // Catch: java.lang.Throwable -> L79
            java.io.BufferedInputStream r3 = r4.mInputStream     // Catch: java.lang.Throwable -> L79
            int r0 = r4.readBytesInternal(r0, r2, r3)     // Catch: java.lang.Throwable -> L79
            if (r0 >= r2) goto L31
            android.os.Trace.endSection()
            return r1
        L31:
            java.lang.String r0 = "Mp3Extractor getDataType reset"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L79
            java.io.BufferedInputStream r0 = r4.mInputStream     // Catch: java.lang.Throwable -> L6f
            r0.reset()     // Catch: java.lang.Throwable -> L6f
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L79
            byte[] r0 = com.amazon.apl.player.neoplayer.Mp3Extractor.MP3_BEGIN     // Catch: java.lang.Throwable -> L79
            byte[] r2 = r4.mHeaderBuffer     // Catch: java.lang.Throwable -> L79
            boolean r0 = r4.checkFirstBytes(r0, r2)     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L57
            byte[] r0 = com.amazon.apl.player.neoplayer.Mp3Extractor.MP3_V1_BEGIN     // Catch: java.lang.Throwable -> L79
            byte[] r2 = r4.mHeaderBuffer     // Catch: java.lang.Throwable -> L79
            boolean r0 = r4.checkFirstBytes(r0, r2)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L53
            goto L57
        L53:
            android.os.Trace.endSection()
            return r1
        L57:
            byte[] r0 = r4.mHeaderBuffer     // Catch: java.lang.Throwable -> L79
            r1 = 3
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L79
            com.amazon.apl.player.neoplayer.Mp3Extractor$ChannelMode r0 = com.amazon.apl.player.neoplayer.Mp3Extractor.ChannelMode.fromByte(r0)     // Catch: java.lang.Throwable -> L79
            r4.mChannel = r0     // Catch: java.lang.Throwable -> L79
            byte[] r4 = r4.mHeaderBuffer     // Catch: java.lang.Throwable -> L79
            r0 = 2
            r4 = r4[r0]     // Catch: java.lang.Throwable -> L79
            com.amazon.apl.player.neoplayer.MpegDataType r4 = com.amazon.apl.player.neoplayer.MpegDataType.fromByte(r4)     // Catch: java.lang.Throwable -> L79
            android.os.Trace.endSection()
            return r4
        L6f:
            r4 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L79
            throw r4     // Catch: java.lang.Throwable -> L79
        L74:
            r4 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L79
            throw r4     // Catch: java.lang.Throwable -> L79
        L79:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.apl.player.neoplayer.Mp3Extractor.getDataType():com.amazon.apl.player.neoplayer.MpegDataType");
    }

    public int getFrameLength() {
        MpegDataType mpegDataType = this.mStreamDataType;
        if (mpegDataType == null) {
            return -2;
        }
        return mpegDataType.getFrameLength();
    }

    public int getSampleRate() {
        MpegDataType mpegDataType = this.mStreamDataType;
        if (mpegDataType == null) {
            return -2;
        }
        return mpegDataType.getSampleRate();
    }

    public MediaFormat getTrackFormat() {
        Trace.beginSection("Mp3Extractor getTrackFormat");
        try {
            ChannelMode channelMode = this.mChannel;
            int channelNum = channelMode == null ? 1 : channelMode.getChannelNum();
            this.mMediaFormat = MediaFormat.createAudioFormat("audio/mpeg", this.mStreamDataType.getSampleRate() * channelNum, channelNum);
            int sampleRate = this.mStreamDataType.getSampleRate();
            MediaFormat mediaFormat = this.mMediaFormat;
            if (sampleRate == 48000) {
                mediaFormat.setInteger("bitrate", 256000);
            } else {
                mediaFormat.setInteger("bitrate", 48000);
            }
            return this.mMediaFormat;
        } finally {
            Trace.endSection();
        }
    }

    public boolean isFinished() {
        return this.mInputStream == null;
    }

    public String printHexHeader(byte[] bArr) {
        String str = "";
        for (byte b : bArr) {
            str = str.concat(String.format("%02X ", Byte.valueOf(b)));
        }
        return str;
    }

    public synchronized int readBytes(ByteBuffer byteBuffer) throws IOException {
        Trace.beginSection("Mp3Extractor readBytes");
        try {
            if (this.mInputStream == null) {
                Trace.endSection();
                return -1;
            }
            MpegDataType dataType = getDataType();
            if (dataType == null || dataType.getSampleRate() != this.mStreamDataType.getSampleRate()) {
                if (!advanceToMp3Type(this.mStreamDataType)) {
                    Trace.endSection();
                    return -1;
                }
                int readBytes = readBytes(byteBuffer);
                Trace.endSection();
                return readBytes;
            }
            this.mTrackCurrentTimeInMs += 576000 / this.mStreamDataType.getSampleRate();
            long currentSystemTime = getCurrentSystemTime();
            int frameLength = dataType.getFrameLength() + (dataType.isPadded() ? 1 : 0);
            int readBytesInternal = readBytesInternal(this.mTransferBytes, frameLength, this.mInputStream);
            long currentSystemTime2 = getCurrentSystemTime() - currentSystemTime;
            long j = this.mTrackCurrentTimeInMs - this.mLastTrackCurrentTimeInMs;
            if (this.mFirstReadOccurred && currentSystemTime2 > j) {
                fireSlowReadAlert(j, currentSystemTime2);
            }
            this.mFirstReadOccurred = true;
            this.mLastTrackCurrentTimeInMs = this.mTrackCurrentTimeInMs;
            byteBuffer.put(this.mTransferBytes, 0, frameLength);
            Trace.endSection();
            return readBytesInternal;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public synchronized void release() {
        Trace.beginSection("Mp3Extractor release");
        try {
            this.mMediaFormat = null;
            closeInputStream();
            this.mInputStream = null;
            this.mStreamDataType = null;
        } finally {
            Trace.endSection();
        }
    }

    public synchronized void setDataSource(InputStream inputStream) throws IOException {
        Trace.beginSection("Mp3Extractor setDataSource");
        try {
            if (inputStream == null) {
                throw new IllegalArgumentException("inStream cannot be null.");
            }
            closeInputStream();
            this.mSlowReadAlerted = false;
            this.mFirstReadOccurred = false;
            this.mInputStream = null;
            this.mInputStream = createBufferedInputStream(inputStream, 1440);
            this.mStreamDataType = null;
            if (!advanceToValidMp3()) {
                throw new IOException("Stream contained no valid mp3 data. Valid mp3 data is MPEG Layer 2 Version III. Supported bitrate is 48kbps. Supported sample rates are 22050Hz, 24000Hz, and 16000Hz. See https://tiny.amazon.com/ncgitm63/deveamazpublsolualexalexdocs for more information.\nWe also temporarily support MPEG version 1 layer III bitrate 256kbps sample rate 48kHz");
            }
            switchFormats();
            this.mTrackCurrentTimeInMs = 0L;
            Integer valueOf = Integer.valueOf(this.mStreamDataType.getSampleRate());
            ChannelMode channelMode = this.mChannel;
            Log.i(TAG, String.format("Format is %d. ChannelMode is %s", valueOf, channelMode != null ? channelMode.toString() : null));
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
