package com.amazon.alexa.wakeword.speakerverification.enrollment;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class EnrollmentUtterance implements Serializable {
    private final short[] mAudio;
    private final int mEndIndex;
    private final byte[] mMetadata;
    private final int mStartIndex;
    private final String mWakeWord;

    public EnrollmentUtterance(@NonNull String str, int i, int i2, @NonNull short[] sArr, @NonNull byte[] bArr) {
        this.mWakeWord = str;
        this.mAudio = sArr;
        this.mMetadata = bArr;
        this.mStartIndex = i;
        this.mEndIndex = i2;
    }

    public short[] getAudio() {
        return this.mAudio;
    }

    public int getEndIndex() {
        return this.mEndIndex;
    }

    public byte[] getMetadata() {
        return this.mMetadata;
    }

    public int getStartIndex() {
        return this.mStartIndex;
    }

    public String getWakeWord() {
        return this.mWakeWord;
    }
}
