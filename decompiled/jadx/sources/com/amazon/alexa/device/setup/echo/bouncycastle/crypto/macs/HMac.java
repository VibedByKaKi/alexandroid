package com.amazon.alexa.device.setup.echo.bouncycastle.crypto.macs;

import com.amazon.alexa.device.setup.echo.bouncycastle.crypto.CipherParameters;
import com.amazon.alexa.device.setup.echo.bouncycastle.crypto.Digest;
import com.amazon.alexa.device.setup.echo.bouncycastle.crypto.ExtendedDigest;
import com.amazon.alexa.device.setup.echo.bouncycastle.crypto.Mac;
import com.amazon.alexa.device.setup.echo.bouncycastle.crypto.params.KeyParameter;
import java.util.Hashtable;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class HMac implements Mac {
    private static final byte IPAD = 54;
    private static final byte OPAD = 92;
    private static final Hashtable blockLengths;
    private final int blockLength;
    private final Digest digest;
    private final int digestSize;
    private final byte[] inputPad;
    private byte[] outputPad;

    static {
        Hashtable hashtable = new Hashtable();
        blockLengths = hashtable;
        hashtable.put("GOST3411", new Integer(32));
        hashtable.put(MessageDigestAlgorithms.MD2, new Integer(16));
        hashtable.put("MD4", new Integer(64));
        hashtable.put(MessageDigestAlgorithms.MD5, new Integer(64));
        hashtable.put("RIPEMD128", new Integer(64));
        hashtable.put("RIPEMD160", new Integer(64));
        hashtable.put("SHA-1", new Integer(64));
        hashtable.put("SHA-224", new Integer(64));
        hashtable.put("SHA-256", new Integer(64));
        hashtable.put("SHA-384", new Integer(128));
        hashtable.put("SHA-512", new Integer(128));
        hashtable.put("Tiger", new Integer(64));
        hashtable.put("Whirlpool", new Integer(64));
    }

    private HMac(Digest digest, int i) {
        this.digest = digest;
        this.digestSize = digest.getDigestSize();
        this.blockLength = i;
        this.inputPad = new byte[i];
        this.outputPad = new byte[i];
    }

    private static int getByteLength(Digest digest) {
        if (digest instanceof ExtendedDigest) {
            return ((ExtendedDigest) digest).getByteLength();
        }
        Integer num = (Integer) blockLengths.get(digest.getAlgorithmName());
        if (num != null) {
            return num.intValue();
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3(digest.getAlgorithmName(), "unknown digest passed: ");
        return 0;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        int i2 = this.digestSize;
        byte[] bArr2 = new byte[i2];
        this.digest.doFinal(bArr2, 0);
        Digest digest = this.digest;
        byte[] bArr3 = this.outputPad;
        digest.update(bArr3, 0, bArr3.length);
        this.digest.update(bArr2, 0, i2);
        int doFinal = this.digest.doFinal(bArr, i);
        reset();
        return doFinal;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.digest.getAlgorithmName() + "/HMAC";
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.crypto.Mac
    public int getMacSize() {
        return this.digestSize;
    }

    public Digest getUnderlyingDigest() {
        return this.digest;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        this.digest.reset();
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length <= this.blockLength) {
            System.arraycopy(key, 0, this.inputPad, 0, key.length);
            int length = key.length;
            while (true) {
                byte[] bArr = this.inputPad;
                if (length >= bArr.length) {
                    break;
                }
                bArr[length] = 0;
                length++;
            }
        } else {
            this.digest.update(key, 0, key.length);
            this.digest.doFinal(this.inputPad, 0);
            int i = this.digestSize;
            while (true) {
                byte[] bArr2 = this.inputPad;
                if (i >= bArr2.length) {
                    break;
                }
                bArr2[i] = 0;
                i++;
            }
        }
        byte[] bArr3 = this.inputPad;
        byte[] bArr4 = new byte[bArr3.length];
        this.outputPad = bArr4;
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        int i2 = 0;
        while (true) {
            byte[] bArr5 = this.inputPad;
            if (i2 >= bArr5.length) {
                break;
            }
            bArr5[i2] = (byte) (bArr5[i2] ^ IPAD);
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr6 = this.outputPad;
            if (i3 >= bArr6.length) {
                Digest digest = this.digest;
                byte[] bArr7 = this.inputPad;
                digest.update(bArr7, 0, bArr7.length);
                return;
            }
            bArr6[i3] = (byte) (bArr6[i3] ^ 92);
            i3++;
        }
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.crypto.Mac
    public void reset() {
        this.digest.reset();
        Digest digest = this.digest;
        byte[] bArr = this.inputPad;
        digest.update(bArr, 0, bArr.length);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.crypto.Mac
    public void update(byte b) {
        this.digest.update(b);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    public HMac(Digest digest) {
        this(digest, getByteLength(digest));
    }
}
