package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;

/* loaded from: classes11.dex */
public interface GLVEndomorphism extends ECEndomorphism {
    BigInteger[] decomposeScalar(BigInteger bigInteger);
}
