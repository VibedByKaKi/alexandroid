package com.amazon.alexa.device.setup.echo.bouncycastle.cms;

import com.amazon.alexa.capabilityagent.cardstudiosurface.common.SurfaceWire;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEParameterSpec;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class CMSPBEKey implements PBEKey {
    private final int iterationCount;
    private final char[] password;
    private final byte[] salt;

    public CMSPBEKey(char[] cArr, PBEParameterSpec pBEParameterSpec) {
        this(cArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
    }

    public static PBEParameterSpec getParamSpec(AlgorithmParameters algorithmParameters) throws InvalidAlgorithmParameterException {
        try {
            return (PBEParameterSpec) algorithmParameters.getParameterSpec(PBEParameterSpec.class);
        } catch (InvalidParameterSpecException e) {
            throw new InvalidAlgorithmParameterException("cannot process PBE spec: " + e.getMessage());
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "PKCS5S2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    public abstract byte[] getEncoded(String str);

    @Override // java.security.Key
    public String getFormat() {
        return SurfaceWire.RENDER_TYPE_RAW;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        return this.iterationCount;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        return this.password;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        return this.salt;
    }

    public CMSPBEKey(char[] cArr, byte[] bArr, int i) {
        this.password = cArr;
        this.salt = bArr;
        this.iterationCount = i;
    }
}
