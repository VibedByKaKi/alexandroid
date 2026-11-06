package com.amazon.alexa.handsfree.audio.speakerverification;

import androidx.annotation.NonNull;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SpeakerVerificationClassificationData {
    private final byte[] mMetadata;
    private final byte[] mProfileId;
    private final float mRawScore;
    private final float mSVAcceptThresholdLowerBound;
    private final float mSVAcceptThresholdUpperBound;
    private final int mScore;
    private final int mWakeWordConfidence;

    public SpeakerVerificationClassificationData(int i, @NonNull byte[] bArr, @NonNull byte[] bArr2, float f, float f2, float f3, int i2) {
        this.mScore = i;
        this.mProfileId = (byte[]) bArr.clone();
        this.mMetadata = (byte[]) bArr2.clone();
        this.mRawScore = f;
        this.mSVAcceptThresholdUpperBound = f3;
        this.mSVAcceptThresholdLowerBound = f2;
        this.mWakeWordConfidence = i2;
    }

    @NonNull
    public byte[] getMetadata() {
        return (byte[]) this.mMetadata.clone();
    }

    @NonNull
    public byte[] getProfileId() {
        return (byte[]) this.mProfileId.clone();
    }

    public float getRawScore() {
        return this.mRawScore;
    }

    public float getSVAcceptThresholdLowerBound() {
        return this.mSVAcceptThresholdLowerBound;
    }

    public float getSVAcceptThresholdUpperBound() {
        return this.mSVAcceptThresholdUpperBound;
    }

    public int getScore() {
        return this.mScore;
    }

    public int getWakeWordConfidence() {
        return this.mWakeWordConfidence;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Locale locale = Locale.US;
        sb.append("Score = " + this.mScore);
        sb.append("\n");
        sb.append(String.format(locale, "Raw score = %f", Float.valueOf(this.mRawScore)));
        sb.append("\n");
        sb.append(String.format(locale, "Accept threshold lower bound = %f", Float.valueOf(this.mSVAcceptThresholdLowerBound)));
        sb.append("\n");
        sb.append(String.format(locale, "Accept threshold upper bound = %f", Float.valueOf(this.mSVAcceptThresholdUpperBound)));
        return sb.toString();
    }
}
