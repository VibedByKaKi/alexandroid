package com.amazon.alexa.presence.bleconn.identity;

import com.amazon.alexa.presence.bleconn.identity.model.Key;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MatchingRelationshipData {
    private final Key matchingKey;
    private final byte[] validationData;

    public MatchingRelationshipData(Key key, byte[] bArr) {
        this.matchingKey = key;
        this.validationData = bArr;
    }

    public Key getMatchingKey() {
        return this.matchingKey;
    }

    public byte[] getValidationData() {
        return this.validationData;
    }
}
