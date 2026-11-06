package com.amazon.alexa.handsfree.audio.speakerverification;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class WakeWordData {
    private final long mBeginSampleIndex;
    private final long mEndSampleIndex;
    private final byte[] mMetadata;
    private final String mWakeWord;

    public WakeWordData(@NonNull String str, long j, long j2, @NonNull byte[] bArr) {
        this.mWakeWord = str;
        this.mBeginSampleIndex = j;
        this.mEndSampleIndex = j2;
        this.mMetadata = (byte[]) bArr.clone();
    }

    public long getBeginSampleIndex() {
        return this.mBeginSampleIndex;
    }

    public long getEndSampleIndex() {
        return this.mEndSampleIndex;
    }

    @NonNull
    public byte[] getMetadata() {
        return (byte[]) this.mMetadata.clone();
    }

    @NonNull
    public String getWakeWord() {
        return this.mWakeWord;
    }
}
