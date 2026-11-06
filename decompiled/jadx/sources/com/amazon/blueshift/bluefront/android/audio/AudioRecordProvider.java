package com.amazon.blueshift.bluefront.android.audio;

import android.media.AudioRecord;
import com.google.common.annotations.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AudioRecordProvider implements IAudioRecordProvider {
    public static final AudioRecordProvider INSTANCE = new AudioRecordProvider(new AudioRecordBuilder());
    private AudioRecordWrapper mAudioRecord;
    private final AudioRecordBuilder mAudioRecordBuilder;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AudioRecordBuilder {
        public AudioRecordWrapper build() {
            return new AudioRecordWrapper(6, 16000, 16, 2, AudioRecord.getMinBufferSize(16000, 16, 2));
        }
    }

    @VisibleForTesting
    public AudioRecordProvider(AudioRecordBuilder audioRecordBuilder) {
        this.mAudioRecordBuilder = audioRecordBuilder;
    }

    @Override // com.amazon.blueshift.bluefront.android.audio.IAudioRecordProvider
    public synchronized AudioRecordWrapper getAudioRecord() {
        try {
            if (this.mAudioRecord == null) {
                AudioRecordWrapper build = this.mAudioRecordBuilder.build();
                this.mAudioRecord = build;
                build.setPositionNotificationPeriod(100);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mAudioRecord;
    }

    @Override // com.amazon.blueshift.bluefront.android.audio.IAudioRecordProvider
    public void releaseAudioRecord() {
        AudioRecordWrapper audioRecordWrapper = this.mAudioRecord;
        if (audioRecordWrapper != null) {
            try {
                audioRecordWrapper.release();
            } catch (Exception unused) {
            } finally {
                this.mAudioRecord = null;
            }
        }
    }
}
