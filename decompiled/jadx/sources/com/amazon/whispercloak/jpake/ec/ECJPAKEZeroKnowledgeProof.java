package com.amazon.whispercloak.jpake.ec;

import java.math.BigInteger;
import org.bouncycastle.crypto.agreement.jpake.JPAKEUtil;
import org.bouncycastle.math.ec.ECPoint;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ECJPAKEZeroKnowledgeProof {
    private final ECPoint mGv;
    private final BigInteger mR;

    public ECJPAKEZeroKnowledgeProof(ECPoint eCPoint, BigInteger bigInteger) {
        JPAKEUtil.validateNotNull(eCPoint, "Gv");
        JPAKEUtil.validateNotNull(bigInteger, "r");
        this.mGv = eCPoint;
        this.mR = bigInteger;
    }

    public ECPoint getGv() {
        return this.mGv;
    }

    public BigInteger getR() {
        return this.mR;
    }
}
