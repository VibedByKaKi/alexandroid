package com.amazon.whispercloak.jpake.ec;

import defpackage.a$$ExternalSyntheticOutline0;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.agreement.jpake.JPAKEUtil;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ECJPAKEParticipant {
    private ECPoint mB;
    private State mGenerateState;
    private final ECJPAKEPrimeOrderGroup mGroup;
    private ECPoint mGx1;
    private ECPoint mGx2;
    private ECPoint mGx3;
    private ECPoint mGx4;
    private final Digest mMessageDigest;
    private final String mParticipantId;
    private String mPartnerParticipantId;
    private char[] mPassword;
    private final SecureRandom mRandom;
    private State mValidateState;
    private BigInteger mX1;
    private BigInteger mX2;
    private BigInteger mX2s;
    private final ECJPAKEZeroKnowledgeProofFactory mZeroKnowledgeProofFactory;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        INITIALIZED,
        ROUND_1_COMPLETE,
        ROUND_2_COMPLETE,
        KEY_CALCULATED,
        ROUND_3_COMPLETE
    }

    public ECJPAKEParticipant(String str, char[] cArr, ECJPAKEPrimeOrderGroup eCJPAKEPrimeOrderGroup, Digest digest, SecureRandom secureRandom) {
        JPAKEUtil.validateNotNull(str, "participantId");
        JPAKEUtil.validateNotNull(cArr, "password");
        JPAKEUtil.validateNotNull(eCJPAKEPrimeOrderGroup, "group");
        JPAKEUtil.validateNotNull(digest, "messageDigest");
        JPAKEUtil.validateNotNull(secureRandom, "random");
        if (cArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Password must not be empty.");
            throw null;
        }
        this.mParticipantId = str;
        this.mPassword = Arrays.copyOf(cArr, cArr.length);
        this.mGroup = eCJPAKEPrimeOrderGroup;
        this.mMessageDigest = digest;
        this.mRandom = secureRandom;
        this.mZeroKnowledgeProofFactory = new ECJPAKEZeroKnowledgeProofFactory(eCJPAKEPrimeOrderGroup, secureRandom, digest);
        State state = State.INITIALIZED;
        this.mGenerateState = state;
        this.mValidateState = state;
    }

    private BigInteger calculateDigest(BigInteger bigInteger) {
        byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(bigInteger);
        this.mMessageDigest.reset();
        this.mMessageDigest.update(asUnsignedByteArray, 0, asUnsignedByteArray.length);
        byte[] bArr = new byte[this.mMessageDigest.getDigestSize()];
        this.mMessageDigest.doFinal(bArr, 0);
        return BigIntegers.fromUnsignedByteArray(bArr);
    }

    private static void validateParticipantIdsDiffer(String str, String str2) throws CryptoException {
        if (str.equals(str2)) {
            throw new CryptoException(a$$ExternalSyntheticOutline0.m("Both participants are using the same ID (", str, ")."));
        }
    }

    private static void validateParticipantIdsMatch(String str, String str2) throws CryptoException {
        if (!str.equals(str2)) {
            throw new CryptoException(a$$ExternalSyntheticOutline0.m("Received payload from participant with ID (", str2, "); expected (", str, ")."));
        }
    }

    public BigInteger calculateKeyingMaterial() {
        State state = this.mGenerateState;
        State state2 = State.ROUND_2_COMPLETE;
        if (state != state2) {
            Single$$ExternalSyntheticBUOutline0.m(this.mParticipantId, "Must follow round 2 payload creation for ");
            return null;
        }
        if (this.mValidateState != state2) {
            Single$$ExternalSyntheticBUOutline0.m(this.mParticipantId, "Must follow round 2 payload validation for ");
            return null;
        }
        BigInteger calculateDigest = calculateDigest(this.mB.subtract(this.mGx4.multiply(this.mX2s)).multiply(this.mX2).normalize().getXCoord().toBigInteger());
        Arrays.fill(this.mPassword, (char) 0);
        this.mPassword = null;
        this.mX1 = null;
        this.mX2 = null;
        this.mX2s = null;
        this.mB = null;
        this.mGenerateState = State.KEY_CALCULATED;
        return calculateDigest;
    }

    public ECJPAKERound1Payload createRound1PayloadToSend() {
        if (this.mGenerateState != State.INITIALIZED) {
            Single$$ExternalSyntheticBUOutline0.m(this.mParticipantId, "Round 1 payload already created for ");
            return null;
        }
        BigInteger bigInteger = BigInteger.ONE;
        this.mX1 = BigIntegers.createRandomInRange(bigInteger, this.mGroup.getN().subtract(bigInteger), this.mRandom);
        this.mX2 = BigIntegers.createRandomInRange(bigInteger, this.mGroup.getN().subtract(bigInteger), this.mRandom);
        this.mGx1 = this.mGroup.getG().multiply(this.mX1);
        this.mGx2 = this.mGroup.getG().multiply(this.mX2);
        ECJPAKEZeroKnowledgeProof generate = this.mZeroKnowledgeProofFactory.generate(this.mParticipantId, this.mGroup.getG(), this.mX1, this.mGx1);
        ECJPAKEZeroKnowledgeProof generate2 = this.mZeroKnowledgeProofFactory.generate(this.mParticipantId, this.mGroup.getG(), this.mX2, this.mGx2);
        this.mGenerateState = State.ROUND_1_COMPLETE;
        return new ECJPAKERound1Payload(this.mParticipantId, this.mGx1, this.mGx2, generate, generate2);
    }

    public ECJPAKERound2Payload createRound2PayloadToSend() {
        State state = this.mGenerateState;
        State state2 = State.ROUND_1_COMPLETE;
        if (state != state2) {
            Single$$ExternalSyntheticBUOutline0.m(this.mParticipantId, "Must follow round 1 payload creation for ");
            return null;
        }
        State state3 = this.mValidateState;
        if (state3 != state2 && state3 != State.ROUND_2_COMPLETE) {
            Single$$ExternalSyntheticBUOutline0.m(this.mParticipantId, "Must follow round 1 or round 2 payload validation for ");
            return null;
        }
        this.mX2s = this.mX2.multiply(new BigInteger(Strings.toUTF8ByteArray(this.mPassword))).mod(this.mGroup.getN());
        ECPoint add = this.mGx1.add(this.mGx3).add(this.mGx4);
        ECPoint multiply = add.multiply(this.mX2s);
        ECJPAKEZeroKnowledgeProof generate = this.mZeroKnowledgeProofFactory.generate(this.mParticipantId, add, this.mX2s, multiply);
        this.mGenerateState = State.ROUND_2_COMPLETE;
        return new ECJPAKERound2Payload(this.mParticipantId, multiply, generate);
    }

    public ECJPAKERound3Payload createRound3PayloadToSend(BigInteger bigInteger) {
        if (this.mGenerateState != State.KEY_CALCULATED) {
            Single$$ExternalSyntheticBUOutline0.m(this.mParticipantId, "Must follow key material calculation for ");
            return null;
        }
        JPAKEUtil.validateNotNull(bigInteger, "keyingMaterial");
        BigInteger calculateMacTag = JPAKEUtil.calculateMacTag(this.mParticipantId, this.mPartnerParticipantId, new BigInteger(1, this.mGx1.getEncoded(false)), new BigInteger(1, this.mGx2.getEncoded(false)), new BigInteger(1, this.mGx3.getEncoded(false)), new BigInteger(1, this.mGx4.getEncoded(false)), bigInteger, this.mMessageDigest);
        State state = this.mValidateState;
        State state2 = State.ROUND_3_COMPLETE;
        if (state == state2) {
            this.mGx1 = null;
            this.mGx2 = null;
            this.mGx3 = null;
            this.mGx4 = null;
        }
        this.mGenerateState = state2;
        return new ECJPAKERound3Payload(this.mParticipantId, calculateMacTag);
    }

    public ECJPAKEPrimeOrderGroup getGroup() {
        return this.mGroup;
    }

    public void validateRound1PayloadReceived(ECJPAKERound1Payload eCJPAKERound1Payload) throws CryptoException {
        if (this.mValidateState != State.INITIALIZED) {
            Single$$ExternalSyntheticBUOutline0.m(this.mParticipantId, "Validation already attempted for round 1 payload for ");
            return;
        }
        JPAKEUtil.validateNotNull(eCJPAKERound1Payload, "round1PayloadReceived");
        validateParticipantIdsDiffer(this.mParticipantId, eCJPAKERound1Payload.getParticipantId());
        this.mPartnerParticipantId = eCJPAKERound1Payload.getParticipantId();
        this.mGx3 = eCJPAKERound1Payload.getGx1();
        this.mGx4 = eCJPAKERound1Payload.getGx2();
        this.mZeroKnowledgeProofFactory.validate(this.mPartnerParticipantId, this.mGroup.getG(), eCJPAKERound1Payload.getGx1(), eCJPAKERound1Payload.getKnowledgeProofForX1());
        this.mZeroKnowledgeProofFactory.validate(this.mPartnerParticipantId, this.mGroup.getG(), eCJPAKERound1Payload.getGx2(), eCJPAKERound1Payload.getKnowledgeProofForX2());
        this.mValidateState = State.ROUND_1_COMPLETE;
    }

    public void validateRound2PayloadReceived(ECJPAKERound2Payload eCJPAKERound2Payload) throws CryptoException {
        State state = this.mGenerateState;
        State state2 = State.ROUND_1_COMPLETE;
        if (state != state2 && state != State.ROUND_2_COMPLETE) {
            Single$$ExternalSyntheticBUOutline0.m(this.mParticipantId, "Must follow round 1 or round 2 payload creation for ");
            return;
        }
        if (this.mValidateState != state2) {
            Single$$ExternalSyntheticBUOutline0.m(this.mParticipantId, "Must follow round 1 payload validation for ");
            return;
        }
        JPAKEUtil.validateNotNull(eCJPAKERound2Payload, "round2PayloadReceived");
        validateParticipantIdsDiffer(this.mParticipantId, eCJPAKERound2Payload.getParticipantId());
        validateParticipantIdsMatch(this.mPartnerParticipantId, eCJPAKERound2Payload.getParticipantId());
        this.mZeroKnowledgeProofFactory.validate(this.mPartnerParticipantId, this.mGx1.add(this.mGx2).add(this.mGx3), eCJPAKERound2Payload.getA(), eCJPAKERound2Payload.getKnowledgeProofForX2s());
        this.mB = eCJPAKERound2Payload.getA();
        this.mValidateState = State.ROUND_2_COMPLETE;
    }

    public void validateRound3PayloadReceived(ECJPAKERound3Payload eCJPAKERound3Payload, BigInteger bigInteger) throws CryptoException {
        State state = this.mGenerateState;
        if (state != State.KEY_CALCULATED && state != State.ROUND_3_COMPLETE) {
            Single$$ExternalSyntheticBUOutline0.m(this.mParticipantId, "Must follow key material calculation for ");
            return;
        }
        if (this.mValidateState != State.ROUND_2_COMPLETE) {
            Single$$ExternalSyntheticBUOutline0.m(this.mParticipantId, "Must follow round 2 payload validation for ");
            return;
        }
        JPAKEUtil.validateNotNull(eCJPAKERound3Payload, "round3PayloadReceived");
        JPAKEUtil.validateNotNull(bigInteger, "keyingMaterial");
        validateParticipantIdsDiffer(this.mParticipantId, eCJPAKERound3Payload.getParticipantId());
        validateParticipantIdsMatch(this.mPartnerParticipantId, eCJPAKERound3Payload.getParticipantId());
        JPAKEUtil.validateMacTag(this.mParticipantId, this.mPartnerParticipantId, new BigInteger(1, this.mGx1.getEncoded(false)), new BigInteger(1, this.mGx2.getEncoded(false)), new BigInteger(1, this.mGx3.getEncoded(false)), new BigInteger(1, this.mGx4.getEncoded(false)), bigInteger, this.mMessageDigest, eCJPAKERound3Payload.getMacTag());
        State state2 = this.mGenerateState;
        State state3 = State.ROUND_3_COMPLETE;
        if (state2 == state3) {
            this.mGx1 = null;
            this.mGx2 = null;
            this.mGx3 = null;
            this.mGx4 = null;
        }
        this.mValidateState = state3;
    }

    public ECJPAKEParticipant(String str, char[] cArr, ECJPAKEPrimeOrderGroup eCJPAKEPrimeOrderGroup) {
        this(str, cArr, eCJPAKEPrimeOrderGroup, new SHA256Digest(), new SecureRandom());
    }
}
