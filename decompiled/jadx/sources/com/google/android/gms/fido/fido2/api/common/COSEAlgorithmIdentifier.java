package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class COSEAlgorithmIdentifier implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new zzp();

    @NonNull
    private final Algorithm zza;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UnsupportedAlgorithmIdentifierException extends Exception {
        public UnsupportedAlgorithmIdentifierException(int i) {
            super(a$$ExternalSyntheticOutline0.m(i, "Algorithm with COSE value ", " not supported"));
        }
    }

    public COSEAlgorithmIdentifier(@NonNull Algorithm algorithm) {
        this.zza = (Algorithm) Preconditions.checkNotNull(algorithm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static COSEAlgorithmIdentifier fromCoseValue(int i) throws UnsupportedAlgorithmIdentifierException {
        RSAAlgorithm rSAAlgorithm;
        if (i == RSAAlgorithm.LEGACY_RS1.getAlgoValue()) {
            rSAAlgorithm = RSAAlgorithm.RS1;
        } else {
            RSAAlgorithm[] values = RSAAlgorithm.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (RSAAlgorithm rSAAlgorithm2 : EC2Algorithm.values()) {
                        if (rSAAlgorithm2.getAlgoValue() == i) {
                            rSAAlgorithm = rSAAlgorithm2;
                        }
                    }
                    throw new UnsupportedAlgorithmIdentifierException(i);
                }
                RSAAlgorithm rSAAlgorithm3 = values[i2];
                if (rSAAlgorithm3.getAlgoValue() == i) {
                    rSAAlgorithm = rSAAlgorithm3;
                    break;
                }
                i2++;
            }
        }
        return new COSEAlgorithmIdentifier(rSAAlgorithm);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.zza.getAlgoValue() == ((COSEAlgorithmIdentifier) obj).zza.getAlgoValue();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public int toCoseValue() {
        return this.zza.getAlgoValue();
    }

    @NonNull
    public final String toString() {
        return a$$ExternalSyntheticOutline0.m("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.zza), StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.zza.getAlgoValue());
    }
}
