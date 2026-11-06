package com.amazon.alexa.accessory.repositories.accessproof;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.protocol.Accessproof;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class PublishedAccessProof {
    private final String correlationHandle;
    private final Accessproof.VerifyAccessProof proof;

    public PublishedAccessProof(String str, Accessproof.VerifyAccessProof verifyAccessProof) {
        Preconditions.notNull(str, "correlationHandle");
        Preconditions.notNull(verifyAccessProof, "proof");
        this.correlationHandle = str;
        this.proof = verifyAccessProof;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PublishedAccessProof.class == obj.getClass()) {
            PublishedAccessProof publishedAccessProof = (PublishedAccessProof) obj;
            if (this.correlationHandle.equals(publishedAccessProof.correlationHandle) && this.proof.equals(publishedAccessProof.proof)) {
                return true;
            }
        }
        return false;
    }

    public String getCorrelationHandle() {
        return this.correlationHandle;
    }

    public Accessproof.VerifyAccessProof getProof() {
        return this.proof;
    }

    public int hashCode() {
        return this.proof.hashCode() + (this.correlationHandle.hashCode() * 31);
    }

    public String toString() {
        return "PublishedAccessProof{redacted}";
    }
}
