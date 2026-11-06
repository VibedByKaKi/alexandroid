package com.amazon.whispercloak.jpake.ec;

import org.bouncycastle.crypto.agreement.jpake.JPAKEUtil;
import org.bouncycastle.math.ec.ECPoint;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ECJPAKERound2Payload {
    private final ECPoint mA;
    private final ECJPAKEZeroKnowledgeProof mKnowledgeProofForX2s;
    private final String mParticipantId;

    public ECJPAKERound2Payload(String str, ECPoint eCPoint, ECJPAKEZeroKnowledgeProof eCJPAKEZeroKnowledgeProof) {
        JPAKEUtil.validateNotNull(str, "participantId");
        JPAKEUtil.validateNotNull(eCPoint, "a");
        JPAKEUtil.validateNotNull(eCJPAKEZeroKnowledgeProof, "knowledgeProofForX2s");
        this.mParticipantId = str;
        this.mA = eCPoint;
        this.mKnowledgeProofForX2s = eCJPAKEZeroKnowledgeProof;
    }

    public ECPoint getA() {
        return this.mA;
    }

    public ECJPAKEZeroKnowledgeProof getKnowledgeProofForX2s() {
        return this.mKnowledgeProofForX2s;
    }

    public String getParticipantId() {
        return this.mParticipantId;
    }
}
