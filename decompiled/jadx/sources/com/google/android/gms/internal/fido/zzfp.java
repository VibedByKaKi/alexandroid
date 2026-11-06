package com.google.android.gms.internal.fido;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
abstract class zzfp extends zzfr {
    private final ByteBuffer zza = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // com.google.android.gms.internal.fido.zzfr, com.google.android.gms.internal.fido.zzfv
    public final zzfv zza(byte[] bArr) {
        bArr.getClass();
        zzb(bArr, 0, bArr.length);
        return this;
    }

    public void zzb(byte[] bArr, int i, int i2) {
        throw null;
    }
}
