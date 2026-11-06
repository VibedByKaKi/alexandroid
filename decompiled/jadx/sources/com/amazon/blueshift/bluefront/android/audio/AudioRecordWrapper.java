package com.amazon.blueshift.bluefront.android.audio;

import android.media.AudioRecord;
import com.google.common.annotations.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AudioRecordWrapper extends AudioRecord {
    private boolean mSendingToAVS;

    public AudioRecordWrapper(int i, int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        super(i, i2, i3, i4, i5);
        this.mSendingToAVS = false;
    }

    public synchronized boolean isSendingToAVS() {
        return this.mSendingToAVS;
    }

    @Override // android.media.AudioRecord
    public void startRecording() {
        if (getRecordingState() != 3) {
            superStartRecording();
        }
    }

    public synchronized void startRecordingForAVS() {
        try {
            this.mSendingToAVS = true;
            superStopRecording();
        } catch (IllegalStateException unused) {
        }
        startRecording();
    }

    public synchronized void startRecordingForWakeword() {
        try {
            if (!this.mSendingToAVS) {
                superStopRecording();
            }
        } catch (IllegalStateException unused) {
        }
        startRecording();
    }

    @Override // android.media.AudioRecord
    public void stop() {
        if (getRecordingState() == 3) {
            superStopRecording();
        }
    }

    public synchronized void stopRecordingForAVS() {
        this.mSendingToAVS = false;
        stop();
    }

    public synchronized void stopRecordingForWakeword() {
        if (!this.mSendingToAVS) {
            stop();
        }
    }

    @VisibleForTesting
    public void superStartRecording() {
        super.startRecording();
    }

    @VisibleForTesting
    public void superStopRecording() {
        super.stop();
    }
}
