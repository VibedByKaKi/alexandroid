package com.amazon.alexa.client.alexaservice.networking.attachments;

import android.text.TextUtils;
import com.amazon.alexa.api.AudioFormat;
import com.amazon.alexa.assistant.opusencoder.model.OpusConstants;
import com.amazon.alexa.audiocapturer.RecordingRunnable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum DataFormat {
    LPCM16(32000, 320, RecordingRunnable.USER_SPEECH_AUDIO_FORMAT),
    OPUS16(2000, 80, "AUDIO_X_CBR_OPUS_WITH_PREAMBLE_SIZE_0_BIT_RATE_16000_FRAME_SIZE_MILLISECONDS_20"),
    OPUS32(4000, 80, OpusConstants.FORMAT),
    MSBC(-1, 60, "MSBC"),
    BINARY(-1, 320, "BINARY");

    private final String audioFormatToString;
    private final long bytesPerSecond;
    private final int dataFrameSize;
    private boolean isOpusEncoded = false;

    DataFormat(long j, int i, String str) {
        this.bytesPerSecond = j;
        this.dataFrameSize = i;
        this.audioFormatToString = str;
    }

    public static DataFormat fromAudioFormat(String str) {
        return TextUtils.equals(AudioFormat.AUDIO_L16_RATE_16000_CHANNELS_1.name(), str) ? LPCM16 : TextUtils.equals(AudioFormat.AUDIO_X_CBR_OPUS_WITH_PREAMBLE_SIZE_0_BIT_RATE_16000_FRAME_SIZE_MILLISECONDS_20.name(), str) ? OPUS16 : TextUtils.equals(AudioFormat.AUDIO_X_CBR_OPUS_WITH_PREAMBLE_SIZE_0_BIT_RATE_32000_FRAME_SIZE_MILLISECONDS_20.name(), str) ? OPUS32 : TextUtils.equals(AudioFormat.OPUS.name(), str) ? OPUS32 : TextUtils.equals(AudioFormat.MSBC.name(), str) ? MSBC : BINARY;
    }

    public String getAudioFormatToString() {
        return this.audioFormatToString;
    }

    public long getBytesPerMillisecond() {
        return getBytesPerSecond() / 1000;
    }

    public long getBytesPerSecond() {
        return this.bytesPerSecond;
    }

    public int getDataFrameSize() {
        return this.dataFrameSize;
    }

    public boolean hasKnownBitRate() {
        return this.bytesPerSecond >= 0;
    }

    public boolean isOpusEncoded() {
        return this.isOpusEncoded;
    }

    public void setOpusEncoded(boolean z) {
        this.isOpusEncoded = z;
    }
}
