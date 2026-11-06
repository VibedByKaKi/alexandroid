package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.NonNull;
import java.io.OutputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzfb extends OutputStream {
    private long zza = 0;

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            Buffer$$ExternalSyntheticBUOutline0.m();
        } else {
            this.zza += i2;
        }
    }

    public final long zza() {
        return this.zza;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.zza++;
    }
}
