package com.amazon.devicesetup.utility;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import java.util.Arrays;
import org.apache.commons.lang.ArrayUtils;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class SecureMessage {
    private final byte[] mAad;
    private final byte[] mCipherText;
    private final byte[] mIV;
    private final byte[] mMAC;

    public SecureMessage(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        verifyParams(bArr, bArr2, bArr3, bArr4);
        this.mIV = bArr;
        this.mCipherText = bArr2;
        this.mMAC = bArr3;
        this.mAad = bArr4;
    }

    private void verifyParams(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("IV can't be null");
        } else if (bArr2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("cipherText can'tbe null");
        } else {
            if (bArr3 != null) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Mac Can't be null");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecureMessage secureMessage = (SecureMessage) obj;
        if (Arrays.equals(this.mIV, secureMessage.mIV) && Arrays.equals(this.mCipherText, secureMessage.mCipherText) && Arrays.equals(this.mMAC, secureMessage.mMAC)) {
            return Arrays.equals(this.mAad, secureMessage.mAad);
        }
        return false;
    }

    public byte[] getAad() {
        byte[] bArr = this.mAad;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public byte[] getCipherText() {
        byte[] bArr = this.mCipherText;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public byte[] getIv() {
        byte[] bArr = this.mIV;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public byte[] getMac() {
        byte[] bArr = this.mMAC;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public int hashCode() {
        return Arrays.hashCode(this.mAad) + ParcelCompat$$ExternalSyntheticOutline0.m(this.mMAC, ParcelCompat$$ExternalSyntheticOutline0.m(this.mCipherText, Arrays.hashCode(this.mIV) * 31, 31), 31);
    }

    public boolean isEmpty() {
        return ArrayUtils.isEmpty(this.mIV) && ArrayUtils.isEmpty(this.mCipherText) && ArrayUtils.isEmpty(this.mMAC) && ArrayUtils.isEmpty(this.mAad);
    }
}
