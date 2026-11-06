package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class ECDomainParameters implements ECConstants {
    private final ECPoint G;
    private final ECCurve curve;
    private final BigInteger h;
    private BigInteger hInv;
    private final BigInteger n;
    private final byte[] seed;

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.hInv = null;
        if (eCCurve == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("curve");
            throw null;
        }
        if (bigInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("n");
            throw null;
        }
        this.curve = eCCurve;
        this.G = validatePublicPoint(eCCurve, eCPoint);
        this.n = bigInteger;
        this.h = bigInteger2;
        this.seed = Arrays.clone(bArr);
    }

    public static ECPoint validatePublicPoint(ECCurve eCCurve, ECPoint eCPoint) {
        String str;
        if (eCPoint == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Point cannot be null");
            return null;
        }
        ECPoint normalize = ECAlgorithms.importPoint(eCCurve, eCPoint).normalize();
        if (normalize.isInfinity()) {
            str = "Point at infinity";
        } else {
            if (normalize.isValid()) {
                return normalize;
            }
            str = "Point not on curve";
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECDomainParameters)) {
            return false;
        }
        ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
        return this.curve.equals(eCDomainParameters.curve) && this.G.equals(eCDomainParameters.G) && this.n.equals(eCDomainParameters.n);
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.G;
    }

    public BigInteger getH() {
        return this.h;
    }

    public synchronized BigInteger getHInv() {
        try {
            if (this.hInv == null) {
                this.hInv = BigIntegers.modOddInverseVar(this.n, this.h);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.hInv;
    }

    public BigInteger getN() {
        return this.n;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public int hashCode() {
        return this.n.hashCode() ^ ((((this.curve.hashCode() ^ 1028) * 257) ^ this.G.hashCode()) * 257);
    }

    public BigInteger validatePrivateScalar(BigInteger bigInteger) {
        if (bigInteger == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Scalar cannot be null");
            return null;
        }
        if (bigInteger.compareTo(ECConstants.ONE) >= 0 && bigInteger.compareTo(getN()) < 0) {
            return bigInteger;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Scalar is not in the interval [1, n - 1]");
        return null;
    }

    public ECPoint validatePublicPoint(ECPoint eCPoint) {
        return validatePublicPoint(getCurve(), eCPoint);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ECConstants.ONE, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(X9ECParameters x9ECParameters) {
        this(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }
}
