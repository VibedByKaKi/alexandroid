package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzga extends zzfq implements Serializable {
    private final MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final String zzd;

    public zzga(String str, String str2) {
        MessageDigest zzb = zzb("SHA-256");
        this.zza = zzb;
        this.zzb = zzb.getDigestLength();
        this.zzd = "Hashing.sha256()";
        this.zzc = zzc(zzb);
    }

    private static MessageDigest zzb(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Object) e);
            return null;
        }
    }

    private static boolean zzc(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.fido.zzfu
    public final zzfv zza() {
        zzfy zzfyVar = null;
        if (this.zzc) {
            try {
                return new zzfz((MessageDigest) this.zza.clone(), this.zzb, zzfyVar);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new zzfz(zzb(this.zza.getAlgorithm()), this.zzb, zzfyVar);
    }
}
