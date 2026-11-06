package com.google.android.gms.internal.fido;

import androidx.collection.SieveCacheKt;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzhs implements Closeable {
    private final InputStream zza;
    private zzhr zzb;
    private final byte[] zzc = new byte[8];
    private final zzht zzd = zzht.zza();

    public zzhs(InputStream inputStream) {
        this.zza = inputStream;
    }

    private final long zzh() throws IOException {
        byte zza = this.zzb.zza();
        zzhr zzhrVar = this.zzb;
        if (zza < 24) {
            long zza2 = zzhrVar.zza();
            this.zzb = null;
            return zza2;
        }
        if (zzhrVar.zza() == 24) {
            int read = this.zza.read();
            if (read != -1) {
                this.zzb = null;
                return read & 255;
            }
            Buffer$$ExternalSyntheticBUOutline0.m$3();
            return 0L;
        }
        if (this.zzb.zza() == 25) {
            zzk(this.zzc, 2);
            byte[] bArr = this.zzc;
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
        if (this.zzb.zza() == 26) {
            zzk(this.zzc, 4);
            byte[] bArr2 = this.zzc;
            return ((bArr2[0] & 255) << 24) | ((bArr2[1] & 255) << 16) | ((bArr2[2] & 255) << 8) | (bArr2[3] & 255);
        }
        if (this.zzb.zza() != 27) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("invalid additional information ", this.zzb.zza(), " for major type ", this.zzb.zzc()));
            return 0L;
        }
        zzk(this.zzc, 8);
        byte[] bArr3 = this.zzc;
        return ((bArr3[0] & 255) << 56) | ((bArr3[1] & 255) << 48) | ((bArr3[2] & 255) << 40) | ((bArr3[3] & 255) << 32) | ((bArr3[4] & 255) << 24) | ((bArr3[5] & 255) << 16) | ((bArr3[6] & 255) << 8) | (bArr3[7] & 255);
    }

    private final void zzi() throws IOException {
        zzd();
        if (this.zzb.zza() != 31) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(this.zzb.zza(), "expected definite length but found "));
    }

    private final void zzj(byte b) throws IOException {
        zzd();
        if (this.zzb.zzb() == b) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("expected major type ", (b >> 5) & 7, " but found ", this.zzb.zzc()));
    }

    private final void zzk(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 != i) {
            int read = this.zza.read(bArr, i2, i - i2);
            if (read == -1) {
                Buffer$$ExternalSyntheticBUOutline0.m$3();
                return;
            }
            i2 += read;
        }
        this.zzb = null;
    }

    private final byte[] zzl() throws IOException {
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > SieveCacheKt.NodeLinkMask) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.zza.available() < zzh) {
            Buffer$$ExternalSyntheticBUOutline0.m$3();
            return null;
        }
        int i = (int) zzh;
        byte[] bArr = new byte[i];
        zzk(bArr, i);
        return bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
        this.zzd.zzb();
    }

    public final long zza() throws IOException {
        zzj(Byte.MIN_VALUE);
        zzi();
        long zzh = zzh();
        if (zzh < 0) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (zzh > 0) {
            this.zzd.zzg(zzh);
        }
        return zzh;
    }

    public final long zzb() throws IOException {
        boolean z;
        zzd();
        if (this.zzb.zzb() == 0) {
            z = true;
        } else {
            if (this.zzb.zzb() != 32) {
                Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(this.zzb.zzc(), "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long zzh = zzh();
        if (zzh >= 0) {
            return z ? zzh : ~zzh;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    public final long zzc() throws IOException {
        zzj((byte) -96);
        zzi();
        long zzh = zzh();
        if (zzh < 0 || zzh > 4611686018427387903L) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (zzh > 0) {
            this.zzd.zzg(zzh + zzh);
        }
        return zzh;
    }

    public final zzhr zzd() throws IOException {
        if (this.zzb == null) {
            int read = this.zza.read();
            if (read == -1) {
                this.zzd.zzb();
                return null;
            }
            zzhr zzhrVar = new zzhr(read);
            this.zzb = zzhrVar;
            byte zzb = zzhrVar.zzb();
            if (zzb != Byte.MIN_VALUE && zzb != -96 && zzb != -64) {
                if (zzb != -32) {
                    if (zzb != 0 && zzb != 32) {
                        if (zzb == 64) {
                            this.zzd.zze(-1L);
                        } else {
                            if (zzb != 96) {
                                Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(this.zzb.zzc(), "invalid major type: "));
                                return null;
                            }
                            this.zzd.zze(-2L);
                        }
                        this.zzd.zzf();
                    }
                } else if (this.zzb.zza() == 31) {
                    this.zzd.zzc();
                }
            }
            this.zzd.zzd();
            this.zzd.zzf();
        }
        return this.zzb;
    }

    public final String zze() throws IOException {
        zzj((byte) 96);
        return new String(zzl(), StandardCharsets.UTF_8);
    }

    public final boolean zzf() throws IOException {
        zzj((byte) -32);
        if (this.zzb.zza() > 24) {
            Single$$ExternalSyntheticBUOutline0.m$2("expected simple value");
            return false;
        }
        int zzh = (int) zzh();
        if (zzh == 20) {
            return false;
        }
        if (zzh == 21) {
            return true;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("expected FALSE or TRUE");
        return false;
    }

    public final byte[] zzg() throws IOException {
        zzj((byte) 64);
        return zzl();
    }
}
