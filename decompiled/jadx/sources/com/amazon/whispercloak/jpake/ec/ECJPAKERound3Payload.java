package com.amazon.whispercloak.jpake.ec;

import java.math.BigInteger;
import org.bouncycastle.crypto.agreement.jpake.JPAKEUtil;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ECJPAKERound3Payload {
    private final BigInteger mMacTag;
    private final String mParticipantId;

    public ECJPAKERound3Payload(String str, BigInteger bigInteger) {
        JPAKEUtil.validateNotNull(str, "participantId");
        JPAKEUtil.validateNotNull(bigInteger, "macTag");
        this.mParticipantId = str;
        this.mMacTag = bigInteger;
    }

    public BigInteger getMacTag() {
        return this.mMacTag;
    }

    public String getParticipantId() {
        return this.mParticipantId;
    }
}
