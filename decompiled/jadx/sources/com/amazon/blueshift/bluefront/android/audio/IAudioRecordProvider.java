package com.amazon.blueshift.bluefront.android.audio;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IAudioRecordProvider {
    public static final int CHANNELS = 16;
    public static final int DEFAULT_RECORDER_POSITION_NOTIFICATION_PERIOD = 100;
    public static final int FORMAT = 2;
    public static final int SAMPLE_RATE = 16000;

    AudioRecordWrapper getAudioRecord();

    void releaseAudioRecord();
}
