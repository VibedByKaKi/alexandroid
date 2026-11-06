package com.google.android.gms.internal.fido;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzfz extends zzfp {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzfz(MessageDigest messageDigest, int i, zzfy zzfyVar) {
        this.zza = messageDigest;
        this.zzb = i;
    }

    private final void zzd() {
        zzbm.zzf(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.gms.internal.fido.zzfp
    public final void zzb(byte[] bArr, int i, int i2) {
        zzd();
        this.zza.update(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.fido.zzfv
    public final zzft zzc() {
        zzd();
        this.zzc = true;
        int i = this.zzb;
        int digestLength = this.zza.getDigestLength();
        MessageDigest messageDigest = this.zza;
        if (i == digestLength) {
            byte[] digest = messageDigest.digest();
            int i2 = zzft.zzb;
            return new zzfs(digest);
        }
        byte[] copyOf = Arrays.copyOf(messageDigest.digest(), i);
        int i3 = zzft.zzb;
        return new zzfs(copyOf);
    }
}
