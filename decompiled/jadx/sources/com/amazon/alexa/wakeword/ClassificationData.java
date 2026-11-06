package com.amazon.alexa.wakeword;

import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ClassificationData {
    private final byte[] metadata;
    private final byte[] profileId;
    private final int score;

    public ClassificationData(byte[] bArr, int i, byte[] bArr2) {
        Preconditions.notNull(bArr, "profileId is null");
        Preconditions.notNull(bArr2, "metadata is null");
        this.profileId = bArr;
        this.score = i;
        this.metadata = bArr2;
    }

    public byte[] getMetadata() {
        return this.metadata;
    }

    public byte[] getProfileId() {
        return this.profileId;
    }

    public int getScore() {
        return this.score;
    }
}
